package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
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
}
