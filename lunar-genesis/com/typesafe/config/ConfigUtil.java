package com.typesafe.config;

import com.typesafe.config.impl.ConfigImplUtil;
import java.util.List;

public final class ConfigUtil {
   private ConfigUtil() {
   }

   public static String quoteString(String var0) {
      return ConfigImplUtil.renderJsonString(var0);
   }

   public static String joinPath(String... var0) {
      return ConfigImplUtil.joinPath(var0);
   }

   public static String joinPath(List<String> var0) {
      return ConfigImplUtil.joinPath(var0);
   }

   public static List<String> splitPath(String var0) {
      return ConfigImplUtil.splitPath(var0);
   }
}
