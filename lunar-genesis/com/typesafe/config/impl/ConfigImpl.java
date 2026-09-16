package com.typesafe.config.impl;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigIncluder;
import com.typesafe.config.ConfigMemorySize;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigParseable;
import com.typesafe.config.ConfigValue;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

public class ConfigImpl {
   private static final String ENV_VAR_OVERRIDE_PREFIX = "CONFIG_FORCE_";
   private static final ConfigOrigin defaultValueOrigin = SimpleConfigOrigin.newSimple("hardcoded value");
   private static final ConfigBoolean defaultTrueValue = new ConfigBoolean(defaultValueOrigin, true);
   private static final ConfigBoolean defaultFalseValue = new ConfigBoolean(defaultValueOrigin, false);
   private static final ConfigNull defaultNullValue = new ConfigNull(defaultValueOrigin);
   private static final SimpleConfigList defaultEmptyList = new SimpleConfigList(defaultValueOrigin, Collections.emptyList());
   private static final SimpleConfigObject defaultEmptyObject = SimpleConfigObject.empty(defaultValueOrigin);

   public static Config computeCachedConfig(ClassLoader var0, String var1, Callable<Config> var2) {
      ConfigImpl.LoaderCache var3;
      try {
         var3 = ConfigImpl.LoaderCacheHolder.cache;
      } catch (ExceptionInInitializerError var5) {
         throw ConfigImplUtil.extractInitializerError(var5);
      }

      return var3.getOrElseUpdate(var0, var1, var2);
   }

   public static ConfigObject parseResourcesAnySyntax(Class<?> var0, String var1, ConfigParseOptions var2) {
      ConfigImpl.ClasspathNameSourceWithClass var3 = new ConfigImpl.ClasspathNameSourceWithClass(var0);
      return SimpleIncluder.fromBasename(var3, var1, var2);
   }

   public static ConfigObject parseResourcesAnySyntax(String var0, ConfigParseOptions var1) {
      ConfigImpl.ClasspathNameSource var2 = new ConfigImpl.ClasspathNameSource();
      return SimpleIncluder.fromBasename(var2, var0, var1);
   }

   public static ConfigObject parseFileAnySyntax(File var0, ConfigParseOptions var1) {
      ConfigImpl.FileNameSource var2 = new ConfigImpl.FileNameSource();
      return SimpleIncluder.fromBasename(var2, var0.getPath(), var1);
   }

   static AbstractConfigObject emptyObject(String var0) {
      SimpleConfigOrigin var1 = var0 != null ? SimpleConfigOrigin.newSimple(var0) : null;
      return emptyObject(var1);
   }

   public static Config emptyConfig(String var0) {
      return emptyObject(var0).toConfig();
   }

   static AbstractConfigObject empty(ConfigOrigin var0) {
      return emptyObject(var0);
   }

   private static SimpleConfigList emptyList(ConfigOrigin var0) {
      return var0 != null && var0 != defaultValueOrigin ? new SimpleConfigList(var0, Collections.emptyList()) : defaultEmptyList;
   }

   private static AbstractConfigObject emptyObject(ConfigOrigin var0) {
      return var0 == defaultValueOrigin ? defaultEmptyObject : SimpleConfigObject.empty(var0);
   }

   private static ConfigOrigin valueOrigin(String var0) {
      return var0 == null ? defaultValueOrigin : SimpleConfigOrigin.newSimple(var0);
   }

   public static ConfigValue fromAnyRef(Object var0, String var1) {
      ConfigOrigin var2 = valueOrigin(var1);
      return fromAnyRef(var0, var2, FromMapMode.KEYS_ARE_KEYS);
   }

   public static ConfigObject fromPathMap(Map<String, ? extends Object> var0, String var1) {
      ConfigOrigin var2 = valueOrigin(var1);
      return (ConfigObject)fromAnyRef(var0, var2, FromMapMode.KEYS_ARE_PATHS);
   }

