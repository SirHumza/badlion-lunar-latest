package com.typesafe.config;

public final class ConfigResolveOptions {
   private final boolean useSystemEnvironment;
   private final boolean allowUnresolved;
   private final ConfigResolver resolver;
   private static final ConfigResolver NULL_RESOLVER = new ConfigResolver() {
      @Override
      public ConfigValue lookup(String var1) {
         return null;
      }

      @Override
      public ConfigResolver withFallback(ConfigResolver var1) {
         return var1;
      }
   };

   private ConfigResolveOptions(boolean var1, boolean var2, ConfigResolver var3) {
      this.useSystemEnvironment = var1;
      this.allowUnresolved = var2;
      this.resolver = var3;
   }

   public static ConfigResolveOptions defaults() {
      return new ConfigResolveOptions(true, false, NULL_RESOLVER);
   }

   public static ConfigResolveOptions noSystem() {
      return defaults().setUseSystemEnvironment(false);
   }

   public ConfigResolveOptions setUseSystemEnvironment(boolean var1) {
      return new ConfigResolveOptions(var1, this.allowUnresolved, this.resolver);
   }

   public boolean getUseSystemEnvironment() {
      return this.useSystemEnvironment;
   }

   public ConfigResolveOptions setAllowUnresolved(boolean var1) {
      return new ConfigResolveOptions(this.useSystemEnvironment, var1, this.resolver);
   }

   public ConfigResolveOptions appendResolver(ConfigResolver var1) {
      if (var1 == null) {
         throw new ConfigException.BugOrBroken("null resolver passed to appendResolver");
      } else {
         return var1 == this.resolver ? this : new ConfigResolveOptions(this.useSystemEnvironment, this.allowUnresolved, this.resolver.withFallback(var1));
      }
   }

   public ConfigResolver getResolver() {
      return this.resolver;
   }

   public boolean getAllowUnresolved() {
      return this.allowUnresolved;
   }
}
