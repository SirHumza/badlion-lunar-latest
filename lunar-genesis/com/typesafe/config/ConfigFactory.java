package com.typesafe.config;

import com.typesafe.config.impl.ConfigImpl;
import com.typesafe.config.impl.Parseable;
import java.io.File;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;

public final class ConfigFactory {
   private static final String STRATEGY_PROPERTY_NAME = "config.strategy";
   private static final String OVERRIDE_WITH_ENV_PROPERTY_NAME = "config.override_with_env_vars";

   private ConfigFactory() {
   }

   public static Config load(String var0) {
      return load(var0, ConfigParseOptions.defaults(), ConfigResolveOptions.defaults());
   }

   public static Config load(ClassLoader var0, String var1) {
      return load(var1, ConfigParseOptions.defaults().setClassLoader(var0), ConfigResolveOptions.defaults());
   }

   public static Config load(String var0, ConfigParseOptions var1, ConfigResolveOptions var2) {
      ConfigParseOptions var3 = ensureClassLoader(var1, "load");
      Config var4 = parseResourcesAnySyntax(var0, var3);
      return load(var3.getClassLoader(), var4, var2);
   }

   public static Config load(ClassLoader var0, String var1, ConfigParseOptions var2, ConfigResolveOptions var3) {
      return load(var1, var2.setClassLoader(var0), var3);
   }

   private static ClassLoader checkedContextClassLoader(String var0) {
      ClassLoader var1 = Thread.currentThread().getContextClassLoader();
      if (var1 == null) {
         throw new ConfigException.BugOrBroken(
            "Context class loader is not set for the current thread; if Thread.currentThread().getContextClassLoader() returns null, you must pass a ClassLoader explicitly to ConfigFactory."
               + var0
         );
      } else {
         return var1;
      }
   }

   private static ConfigParseOptions ensureClassLoader(ConfigParseOptions var0, String var1) {
      return var0.getClassLoader() == null ? var0.setClassLoader(checkedContextClassLoader(var1)) : var0;
   }

   public static Config load(Config var0) {
      return load(checkedContextClassLoader("load"), var0);
   }

   public static Config load(ClassLoader var0, Config var1) {
      return load(var0, var1, ConfigResolveOptions.defaults());
   }

   public static Config load(Config var0, ConfigResolveOptions var1) {
      return load(checkedContextClassLoader("load"), var0, var1);
   }

   public static Config load(ClassLoader var0, Config var1, ConfigResolveOptions var2) {
      return defaultOverrides(var0).withFallback(var1).withFallback(ConfigImpl.defaultReferenceUnresolved(var0)).resolve(var2);
   }

   public static Config load() {
      ClassLoader var0 = checkedContextClassLoader("load");
      return load(var0);
   }

   public static Config load(ConfigParseOptions var0) {
      return load(var0, ConfigResolveOptions.defaults());
   }

   public static Config load(final ClassLoader var0) {
      final ConfigParseOptions var1 = ConfigParseOptions.defaults().setClassLoader(var0);
      return ConfigImpl.computeCachedConfig(var0, "load", new Callable<Config>() {
         public Config call() {
            return ConfigFactory.load(var0, ConfigFactory.defaultApplication(var1));
         }
      });
   }

   public static Config load(ClassLoader var0, ConfigParseOptions var1) {
      return load(var1.setClassLoader(var0));
   }

   public static Config load(ClassLoader var0, ConfigResolveOptions var1) {
      return load(var0, ConfigParseOptions.defaults(), var1);
   }

   public static Config load(ClassLoader var0, ConfigParseOptions var1, ConfigResolveOptions var2) {
      ConfigParseOptions var3 = ensureClassLoader(var1, "load");
      return load(var0, defaultApplication(var3), var2);
   }

   public static Config load(ConfigParseOptions var0, ConfigResolveOptions var1) {
      ConfigParseOptions var2 = ensureClassLoader(var0, "load");
      return load(defaultApplication(var2), var1);
   }

   public static Config defaultReference() {
      return defaultReference(checkedContextClassLoader("defaultReference"));
   }

   public static Config defaultReference(ClassLoader var0) {
      return ConfigImpl.defaultReference(var0);
   }

