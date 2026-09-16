package net.sourceforge.lame.mp3;

import java.util.Arrays;

public class Takehiro {
   public static final int[] slen1_tab = new int[]{0, 0, 0, 0, 3, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4};
   public static final int[] slen2_tab = new int[]{0, 1, 2, 3, 0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3};
   private static final int[] huf_tbl_noESC = new int[]{1, 2, 5, 7, 7, 10, 10, 13, 13, 13, 13, 13, 13, 13, 13};
   private static final int[] slen1_n = new int[]{1, 1, 1, 1, 8, 2, 2, 2, 4, 4, 4, 8, 8, 8, 16, 16};
   private static final int[] slen2_n = new int[]{1, 2, 4, 8, 1, 2, 4, 8, 2, 4, 8, 2, 4, 8, 4, 8};
   private static final int[] scale_short = new int[]{0, 18, 36, 54, 54, 36, 54, 72, 54, 72, 90, 72, 90, 108, 108, 126};
   private static final int[] scale_mixed = new int[]{0, 18, 36, 54, 51, 35, 53, 71, 52, 70, 88, 69, 87, 105, 104, 122};
   private static final int[] scale_long = new int[]{0, 10, 20, 30, 33, 21, 31, 41, 32, 42, 52, 43, 53, 63, 64, 74};
   private static final int[][] max_range_sfac_tab = new int[][]{{15, 15, 7, 7}, {15, 15, 7, 0}, {7, 3, 0, 0}, {15, 31, 31, 0}, {7, 7, 7, 0}, {3, 3, 0, 0}};
   private static final int[] log2tab = new int[]{0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4};
   QuantizePVT qupvt;
   private int[][] subdv_table = new int[][]{
      {0, 0},
      {0, 0},
      {0, 0},
      {0, 0},
      {0, 0},
      {0, 1},
      {1, 1},
      {1, 1},
      {1, 2},
      {2, 2},
      {2, 3},
      {2, 3},
      {3, 4},
      {3, 4},
      {3, 4},
      {4, 5},
      {4, 5},
      {4, 6},
      {5, 6},
      {5, 6},
      {5, 7},
      {6, 7},
      {6, 7}
   };

   public final void setModules(QuantizePVT var1) {
      this.qupvt = var1;
   }

   private void quantize_lines_xrpow_01(int var1, float var2, float[] var3, int var4, int[] var5, int var6) {
      float var7 = 0.59459996F / var2;
      assert var1 > 0;
      var1 >>= 1;

      while (var1-- != 0) {
         var5[var6++] = var7 > var3[var4++] ? 0 : 1;
         var5[var6++] = var7 > var3[var4++] ? 0 : 1;
      }
   }

   private void quantize_lines_xrpow(int var1, float var2, float[] var3, int var4, int[] var5, int var6) {
      assert var1 > 0;
      var1 >>= 1;
      int var7 = var1 % 2;
      var1 >>= 1;

      while (var1-- != 0) {
         float var8 = var3[var4++] * var2;
         float var9 = var3[var4++] * var2;
         int var12 = (int)var8;
         float var10 = var3[var4++] * var2;
         int var13 = (int)var9;
         float var11 = var3[var4++] * var2;
         int var14 = (int)var10;
         var8 += this.qupvt.adj43[var12];
         int var15 = (int)var11;
         var9 += this.qupvt.adj43[var13];
         var5[var6++] = (int)var8;
         var10 += this.qupvt.adj43[var14];
         var5[var6++] = (int)var9;
         var11 += this.qupvt.adj43[var15];
         var5[var6++] = (int)var10;
         var5[var6++] = (int)var11;
      }

      if (var7 != 0) {
         float var29 = var3[var4++] * var2;
         float var32 = var3[var4++] * var2;
         int var35 = (int)var29;
         int var37 = (int)var32;
         var29 += this.qupvt.adj43[var35];
         var32 += this.qupvt.adj43[var37];
         var5[var6++] = (int)var29;
         var5[var6++] = (int)var32;
      }
   }

