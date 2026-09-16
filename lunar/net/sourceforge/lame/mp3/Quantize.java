package net.sourceforge.lame.mp3;

import java.util.Arrays;

public class Quantize {
   BitStream bs;
   Reservoir rv;
   QuantizePVT qupvt;
   VBRQuantize vbr = new VBRQuantize();
   Takehiro tk;

   public final void setModules(BitStream var1, Reservoir var2, QuantizePVT var3, Takehiro var4) {
      this.bs = var1;
      this.rv = var2;
      this.qupvt = var3;
      this.tk = var4;
      this.vbr.setModules(var3, var4);
   }

   public final void ms_convert(IIISideInfo var1, int var2) {
      for (int var3 = 0; var3 < 576; var3++) {
         float var4 = var1.tt[var2][0].xr[var3];
         float var5 = var1.tt[var2][1].xr[var3];
         var1.tt[var2][0].xr[var3] = (var4 + var5) * 0.70710677F;
         var1.tt[var2][1].xr[var3] = (var4 - var5) * 0.70710677F;
      }
   }

   private float init_xrpow_core(GrInfo var1, float[] var2, int var3, float var4) {
      var4 = 0.0F;

      for (int var5 = 0; var5 <= var3; var5++) {
         float var6 = Math.abs(var1.xr[var5]);
         var4 += var6;
         var2[var5] = (float)Math.sqrt(var6 * Math.sqrt(var6));
         if (var2[var5] > var1.xrpow_max) {
            var1.xrpow_max = var2[var5];
         }
      }

      return var4;
   }

   public final boolean init_xrpow(LameInternalFlags var1, GrInfo var2, float[] var3) {
      float var4 = 0.0F;
      int var5 = var2.max_nonzero_coeff;
      assert var3 != null;
      var2.xrpow_max = 0.0F;
      assert 0 <= var5 && var5 <= 575;
      Arrays.fill(var3, var5, 576, 0.0F);
      var4 = this.init_xrpow_core(var2, var3, var5, var4);
      if (!(var4 > 1.0E-20F)) {
         Arrays.fill(var2.l3_enc, 0, 576, 0);
         return false;
      }

      byte var6 = 0;
      if ((var1.substep_shaping & 2) != 0) {
         var6 = 1;
      }

      for (int var7 = 0; var7 < var2.psymax; var7++) {
         var1.pseudohalf[var7] = var6;
      }

      return true;
   }

   private void psfb21_analogsilence(LameInternalFlags var1, GrInfo var2) {
      ATH var3 = var1.ATH;
      float[] var4 = var2.xr;
      if (var2.block_type != 2) {
         boolean var5 = false;

         for (int var6 = 5; var6 >= 0 && !var5; var6--) {
            int var7 = var1.scalefac_band.psfb21[var6];
            int var8 = var1.scalefac_band.psfb21[var6 + 1];
            float var9 = this.qupvt.athAdjust(var3.adjust, var3.psfb21[var6], var3.floor);
            if (var1.nsPsy.longfact[21] > 1.0E-12F) {
               var9 *= var1.nsPsy.longfact[21];
            }

            for (int var10 = var8 - 1; var10 >= var7; var10--) {
               if (!(Math.abs(var4[var10]) < var9)) {
                  var5 = true;
                  break;
               }

               var4[var10] = 0.0F;
            }
         }
      } else {
         for (int var12 = 0; var12 < 3; var12++) {
            boolean var13 = false;

            for (int var14 = 5; var14 >= 0 && !var13; var14--) {
               int var15 = var1.scalefac_band.s[12] * 3
                  + (var1.scalefac_band.s[13] - var1.scalefac_band.s[12]) * var12
                  + (var1.scalefac_band.psfb12[var14] - var1.scalefac_band.psfb12[0]);
               int var16 = var15 + (var1.scalefac_band.psfb12[var14 + 1] - var1.scalefac_band.psfb12[var14]);
               float var17 = this.qupvt.athAdjust(var3.adjust, var3.psfb12[var14], var3.floor);
               if (var1.nsPsy.shortfact[12] > 1.0E-12F) {
                  var17 *= var1.nsPsy.shortfact[12];
               }

               for (int var11 = var16 - 1; var11 >= var15; var11--) {
                  if (!(Math.abs(var4[var11]) < var17)) {
                     var13 = true;
                     break;
                  }

                  var4[var11] = 0.0F;
               }
            }
         }
      }
   }

