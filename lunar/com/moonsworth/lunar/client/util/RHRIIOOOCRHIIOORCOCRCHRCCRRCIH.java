package com.moonsworth.lunar.client.util;

import lombok.Generated;

public final class RHRIIOOOCRHIIOORCOCRCHRCCRRCIH {
   public static float RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   public static double OOCCRCRCOHIIORCCORCRCIRRROIOOR(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var0, var4));
   }

   public static float OIHCOHRCICCCRHRCROOCIOIRRHHHIH(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var0, var2));
   }

   public static byte RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte var0, byte var1, byte var2) {
      byte var3 = var0 <= var2 ? var0 : var2;
      return var1 >= var3 ? var1 : var3;
   }

   public static short RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(short var0, short var1, short var2) {
      short var3 = var0 <= var2 ? var0 : var2;
      return var1 >= var3 ? var1 : var3;
   }

   public static int CRHROHHHCIHHCOHCOORCRIHHIICROR(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var0, var2));
   }

   public static long RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, long var2, long var4) {
      return Math.max(var2, Math.min(var0, var4));
   }

   public static int HOHCCHOIOHOHHOROHOIIHOOHORRHRO(double var0) {
      int var2 = (int)var0;
      return var0 > var2 ? var2 + 1 : var2;
   }

   public static int IICCOOCHCHROORHHIIHROHCCRHRCOR(double var0) {
      int var2 = (int)var0;
      return var0 < var2 ? var2 - 1 : var2;
   }

   public static int OOROOCCIRCCRHOIOIORIHCHHOOCCOR(double var0) {
      int var2 = (int)var0;
      return var0 < var2 ? var2 - 1 : var2;
   }

   public static double OHIIIOHIRIRCCRRIOIICCHHIORRHOH(double var0, double var2, double var4) {
      return Math.min(Math.max(var0, var2), var4);
   }

   public static float HICHRCOHCCRHOHCICOOCHOIHCCHIRI(float var0, float var1, float var2) {
      return Math.min(Math.max(var0, var1), var2);
   }

   public static float HICRRICCHCCROOHHCHOCOCCHOIHHOC(float var0) {
      var0 %= 360.0F;
      if (var0 >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static double CRICCOOHHHCHOORCICOCOHIHOIRHOO(double var0) {
      var0 %= 360.0;
      if (var0 >= 180.0) {
         var0 -= 360.0;
      }

      if (var0 < -180.0) {
         var0 += 360.0;
      }

      return var0;
   }

   public static float lerp(float var0, float var1, float var2) {
      return var2 >= 1.0F ? var1 : (var2 <= 0.0F ? var0 : var0 + (var1 - var0) * var2);
   }

   public static double IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var0, double var2, float var4) {
      return var4 >= 1.0F ? var2 : (var4 <= 0.0F ? var0 : var0 + (var2 - var0) * var4);
   }

   public static float IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var0, float var1, float var2, float var3, float var4) {
      return (var0 - var1) / (var2 - var1) * (var4 - var3) + var3;
   }

   public static double CRRRICCRROCOHHOHIICIHORCOORRRH(double var0, double var2, double var4, double var6) {
      double var8 = var0 - var4;
      double var10 = var2 - var6;
      return var8 * var8 + var10 * var10;
   }

   public static boolean IHICORCROOROHCIHIHCOIHRRHICICO(double var0, double var2, double var4) {
      return Math.abs(var0 - var2) < var4;
   }

   @Generated
   private RHRIIOOOCRHIIOORCOCRCHRCCRRCIH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