   static AbstractConfigValue fromAnyRef(Object var0, ConfigOrigin var1, FromMapMode var2) {
      if (var1 == null) {
         throw new ConfigException.BugOrBroken("origin not supposed to be null");
      }

      if (var0 == null) {
         return var1 != defaultValueOrigin ? new ConfigNull(var1) : defaultNullValue;
      }

      if (var0 instanceof AbstractConfigValue) {
         return (AbstractConfigValue)var0;
      }

      if (var0 instanceof Boolean) {
         if (var1 != defaultValueOrigin) {
            return new ConfigBoolean(var1, (Boolean)var0);
         } else {
            return (Boolean)var0 ? defaultTrueValue : defaultFalseValue;
         }
      } else {
         if (var0 instanceof String) {
            return new ConfigString.Quoted(var1, (String)var0);
         }

         if (var0 instanceof Number) {
            if (var0 instanceof Double) {
               return new ConfigDouble(var1, (Double)var0, null);
            } else if (var0 instanceof Integer) {
               return new ConfigInt(var1, (Integer)var0, null);
            } else {
               return var0 instanceof Long ? new ConfigLong(var1, (Long)var0, null) : ConfigNumber.newNumber(var1, ((Number)var0).doubleValue(), null);
            }
         } else {
            if (var0 instanceof Duration) {
               return new ConfigLong(var1, ((Duration)var0).toMillis(), null);
            }

            if (var0 instanceof Map) {
               if (((Map)var0).isEmpty()) {
                  return emptyObject(var1);
               }

               if (var2 == FromMapMode.KEYS_ARE_KEYS) {
                  HashMap var8 = new HashMap();

                  for (Entry var10 : ((Map)var0).entrySet()) {
                     Object var6 = var10.getKey();
                     if (!(var6 instanceof String)) {
                        throw new ConfigException.BugOrBroken("bug in method caller: not valid to create ConfigObject from map with non-String key: " + var6);
                     }

                     AbstractConfigValue var7 = fromAnyRef(var10.getValue(), var1, var2);
                     var8.put((String)var6, var7);
                  }

                  return new SimpleConfigObject(var1, var8);
               } else {
                  return PropertiesParser.fromPathMap(var1, (Map<?, ?>)var0);
               }
            } else if (!(var0 instanceof Iterable)) {
               if (var0 instanceof ConfigMemorySize) {
                  return new ConfigLong(var1, ((ConfigMemorySize)var0).toBytes(), null);
               } else {
                  throw new ConfigException.BugOrBroken("bug in method caller: not valid to create ConfigValue from: " + var0);
               }
            } else {
               Iterator var3 = ((Iterable)var0).iterator();
               if (!var3.hasNext()) {
                  return emptyList(var1);
               }

               ArrayList var4 = new ArrayList();

               while (var3.hasNext()) {
                  AbstractConfigValue var5 = fromAnyRef(var3.next(), var1, var2);
                  var4.add(var5);
               }

               return new SimpleConfigList(var1, var4);
            }
         }
      }
   }

   static ConfigIncluder defaultIncluder() {
      try {
         return ConfigImpl.DefaultIncluderHolder.defaultIncluder;
      } catch (ExceptionInInitializerError var1) {
         throw ConfigImplUtil.extractInitializerError(var1);
      }
   }

   private static Properties getSystemProperties() {
      Properties var0 = System.getProperties();
      Properties var1 = new Properties();
      synchronized (var0) {
         for (Entry var4 : var0.entrySet()) {
            if (!var4.getKey().toString().startsWith("java.version.")) {
               var1.put(var4.getKey(), var4.getValue());
            }
         }

         return var1;
      }
   }

   private static AbstractConfigObject loadSystemProperties() {
      return (AbstractConfigObject)Parseable.newProperties(getSystemProperties(), ConfigParseOptions.defaults().setOriginDescription("system properties"))
         .parse();
   }

   static AbstractConfigObject systemPropertiesAsConfigObject() {
      try {
         return ConfigImpl.SystemPropertiesHolder.systemProperties;
      } catch (ExceptionInInitializerError var1) {
         throw ConfigImplUtil.extractInitializerError(var1);
      }
   }

   public static Config systemPropertiesAsConfig() {
      return systemPropertiesAsConfigObject().toConfig();
   }

   public static void reloadSystemPropertiesConfig() {
      ConfigImpl.SystemPropertiesHolder.systemProperties = loadSystemProperties();
   }