   public final void init_outer_loop(LameInternalFlags var1, GrInfo var2) {
      var2.part2_3_length = 0;
      var2.big_values = 0;
      var2.count1 = 0;
      var2.global_gain = 210;
      var2.scalefac_compress = 0;
      var2.table_select[0] = 0;
      var2.table_select[1] = 0;
      var2.table_select[2] = 0;
      var2.subblock_gain[0] = 0;
      var2.subblock_gain[1] = 0;
      var2.subblock_gain[2] = 0;
      var2.subblock_gain[3] = 0;
      var2.region0_count = 0;
      var2.region1_count = 0;
      var2.preflag = 0;
      var2.scalefac_scale = 0;
      var2.count1table_select = 0;
      var2.part2_length = 0;
      var2.sfb_lmax = 21;
      var2.sfb_smin = 12;
      var2.psy_lmax = var1.sfb21_extra ? 22 : 21;
      var2.psymax = var2.psy_lmax;
      var2.sfbmax = var2.sfb_lmax;
      var2.sfbdivide = 11;

      for (int var3 = 0; var3 < 22; var3++) {
         var2.width[var3] = var1.scalefac_band.l[var3 + 1] - var1.scalefac_band.l[var3];
         var2.window[var3] = 3;
      }

      if (var2.block_type == 2) {
         float[] var10 = new float[576];
         var2.sfb_smin = 0;
         var2.sfb_lmax = 0;
         if (var2.mixed_block_flag != 0) {
            var2.sfb_smin = 3;
            var2.sfb_lmax = var1.mode_gr * 2 + 4;
         }

         var2.psymax = var2.sfb_lmax + 3 * ((var1.sfb21_extra ? 13 : 12) - var2.sfb_smin);
         var2.sfbmax = var2.sfb_lmax + 3 * (12 - var2.sfb_smin);
         var2.sfbdivide = var2.sfbmax - 18;
         var2.psy_lmax = var2.sfb_lmax;
         int var4 = var1.scalefac_band.l[var2.sfb_lmax];
         System.arraycopy(var2.xr, 0, var10, 0, 576);

         for (int var5 = var2.sfb_smin; var5 < 13; var5++) {
            int var6 = var1.scalefac_band.s[var5];
            int var7 = var1.scalefac_band.s[var5 + 1];

            for (int var8 = 0; var8 < 3; var8++) {
               for (int var9 = var6; var9 < var7; var9++) {
                  var2.xr[var4++] = var10[3 * var9 + var8];
               }
            }
         }

         int var11 = var2.sfb_lmax;

         for (int var12 = var2.sfb_smin; var12 < 13; var12++) {
            var2.width[var11] = var2.width[var11 + 1] = var2.width[var11 + 2] = var1.scalefac_band.s[var12 + 1] - var1.scalefac_band.s[var12];
            var2.window[var11] = 0;
            var2.window[var11 + 1] = 1;
            var2.window[var11 + 2] = 2;
            var11 += 3;
         }
      }

      var2.count1bits = 0;
      var2.sfb_partition_table = this.qupvt.nr_of_sfb_block[0][0];
      var2.slen[0] = 0;
      var2.slen[1] = 0;
      var2.slen[2] = 0;
      var2.slen[3] = 0;
      var2.max_nonzero_coeff = 575;
      Arrays.fill(var2.scalefac, 0);
      this.psfb21_analogsilence(var1, var2);
   }

   private int bin_search_StepSize(LameInternalFlags var1, GrInfo var2, int var3, int var4, float[] var5) {
      int var7 = var1.CurrentStep[var4];
      boolean var8 = false;
      int var9 = var1.OldValue[var4];
      Quantize.BinSearchDirection var10 = Quantize.BinSearchDirection.BINSEARCH_NONE;
      var2.global_gain = var9;
      var3 -= var2.part2_length;
      assert var7 != 0;

      while (true) {
         int var6 = this.tk.count_bits(var1, var5, var2, null);
         if (var7 == 1 || var6 == var3) {
            assert var2.global_gain >= 0;
            assert var2.global_gain < 256;

            while (var6 > var3 && var2.global_gain < 255) {
               var2.global_gain++;
               var6 = this.tk.count_bits(var1, var5, var2, null);
            }

            var1.CurrentStep[var4] = var9 - var2.global_gain >= 4 ? 4 : 2;
            var1.OldValue[var4] = var2.global_gain;
            var2.part2_3_length = var6;
            return var6;
         }

         int var11;
         if (var6 > var3) {
            if (var10 == Quantize.BinSearchDirection.BINSEARCH_DOWN) {
               var8 = true;
            }

            if (var8) {
               var7 /= 2;
            }

            var10 = Quantize.BinSearchDirection.BINSEARCH_UP;
            var11 = var7;
         } else {
            if (var10 == Quantize.BinSearchDirection.BINSEARCH_UP) {
               var8 = true;
            }

            if (var8) {
               var7 /= 2;
            }

            var10 = Quantize.BinSearchDirection.BINSEARCH_DOWN;
            var11 = -var7;
         }

         var2.global_gain += var11;
         if (var2.global_gain < 0) {
            var2.global_gain = 0;
            var8 = true;
         }

         if (var2.global_gain > 255) {
            var2.global_gain = 255;
            var8 = true;
         }
      }
   }

