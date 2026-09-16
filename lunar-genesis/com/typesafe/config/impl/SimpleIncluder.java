package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigIncludeContext;
import com.typesafe.config.ConfigIncluder;
import com.typesafe.config.ConfigIncluderClasspath;
import com.typesafe.config.ConfigIncluderFile;
import com.typesafe.config.ConfigIncluderURL;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigParseable;
import com.typesafe.config.ConfigSyntax;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

class SimpleIncluder implements FullIncluder {
   private ConfigIncluder fallback;

   SimpleIncluder(ConfigIncluder var1) {
      this.fallback = var1;
   }

   static ConfigParseOptions clearForInclude(ConfigParseOptions var0) {
      return var0.setSyntax(null).setOriginDescription(null).setAllowMissing(true);
   }

   @Override
   public ConfigObject include(ConfigIncludeContext var1, String var2) {
      ConfigObject var3 = includeWithoutFallback(var1, var2);
      return this.fallback != null ? var3.withFallback(this.fallback.include(var1, var2)) : var3;
   }

   static ConfigObject includeWithoutFallback(ConfigIncludeContext var0, String var1) {
      URL var2;
      try {
         var2 = new URL(var1);
      } catch (MalformedURLException var4) {
         var2 = null;
      }

      if (var2 != null) {
         return includeURLWithoutFallback(var0, var2);
      }

      SimpleIncluder.RelativeNameSource var3 = new SimpleIncluder.RelativeNameSource(var0);
      return fromBasename(var3, var1, var0.parseOptions());
   }

   @Override
   public ConfigObject includeURL(ConfigIncludeContext var1, URL var2) {
      ConfigObject var3 = includeURLWithoutFallback(var1, var2);
      return this.fallback != null && this.fallback instanceof ConfigIncluderURL
         ? var3.withFallback(((ConfigIncluderURL)this.fallback).includeURL(var1, var2))
         : var3;
   }

   static ConfigObject includeURLWithoutFallback(ConfigIncludeContext var0, URL var1) {
      return ConfigFactory.parseURL(var1, var0.parseOptions()).root();
   }

   @Override
   public ConfigObject includeFile(ConfigIncludeContext var1, File var2) {
      ConfigObject var3 = includeFileWithoutFallback(var1, var2);
      return this.fallback != null && this.fallback instanceof ConfigIncluderFile
         ? var3.withFallback(((ConfigIncluderFile)this.fallback).includeFile(var1, var2))
         : var3;
   }

   static ConfigObject includeFileWithoutFallback(ConfigIncludeContext var0, File var1) {
      return ConfigFactory.parseFileAnySyntax(var1, var0.parseOptions()).root();
   }

   @Override
   public ConfigObject includeResources(ConfigIncludeContext var1, String var2) {
      ConfigObject var3 = includeResourceWithoutFallback(var1, var2);
      return this.fallback != null && this.fallback instanceof ConfigIncluderClasspath
         ? var3.withFallback(((ConfigIncluderClasspath)this.fallback).includeResources(var1, var2))
         : var3;
   }

   static ConfigObject includeResourceWithoutFallback(ConfigIncludeContext var0, String var1) {
      return ConfigFactory.parseResourcesAnySyntax(var1, var0.parseOptions()).root();
   }

   @Override
   public ConfigIncluder withFallback(ConfigIncluder var1) {
      if (this == var1) {
         throw new ConfigException.BugOrBroken("trying to create includer cycle");
      } else if (this.fallback == var1) {
         return this;
      } else {
         return this.fallback != null ? new SimpleIncluder(this.fallback.withFallback(var1)) : new SimpleIncluder(var1);
      }
   }

