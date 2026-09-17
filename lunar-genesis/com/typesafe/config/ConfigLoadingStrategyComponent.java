package com.typesafe.config;

public class DefaultConfigLoadingStrategy implements ConfigLoadingStrategy {
   @Override
   public Config parseApplicationConfig(ConfigParseOptions var1) {
      return ConfigFactory.parseApplicationReplacement(var1).orElseGet(() -> ConfigFactory.parseResourcesAnySyntax("application", var1));
   }
}