   public final void trancate_smallspectrums(LameInternalFlags var1, GrInfo var2, float[] var3, float[] var4) {
      float[] var5 = new float[39];
      if ((0 != (var1.substep_shaping & 4) || var2.block_type != 2) && (var1.substep_shaping & 128) == 0) {
         this.qupvt.calc_noise(var2, var3, var5, new CalcNoiseResult(), null);

         for (int var6 = 0; var6 < 576; var6++) {
            float var7 = 0.0F;
            if (var2.l3_enc[var6] != 0) {
               var7 = Math.abs(var2.xr[var6]);
            }

            var4[var6] = var7;
         }

         int var14 = 0;
         int var15 = 8;
         if (var2.block_type == 2) {
            var15 = 6;
         }

         do {
            int var12 = var2.width[var15];
            var14 += var12;
            if (!(var5[var15] >= 1.0)) {
               Arrays.sort(var4, var14 - var12, var12);
               if (!BitStream.EQ(var4[var14 - 1], 0.0F)) {
                  float var8 = (1.0F - var5[var15]) * var3[var15];
                  float var9 = 0.0F;
                  int var11 = 0;

                  do {
                     int var10 = 1;

                     while (var11 + var10 < var12 && !BitStream.NEQ(var4[var11 + var14 - var12], var4[var11 + var14 + var10 - var12])) {
                        var10++;
                     }

                     float var13 = var4[var11 + var14 - var12] * var4[var11 + var14 - var12] * var10;
                     if (var8 < var13) {
                        if (var11 != 0) {
                           var9 = var4[var11 + var14 - var12 - 1];
                        }
                        break;
                     }

                     var8 -= var13;
                     var11 += var10;
                  } while (var11 < var12);

                  if (!BitStream.EQ(var9, 0.0F)) {
                     do {
                        if (Math.abs(var2.xr[var14 - var12]) <= var9) {
                           var2.l3_enc[var14 - var12] = 0;
                        }
                     } while (--var12 > 0);
                  }
               }
            }
         } while (++var15 < var2.psymax);

         var2.part2_3_length = this.tk.noquant_count_bits(var1, var2, null);
      }
   }

   private boolean loop_break(GrInfo var1) {
      for (int var2 = 0; var2 < var1.sfbmax; var2++) {
         if (var1.scalefac[var2] + var1.subblock_gain[var1.window[var2]] == 0) {
            return false;
         }
      }

      return true;
   }

   private double penalties(double var1) {
      return Util.FAST_LOG10((float)(0.368 + 0.632 * var1 * var1 * var1));
   }

   private double get_klemm_noise(float[] var1, GrInfo var2) {
      double var3 = 1.0E-37;

      for (int var5 = 0; var5 < var2.psymax; var5++) {
         var3 += this.penalties(var1[var5]);
      }

      return Math.max(1.0E-20, var3);
   }

   private boolean quant_compare(int var1, CalcNoiseResult var2, CalcNoiseResult var3, GrInfo var4, float[] var5) {
      boolean var6;
      switch (var1) {
         case 0:
            var6 = var3.over_count < var2.over_count
               || var3.over_count == var2.over_count && var3.over_noise < var2.over_noise
               || var3.over_count == var2.over_count && BitStream.EQ(var3.over_noise, var2.over_noise) && var3.tot_noise < var2.tot_noise;
            break;
         case 2:
            var6 = var3.tot_noise < var2.tot_noise;
            break;
         case 3:
            var6 = var3.tot_noise < var2.tot_noise && var3.max_noise < var2.max_noise;
            break;
         case 4:
            var6 = var3.max_noise <= 0.0 && var2.max_noise > 0.2
               || var3.max_noise <= 0.0 && var2.max_noise < 0.0 && var2.max_noise > var3.max_noise - 0.2 && var3.tot_noise < var2.tot_noise
               || var3.max_noise <= 0.0 && var2.max_noise > 0.0 && var2.max_noise > var3.max_noise - 0.2 && var3.tot_noise < var2.tot_noise + var2.over_noise
               || var3.max_noise > 0.0
                  && var2.max_noise > -0.05
                  && var2.max_noise > var3.max_noise - 0.1
                  && var3.tot_noise + var3.over_noise < var2.tot_noise + var2.over_noise
               || var3.max_noise > 0.0
                  && var2.max_noise > -0.1
                  && var2.max_noise > var3.max_noise - 0.15
                  && var3.tot_noise + var3.over_noise + var3.over_noise < var2.tot_noise + var2.over_noise + var2.over_noise;
            break;
         case 5:
            var6 = var3.over_noise < var2.over_noise || BitStream.EQ(var3.over_noise, var2.over_noise) && var3.tot_noise < var2.tot_noise;
            break;
         case 6:
            var6 = var3.over_noise < var2.over_noise
               || BitStream.EQ(var3.over_noise, var2.over_noise)
                  && (var3.max_noise < var2.max_noise || BitStream.EQ(var3.max_noise, var2.max_noise) && var3.tot_noise <= var2.tot_noise);
            break;
         case 7:
            var6 = var3.over_count < var2.over_count || var3.over_noise < var2.over_noise;
            break;
         case 8:
            var3.max_noise = (float)this.get_klemm_noise(var5, var4);
         case 1:
            var6 = var3.max_noise < var2.max_noise;
            break;
         case 9:
         default:
            if (var2.over_count > 0) {
               var6 = var3.over_SSD <= var2.over_SSD;
               if (var3.over_SSD == var2.over_SSD) {
                  var6 = var3.bits < var2.bits;
               }
            } else {
               var6 = var3.max_noise < 0.0F && var3.max_noise * 10.0F + var3.bits <= var2.max_noise * 10.0F + var2.bits;
            }
      }

      if (var2.over_count == 0) {
         var6 = var6 && var3.bits < var2.bits;
      }

      return var6;
   }

