package net.sourceforge.lame.mpg;

public class Layer2 {
   private static final double[] mulmul = new double[]{
      0.0,
      -0.6666666666666666,
      0.6666666666666666,
      0.2857142857142857,
      0.13333333333333333,
      0.06451612903225806,
      0.031746031746031744,
      0.015748031496062992,
      0.00784313725490196,
      0.003913894324853229,
      0.0019550342130987292,
      9.770395701025891E-4,
      4.884004884004884E-4,
      2.4417043096081065E-4,
      1.2207776353537203E-4,
      6.103701895199438E-5,
      3.0518043793392844E-5,
      -0.8,
      -0.4,
      0.4,
      0.8,
      -0.8888888888888888,
      -0.4444444444444444,
      -0.2222222222222222,
      0.2222222222222222,
      0.4444444444444444,
      0.8888888888888888
   };
   private static final int[][][] translate = new int[][][]{
      {{0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 1, 1, 1, 1, 1, 0}, {0, 2, 2, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}},
      {{0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
      {{0, 3, 3, 3, 3, 3, 3, 0, 0, 0, 1, 1, 1, 1, 1, 0}, {0, 3, 3, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}}
   };
   private final int[] grp_3tab = new int[96];
   private final int[] grp_5tab = new int[384];
   private final int[] grp_9tab = new int[3072];
   private final int[][] tables = new int[][]{this.grp_3tab, this.grp_5tab, this.grp_9tab};
   private final int[][] table = new int[][]{null, null, null, this.grp_3tab, null, this.grp_5tab, null, null, null, this.grp_9tab};
   private final int[][] base = new int[][]{{1, 0, 2}, {17, 18, 0, 19, 20}, {21, 1, 22, 23, 0, 24, 25, 2, 26}};
   private final int[] tablen = new int[]{3, 5, 9};
   private final L2Tables.al_table2[][] tables2 = new L2Tables.al_table2[][]{
      L2Tables.alloc_0, L2Tables.alloc_1, L2Tables.alloc_2, L2Tables.alloc_3, L2Tables.alloc_4
   };
   private final int[] sblims = new int[]{27, 30, 8, 12, 30};
   private Common common;
   private int itable;
   private int[] scfsi_buf = new int[64];

   public Layer2(Common var1) {
      this.common = var1;
   }

   public void init_layer2() {
      for (int var1 = 0; var1 < 3; var1++) {
         this.itable = 0;
         int var5 = this.tablen[var1];

         for (int var2 = 0; var2 < var5; var2++) {
            for (int var3 = 0; var3 < var5; var3++) {
               for (int var4 = 0; var4 < var5; var4++) {
                  this.tables[var1][this.itable++] = this.base[var1][var4];
                  this.tables[var1][this.itable++] = this.base[var1][var3];
                  this.tables[var1][this.itable++] = this.base[var1][var2];
               }
            }
         }
      }

      for (int var12 = 0; var12 < 27; var12++) {
         double var7 = mulmul[var12];
         float[] var6 = this.common.muls[var12];
         int var9 = 0;
         int var11 = 3;

         for (int var10 = 0; var10 < 63; var11--) {
            var6[var9++] = (float)(var7 * Math.pow(2.0, var11 / 3.0));
            var10++;
         }

         var6[var9++] = 0.0F;
      }
   }

   private void II_step_one(MPGLib.mpstr_tag var1, int[] var2, int[] var3, Frame var4) {
      int var5 = 0;
      int var6 = var4.stereo - 1;
      int var7 = var4.II_sblimit;
      int var8 = var4.jsbound;
      int var9 = var4.II_sblimit << var6;
      int var10 = 0;
      int var13 = 0;
      if (var6 != 0) {
         int var11 = var8;

         while (var11 != 0) {
            int var10001 = var13++;
            short var15 = var4.alloc[var10].bits;
            var2[var10001] = (char)this.common.getbits(var1, var4.alloc[var10].bits);
            var2[var13++] = (char)this.common.getbits(var1, var15);
            var11--;
            var10 += 1 << var15;
         }

         var11 = var7 - var8;

         while (var11 != 0) {
            int var40 = var13 + 0;
            short var37 = var4.alloc[var10].bits;
            var2[var40] = (char)this.common.getbits(var1, var4.alloc[var10].bits);
            var2[var13 + 1] = var2[var13 + 0];
            var13 += 2;
            var11--;
            var10 += 1 << var37;
         }

         var13 = 0;
         int var12 = 0;

         for (int var25 = var9; var25 != 0; var25--) {
            if (var2[var13++] != 0) {
               this.scfsi_buf[var12++] = (char)this.common.getbits_fast(var1, 2);
            }
         }
      } else {
         int var26 = var7;

         while (var26 != 0) {
            int var43 = var13++;
            short var38 = var4.alloc[var10].bits;
            var2[var43] = (char)this.common.getbits(var1, var4.alloc[var10].bits);
            var26--;
            var10 += 1 << var38;
         }

         var13 = 0;
         int var29 = 0;

         for (int var27 = var7; var27 != 0; var27--) {
            if (var2[var13++] != 0) {
               this.scfsi_buf[var29++] = (char)this.common.getbits_fast(var1, 2);
            }
         }
      }

      var13 = 0;
      int var30 = 0;

      for (int var28 = var9; var28 != 0; var28--) {
         if (var2[var13++] != 0) {
            switch (this.scfsi_buf[var30++]) {
               case 0:
                  var3[var5++] = this.common.getbits_fast(var1, 6);
                  var3[var5++] = this.common.getbits_fast(var1, 6);
                  var3[var5++] = this.common.getbits_fast(var1, 6);
                  break;
               case 1:
                  int var36;
                  var3[var5++] = var36 = this.common.getbits_fast(var1, 6);
                  var3[var5++] = var36;
                  var3[var5++] = this.common.getbits_fast(var1, 6);
                  break;
               case 2:
                  int var35;
                  var3[var5++] = var35 = this.common.getbits_fast(var1, 6);
                  var3[var5++] = var35;
                  var3[var5++] = var35;
                  break;
               default:
                  var3[var5++] = this.common.getbits_fast(var1, 6);
                  int var14;
                  var3[var5++] = var14 = this.common.getbits_fast(var1, 6);
                  var3[var5++] = var14;
            }
         }
      }
   }

   private void II_step_two(MPGLib.mpstr_tag var1, int[] var2, float[][][] var3, int[] var4, Frame var5, int var6) {
      byte var7 = 0;
      int var12 = var5.stereo;
      int var13 = var5.II_sblimit;
      int var14 = var5.jsbound;
      int var16 = 0;
      int var17 = 0;
      int var8 = 0;

      while (var8 < var14) {
         short var19 = var5.alloc[var16].bits;

         for (int var9 = 0; var9 < var12; var9++) {
            int var11 = var2[var17++];
            if (var11 != 0) {
               int var15;
               short var10 = var5.alloc[var15 = var16 + var11].bits;
               short var18 = var5.alloc[var15].d;
               if (var5.alloc[var15].d < 0) {
                  float var20 = this.common.muls[var10][var4[var7 + var6]];
                  var3[var9][0][var8] = (this.common.getbits(var1, var10) + var18) * var20;
                  var3[var9][1][var8] = (this.common.getbits(var1, var10) + var18) * var20;
                  var3[var9][2][var8] = (this.common.getbits(var1, var10) + var18) * var20;
               } else {
                  int var22 = var4[var7 + var6];
                  int var33 = this.common.getbits(var1, var10);
                  int var21 = var33 + var33 + var33;
                  var3[var9][0][var8] = this.common.muls[this.table[var18][var21++]][var22];
                  var3[var9][1][var8] = this.common.muls[this.table[var18][var21++]][var22];
                  var3[var9][2][var8] = this.common.muls[this.table[var18][var21]][var22];
               }

               var7 += 3;
            } else {
               var3[var9][0][var8] = var3[var9][1][var8] = var3[var9][2][var8] = 0.0F;
            }
         }

         var8++;
         var16 += 1 << var19;
      }

      var8 = var14;

      while (var8 < var13) {
         short var32 = var5.alloc[var16].bits;
         int var46 = ++var17;
         var17++;
         int var28 = var2[var46];
         if (var28 != 0) {
            int var29;
            short var27 = var5.alloc[var29 = var16 + var28].bits;
            short var31 = var5.alloc[var29].d;
            if (var5.alloc[var29].d < 0) {
               float var34 = this.common.muls[var27][var4[var7 + var6 + 3]];
               var3[1][0][var8] = (var3[0][0][var8] = this.common.getbits(var1, var27) + var31) * var34;
               var3[1][1][var8] = (var3[0][1][var8] = this.common.getbits(var1, var27) + var31) * var34;
               var3[1][2][var8] = (var3[0][2][var8] = this.common.getbits(var1, var27) + var31) * var34;
               var34 = this.common.muls[var27][var4[var7 + var6]];
               var3[0][0][var8] = var3[0][0][var8] * var34;
               var3[0][1][var8] = var3[0][1][var8] * var34;
               var3[0][2][var8] = var3[0][2][var8] * var34;
            } else {
               int var42 = var4[var7 + var6];
               int var23 = var4[var7 + var6 + 3];
               int var36 = this.common.getbits(var1, var27);
               int var39 = var36 + var36 + var36;
               var3[0][0][var8] = this.common.muls[this.table[var31][var39]][var42];
               var3[1][0][var8] = this.common.muls[this.table[var31][var39++]][var23];
               var3[0][1][var8] = this.common.muls[this.table[var31][var39]][var42];
               var3[1][1][var8] = this.common.muls[this.table[var31][var39++]][var23];
               var3[0][2][var8] = this.common.muls[this.table[var31][var39]][var42];
               var3[1][2][var8] = this.common.muls[this.table[var31][var39]][var23];
            }

            var7 += 6;
         } else {
            var3[0][0][var8] = var3[0][1][var8] = var3[0][2][var8] = var3[1][0][var8] = var3[1][1][var8] = var3[1][2][var8] = 0.0F;
         }

         var8++;
         var16 += 1 << var32;
      }

      for (int var25 = var13; var25 < 32; var25++) {
         for (int var26 = 0; var26 < var12; var26++) {
            var3[var26][0][var25] = var3[var26][1][var25] = var3[var26][2][var25] = 0.0F;
         }
      }
   }

   private void II_select_table(Frame var1) {
      int var2;
      if (var1.lsf != 0) {
         var2 = 4;
      } else {
         var2 = translate[var1.sampling_frequency][2 - var1.stereo][var1.bitrate_index];
      }

      int var3 = this.sblims[var2];
      var1.alloc = this.tables2[var2];
      var1.II_sblimit = var3;
   }

   public <T> int do_layer2(MPGLib.mpstr_tag var1, float[] var2, MPGLib.ProcessedBytes var3, Interface.ISynth var4) {
      int var5 = 0;
      float[][][] var8 = new float[2][4][32];
      int[] var9 = new int[64];
      int[] var10 = new int[192];
      Frame var11 = var1.fr;
      int var12 = var11.stereo;
      int var13 = var11.single;
      this.II_select_table(var11);
      var11.jsbound = var11.mode == 1 ? (var11.mode_ext << 2) + 4 : var11.II_sblimit;
      if (var12 == 1 || var13 == 3) {
         var13 = 0;
      }

      this.II_step_one(var1, var9, var10, var11);

      for (int var6 = 0; var6 < 12; var6++) {
         this.II_step_two(var1, var9, var8, var10, var11, var6 >> 2);

         for (int var7 = 0; var7 < 3; var7++) {
            if (var13 >= 0) {
               var5 += var4.synth_1to1_mono_ptr(var1, var8[var13][var7], 0, var2, var3);
            } else {
               MPGLib.ProcessedBytes var14 = new MPGLib.ProcessedBytes();
               var14.pb = var3.pb;
               var5 += var4.synth_1to1_ptr(var1, var8[0][var7], 0, 0, var2, var14);
               var5 += var4.synth_1to1_ptr(var1, var8[1][var7], 0, 1, var2, var3);
            }
         }
      }

      return var5;
   }
}