   private static AbstractConfigObject loadEnvVariables() {
      return PropertiesParser.fromStringMap(newSimpleOrigin("env variables"), System.getenv());
   }

   static AbstractConfigObject envVariablesAsConfigObject() {
      try {
         return ConfigImpl.EnvVariablesHolder.envVariables;
      } catch (ExceptionInInitializerError var1) {
         throw ConfigImplUtil.extractInitializerError(var1);
      }
   }

   public static Config envVariablesAsConfig() {
      return envVariablesAsConfigObject().toConfig();
   }

   public static void reloadEnvVariablesConfig() {
      ConfigImpl.EnvVariablesHolder.envVariables = loadEnvVariables();
   }

   private static AbstractConfigObject loadEnvVariablesOverrides() {
      HashMap var0 = new HashMap<>(System.getenv());
      HashMap var1 = new HashMap();

      for (String var3 : var0.keySet()) {
         if (var3.startsWith("CONFIG_FORCE_")) {
            var1.put(ConfigImplUtil.envVariableAsProperty(var3, "CONFIG_FORCE_"), var0.get(var3));
         }
      }

      return PropertiesParser.fromStringMap(newSimpleOrigin("env variables overrides"), var1);
   }

   static AbstractConfigObject envVariablesOverridesAsConfigObject() {
      try {
         return ConfigImpl.EnvVariablesOverridesHolder.envVariables;
      } catch (ExceptionInInitializerError var1) {
         throw ConfigImplUtil.extractInitializerError(var1);
      }
   }

   public static Config envVariablesOverridesAsConfig() {
      return envVariablesOverridesAsConfigObject().toConfig();
   }

   public static void reloadEnvVariablesOverridesConfig() {
      ConfigImpl.EnvVariablesOverridesHolder.envVariables = loadEnvVariablesOverrides();
   }

   public static Config defaultReference(final ClassLoader var0) {
      return computeCachedConfig(var0, "defaultReference", new Callable<Config>() {
         public Config call() {
            Config var1 = ConfigImpl.unresolvedReference(var0);
            return ConfigImpl.systemPropertiesAsConfig().withFallback(var1).resolve();
         }
      });
   }

   private static Config unresolvedReference(final ClassLoader var0) {
      return computeCachedConfig(var0, "unresolvedReference", new Callable<Config>() {
         public Config call() {
            return Parseable.newResources("reference.conf", ConfigParseOptions.defaults().setClassLoader(var0)).parse().toConfig();
         }
      });
   }

   public static Config defaultReferenceUnresolved(ClassLoader var0) {
      try {
         defaultReference(var0);
      } catch (ConfigException.UnresolvedSubstitution var2) {
         throw var2.addExtraDetail(
            "Could not resolve substitution in reference.conf to a value: %s. All reference.conf files are required to be fully, independently resolvable, and should not require the presence of values for substitutions from further up the hierarchy."
         );
      }

      return unresolvedReference(var0);
   }

   public static boolean traceLoadsEnabled() {
      try {
         return ConfigImpl.DebugHolder.traceLoadsEnabled();
      } catch (ExceptionInInitializerError var1) {
         throw ConfigImplUtil.extractInitializerError(var1);
      }
   }

   public static boolean traceSubstitutionsEnabled() {
      try {
         return ConfigImpl.DebugHolder.traceSubstitutionsEnabled();
      } catch (ExceptionInInitializerError var1) {
         throw ConfigImplUtil.extractInitializerError(var1);
      }
   }

   public static void trace(String var0) {
      System.err.println(var0);
   }

   public static void trace(int var0, String var1) {
      while (var0 > 0) {
         System.err.print("  ");
         var0--;
      }

      System.err.println(var1);
   }

   static ConfigException.NotResolved improveNotResolved(Path var0, ConfigException.NotResolved var1) {
      String var2 = var0.render() + " has not been resolved, you need to call Config#resolve(), see API docs for Config#resolve()";
      return var2.equals(var1.getMessage()) ? var1 : new ConfigException.NotResolved(var2, var1);
   }

   public static ConfigOrigin newSimpleOrigin(String var0) {
      return var0 == null ? defaultValueOrigin : SimpleConfigOrigin.newSimple(var0);
   }