   private void amp_scalefac_bands(LameGlobalFlags var1, GrInfo var2, float[] var3, float[] var4, boolean var5) {
      LameInternalFlags var6 = var1.internal_flags;
      float var7;
      if (var2.scalefac_scale == 0) {
         var7 = 1.2968396F;
      } else {
         var7 = 1.6817929F;
      }

      float var8 = 0.0F;

      for (int var9 = 0; var9 < var2.sfbmax; var9++) {
         if (var8 < var3[var9]) {
            var8 = var3[var9];
         }
      }

      int var14 = var6.noise_shaping_amp;
      if (var14 == 3) {
         if (var5) {
            var14 = 2;
         } else {
            var14 = 1;
         }
      }

      switch (var14) {
         case 0:
         default:
            if (var8 > 1.0) {
               var8 = 1.0F;
            } else {
               var8 = (float)(var8 * 0.95);
            }
            break;
         case 1:
            if (var8 > 1.0) {
               var8 = (float)Math.pow(var8, 0.5);
            } else {
               var8 = (float)(var8 * 0.95);
            }
         case 2:
      }

      int var10 = 0;

      for (int var11 = 0; var11 < var2.sfbmax; var11++) {
         int var12 = var2.width[var11];
         var10 += var12;
         if (!(var3[var11] < var8)) {
            if ((var6.substep_shaping & 2) != 0) {
               var6.pseudohalf[var11] = 0 == var6.pseudohalf[var11] ? 1 : 0;
               if (0 == var6.pseudohalf[var11] && var6.noise_shaping_amp == 2) {
                  return;
               }
            }

            var2.scalefac[var11]++;

            for (int var13 = -var12; var13 < 0; var13++) {
               var4[var10 + var13] = var4[var10 + var13] * var7;
               if (var4[var10 + var13] > var2.xrpow_max) {
                  var2.xrpow_max = var4[var10 + var13];
               }
            }

            if (var6.noise_shaping_amp == 2) {
               return;
            }
         }
      }
   }

   private void inc_scalefac_scale(GrInfo var1, float[] var2) {
      float var3 = 1.2968396F;
      int var4 = 0;

      for (int var5 = 0; var5 < var1.sfbmax; var5++) {
         int var6 = var1.width[var5];
         int var7 = var1.scalefac[var5];
         if (var1.preflag != 0) {
            var7 += this.qupvt.pretab[var5];
         }

         var4 += var6;
         if ((var7 & 1) != 0) {
            var7++;

            for (int var8 = -var6; var8 < 0; var8++) {
               var2[var4 + var8] = var2[var4 + var8] * 1.2968396F;
               if (var2[var4 + var8] > var1.xrpow_max) {
                  var1.xrpow_max = var2[var4 + var8];
               }
            }
         }

         var1.scalefac[var5] = var7 >> 1;
      }

      var1.preflag = 0;
      var1.scalefac_scale = 1;
   }