   private void quantize_xrpow(float[] var1, int[] var2, float var3, GrInfo var4, CalcNoiseData var5) {
      int var8 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int[] var13 = var2;
      int var14 = 0;
      int[] var15 = var13;
      int var16 = 0;
      float[] var17 = var1;
      int var18 = 0;
      boolean var9 = var5 != null && var4.global_gain == var5.global_gain;
      byte var7;
      if (var4.block_type == 2) {
         var7 = 38;
      } else {
         var7 = 21;
      }

      for (int var6 = 0; var6 <= var7; var6++) {
         int var19 = -1;
         if (var9 || var4.block_type == 0) {
            var19 = var4.global_gain
               - (var4.scalefac[var6] + (var4.preflag != 0 ? this.qupvt.pretab[var6] : 0) << var4.scalefac_scale + 1)
               - var4.subblock_gain[var4.window[var6]] * 8;
         }

         assert var4.width[var6] >= 0;
         if (var9 && var5.step[var6] == var19) {
            if (var10 != 0) {
               this.quantize_lines_xrpow(var10, var3, var17, var18, var15, var16);
               var10 = 0;
            }

            if (var11 != 0) {
               this.quantize_lines_xrpow_01(var11, var3, var17, var18, var15, var16);
               var11 = 0;
            }
         } else {
            int var20 = var4.width[var6];
            if (var8 + var4.width[var6] > var4.max_nonzero_coeff) {
               int var21 = var4.max_nonzero_coeff - var8 + 1;
               Arrays.fill(var2, var4.max_nonzero_coeff, 576, 0);
               var20 = var21;
               if (var20 < 0) {
                  var20 = 0;
               }

               var6 = var7 + 1;
            }

            if (0 == var10 && 0 == var11) {
               var15 = var13;
               var16 = var14;
               var17 = var1;
               var18 = var12;
            }

            if (var5 != null && var5.sfb_count1 > 0 && var6 >= var5.sfb_count1 && var5.step[var6] > 0 && var19 >= var5.step[var6]) {
               if (var10 != 0) {
                  this.quantize_lines_xrpow(var10, var3, var17, var18, var15, var16);
                  var10 = 0;
                  var15 = var13;
                  var16 = var14;
                  var17 = var1;
                  var18 = var12;
               }

               var11 += var20;
            } else {
               if (var11 != 0) {
                  this.quantize_lines_xrpow_01(var11, var3, var17, var18, var15, var16);
                  var11 = 0;
                  var15 = var13;
                  var16 = var14;
                  var17 = var1;
                  var18 = var12;
               }

               var10 += var20;
            }

            if (var20 <= 0) {
               if (var11 != 0) {
                  this.quantize_lines_xrpow_01(var11, var3, var17, var18, var15, var16);
                  var11 = 0;
               }

               if (var10 != 0) {
                  this.quantize_lines_xrpow(var10, var3, var17, var18, var15, var16);
                  var10 = 0;
               }
               break;
            }
         }

         if (var6 <= var7) {
            var14 += var4.width[var6];
            var12 += var4.width[var6];
            var8 += var4.width[var6];
         }
      }

      if (var10 != 0) {
         this.quantize_lines_xrpow(var10, var3, var17, var18, var15, var16);
         boolean var22 = false;
      }

      if (var11 != 0) {
         this.quantize_lines_xrpow_01(var11, var3, var17, var18, var15, var16);
         boolean var23 = false;
      }
   }

   private int ix_max(int[] var1, int var2, int var3) {
      int var4 = 0;
      int var5 = 0;

      do {
         int var6 = var1[var2++];
         int var7 = var1[var2++];
         if (var4 < var6) {
            var4 = var6;
         }

         if (var5 < var7) {
            var5 = var7;
         }
      } while (var2 < var3);

      if (var4 < var5) {
         var4 = var5;
      }

      return var4;
   }

   private int count_bit_ESC(int[] var1, int var2, int var3, int var4, int var5, Takehiro.Bits var6) {
      int var7 = Tables.ht[var4].xlen * 65536 + Tables.ht[var5].xlen;
      int var8 = 0;

      do {
         int var10 = var1[var2++];
         int var11 = var1[var2++];
         if (var10 != 0) {
            if (var10 > 14) {
               var10 = 15;
               var8 += var7;
            }

            var10 *= 16;
         }

         if (var11 != 0) {
            if (var11 > 14) {
               var11 = 15;
               var8 += var7;
            }

            var10 += var11;
         }

         var8 += Tables.largetbl[var10];
      } while (var2 < var3);

      int var9 = var8 & 65535;
      var8 >>= 16;
      if (var8 > var9) {
         var8 = var9;
         var4 = var5;
      }

      var6.bits += var8;
      return var4;
   }

