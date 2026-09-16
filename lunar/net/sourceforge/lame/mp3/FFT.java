package net.sourceforge.lame.mp3;

public class FFT {
   private static final float[] costab = new float[]{0.9238795F, 0.38268343F, 0.9951847F, 0.09801714F, 0.9996988F, 0.024541229F, 0.99998116F, 0.0061358847F};
   private static final byte[] rv_tbl = new byte[]{
      0,
      -128,
      64,
      -64,
      32,
      -96,
      96,
      -32,
      16,
      -112,
      80,
      -48,
      48,
      -80,
      112,
      -16,
      8,
      -120,
      72,
      -56,
      40,
      -88,
      104,
      -24,
      24,
      -104,
      88,
      -40,
      56,
      -72,
      120,
      -8,
      4,
      -124,
      68,
      -60,
      36,
      -92,
      100,
      -28,
      20,
      -108,
      84,
      -44,
      52,
      -76,
      116,
      -12,
      12,
      -116,
      76,
      -52,
      44,
      -84,
      108,
      -20,
      28,
      -100,
      92,
      -36,
      60,
      -68,
      124,
      -4,
      2,
      -126,
      66,
      -62,
      34,
      -94,
      98,
      -30,
      18,
      -110,
      82,
      -46,
      50,
      -78,
      114,
      -14,
      10,
      -118,
      74,
      -54,
      42,
      -86,
      106,
      -22,
      26,
      -102,
      90,
      -38,
      58,
      -70,
      122,
      -6,
      6,
      -122,
      70,
      -58,
      38,
      -90,
      102,
      -26,
      22,
      -106,
      86,
      -42,
      54,
      -74,
      118,
      -10,
      14,
      -114,
      78,
      -50,
      46,
      -82,
      110,
      -18,
      30,
      -98,
      94,
      -34,
      62,
      -66,
      126,
      -2
   };
   private static float[] window = new float[1024];
   private static float[] window_s = new float[128];

   private void fht(float[] var1, int var2, int var3) {
      byte var4 = 0;
      var3 <<= 1;
      int var8 = var2 + var3;
      int var5 = 4;

      do {
         int var15 = var5 >> 1;
         int var12 = var5;
         int var13 = var5 << 1;
         int var14 = var13 + var12;
         var5 = var13 << 1;
         int var6 = var2;
         int var7 = var6 + var15;

         do {
            float var17 = var1[var6 + 0] - var1[var6 + var12];
            float var16 = var1[var6 + 0] + var1[var6 + var12];
            float var19 = var1[var6 + var13] - var1[var6 + var14];
            float var18 = var1[var6 + var13] + var1[var6 + var14];
            var1[var6 + var13] = var16 - var18;
            var1[var6 + 0] = var16 + var18;
            var1[var6 + var14] = var17 - var19;
            var1[var6 + var12] = var17 + var19;
            var17 = var1[var7 + 0] - var1[var7 + var12];
            var16 = var1[var7 + 0] + var1[var7 + var12];
            var19 = 1.4142135F * var1[var7 + var14];
            var18 = 1.4142135F * var1[var7 + var13];
            var1[var7 + var13] = var16 - var18;
            var1[var7 + 0] = var16 + var18;
            var1[var7 + var14] = var17 - var19;
            var1[var7 + var12] = var17 + var19;
            var7 += var5;
            var6 += var5;
         } while (var6 < var8);

         float var10 = costab[var4 + 0];
         float var9 = costab[var4 + 1];

         for (int var11 = 1; var11 < var15; var11++) {
            float var32 = 1.0F - 2.0F * var9 * var9;
            float var35 = 2.0F * var9 * var10;
            var6 = var2 + var11;
            var7 = var2 + var12 - var11;

            do {
               float var42 = var35 * var1[var6 + var12] - var32 * var1[var7 + var12];
               float var37 = var32 * var1[var6 + var12] + var35 * var1[var7 + var12];
               float var22 = var1[var6 + 0] - var37;
               float var21 = var1[var6 + 0] + var37;
               float var23 = var1[var7 + 0] - var42;
               float var20 = var1[var7 + 0] + var42;
               var42 = var35 * var1[var6 + var14] - var32 * var1[var7 + var14];
               var37 = var32 * var1[var6 + var14] + var35 * var1[var7 + var14];
               float var26 = var1[var6 + var13] - var37;
               float var24 = var1[var6 + var13] + var37;
               float var27 = var1[var7 + var13] - var42;
               float var25 = var1[var7 + var13] + var42;
               var42 = var9 * var24 - var10 * var27;
               var37 = var10 * var24 + var9 * var27;
               var1[var6 + var13] = var21 - var37;
               var1[var6 + 0] = var21 + var37;
               var1[var7 + var14] = var23 - var42;
               var1[var7 + var12] = var23 + var42;
               var42 = var10 * var25 - var9 * var26;
               var37 = var9 * var25 + var10 * var26;
               var1[var7 + var13] = var20 - var37;
               var1[var7 + 0] = var20 + var37;
               var1[var6 + var14] = var22 - var42;
               var1[var6 + var12] = var22 + var42;
               var7 += var5;
               var6 += var5;
            } while (var6 < var8);

            var32 = var10;
            var10 = var32 * costab[var4 + 0] - var9 * costab[var4 + 1];
            var9 = var32 * costab[var4 + 1] + var9 * costab[var4 + 0];
         }

         var4 += 2;
      } while (var5 < var3);
   }