   private boolean inc_subblock_gain(LameInternalFlags var1, GrInfo var2, float[] var3) {
      int[] var5 = var2.scalefac;

      for (int var4 = 0; var4 < var2.sfb_lmax; var4++) {
         if (var5[var4] >= 16) {
            return true;
         }
      }

      for (int var6 = 0; var6 < 3; var6++) {
         int var7 = 0;
         int var8 = 0;

         int var14;
         for (var14 = var2.sfb_lmax + var6; var14 < var2.sfbdivide; var14 += 3) {
            if (var7 < var5[var14]) {
               var7 = var5[var14];
            }
         }

         for (; var14 < var2.sfbmax; var14 += 3) {
            if (var8 < var5[var14]) {
               var8 = var5[var14];
            }
         }

         if (var7 >= 16 || var8 >= 8) {
            if (var2.subblock_gain[var6] >= 7) {
               return true;
            }

            var2.subblock_gain[var6]++;
            int var9 = var1.scalefac_band.l[var2.sfb_lmax];

            for (var14 = var2.sfb_lmax + var6; var14 < var2.sfbmax; var14 += 3) {
               int var11 = var2.width[var14];
               int var12 = var5[var14];
               assert var12 >= 0;
               var12 -= 4 >> var2.scalefac_scale;
               if (var12 >= 0) {
                  var5[var14] = var12;
                  var9 += var11 * 3;
               } else {
                  var5[var14] = 0;
                  int var13 = 210 + (var12 << var2.scalefac_scale + 1);
                  float var10 = this.qupvt.IPOW20(var13);
                  var9 += var11 * (var6 + 1);

                  for (int var21 = -var11; var21 < 0; var21++) {
                     var3[var9 + var21] = var3[var9 + var21] * var10;
                     if (var3[var9 + var21] > var2.xrpow_max) {
                        var2.xrpow_max = var3[var9 + var21];
                     }
                  }

                  var9 += var11 * (3 - var6 - 1);
               }
            }

            float var18 = this.qupvt.IPOW20(202);
            var9 += var2.width[var14] * (var6 + 1);

            for (int var19 = -var2.width[var14]; var19 < 0; var19++) {
               var3[var9 + var19] = var3[var9 + var19] * var18;
               if (var3[var9 + var19] > var2.xrpow_max) {
                  var2.xrpow_max = var3[var9 + var19];
               }
            }
         }
      }

      return false;
   }

   private boolean balance_noise(LameGlobalFlags var1, GrInfo var2, float[] var3, float[] var4, boolean var5) {
      LameInternalFlags var6 = var1.internal_flags;
      this.amp_scalefac_bands(var1, var2, var3, var4, var5);
      boolean var7 = this.loop_break(var2);
      if (var7) {
         return false;
      }

      if (var6.mode_gr == 2) {
         var7 = this.tk.scale_bitcount(var2);
      } else {
         var7 = this.tk.scale_bitcount_lsf(var6, var2);
      }

      if (!var7) {
         return true;
      }

      if (var6.noise_shaping > 1) {
         Arrays.fill(var6.pseudohalf, 0);
         if (0 == var2.scalefac_scale) {
            this.inc_scalefac_scale(var2, var4);
            var7 = false;
         } else if (var2.block_type == 2 && var6.subblock_gain > 0) {
            var7 = this.inc_subblock_gain(var6, var2, var4) || this.loop_break(var2);
         }
      }

      if (!var7) {
         if (var6.mode_gr == 2) {
            var7 = this.tk.scale_bitcount(var2);
         } else {
            var7 = this.tk.scale_bitcount_lsf(var6, var2);
         }
      }

      return !var7;
   }

