package net.sourceforge.lame.mp3;

import java.util.Arrays;

public class PsyModel {
   public static final float NSATTACKTHRE = 4.4F;
   public static final int NSATTACKTHRE_S = 25;
   private static final float LOG10 = 2.3025851F;
   private static final int rpelev = 2;
   private static final int rpelev2 = 16;
   private static final int rpelev_s = 2;
   private static final int rpelev2_s = 16;
   private static final float DELBARK = 0.34F;
   private static final float VO_SCALE = 8.974871E-12F;
   private static final float temporalmask_sustain_sec = 0.01F;
   private static final float NS_PREECHO_ATT0 = 0.8F;
   private static final float NS_PREECHO_ATT1 = 0.6F;
   private static final float NS_PREECHO_ATT2 = 0.3F;
   private static final float NS_MSFIX = 3.5F;
   private static final int NSFIRLEN = 21;
   private static final float LN_TO_LOG10 = 0.23025851F;
   private static final int I1LIMIT = 8;
   private static final int I2LIMIT = 23;
   private static final int MLIMIT = 15;
   private static final float[] tab = new float[]{1.0F, 0.79433F, 0.63096F, 0.63096F, 0.63096F, 0.63096F, 0.63096F, 0.25119F, 0.11749F};
   private static final float[] table1 = new float[]{
      11.052965F,
      10.48704F,
      9.95005F,
      9.024737F,
      8.185493F,
      7.044087F,
      6.0618873F,
      5.2166557F,
      4.4892707F,
      3.8632689F,
      3.324605F,
      2.861037F,
      2.4621062F,
      2.150857F,
      1.8789283F,
      1.7170432F,
      1.5691069F,
      1.4555941F,
      1.3503137F,
      1.2715945F,
      1.1974487F,
      1.1361427F,
      1.0779837F,
      1.038259F,
      1.0F
   };
   private static final float[] table2 = new float[]{
      1.7782757F, 1.8463104F, 1.916951F, 1.9459414F, 1.9753741F, 1.8325038F, 1.6999466F, 1.4962426F, 1.31694F, 1.0F
   };
   private static final float[] table3 = new float[]{
      5.539622F,
      5.2559686F,
      4.9868693F,
      4.5230656F,
      4.1024475F,
      3.5304155F,
      3.0381534F,
      2.6145275F,
      2.24997F,
      1.9362165F,
      1.6662421F,
      1.4339106F,
      1.2339654F,
      1.0779837F
   };
   private static final float[] table2_ = new float[]{
      1.7782757F, 1.8463104F, 1.916951F, 1.9459414F, 1.9753741F, 1.8325038F, 1.6999466F, 1.4962426F, 1.31694F, 1.0F
   };
   private static final float[] regcoef_s = new float[]{11.8F, 13.6F, 17.2F, 32.0F, 46.5F, 51.3F, 57.5F, 67.1F, 71.5F, 84.6F, 97.6F, 130.0F};
   private static final float[] regcoef_l = new float[]{
      6.8F, 5.8F, 5.8F, 6.4F, 6.5F, 9.9F, 12.1F, 14.4F, 15.0F, 18.9F, 21.6F, 26.9F, 34.2F, 40.2F, 46.8F, 56.5F, 60.7F, 73.9F, 85.7F, 93.4F, 126.1F
   };
   private static final float[] fircoef = new float[]{
      -1.730326E-17F, -0.01703172F, -1.349528E-17F, 0.0418072F, -6.73278E-17F, -0.0876324F, -3.0835E-17F, 0.1863476F, -1.104424E-16F, -0.627638F
   };
   private static final float[] fircoef_ = new float[]{
      -1.730326E-17F, -0.01703172F, -1.349528E-17F, 0.0418072F, -6.73278E-17F, -0.0876324F, -3.0835E-17F, 0.1863476F, -1.104424E-16F, -0.627638F
   };
   private FFT fft = new FFT();
   private float ma_max_i1;
   private float ma_max_i2;
   private float ma_max_m;

   private static final float NON_LINEAR_SCALE_ENERGY(float var0) {
      return var0;
   }

   private float psycho_loudness_approx(float[] var1, LameInternalFlags var2) {
      float var3 = 0.0F;

      for (int var4 = 0; var4 < 512; var4++) {
         var3 += var1[var4] * var2.ATH.eql_w[var4];
      }

      return var3 * 8.974871E-12F;
   }

   private void compute_ffts(
      LameGlobalFlags var1, float[] var2, float[][] var3, float[][] var4, int var5, float[][][] var6, int var7, int var8, int var9, float[][] var10, int var11
   ) {
      LameInternalFlags var12 = var1.internal_flags;
      if (var9 < 2) {
         this.fft.fft_long(var12, var4[var5], var9, var10, var11);
         this.fft.fft_short(var12, var6[var7], var9, var10, var11);
      } else if (var9 == 2) {
         for (int var13 = 1023; var13 >= 0; var13--) {
            float var14 = var4[var5 + 0][var13];
            float var15 = var4[var5 + 1][var13];
            var4[var5 + 0][var13] = (var14 + var15) * 1.4142135F * 0.5F;
            var4[var5 + 1][var13] = (var14 - var15) * 1.4142135F * 0.5F;
         }

         for (int var17 = 2; var17 >= 0; var17--) {
            for (int var22 = 255; var22 >= 0; var22--) {
               float var26 = var6[var7 + 0][var17][var22];
               float var16 = var6[var7 + 1][var17][var22];
               var6[var7 + 0][var17][var22] = (var26 + var16) * 1.4142135F * 0.5F;
               var6[var7 + 1][var17][var22] = (var26 - var16) * 1.4142135F * 0.5F;
            }
         }
      }

      var2[0] = NON_LINEAR_SCALE_ENERGY(var4[var5 + 0][0]);
      var2[0] *= var2[0];

      for (int var18 = 511; var18 >= 0; var18--) {
         float var23 = var4[var5 + 0][512 - var18];
         float var27 = var4[var5 + 0][512 + var18];
         var2[512 - var18] = NON_LINEAR_SCALE_ENERGY((var23 * var23 + var27 * var27) * 0.5F);
      }

      for (int var19 = 2; var19 >= 0; var19--) {
         var3[var19][0] = var6[var7 + 0][var19][0];
         var3[var19][0] = var3[var19][0] * var3[var19][0];

         for (int var24 = 127; var24 >= 0; var24--) {
            float var28 = var6[var7 + 0][var19][128 - var24];
            float var29 = var6[var7 + 0][var19][128 + var24];
            var3[var19][128 - var24] = NON_LINEAR_SCALE_ENERGY((var28 * var28 + var29 * var29) * 0.5F);
         }
      }

      float var20 = 0.0F;

      for (int var25 = 11; var25 < 513; var25++) {
         var20 += var2[var25];
      }

      var12.tot_ener[var9] = var20;
      if (var1.analysis) {
         for (int var21 = 0; var21 < 513; var21++) {
            var12.pinfo.energy[var8][var9][var21] = var12.pinfo.energy_save[var9][var21];
            var12.pinfo.energy_save[var9][var21] = var2[var21];
         }

         var12.pinfo.pe[var8][var9] = var12.pe[var9];
      }

      if (var1.athaa_loudapprox == 2 && var9 < 2) {
         var12.loudness_sq[var8][var9] = var12.loudness_sq_save[var9];
         var12.loudness_sq_save[var9] = this.psycho_loudness_approx(var2, var12);
      }
   }

   private void init_mask_add_max_values() {
      this.ma_max_i1 = (float)Math.pow(10.0, 0.5625);
      this.ma_max_i2 = (float)Math.pow(10.0, 1.5);
      this.ma_max_m = (float)Math.pow(10.0, 1.5);
   }

   private float mask_add(float var1, float var2, int var3, int var4, LameInternalFlags var5, int var6) {
      float var7;
      if (var2 > var1) {
         if (!(var2 < var1 * this.ma_max_i2)) {
            return var1 + var2;
         }

         var7 = var2 / var1;
      } else {
         if (var1 >= var2 * this.ma_max_i2) {
            return var1 + var2;
         }

         var7 = var1 / var2;
      }

      assert var1 >= 0.0F;
      assert var2 >= 0.0F;
      var1 += var2;
      if ((var4 + 3 & 4294967295L) <= 6L) {
         if (var7 >= this.ma_max_i1) {
            return var1;
         }

         int var13 = (int)Util.FAST_LOG10_X(var7, 16.0F);
         return var1 * table2[var13];
      } else {
         int var8 = (int)Util.FAST_LOG10_X(var7, 16.0F);
         if (var6 != 0) {
            var2 = var5.ATH.cb_s[var3] * var5.ATH.adjust;
         } else {
            var2 = var5.ATH.cb_l[var3] * var5.ATH.adjust;
         }

         assert var2 >= 0.0F;
         if (var1 < this.ma_max_m * var2) {
            if (var1 > var2) {
               float var9 = 1.0F;
               if (var8 <= 13) {
                  var9 = table3[var8];
               }

               float var10 = Util.FAST_LOG10_X(var1 / var2, 0.6666667F);
               return var1 * ((table1[var8] - var9) * var10 + var9);
            } else {
               return var8 > 13 ? var1 : var1 * table3[var8];
            }
         } else {
            return var1 * table1[var8];
         }
      }
   }