   public final void fft_short(LameInternalFlags var1, float[][] var2, int var3, float[][] var4, int var5) {
      for (int var6 = 0; var6 < 3; var6++) {
         short var7 = 128;
         short var8 = (short)(192 * (var6 + 1));
         int var9 = 31;

         do {
            int var15 = rv_tbl[var9 << 2] & 255;
            float var10 = window_s[var15] * var4[var3][var5 + var15 + var8];
            float var14 = window_s[127 - var15] * var4[var3][var5 + var15 + var8 + 128];
            float var11 = var10 - var14;
            var10 += var14;
            float var12 = window_s[var15 + 64] * var4[var3][var5 + var15 + var8 + 64];
            var14 = window_s[63 - var15] * var4[var3][var5 + var15 + var8 + 192];
            float var13 = var12 - var14;
            var12 += var14;
            var7 -= 4;
            var2[var6][var7 + 0] = var10 + var12;
            var2[var6][var7 + 2] = var10 - var12;
            var2[var6][var7 + 1] = var11 + var13;
            var2[var6][var7 + 3] = var11 - var13;
            var10 = window_s[var15 + 1] * var4[var3][var5 + var15 + var8 + 1];
            var14 = window_s[126 - var15] * var4[var3][var5 + var15 + var8 + 129];
            var11 = var10 - var14;
            var10 += var14;
            var12 = window_s[var15 + 65] * var4[var3][var5 + var15 + var8 + 65];
            var14 = window_s[62 - var15] * var4[var3][var5 + var15 + var8 + 193];
            var13 = var12 - var14;
            var12 += var14;
            var2[var6][var7 + 128 + 0] = var10 + var12;
            var2[var6][var7 + 128 + 2] = var10 - var12;
            var2[var6][var7 + 128 + 1] = var11 + var13;
            var2[var6][var7 + 128 + 3] = var11 - var13;
         } while (--var9 >= 0);

         this.fht(var2[var6], var7, 128);
      }
   }

   public final void fft_long(LameInternalFlags var1, float[] var2, int var3, float[][] var4, int var5) {
      int var6 = 127;
      short var7 = 512;

      do {
         int var13 = rv_tbl[var6] & 255;
         float var8 = window[var13] * var4[var3][var5 + var13];
         float var12 = window[var13 + 512] * var4[var3][var5 + var13 + 512];
         float var9 = var8 - var12;
         var8 += var12;
         float var10 = window[var13 + 256] * var4[var3][var5 + var13 + 256];
         var12 = window[var13 + 768] * var4[var3][var5 + var13 + 768];
         float var11 = var10 - var12;
         var10 += var12;
         var7 -= 4;
         var2[var7 + 0] = var8 + var10;
         var2[var7 + 2] = var8 - var10;
         var2[var7 + 1] = var9 + var11;
         var2[var7 + 3] = var9 - var11;
         var8 = window[var13 + 1] * var4[var3][var5 + var13 + 1];
         var12 = window[var13 + 513] * var4[var3][var5 + var13 + 513];
         var9 = var8 - var12;
         var8 += var12;
         var10 = window[var13 + 257] * var4[var3][var5 + var13 + 257];
         var12 = window[var13 + 769] * var4[var3][var5 + var13 + 769];
         var11 = var10 - var12;
         var10 += var12;
         var2[var7 + 512 + 0] = var8 + var10;
         var2[var7 + 512 + 2] = var8 - var10;
         var2[var7 + 512 + 1] = var9 + var11;
         var2[var7 + 512 + 3] = var9 - var11;
      } while (--var6 >= 0);

      this.fht(var2, var7, 512);
   }

   public final void init_fft(LameInternalFlags var1) {
      for (int var2 = 0; var2 < 1024; var2++) {
         window[var2] = (float)(0.42 - 0.5 * Math.cos((Math.PI * 2) * (var2 + 0.5) / 1024.0) + 0.08 * Math.cos((Math.PI * 4) * (var2 + 0.5) / 1024.0));
      }

      for (int var3 = 0; var3 < 128; var3++) {
         window_s[var3] = (float)(0.5 * (1.0 - Math.cos((Math.PI * 2) * (var3 + 0.5) / 256.0)));
      }
   }
}