   private int count_bit_noESC(int[] var1, int var2, int var3, Takehiro.Bits var4) {
      int var5 = 0;
      int[] var6 = Tables.ht[1].hlen;

      do {
         int var7 = var1[var2 + 0] * 2 + var1[var2 + 1];
         var2 += 2;
         var5 += var6[var7];
      } while (var2 < var3);

      var4.bits += var5;
      return 1;
   }

   private int count_bit_noESC_from2(int[] var1, int var2, int var3, int var4, Takehiro.Bits var5) {
      int var6 = 0;
      int var8 = Tables.ht[var4].xlen;
      int[] var9;
      if (var4 == 2) {
         var9 = Tables.table23;
      } else {
         var9 = Tables.table56;
      }

      do {
         int var10 = var1[var2 + 0] * var8 + var1[var2 + 1];
         var2 += 2;
         var6 += var9[var10];
      } while (var2 < var3);

      int var7 = var6 & 65535;
      var6 >>= 16;
      if (var6 > var7) {
         var6 = var7;
         var4++;
      }

      var5.bits += var6;
      return var4;
   }

   private int count_bit_noESC_from3(int[] var1, int var2, int var3, int var4, Takehiro.Bits var5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = Tables.ht[var4].xlen;
      int[] var10 = Tables.ht[var4].hlen;
      int[] var11 = Tables.ht[var4 + 1].hlen;
      int[] var12 = Tables.ht[var4 + 2].hlen;

      do {
         int var13 = var1[var2 + 0] * var9 + var1[var2 + 1];
         var2 += 2;
         var6 += var10[var13];
         var7 += var11[var13];
         var8 += var12[var13];
      } while (var2 < var3);

      int var14 = var4;
      if (var6 > var7) {
         var6 = var7;
         var14++;
      }

      if (var6 > var8) {
         var6 = var8;
         var14 = var4 + 2;
      }

      var5.bits += var6;
      return var14;
   }

   private int choose_table(int[] var1, int var2, int var3, Takehiro.Bits var4) {
      int var5 = this.ix_max(var1, var2, var3);
      switch (var5) {
         case 0:
            return var5;
         case 1:
            return this.count_bit_noESC(var1, var2, var3, var4);
         case 2:
         case 3:
            return this.count_bit_noESC_from2(var1, var2, var3, huf_tbl_noESC[var5 - 1], var4);
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            return this.count_bit_noESC_from3(var1, var2, var3, huf_tbl_noESC[var5 - 1], var4);
         default:
            if (var5 > 8206) {
               var4.bits = 100000;
               return -1;
            } else {
               var5 -= 15;
               int var6 = 24;

               while (var6 < 32 && Tables.ht[var6].linmax < var5) {
                  var6++;
               }

               int var7 = var6 - 8;

               while (var7 < 24 && Tables.ht[var7].linmax < var5) {
                  var7++;
               }

               return this.count_bit_ESC(var1, var2, var3, var7, var6, var4);
            }
      }
   }

