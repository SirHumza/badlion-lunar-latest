package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

public final class MurmurHash {
   public static int initialize() {
      return initialize(0);
   }

   public static int initialize(int var0) {
      return var0;
   }

   public static int update(int var0, int var1) {
      int var2 = -862048943;
      int var3 = 461845907;
      byte var4 = 15;
      byte var5 = 13;
      byte var6 = 5;
      int var7 = -430675100;
      int var8 = var1;
      var8 *= -862048943;
      var8 = var8 << 15 | var8 >>> 17;
      var8 *= 461845907;
      var0 ^= var8;
      var0 = var0 << 13 | var0 >>> 19;
      return var0 * 5 + -430675100;
   }

   public static int update(int var0, Object var1) {
      return update(var0, var1 != null ? var1.hashCode() : 0);
   }

   public static int finish(int var0, int var1) {
      var0 ^= var1 * 4;
      var0 ^= var0 >>> 16;
      var0 *= -2048144789;
      var0 ^= var0 >>> 13;
      var0 *= -1028477387;
      return var0 ^ var0 >>> 16;
   }

   public static <T> int hashCode(T[] var0, int var1) {
      int var2 = initialize(var1);

      for (Object var6 : var0) {
         var2 = update(var2, var6);
      }

      return finish(var2, var0.length);
   }
}