   public final int outer_loop(LameGlobalFlags var1, GrInfo var2, float[] var3, float[] var4, int var5, int var6) {
      LameInternalFlags var7 = var1.internal_flags;
      GrInfo var8 = new GrInfo();
      float[] var9 = new float[576];
      float[] var10 = new float[39];
      CalcNoiseResult var11 = new CalcNoiseResult();
      CalcNoiseData var13 = new CalcNoiseData();
      int var14 = 9999999;
      boolean var15 = false;
      boolean var16 = false;
      int var17 = 0;
      this.bin_search_StepSize(var7, var2, var6, var5, var4);
      if (0 == var7.noise_shaping) {
         return 100;
      }

      this.qupvt.calc_noise(var2, var3, var10, var11, var13);
      var11.bits = var2.part2_3_length;
      var8.assign(var2);
      int var18 = 0;
      System.arraycopy(var4, 0, var9, 0, 576);

      while (!var15) {
         do {
            CalcNoiseResult var19 = new CalcNoiseResult();
            short var21 = 255;
            byte var20;
            if ((var7.substep_shaping & 2) != 0) {
               var20 = 20;
            } else {
               var20 = 3;
            }

            if (var7.sfb21_extra && (var10[var8.sfbmax] > 1.0 || var8.block_type == 2 && (var10[var8.sfbmax + 1] > 1.0 || var10[var8.sfbmax + 2] > 1.0))
               || !this.balance_noise(var1, var8, var10, var4, var16)) {
               break;
            }

            if (var8.scalefac_scale != 0) {
               var21 = 254;
            }

            int var22 = var6 - var8.part2_length;
            if (var22 <= 0) {
               break;
            }

            while ((var8.part2_3_length = this.tk.count_bits(var7, var4, var8, var13)) > var22 && var8.global_gain <= var21) {
               var8.global_gain++;
            }

            if (var8.global_gain > var21) {
               break;
            }

            if (var11.over_count == 0) {
               while ((var8.part2_3_length = this.tk.count_bits(var7, var4, var8, var13)) > var14 && var8.global_gain <= var21) {
                  var8.global_gain++;
               }

               if (var8.global_gain > var21) {
                  break;
               }
            }

            this.qupvt.calc_noise(var8, var3, var10, var19, var13);
            var19.bits = var8.part2_3_length;
            int var12;
            if (var2.block_type != 2) {
               var12 = var1.quant_comp;
            } else {
               var12 = var1.quant_comp_short;
            }

            boolean var23 = this.quant_compare(var12, var11, var19, var8, var10);
            if (var23) {
               var14 = var2.part2_3_length;
               var11 = var19;
               var2.assign(var8);
               var18 = 0;
               System.arraycopy(var4, 0, var9, 0, 576);
            } else if (var7.full_outer_loop == 0) {
               var18++;
               if (var18 > var20 && var11.over_count == 0
                  || var7.noise_shaping_amp == 3 && var16 && var18 > 30
                  || var7.noise_shaping_amp == 3 && var16 && var8.global_gain - var17 > 15) {
                  break;
               }
            }
         } while (var8.global_gain + var8.scalefac_scale < 255);

         if (var7.noise_shaping_amp == 3) {
            if (!var16) {
               var8.assign(var2);
               System.arraycopy(var9, 0, var4, 0, 576);
               var18 = 0;
               var17 = var8.global_gain;
               var16 = true;
            } else {
               var15 = true;
            }
         } else {
            var15 = true;
         }
      }

      assert var2.global_gain + var2.scalefac_scale <= 255;
      if (var1.getVBR() == VbrMode.vbr_rh || var1.getVBR() == VbrMode.vbr_mtrh) {
         System.arraycopy(var9, 0, var4, 0, 576);
      } else if ((var7.substep_shaping & 1) != 0) {
         this.trancate_smallspectrums(var7, var2, var3, var4);
      }

      return var11.over_count;
   }

   public final void iteration_finish_one(LameInternalFlags var1, int var2, int var3) {
      IIISideInfo var4 = var1.l3_side;
      GrInfo var5 = var4.tt[var2][var3];
      this.tk.best_scalefac_store(var1, var2, var3, var4);
      if (var1.use_best_huffman == 1) {
         this.tk.best_huffman_divide(var1, var5);
      }

      this.rv.ResvAdjust(var1, var5);
   }

   public final void VBR_encode_granule(LameGlobalFlags var1, GrInfo var2, float[] var3, float[] var4, int var5, int var6, int var7) {
      LameInternalFlags var8 = var1.internal_flags;
      GrInfo var9 = new GrInfo();
      float[] var10 = new float[576];
      int var11 = var7;
      int var12 = var7 + 1;
      int var13 = (var7 + var6) / 2;
      byte var16 = 0;
      boolean var17 = var8.sfb21_extra;
      assert var11 <= 4095;
      Arrays.fill(var9.l3_enc, 0);

      int var14;
      do {
         assert var13 >= var6;
         assert var13 <= var7;
         assert var6 <= var7;
         if (var13 > var11 - 42) {
            var8.sfb21_extra = false;
         } else {
            var8.sfb21_extra = var17;
         }

         int var15 = this.outer_loop(var1, var2, var3, var4, var5, var13);
         if (var15 <= 0) {
            var16 = 1;
            var12 = var2.part2_3_length;
            var9.assign(var2);
            System.arraycopy(var4, 0, var10, 0, 576);
            var7 = var12 - 32;
            var14 = var7 - var6;
            var13 = (var7 + var6) / 2;
         } else {
            var6 = var13 + 32;
            var14 = var7 - var6;
            var13 = (var7 + var6) / 2;
            if (var16 != 0) {
               var16 = 2;
               var2.assign(var9);
               System.arraycopy(var10, 0, var4, 0, 576);
            }
         }
      } while (var14 > 12);

      var8.sfb21_extra = var17;
      if (var16 == 2) {
         System.arraycopy(var9.l3_enc, 0, var2.l3_enc, 0, 576);
      }

      assert var2.part2_3_length <= var11;
   }

   public final void get_framebits(LameGlobalFlags var1, int[] var2) {
      LameInternalFlags var3 = var1.internal_flags;
      var3.bitrate_index = var3.VBR_min_bitrate;
      int var4 = this.bs.getframebits(var1);
      var3.bitrate_index = 1;
      var4 = this.bs.getframebits(var1);

      for (int var5 = 1; var5 <= var3.VBR_max_bitrate; var5++) {
         var3.bitrate_index = var5;
         MeanBits var6 = new MeanBits(var4);
         var2[var5] = this.rv.ResvFrameBegin(var1, var6);
         var4 = var6.bits;
      }
   }