   private float vbrpsy_mask_add(float var1, float var2, int var3) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var1 <= 0.0F) {
         return var2;
      }

      if (var2 <= 0.0F) {
         return var1;
      }

      float var4;
      if (var2 > var1) {
         var4 = var2 / var1;
      } else {
         var4 = var1 / var2;
      }

      if (-2 <= var3 && var3 <= 2) {
         if (var4 >= this.ma_max_i1) {
            return var1 + var2;
         }

         int var5 = (int)Util.FAST_LOG10_X(var4, 16.0F);
         return (var1 + var2) * table2_[var5];
      } else {
         if (var4 < this.ma_max_i2) {
            return var1 + var2;
         }

         if (var1 < var2) {
            var1 = var2;
         }

         return var1;
      }
   }

   private void calc_interchannel_masking(LameGlobalFlags var1, float var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var3.channels_out > 1) {
         for (int var4 = 0; var4 < 22; var4++) {
            float var5 = var3.thm[0].l[var4];
            float var6 = var3.thm[1].l[var4];
            var3.thm[0].l[var4] = var3.thm[0].l[var4] + var6 * var2;
            var3.thm[1].l[var4] = var3.thm[1].l[var4] + var5 * var2;
         }

         for (int var8 = 0; var8 < 13; var8++) {
            for (int var9 = 0; var9 < 3; var9++) {
               float var10 = var3.thm[0].s[var8][var9];
               float var7 = var3.thm[1].s[var8][var9];
               var3.thm[0].s[var8][var9] = var3.thm[0].s[var8][var9] + var7 * var2;
               var3.thm[1].s[var8][var9] = var3.thm[1].s[var8][var9] + var10 * var2;
            }
         }
      }
   }

   private void msfix1(LameInternalFlags var1) {
      for (int var2 = 0; var2 < 22; var2++) {
         if (!(var1.thm[0].l[var2] > 1.58 * var1.thm[1].l[var2]) && !(var1.thm[1].l[var2] > 1.58 * var1.thm[0].l[var2])) {
            float var3 = var1.mld_l[var2] * var1.en[3].l[var2];
            float var4 = Math.max(var1.thm[2].l[var2], Math.min(var1.thm[3].l[var2], var3));
            var3 = var1.mld_l[var2] * var1.en[2].l[var2];
            float var5 = Math.max(var1.thm[3].l[var2], Math.min(var1.thm[2].l[var2], var3));
            var1.thm[2].l[var2] = var4;
            var1.thm[3].l[var2] = var5;
         }
      }

      for (int var7 = 0; var7 < 13; var7++) {
         for (int var9 = 0; var9 < 3; var9++) {
            if (!(var1.thm[0].s[var7][var9] > 1.58 * var1.thm[1].s[var7][var9]) && !(var1.thm[1].s[var7][var9] > 1.58 * var1.thm[0].s[var7][var9])) {
               float var10 = var1.mld_s[var7] * var1.en[3].s[var7][var9];
               float var12 = Math.max(var1.thm[2].s[var7][var9], Math.min(var1.thm[3].s[var7][var9], var10));
               var10 = var1.mld_s[var7] * var1.en[2].s[var7][var9];
               float var6 = Math.max(var1.thm[3].s[var7][var9], Math.min(var1.thm[2].s[var7][var9], var10));
               var1.thm[2].s[var7][var9] = var12;
               var1.thm[3].s[var7][var9] = var6;
            }
         }
      }
   }

   private void ns_msfix(LameInternalFlags var1, float var2, float var3) {
      float var4 = var2;
      float var5 = (float)Math.pow(10.0, var3);
      var2 *= 2.0F;
      var4 *= 2.0F;

      for (int var6 = 0; var6 < 22; var6++) {
         float var10 = var1.ATH.cb_l[var1.bm_l[var6]] * var5;
         float var7 = Math.min(Math.max(var1.thm[0].l[var6], var10), Math.max(var1.thm[1].l[var6], var10));
         float var8 = Math.max(var1.thm[2].l[var6], var10);
         float var9 = Math.max(var1.thm[3].l[var6], var10);
         if (var7 * var2 < var8 + var9) {
            float var11 = var7 * var4 / (var8 + var9);
            var8 *= var11;
            var9 *= var11;
            assert var8 + var9 > 0.0F;
         }

         var1.thm[2].l[var6] = Math.min(var8, var1.thm[2].l[var6]);
         var1.thm[3].l[var6] = Math.min(var9, var1.thm[3].l[var6]);
      }

      var5 *= 0.25F;

      for (int var16 = 0; var16 < 13; var16++) {
         for (int var17 = 0; var17 < 3; var17++) {
            float var21 = var1.ATH.cb_s[var1.bm_s[var16]] * var5;
            float var18 = Math.min(Math.max(var1.thm[0].s[var16][var17], var21), Math.max(var1.thm[1].s[var16][var17], var21));
            float var19 = Math.max(var1.thm[2].s[var16][var17], var21);
            float var20 = Math.max(var1.thm[3].s[var16][var17], var21);
            if (var18 * var2 < var19 + var20) {
               float var12 = var18 * var2 / (var19 + var20);
               var19 *= var12;
               var20 *= var12;
               assert var19 + var20 > 0.0F;
            }

            var1.thm[2].s[var16][var17] = Math.min(var1.thm[2].s[var16][var17], var19);
            var1.thm[3].s[var16][var17] = Math.min(var1.thm[3].s[var16][var17], var20);
         }
      }
   }

   private void convert_partition2scalefac_s(LameInternalFlags var1, float[] var2, float[] var3, int var4, int var5) {
      float var8 = 0.0F;
      float var9 = 0.0F;
      int var7 = 0;

      int var6;
      for (var6 = 0; var6 < 13; var6++) {
         int var10 = var1.bo_s[var6];
         int var11 = var1.npart_s;

         for (int var12 = var10 < var11 ? var10 : var11; var7 < var12; var7++) {
            assert var2[var7] >= 0.0F;
            assert var3[var7] >= 0.0F;
            var8 += var2[var7];
            var9 += var3[var7];
         }

         var1.en[var4].s[var6][var5] = var8;
         var1.thm[var4].s[var6][var5] = var9;
         if (var7 >= var11) {
            var6++;
            break;
         }

         assert var2[var7] >= 0.0F;
         assert var3[var7] >= 0.0F;
         float var13 = var1.PSY.bo_s_weight[var6];
         float var14 = 1.0F - var13;
         var8 = var13 * var2[var7];
         var9 = var13 * var3[var7];
         var1.en[var4].s[var6][var5] = var1.en[var4].s[var6][var5] + var8;
         var1.thm[var4].s[var6][var5] = var1.thm[var4].s[var6][var5] + var9;
         var8 = var14 * var2[var7];
         var9 = var14 * var3[var7];
         var7++;
      }

      while (var6 < 13) {
         var1.en[var4].s[var6][var5] = 0.0F;
         var1.thm[var4].s[var6][var5] = 0.0F;
         var6++;
      }
   }

   private void convert_partition2scalefac_l(LameInternalFlags var1, float[] var2, float[] var3, int var4) {
      float var7 = 0.0F;
      float var8 = 0.0F;
      int var6 = 0;

      int var5;
      for (var5 = 0; var5 < 22; var5++) {
         int var9 = var1.bo_l[var5];
         int var10 = var1.npart_l;

         for (int var11 = var9 < var10 ? var9 : var10; var6 < var11; var6++) {
            assert var2[var6] >= 0.0F;
            assert var3[var6] >= 0.0F;
            var7 += var2[var6];
            var8 += var3[var6];
         }

         var1.en[var4].l[var5] = var7;
         var1.thm[var4].l[var5] = var8;
         if (var6 >= var10) {
            var5++;
            break;
         }

         assert var2[var6] >= 0.0F;
         assert var3[var6] >= 0.0F;
         float var12 = var1.PSY.bo_l_weight[var5];
         float var13 = 1.0F - var12;
         var7 = var12 * var2[var6];
         var8 = var12 * var3[var6];
         var1.en[var4].l[var5] = var1.en[var4].l[var5] + var7;
         var1.thm[var4].l[var5] = var1.thm[var4].l[var5] + var8;
         var7 = var13 * var2[var6];
         var8 = var13 * var3[var6];
         var6++;
      }

      while (var5 < 22) {
         var1.en[var4].l[var5] = 0.0F;
         var1.thm[var4].l[var5] = 0.0F;
         var5++;
      }
   }

   private void compute_masking_s(LameGlobalFlags var1, float[][] var2, float[] var3, float[] var4, int var5, int var6) {
      LameInternalFlags var7 = var1.internal_flags;
      int var8 = 0;

      int var9;
      for (var9 = 0; var9 < var7.npart_s; var9++) {
         float var10 = 0.0F;
         float var11 = 0.0F;
         int var12 = var7.numlines_s[var9];

         for (int var13 = 0; var13 < var12; var8++) {
            float var14 = var2[var6][var8];
            var10 += var14;
            if (var11 < var14) {
               var11 = var14;
            }

            var13++;
         }

         var3[var9] = var10;
      }

      assert var9 == var7.npart_s;
      assert var8 == 129;
      var9 = 0;
      var8 = 0;

      while (var9 < var7.npart_s) {
         int var17 = var7.s3ind_s[var9][0];
         float var19 = var7.s3_ss[var8++] * var3[var17];
         var17++;

         while (var17 <= var7.s3ind_s[var9][1]) {
            var19 += var7.s3_ss[var8] * var3[var17];
            var8++;
            var17++;
         }

         float var20 = 2.0F * var7.nb_s1[var5][var9];
         var4[var9] = Math.min(var19, var20);
         if (var7.blocktype_old[var5 & 1] == 2) {
            var20 = 16.0F * var7.nb_s2[var5][var9];
            float var22 = var4[var9];
            var4[var9] = Math.min(var20, var22);
         }

         var7.nb_s2[var5][var9] = var7.nb_s1[var5][var9];
         var7.nb_s1[var5][var9] = var19;
         assert var4[var9] >= 0.0F;
         var9++;
      }

      while (var9 <= 64) {
         var3[var9] = 0.0F;
         var4[var9] = 0.0F;
         var9++;
      }
   }

   private void block_type_set(LameGlobalFlags var1, int[] var2, int[] var3, int[] var4) {
      LameInternalFlags var5 = var1.internal_flags;
      if (var1.short_blocks == ShortBlock.short_block_coupled && (var2[0] == 0 || var2[1] == 0)) {
         var2[0] = var2[1] = 0;
      }

      for (int var6 = 0; var6 < var5.channels_out; var6++) {
         var4[var6] = 0;
         if (var1.short_blocks == ShortBlock.short_block_dispensed) {
            var2[var6] = 1;
         }

         if (var1.short_blocks == ShortBlock.short_block_forced) {
            var2[var6] = 0;
         }

         if (var2[var6] != 0) {
            assert var5.blocktype_old[var6] != 1;
            if (var5.blocktype_old[var6] == 2) {
               var4[var6] = 3;
            }
         } else {
            var4[var6] = 2;
            if (var5.blocktype_old[var6] == 0) {
               var5.blocktype_old[var6] = 1;
            }

            if (var5.blocktype_old[var6] == 3) {
               var5.blocktype_old[var6] = 2;
            }
         }

         var3[var6] = var5.blocktype_old[var6];
         var5.blocktype_old[var6] = var4[var6];
      }
   }

   private float NS_INTERP(float var1, float var2, float var3) {
      if (var3 >= 1.0) {
         return var1;
      } else if (var3 <= 0.0) {
         return var2;
      } else {
         return var2 > 0.0 ? (float)(Math.pow(var1 / var2, var3) * var2) : 0.0F;
      }
   }

   private float pecalc_s(III_psy_ratio var1, float var2) {
      float var3 = 309.07F;

      for (int var4 = 0; var4 < 12; var4++) {
         for (int var5 = 0; var5 < 3; var5++) {
            float var6 = var1.thm.s[var4][var5];
            assert var4 < regcoef_s.length;
            if (var6 > 0.0) {
               float var7 = var6 * var2;
               float var8 = var1.en.s[var4][var5];
               if (var8 > var7) {
                  if (var8 > var7 * 1.0E10) {
                     var3 += regcoef_s[var4] * 23.025852F;
                  } else {
                     assert var7 > 0.0F;
                     var3 += regcoef_s[var4] * Util.FAST_LOG10(var8 / var7);
                  }
               }
            }
         }
      }

      return var3;
   }

   private float pecalc_l(III_psy_ratio var1, float var2) {
      float var3 = 281.0575F;

      for (int var4 = 0; var4 < 21; var4++) {
         float var5 = var1.thm.l[var4];
         assert var4 < regcoef_l.length;
         if (var5 > 0.0) {
            float var6 = var5 * var2;
            float var7 = var1.en.l[var4];
            if (var7 > var6) {
               if (var7 > var6 * 1.0E10) {
                  var3 += regcoef_l[var4] * 23.025852F;
               } else {
                  assert var6 > 0.0F;
                  var3 += regcoef_l[var4] * Util.FAST_LOG10(var7 / var6);
               }
            }
         }
      }

      return var3;
   }

   private void calc_energy(LameInternalFlags var1, float[] var2, float[] var3, float[] var4, float[] var5) {
      int var7 = 0;

      for (int var6 = 0; var6 < var1.npart_l; var6++) {
         float var8 = 0.0F;
         float var9 = 0.0F;

         for (int var10 = 0; var10 < var1.numlines_l[var6]; var7++) {
            float var11 = var2[var7];
            assert var11 >= 0.0F;
            var8 += var11;
            if (var9 < var11) {
               var9 = var11;
            }

            var10++;
         }

         var3[var6] = var8;
         var4[var6] = var9;
         var5[var6] = var8 * var1.rnumlines_l[var6];
         assert var1.rnumlines_l[var6] >= 0.0F;
         assert var8 >= 0.0F;
         assert var3[var6] >= 0.0F;
         assert var4[var6] >= 0.0F;
         assert var5[var6] >= 0.0F;
      }
   }

   private void calc_mask_index_l(LameInternalFlags var1, float[] var2, float[] var3, int[] var4) {
      int var5 = tab.length - 1;
      int var6 = 0;
      float var7 = var3[var6] + var3[var6 + 1];
      assert var7 >= 0.0F;
      if (var7 > 0.0) {
         float var8 = var2[var6];
         if (var8 < var2[var6 + 1]) {
            var8 = var2[var6 + 1];
         }

         assert var1.numlines_l[var6] + var1.numlines_l[var6 + 1] - 1 > 0;
         var7 = 20.0F * (var8 * 2.0F - var7) / (var7 * (var1.numlines_l[var6] + var1.numlines_l[var6 + 1] - 1));
         int var9 = (int)var7;
         if (var9 > var5) {
            var9 = var5;
         }

         var4[var6] = var9;
      } else {
         var4[var6] = 0;
      }

      for (var6 = 1; var6 < var1.npart_l - 1; var6++) {
         var7 = var3[var6 - 1] + var3[var6] + var3[var6 + 1];
         assert var7 >= 0.0F;
         if (var7 > 0.0) {
            float var16 = var2[var6 - 1];
            if (var16 < var2[var6]) {
               var16 = var2[var6];
            }

            if (var16 < var2[var6 + 1]) {
               var16 = var2[var6 + 1];
            }

            assert var1.numlines_l[var6 - 1] + var1.numlines_l[var6] + var1.numlines_l[var6 + 1] - 1 > 0;
            var7 = 20.0F * (var16 * 3.0F - var7) / (var7 * (var1.numlines_l[var6 - 1] + var1.numlines_l[var6] + var1.numlines_l[var6 + 1] - 1));
            int var18 = (int)var7;
            if (var18 > var5) {
               var18 = var5;
            }

            var4[var6] = var18;
         } else {
            var4[var6] = 0;
         }
      }

      assert var6 > 0;
      assert var6 == var1.npart_l - 1;
      var7 = var3[var6 - 1] + var3[var6];
      assert var7 >= 0.0F;
      if (var7 > 0.0) {
         float var17 = var2[var6 - 1];
         if (var17 < var2[var6]) {
            var17 = var2[var6];
         }

         assert var1.numlines_l[var6 - 1] + var1.numlines_l[var6] - 1 > 0;
         var7 = 20.0F * (var17 * 2.0F - var7) / (var7 * (var1.numlines_l[var6 - 1] + var1.numlines_l[var6] - 1));
         int var19 = (int)var7;
         if (var19 > var5) {
            var19 = var5;
         }

         var4[var6] = var19;
      } else {
         var4[var6] = 0;
      }

      assert var6 == var1.npart_l - 1;
   }

   public final int L3psycho_anal_ns(
      LameGlobalFlags var1,
      float[][] var2,
      int var3,
      int var4,
      III_psy_ratio[][] var5,
      III_psy_ratio[][] var6,
      float[] var7,
      float[] var8,
      float[] var9,
      int[] var10
   ) {
      LameInternalFlags var11 = var1.internal_flags;
      float[][] var12 = new float[2][1024];
      float[][][] var13 = new float[2][3][256];
      float[] var14 = new float[65];
      float[] var15 = new float[65];
      float[] var16 = new float[66];
      int[] var17 = new int[2];
      int[] var18 = new int[2];
      float[][] var27 = new float[2][576];
      int[] var29 = new int[66];
      int[] var30 = new int[66];
      Arrays.fill(var30, 0);
      int var19 = var11.channels_out;
      if (var1.getMode() == MPEGMode.JOINT_STEREO) {
         var19 = 4;
      }

      float var28;
      if (var1.getVBR() == VbrMode.vbr_off) {
         var28 = var11.ResvMax == 0 ? 0.0F : (float)var11.ResvSize / var11.ResvMax * 0.5F;
      } else if (var1.getVBR() != VbrMode.vbr_rh && var1.getVBR() != VbrMode.vbr_mtrh && var1.getVBR() != VbrMode.vbr_mt) {
         var28 = 1.0F;
      } else {
         var28 = 0.6F;
      }

      for (int var20 = 0; var20 < var11.channels_out; var20++) {
         float[] var31 = var2[var20];
         int var32 = var3 + 576 - 350 - 21 + 192;
         assert fircoef.length == 10;

         for (int var22 = 0; var22 < 576; var22++) {
            float var33 = var31[var32 + var22 + 10];
            float var34 = 0.0F;

            for (byte var23 = 0; var23 < 9; var23 += 2) {
               var33 += fircoef[var23] * (var31[var32 + var22 + var23] + var31[var32 + var22 + 21 - var23]);
               var34 += fircoef[var23 + 1] * (var31[var32 + var22 + var23 + 1] + var31[var32 + var22 + 21 - var23 - 1]);
            }

            var27[var20][var22] = var33 + var34;
         }

         var5[var4][var20].en.assign(var11.en[var20]);
         var5[var4][var20].thm.assign(var11.thm[var20]);
         if (var19 > 2) {
            var6[var4][var20].en.assign(var11.en[var20 + 2]);
            var6[var4][var20].thm.assign(var11.thm[var20 + 2]);
         }
      }

      for (int var48 = 0; var48 < var19; var48++) {
         float[] var62 = new float[12];
         float[] var64 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
         float[] var35 = new float[12];
         byte var36 = 1;
         float[] var38 = new float[64];
         float[] var39 = new float[64];
         int[] var40 = new int[]{0, 0, 0, 0};
         float[] var41 = new float[513];
         float[][] var42 = new float[3][129];
         assert var11.npart_s <= 64;
         assert var11.npart_l <= 64;

         for (int var50 = 0; var50 < 3; var50++) {
            var62[var50] = var11.nsPsy.last_en_subshort[var48][var50 + 6];
            assert var11.nsPsy.last_en_subshort[var48][var50 + 4] > 0.0F;
            var35[var50] = var62[var50] / var11.nsPsy.last_en_subshort[var48][var50 + 4];
            var64[0] += var62[var50];
         }

         if (var48 == 2) {
            for (int var51 = 0; var51 < 576; var51++) {
               float var43 = var27[0][var51];
               float var44 = var27[1][var51];
               var27[0][var51] = var43 + var44;
               var27[1][var51] = var43 - var44;
            }
         }

         float[] var66 = var27[var48 & 1];
         int var71 = 0;

         for (int var52 = 0; var52 < 9; var52++) {
            int var45 = var71 + 64;
            float var46 = 1.0F;

            while (var71 < var45) {
               if (var46 < Math.abs(var66[var71])) {
                  var46 = Math.abs(var66[var71]);
               }

               var71++;
            }

            var11.nsPsy.last_en_subshort[var48][var52] = var62[var52 + 3] = var46;
            var64[1 + var52 / 3] = var64[1 + var52 / 3] + var46;
            if (var46 > var62[var52 + 3 - 2]) {
               assert var62[var52 + 3 - 2] > 0.0F;
               var46 /= var62[var52 + 3 - 2];
            } else if (var62[var52 + 3 - 2] > var46 * 10.0F) {
               assert var46 > 0.0F;
               var46 = var62[var52 + 3 - 2] / (var46 * 10.0F);
            } else {
               var46 = 0.0F;
            }

            var35[var52 + 3] = var46;
         }

         if (var1.analysis) {
            float var67 = var35[0];

            for (int var53 = 1; var53 < 12; var53++) {
               if (var67 < var35[var53]) {
                  var67 = var35[var53];
               }
            }

            var11.pinfo.ers[var4][var48] = var11.pinfo.ers_save[var48];
            var11.pinfo.ers_save[var48] = var67;
         }

         float var37 = var48 == 3 ? var11.nsPsy.attackthre_s : var11.nsPsy.attackthre;

         for (int var54 = 0; var54 < 12; var54++) {
            if (0 == var40[var54 / 3] && var35[var54] > var37) {
               var40[var54 / 3] = var54 % 3 + 1;
            }
         }

         for (int var55 = 1; var55 < 4; var55++) {
            float var68;
            if (var64[var55 - 1] > var64[var55]) {
               assert var64[var55] > 0.0F;
               var68 = var64[var55 - 1] / var64[var55];
            } else {
               assert var64[var55 - 1] > 0.0F;
               var68 = var64[var55] / var64[var55 - 1];
            }

            if (var68 < 1.7) {
               var40[var55] = 0;
               if (var55 == 1) {
                  var40[0] = 0;
               }
            }
         }

         if (var40[0] != 0 && var11.nsPsy.lastAttacks[var48] != 0) {
            var40[0] = 0;
         }

         if (var11.nsPsy.lastAttacks[var48] == 3 || var40[0] + var40[1] + var40[2] + var40[3] != 0) {
            var36 = 0;
            if (var40[1] != 0 && var40[0] != 0) {
               var40[1] = 0;
            }

            if (var40[2] != 0 && var40[1] != 0) {
               var40[2] = 0;
            }

            if (var40[3] != 0 && var40[2] != 0) {
               var40[3] = 0;
            }
         }

         if (var48 < 2) {
            var18[var48] = var36;
         } else if (var36 == 0) {
            var18[0] = var18[1] = 0;
         }

         var9[var48] = var11.tot_ener[var48];
         float[][][] var59 = var13;
         float[][] var56 = var12;
         this.compute_ffts(var1, var41, var42, var56, var48 & 1, var59, var48 & 1, var4, var48, var2, var3);
         this.calc_energy(var11, var41, var14, var38, var39);
         this.calc_mask_index_l(var11, var38, var39, var29);

         for (int var26 = 0; var26 < 3; var26++) {
            this.compute_masking_s(var1, var42, var15, var16, var48, var26);
            this.convert_partition2scalefac_s(var11, var15, var16, var48, var26);

            for (int var25 = 0; var25 < 13; var25++) {
               float var72 = var11.thm[var48].s[var25][var26];
               float var73 = var72 * 0.8F;
               if (var40[var26] >= 2 || var40[var26 + 1] == 1) {
                  int var76 = var26 != 0 ? var26 - 1 : 2;
                  double var82 = this.NS_INTERP(var11.thm[var48].s[var25][var76], var73, 0.6F * var28);
                  var73 = (float)Math.min(var73, var82);
               }

               if (var40[var26] == 1) {
                  int var77 = var26 != 0 ? var26 - 1 : 2;
                  double var83 = this.NS_INTERP(var11.thm[var48].s[var25][var77], var73, 0.3F * var28);
                  var73 = (float)Math.min(var73, var83);
               } else if (var26 != 0 && var40[var26 - 1] == 3 || var26 == 0 && var11.nsPsy.lastAttacks[var48] == 3) {
                  int var78 = var26 != 2 ? var26 + 1 : 0;
                  double var84 = this.NS_INTERP(var11.thm[var48].s[var25][var78], var73, 0.3F * var28);
                  var73 = (float)Math.min(var73, var84);
               }

               float var69 = var62[var26 * 3 + 3] + var62[var26 * 3 + 4] + var62[var26 * 3 + 5];
               if (var62[var26 * 3 + 5] * 6.0F < var69) {
                  var73 = (float)(var73 * 0.5);
                  if (var62[var26 * 3 + 4] * 6.0F < var69) {
                     var73 = (float)(var73 * 0.5);
                  }
               }

               var11.thm[var48].s[var25][var26] = var73;
            }
         }

         var11.nsPsy.lastAttacks[var48] = var40[2];
         int var24 = 0;

         int var21;
         for (var21 = 0; var21 < var11.npart_l; var21++) {
            int var70 = var11.s3ind[var21][0];
            float var74 = var14[var70] * tab[var29[var70]];
            float var79 = var11.s3_ll[var24++] * var74;

            while (++var70 <= var11.s3ind[var21][1]) {
               float var75 = var14[var70] * tab[var29[var70]];
               var79 = this.mask_add(var79, var11.s3_ll[var24++] * var75, var70, var70 - var21, var11, 0);
            }

            var79 = (float)(var79 * 0.158489319246111);
            if (var11.blocktype_old[var48 & 1] == 2) {
               var16[var21] = var79;
            } else {
               var16[var21] = this.NS_INTERP(Math.min(var79, Math.min(2.0F * var11.nb_1[var48][var21], 16.0F * var11.nb_2[var48][var21])), var79, var28);
            }

            var11.nb_2[var48][var21] = var11.nb_1[var48][var21];
            var11.nb_1[var48][var21] = var79;
         }

         while (var21 <= 64) {
            var14[var21] = 0.0F;
            var16[var21] = 0.0F;
            var21++;
         }

         this.convert_partition2scalefac_l(var11, var14, var16, var48);
      }

      if ((var1.getMode() == MPEGMode.STEREO || var1.getMode() == MPEGMode.JOINT_STEREO) && var1.interChRatio > 0.0) {
         this.calc_interchannel_masking(var1, var1.interChRatio);
      }

      if (var1.getMode() == MPEGMode.JOINT_STEREO) {
         this.msfix1(var11);
         float var57 = var1.msfix;
         if (Math.abs(var57) > 0.0) {
            this.ns_msfix(var11, var57, var1.ATHlower * var11.ATH.adjust);
         }
      }

      this.block_type_set(var1, var18, var10, var17);

      for (int var49 = 0; var49 < var19; var49++) {
         byte var60 = 0;
         float[] var58;
         int var63;
         III_psy_ratio var65;
         if (var49 > 1) {
            var58 = var8;
            var60 = -2;
            var63 = 0;
            if (var10[0] == 2 || var10[1] == 2) {
               var63 = 2;
            }

            var65 = var6[var4][var49 - 2];
         } else {
            var58 = var7;
            var60 = 0;
            var63 = var10[var49];
            var65 = var5[var4][var49];
         }

         if (var63 == 2) {
            var58[var60 + var49] = this.pecalc_s(var65, var11.masking_lower);
         } else {
            var58[var60 + var49] = this.pecalc_l(var65, var11.masking_lower);
         }

         if (var1.analysis) {
            var11.pinfo.pe[var4][var49] = var58[var60 + var49];
         }
      }

      return 0;
   }

   private void vbrpsy_compute_fft_l(LameGlobalFlags var1, float[][] var2, int var3, int var4, int var5, float[] var6, float[][] var7, int var8) {
      LameInternalFlags var9 = var1.internal_flags;
      if (var4 < 2) {
         this.fft.fft_long(var9, var7[var8], var4, var2, var3);
      } else if (var4 == 2) {
         for (int var10 = 1023; var10 >= 0; var10--) {
            float var11 = var7[var8 + 0][var10];
            float var12 = var7[var8 + 1][var10];
            var7[var8 + 0][var10] = (var11 + var12) * 1.4142135F * 0.5F;
            var7[var8 + 1][var10] = (var11 - var12) * 1.4142135F * 0.5F;
         }
      }

      var6[0] = NON_LINEAR_SCALE_ENERGY(var7[var8 + 0][0]);
      var6[0] *= var6[0];

      for (int var13 = 511; var13 >= 0; var13--) {
         float var16 = var7[var8 + 0][512 - var13];
         float var18 = var7[var8 + 0][512 + var13];
         var6[512 - var13] = NON_LINEAR_SCALE_ENERGY((var16 * var16 + var18 * var18) * 0.5F);
      }

      float var14 = 0.0F;

      for (int var17 = 11; var17 < 513; var17++) {
         var14 += var6[var17];
      }

      var9.tot_ener[var4] = var14;
      if (var1.analysis) {
         for (int var15 = 0; var15 < 513; var15++) {
            var9.pinfo.energy[var5][var4][var15] = var9.pinfo.energy_save[var4][var15];
            var9.pinfo.energy_save[var4][var15] = var6[var15];
         }

         var9.pinfo.pe[var5][var4] = var9.pe[var4];
      }
   }

   private void vbrpsy_compute_fft_s(LameGlobalFlags var1, float[][] var2, int var3, int var4, int var5, float[][] var6, float[][][] var7, int var8) {
      LameInternalFlags var9 = var1.internal_flags;
      if (var5 == 0 && var4 < 2) {
         this.fft.fft_short(var9, var7[var8], var4, var2, var3);
      }

      if (var4 == 2) {
         for (int var10 = 255; var10 >= 0; var10--) {
            float var11 = var7[var8 + 0][var5][var10];
            float var12 = var7[var8 + 1][var5][var10];
            var7[var8 + 0][var5][var10] = (var11 + var12) * 1.4142135F * 0.5F;
            var7[var8 + 1][var5][var10] = (var11 - var12) * 1.4142135F * 0.5F;
         }
      }

      var6[var5][0] = var7[var8 + 0][var5][0];
      var6[var5][0] = var6[var5][0] * var6[var5][0];

      for (int var13 = 127; var13 >= 0; var13--) {
         float var14 = var7[var8 + 0][var5][128 - var13];
         float var15 = var7[var8 + 0][var5][128 + var13];
         var6[var5][128 - var13] = NON_LINEAR_SCALE_ENERGY((var14 * var14 + var15 * var15) * 0.5F);
      }
   }

   private void vbrpsy_compute_loudness_approximation_l(LameGlobalFlags var1, int var2, int var3, float[] var4) {
      LameInternalFlags var5 = var1.internal_flags;
      if (var1.athaa_loudapprox == 2 && var3 < 2) {
         var5.loudness_sq[var2][var3] = var5.loudness_sq_save[var3];
         var5.loudness_sq_save[var3] = this.psycho_loudness_approx(var4, var5);
      }
   }

   private void vbrpsy_attack_detection(
      LameGlobalFlags var1,
      float[][] var2,
      int var3,
      int var4,
      III_psy_ratio[][] var5,
      III_psy_ratio[][] var6,
      float[] var7,
      float[][] var8,
      int[][] var9,
      int[] var10
   ) {
      float[][] var11 = new float[2][576];
      LameInternalFlags var12 = var1.internal_flags;
      int var13 = var12.channels_out;
      int var14 = var1.getMode() == MPEGMode.JOINT_STEREO ? 4 : var13;

      for (int var15 = 0; var15 < var13; var15++) {
         float[] var16 = var2[var15];
         int var17 = var3 + 576 - 350 - 21 + 192;
         assert fircoef_.length == 10;

         for (int var18 = 0; var18 < 576; var18++) {
            float var19 = var16[var17 + var18 + 10];
            float var20 = 0.0F;

            for (byte var21 = 0; var21 < 9; var21 += 2) {
               var19 += fircoef_[var21] * (var16[var17 + var18 + var21] + var16[var17 + var18 + 21 - var21]);
               var20 += fircoef_[var21 + 1] * (var16[var17 + var18 + var21 + 1] + var16[var17 + var18 + 21 - var21 - 1]);
            }

            var11[var15][var18] = var19 + var20;
         }

         var5[var4][var15].en.assign(var12.en[var15]);
         var5[var4][var15].thm.assign(var12.thm[var15]);
         if (var14 > 2) {
            var6[var4][var15].en.assign(var12.en[var15 + 2]);
            var6[var4][var15].thm.assign(var12.thm[var15 + 2]);
         }
      }

      for (int var27 = 0; var27 < var14; var27++) {
         float[] var28 = new float[12];
         float[] var29 = new float[12];
         float[] var30 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
         float[] var31 = var11[var27 & 1];
         int var32 = 0;
         float var33 = var27 == 3 ? var12.nsPsy.attackthre_s : var12.nsPsy.attackthre;
         byte var22 = 1;
         if (var27 == 2) {
            int var23 = 0;

            for (int var24 = 576; var24 > 0; var24--) {
               float var25 = var11[0][var23];
               float var26 = var11[1][var23];
               var11[0][var23] = var25 + var26;
               var11[1][var23] = var25 - var26;
               var23++;
            }
         }

         for (int var34 = 0; var34 < 3; var34++) {
            var29[var34] = var12.nsPsy.last_en_subshort[var27][var34 + 6];
            assert var12.nsPsy.last_en_subshort[var27][var34 + 4] > 0.0F;
            var28[var34] = var29[var34] / var12.nsPsy.last_en_subshort[var27][var34 + 4];
            var30[0] += var29[var34];
         }

         for (int var35 = 0; var35 < 9; var35++) {
            int var40 = var32 + 64;
            float var44 = 1.0F;

            while (var32 < var40) {
               if (var44 < Math.abs(var31[var32])) {
                  var44 = Math.abs(var31[var32]);
               }

               var32++;
            }

            var12.nsPsy.last_en_subshort[var27][var35] = var29[var35 + 3] = var44;
            var30[1 + var35 / 3] = var30[1 + var35 / 3] + var44;
            if (var44 > var29[var35 + 3 - 2]) {
               assert var29[var35 + 3 - 2] > 0.0F;
               var44 /= var29[var35 + 3 - 2];
            } else if (var29[var35 + 3 - 2] > var44 * 10.0) {
               assert var44 > 0.0F;
               var44 = var29[var35 + 3 - 2] / (var44 * 10.0F);
            } else {
               var44 = 0.0F;
            }

            var28[var35 + 3] = var44;
         }

         for (int var36 = 0; var36 < 3; var36++) {
            float var41 = var29[var36 * 3 + 3] + var29[var36 * 3 + 4] + var29[var36 * 3 + 5];
            float var46 = 1.0F;
            if (var29[var36 * 3 + 5] * 6.0F < var41) {
               var46 *= 0.5F;
               if (var29[var36 * 3 + 4] * 6.0F < var41) {
                  var46 *= 0.5F;
               }
            }

            var8[var27][var36] = var46;
         }

         if (var1.analysis) {
            float var37 = var28[0];

            for (int var42 = 1; var42 < 12; var42++) {
               if (var37 < var28[var42]) {
                  var37 = var28[var42];
               }
            }

            var12.pinfo.ers[var4][var27] = var12.pinfo.ers_save[var27];
            var12.pinfo.ers_save[var27] = var37;
         }

         for (int var38 = 0; var38 < 12; var38++) {
            if (0 == var9[var27][var38 / 3] && var28[var38] > var33) {
               var9[var27][var38 / 3] = var38 % 3 + 1;
            }
         }

         for (int var39 = 1; var39 < 4; var39++) {
            float var43 = var30[var39 - 1];
            float var47 = var30[var39];
            float var48 = Math.max(var43, var47);
            if (var48 < 40000.0F && var43 < 1.7 * var47 && var47 < 1.7 * var43) {
               if (var39 == 1 && var9[var27][0] <= var9[var27][var39]) {
                  var9[var27][0] = 0;
               }

               var9[var27][var39] = 0;
            }
         }

         if (var9[var27][0] <= var12.nsPsy.lastAttacks[var27]) {
            var9[var27][0] = 0;
         }

         if (var12.nsPsy.lastAttacks[var27] == 3 || var9[var27][0] + var9[var27][1] + var9[var27][2] + var9[var27][3] != 0) {
            var22 = 0;
            if (var9[var27][1] != 0 && var9[var27][0] != 0) {
               var9[var27][1] = 0;
            }

            if (var9[var27][2] != 0 && var9[var27][1] != 0) {
               var9[var27][2] = 0;
            }

            if (var9[var27][3] != 0 && var9[var27][2] != 0) {
               var9[var27][3] = 0;
            }
         }

         if (var27 < 2) {
            var10[var27] = var22;
         } else if (var22 == 0) {
            var10[0] = var10[1] = 0;
         }

         var7[var27] = var12.tot_ener[var27];
      }
   }

   private void vbrpsy_skip_masking_s(LameInternalFlags var1, int var2, int var3) {
      if (var3 == 0) {
         for (int var4 = 0; var4 < var1.npart_s; var4++) {
            var1.nb_s2[var2][var4] = var1.nb_s1[var2][var4];
            var1.nb_s1[var2][var4] = 0.0F;
         }
      }
   }

   private void vbrpsy_skip_masking_l(LameInternalFlags var1, int var2) {
      for (int var3 = 0; var3 < var1.npart_l; var3++) {
         var1.nb_2[var2][var3] = var1.nb_1[var2][var3];
         var1.nb_1[var2][var3] = 0.0F;
      }
   }

   private void psyvbr_calc_mask_index_s(LameInternalFlags var1, float[] var2, float[] var3, int[] var4) {
      int var5 = tab.length - 1;
      int var6 = 0;
      float var7 = var3[var6] + var3[var6 + 1];
      assert var7 >= 0.0F;
      if (var7 > 0.0) {
         float var8 = var2[var6];
         if (var8 < var2[var6 + 1]) {
            var8 = var2[var6 + 1];
         }

         assert var1.numlines_s[var6] + var1.numlines_s[var6 + 1] - 1 > 0;
         var7 = 20.0F * (var8 * 2.0F - var7) / (var7 * (var1.numlines_s[var6] + var1.numlines_s[var6 + 1] - 1));
         int var9 = (int)var7;
         if (var9 > var5) {
            var9 = var5;
         }

         var4[var6] = var9;
      } else {
         var4[var6] = 0;
      }

      for (var6 = 1; var6 < var1.npart_s - 1; var6++) {
         var7 = var3[var6 - 1] + var3[var6] + var3[var6 + 1];
         assert var6 + 1 < var1.npart_s;
         assert var7 >= 0.0F;
         if (var7 > 0.0) {
            float var16 = var2[var6 - 1];
            if (var16 < var2[var6]) {
               var16 = var2[var6];
            }

            if (var16 < var2[var6 + 1]) {
               var16 = var2[var6 + 1];
            }

            assert var1.numlines_s[var6 - 1] + var1.numlines_s[var6] + var1.numlines_s[var6 + 1] - 1 > 0;
            var7 = 20.0F * (var16 * 3.0F - var7) / (var7 * (var1.numlines_s[var6 - 1] + var1.numlines_s[var6] + var1.numlines_s[var6 + 1] - 1));
            int var18 = (int)var7;
            if (var18 > var5) {
               var18 = var5;
            }

            var4[var6] = var18;
         } else {
            var4[var6] = 0;
         }
      }

      assert var6 > 0;
      assert var6 == var1.npart_s - 1;
      var7 = var3[var6 - 1] + var3[var6];
      assert var7 >= 0.0F;
      if (var7 > 0.0) {
         float var17 = var2[var6 - 1];
         if (var17 < var2[var6]) {
            var17 = var2[var6];
         }

         assert var1.numlines_s[var6 - 1] + var1.numlines_s[var6] - 1 > 0;
         var7 = 20.0F * (var17 * 2.0F - var7) / (var7 * (var1.numlines_s[var6 - 1] + var1.numlines_s[var6] - 1));
         int var19 = (int)var7;
         if (var19 > var5) {
            var19 = var5;
         }

         var4[var6] = var19;
      } else {
         var4[var6] = 0;
      }

      assert var6 == var1.npart_s - 1;
   }

   private void vbrpsy_compute_masking_s(LameGlobalFlags var1, float[][] var2, float[] var3, float[] var4, int var5, int var6) {
      LameInternalFlags var7 = var1.internal_flags;
      float[] var8 = new float[64];
      float[] var9 = new float[64];
      int[] var13 = new int[64];
      int var11 = 0;

      int var12;
      for (var12 = 0; var12 < var7.npart_s; var12++) {
         float var14 = 0.0F;
         float var15 = 0.0F;
         int var16 = var7.numlines_s[var12];

         for (int var10 = 0; var10 < var16; var11++) {
            float var17 = var2[var6][var11];
            var14 += var17;
            if (var15 < var17) {
               var15 = var17;
            }

            var10++;
         }

         var3[var12] = var14;
         assert var14 >= 0.0F;
         var8[var12] = var15;
         assert var16 > 0;
         var9[var12] = var14 / var16;
         assert var9[var12] >= 0.0F;
      }

      assert var12 == var7.npart_s;
      assert var11 == 129;

      while (var12 < 64) {
         var8[var12] = 0.0F;
         var9[var12] = 0.0F;
         var12++;
      }

      this.psyvbr_calc_mask_index_s(var7, var8, var9, var13);
      var12 = 0;
      var11 = 0;

      while (var12 < var7.npart_s) {
         int var23 = var7.s3ind_s[var12][0];
         int var25 = var7.s3ind_s[var12][1];
         int var26 = var13[var23];
         int var28 = 1;
         float var19 = var7.s3_ss[var11] * var3[var23] * tab[var13[var23]];
         var11++;
         var23++;

         while (var23 <= var25) {
            var26 += var13[var23];
            var28++;
            float var18 = var7.s3_ss[var11] * var3[var23] * tab[var13[var23]];
            var19 = this.vbrpsy_mask_add(var19, var18, var23 - var12);
            var11++;
            var23++;
         }

         var26 = (1 + 2 * var26) / (2 * var28);
         float var20 = tab[var26] * 0.5F;
         var19 *= var20;
         var4[var12] = var19;
         var7.nb_s2[var5][var12] = var7.nb_s1[var5][var12];
         var7.nb_s1[var5][var12] = var19;
         float var29 = var8[var12];
         var29 *= var7.minval_s[var12];
         var29 *= var20;
         if (var4[var12] > var29) {
            var4[var12] = var29;
         }

         if (var7.masking_lower > 1.0F) {
            var4[var12] *= var7.masking_lower;
         }

         if (var4[var12] > var3[var12]) {
            var4[var12] = var3[var12];
         }

         if (var7.masking_lower < 1.0F) {
            var4[var12] *= var7.masking_lower;
         }

         assert var4[var12] >= 0.0F;
         var12++;
      }

      while (var12 < 64) {
         var3[var12] = 0.0F;
         var4[var12] = 0.0F;
         var12++;
      }
   }

   private void vbrpsy_compute_masking_l(LameInternalFlags var1, float[] var2, float[] var3, float[] var4, int var5) {
      float[] var6 = new float[64];
      float[] var7 = new float[64];
      int[] var8 = new int[66];
      this.calc_energy(var1, var2, var3, var6, var7);
      this.calc_mask_index_l(var1, var6, var7, var8);
      int var10 = 0;

      int var9;
      for (var9 = 0; var9 < var1.npart_l; var9++) {
         int var15 = var1.s3ind[var9][0];
         int var16 = var1.s3ind[var9][1];
         int var17 = 0;
         int var18 = 0;
         var17 = var8[var15];
         var18++;
         float var12 = var1.s3_ll[var10] * var3[var15] * tab[var8[var15]];
         var10++;
         var15++;

         while (var15 <= var16) {
            var17 += var8[var15];
            var18++;
            float var11 = var1.s3_ll[var10] * var3[var15] * tab[var8[var15]];
            float var14 = this.vbrpsy_mask_add(var12, var11, var15 - var9);
            var12 = var14;
            var10++;
            var15++;
         }

         var17 = (1 + 2 * var17) / (2 * var18);
         float var13 = tab[var17] * 0.5F;
         var12 *= var13;
         if (var1.blocktype_old[var5 & 1] == 2) {
            float var19 = 2.0F * var1.nb_1[var5][var9];
            if (var19 > 0.0F) {
               var4[var9] = Math.min(var12, var19);
            } else {
               var4[var9] = Math.min(var12, var3[var9] * 0.3F);
            }
         } else {
            float var30 = 16.0F * var1.nb_2[var5][var9];
            float var20 = 2.0F * var1.nb_1[var5][var9];
            if (var30 <= 0.0F) {
               var30 = var12;
            }

            if (var20 <= 0.0F) {
               var20 = var12;
            }

            float var21;
            if (var1.blocktype_old[var5 & 1] == 0) {
               var21 = Math.min(var20, var30);
            } else {
               var21 = var20;
            }

            var4[var9] = Math.min(var12, var21);
         }

         var1.nb_2[var5][var9] = var1.nb_1[var5][var9];
         var1.nb_1[var5][var9] = var12;
         float var22 = var6[var9];
         var22 *= var1.minval_l[var9];
         var22 *= var13;
         if (var4[var9] > var22) {
            var4[var9] = var22;
         }

         if (var1.masking_lower > 1.0F) {
            var4[var9] *= var1.masking_lower;
         }

         if (var4[var9] > var3[var9]) {
            var4[var9] = var3[var9];
         }

         if (var1.masking_lower < 1.0F) {
            var4[var9] *= var1.masking_lower;
         }

         assert var4[var9] >= 0.0F;
      }

      while (var9 < 64) {
         var3[var9] = 0.0F;
         var4[var9] = 0.0F;
         var9++;
      }
   }

   private void vbrpsy_compute_block_type(LameGlobalFlags var1, int[] var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var1.short_blocks == ShortBlock.short_block_coupled && (var2[0] == 0 || var2[1] == 0)) {
         var2[0] = var2[1] = 0;
      }

      for (int var4 = 0; var4 < var3.channels_out; var4++) {
         if (var1.short_blocks == ShortBlock.short_block_dispensed) {
            var2[var4] = 1;
         }

         if (var1.short_blocks == ShortBlock.short_block_forced) {
            var2[var4] = 0;
         }
      }
   }

   private void vbrpsy_apply_block_type(LameGlobalFlags var1, int[] var2, int[] var3) {
      LameInternalFlags var4 = var1.internal_flags;

      for (int var5 = 0; var5 < var4.channels_out; var5++) {
         byte var6 = 0;
         if (var2[var5] != 0) {
            assert var4.blocktype_old[var5] != 1;
            if (var4.blocktype_old[var5] == 2) {
               var6 = 3;
            }
         } else {
            var6 = 2;
            if (var4.blocktype_old[var5] == 0) {
               var4.blocktype_old[var5] = 1;
            }

            if (var4.blocktype_old[var5] == 3) {
               var4.blocktype_old[var5] = 2;
            }
         }

         var3[var5] = var4.blocktype_old[var5];
         var4.blocktype_old[var5] = var6;
      }
   }

   private void vbrpsy_compute_MS_thresholds(float[][] var1, float[][] var2, float[] var3, float[] var4, float var5, float var6, int var7) {
      float var8 = var6 * 2.0F;
      float var9 = var6 > 0.0F ? (float)Math.pow(10.0, var5) : 1.0F;

      for (int var12 = 0; var12 < var7; var12++) {
         float var13 = var1[2][var12];
         float var14 = var1[3][var12];
         float var15 = var2[0][var12];
         float var16 = var2[1][var12];
         float var17 = var2[2][var12];
         float var18 = var2[3][var12];
         float var10;
         float var11;
         if (var15 <= 1.58 * var16 && var16 <= 1.58 * var15) {
            float var19 = var3[var12] * var14;
            float var20 = var3[var12] * var13;
            var11 = Math.max(var17, Math.min(var18, var19));
            var10 = Math.max(var18, Math.min(var17, var20));
         } else {
            var11 = var17;
            var10 = var18;
         }

         if (var6 > 0.0F) {
            float var21 = var4[var12] * var9;
            float var25 = Math.min(Math.max(var15, var21), Math.max(var16, var21));
            var17 = Math.max(var11, var21);
            var18 = Math.max(var10, var21);
            float var26 = var17 + var18;
            if (var26 > 0.0F && var25 * var8 < var26) {
               float var22 = var25 * var8 / var26;
               var17 *= var22;
               var18 *= var22;
               assert var26 > 0.0F;
            }

            var11 = Math.min(var17, var11);
            var10 = Math.min(var18, var10);
         }

         if (var11 > var13) {
            var11 = var13;
         }

         if (var10 > var14) {
            var10 = var14;
         }

         var2[2][var12] = var11;
         var2[3][var12] = var10;
      }
   }

   public final int L3psycho_anal_vbr(
      LameGlobalFlags var1,
      float[][] var2,
      int var3,
      int var4,
      III_psy_ratio[][] var5,
      III_psy_ratio[][] var6,
      float[] var7,
      float[] var8,
      float[] var9,
      int[] var10
   ) {
      LameInternalFlags var11 = var1.internal_flags;
      float[] var14 = new float[513];
      float[][] var15 = new float[3][129];
      float[][] var16 = new float[2][1024];
      float[][][] var17 = new float[2][3][256];
      float[][] var18 = new float[4][64];
      float[][] var19 = new float[4][64];
      float[][] var20 = new float[4][3];
      float var21 = 0.6F;
      int[][] var22 = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
      int[] var23 = new int[2];
      int var24 = var1.getMode() == MPEGMode.JOINT_STEREO ? 4 : var11.channels_out;
      this.vbrpsy_attack_detection(var1, var2, var3, var4, var5, var6, var9, var20, var22, var23);
      this.vbrpsy_compute_block_type(var1, var23);

      for (int var25 = 0; var25 < var24; var25++) {
         int var26 = var25 & 1;
         float[][] var12 = var16;
         this.vbrpsy_compute_fft_l(var1, var2, var3, var25, var4, var14, var12, var26);
         this.vbrpsy_compute_loudness_approximation_l(var1, var4, var25, var14);
         if (var23[var26] != 0) {
            this.vbrpsy_compute_masking_l(var11, var14, var18[var25], var19[var25], var25);
         } else {
            this.vbrpsy_skip_masking_l(var11, var25);
         }
      }

      if (var23[0] + var23[1] == 2 && var1.getMode() == MPEGMode.JOINT_STEREO) {
         this.vbrpsy_compute_MS_thresholds(var18, var19, var11.mld_cb_l, var11.ATH.cb_l, var1.ATHlower * var11.ATH.adjust, var1.msfix, var11.npart_l);
      }

      for (int var34 = 0; var34 < var24; var34++) {
         int var39 = var34 & 1;
         if (var23[var39] != 0) {
            this.convert_partition2scalefac_l(var11, var18[var34], var19[var34], var34);
         }
      }

      for (int var35 = 0; var35 < 3; var35++) {
         for (int var40 = 0; var40 < var24; var40++) {
            int var27 = var40 & 1;
            if (var23[var27] != 0) {
               this.vbrpsy_skip_masking_s(var11, var40, var35);
            } else {
               float[][][] var13 = var17;
               this.vbrpsy_compute_fft_s(var1, var2, var3, var40, var35, var15, var13, var27);
               this.vbrpsy_compute_masking_s(var1, var15, var18[var40], var19[var40], var40, var35);
            }
         }

         if (var23[0] + var23[1] == 0 && var1.getMode() == MPEGMode.JOINT_STEREO) {
            this.vbrpsy_compute_MS_thresholds(var18, var19, var11.mld_cb_s, var11.ATH.cb_s, var1.ATHlower * var11.ATH.adjust, var1.msfix, var11.npart_s);
         }

         for (int var41 = 0; var41 < var24; var41++) {
            int var44 = var41 & 1;
            if (0 == var23[var44]) {
               this.convert_partition2scalefac_s(var11, var18[var41], var19[var41], var41, var35);
            }
         }
      }

      for (int var36 = 0; var36 < var24; var36++) {
         int var42 = var36 & 1;
         if (var23[var42] == 0) {
            for (int var45 = 0; var45 < 13; var45++) {
               float[] var28 = new float[3];

               for (int var29 = 0; var29 < 3; var29++) {
                  float var30 = var11.thm[var36].s[var45][var29];
                  var30 *= 0.8F;
                  if (var22[var36][var29] >= 2 || var22[var36][var29 + 1] == 1) {
                     int var53 = var29 != 0 ? var29 - 1 : 2;
                     double var55 = this.NS_INTERP(var11.thm[var36].s[var45][var53], var30, 0.6F * var21);
                     var30 = (float)Math.min(var30, var55);
                  } else if (var22[var36][var29] == 1) {
                     int var31 = var29 != 0 ? var29 - 1 : 2;
                     double var32 = this.NS_INTERP(var11.thm[var36].s[var45][var31], var30, 0.3F * var21);
                     var30 = (float)Math.min(var30, var32);
                  } else if (var29 != 0 && var22[var36][var29 - 1] == 3 || var29 == 0 && var11.nsPsy.lastAttacks[var36] == 3) {
                     int var52 = var29 != 2 ? var29 + 1 : 0;
                     double var54 = this.NS_INTERP(var11.thm[var36].s[var45][var52], var30, 0.3F * var21);
                     var30 = (float)Math.min(var30, var54);
                  }

                  var30 *= var20[var36][var29];
                  var28[var29] = var30;
               }

               for (int var48 = 0; var48 < 3; var48++) {
                  var11.thm[var36].s[var45][var48] = var28[var48];
               }
            }
         }
      }

      for (int var37 = 0; var37 < var24; var37++) {
         var11.nsPsy.lastAttacks[var37] = var22[var37][2];
      }

      this.vbrpsy_apply_block_type(var1, var23, var10);

      for (int var38 = 0; var38 < var24; var38++) {
         float[] var43;
         byte var46;
         int var47;
         III_psy_ratio var49;
         if (var38 > 1) {
            var43 = var8;
            var46 = -2;
            var47 = 0;
            if (var10[0] == 2 || var10[1] == 2) {
               var47 = 2;
            }

            var49 = var6[var4][var38 - 2];
         } else {
            var43 = var7;
            var46 = 0;
            var47 = var10[var38];
            var49 = var5[var4][var38];
         }

         if (var47 == 2) {
            var43[var46 + var38] = this.pecalc_s(var49, var11.masking_lower);
         } else {
            var43[var46 + var38] = this.pecalc_l(var49, var11.masking_lower);
         }

         if (var1.analysis) {
            var11.pinfo.pe[var4][var38] = var43[var46 + var38];
         }
      }

      return 0;
   }

   private float s3_func_x(float var1, float var2) {
      float var3 = var1;
      float var4;
      if (var3 >= 0.0F) {
         var4 = -var3 * 27.0F;
      } else {
         var4 = var3 * var2;
      }

      return var4 <= -72.0 ? 0.0F : (float)Math.exp(var4 * 0.23025851F);
   }

   private float norm_s3_func_x(float var1) {
      double var2 = 0.0;
      double var4 = 0.0;
      double var6 = 0.0;
      var6 = 0.0;

      while (this.s3_func_x((float)var6, var1) > 1.0E-20) {
         var6--;
      }

      double var8 = var6;
      double var10 = 0.0;

      while (Math.abs(var10 - var8) > 1.0E-12) {
         var6 = (var10 + var8) / 2.0;
         if (this.s3_func_x((float)var6, var1) > 0.0F) {
            var10 = var6;
         } else {
            var8 = var6;
         }
      }

      var2 = var8;
      var6 = 0.0;
      var6 = 0.0;

      while (this.s3_func_x((float)var6, var1) > 1.0E-20) {
         var6++;
      }

      var8 = 0.0;
      var10 = var6;

      while (Math.abs(var10 - var8) > 1.0E-12) {
         var6 = (var10 + var8) / 2.0;
         if (this.s3_func_x((float)var6, var1) > 0.0F) {
            var8 = var6;
         } else {
            var10 = var6;
         }
      }

      var4 = var10;
      var6 = 0.0;
      short var23 = 1000;

      for (int var9 = 0; var9 <= 1000; var9++) {
         var10 = var2 + var9 * (var4 - var2) / 1000.0;
         double var12 = this.s3_func_x((float)var10, var1);
         var6 += var12;
      }

      var10 = 1001.0 / (var6 * (var4 - var2));
      return (float)var10;
   }

   private float s3_func(float var1) {
      float var2 = var1;
      if (var2 >= 0.0F) {
         var2 *= 3.0F;
      } else {
         var2 = (float)(var2 * 1.5);
      }

      float var3;
      if (var2 >= 0.5 && var2 <= 2.5) {
         float var5 = var2 - 0.5F;
         var3 = 8.0F * (var5 * var5 - 2.0F * var5);
      } else {
         var3 = 0.0F;
      }

      var2 = (float)(var2 + 0.474);
      float var4 = 15.811389F + 7.5F * var2 - 17.5F * (float)Math.sqrt(1.0 + var2 * var2);
      if (var4 <= -60.0) {
         return 0.0F;
      }

      var2 = (float)Math.exp((var3 + var4) * 0.23025851F);
      return (float)(var2 / 0.6609193);
   }

   private float freq2bark(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      var1 *= 0.001F;
      return 13.0F * (float)Math.atan(0.76 * var1) + 3.5F * (float)Math.atan(var1 * var1 / 56.25);
   }

   private int init_numline(
      int[] var1, int[] var2, int[] var3, float[] var4, float[] var5, float[] var6, float[] var7, float var8, int var9, int[] var10, float var11, int var12
   ) {
      float[] var13 = new float[65];
      float var14 = var8 / (var12 > 15 ? 1152 : 384);
      int[] var15 = new int[513];
      var8 /= var9;
      int var17 = 0;
      int var18 = 0;

      int var16;
      for (var16 = 0; var16 < 64; var16++) {
         float var19 = this.freq2bark(var8 * var17);
         var13[var16] = var8 * var17;
         int var20 = var17;

         while (this.freq2bark(var8 * var20) - var19 < 0.34F && var20 <= var9 / 2) {
            var20++;
         }

         var1[var16] = var20 - var17;
         var18 = var16 + 1;

         while (var17 < var20) {
            assert var17 < 513;
            var15[var17++] = var16;
         }

         if (var17 > var9 / 2) {
            var17 = var9 / 2;
            var16++;
            break;
         }
      }

      assert var16 < 64;
      var13[var16] = var8 * var17;

      for (int var28 = 0; var28 < var12; var28++) {
         int var22 = var10[var28];
         int var23 = var10[var28 + 1];
         int var30 = (int)Math.floor(0.5 + var11 * (var22 - 0.5));
         if (var30 < 0) {
            var30 = 0;
         }

         int var21 = (int)Math.floor(0.5 + var11 * (var23 - 0.5));
         if (var21 > var9 / 2) {
            var21 = var9 / 2;
         }

         var3[var28] = (var15[var30] + var15[var21]) / 2;
         var2[var28] = var15[var21];
         float var25 = var14 * var23;
         var7[var28] = (var25 - var13[var2[var28]]) / (var13[var2[var28] + 1] - var13[var2[var28]]);
         if (var7[var28] < 0.0F) {
            var7[var28] = 0.0F;
         } else if (var7[var28] > 1.0F) {
            var7[var28] = 1.0F;
         }

         float var24 = this.freq2bark(var8 * var10[var28] * var11);
         var24 = (float)Math.min(var24, 15.5) / 15.5F;
         var6[var28] = (float)Math.pow(10.0, 1.25 * (1.0 - Math.cos(Math.PI * var24)) - 2.5);
      }

      var17 = 0;

      for (int var29 = 0; var29 < var18; var29++) {
         int var31 = var1[var29];
         float var32 = this.freq2bark(var8 * var17);
         float var34 = this.freq2bark(var8 * (var17 + var31 - 1));
         var4[var29] = 0.5F * (var32 + var34);
         var32 = this.freq2bark(var8 * (var17 - 0.5F));
         var34 = this.freq2bark(var8 * (var17 + var31 - 0.5F));
         var5[var29] = var34 - var32;
         var17 += var31;
      }

      return var18;
   }

   private float[] init_s3_values(int[][] var1, int var2, float[] var3, float[] var4, float[] var5, boolean var6) {
      float[][] var7 = new float[64][64];
      int var9 = 0;
      if (var6) {
         for (int var10 = 0; var10 < var2; var10++) {
            for (int var8 = 0; var8 < var2; var8++) {
               float var11 = this.s3_func(var3[var10] - var3[var8]) * var4[var8];
               var7[var10][var8] = var11 * var5[var10];
            }
         }
      } else {
         for (int var14 = 0; var14 < var2; var14++) {
            float var18 = 15.0F + Math.min(21.0F / var3[var14], 12.0F);
            float var21 = this.norm_s3_func_x(var18);

            for (int var12 = 0; var12 < var2; var12++) {
               float var13 = var21 * this.s3_func_x(var3[var12] - var3[var14], var18) * var4[var14];
               var7[var12][var14] = var13 * var5[var12];
            }
         }
      }

      for (int var19 = 0; var19 < var2; var19++) {
         int var15 = 0;

         while (var15 < var2 && !(var7[var19][var15] > 0.0F)) {
            var15++;
         }

         var1[var19][0] = var15;
         var15 = var2 - 1;

         while (var15 > 0 && !(var7[var19][var15] > 0.0F)) {
            var15--;
         }

         var1[var19][1] = var15;
         var9 += var1[var19][1] - var1[var19][0] + 1;
      }

      float[] var20 = new float[var9];
      int var22 = 0;

      for (int var23 = 0; var23 < var2; var23++) {
         for (int var17 = var1[var23][0]; var17 <= var1[var23][1]; var17++) {
            var20[var22++] = var7[var23][var17];
         }
      }

      return var20;
   }

   private float stereo_demask(double var1) {
      double var3 = this.freq2bark((float)var1);
      var3 = Math.min(var3, 15.5) / 15.5;
      return (float)Math.pow(10.0, 1.25 * (1.0 - Math.cos(Math.PI * var3)) - 2.5);
   }

   public final int psymodel_init(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      boolean var4 = true;
      float var5 = 13.0F;
      float var6 = 24.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = -8.25F;
      float var10 = -4.5F;
      float[] var11 = new float[64];
      float[] var12 = new float[64];
      float[] var13 = new float[64];
      float var14 = var1.getOutSampleRate();
      switch (var1.experimentalZ) {
         case 0:
         default:
            var4 = true;
            break;
         case 1:
            var4 = var1.getVBR() != VbrMode.vbr_mtrh && var1.getVBR() != VbrMode.vbr_mt;
            break;
         case 2:
            var4 = false;
            break;
         case 3:
            var5 = 8.0F;
            var7 = -1.75F;
            var8 = -0.0125F;
            var9 = -8.25F;
            var10 = -2.25F;
      }

      var2.ms_ener_ratio_old = 0.25F;
      var2.blocktype_old[0] = var2.blocktype_old[1] = 0;

      for (int var3 = 0; var3 < 4; var3++) {
         for (int var15 = 0; var15 < 64; var15++) {
            var2.nb_1[var3][var15] = 1.0E20F;
            var2.nb_2[var3][var15] = 1.0E20F;
            var2.nb_s1[var3][var15] = var2.nb_s2[var3][var15] = 1.0F;
         }

         for (int var32 = 0; var32 < 22; var32++) {
            var2.en[var3].l[var32] = 1.0E20F;
            var2.thm[var3].l[var32] = 1.0E20F;
         }

         for (int var33 = 0; var33 < 3; var33++) {
            for (int var16 = 0; var16 < 13; var16++) {
               var2.en[var3].s[var16][var33] = 1.0E20F;
               var2.thm[var3].s[var16][var33] = 1.0E20F;
            }

            var2.nsPsy.lastAttacks[var3] = 0;
         }

         for (int var34 = 0; var34 < 9; var34++) {
            var2.nsPsy.last_en_subshort[var3][var34] = 10.0F;
         }
      }

      var2.loudness_sq_save[0] = var2.loudness_sq_save[1] = 0.0F;
      var2.npart_l = this.init_numline(
         var2.numlines_l, var2.bo_l, var2.bm_l, var11, var12, var2.mld_l, var2.PSY.bo_l_weight, var14, 1024, var2.scalefac_band.l, 0.8888889F, 22
      );
      assert var2.npart_l < 64;

      for (int var23 = 0; var23 < var2.npart_l; var23++) {
         double var35 = var7;
         if (var11[var23] >= var5) {
            var35 = var8 * (var11[var23] - var5) / (var6 - var5) + var7 * (var6 - var11[var23]) / (var6 - var5);
         }

         var13[var23] = (float)Math.pow(10.0, var35 / 10.0);
         if (var2.numlines_l[var23] > 0) {
            var2.rnumlines_l[var23] = 1.0F / var2.numlines_l[var23];
         } else {
            var2.rnumlines_l[var23] = 0.0F;
         }
      }

      var2.s3_ll = this.init_s3_values(var2.s3ind, var2.npart_l, var11, var12, var13, var4);
      int var36 = 0;

      for (int var24 = 0; var24 < var2.npart_l; var24++) {
         double var42 = Float.MAX_VALUE;

         for (int var18 = 0; var18 < var2.numlines_l[var24]; var36++) {
            float var19 = var14 * var36 / 1024000.0F;
            float var20 = this.ATHformula(var19 * 1000.0F, var1) - 20.0F;
            var20 = (float)Math.pow(10.0, 0.1 * var20);
            var20 *= var2.numlines_l[var24];
            if (var42 > var20) {
               var42 = var20;
            }

            var18++;
         }

         var2.ATH.cb_l[var24] = (float)var42;
         var42 = -20.0F + var11[var24] * 20.0F / 10.0F;
         if (var42 > 6.0) {
            var42 = 100.0;
         }

         if (var42 < -15.0) {
            var42 = -15.0;
         }

         var42 -= 8.0;
         var2.minval_l[var24] = (float)(Math.pow(10.0, var42 / 10.0) * var2.numlines_l[var24]);
      }

      var2.npart_s = this.init_numline(
         var2.numlines_s, var2.bo_s, var2.bm_s, var11, var12, var2.mld_s, var2.PSY.bo_s_weight, var14, 256, var2.scalefac_band.s, 0.6666667F, 13
      );
      assert var2.npart_s < 64;
      var36 = 0;

      for (int var25 = 0; var25 < var2.npart_s; var25++) {
         double var55 = var9;
         if (var11[var25] >= var5) {
            var55 = var10 * (var11[var25] - var5) / (var6 - var5) + var9 * (var6 - var11[var25]) / (var6 - var5);
         }

         var13[var25] = (float)Math.pow(10.0, var55 / 10.0);
         double var45 = Float.MAX_VALUE;

         for (int var61 = 0; var61 < var2.numlines_s[var25]; var36++) {
            float var21 = var14 * var36 / 256000.0F;
            float var22 = this.ATHformula(var21 * 1000.0F, var1) - 20.0F;
            var22 = (float)Math.pow(10.0, 0.1 * var22);
            var22 *= var2.numlines_s[var25];
            if (var45 > var22) {
               var45 = var22;
            }

            var61++;
         }

         var2.ATH.cb_s[var25] = (float)var45;
         var45 = -7.0 + var11[var25] * 7.0 / 12.0;
         if (var11[var25] > 12.0F) {
            var45 *= 1.0 + Math.log(1.0 + var45) * 3.1;
         }

         if (var11[var25] < 12.0F) {
            var45 *= 1.0 + Math.log(1.0 - var45) * 2.3;
         }

         if (var45 < -15.0) {
            var45 = -15.0;
         }

         var45 -= 8.0;
         var2.minval_s[var25] = (float)Math.pow(10.0, var45 / 10.0) * var2.numlines_s[var25];
      }

      var2.s3_ss = this.init_s3_values(var2.s3ind_s, var2.npart_s, var11, var12, var13, var4);
      this.init_mask_add_max_values();
      this.fft.init_fft(var2);
      var2.decay = (float)Math.exp(-2.3025851F / (0.01F * var14 / 192.0));
      float var48 = 3.5F;
      if ((var1.exp_nspsytune & 2) != 0) {
         var48 = 1.0F;
      }

      if (Math.abs(var1.msfix) > 0.0) {
         var48 = var1.msfix;
      }

      var1.msfix = var48;

      for (int var17 = 0; var17 < var2.npart_l; var17++) {
         if (var2.s3ind[var17][1] > var2.npart_l - 1) {
            var2.s3ind[var17][1] = var2.npart_l - 1;
         }
      }

      var48 = 576.0F * var2.mode_gr / var14;
      var2.ATH.decay = (float)Math.pow(10.0, -1.2 * var48);
      var2.ATH.adjust = 0.01F;
      var2.ATH.adjustLimit = 1.0F;
      assert var2.bo_l[21] <= var2.npart_l;
      assert var2.bo_s[12] <= var2.npart_s;
      if (var1.ATHtype != -1) {
         float var56 = var1.getOutSampleRate() / 1024.0F;
         float var57 = 0.0F;
         float var50 = 0.0F;

         for (int var26 = 0; var26 < 512; var26++) {
            var50 += var56;
            var2.ATH.eql_w[var26] = 1.0F / (float)Math.pow(10.0, this.ATHformula(var50, var1) / 10.0F);
            var57 += var2.ATH.eql_w[var26];
         }

         var57 = 1.0F / var57;
         int var27 = 512;

         while (--var27 >= 0) {
            var2.ATH.eql_w[var27] = var2.ATH.eql_w[var27] * var57;
         }
      }

      var36 = 0;

      for (int var51 = 0; var51 < var2.npart_s; var51++) {
         for (int var28 = 0; var28 < var2.numlines_s[var51]; var28++) {
            var36++;
         }
      }

      assert var36 == 129;
      var36 = 0;

      for (int var52 = 0; var52 < var2.npart_l; var52++) {
         for (int var29 = 0; var29 < var2.numlines_l[var52]; var29++) {
            var36++;
         }
      }

      assert var36 == 513;
      var36 = 0;

      int var30;
      for (var30 = 0; var30 < var2.npart_l; var30++) {
         float var53 = var14 * (var36 + var2.numlines_l[var30] / 2) / 1024.0F;
         var2.mld_cb_l[var30] = this.stereo_demask(var53);
         var36 += var2.numlines_l[var30];
      }

      while (var30 < 64) {
         var2.mld_cb_l[var30] = 1.0F;
         var30++;
      }

      var36 = 0;

      for (var30 = 0; var30 < var2.npart_s; var30++) {
         float var54 = var14 * (var36 + var2.numlines_s[var30] / 2) / 256.0F;
         var2.mld_cb_s[var30] = this.stereo_demask(var54);
         var36 += var2.numlines_s[var30];
      }

      while (var30 < 64) {
         var2.mld_cb_s[var30] = 1.0F;
         var30++;
      }

      return 0;
   }

   private float ATHformula_GB(float var1, float var2) {
      if (var1 < -0.3) {
         var1 = 3410.0F;
      }

      var1 /= 1000.0F;
      var1 = (float)Math.max(0.1, var1);
      return 3.64F * (float)Math.pow(var1, -0.8)
         - 6.8F * (float)Math.exp(-0.6 * Math.pow(var1 - 3.4, 2.0))
         + 6.0F * (float)Math.exp(-0.15 * Math.pow(var1 - 8.7, 2.0))
         + (0.6F + 0.04F * var2) * 0.001F * (float)Math.pow(var1, 4.0);
   }

   public final float ATHformula(float var1, LameGlobalFlags var2) {
      float var3;
      switch (var2.ATHtype) {
         case 0:
            var3 = this.ATHformula_GB(var1, 9.0F);
            break;
         case 1:
            var3 = this.ATHformula_GB(var1, -1.0F);
            break;
         case 2:
            var3 = this.ATHformula_GB(var1, 0.0F);
            break;
         case 3:
            var3 = this.ATHformula_GB(var1, 1.0F) + 6.0F;
            break;
         case 4:
            var3 = this.ATHformula_GB(var1, var2.ATHcurve);
            break;
         default:
            var3 = this.ATHformula_GB(var1, 0.0F);
      }

      return var3;
   }
}
