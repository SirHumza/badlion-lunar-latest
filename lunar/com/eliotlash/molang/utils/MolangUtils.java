package com.eliotlash.molang.utils;

public class MolangUtils {
   public static float normalizeTime(long var0) {
      return (float)var0 / 24000.0F;
   }

   public static float booleanToFloat(boolean var0) {
      return var0 ? 1.0F : 0.0F;
   }

   public static boolean doubleToBoolean(double var0) {
      return var0 != 0.0;
   }
}