   public final int VBR_old_prepare(
      LameGlobalFlags var1, float[][] var2, float[] var3, III_psy_ratio[][] var4, float[][][] var5, int[] var6, int[][] var7, int[][] var8, int[][] var9
   ) {
      LameInternalFlags var10 = var1.internal_flags;
      float var12 = 0.0F;
      byte var13 = 1;
      int var14 = 0;
      var10.bitrate_index = var10.VBR_max_bitrate;
      int var15 = this.rv.ResvFrameBegin(var1, new MeanBits(0)) / var10.mode_gr;
      this.get_framebits(var1, var6);

      for (int var16 = 0; var16 < var10.mode_gr; var16++) {
         int var17 = this.qupvt.on_pe(var1, var2, var8[var16], var15, var16, 0);
         if (var10.mode_ext == 2) {
            this.ms_convert(var10.l3_side, var16);
            this.qupvt.reduce_side(var8[var16], var3[var16], var15, var17);
         }

         for (int var18 = 0; var18 < var10.channels_out; var18++) {
            GrInfo var19 = var10.l3_side.tt[var16][var18];
            float var11;
            if (var19.block_type != 2) {
               var12 = 1.28F / (1.0F + (float)Math.exp(3.5 - var2[var16][var18] / 300.0)) - 0.05F;
               var11 = var10.PSY.mask_adjust - var12;
            } else {
               var12 = 2.56F / (1.0F + (float)Math.exp(3.5 - var2[var16][var18] / 300.0)) - 0.14F;
               var11 = var10.PSY.mask_adjust_short - var12;
            }

            var10.masking_lower = (float)Math.pow(10.0, var11 * 0.1);
            this.init_outer_loop(var10, var19);
            var9[var16][var18] = this.qupvt.calc_xmin(var1, var4[var16][var18], var19, var5[var16][var18]);
            if (var9[var16][var18] != 0) {
               var13 = 0;
            }

            var7[var16][var18] = 126;
            var14 += var8[var16][var18];
         }
      }

      for (int var22 = 0; var22 < var10.mode_gr; var22++) {
         for (int var23 = 0; var23 < var10.channels_out; var23++) {
            if (var14 > var6[var10.VBR_max_bitrate]) {
               var8[var22][var23] = var8[var22][var23] * var6[var10.VBR_max_bitrate];
               var8[var22][var23] = var8[var22][var23] / var14;
            }

            if (var7[var22][var23] > var8[var22][var23]) {
               var7[var22][var23] = var8[var22][var23];
            }
         }
      }

      return var13;
   }

   public final void bitpressure_strategy(LameInternalFlags var1, float[][][] var2, int[][] var3, int[][] var4) {
      for (int var5 = 0; var5 < var1.mode_gr; var5++) {
         for (int var6 = 0; var6 < var1.channels_out; var6++) {
            GrInfo var7 = var1.l3_side.tt[var5][var6];
            float[] var8 = var2[var5][var6];
            int var9 = 0;

            for (int var10 = 0; var10 < var7.psy_lmax; var10++) {
               int var10001 = var9++;
               var8[var10001] = (float)(var8[var10001] * (1.0 + 0.029 * var10 * var10 / 22.0 / 22.0));
            }

            if (var7.block_type == 2) {
               for (int var13 = var7.sfb_smin; var13 < 13; var13++) {
                  int var14 = var9++;
                  var8[var14] = (float)(var8[var14] * (1.0 + 0.029 * var13 * var13 / 13.0 / 13.0));
                  var14 = var9++;
                  var8[var14] = (float)(var8[var14] * (1.0 + 0.029 * var13 * var13 / 13.0 / 13.0));
                  var14 = var9++;
                  var8[var14] = (float)(var8[var14] * (1.0 + 0.029 * var13 * var13 / 13.0 / 13.0));
               }
            }

            var4[var5][var6] = (int)Math.max(var3[var5][var6], 0.9 * var4[var5][var6]);
         }
      }
   }

