package com.eliotlash.molang.utils;

public class MathUtils {
   public static int clamp(int var0, int var1, int var2) {
      return Math.min(Math.max(var0, var1), var2);
   }

   public static float clamp(float var0, float var1, float var2) {
      return Math.min(Math.max(var0, var1), var2);
   }

   public static double clamp(double var0, double var2, double var4) {
      return Math.min(Math.max(var0, var2), var4);
   }

   public static int cycler(int var0, int var1, int var2) {
      return var0 < var1 ? var2 : (var0 > var2 ? var1 : var0);
   }

   public static float cycler(float var0, float var1, float var2) {
      return var0 < var1 ? var2 : (var0 > var2 ? var1 : var0);
   }

   public static double cycler(double var0, double var2, double var4) {
      return var0 < var2 ? var4 : (var0 > var4 ? var2 : var0);
   }

   public static float wrapDegrees(float var0) {
      var0 %= 360.0F;
      if (var0 >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static double wrapDegrees(double var0) {
      var0 %= 360.0;
      if (var0 >= 180.0) {
         var0 -= 360.0;
      }

      if (var0 < -180.0) {
         var0 += 360.0;
      }

      return var0;
   }

   public static int wrapDegrees(int var0) {
      var0 %= 360;
      if (var0 >= 180) {
         var0 -= 360;
      }

      if (var0 < -180) {
         var0 += 360;
      }

      return var0;
   }

   public static boolean epsilonEquals(double var0, double var2) {
      return epsilonEquals(var0, var2, 1.0E-5);
   }

   public static boolean epsilonEquals(double var0, double var2, double var4) {
      return Math.abs(var0 - var2) < var4;
   }
}