   public static ConfigOrigin newFileOrigin(String var0) {
      return SimpleConfigOrigin.newFile(var0);
   }

   public static ConfigOrigin newURLOrigin(URL var0) {
      return SimpleConfigOrigin.newURL(var0);
   }

   static class ClasspathNameSource implements SimpleIncluder.NameSource {
      @Override
      public ConfigParseable nameToParseable(String var1, ConfigParseOptions var2) {
         return Parseable.newResources(var1, var2);
      }
   }

   static class ClasspathNameSourceWithClass implements SimpleIncluder.NameSource {
      private final Class<?> klass;

      public ClasspathNameSourceWithClass(Class<?> var1) {
         this.klass = var1;
      }

      @Override
      public ConfigParseable nameToParseable(String var1, ConfigParseOptions var2) {
         return Parseable.newResources(this.klass, var1, var2);
      }
   }

   private static class DebugHolder {
      private static String LOADS = "loads";
      private static String SUBSTITUTIONS = "substitutions";
      private static final Map<String, Boolean> diagnostics = loadDiagnostics();
      private static final boolean traceLoadsEnabled = diagnostics.get(LOADS);
      private static final boolean traceSubstitutionsEnabled = diagnostics.get(SUBSTITUTIONS);

      private static Map<String, Boolean> loadDiagnostics() {
         HashMap var0 = new HashMap();
         var0.put(LOADS, false);
         var0.put(SUBSTITUTIONS, false);
         String var1 = System.getProperty("config.trace");
         if (var1 == null) {
            return var0;
         }

         String[] var2 = var1.split(",");

         for (String var6 : var2) {
            if (var6.equals(LOADS)) {
               var0.put(LOADS, true);
            } else if (var6.equals(SUBSTITUTIONS)) {
               var0.put(SUBSTITUTIONS, true);
            } else {
               System.err.println("config.trace property contains unknown trace topic '" + var6 + "'");
            }
         }

         return var0;
      }

      static boolean traceLoadsEnabled() {
         return traceLoadsEnabled;
      }

      static boolean traceSubstitutionsEnabled() {
         return traceSubstitutionsEnabled;
      }
   }

   private static class DefaultIncluderHolder {
      static final ConfigIncluder defaultIncluder = new SimpleIncluder(null);
   }

   private static class EnvVariablesHolder {
      static volatile AbstractConfigObject envVariables = ConfigImpl.loadEnvVariables();
   }

   private static class EnvVariablesOverridesHolder {
      static volatile AbstractConfigObject envVariables = ConfigImpl.loadEnvVariablesOverrides();
   }

   static class FileNameSource implements SimpleIncluder.NameSource {
      @Override
      public ConfigParseable nameToParseable(String var1, ConfigParseOptions var2) {
         return Parseable.newFile(new File(var1), var2);
      }
   }

   private static class LoaderCache {
      private Config currentSystemProperties = null;
      private WeakReference<ClassLoader> currentLoader = new WeakReference<>(null);
      private Map<String, Config> cache = new HashMap<>();

      LoaderCache() {
      }

      synchronized Config getOrElseUpdate(ClassLoader var1, String var2, Callable<Config> var3) {
         if (var1 != this.currentLoader.get()) {
            this.cache.clear();
            this.currentLoader = new WeakReference<>(var1);
         }

         Config var4 = ConfigImpl.systemPropertiesAsConfig();
         if (var4 != this.currentSystemProperties) {
            this.cache.clear();
            this.currentSystemProperties = var4;
         }

         Config var5 = this.cache.get(var2);
         if (var5 == null) {
            try {
               var5 = (Config)var3.call();
            } catch (RuntimeException var7) {
               throw var7;
            } catch (Exception var8) {
               throw new ConfigException.Generic(var8.getMessage(), var8);
            }

            if (var5 == null) {
               throw new ConfigException.BugOrBroken("null config from cache updater");
            }

            this.cache.put(var2, var5);
         }

         return var5;
      }
   }

   private static class LoaderCacheHolder {
      static final ConfigImpl.LoaderCache cache = new ConfigImpl.LoaderCache();
   }

   private static class SystemPropertiesHolder {
      static volatile AbstractConfigObject systemProperties = ConfigImpl.loadSystemProperties();
   }
}
