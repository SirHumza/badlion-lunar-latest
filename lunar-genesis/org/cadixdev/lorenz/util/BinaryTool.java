package org.cadixdev.lorenz.util;

public final class BinaryTool {
   public static String[] from(String var0) {
      return var0.split("\\$");
   }

   public static String to(String[] var0) {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1.append(var0[var2]);
         if (var2 != var0.length - 1) {
            var1.append('$');
         }
      }

      return var1.toString();
   }

   private BinaryTool() {
   }
}
