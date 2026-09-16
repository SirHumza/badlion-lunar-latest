package net.sourceforge.lame.mp3;

import java.util.Arrays;

public class VBRQuantize {
   protected static final int[] max_range_short = new int[]{
      15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 0, 0, 0
   };
   protected static final int[] max_range_long = new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 0};
   protected static final int[] max_range_long_lsf_pretab = new int[]{7, 7, 7, 7, 7, 7, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   QuantizePVT qupvt;
   Takehiro tak;

   public final void setModules(QuantizePVT var1, Takehiro var2) {
      this.qupvt = var1;
      this.tak = var2;
   }

   private float max_x34(float[] var1, int var2, int var3) {
      float var4 = 0.0F;
      int var5 = var3 >> 1;
      int var6 = var5 & 1;

      for (int var7 = var5 >> 1; var7 > 0; var7--) {
         if (var4 < var1[var2 + 0]) {
            var4 = var1[var2 + 0];
         }

         if (var4 < var1[var2 + 1]) {
            var4 = var1[var2 + 1];
         }

         if (var4 < var1[var2 + 2]) {
            var4 = var1[var2 + 2];
         }

         if (var4 < var1[var2 + 3]) {
            var4 = var1[var2 + 3];
         }

         var2 += 4;
      }

      if (var6 != 0) {
         if (var4 < var1[var2 + 0]) {
            var4 = var1[var2 + 0];
         }

         if (var4 < var1[var2 + 1]) {
            var4 = var1[var2 + 1];
         }
      }

      return var4;
   }

   private int findLowestScalefac(float var1) {
      short var2 = 255;
      short var3 = 128;
      byte var4 = 64;

      for (int var5 = 0; var5 < 8; var5++) {
         float var6 = this.qupvt.ipow20[var3] * var1;
         if (var6 <= 8206.0F) {
            var2 = var3;
            var3 -= var4;
         } else {
            var3 += var4;
         }

         var4 >>= 1;
      }

      return var2;
   }

   private int belowNoiseFloor(float[] var1, int var2, float var3, int var4) {
      float var5 = 0.0F;
      int var6 = 0;

      for (int var7 = var4; var7 > 0; var7--) {
         float var8 = var1[var2 + var6];
         var5 += var8 * var8;
         var6++;
      }

      return var3 - var5 >= -1.0E-20 ? 1 : 0;
   }

   private void k_34_4(double[] var1, int[] var2, int var3) {
      assert var1[0] <= 8206.0 && var1[1] <= 8206.0 && var1[2] <= 8206.0 && var1[3] <= 8206.0;
      var2[var3 + 0] = (int)var1[0];
      var2[var3 + 1] = (int)var1[1];
      var2[var3 + 2] = (int)var1[2];
      var2[var3 + 3] = (int)var1[3];
      var1[0] += this.qupvt.adj43[var2[var3 + 0]];
      var1[1] += this.qupvt.adj43[var2[var3 + 1]];
      var1[2] += this.qupvt.adj43[var2[var3 + 2]];
      var1[3] += this.qupvt.adj43[var2[var3 + 3]];
      var2[var3 + 0] = (int)var1[0];
      var2[var3 + 1] = (int)var1[1];
      var2[var3 + 2] = (int)var1[2];
      var2[var3 + 3] = (int)var1[3];
   }

   private void k_34_2(double[] var1, int[] var2, int var3) {
      assert var1[0] <= 8206.0 && var1[1] <= 8206.0;
      var2[var3 + 0] = (int)var1[0];
      var2[var3 + 1] = (int)var1[1];
      var1[0] += this.qupvt.adj43[var2[var3 + 0]];
      var1[1] += this.qupvt.adj43[var2[var3 + 1]];
      var2[var3 + 0] = (int)var1[0];
      var2[var3 + 1] = (int)var1[1];
   }

   private float calc_sfb_noise_x34(float[] var1, float[] var2, int var3, int var4, int var5) {
      double[] var6 = new double[4];
      int[] var7 = new int[4];
      float var8 = this.qupvt.pow20[var5 + 116];
      float var9 = this.qupvt.ipow20[var5];
      float var10 = 0.0F;
      int var11 = var4 >> 1;
      int var12 = var11 & 1;

      for (int var13 = var11 >> 1; var13 > 0; var13--) {
         var6[0] = var9 * var2[var3 + 0];
         var6[1] = var9 * var2[var3 + 1];
         var6[2] = var9 * var2[var3 + 2];
         var6[3] = var9 * var2[var3 + 3];
         this.k_34_4(var6, var7, 0);
         var6[0] = Math.abs(var1[var3 + 0]) - var8 * this.qupvt.pow43[var7[0]];
         var6[1] = Math.abs(var1[var3 + 1]) - var8 * this.qupvt.pow43[var7[1]];
         var6[2] = Math.abs(var1[var3 + 2]) - var8 * this.qupvt.pow43[var7[2]];
         var6[3] = Math.abs(var1[var3 + 3]) - var8 * this.qupvt.pow43[var7[3]];
         var10 = (float)(var10 + (var6[0] * var6[0] + var6[1] * var6[1] + (var6[2] * var6[2] + var6[3] * var6[3])));
         var3 += 4;
      }

      if (var12 != 0) {
         var6[0] = var9 * var2[var3 + 0];
         var6[1] = var9 * var2[var3 + 1];
         this.k_34_2(var6, var7, 0);
         var6[0] = Math.abs(var1[var3 + 0]) - var8 * this.qupvt.pow43[var7[0]];
         var6[1] = Math.abs(var1[var3 + 1]) - var8 * this.qupvt.pow43[var7[1]];
         var10 = (float)(var10 + (var6[0] * var6[0] + var6[1] * var6[1]));
      }

      return var10;
   }

   private boolean tri_calc_sfb_noise_x34(float[] var1, float[] var2, int var3, float var4, int var5, int var6, VBRQuantize.CalcNoiseCache[] var7) {
      if (var7[var6].valid == 0) {
         var7[var6].valid = 1;
         var7[var6].value = this.calc_sfb_noise_x34(var1, var2, var3, var5, var6);
      }

      if (var4 < var7[var6].value) {
         return true;
      }

      if (var6 < 255) {
         int var8 = var6 + 1;
         if (var7[var8].valid == 0) {
            var7[var8].valid = 1;
            var7[var8].value = this.calc_sfb_noise_x34(var1, var2, var3, var5, var8);
         }

         if (var4 < var7[var8].value) {
            return true;
         }
      }

      if (var6 > 0) {
         int var9 = var6 - 1;
         if (var7[var9].valid == 0) {
            var7[var9].valid = 1;
            var7[var9].value = this.calc_sfb_noise_x34(var1, var2, var3, var5, var9);
         }

         if (var4 < var7[var9].value) {
            return true;
         }
      }

      return false;
   }

   private int find_scalefac_x34(float[] var1, float[] var2, int var3, float var4, int var5, int var6) {
      VBRQuantize.CalcNoiseCache[] var7 = new VBRQuantize.CalcNoiseCache[256];
      short var8 = 128;
      short var9 = 255;
      short var10 = 128;
      byte var11 = 0;

      for (int var13 = 0; var13 < var7.length; var13++) {
         var7[var13] = new VBRQuantize.CalcNoiseCache();
      }

      for (int var12 = 0; var12 < 8; var12++) {
         var10 >>= 1;
         if (var8 <= var6) {
            var8 += var10;
         } else {
            boolean var14 = this.tri_calc_sfb_noise_x34(var1, var2, var3, var4, var5, var8, var7);
            if (var14) {
               var8 -= var10;
            } else {
               var9 = var8;
               var8 += var10;
               var11 = 1;
            }
         }
      }

      if (var11 > 0) {
         return var9;
      } else {
         return var8 <= var6 ? var6 : var8;
      }
   }

   private int block_sf(VBRQuantize.algo_t var1, float[] var2, int[] var3, int[] var4) {
      float[] var6 = var1.cod_info.xr;
      float[] var7 = var1.xr34orig;
      int[] var8 = var1.cod_info.width;
      int var9 = var1.cod_info.max_nonzero_coeff;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = var1.cod_info.psymax;
      assert var1.cod_info.max_nonzero_coeff >= 0;
      var1.mingain_l = 0;
      var1.mingain_s[0] = 0;
      var1.mingain_s[1] = 0;
      var1.mingain_s[2] = 0;

      while (var12 <= var9) {
         int var15 = var8[var11];
         int var16 = var9 - var12 + 1;
         int var17 = var15;
         if (var17 > var16) {
            var17 = var16;
         }

         float var5 = this.max_x34(var7, var12, var17);
         int var18 = this.findLowestScalefac(var5);
         var4[var11] = var18;
         if (var1.mingain_l < var18) {
            var1.mingain_l = var18;
         }

         if (var1.mingain_s[var13] < var18) {
            var1.mingain_s[var13] = var18;
         }

         if (++var13 > 2) {
            var13 = 0;
         }

         int var19;
         if (var11 < var14) {
            if (this.belowNoiseFloor(var6, var12, var2[var11], var17) == 0) {
               var19 = this.find_scalefac_x34(var6, var7, var12, var2[var11], var17, var18);
               if (var10 < var19) {
                  var10 = var19;
               }
            } else {
               var19 = 255;
               var10 = 255;
            }
         } else {
            if (var10 < var18) {
               var10 = var18;
            }

            var19 = var10;
         }

         var3[var11] = var19;
         var11++;
         var12 += var15;
      }

      while (var11 < 39) {
         var3[var11] = var10;
         var4[var11] = 0;
         var11++;
      }

      return var10;
   }

   private final void quantize_x34(VBRQuantize.algo_t var1) {
      double[] var2 = new double[4];
      byte var3 = 0;
      GrInfo var4 = var1.cod_info;
      int var5 = var4.scalefac_scale == 0 ? 2 : 4;
      byte var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = var4.max_nonzero_coeff;
      assert var4.max_nonzero_coeff >= 0;
      assert var4.max_nonzero_coeff < 576;

      while (var7 <= var9) {
         int var10 = (var4.scalefac[var8] + (var4.preflag != 0 ? this.qupvt.pretab[var8] : 0)) * var5 + var4.subblock_gain[var4.window[var8]] * 8;
         int var11 = var4.global_gain - var10;
         float var12 = this.qupvt.ipow20[var11];
         int var13 = var4.width[var8];
         int var14 = var9 - var7 + 1;
         int var15 = var13;
         assert var4.global_gain - var10 >= 0;
         assert var4.width[var8] >= 0;
         if (var15 > var14) {
            var15 = var14;
         }

         var7 += var13;
         var8++;
         var15 >>= 1;
         int var16 = var15 & 1;

         for (int var18 = var15 >> 1; var18 > 0; var18--) {
            var2[0] = var12 * var1.xr34orig[var3 + 0];
            var2[1] = var12 * var1.xr34orig[var3 + 1];
            var2[2] = var12 * var1.xr34orig[var3 + 2];
            var2[3] = var12 * var1.xr34orig[var3 + 3];
            this.k_34_4(var2, var4.l3_enc, var6);
            var6 += 4;
            var3 += 4;
         }

         if (var16 != 0) {
            var2[0] = var12 * var1.xr34orig[var3 + 0];
            var2[1] = var12 * var1.xr34orig[var3 + 1];
            this.k_34_2(var2, var4.l3_enc, var6);
            var6 += 2;
            var3 += 2;
         }
      }
   }

   protected void set_subblock_gain(GrInfo var1, int[] var2, int[] var3) {
      byte var4 = 15;
      byte var5 = 7;
      int var6 = var1.scalefac_scale == 0 ? 1 : 2;
      int[] var7 = var1.subblock_gain;
      int var8 = var1.psymax;
      int var9 = 18;
      int var14 = 7;
      if (var9 > var8) {
         var9 = var8;
      }

      for (int var15 = 0; var15 < 3; var15++) {
         int var16 = 0;
         int var17 = 0;
         int var18 = 1000;

         int var13;
         for (var13 = var15; var13 < var9; var13 += 3) {
            int var19 = -var3[var13];
            if (var16 < var19) {
               var16 = var19;
            }

            if (var18 > var19) {
               var18 = var19;
            }
         }

         for (; var13 < 39; var13 += 3) {
            int var24 = -var3[var13];
            if (var17 < var24) {
               var17 = var24;
            }

            if (var18 > var24) {
               var18 = var24;
            }
         }

         int var25 = var16 - (15 << var6);
         int var20 = var17 - (7 << var6);
         var16 = Math.max(var25, var20);
         if (var18 > 0) {
            var7[var15] = var18 >> 3;
         } else {
            var7[var15] = 0;
         }

         if (var16 > 0) {
            var25 = var7[var15];
            var20 = var16 + 7 >> 3;
            var7[var15] = Math.max(var25, var20);
         }

         if (var7[var15] > 0 && var2[var15] > var1.global_gain - var7[var15] * 8) {
            var7[var15] = var1.global_gain - var2[var15] >> 3;
         }

         if (var7[var15] > 7) {
            var7[var15] = 7;
         }

         if (var14 > var7[var15]) {
            var14 = var7[var15];
         }
      }

      int var10 = var7[0] * 8;
      int var11 = var7[1] * 8;
      int var12 = var7[2] * 8;

      for (byte var21 = 0; var21 < 39; var21 += 3) {
         var3[var21 + 0] = var3[var21 + 0] + var10;
         var3[var21 + 1] = var3[var21 + 1] + var11;
         var3[var21 + 2] = var3[var21 + 2] + var12;
      }

      if (var14 > 0) {
         for (int var22 = 0; var22 < 3; var22++) {
            var7[var22] -= var14;
         }

         var1.global_gain -= var14 * 8;
      }
   }

   protected void set_scalefacs(GrInfo var1, int[] var2, int[] var3, int[] var4) {
      int var5 = var1.scalefac_scale == 0 ? 2 : 4;
      int var6 = var1.scalefac_scale == 0 ? 1 : 2;
      int[] var7 = var1.scalefac;
      int var8 = var1.sfbmax;
      int[] var9 = var1.subblock_gain;
      int[] var10 = var1.window;
      int var11 = var1.preflag;
      if (var11 != 0) {
         for (int var12 = 11; var12 < var8; var12++) {
            var3[var12] += this.qupvt.pretab[var12] * var5;
         }
      }

      for (int var15 = 0; var15 < var8; var15++) {
         int var13 = var1.global_gain - var9[var10[var15]] * 8 - (var11 != 0 ? this.qupvt.pretab[var15] : 0) * var5;
         if (var3[var15] < 0) {
            int var14 = var13 - var2[var15];
            var7[var15] = var5 - 1 - var3[var15] >> var6;
            if (var7[var15] > var4[var15]) {
               var7[var15] = var4[var15];
            }

            if (var7[var15] > 0 && var7[var15] << var6 > var14) {
               var7[var15] = var14 >> var6;
            }
         } else {
            var7[var15] = 0;
         }
      }

      for (int var16 = var8; var16 < 39; var16++) {
         var7[var16] = 0;
      }
   }

   protected boolean checkScalefactor(GrInfo var1, int[] var2) {
      int var3 = var1.scalefac_scale == 0 ? 2 : 4;

      for (int var4 = 0; var4 < var1.psymax; var4++) {
         int var5 = (var1.scalefac[var4] + (var1.preflag != 0 ? this.qupvt.pretab[var4] : 0)) * var3 + var1.subblock_gain[var1.window[var4]] * 8;
         if (var1.global_gain - var5 < var2[var4]) {
            return false;
         }
      }

      return true;
   }

   private void bitcount(VBRQuantize.algo_t var1) {
      boolean var2;
      if (var1.gfc.mode_gr == 2) {
         var2 = this.tak.scale_bitcount(var1.cod_info);
      } else {
         var2 = this.tak.scale_bitcount_lsf(var1.gfc, var1.cod_info);
      }

      if (var2) {
         throw new RuntimeException("INTERNAL ERROR IN VBR NEW CODE (986), please send bug report");
      }
   }

   private int quantizeAndCountBits(VBRQuantize.algo_t var1) {
      this.quantize_x34(var1);
      var1.cod_info.part2_3_length = this.tak.noquant_count_bits(var1.gfc, var1.cod_info, null);
      return var1.cod_info.part2_3_length;
   }

   private int tryGlobalStepsize(VBRQuantize.algo_t var1, int[] var2, int[] var3, int var4) {
      float var5 = var1.cod_info.xrpow_max;
      int[] var6 = new int[39];
      int var8 = 0;

      for (int var9 = 0; var9 < 39; var9++) {
         int var10 = var2[var9] + var4;
         if (var10 < var3[var9]) {
            var10 = var3[var9];
         }

         if (var10 > 255) {
            var10 = 255;
         }

         if (var8 < var10) {
            var8 = var10;
         }

         var6[var9] = var10;
      }

      var1.alloc.alloc(var1, var6, var3, var8);
      this.bitcount(var1);
      int var7 = this.quantizeAndCountBits(var1);
      var1.cod_info.xrpow_max = var5;
      return var7;
   }

   private void searchGlobalStepsizeMax(VBRQuantize.algo_t var1, int[] var2, int[] var3, int var4) {
      GrInfo var5 = var1.cod_info;
      int var6 = var5.global_gain;
      int var7 = var6;
      int var8 = 1024;
      int var9 = 100000;
      int var10 = var6;
      int var11 = 512;
      assert var6 >= 0;

      while (var10 <= var11) {
         var7 = var10 + var11 >> 1;
         var9 = this.tryGlobalStepsize(var1, var2, var3, var7 - var6);
         if (var9 != 0 && var9 + var5.part2_length >= var4) {
            var10 = var7 + 1;
            if (var8 == 1024) {
               var8 = var7;
            }
         } else {
            var11 = var7 - 1;
            var8 = var7;
         }
      }

      if (var8 != var7) {
         var7 = var8;
         var9 = this.tryGlobalStepsize(var1, var2, var3, var7 - var6);
      }
   }

   private int sfDepth(int[] var1) {
      int var2 = 0;
      int var3 = 39;

      for (int var4 = 0; var3 > 0; var4++) {
         int var5 = 255 - var1[var4];
         if (var2 < var5) {
            var2 = var5;
         }

         assert var1[var4] >= 0;
         assert var1[var4] <= 255;
         var3--;
      }

      assert var2 >= 0;
      assert var2 <= 255;
      return var2;
   }

   private void cutDistribution(int[] var1, int[] var2, int var3) {
      int var4 = 39;

      for (int var5 = 0; var4 > 0; var5++) {
         int var6 = var1[var5];
         var2[var5] = var6 < var3 ? var6 : var3;
         var4--;
      }
   }

   private int flattenDistribution(int[] var1, int[] var2, int var3, int var4, int var5) {
      int var6 = 0;
      if (var3 > 0) {
         int var7 = 39;

         for (int var8 = 0; var7 > 0; var8++) {
            int var9 = var5 - var1[var8];
            int var10 = var1[var8] + var4 * var9 / var3;
            if (var10 < 0) {
               var10 = 0;
            } else if (var10 > 255) {
               var10 = 255;
            }

            var2[var8] = var10;
            if (var6 < var10) {
               var6 = var10;
            }

            var7--;
         }
      } else {
         int var11 = 39;

         for (int var12 = 0; var11 > 0; var12++) {
            int var13 = var1[var12];
            var2[var12] = var13;
            if (var6 < var13) {
               var6 = var13;
            }

            var11--;
         }
      }

      return var6;
   }

   private int tryThatOne(VBRQuantize.algo_t var1, int[] var2, int[] var3, int var4) {
      float var5 = var1.cod_info.xrpow_max;
      int var6 = 100000;
      var1.alloc.alloc(var1, var2, var3, var4);
      this.bitcount(var1);
      var6 = this.quantizeAndCountBits(var1);
      var6 += var1.cod_info.part2_length;
      var1.cod_info.xrpow_max = var5;
      return var6;
   }

   private void outOfBitsStrategy(VBRQuantize.algo_t var1, int[] var2, int[] var3, int var4) {
      int[] var5 = new int[39];
      int var6 = this.sfDepth(var2);
      int var7 = var1.cod_info.global_gain;
      int var8 = var6 / 2;
      int var9 = -1;
      int var10 = 0;
      int var11 = var6;

      while (true) {
         int var12 = this.flattenDistribution(var2, var5, var6, var8, var7);
         int var13 = this.tryThatOne(var1, var5, var3, var12);
         if (var13 <= var4) {
            var9 = var8;
            var11 = var8 - 1;
         } else {
            var10 = var8 + 1;
         }

         if (var10 > var11) {
            if (var9 >= 0) {
               if (var8 != var9) {
                  var12 = this.flattenDistribution(var2, var5, var6, var9, var7);
                  this.tryThatOne(var1, var5, var3, var12);
               }

               return;
            }

            var8 = (255 + var7) / 2;
            var9 = -1;
            var10 = var7;
            var11 = 255;

            while (true) {
               var12 = this.flattenDistribution(var2, var5, var6, var6, var8);
               var13 = this.tryThatOne(var1, var5, var3, var12);
               if (var13 <= var4) {
                  var9 = var8;
                  var11 = var8 - 1;
               } else {
                  var10 = var8 + 1;
               }

               if (var10 > var11) {
                  if (var9 >= 0) {
                     if (var8 != var9) {
                        var12 = this.flattenDistribution(var2, var5, var6, var6, var9);
                        this.tryThatOne(var1, var5, var3, var12);
                     }

                     return;
                  }

                  this.searchGlobalStepsizeMax(var1, var5, var3, var4);
                  return;
               }

               var8 = (var10 + var11) / 2;
            }
         }

         var8 = (var10 + var11) / 2;
      }
   }

   private int reduce_bit_usage(LameInternalFlags var1, int var2, int var3) {
      GrInfo var4 = var1.l3_side.tt[var2][var3];
      this.tak.best_scalefac_store(var1, var2, var3, var1.l3_side);
      if (var1.use_best_huffman == 1) {
         this.tak.best_huffman_divide(var1, var4);
      }

      return var4.part2_3_length + var4.part2_length;
   }

   public int VBR_encode_frame(LameInternalFlags var1, float[][][] var2, float[][][] var3, int[][] var4) {
      int[][][] var5 = new int[2][2][39];
      int[][][] var6 = new int[2][2][39];
      VBRQuantize.algo_t[][] var7 = new VBRQuantize.algo_t[2][2];
      int var8 = var1.mode_gr;
      int var9 = var1.channels_out;
      int[][] var10 = new int[2][2];
      int[] var11 = new int[2];
      int var12 = 0;
      int[][] var13 = new int[2][2];
      int[] var14 = new int[2];
      int var15 = 0;

      for (int var16 = 0; var16 < var8; var16++) {
         var11[var16] = 0;

         for (int var17 = 0; var17 < var9; var17++) {
            var10[var16][var17] = var4[var16][var17];
            var13[var16][var17] = 0;
            var11[var16] += var4[var16][var17];
            var12 += var4[var16][var17];
            var7[var16][var17] = new VBRQuantize.algo_t();
            var7[var16][var17].gfc = var1;
            var7[var16][var17].cod_info = var1.l3_side.tt[var16][var17];
            var7[var16][var17].xr34orig = var2[var16][var17];
            if (var7[var16][var17].cod_info.block_type == 2) {
               var7[var16][var17].alloc = new ShortBlockConstrain(this);
            } else {
               var7[var16][var17].alloc = new LongBlockConstrain(this);
            }
         }
      }

      for (int var24 = 0; var24 < var8; var24++) {
         for (int var31 = 0; var31 < var9; var31++) {
            if (var4[var24][var31] > 0) {
               VBRQuantize.algo_t var18 = var7[var24][var31];
               int[] var19 = var5[var24][var31];
               int[] var20 = var6[var24][var31];
               int var21 = this.block_sf(var18, var3[var24][var31], var19, var20);
               var18.alloc.alloc(var18, var19, var20, var21);
               this.bitcount(var18);
            }
         }
      }

      var15 = 0;

      for (int var25 = 0; var25 < var8; var25++) {
         var14[var25] = 0;

         for (int var32 = 0; var32 < var9; var32++) {
            VBRQuantize.algo_t var38 = var7[var25][var32];
            if (var4[var25][var32] > 0) {
               int var47 = var38.cod_info.max_nonzero_coeff;
               assert var47 < 576;
               Arrays.fill(var38.cod_info.l3_enc, var47, 576, 0);
               this.quantizeAndCountBits(var38);
            }

            var13[var25][var32] = this.reduce_bit_usage(var1, var25, var32);
            var14[var25] += var13[var25][var32];
         }

         var15 += var14[var25];
      }

      if (var15 <= var12) {
         boolean var26 = true;

         for (int var33 = 0; var33 < var8; var33++) {
            if (var14[var33] > 7680) {
               var26 = false;
            }

            for (int var39 = 0; var39 < var9; var39++) {
               if (var13[var33][var39] > 4095) {
                  var26 = false;
               }
            }
         }

         if (var26) {
            return var15;
         }
      }

      boolean var27 = true;
      int var34 = 0;

      for (int var40 = 0; var40 < var8; var40++) {
         var11[var40] = 0;

         for (int var48 = 0; var48 < var9; var48++) {
            if (var13[var40][var48] > 4095) {
               var10[var40][var48] = 4095;
            } else {
               var10[var40][var48] = var13[var40][var48];
            }

            var11[var40] += var10[var40][var48];
         }

         if (var11[var40] > 7680) {
            float[] var49 = new float[2];
            float var55 = 0.0F;

            for (int var61 = 0; var61 < var9; var61++) {
               if (var10[var40][var61] > 0) {
                  var49[var61] = (float)Math.sqrt(Math.sqrt(var10[var40][var61]));
                  var55 += var49[var61];
               } else {
                  var49[var61] = 0.0F;
               }
            }

            for (int var62 = 0; var62 < var9; var62++) {
               if (var55 > 0.0F) {
                  var10[var40][var62] = (int)(7680.0F * var49[var62] / var55);
               } else {
                  var10[var40][var62] = 0;
               }
            }

            if (var9 > 1) {
               if (var10[var40][0] > var13[var40][0] + 32) {
                  var10[var40][1] = var10[var40][1] + var10[var40][0];
                  var10[var40][1] = var10[var40][1] - (var13[var40][0] + 32);
                  var10[var40][0] = var13[var40][0] + 32;
               }

               if (var10[var40][1] > var13[var40][1] + 32) {
                  var10[var40][0] = var10[var40][0] + var10[var40][1];
                  var10[var40][0] = var10[var40][0] - (var13[var40][1] + 32);
                  var10[var40][1] = var13[var40][1] + 32;
               }

               if (var10[var40][0] > 4095) {
                  var10[var40][0] = 4095;
               }

               if (var10[var40][1] > 4095) {
                  var10[var40][1] = 4095;
               }
            }

            var11[var40] = 0;

            for (int var63 = 0; var63 < var9; var63++) {
               var11[var40] += var10[var40][var63];
            }
         }

         var34 += var11[var40];
      }

      if (var34 > var12) {
         float[] var41 = new float[2];
         float var50 = 0.0F;

         for (int var56 = 0; var56 < var8; var56++) {
            if (var11[var56] > 0) {
               var41[var56] = (float)Math.sqrt(var11[var56]);
               var50 += var41[var56];
            } else {
               var41[var56] = 0.0F;
            }
         }

         for (int var57 = 0; var57 < var8; var57++) {
            if (var50 > 0.0F) {
               var11[var57] = (int)(var12 * var41[var57] / var50);
            } else {
               var11[var57] = 0;
            }
         }

         if (var8 > 1) {
            if (var11[0] > var14[0] + 125) {
               var11[1] += var11[0];
               var11[1] -= var14[0] + 125;
               var11[0] = var14[0] + 125;
            }

            if (var11[1] > var14[1] + 125) {
               var11[0] += var11[1];
               var11[0] -= var14[1] + 125;
               var11[1] = var14[1] + 125;
            }

            for (int var42 = 0; var42 < var8; var42++) {
               if (var11[var42] > 7680) {
                  var11[var42] = 7680;
               }
            }
         }

         for (int var43 = 0; var43 < var8; var43++) {
            float[] var51 = new float[2];
            float var58 = 0.0F;

            for (int var64 = 0; var64 < var9; var64++) {
               if (var10[var43][var64] > 0) {
                  var51[var64] = (float)Math.sqrt(var10[var43][var64]);
                  var58 += var51[var64];
               } else {
                  var51[var64] = 0.0F;
               }
            }

            for (int var65 = 0; var65 < var9; var65++) {
               if (var58 > 0.0F) {
                  var10[var43][var65] = (int)(var11[var43] * var51[var65] / var58);
               } else {
                  var10[var43][var65] = 0;
               }
            }

            if (var9 > 1) {
               if (var10[var43][0] > var13[var43][0] + 32) {
                  var10[var43][1] = var10[var43][1] + var10[var43][0];
                  var10[var43][1] = var10[var43][1] - (var13[var43][0] + 32);
                  var10[var43][0] = var13[var43][0] + 32;
               }

               if (var10[var43][1] > var13[var43][1] + 32) {
                  var10[var43][0] = var10[var43][0] + var10[var43][1];
                  var10[var43][0] = var10[var43][0] - (var13[var43][1] + 32);
                  var10[var43][1] = var13[var43][1] + 32;
               }

               for (int var66 = 0; var66 < var9; var66++) {
                  if (var10[var43][var66] > 4095) {
                     var10[var43][var66] = 4095;
                  }
               }
            }
         }
      }

      var34 = 0;

      for (int var44 = 0; var44 < var8; var44++) {
         int var52 = 0;

         for (int var59 = 0; var59 < var9; var59++) {
            var52 += var10[var44][var59];
            if (var10[var44][var59] > 4095) {
               var27 = false;
            }
         }

         var34 += var52;
         if (var52 > 7680) {
            var27 = false;
         }
      }

      if (var34 > var12) {
         var27 = false;
      }

      if (!var27) {
         for (int var45 = 0; var45 < var8; var45++) {
            for (int var53 = 0; var53 < var9; var53++) {
               var10[var45][var53] = var4[var45][var53];
            }
         }
      }

      for (int var28 = 0; var28 < var9; var28++) {
         var1.l3_side.scfsi[var28][0] = 0;
         var1.l3_side.scfsi[var28][1] = 0;
         var1.l3_side.scfsi[var28][2] = 0;
         var1.l3_side.scfsi[var28][3] = 0;
      }

      for (int var29 = 0; var29 < var8; var29++) {
         for (int var36 = 0; var36 < var9; var36++) {
            var1.l3_side.tt[var29][var36].scalefac_compress = 0;
         }
      }

      var15 = 0;

      for (int var30 = 0; var30 < var8; var30++) {
         var14[var30] = 0;

         for (int var37 = 0; var37 < var9; var37++) {
            VBRQuantize.algo_t var46 = var7[var30][var37];
            var13[var30][var37] = 0;
            if (var4[var30][var37] > 0) {
               int[] var54 = var5[var30][var37];
               int[] var60 = var6[var30][var37];
               this.cutDistribution(var54, var54, var46.cod_info.global_gain);
               this.outOfBitsStrategy(var46, var54, var60, var10[var30][var37]);
            }

            var13[var30][var37] = this.reduce_bit_usage(var1, var30, var37);
            assert var13[var30][var37] <= var10[var30][var37];
            var14[var30] += var13[var30][var37];
         }

         var15 += var14[var30];
      }

      if (var15 <= var12) {
         return var15;
      } else {
         throw new RuntimeException(String.format("INTERNAL ERROR IN VBR NEW CODE (1313), please send bug report\nmaxbits=%d usedbits=%d\n", var12, var15));
      }
   }

   protected static class CalcNoiseCache {
      int valid;
      float value;
   }

   protected static class algo_t {
      VBRQuantize.alloc_sf_f alloc;
      float[] xr34orig;
      LameInternalFlags gfc;
      GrInfo cod_info;
      int mingain_l;
      int[] mingain_s = new int[3];
   }

   interface alloc_sf_f {
      void alloc(VBRQuantize.algo_t var1, int[] var2, int[] var3, int var4);
   }
}
