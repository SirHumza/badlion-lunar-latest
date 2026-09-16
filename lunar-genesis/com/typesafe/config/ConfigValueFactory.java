package com.typesafe.config;

import com.typesafe.config.impl.ConfigImpl;
import java.util.Map;

public final class ConfigValueFactory {
   private ConfigValueFactory() {
   }

   public static ConfigValue fromAnyRef(Object var0, String var1) {
      return ConfigImpl.fromAnyRef(var0, var1);
   }

   public static ConfigObject fromMap(Map<String, ? extends Object> var0, String var1) {
      return (ConfigObject)fromAnyRef(var0, var1);
   }

   public static ConfigList fromIterable(Iterable<? extends Object> var0, String var1) {
      return (ConfigList)fromAnyRef(var0, var1);
   }

   public static ConfigValue fromAnyRef(Object var0) {
      return fromAnyRef(var0, null);
   }

   public static ConfigObject fromMap(Map<String, ? extends Object> var0) {
      return fromMap(var0, null);
   }

   public static ConfigList fromIterable(Iterable<? extends Object> var0) {
      return fromIterable(var0, null);
   }
}
