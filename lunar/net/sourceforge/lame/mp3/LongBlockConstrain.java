package net.sourceforge.lame.mp3;

final class LongBlockConstrain implements VBRQuantize.alloc_sf_f {
   private final VBRQuantize vbrQuantize;

   LongBlockConstrain(VBRQuantize var1) {
      this.vbrQuantize = var1;
   }

   @Override
   public void alloc(VBRQuantize.algo_t var1, int[] var2, int[] var3, int var4) {
      GrInfo var5 = var1.cod_info;
      LameInternalFlags var6 = var1.gfc;
      int var8 = var1.mingain_l;
      int var15 = 0;
      boolean var21 = true;
      boolean var22 = true;
      int var23 = var5.psymax;
      int[] var7 = var6.mode_gr == 2 ? VBRQuantize.max_range_long : VBRQuantize.max_range_long_lsf_pretab;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;

      for (int var9 = 0; var9 < var23; var9++) {
         assert var2[var9] >= var3[var9];
         int var16 = var4 - var2[var9];
         if (var15 < var16) {
            var15 = var16;
         }

         int var17 = var16 - 2 * VBRQuantize.max_range_long[var9];
         int var18 = var16 - 4 * VBRQuantize.max_range_long[var9];
         int var19 = var16 - 2 * (var7[var9] + this.vbrQuantize.qupvt.pretab[var9]);
         int var20 = var16 - 4 * (var7[var9] + this.vbrQuantize.qupvt.pretab[var9]);
         if (var10 < var17) {
            var10 = var17;
         }

         if (var11 < var18) {
            var11 = var18;
         }

         if (var12 < var19) {
            var12 = var19;
         }

         if (var13 < var20) {
            var13 = var20;
         }
      }

      if (var21) {
         int var24 = var4 - var12;
         if (var24 < var8) {
            var24 = var8;
         }

         for (int var27 = 0; var27 < var23; var27++) {
            int var25 = var24 - var3[var27] - 2 * this.vbrQuantize.qupvt.pretab[var27];
            if (var25 <= 0) {
               var21 = false;
               var22 = false;
               break;
            }
         }
      }

      if (var22) {
         int var36 = var4 - var13;
         if (var36 < var8) {
            var36 = var8;
         }

         for (int var28 = 0; var28 < var23; var28++) {
            int var38 = var36 - var3[var28] - 4 * this.vbrQuantize.qupvt.pretab[var28];
            if (var38 <= 0) {
               var22 = false;
               break;
            }
         }
      }

      if (!var21) {
         var12 = var10;
      }

      if (!var22) {
         var13 = var11;
      }

      if (var6.noise_shaping != 2) {
         var11 = var10;
         var13 = var12;
      }

      int var14 = Math.min(var10, var12);
      var14 = Math.min(var14, var11);
      var14 = Math.min(var14, var13);
      if (var15 > var14) {
         var15 = var14;
      }

      var4 -= var15;
      if (var4 < var8) {
         var4 = var8;
      }

      var10 -= var14;
      var12 -= var14;
      var11 -= var14;
      var13 -= var14;
      if (var10 == 0) {
         var5.scalefac_scale = 0;
         var5.preflag = 0;
         var7 = VBRQuantize.max_range_long;
      } else if (var12 == 0) {
         var5.scalefac_scale = 0;
         var5.preflag = 1;
      } else if (var11 == 0) {
         var5.scalefac_scale = 1;
         var5.preflag = 0;
         var7 = VBRQuantize.max_range_long;
      } else if (var13 == 0) {
         var5.scalefac_scale = 1;
         var5.preflag = 1;
      } else {
         assert false;
      }

      var5.global_gain = var4;
      if (var5.global_gain < 0) {
         var5.global_gain = 0;
      } else if (var5.global_gain > 255) {
         var5.global_gain = 255;
      }

      int[] var37 = new int[39];

      for (int var29 = 0; var29 < 39; var29++) {
         var37[var29] = var2[var29] - var4;
      }

      this.vbrQuantize.set_scalefacs(var5, var3, var37, var7);
      assert this.vbrQuantize.checkScalefactor(var5, var3);
   }
}