   public int noquant_count_bits(LameInternalFlags var1, GrInfo var2, CalcNoiseData var3) {
      int[] var4 = var2.l3_enc;
      int var5 = Math.min(576, var2.max_nonzero_coeff + 2 >> 1 << 1);
      if (var3 != null) {
         var3.sfb_count1 = 0;
      }

      while (var5 > 1 && (var4[var5 - 1] | var4[var5 - 2]) == 0) {
         var5 -= 2;
      }

      var2.count1 = var5;
      int var6 = 0;
      int var7 = 0;

      while (var5 > 3 && ((var4[var5 - 1] | var4[var5 - 2] | var4[var5 - 3] | var4[var5 - 4]) & 4294967295L) <= 1L) {
         int var8 = ((var4[var5 - 4] * 2 + var4[var5 - 3]) * 2 + var4[var5 - 2]) * 2 + var4[var5 - 1];
         var6 += Tables.t32l[var8];
         var7 += Tables.t33l[var8];
         var5 -= 4;
      }

      int var16 = var6;
      var2.count1table_select = 0;
      if (var6 > var7) {
         var16 = var7;
         var2.count1table_select = 1;
      }

      var2.count1bits = var16;
      var2.big_values = var5;
      if (var5 == 0) {
         return var16;
      }

      if (var2.block_type == 2) {
         var6 = 3 * var1.scalefac_band.s[3];
         if (var6 > var2.big_values) {
            var6 = var2.big_values;
         }

         var7 = var2.big_values;
      } else if (var2.block_type == 0) {
         assert var5 <= 576;
         var6 = var2.region0_count = var1.bv_scf[var5 - 2];
         var7 = var2.region1_count = var1.bv_scf[var5 - 1];
         assert var6 + var7 + 2 < 21;
         var7 = var1.scalefac_band.l[var6 + var7 + 2];
         var6 = var1.scalefac_band.l[var6 + 1];
         if (var7 < var5) {
            Takehiro.Bits var9 = new Takehiro.Bits(var16);
            var2.table_select[2] = this.choose_table(var4, var7, var5, var9);
            var16 = var9.bits;
         }
      } else {
         var2.region0_count = 7;
         var2.region1_count = 13;
         var6 = var1.scalefac_band.l[8];
         var7 = var5;
         if (var6 > var7) {
            var6 = var7;
         }
      }

      var6 = Math.min(var6, var5);
      var7 = Math.min(var7, var5);
      assert var6 >= 0;
      assert var7 >= 0;
      if (0 < var6) {
         Takehiro.Bits var17 = new Takehiro.Bits(var16);
         var2.table_select[0] = this.choose_table(var4, 0, var6, var17);
         var16 = var17.bits;
      }

      if (var6 < var7) {
         Takehiro.Bits var18 = new Takehiro.Bits(var16);
         var2.table_select[1] = this.choose_table(var4, var6, var7, var18);
         var16 = var18.bits;
      }

      if (var1.use_best_huffman == 2) {
         var2.part2_3_length = var16;
         this.best_huffman_divide(var1, var2);
         var16 = var2.part2_3_length;
      }

      if (var3 != null && var2.block_type == 0) {
         int var19 = 0;

         while (var1.scalefac_band.l[var19] < var2.big_values) {
            var19++;
         }

         var3.sfb_count1 = var19;
      }

      return var16;
   }

   public int count_bits(LameInternalFlags var1, float[] var2, GrInfo var3, CalcNoiseData var4) {
      int[] var5 = var3.l3_enc;
      float var6 = 8206.0F / this.qupvt.IPOW20(var3.global_gain);
      if (var3.xrpow_max > var6) {
         return 100000;
      }

      this.quantize_xrpow(var2, var5, this.qupvt.IPOW20(var3.global_gain), var3, var4);
      if ((var1.substep_shaping & 2) != 0) {
         int var7 = 0;
         int var8 = var3.global_gain + var3.scalefac_scale;
         float var9 = 0.63452166F / this.qupvt.IPOW20(var8);

         for (int var10 = 0; var10 < var3.sfbmax; var10++) {
            int var11 = var3.width[var10];
            assert var11 >= 0;
            if (0 == var1.pseudohalf[var10]) {
               var7 += var11;
            } else {
               int var12 = var7;

               for (var7 += var11; var12 < var7; var12++) {
                  var5[var12] = var2[var12] >= var9 ? var5[var12] : 0;
               }
            }
         }
      }

      return this.noquant_count_bits(var1, var3, var4);
   }

   private void recalc_divide_init(LameInternalFlags var1, GrInfo var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7) {
      int var8 = var2.big_values;

      for (int var9 = 0; var9 <= 22; var9++) {
         var4[var9] = 100000;
      }

      for (int var18 = 0; var18 < 16; var18++) {
         int var10 = var1.scalefac_band.l[var18 + 1];
         if (var10 >= var8) {
            break;
         }

         int var11 = 0;
         Takehiro.Bits var12 = new Takehiro.Bits(var11);
         int var13 = this.choose_table(var3, 0, var10, var12);
         var11 = var12.bits;

         for (int var14 = 0; var14 < 8; var14++) {
            int var15 = var1.scalefac_band.l[var18 + var14 + 2];
            if (var15 < var8) {
               int var16 = var11;
               var12 = new Takehiro.Bits(var16);
               int var17 = this.choose_table(var3, var10, var15, var12);
               var16 = var12.bits;
               if (var4[var18 + var14] > var16) {
                  var4[var18 + var14] = var16;
                  var5[var18 + var14] = var18;
                  var6[var18 + var14] = var13;
                  var7[var18 + var14] = var17;
               }
               continue;
            }
         }
      }
   }

