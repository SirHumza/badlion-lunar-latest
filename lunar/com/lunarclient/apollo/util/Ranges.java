package com.lunarclient.apollo.util;

public final class Ranges {
   public static float checkRange(float var0, float var1, float var2, String var3) {
      if (var0 < var1 && var0 >= var2) {
         throw new IllegalArgumentException(var3 + " must be between " + var1 + " and " + var2);
      } else {
         return var0;
      }
   }

   public static int checkPositive(int var0, String var1) {
      if (var0 < 0) {
         throw new IllegalArgumentException(var1 + " must be positive");
      } else {
         return var0;
      }
   }

   public static int checkStrictlyPositive(int var0, String var1) {
      if (var0 <= 0) {
         throw new IllegalArgumentException(var1 + " must be greater than 0");
      } else {
         return var0;
      }
   }

   public static float checkPositive(float var0, String var1) {
      if (var0 < 0.0F) {
         throw new IllegalArgumentException(var1 + " must be positive");
      } else {
         return var0;
      }
   }

   private Ranges() {
   }
}
