package net.sourceforge.lame.mp3;

final class ShortBlockConstrain implements VBRQuantize.alloc_sf_f {
   private final VBRQuantize vbrQuantize;

   ShortBlockConstrain(VBRQuantize var1) {
      this.vbrQuantize = var1;
   }

   @Override
   public void alloc(VBRQuantize.algo_t var1, int[] var2, int[] var3, int var4) {
      GrInfo var5 = var1.cod_info;
      LameInternalFlags var6 = var1.gfc;
      int var7 = var1.mingain_l;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var16 = var5.psymax;

      for (int var15 = 0; var15 < var16; var15++) {
         assert var2[var15] >= var3[var15];
         int var12 = var4 - var2[var15];
         if (var11 < var12) {
            var11 = var12;
         }

         int var13 = var12 - (56 + 2 * VBRQuantize.max_range_short[var15]);
         int var14 = var12 - (56 + 4 * VBRQuantize.max_range_short[var15]);
         if (var9 < var13) {
            var9 = var13;
         }

         if (var10 < var14) {
            var10 = var14;
         }
      }

      int var8;
      if (var6.noise_shaping == 2) {
         var8 = Math.min(var9, var10);
      } else {
         var8 = var9;
      }

      if (var11 > var8) {
         var11 = var8;
      }

      var4 -= var11;
      var9 -= var8;
      var10 -= var8;
      if (var9 == 0) {
         var5.scalefac_scale = 0;
      } else if (var10 == 0) {
         var5.scalefac_scale = 1;
      }

      if (var4 < var7) {
         var4 = var7;
      }

      var5.global_gain = var4;
      if (var5.global_gain < 0) {
         var5.global_gain = 0;
      } else if (var5.global_gain > 255) {
         var5.global_gain = 255;
      }

      int[] var17 = new int[39];

      for (int var21 = 0; var21 < 39; var21++) {
         var17[var21] = var2[var21] - var4;
      }

      this.vbrQuantize.set_subblock_gain(var5, var1.mingain_s, var17);
      this.vbrQuantize.set_scalefacs(var5, var3, var17, VBRQuantize.max_range_short);
      assert this.vbrQuantize.checkScalefactor(var5, var3);
   }
}