   private void recalc_divide_sub(LameInternalFlags var1, GrInfo var2, GrInfo var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8) {
      int var9 = var2.big_values;

      for (int var10 = 2; var10 < 23; var10++) {
         int var11 = var1.scalefac_band.l[var10];
         if (var11 >= var9) {
            break;
         }

         int var12 = var5[var10 - 2] + var2.count1bits;
         if (var3.part2_3_length <= var12) {
            break;
         }

         Takehiro.Bits var13 = new Takehiro.Bits(var12);
         int var14 = this.choose_table(var4, var11, var9, var13);
         var12 = var13.bits;
         if (var3.part2_3_length > var12) {
            var3.assign(var2);
            var3.part2_3_length = var12;
            var3.region0_count = var6[var10 - 2];
            var3.region1_count = var10 - 2 - var6[var10 - 2];
            var3.table_select[0] = var7[var10 - 2];
            var3.table_select[1] = var8[var10 - 2];
            var3.table_select[2] = var14;
         }
      }
   }

   public void best_huffman_divide(LameInternalFlags var1, GrInfo var2) {
      GrInfo var3 = new GrInfo();
      int[] var4 = var2.l3_enc;
      int[] var5 = new int[23];
      int[] var6 = new int[23];
      int[] var7 = new int[23];
      int[] var8 = new int[23];
      if (var2.block_type != 2 || var1.mode_gr != 1) {
         var3.assign(var2);
         if (var2.block_type == 0) {
            this.recalc_divide_init(var1, var2, var4, var5, var6, var7, var8);
            this.recalc_divide_sub(var1, var3, var2, var4, var5, var6, var7, var8);
         }

         int var9 = var3.big_values;
         if (var9 != 0 && (var4[var9 - 2] | var4[var9 - 1]) <= 1) {
            var9 = var2.count1 + 2;
            if (var9 <= 576) {
               var3.assign(var2);
               var3.count1 = var9;
               int var10 = 0;
               int var11 = 0;
               assert var9 <= 576;

               while (var9 > var3.big_values) {
                  int var12 = ((var4[var9 - 4] * 2 + var4[var9 - 3]) * 2 + var4[var9 - 2]) * 2 + var4[var9 - 1];
                  var10 += Tables.t32l[var12];
                  var11 += Tables.t33l[var12];
                  var9 -= 4;
               }

               var3.big_values = var9;
               var3.count1table_select = 0;
               if (var10 > var11) {
                  var10 = var11;
                  var3.count1table_select = 1;
               }

               var3.count1bits = var10;
               if (var3.block_type == 0) {
                  this.recalc_divide_sub(var1, var3, var2, var4, var5, var6, var7, var8);
               } else {
                  var3.part2_3_length = var10;
                  var10 = var1.scalefac_band.l[8];
                  if (var10 > var9) {
                     var10 = var9;
                  }

                  if (var10 > 0) {
                     Takehiro.Bits var15 = new Takehiro.Bits(var3.part2_3_length);
                     var3.table_select[0] = this.choose_table(var4, 0, var10, var15);
                     var3.part2_3_length = var15.bits;
                  }

                  if (var9 > var10) {
                     Takehiro.Bits var16 = new Takehiro.Bits(var3.part2_3_length);
                     var3.table_select[1] = this.choose_table(var4, var10, var9, var16);
                     var3.part2_3_length = var16.bits;
                  }

                  if (var2.part2_3_length > var3.part2_3_length) {
                     var2.assign(var3);
                  }
               }
            }
         }
      }
   }

   private void scfsi_calc(int var1, IIISideInfo var2) {
      GrInfo var4 = var2.tt[1][var1];
      GrInfo var5 = var2.tt[0][var1];

      for (int var6 = 0; var6 < Tables.scfsi_band.length - 1; var6++) {
         int var3 = Tables.scfsi_band[var6];

         while (var3 < Tables.scfsi_band[var6 + 1] && (var5.scalefac[var3] == var4.scalefac[var3] || var4.scalefac[var3] < 0)) {
            var3++;
         }

         if (var3 == Tables.scfsi_band[var6 + 1]) {
            for (int var12 = Tables.scfsi_band[var6]; var12 < Tables.scfsi_band[var6 + 1]; var12++) {
               var4.scalefac[var12] = -1;
            }

            var2.scfsi[var1][var6] = 1;
         }
      }

      int var14 = 0;
      int var7 = 0;

      int var13;
      for (var13 = 0; var13 < 11; var13++) {
         if (var4.scalefac[var13] != -1) {
            var7++;
            if (var14 < var4.scalefac[var13]) {
               var14 = var4.scalefac[var13];
            }
         }
      }

      int var8 = 0;
      int var9 = 0;

      while (var13 < 21) {
         if (var4.scalefac[var13] != -1) {
            var9++;
            if (var8 < var4.scalefac[var13]) {
               var8 = var4.scalefac[var13];
            }
         }

         var13++;
      }

      for (int var10 = 0; var10 < 16; var10++) {
         if (var14 < slen1_n[var10] && var8 < slen2_n[var10]) {
            int var11 = slen1_tab[var10] * var7 + slen2_tab[var10] * var9;
            if (var4.part2_length > var11) {
               var4.part2_length = var11;
               var4.scalefac_compress = var10;
            }
         }
      }
   }

