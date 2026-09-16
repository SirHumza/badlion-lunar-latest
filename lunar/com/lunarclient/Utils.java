package com.lunarclient;

public final class Utils {
   public static String addDashesToUuid(String var0) {
      if (var0 == null) {
         return null;
      }

      String var1 = var0.replace("-", "");
      return var1.length() != 32
         ? var0
         : var1.substring(0, 8) + "-" + var1.substring(8, 12) + "-" + var1.substring(12, 16) + "-" + var1.substring(16, 20) + "-" + var1.substring(20);
   }

   public static String snakeToCamelCase(String var0) {
      StringBuilder var1 = new StringBuilder();
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         if (var0.charAt(var3) == '_') {
            var2 = true;
         } else if (var2) {
            var1.append(Character.toUpperCase(var0.charAt(var3)));
            var2 = false;
         } else {
            var1.append(var0.charAt(var3));
         }
      }

      return var1.toString();
   }

   private Utils() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
