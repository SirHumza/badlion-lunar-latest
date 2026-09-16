package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static float lerp(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   public static float lerpYaw(float var0, float var1, float var2) {
      var0 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var0);
      var1 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var1);
      return lerp(var0, normalizeYaw(var0, var1), var2);
   }

   public static double cubicHermite(double var0, double var2, double var4, double var6, double var8) {
      double var10 = -0.5 * var0 + 1.5 * var2 - 1.5 * var4 + 0.5 * var6;
      double var12 = var0 - 2.5 * var2 + 2.0 * var4 - 0.5 * var6;
      double var14 = -0.5 * var0 + 0.5 * var4;
      return ((var10 * var8 + var12) * var8 + var14) * var8 + var2;
   }

   public static double cubicHermiteYaw(float var0, float var1, float var2, float var3, float var4) {
      var0 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var0);
      var1 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var1);
      var2 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var2);
      var3 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var3);
      var1 = normalizeYaw(var0, var1);
      var2 = normalizeYaw(var1, var2);
      var3 = normalizeYaw(var2, var3);
      return cubicHermite(var0, var1, var2, var3, var4);
   }

   public static float cubic(float var0, float var1, float var2, float var3, float var4) {
      float var5 = var3 - var2 - var0 + var1;
      float var6 = var0 - var1 - var5;
      float var7 = var2 - var0;
      return ((var5 * var4 + var6) * var4 + var7) * var4 + var1;
   }

   public static float cubicYaw(float var0, float var1, float var2, float var3, float var4) {
      var0 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var0);
      var1 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var1);
      var2 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var2);
      var3 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var3);
      var1 = normalizeYaw(var0, var1);
      var2 = normalizeYaw(var1, var2);
      var3 = normalizeYaw(var2, var3);
      return cubic(var0, var1, var2, var3, var4);
   }

   public static float bezierX(float var0, float var1, float var2, float var3) {
      float var4 = var2;
      float var5 = bezier(0.0F, var0, var1, 1.0F, var2);
      float var6 = Math.copySign(0.1F, var2 - var5);

      while (Math.abs(var2 - var5) > var3) {
         float var7 = var6;
         var4 += var6;
         var5 = bezier(0.0F, var0, var1, 1.0F, var4);
         if (Math.copySign(var6, var2 - var5) != var7) {
            var6 *= -0.25F;
         }
      }

      return var4;
   }

   public static float bezierX(float var0, float var1, float var2) {
      return bezierX(var0, var1, var2, 5.0E-4F);
   }

   public static float bezier(float var0, float var1, float var2, float var3, float var4) {
      float var5 = lerp(var0, var1, var4);
      float var6 = lerp(var1, var2, var4);
      float var7 = lerp(var2, var3, var4);
      float var8 = lerp(var5, var6, var4);
      float var9 = lerp(var6, var7, var4);
      return lerp(var8, var9, var4);
   }

   public static float normalizeYaw(float var0, float var1) {
      float var2 = var0 - var1;
      if (!(var2 > 180.0F) && !(var2 < -180.0F)) {
         return var1;
      }

      var2 = Math.copySign(360.0F - Math.abs(var2), var2);
      return var0 + var2;
   }

   public static float envelope(float var0, float var1, float var2) {
      return envelope(var0, 0.0F, var2, var1 - var2, var1);
   }

   public static float envelope(float var0, float var1, float var2, float var3, float var4) {
      if (var0 < var1 || var0 > var4) {
         return 0.0F;
      } else if (var0 < var2) {
         return (var0 - var1) / (var2 - var1);
      } else {
         return var0 > var3 ? 1.0F - (var0 - var3) / (var4 - var3) : 1.0F;
      }
   }

   public static double lerp(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static double lerpYaw(double var0, double var2, double var4) {
      var0 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var0);
      var2 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var2);
      return lerp(var0, normalizeYaw(var0, var2), var4);
   }

   public static double cubic(double var0, double var2, double var4, double var6, double var8) {
      double var10 = var6 - var4 - var0 + var2;
      double var12 = var0 - var2 - var10;
      double var14 = var4 - var0;
      return ((var10 * var8 + var12) * var8 + var14) * var8 + var2;
   }

   public static double cubicYaw(double var0, double var2, double var4, double var6, double var8) {
      var0 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var0);
      var2 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var2);
      var4 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var4);
      var6 = CRRRICCRROCOHHOHIICIHORCOORRRH.wrapDegrees(var6);
      var2 = normalizeYaw(var0, var2);
      var4 = normalizeYaw(var2, var4);
      var6 = normalizeYaw(var4, var6);
      return cubic(var0, var2, var4, var6, var8);
   }

   public static double bezierX(double var0, double var2, double var4, double var6) {
      double var8 = var4;
      double var10 = bezier(0.0, var0, var2, 1.0, var4);
      double var12 = Math.copySign(0.1F, var4 - var10);

      while (Math.abs(var4 - var10) > var6) {
         double var14 = var12;
         var8 += var12;
         var10 = bezier(0.0, var0, var2, 1.0, var8);
         if (Math.copySign(var12, var4 - var10) != var14) {
            var12 *= -0.25;
         }
      }

      return var8;
   }

   public static double bezierX(double var0, double var2, float var4) {
      return bezierX(var0, var2, var4, 5.0E-4F);
   }

   public static double bezier(double var0, double var2, double var4, double var6, double var8) {
      double var10 = lerp(var0, var2, var8);
      double var12 = lerp(var2, var4, var8);
      double var14 = lerp(var4, var6, var8);
      double var16 = lerp(var10, var12, var8);
      double var18 = lerp(var12, var14, var8);
      return lerp(var16, var18, var8);
   }

   public static double normalizeYaw(double var0, double var2) {
      double var4 = var0 - var2;
      if (!(var4 > 180.0) && !(var4 < -180.0)) {
         return var2;
      }

      var4 = Math.copySign(360.0 - Math.abs(var4), var4);
      return var0 + var4;
   }

   public static double envelope(double var0, double var2, double var4) {
      return envelope(var0, 0.0, var4, var2 - var4, var2);
   }

   public static double envelope(double var0, double var2, double var4, double var6, double var8) {
      if (var0 < var2 || var0 > var8) {
         return 0.0;
      } else if (var0 < var4) {
         return (var0 - var2) / (var4 - var2);
      } else {
         return var0 > var6 ? 1.0 - (var0 - var6) / (var8 - var6) : 1.0;
      }
   }

   public static byte RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte var0, byte var1, float var2) {
      var2 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.clamp(var2, 0.0F, 1.0F);
      float var3 = var0 + var2 * (var1 - var0);
      return (byte)var3;
   }

   public static byte IRCIIHHICIHRCOCRROCOICRIHHCCHH(byte var0, byte var1, float var2) {
      int var4 = (var1 - var0 + 16) % 16;
      int var5 = (var0 - var1 + 16) % 16;
      float var3;
      if (var4 <= var5) {
         var3 = var0 + var2 * var4;
      } else {
         var3 = var0 - var2 * var5;
      }

      var3 = (var3 + 16.0F) % 16.0F;
      return (byte)var3;
   }
}