   public void best_scalefac_store(LameInternalFlags var1, int var2, int var3, IIISideInfo var4) {
      GrInfo var5 = var4.tt[var2][var3];
      byte var10 = 0;
      int var8 = 0;

      for (int var6 = 0; var6 < var5.sfbmax; var6++) {
         int var11 = var5.width[var6];
         assert var11 >= 0;
         var8 += var11;
         int var9 = -var11;

         while (var9 < 0 && var5.l3_enc[var9 + var8] == 0) {
            var9++;
         }

         if (var9 == 0) {
            var10 = -2;
            var5.scalefac[var6] = -2;
         }
      }

      if (0 == var5.scalefac_scale && 0 == var5.preflag) {
         int var17 = 0;

         for (int var12 = 0; var12 < var5.sfbmax; var12++) {
            if (var5.scalefac[var12] > 0) {
               var17 |= var5.scalefac[var12];
            }
         }

         if (0 == (var17 & 1) && var17 != 0) {
            for (int var13 = 0; var13 < var5.sfbmax; var13++) {
               if (var5.scalefac[var13] > 0) {
                  var5.scalefac[var13] = var5.scalefac[var13] >> 1;
               }
            }

            var10 = 1;
            var5.scalefac_scale = 1;
         }
      }

      if (0 == var5.preflag && var5.block_type != 2 && var1.mode_gr == 2) {
         int var14 = 11;

         while (var14 < 21 && (var5.scalefac[var14] >= this.qupvt.pretab[var14] || var5.scalefac[var14] == -2)) {
            var14++;
         }

         if (var14 == 21) {
            for (int var15 = 11; var15 < 21; var15++) {
               if (var5.scalefac[var15] > 0) {
                  var5.scalefac[var15] = var5.scalefac[var15] - this.qupvt.pretab[var15];
               }
            }

            var10 = 1;
            var5.preflag = 1;
         }
      }

      for (int var7 = 0; var7 < 4; var7++) {
         var4.scfsi[var3][var7] = 0;
      }

      if (var1.mode_gr == 2 && var2 == 1 && var4.tt[0][var3].block_type != 2 && var4.tt[1][var3].block_type != 2) {
         this.scfsi_calc(var3, var4);
         var10 = 0;
      }

      for (int var16 = 0; var16 < var5.sfbmax; var16++) {
         if (var5.scalefac[var16] == -2) {
            var5.scalefac[var16] = 0;
         }
      }

      if (var10 != 0) {
         if (var1.mode_gr == 2) {
            this.scale_bitcount(var5);
         } else {
            this.scale_bitcount_lsf(var1, var5);
         }
      }
   }

   private boolean all_scalefactors_not_negative(int[] var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         if (var1[var3] < 0) {
            return false;
         }
      }

