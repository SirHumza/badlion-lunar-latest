package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

class CORCOCICIRIOHROHROIIOOHICCHCRR {
   private static final int RCIIHICOCROCICOOORRROOIHCHOORH = 127;
   private static final int OOORORHRCROCRRCRHHICOHHHOHCRHR = 24;
   private static final int OHORHRIIHCOHCOCIOIHRCRCIRIROOI = -45;
   private static final int OROHOROICOORRCCCHCRHIRRCCCRIOO = 38;
   private static final int IRIHHRHROOORHHOCIRIIIIORCIHRCO = -126;
   private static final int CICOHICICRROOIHROICOCHHRCCRHOO = 127;
   private static final float[] RHORCCCCIRHCRRCROOOHCRIOHIOHRO = new float[]{
      1.0F, 10.0F, 100.0F, 1000.0F, 10000.0F, 100000.0F, 1000000.0F, 1.0E7F, 1.0E8F, 1.0E9F, 1.0E10F
   };

   private CORCOCICIRIOHROHROIIOOHICCHCRR() {
   }

   static float decFloatLiteralToFloat(boolean var0, long var1, int var3, boolean var4, int var5) {
      if (var1 == 0L) {
         return var0 ? -0.0F : 0.0F;
      }

      float var6;
      if (var4) {
         if (-45 <= var5 && var5 <= 38) {
            float var7 = tryDecToFloatWithFastAlgorithm(var0, var1, var5);
            float var8 = tryDecToFloatWithFastAlgorithm(var0, var1 + 1L, var5);
            if (!Float.isNaN(var7) && var8 == var7) {
               return var7;
            }
         }

         var6 = Float.NaN;
      } else if (-45 <= var3 && var3 <= 38) {
         var6 = tryDecToFloatWithFastAlgorithm(var0, var1, var3);
      } else {
         var6 = Float.NaN;
      }

      return var6;
   }

   static float hexFloatLiteralToFloat(boolean var0, long var1, int var3, boolean var4, int var5) {
      int var6 = var4 ? var5 : var3;
      if (-126 <= var6 && var6 <= 127) {
         float var7 = Math.abs((float)var1);
         var7 *= Math.scalb(1.0F, var6);
         if (var0) {
            var7 = -var7;
         }

         return var7;
      } else {
         return Float.NaN;
      }
   }

   static float tryDecToFloatWithFastAlgorithm(boolean var0, long var1, int var3) {
      if (-10 <= var3 && var3 <= 10 && Long.compareUnsigned(var1, 16777215L) <= 0) {
         float var21 = (float)var1;
         if (var3 < 0) {
            var21 /= RHORCCCCIRHCRRCROOOHCRIOHIOHRO[-var3];
         } else {
            var21 *= RHORCCCCIRHCRRCROOOHCRIOHIOHRO[var3];
         }

         return var0 ? -var21 : var21;
      } else {
         long var4 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CCCCHOOOHCCROHOICOOORCIHOCRRIO[var3 - -325];
         long var6 = (217706L * var3 >> 16) + 127L + 64L;
         int var8 = Long.numberOfLeadingZeros(var1);
         long var9 = var1 << var8;
         CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var9, var4);
         long var12 = var11.RCCRROCHRCORIRIHICCIOHOIOCRRCI;
         long var14 = var12 >>> 63;
         long var16 = var12 >>> (int)(var14 + 38L);
         var8 += (int)(1L ^ var14);
         if ((var12 & 274877906943L) != 274877906943L && ((var12 & 274877906943L) != 0L || (var16 & 3L) != 1L)) {
            var16 = ++var16 >>> 1;
            if (var16 >= 16777216L) {
               var16 = 8388608L;
               var8--;
            }

            var16 &= -8388609L;
            long var18 = var6 - var8;
            if (var18 >= 1L && var18 <= 254L) {
               int var20 = (int)(var16 | var18 << 23 | (var0 ? 2147483648L : 0L));
               return Float.intBitsToFloat(var20);
            } else {
               return Float.NaN;
            }
         } else {
            return Float.NaN;
         }
      }
   }
}
