package com.typesafe.config;

import com.typesafe.config.impl.ConfigImplUtil;

public final class ConfigParseOptions {
   final ConfigSyntax syntax;
   final String originDescription;
   final boolean allowMissing;
   final ConfigIncluder includer;
   final ClassLoader classLoader;

   private ConfigParseOptions(ConfigSyntax var1, String var2, boolean var3, ConfigIncluder var4, ClassLoader var5) {
      this.syntax = var1;
      this.originDescription = var2;
      this.allowMissing = var3;
      this.includer = var4;
      this.classLoader = var5;
   }

   public static ConfigParseOptions defaults() {
      return new ConfigParseOptions(null, null, true, null, null);
   }

   public ConfigParseOptions setSyntax(ConfigSyntax var1) {
      return this.syntax == var1 ? this : new ConfigParseOptions(var1, this.originDescription, this.allowMissing, this.includer, this.classLoader);
   }

   public ConfigParseOptions setSyntaxFromFilename(String var1) {
      ConfigSyntax var2 = ConfigImplUtil.syntaxFromExtension(var1);
      return this.setSyntax(var2);
   }

   public ConfigSyntax getSyntax() {
      return this.syntax;
   }

   public ConfigParseOptions setOriginDescription(String var1) {
      if (this.originDescription == var1) {
         return this;
      } else {
         return this.originDescription != null && var1 != null && this.originDescription.equals(var1)
            ? this
            : new ConfigParseOptions(this.syntax, var1, this.allowMissing, this.includer, this.classLoader);
      }
   }

   public String getOriginDescription() {
      return this.originDescription;
   }

   ConfigParseOptions withFallbackOriginDescription(String var1) {
      return this.originDescription == null ? this.setOriginDescription(var1) : this;
   }

   public ConfigParseOptions setAllowMissing(boolean var1) {
      return this.allowMissing == var1 ? this : new ConfigParseOptions(this.syntax, this.originDescription, var1, this.includer, this.classLoader);
   }

   public boolean getAllowMissing() {
      return this.allowMissing;
   }

   public ConfigParseOptions setIncluder(ConfigIncluder var1) {
      return this.includer == var1 ? this : new ConfigParseOptions(this.syntax, this.originDescription, this.allowMissing, var1, this.classLoader);
   }

   public ConfigParseOptions prependIncluder(ConfigIncluder var1) {
      if (var1 == null) {
         throw new NullPointerException("null includer passed to prependIncluder");
      } else if (this.includer == var1) {
         return this;
      } else {
         return this.includer != null ? this.setIncluder(var1.withFallback(this.includer)) : this.setIncluder(var1);
      }
   }

   public ConfigParseOptions appendIncluder(ConfigIncluder var1) {
      if (var1 == null) {
         throw new NullPointerException("null includer passed to appendIncluder");
      } else if (this.includer == var1) {
         return this;
      } else {
         return this.includer != null ? this.setIncluder(this.includer.withFallback(var1)) : this.setIncluder(var1);
      }
   }

   public ConfigIncluder getIncluder() {
      return this.includer;
   }

   public ConfigParseOptions setClassLoader(ClassLoader var1) {
      return this.classLoader == var1 ? this : new ConfigParseOptions(this.syntax, this.originDescription, this.allowMissing, this.includer, var1);
   }

   public ClassLoader getClassLoader() {
      return this.classLoader == null ? Thread.currentThread().getContextClassLoader() : this.classLoader;
   }
}
