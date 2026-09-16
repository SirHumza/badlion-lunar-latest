package com.typesafe.config;

import com.typesafe.config.impl.ConfigImpl;
import java.net.URL;

public final class ConfigOriginFactory {
   private ConfigOriginFactory() {
   }

   public static ConfigOrigin newSimple() {
      return newSimple(null);
   }

   public static ConfigOrigin newSimple(String var0) {
      return ConfigImpl.newSimpleOrigin(var0);
   }

   public static ConfigOrigin newFile(String var0) {
      return ConfigImpl.newFileOrigin(var0);
   }

   public static ConfigOrigin newURL(URL var0) {
      return ConfigImpl.newURLOrigin(var0);
   }
}