      return true;
   }

   public boolean scale_bitcount(GrInfo var1) {
      int var4 = 0;
      int var5 = 0;
      int[] var7 = var1.scalefac;
      assert this.all_scalefactors_not_negative(var7, var1.sfbmax);
      int[] var6;
      if (var1.block_type == 2) {
         var6 = scale_short;
         if (var1.mixed_block_flag != 0) {
            var6 = scale_mixed;
         }
      } else {
         var6 = scale_long;
         if (0 == var1.preflag) {
            int var3 = 11;

            while (var3 < 21 && var7[var3] >= this.qupvt.pretab[var3]) {
               var3++;
            }

            if (var3 == 21) {
               var1.preflag = 1;

               for (int var8 = 11; var8 < 21; var8++) {
                  var7[var8] -= this.qupvt.pretab[var8];
               }
            }
         }
      }

      int var9;
      for (var9 = 0; var9 < var1.sfbdivide; var9++) {
         if (var4 < var7[var9]) {
            var4 = var7[var9];
         }
      }

      for (; var9 < var1.sfbmax; var9++) {
         if (var5 < var7[var9]) {
            var5 = var7[var9];
         }
      }

      var1.part2_length = 100000;

      for (int var2 = 0; var2 < 16; var2++) {
         if (var4 < slen1_n[var2] && var5 < slen2_n[var2] && var1.part2_length > var6[var2]) {
            var1.part2_length = var6[var2];
            var1.scalefac_compress = var2;
         }
      }

      return var1.part2_length == 100000;
   }

   public boolean scale_bitcount_lsf(LameInternalFlags var1, GrInfo var2) {
      int[] var11 = new int[4];
      int[] var13 = var2.scalefac;
      byte var3;
      if (var2.preflag != 0) {
         var3 = 2;
      } else {
         var3 = 0;
      }

      for (int var9 = 0; var9 < 4; var9++) {
         var11[var9] = 0;
      }

      byte var4;
      if (var2.block_type == 2) {
         var4 = 1;
         int[] var12 = this.qupvt.nr_of_sfb_block[var3][var4];
         int var10 = 0;

         for (int var5 = 0; var5 < 4; var5++) {
            int var6 = var12[var5] / 3;

            for (int var23 = 0; var23 < var6; var10++) {
               for (int var7 = 0; var7 < 3; var7++) {
                  if (var13[var10 * 3 + var7] > var11[var5]) {
                     var11[var5] = var13[var10 * 3 + var7];
                  }
               }

               var23++;
            }
         }
      } else {
         var4 = 0;
         int[] var26 = this.qupvt.nr_of_sfb_block[var3][var4];
         int var25 = 0;

         for (int var18 = 0; var18 < 4; var18++) {
            int var22 = var26[var18];

            for (int var24 = 0; var24 < var22; var25++) {
               if (var13[var25] > var11[var18]) {
                  var11[var18] = var13[var25];
               }

               var24++;
            }
         }
      }

      boolean var8 = false;

      for (int var19 = 0; var19 < 4; var19++) {
         if (var11[var19] > max_range_sfac_tab[var3][var19]) {
            var8 = true;
         }
      }

      if (!var8) {
         var2.sfb_partition_table = this.qupvt.nr_of_sfb_block[var3][var4];

         for (int var20 = 0; var20 < 4; var20++) {
            var2.slen[var20] = log2tab[var11[var20]];
         }

         int var14 = var2.slen[0];
         int var15 = var2.slen[1];
         int var16 = var2.slen[2];
         int var17 = var2.slen[3];
         switch (var3) {
            case 0:
               var2.scalefac_compress = (var14 * 5 + var15 << 4) + (var16 << 2) + var17;
               break;
            case 1:
               var2.scalefac_compress = 400 + (var14 * 5 + var15 << 2) + var16;
               break;
            case 2:
               var2.scalefac_compress = 500 + var14 * 3 + var15;
               break;
            default:
               System.err.printf("intensity stereo not implemented yet\n");
         }
      }

      if (!var8) {
         assert var2.sfb_partition_table != null;
         var2.part2_length = 0;

         for (int var21 = 0; var21 < 4; var21++) {
            var2.part2_length = var2.part2_length + var2.slen[var21] * var2.sfb_partition_table[var21];
         }
      }

      return var8;
   }

   public void huffman_init(LameInternalFlags var1) {
      for (byte var2 = 2; var2 <= 576; var2 += 2) {
         int var3 = 0;

         while (var1.scalefac_band.l[++var3] < var2) {
         }

         int var4 = this.subdv_table[var3][0];

         while (var1.scalefac_band.l[var4 + 1] > var2) {
            var4--;
         }

         if (var4 < 0) {
            var4 = this.subdv_table[var3][0];
         }

         var1.bv_scf[var2 - 2] = var4;
         var4 = this.subdv_table[var3][1];

         while (var1.scalefac_band.l[var4 + var1.bv_scf[var2 - 2] + 2] > var2) {
            var4--;
         }

         if (var4 < 0) {
            var4 = this.subdv_table[var3][1];
         }

         var1.bv_scf[var2 - 1] = var4;
      }
   }

   static class Bits {
      int bits;

      public Bits(int var1) {
         this.bits = var1;
      }
   }
}