   public final int VBR_new_prepare(LameGlobalFlags var1, float[][] var2, III_psy_ratio[][] var3, float[][][] var4, int[] var5, int[][] var6) {
      LameInternalFlags var7 = var1.internal_flags;
      byte var8 = 1;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (!var1.free_format) {
         var7.bitrate_index = var7.VBR_max_bitrate;
         MeanBits var12 = new MeanBits(var9);
         this.rv.ResvFrameBegin(var1, var12);
         var9 = var12.bits;
         this.get_framebits(var1, var5);
         var11 = var5[var7.VBR_max_bitrate];
      } else {
         var7.bitrate_index = 0;
         MeanBits var16 = new MeanBits(var9);
         var11 = this.rv.ResvFrameBegin(var1, var16);
         var9 = var16.bits;
         var5[0] = var11;
      }

      for (int var17 = 0; var17 < var7.mode_gr; var17++) {
         this.qupvt.on_pe(var1, var2, var6[var17], var9, var17, 0);
         if (var7.mode_ext == 2) {
            this.ms_convert(var7.l3_side, var17);
         }

         for (int var13 = 0; var13 < var7.channels_out; var13++) {
            GrInfo var14 = var7.l3_side.tt[var17][var13];
            var7.masking_lower = (float)Math.pow(10.0, var7.PSY.mask_adjust * 0.1);
            this.init_outer_loop(var7, var14);
            if (0 != this.qupvt.calc_xmin(var1, var3[var17][var13], var14, var4[var17][var13])) {
               var8 = 0;
            }

            var10 += var6[var17][var13];
         }
      }

      for (int var18 = 0; var18 < var7.mode_gr; var18++) {
         for (int var19 = 0; var19 < var7.channels_out; var19++) {
            if (var10 > var11) {
               var6[var18][var19] = var6[var18][var19] * var11;
               var6[var18][var19] = var6[var18][var19] / var10;
            }
         }
      }

      return var8;
   }

   public final void calc_target_bits(LameGlobalFlags var1, float[][] var2, float[] var3, int[][] var4, int[] var5, int[] var6) {
      LameInternalFlags var7 = var1.internal_flags;
      IIISideInfo var8 = var7.l3_side;
      int var13 = 0;
      var7.bitrate_index = var7.VBR_max_bitrate;
      MeanBits var14 = new MeanBits(var13);
      var6[0] = this.rv.ResvFrameBegin(var1, var14);
      var13 = var14.bits;
      var7.bitrate_index = 1;
      var13 = this.bs.getframebits(var1) - var7.sideinfo_len * 8;
      var5[0] = var13 / (var7.mode_gr * var7.channels_out);
      var13 = var1.VBR_mean_bitrate_kbps * var1.getFrameSize() * 1000;
      if ((var7.substep_shaping & 1) != 0) {
         var13 = (int)(var13 * 1.09);
      }

      var13 /= var1.getOutSampleRate();
      var13 -= var7.sideinfo_len * 8;
      var13 /= var7.mode_gr * var7.channels_out;
      float var9 = 0.93F + 0.07F * (11.0F - var1.compression_ratio) / 5.5F;
      if (var9 < 0.9) {
         var9 = 0.9F;
      }

      if (var9 > 1.0) {
         var9 = 1.0F;
      }

      for (int var10 = 0; var10 < var7.mode_gr; var10++) {
         int var15 = 0;

         for (int var11 = 0; var11 < var7.channels_out; var11++) {
            var4[var10][var11] = (int)(var9 * var13);
            if (var2[var10][var11] > 700.0F) {
               int var16 = (int)((var2[var10][var11] - 700.0F) / 1.4);
               GrInfo var17 = var8.tt[var10][var11];
               var4[var10][var11] = (int)(var9 * var13);
               if (var17.block_type == 2 && var16 < var13 / 2) {
                  var16 = var13 / 2;
               }

               if (var16 > var13 * 3 / 2) {
                  var16 = var13 * 3 / 2;
               } else if (var16 < 0) {
                  var16 = 0;
               }

               var4[var10][var11] = var4[var10][var11] + var16;
            }

            if (var4[var10][var11] > 4095) {
               var4[var10][var11] = 4095;
            }

            var15 += var4[var10][var11];
         }

         if (var15 > 7680) {
            for (int var21 = 0; var21 < var7.channels_out; var21++) {
               var4[var10][var21] = var4[var10][var21] * 7680;
               var4[var10][var21] = var4[var10][var21] / var15;
            }
         }
      }

      if (var7.mode_ext == 2) {
         for (int var18 = 0; var18 < var7.mode_gr; var18++) {
            this.qupvt.reduce_side(var4[var18], var3[var18], var13 * var7.channels_out, 7680);
         }
      }

      int var12 = 0;

      for (int var19 = 0; var19 < var7.mode_gr; var19++) {
         for (int var22 = 0; var22 < var7.channels_out; var22++) {
            if (var4[var19][var22] > 4095) {
               var4[var19][var22] = 4095;
            }

            var12 += var4[var19][var22];
         }
      }

      if (var12 > var6[0]) {
         for (int var20 = 0; var20 < var7.mode_gr; var20++) {
            for (int var23 = 0; var23 < var7.channels_out; var23++) {
               var4[var20][var23] = var4[var20][var23] * var6[0];
               var4[var20][var23] = var4[var20][var23] / var12;
            }
         }
      }
   }

   private enum BinSearchDirection {
      BINSEARCH_NONE,
      BINSEARCH_UP,
      BINSEARCH_DOWN;
   }
}