   public static Config defaultReferenceUnresolved() {
      return defaultReferenceUnresolved(checkedContextClassLoader("defaultReferenceUnresolved"));
   }

   public static Config defaultReferenceUnresolved(ClassLoader var0) {
      return ConfigImpl.defaultReferenceUnresolved(var0);
   }

   public static Config defaultOverrides() {
      return getOverrideWithEnv() ? systemEnvironmentOverrides().withFallback(systemProperties()) : systemProperties();
   }

   public static Config defaultOverrides(ClassLoader var0) {
      return defaultOverrides();
   }

   public static Config defaultApplication() {
      return defaultApplication(ConfigParseOptions.defaults());
   }

   public static Config defaultApplication(ClassLoader var0) {
      return defaultApplication(ConfigParseOptions.defaults().setClassLoader(var0));
   }

   public static Config defaultApplication(ConfigParseOptions var0) {
      return getConfigLoadingStrategy().parseApplicationConfig(ensureClassLoader(var0, "defaultApplication"));
   }

   public static void invalidateCaches() {
      ConfigImpl.reloadSystemPropertiesConfig();
      ConfigImpl.reloadEnvVariablesConfig();
      ConfigImpl.reloadEnvVariablesOverridesConfig();
   }

   public static Config empty() {
      return empty(null);
   }

   public static Config empty(String var0) {
      return ConfigImpl.emptyConfig(var0);
   }

   public static Config systemProperties() {
      return ConfigImpl.systemPropertiesAsConfig();
   }

   public static Config systemEnvironmentOverrides() {
      return ConfigImpl.envVariablesOverridesAsConfig();
   }

   public static Config systemEnvironment() {
      return ConfigImpl.envVariablesAsConfig();
   }

   public static Config parseProperties(Properties var0, ConfigParseOptions var1) {
      return Parseable.newProperties(var0, var1).parse().toConfig();
   }

   public static Config parseProperties(Properties var0) {
      return parseProperties(var0, ConfigParseOptions.defaults());
   }

   public static Config parseReader(Reader var0, ConfigParseOptions var1) {
      return Parseable.newReader(var0, var1).parse().toConfig();
   }

   public static Config parseReader(Reader var0) {
      return parseReader(var0, ConfigParseOptions.defaults());
   }

   public static Config parseURL(URL var0, ConfigParseOptions var1) {
      return Parseable.newURL(var0, var1).parse().toConfig();
   }

   public static Config parseURL(URL var0) {
      return parseURL(var0, ConfigParseOptions.defaults());
   }

   public static Config parseFile(File var0, ConfigParseOptions var1) {
      return Parseable.newFile(var0, var1).parse().toConfig();
   }

   public static Config parseFile(File var0) {
      return parseFile(var0, ConfigParseOptions.defaults());
   }

   public static Config parseFileAnySyntax(File var0, ConfigParseOptions var1) {
      return ConfigImpl.parseFileAnySyntax(var0, var1).toConfig();
   }

   public static Config parseFileAnySyntax(File var0) {
      return parseFileAnySyntax(var0, ConfigParseOptions.defaults());
   }

   public static Config parseResources(Class<?> var0, String var1, ConfigParseOptions var2) {
      return Parseable.newResources(var0, var1, var2).parse().toConfig();
   }

   public static Config parseResources(Class<?> var0, String var1) {
      return parseResources(var0, var1, ConfigParseOptions.defaults());
   }

   public static Config parseResourcesAnySyntax(Class<?> var0, String var1, ConfigParseOptions var2) {
      return ConfigImpl.parseResourcesAnySyntax(var0, var1, var2).toConfig();
   }

   public static Config parseResourcesAnySyntax(Class<?> var0, String var1) {
      return parseResourcesAnySyntax(var0, var1, ConfigParseOptions.defaults());
   }

   public static Config parseResources(ClassLoader var0, String var1, ConfigParseOptions var2) {
      return parseResources(var1, var2.setClassLoader(var0));
   }

   public static Config parseResources(ClassLoader var0, String var1) {
      return parseResources(var0, var1, ConfigParseOptions.defaults());
   }

