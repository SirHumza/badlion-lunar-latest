package com.llamalad7.mixinextras.lib.antlr.runtime;

public class RuntimeMetaData {
   public static void checkVersion(String var0, String var1) {
      String var2 = "4.13.1";
      boolean var3 = false;
      boolean var4 = false;
      if (var0 != null) {
         var3 = !var2.equals(var0) && !getMajorMinorVersion(var2).equals(getMajorMinorVersion(var0));
      }

      var4 = !var2.equals(var1) && !getMajorMinorVersion(var2).equals(getMajorMinorVersion(var1));
      if (var3) {
         System.err.printf("ANTLR Tool version %s used for code generation does not match the current runtime version %s%n", var0, var2);
      }

      if (var4) {
         System.err.printf("ANTLR Runtime version %s used for parser compilation does not match the current runtime version %s%n", var1, var2);
      }
   }

   public static String getMajorMinorVersion(String var0) {
      int var1 = var0.indexOf(46);
      int var2 = var1 >= 0 ? var0.indexOf(46, var1 + 1) : -1;
      int var3 = var0.indexOf(45);
      int var4 = var0.length();
      if (var2 >= 0) {
         var4 = Math.min(var4, var2);
      }

      if (var3 >= 0) {
         var4 = Math.min(var4, var3);
      }

      return var0.substring(0, var4);
   }
}
