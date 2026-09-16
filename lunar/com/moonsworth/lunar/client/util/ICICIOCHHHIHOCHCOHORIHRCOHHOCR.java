package com.moonsworth.lunar.client.util;

public class ICICIOCHHHIHOCHCOHORIHRCOHHOCR {
   private static final int HOIRCOHRIRCHCOCCOIOIIIOHHOOORH = 8192;
   private static final int OIIRCOHCOCRRIIIHRICRORRIHOCRRC = 16384;
   private static final double IIRHIHHOROOIHOHRRCORCCRRIOHHRH = Math.PI * 2;
   private static final double[] IICOICRIRRHCOHOORCOHRORHHORCHC = new double[8192];

   public static double sin(double var0) {
      return HRHRORCIRICHCCCCCHICOOICIRHRIO(var0 - (Math.PI / 2));
   }

   public static double HRHRORCIRICHCCCCCHICOOICIRHRIO(double var0) {
      int var2 = (int)(var0 / (Math.PI * 2) % 1.0 * 16384.0);
      if (var2 < 0) {
         var2 += 16384;
      }

      return var2 >= 8192 ? -IICOICRIRRHCOHOORCOHRORHHORCHC[var2 - 8192] : IICOICRIRRHCOHOORCOHRORHHORCHC[var2];
   }

   public static void RICHHICCROCRORHORRHOIRHOIOCIOO() {
      double var0 = 0.0;
      double var2 = 0.0;

      for (int var4 = -200000000; var4 < 800000000; var4++) {
         double var5 = var4 / 1.0E8;
         double var7 = Math.sin(var5);
         double var9 = sin(var5);
         double var11 = Math.abs(var7 - var9);
         var2 += var11;
         if (var11 > var0) {
            var0 = var11;
         }
      }

      System.err.println("[LC Fast Math] Average error: " + var2 / 1.0E9);
      System.err.println("[LC Fast Math] Maximum error: " + var0);
   }

   static {
      for (int var0 = 0; var0 < 8192; var0++) {
         IICOICRIRRHCOHOORCOHRORHHORCHC[var0] = Math.cos(var0 / 8192.0F * Math.PI);
      }
   }
}