   public static Config parseResourcesAnySyntax(ClassLoader var0, String var1, ConfigParseOptions var2) {
      return ConfigImpl.parseResourcesAnySyntax(var1, var2.setClassLoader(var0)).toConfig();
   }

   public static Config parseResourcesAnySyntax(ClassLoader var0, String var1) {
      return parseResourcesAnySyntax(var0, var1, ConfigParseOptions.defaults());
   }

   public static Config parseResources(String var0, ConfigParseOptions var1) {
      ConfigParseOptions var2 = ensureClassLoader(var1, "parseResources");
      return Parseable.newResources(var0, var2).parse().toConfig();
   }

   public static Config parseResources(String var0) {
      return parseResources(var0, ConfigParseOptions.defaults());
   }

   public static Config parseResourcesAnySyntax(String var0, ConfigParseOptions var1) {
      return ConfigImpl.parseResourcesAnySyntax(var0, var1).toConfig();
   }

   public static Config parseResourcesAnySyntax(String var0) {
      return parseResourcesAnySyntax(var0, ConfigParseOptions.defaults());
   }

   public static java.util.Optional<Config> parseApplicationReplacement() {
      return parseApplicationReplacement(ConfigParseOptions.defaults());
   }

   public static java.util.Optional<Config> parseApplicationReplacement(ClassLoader var0) {
      return parseApplicationReplacement(ConfigParseOptions.defaults().setClassLoader(var0));
   }

   public static java.util.Optional<Config> parseApplicationReplacement(ConfigParseOptions var0) {
      ConfigParseOptions var1 = ensureClassLoader(var0, "parseApplicationReplacement");
      ClassLoader var2 = var1.getClassLoader();
      int var3 = 0;
      String var4 = System.getProperty("config.resource");
      if (var4 != null) {
         var3++;
      }

      String var5 = System.getProperty("config.file");
      if (var5 != null) {
         var3++;
      }

      String var6 = System.getProperty("config.url");
      if (var6 != null) {
         var3++;
      }

      if (var3 == 0) {
         return java.util.Optional.empty();
      }

      if (var3 > 1) {
         throw new ConfigException.Generic(
            "You set more than one of config.file='" + var5 + "', config.url='" + var6 + "', config.resource='" + var4 + "'; don't know which one to use!"
         );
      }

      ConfigParseOptions var7 = var0.setAllowMissing(false);
      if (var4 != null) {
         if (var4.startsWith("/")) {
            var4 = var4.substring(1);
         }

         return java.util.Optional.of(parseResources(var2, var4, var7));
      } else {
         if (var5 != null) {
            return java.util.Optional.of(parseFile(new File(var5), var7));
         }

         try {
            return java.util.Optional.of(parseURL(new URL(var6), var7));
         } catch (MalformedURLException var9) {
            throw new ConfigException.Generic("Bad URL in config.url system property: '" + var6 + "': " + var9.getMessage(), var9);
         }
      }
   }

   public static Config parseString(String var0, ConfigParseOptions var1) {
      return Parseable.newString(var0, var1).parse().toConfig();
   }

   public static Config parseString(String var0) {
      return parseString(var0, ConfigParseOptions.defaults());
   }

   public static Config parseMap(Map<String, ? extends Object> var0, String var1) {
      return ConfigImpl.fromPathMap(var0, var1).toConfig();
   }

   public static Config parseMap(Map<String, ? extends Object> var0) {
      return parseMap(var0, null);
   }

   private static ConfigLoadingStrategy getConfigLoadingStrategy() {
      String var0 = System.getProperties().getProperty("config.strategy");
      if (var0 != null) {
         try {
            return ConfigLoadingStrategy.class.cast(Class.forName(var0).newInstance());
         } catch (Throwable var2) {
            throw new ConfigException.BugOrBroken("Failed to load strategy: " + var0, var2);
         }
      } else {
         return new DefaultConfigLoadingStrategy();
      }
   }

   private static Boolean getOverrideWithEnv() {
      String var0 = System.getProperties().getProperty("config.override_with_env_vars");
      return Boolean.parseBoolean(var0);
   }
}