   static ConfigObject fromBasename(SimpleIncluder.NameSource var0, String var1, ConfigParseOptions var2) {
      ConfigObject var3;
      if (!var1.endsWith(".conf") && !var1.endsWith(".json") && !var1.endsWith(".properties")) {
         ConfigParseable var16 = var0.nameToParseable(var1 + ".conf", var2);
         ConfigParseable var5 = var0.nameToParseable(var1 + ".json", var2);
         ConfigParseable var6 = var0.nameToParseable(var1 + ".properties", var2);
         boolean var7 = false;
         ArrayList var8 = new ArrayList();
         ConfigSyntax var9 = var2.getSyntax();
         var3 = SimpleConfigObject.empty(SimpleConfigOrigin.newSimple(var1));
         if (var9 == null || var9 == ConfigSyntax.CONF) {
            try {
               var3 = var16.parse(var16.options().setAllowMissing(false).setSyntax(ConfigSyntax.CONF));
               var7 = true;
            } catch (ConfigException.IO var15) {
               var8.add(var15);
            }
         }

         if (var9 == null || var9 == ConfigSyntax.JSON) {
            try {
               ConfigObject var10 = var5.parse(var5.options().setAllowMissing(false).setSyntax(ConfigSyntax.JSON));
               var3 = var3.withFallback(var10);
               var7 = true;
            } catch (ConfigException.IO var14) {
               var8.add(var14);
            }
         }

         if (var9 == null || var9 == ConfigSyntax.PROPERTIES) {
            try {
               ConfigObject var17 = var6.parse(var6.options().setAllowMissing(false).setSyntax(ConfigSyntax.PROPERTIES));
               var3 = var3.withFallback(var17);
               var7 = true;
            } catch (ConfigException.IO var13) {
               var8.add(var13);
            }
         }

         if (!var2.getAllowMissing() && !var7) {
            if (ConfigImpl.traceLoadsEnabled()) {
               ConfigImpl.trace("Did not find '" + var1 + "' with any extension (.conf, .json, .properties); exceptions should have been logged above.");
            }

            if (var8.isEmpty()) {
               throw new ConfigException.BugOrBroken("should not be reached: nothing found but no exceptions thrown");
            }

            StringBuilder var18 = new StringBuilder();

            for (Throwable var12 : var8) {
               var18.append(var12.getMessage());
               var18.append(", ");
            }

            var18.setLength(var18.length() - 2);
            throw new ConfigException.IO(SimpleConfigOrigin.newSimple(var1), var18.toString(), (Throwable)var8.get(0));
         }

         if (!var7 && ConfigImpl.traceLoadsEnabled()) {
            ConfigImpl.trace(
               "Did not find '"
                  + var1
                  + "' with any extension (.conf, .json, .properties); but '"
                  + var1
                  + "' is allowed to be missing. Exceptions from load attempts should have been logged above."
            );
         }
      } else {
         ConfigParseable var4 = var0.nameToParseable(var1, var2);
         var3 = var4.parse(var4.options().setAllowMissing(var2.getAllowMissing()));
      }

      return var3;
   }

   static FullIncluder makeFull(ConfigIncluder var0) {
      return var0 instanceof FullIncluder ? (FullIncluder)var0 : new SimpleIncluder.Proxy(var0);
   }

   interface NameSource {
      ConfigParseable nameToParseable(String var1, ConfigParseOptions var2);
   }

   private static class Proxy implements FullIncluder {
      final ConfigIncluder delegate;

      Proxy(ConfigIncluder var1) {
         this.delegate = var1;
      }

      @Override
      public ConfigIncluder withFallback(ConfigIncluder var1) {
         return this;
      }

      @Override
      public ConfigObject include(ConfigIncludeContext var1, String var2) {
         return this.delegate.include(var1, var2);
      }

      @Override
      public ConfigObject includeResources(ConfigIncludeContext var1, String var2) {
         return this.delegate instanceof ConfigIncluderClasspath
            ? ((ConfigIncluderClasspath)this.delegate).includeResources(var1, var2)
            : SimpleIncluder.includeResourceWithoutFallback(var1, var2);
      }

      @Override
      public ConfigObject includeURL(ConfigIncludeContext var1, URL var2) {
         return this.delegate instanceof ConfigIncluderURL
            ? ((ConfigIncluderURL)this.delegate).includeURL(var1, var2)
            : SimpleIncluder.includeURLWithoutFallback(var1, var2);
      }

      @Override
      public ConfigObject includeFile(ConfigIncludeContext var1, File var2) {
         return this.delegate instanceof ConfigIncluderFile
            ? ((ConfigIncluderFile)this.delegate).includeFile(var1, var2)
            : SimpleIncluder.includeFileWithoutFallback(var1, var2);
      }
   }

   private static class RelativeNameSource implements SimpleIncluder.NameSource {
      private final ConfigIncludeContext context;

      RelativeNameSource(ConfigIncludeContext var1) {
         this.context = var1;
      }

      @Override
      public ConfigParseable nameToParseable(String var1, ConfigParseOptions var2) {
         ConfigParseable var3 = this.context.relativeTo(var1);
         return var3 == null ? Parseable.newNotFound(var1, "include was not found: '" + var1 + "'", var2) : var3;
      }
   }
}
