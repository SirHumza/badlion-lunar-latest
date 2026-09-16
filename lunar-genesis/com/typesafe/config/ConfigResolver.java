package com.typesafe.config;

public interface ConfigResolver {
   ConfigValue lookup(String var1);

   ConfigResolver withFallback(ConfigResolver var1);
}
