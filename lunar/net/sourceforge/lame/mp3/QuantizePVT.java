package net.sourceforge.lame.mp3;

public class QuantizePVT {
   public static final int IXMAX_VAL = 8206;
   private static final int PRECALC_SIZE = 8208;
   public float[] pow43 = new float[8208];
   public float[] adj43 = new float[8208];
   public static final int Q_MAX2 = 116;
   public static final int LARGE_BITS = 100000;
   private static final float DBL_EPSILON = 2.220446E-16F;
   private static final int Q_MAX = 257;
   public float[] pow20 = new float[374];
   public float[] ipow20 = new float[257];
   private static final int NSATHSCALE = 100;
   public final int[][][] nr_of_sfb_block = new int[][][]{
      {{6, 5, 5, 5}, {9, 9, 9, 9}, {6, 9, 9, 9}},
      {{6, 5, 7, 3}, {9, 9, 12, 6}, {6, 9, 12, 6}},
      {{11, 10, 0, 0}, {18, 18, 0, 0}, {15, 18, 0, 0}},
      {{7, 7, 7, 0}, {12, 12, 12, 0}, {6, 15, 12, 0}},
      {{6, 6, 6, 3}, {12, 9, 9, 6}, {6, 12, 9, 6}},
      {{8, 8, 5, 0}, {15, 12, 9, 0}, {6, 18, 9, 0}}
   };
   public final int[] pretab = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3, 2, 0};
   public final ScaleFac[] sfBandIndex = new ScaleFac[]{
      new ScaleFac(
         new int[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576},
         new int[]{0, 4, 8, 12, 18, 24, 32, 42, 56, 74, 100, 132, 174, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      ),
      new ScaleFac(
         new int[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 114, 136, 162, 194, 232, 278, 332, 394, 464, 540, 576},
         new int[]{0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 136, 180, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      ),
      new ScaleFac(
         new int[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576},
         new int[]{0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, 174, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      ),
      new ScaleFac(
         new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 52, 62, 74, 90, 110, 134, 162, 196, 238, 288, 342, 418, 576},
         new int[]{0, 4, 8, 12, 16, 22, 30, 40, 52, 66, 84, 106, 136, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      ),
      new ScaleFac(
         new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 42, 50, 60, 72, 88, 106, 128, 156, 190, 230, 276, 330, 384, 576},
         new int[]{0, 4, 8, 12, 16, 22, 28, 38, 50, 64, 80, 100, 126, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      ),
      new ScaleFac(
         new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 54, 66, 82, 102, 126, 156, 194, 240, 296, 364, 448, 550, 576},
         new int[]{0, 4, 8, 12, 16, 22, 30, 42, 58, 78, 104, 138, 180, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      ),
      new ScaleFac(
         new int[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576},
         new int[]{0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, 174, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      ),
      new ScaleFac(
         new int[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576},
         new int[]{0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, 174, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      ),
      new ScaleFac(
         new int[]{0, 12, 24, 36, 48, 60, 72, 88, 108, 132, 160, 192, 232, 280, 336, 400, 476, 566, 568, 570, 572, 574, 576},
         new int[]{0, 8, 16, 24, 36, 52, 72, 96, 124, 160, 162, 164, 166, 192},
         new int[]{0, 0, 0, 0, 0, 0, 0},
         new int[]{0, 0, 0, 0, 0, 0, 0}
      )
   };
   Takehiro tak;
   Reservoir rv;
   PsyModel psy;

   public final void setModules(Takehiro var1, Reservoir var2, PsyModel var3) {
      this.tak = var1;
      this.rv = var2;
      this.psy = var3;
   }

   public final float POW20(int var1) {
      assert 0 <= var1 + 116 && var1 < 257;
      return this.pow20[var1 + 116];
   }

   public final float IPOW20(int var1) {
      assert 0 <= var1 && var1 < 257;
      return this.ipow20[var1];
   }

   private float ATHmdct(LameGlobalFlags var1, float var2) {
      float var3 = this.psy.ATHformula(var2, var1);
      var3 -= 100.0F;
      return (float)Math.pow(10.0, var3 / 10.0 + var1.ATHlower);
   }

   private void compute_ath(LameGlobalFlags var1) {
      float[] var2 = var1.internal_flags.ATH.l;
      float[] var3 = var1.internal_flags.ATH.psfb21;
      float[] var4 = var1.internal_flags.ATH.s;
      float[] var5 = var1.internal_flags.ATH.psfb12;
      LameInternalFlags var6 = var1.internal_flags;
      float var7 = var1.getOutSampleRate();

      for (int var8 = 0; var8 < 22; var8++) {
         int var9 = var6.scalefac_band.l[var8];
         int var10 = var6.scalefac_band.l[var8 + 1];
         var2[var8] = Float.MAX_VALUE;

         for (int var11 = var9; var11 < var10; var11++) {
            float var12 = var11 * var7 / 1152.0F;
            float var13 = this.ATHmdct(var1, var12);
            var2[var8] = Math.min(var2[var8], var13);
         }
      }

      for (int var14 = 0; var14 < 6; var14++) {
         int var21 = var6.scalefac_band.psfb21[var14];
         int var24 = var6.scalefac_band.psfb21[var14 + 1];
         var3[var14] = Float.MAX_VALUE;

         for (int var27 = var21; var27 < var24; var27++) {
            float var30 = var27 * var7 / 1152.0F;
            float var33 = this.ATHmdct(var1, var30);
            var3[var14] = Math.min(var3[var14], var33);
         }
      }

      for (int var15 = 0; var15 < 13; var15++) {
         int var22 = var6.scalefac_band.s[var15];
         int var25 = var6.scalefac_band.s[var15 + 1];
         var4[var15] = Float.MAX_VALUE;

         for (int var28 = var22; var28 < var25; var28++) {
            float var31 = var28 * var7 / 384.0F;
            float var34 = this.ATHmdct(var1, var31);
            var4[var15] = Math.min(var4[var15], var34);
         }

         var4[var15] *= var6.scalefac_band.s[var15 + 1] - var6.scalefac_band.s[var15];
      }

      for (int var16 = 0; var16 < 6; var16++) {
         int var23 = var6.scalefac_band.psfb12[var16];
         int var26 = var6.scalefac_band.psfb12[var16 + 1];
         var5[var16] = Float.MAX_VALUE;

         for (int var29 = var23; var29 < var26; var29++) {
            float var32 = var29 * var7 / 384.0F;
            float var35 = this.ATHmdct(var1, var32);
            var5[var16] = Math.min(var5[var16], var35);
         }

         var5[var16] *= var6.scalefac_band.s[13] - var6.scalefac_band.s[12];
      }

      if (var1.noATH) {
         for (int var17 = 0; var17 < 22; var17++) {
            var2[var17] = 1.0E-20F;
         }

         for (int var18 = 0; var18 < 6; var18++) {
            var3[var18] = 1.0E-20F;
         }

         for (int var19 = 0; var19 < 13; var19++) {
            var4[var19] = 1.0E-20F;
         }

         for (int var20 = 0; var20 < 6; var20++) {
            var5[var20] = 1.0E-20F;
         }
      }

      var6.ATH.floor = 10.0F * (float)Math.log10(this.ATHmdct(var1, -1.0F));
   }

   public final void iteration_init(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      IIISideInfo var3 = var2.l3_side;
      if (var2.iteration_init_init == 0) {
         var2.iteration_init_init = 1;
         var3.main_data_begin = 0;
         this.compute_ath(var1);
         this.pow43[0] = 0.0F;

         for (int var4 = 1; var4 < 8208; var4++) {
            this.pow43[var4] = (float)Math.pow(var4, 1.3333333333333333);
         }

         int var10;
         for (var10 = 0; var10 < 8207; var10++) {
            this.adj43[var10] = (float)(var10 + 1 - Math.pow(0.5 * (this.pow43[var10] + this.pow43[var10 + 1]), 0.75));
         }

         this.adj43[var10] = 0.5F;

         for (int var11 = 0; var11 < 257; var11++) {
            this.ipow20[var11] = (float)Math.pow(2.0, (var11 - 210) * -0.1875);
         }

         for (int var12 = 0; var12 <= 373; var12++) {
            this.pow20[var12] = (float)Math.pow(2.0, (var12 - 210 - 116) * 0.25);
         }

         this.tak.huffman_init(var2);
         var10 = var1.exp_nspsytune >> 2 & 63;
         if (var10 >= 32) {
            var10 -= 64;
         }

         float var5 = (float)Math.pow(10.0, var10 / 4.0 / 10.0);
         var10 = var1.exp_nspsytune >> 8 & 63;
         if (var10 >= 32) {
            var10 -= 64;
         }

         float var6 = (float)Math.pow(10.0, var10 / 4.0 / 10.0);
         var10 = var1.exp_nspsytune >> 14 & 63;
         if (var10 >= 32) {
            var10 -= 64;
         }

         float var7 = (float)Math.pow(10.0, var10 / 4.0 / 10.0);
         var10 = var1.exp_nspsytune >> 20 & 63;
         if (var10 >= 32) {
            var10 -= 64;
         }

         float var8 = var7 * (float)Math.pow(10.0, var10 / 4.0 / 10.0);

         for (int var17 = 0; var17 < 22; var17++) {
            float var9;
            if (var17 <= 6) {
               var9 = var5;
            } else if (var17 <= 13) {
               var9 = var6;
            } else if (var17 <= 20) {
               var9 = var7;
            } else {
               var9 = var8;
            }

            var2.nsPsy.longfact[var17] = var9;
         }

         for (int var18 = 0; var18 < 13; var18++) {
            float var19;
            if (var18 <= 5) {
               var19 = var5;
            } else if (var18 <= 10) {
               var19 = var6;
            } else if (var18 <= 11) {
               var19 = var7;
            } else {
               var19 = var8;
            }

            var2.nsPsy.shortfact[var18] = var19;
         }
      }
   }

   public final int on_pe(LameGlobalFlags var1, float[][] var2, int[] var3, int var4, int var5, int var6) {
      LameInternalFlags var7 = var1.internal_flags;
      int var8 = 0;
      int[] var10 = new int[2];
      MeanBits var12 = new MeanBits(var8);
      int var13 = this.rv.ResvMaxBits(var1, var4, var12, var6);
      var8 = var12.bits;
      int var14 = var8 + var13;
      if (var14 > 7680) {
         var14 = 7680;
      }

      int var9 = 0;

      for (int var11 = 0; var11 < var7.channels_out; var11++) {
         var3[var11] = Math.min(4095, var8 / var7.channels_out);
         var10[var11] = (int)(var3[var11] * var2[var5][var11] / 700.0 - var3[var11]);
         if (var10[var11] > var4 * 3 / 4) {
            var10[var11] = var4 * 3 / 4;
         }

         if (var10[var11] < 0) {
            var10[var11] = 0;
         }

         if (var10[var11] + var3[var11] > 4095) {
            var10[var11] = Math.max(0, 4095 - var3[var11]);
         }

         var9 += var10[var11];
      }

      if (var9 > var13) {
         for (int var18 = 0; var18 < var7.channels_out; var18++) {
            var10[var18] = var13 * var10[var18] / var9;
         }
      }

      for (int var19 = 0; var19 < var7.channels_out; var19++) {
         var3[var19] += var10[var19];
         var13 -= var10[var19];
      }

      var9 = 0;

      for (int var20 = 0; var20 < var7.channels_out; var20++) {
         var9 += var3[var20];
      }

      if (var9 > 7680) {
         int var15 = 0;

         for (int var21 = 0; var21 < var7.channels_out; var21++) {
            var3[var21] *= 7680;
            var3[var21] /= var9;
            var15 += var3[var21];
         }

         assert var15 <= 7680;
      }

      return var14;
   }

   public final void reduce_side(int[] var1, float var2, int var3, int var4) {
      assert var4 <= 7680;
      assert var1[0] + var1[1] <= 7680;
      float var5 = 0.33F * (0.5F - var2) / 0.5F;
      if (var5 < 0.0F) {
         var5 = 0.0F;
      }

      if (var5 > 0.5) {
         var5 = 0.5F;
      }

      int var6 = (int)(var5 * 0.5 * (var1[0] + var1[1]));
      if (var6 > 4095 - var1[0]) {
         var6 = 4095 - var1[0];
      }

      if (var6 < 0) {
         var6 = 0;
      }

      if (var1[1] >= 125) {
         if (var1[1] - var6 > 125) {
            if (var1[0] < var3) {
               var1[0] += var6;
            }

            var1[1] -= var6;
         } else {
            var1[0] += var1[1] - 125;
            var1[1] = 125;
         }
      }

      var6 = var1[0] + var1[1];
      if (var6 > var4) {
         var1[0] = var4 * var1[0] / var6;
         var1[1] = var4 * var1[1] / var6;
      }

      assert var1[0] <= 4095;
      assert var1[1] <= 4095;
      assert var1[0] + var1[1] <= 7680;
   }

   public final float athAdjust(float var1, float var2, float var3) {
      float var4 = 90.30873F;
      float var5 = 94.82445F;
      float var6 = Util.FAST_LOG10_X(var2, 10.0F);
      float var7 = var1 * var1;
      float var8 = 0.0F;
      var6 -= var3;
      if (var7 > 1.0E-20) {
         var8 = 1.0F + Util.FAST_LOG10_X(var7, 0.11073127F);
      }

      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      var6 *= var8;
      var6 += var3 + 90.30873F - 94.82445F;
      return (float)Math.pow(10.0, 0.1 * var6);
   }

   public final int calc_xmin(LameGlobalFlags var1, III_psy_ratio var2, GrInfo var3, float[] var4) {
      int var5 = 0;
      LameInternalFlags var6 = var1.internal_flags;
      int var8 = 0;
      int var9 = 0;
      ATH var10 = var6.ATH;
      float[] var11 = var3.xr;
      boolean var12 = var1.getVBR() == VbrMode.vbr_mtrh;
      float var13 = var6.masking_lower;
      if (var1.getVBR() == VbrMode.vbr_mtrh || var1.getVBR() == VbrMode.vbr_mt) {
         var13 = 1.0F;
      }

      int var7;
      for (var7 = 0; var7 < var3.psy_lmax; var7++) {
         float var15;
         if (var1.getVBR() != VbrMode.vbr_rh && var1.getVBR() != VbrMode.vbr_mtrh) {
            var15 = var10.adjust * var10.l[var7];
         } else {
            var15 = this.athAdjust(var10.adjust, var10.l[var7], var10.floor);
         }

         int var18 = var3.width[var7];
         float var16 = var15 / var18;
         float var17 = 2.220446E-16F;
         int var19 = var18 >> 1;
         float var14 = 0.0F;

         do {
            float var20 = var11[var8] * var11[var8];
            var14 += var20;
            var17 += var20 < var16 ? var20 : var16;
            float var21 = var11[++var8] * var11[var8];
            var14 += var21;
            var17 += var21 < var16 ? var21 : var16;
            var8++;
         } while (--var19 > 0);

         if (var14 > var15) {
            var9++;
         }

         if (var7 == 21) {
            float var38 = var15 * var6.nsPsy.longfact[var7];
            if (var17 < var38) {
               var17 = var38;
            }
         }

         if (var12) {
            var15 = var17;
         }

         if (!var1.ATHonly) {
            float var39 = var2.en.l[var7];
            if (var39 > 0.0F) {
               float var41 = var14 * var2.thm.l[var7] * var13 / var39;
               if (var12) {
                  var41 *= var6.nsPsy.longfact[var7];
               }

               if (var15 < var41) {
                  var15 = var41;
               }
            }
         }

         if (var12) {
            var4[var5++] = var15;
         } else {
            var4[var5++] = var15 * var6.nsPsy.longfact[var7];
         }
      }

      int var29 = 575;
      if (var3.block_type != 2) {
         int var30 = 576;

         while (var30-- != 0 && BitStream.EQ(var11[var30], 0.0F)) {
            var29 = var30;
         }
      }

      var3.max_nonzero_coeff = var29;
      int var31 = var3.sfb_smin;

      while (var7 < var3.psymax) {
         float var35;
         if (var1.getVBR() != VbrMode.vbr_rh && var1.getVBR() != VbrMode.vbr_mtrh) {
            var35 = var10.adjust * var10.s[var31];
         } else {
            var35 = this.athAdjust(var10.adjust, var10.s[var31], var10.floor);
         }

         int var32 = var3.width[var7];

         for (int var34 = 0; var34 < 3; var34++) {
            float var36 = 0.0F;
            int var23 = var32 >> 1;
            float var42 = var35 / var32;
            float var22 = 2.220446E-16F;

            do {
               float var24 = var11[var8] * var11[var8];
               var36 += var24;
               var22 += var24 < var42 ? var24 : var42;
               float var25 = var11[++var8] * var11[var8];
               var36 += var25;
               var22 += var25 < var42 ? var25 : var42;
               var8++;
            } while (--var23 > 0);

            if (var36 > var35) {
               var9++;
            }

            if (var31 == 12) {
               float var44 = var35 * var6.nsPsy.shortfact[var31];
               if (var22 < var44) {
                  var22 = var44;
               }
            }

            float var40;
            if (var12) {
               var40 = var22;
            } else {
               var40 = var35;
            }

            if (!var1.ATHonly && !var1.ATHshort) {
               float var45 = var2.en.s[var31][var34];
               if (var45 > 0.0F) {
                  float var46 = var36 * var2.thm.s[var31][var34] * var13 / var45;
                  if (var12) {
                     var46 *= var6.nsPsy.shortfact[var31];
                  }

                  if (var40 < var46) {
                     var40 = var46;
                  }
               }
            }

            if (var12) {
               var4[var5++] = var40;
            } else {
               var4[var5++] = var40 * var6.nsPsy.shortfact[var31];
            }
         }

         if (var1.useTemporal) {
            if (var4[var5 - 3] > var4[var5 - 3 + 1]) {
               var4[var5 - 3 + 1] = var4[var5 - 3 + 1] + (var4[var5 - 3] - var4[var5 - 3 + 1]) * var6.decay;
            }

            if (var4[var5 - 3 + 1] > var4[var5 - 3 + 2]) {
               var4[var5 - 3 + 2] = var4[var5 - 3 + 2] + (var4[var5 - 3 + 1] - var4[var5 - 3 + 2]) * var6.decay;
            }
         }

         var31++;
         var7 += 3;
      }

      return var9;
   }

   private float calc_noise_core(GrInfo var1, QuantizePVT.StartLine var2, int var3, float var4) {
      float var5 = 0.0F;
      int var6 = var2.s;
      int[] var7 = var1.l3_enc;
      if (var6 > var1.count1) {
         while (var3-- != 0) {
            float var18 = var1.xr[var6];
            var6++;
            var5 += var18 * var18;
            var18 = var1.xr[var6];
            var6++;
            var5 += var18 * var18;
         }
      } else if (var6 > var1.big_values) {
         float[] var17 = new float[]{0.0F, var4};

         while (var3-- != 0) {
            float var9 = Math.abs(var1.xr[var6]) - var17[var7[var6]];
            var6++;
            var5 += var9 * var9;
            var9 = Math.abs(var1.xr[var6]) - var17[var7[var6]];
            var6++;
            var5 += var9 * var9;
         }
      } else {
         while (var3-- != 0) {
            float var8 = Math.abs(var1.xr[var6]) - this.pow43[var7[var6]] * var4;
            var6++;
            var5 += var8 * var8;
            var8 = Math.abs(var1.xr[var6]) - this.pow43[var7[var6]] * var4;
            var6++;
            var5 += var8 * var8;
         }
      }

      var2.s = var6;
      return var5;
   }

   public final int calc_noise(GrInfo var1, float[] var2, float[] var3, CalcNoiseResult var4, CalcNoiseData var5) {
      int var6 = 0;
      int var7 = 0;
      int var10 = 0;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = -20.0F;
      int var14 = 0;
      int[] var15 = var1.scalefac;
      int var16 = 0;
      var4.over_SSD = 0;

      for (int var8 = 0; var8 < var1.psymax; var8++) {
         int var17 = var1.global_gain
            - (var15[var16++] + (var1.preflag != 0 ? this.pretab[var8] : 0) << var1.scalefac_scale + 1)
            - var1.subblock_gain[var1.window[var8]] * 8;
         float var18 = 0.0F;
         if (var5 != null && var5.step[var8] == var17) {
            var18 = var5.noise[var8];
            var14 += var1.width[var8];
            var3[var6++] = var18 / var2[var7++];
            var18 = var5.noise_log[var8];
         } else {
            float var19 = this.POW20(var17);
            int var9 = var1.width[var8] >> 1;
            if (var14 + var1.width[var8] > var1.max_nonzero_coeff) {
               int var20 = var1.max_nonzero_coeff - var14 + 1;
               if (var20 > 0) {
                  var9 = var20 >> 1;
               } else {
                  var9 = 0;
               }
            }

            QuantizePVT.StartLine var26 = new QuantizePVT.StartLine(var14);
            var18 = this.calc_noise_core(var1, var26, var9, var19);
            var14 = var26.s;
            if (var5 != null) {
               var5.step[var8] = var17;
               var5.noise[var8] = var18;
            }

            var18 = var3[var6++] = var18 / var2[var7++];
            var18 = Util.FAST_LOG10((float)Math.max(var18, 1.0E-20));
            if (var5 != null) {
               var5.noise_log[var8] = var18;
            }
         }

         if (var5 != null) {
            var5.global_gain = var1.global_gain;
         }

         var12 += var18;
         if (var18 > 0.0) {
            int var25 = Math.max((int)(var18 * 10.0F + 0.5), 1);
            var4.over_SSD += var25 * var25;
            var10++;
            var11 += var18;
         }

         var13 = Math.max(var13, var18);
      }

      var4.over_count = var10;
      var4.tot_noise = var12;
      var4.over_noise = var11;
      var4.max_noise = var13;
      return var10;
   }

   private void set_pinfo(LameGlobalFlags var1, GrInfo var2, III_psy_ratio var3, int var4, int var5) {
      LameInternalFlags var6 = var1.internal_flags;
      float var12 = var2.scalefac_scale == 0 ? 0.5F : 1.0F;
      int[] var13 = var2.scalefac;
      float[] var14 = new float[39];
      float[] var15 = new float[39];
      CalcNoiseResult var16 = new CalcNoiseResult();
      this.calc_xmin(var1, var3, var2, var14);
      this.calc_noise(var2, var14, var15, var16, null);
      int var17 = 0;
      int var8 = var2.sfb_lmax;
      if (var2.block_type != 2 && 0 == var2.mixed_block_flag) {
         var8 = 22;
      }

      int var7;
      for (var7 = 0; var7 < var8; var7++) {
         int var18 = var6.scalefac_band.l[var7];
         int var19 = var6.scalefac_band.l[var7 + 1];
         int var20 = var19 - var18;
         float var10 = 0.0F;

         while (var17 < var19) {
            var10 += var2.xr[var17] * var2.xr[var17];
            var17++;
         }

         var10 /= var20;
         float var11 = 1.0E15F;
         var6.pinfo.en[var4][var5][var7] = var11 * var10;
         var6.pinfo.xfsf[var4][var5][var7] = var11 * var14[var7] * var15[var7] / var20;
         if (var3.en.l[var7] > 0.0F && !var1.ATHonly) {
            var10 /= var3.en.l[var7];
         } else {
            var10 = 0.0F;
         }

         var6.pinfo.thr[var4][var5][var7] = var11 * Math.max(var10 * var3.thm.l[var7], var6.ATH.l[var7]);
         var6.pinfo.LAMEsfb[var4][var5][var7] = 0.0;
         if (var2.preflag != 0 && var7 >= 11) {
            var6.pinfo.LAMEsfb[var4][var5][var7] = -var12 * this.pretab[var7];
         }

         if (var7 < 21) {
            assert var13[var7] >= 0;
            var6.pinfo.LAMEsfb[var4][var5][var7] = var6.pinfo.LAMEsfb[var4][var5][var7] - var12 * var13[var7];
         }
      }

      if (var2.block_type == 2) {
         var8 = var7;

         for (int var22 = var2.sfb_smin; var22 < 13; var22++) {
            int var30 = var6.scalefac_band.s[var22];
            int var31 = var6.scalefac_band.s[var22 + 1];
            int var32 = var31 - var30;

            for (int var21 = 0; var21 < 3; var21++) {
               float var26 = 0.0F;

               for (int var9 = var30; var9 < var31; var9++) {
                  var26 += var2.xr[var17] * var2.xr[var17];
                  var17++;
               }

               var26 = (float)Math.max(var26 / var32, 1.0E-20);
               float var29 = 1.0E15F;
               var6.pinfo.en_s[var4][var5][3 * var22 + var21] = var29 * var26;
               var6.pinfo.xfsf_s[var4][var5][3 * var22 + var21] = var29 * var14[var8] * var15[var8] / var32;
               if (var3.en.s[var22][var21] > 0.0F) {
                  var26 /= var3.en.s[var22][var21];
               } else {
                  var26 = 0.0F;
               }

               if (var1.ATHonly || var1.ATHshort) {
                  var26 = 0.0F;
               }

               var6.pinfo.thr_s[var4][var5][3 * var22 + var21] = var29 * Math.max(var26 * var3.thm.s[var22][var21], var6.ATH.s[var22]);
               var6.pinfo.LAMEsfb_s[var4][var5][3 * var22 + var21] = -2.0 * var2.subblock_gain[var21];
               if (var22 < 12) {
                  var6.pinfo.LAMEsfb_s[var4][var5][3 * var22 + var21] = var6.pinfo.LAMEsfb_s[var4][var5][3 * var22 + var21] - var12 * var13[var8];
               }

               var8++;
            }
         }
      }

      var6.pinfo.LAMEqss[var4][var5] = var2.global_gain;
      var6.pinfo.LAMEmainbits[var4][var5] = var2.part2_3_length + var2.part2_length;
      var6.pinfo.LAMEsfbits[var4][var5] = var2.part2_length;
      var6.pinfo.over[var4][var5] = var16.over_count;
      var6.pinfo.max_noise[var4][var5] = var16.max_noise * 10.0;
      var6.pinfo.over_noise[var4][var5] = var16.over_noise * 10.0;
      var6.pinfo.tot_noise[var4][var5] = var16.tot_noise * 10.0;
      var6.pinfo.over_SSD[var4][var5] = var16.over_SSD;
   }

   public final void set_frame_pinfo(LameGlobalFlags var1, III_psy_ratio[][] var2) {
      LameInternalFlags var3 = var1.internal_flags;
      var3.masking_lower = 1.0F;

      for (int var4 = 0; var4 < var3.mode_gr; var4++) {
         for (int var5 = 0; var5 < var3.channels_out; var5++) {
            GrInfo var6 = var3.l3_side.tt[var4][var5];
            int[] var7 = new int[39];
            System.arraycopy(var6.scalefac, 0, var7, 0, var7.length);
            if (var4 == 1) {
               for (int var8 = 0; var8 < var6.sfb_lmax; var8++) {
                  if (var6.scalefac[var8] < 0) {
                     var6.scalefac[var8] = var3.l3_side.tt[0][var5].scalefac[var8];
                  }
               }
            }

            this.set_pinfo(var1, var6, var2[var4][var5], var4, var5);
            System.arraycopy(var7, 0, var6.scalefac, 0, var7.length);
         }
      }
   }

   private static class StartLine {
      int s;

      public StartLine(int var1) {
         this.s = var1;
      }
   }
}
