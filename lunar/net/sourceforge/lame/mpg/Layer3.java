package net.sourceforge.lame.mpg;

public class Layer3 {
   private static final int[][] slen = new int[][]{{0, 0, 0, 0, 3, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4}, {0, 1, 2, 3, 0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3}};
   private static final int[][][] stab = new int[][][]{
      {{6, 5, 5, 5}, {6, 5, 7, 3}, {11, 10, 0, 0}, {7, 7, 7, 0}, {6, 6, 6, 3}, {8, 8, 5, 0}},
      {{9, 9, 9, 9}, {9, 9, 12, 6}, {18, 18, 0, 0}, {12, 12, 12, 0}, {12, 9, 9, 6}, {15, 12, 9, 0}},
      {{6, 9, 9, 9}, {6, 9, 12, 6}, {15, 18, 0, 0}, {6, 15, 12, 0}, {6, 12, 9, 6}, {6, 18, 9, 0}}
   };
   private static final int[] pretab1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3, 2, 0};
   private static final int[] pretab2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   private static Layer3.bandInfoStruct[] bandInfo = new Layer3.bandInfoStruct[]{
      new Layer3.bandInfoStruct(
         new short[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 52, 62, 74, 90, 110, 134, 162, 196, 238, 288, 342, 418, 576},
         new short[]{4, 4, 4, 4, 4, 4, 6, 6, 8, 8, 10, 12, 16, 20, 24, 28, 34, 42, 50, 54, 76, 158},
         new short[]{0, 12, 24, 36, 48, 66, 90, 120, 156, 198, 252, 318, 408, 576},
         new short[]{4, 4, 4, 4, 6, 8, 10, 12, 14, 18, 22, 30, 56}
      ),
      new Layer3.bandInfoStruct(
         new short[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 42, 50, 60, 72, 88, 106, 128, 156, 190, 230, 276, 330, 384, 576},
         new short[]{4, 4, 4, 4, 4, 4, 6, 6, 6, 8, 10, 12, 16, 18, 22, 28, 34, 40, 46, 54, 54, 192},
         new short[]{0, 12, 24, 36, 48, 66, 84, 114, 150, 192, 240, 300, 378, 576},
         new short[]{4, 4, 4, 4, 6, 6, 10, 12, 14, 16, 20, 26, 66}
      ),
      new Layer3.bandInfoStruct(
         new short[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 54, 66, 82, 102, 126, 156, 194, 240, 296, 364, 448, 550, 576},
         new short[]{4, 4, 4, 4, 4, 4, 6, 6, 8, 10, 12, 16, 20, 24, 30, 38, 46, 56, 68, 84, 102, 26},
         new short[]{0, 12, 24, 36, 48, 66, 90, 126, 174, 234, 312, 414, 540, 576},
         new short[]{4, 4, 4, 4, 6, 8, 12, 16, 20, 26, 34, 42, 12}
      ),
      new Layer3.bandInfoStruct(
         new short[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576},
         new short[]{6, 6, 6, 6, 6, 6, 8, 10, 12, 14, 16, 20, 24, 28, 32, 38, 46, 52, 60, 68, 58, 54},
         new short[]{0, 12, 24, 36, 54, 72, 96, 126, 168, 222, 300, 396, 522, 576},
         new short[]{4, 4, 4, 6, 6, 8, 10, 14, 18, 26, 32, 42, 18}
      ),
      new Layer3.bandInfoStruct(
         new short[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 114, 136, 162, 194, 232, 278, 332, 394, 464, 540, 576},
         new short[]{6, 6, 6, 6, 6, 6, 8, 10, 12, 14, 16, 18, 22, 26, 32, 38, 46, 54, 62, 70, 76, 36},
         new short[]{0, 12, 24, 36, 54, 78, 108, 144, 186, 240, 312, 408, 540, 576},
         new short[]{4, 4, 4, 6, 8, 10, 12, 14, 18, 24, 32, 44, 12}
      ),
      new Layer3.bandInfoStruct(
         new short[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576},
         new short[]{6, 6, 6, 6, 6, 6, 8, 10, 12, 14, 16, 20, 24, 28, 32, 38, 46, 52, 60, 68, 58, 54},
         new short[]{0, 12, 24, 36, 54, 78, 108, 144, 186, 240, 312, 402, 522, 576},
         new short[]{4, 4, 4, 6, 8, 10, 12, 14, 18, 24, 30, 40, 18}
      ),
      new Layer3.bandInfoStruct(
         new short[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576},
         new short[]{6, 6, 6, 6, 6, 6, 8, 10, 12, 14, 16, 20, 24, 28, 32, 38, 46, 52, 60, 68, 58, 54},
         new short[]{0, 12, 24, 36, 54, 78, 108, 144, 186, 240, 312, 402, 522, 576},
         new short[]{4, 4, 4, 6, 8, 10, 12, 14, 18, 24, 30, 40, 18}
      ),
      new Layer3.bandInfoStruct(
         new short[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576},
         new short[]{6, 6, 6, 6, 6, 6, 8, 10, 12, 14, 16, 20, 24, 28, 32, 38, 46, 52, 60, 68, 58, 54},
         new short[]{0, 12, 24, 36, 54, 78, 108, 144, 186, 240, 312, 402, 522, 576},
         new short[]{4, 4, 4, 6, 8, 10, 12, 14, 18, 24, 30, 40, 18}
      ),
      new Layer3.bandInfoStruct(
         new short[]{0, 12, 24, 36, 48, 60, 72, 88, 108, 132, 160, 192, 232, 280, 336, 400, 476, 566, 568, 570, 572, 574, 576},
         new short[]{12, 12, 12, 12, 12, 12, 16, 20, 24, 28, 32, 40, 48, 56, 64, 76, 90, 2, 2, 2, 2, 2},
         new short[]{0, 24, 48, 72, 108, 156, 216, 288, 372, 480, 486, 492, 498, 576},
         new short[]{8, 8, 8, 12, 16, 20, 24, 28, 36, 2, 2, 2, 26}
      )
   };
   private static double[] Ci = new double[]{-0.6, -0.535, -0.33, -0.185, -0.095, -0.041, -0.0142, -0.0037};
   private static int[] len = new int[]{36, 36, 12, 36};
   private Common common;
   private float[] ispow = new float[8207];
   private float[] aa_ca = new float[8];
   private float[] aa_cs = new float[8];
   private float[][] COS1 = new float[12][6];
   private float[][] win = new float[4][36];
   private float[][] win1 = new float[4][36];
   private float[] gainpow2 = new float[378];
   private float[] COS9 = new float[9];
   private float COS6_1;
   private float COS6_2;
   private float[] tfcos36 = new float[9];
   private float[] tfcos12 = new float[3];
   private int[][] longLimit = new int[9][23];
   private int[][] shortLimit = new int[9][14];
   private int[][] mapbuf0 = new int[9][152];
   private int[][] mapbuf1 = new int[9][156];
   private int[][] mapbuf2 = new int[9][44];
   private int[][][] map = new int[9][3][];
   private int[][] mapend = new int[9][3];
   private int[] n_slen2 = new int[512];
   private int[] i_slen2 = new int[256];
   private float[] tan1_1 = new float[16];
   private float[] tan2_1 = new float[16];
   private float[] tan1_2 = new float[16];
   private float[] tan2_2 = new float[16];
   private float[][] pow1_1 = new float[2][16];
   private float[][] pow2_1 = new float[2][16];
   private float[][] pow1_2 = new float[2][16];
   private float[][] pow2_2 = new float[2][16];
   private MPG123.III_sideinfo sideinfo = new MPG123.III_sideinfo();
   private float[][] hybridIn = new float[2][576];
   private float[][] hybridOut = new float[2][576];

   public Layer3(Common var1) {
      this.common = var1;
   }

   private int get1bit(MPGLib.mpstr_tag var1) {
      int var2 = (var1.wordpointer[var1.wordpointerPos] & 255) << var1.bitindex;
      var2 &= 255;
      var1.bitindex++;
      var1.wordpointerPos = var1.wordpointerPos + (var1.bitindex >> 3);
      var1.bitindex &= 7;
      return var2 >> 7;
   }

   public void init_layer3(int var1) {
      for (int var2 = -256; var2 < 122; var2++) {
         this.gainpow2[var2 + 256] = (float)Math.pow(2.0, -0.25 * (var2 + 210));
      }

      for (int var12 = 0; var12 < 8207; var12++) {
         this.ispow[var12] = (float)Math.pow(var12, 1.3333333333333333);
      }

      for (int var13 = 0; var13 < 8; var13++) {
         double var3 = Math.sqrt(1.0 + Ci[var13] * Ci[var13]);
         this.aa_cs[var13] = (float)(1.0 / var3);
         this.aa_ca[var13] = (float)(Ci[var13] / var3);
      }

      for (int var14 = 0; var14 < 18; var14++) {
         this.win[0][var14] = this.win[1][var14] = (float)(
            0.5 * Math.sin(0.04363323129985824 * (2 * (var14 + 0) + 1)) / Math.cos(Math.PI * (2 * (var14 + 0) + 19) / 72.0)
         );
         this.win[0][var14 + 18] = this.win[3][var14 + 18] = (float)(
            0.5 * Math.sin(0.04363323129985824 * (2 * (var14 + 18) + 1)) / Math.cos(Math.PI * (2 * (var14 + 18) + 19) / 72.0)
         );
      }

      for (int var15 = 0; var15 < 6; var15++) {
         this.win[1][var15 + 18] = (float)(0.5 / Math.cos(Math.PI * (2 * (var15 + 18) + 19) / 72.0));
         this.win[3][var15 + 12] = (float)(0.5 / Math.cos(Math.PI * (2 * (var15 + 12) + 19) / 72.0));
         this.win[1][var15 + 24] = (float)(0.5 * Math.sin(0.1308996938995747 * (2 * var15 + 13)) / Math.cos(Math.PI * (2 * (var15 + 24) + 19) / 72.0));
         this.win[1][var15 + 30] = this.win[3][var15] = 0.0F;
         this.win[3][var15 + 6] = (float)(0.5 * Math.sin(0.1308996938995747 * (2 * var15 + 1)) / Math.cos(Math.PI * (2 * (var15 + 6) + 19) / 72.0));
      }

      for (int var16 = 0; var16 < 9; var16++) {
         this.COS9[var16] = (float)Math.cos((Math.PI / 18) * var16);
      }

      for (int var17 = 0; var17 < 9; var17++) {
         this.tfcos36[var17] = (float)(0.5 / Math.cos(Math.PI * (var17 * 2 + 1) / 36.0));
      }

      for (int var18 = 0; var18 < 3; var18++) {
         this.tfcos12[var18] = (float)(0.5 / Math.cos(Math.PI * (var18 * 2 + 1) / 12.0));
      }

      this.COS6_1 = (float)Math.cos(Math.PI / 6);
      this.COS6_2 = (float)Math.cos(Math.PI / 3);

      for (int var19 = 0; var19 < 12; var19++) {
         this.win[2][var19] = (float)(0.5 * Math.sin(0.1308996938995747 * (2 * var19 + 1)) / Math.cos(Math.PI * (2 * var19 + 7) / 24.0));

         for (int var29 = 0; var29 < 6; var29++) {
            this.COS1[var19][var29] = (float)Math.cos(0.1308996938995747 * ((2 * var19 + 7) * (2 * var29 + 1)));
         }
      }

      for (int var20 = 0; var20 < 4; var20++) {
         for (byte var30 = 0; var30 < len[var20]; var30 += 2) {
            this.win1[var20][var30] = this.win[var20][var30];
         }

         for (byte var31 = 1; var31 < len[var20]; var31 += 2) {
            this.win1[var20][var31] = -this.win[var20][var31];
         }
      }

      for (int var21 = 0; var21 < 16; var21++) {
         double var32 = Math.tan(var21 * Math.PI / 12.0);
         this.tan1_1[var21] = (float)(var32 / (1.0 + var32));
         this.tan2_1[var21] = (float)(1.0 / (1.0 + var32));
         this.tan1_2[var21] = (float)(1.4142135623730951 * var32 / (1.0 + var32));
         this.tan2_2[var21] = (float)(1.4142135623730951 / (1.0 + var32));

         for (int var5 = 0; var5 < 2; var5++) {
            double var6 = Math.pow(2.0, -0.25 * (var5 + 1.0));
            double var8 = 1.0;
            double var10 = 1.0;
            if (var21 > 0) {
               if ((var21 & 1) != 0) {
                  var8 = Math.pow(var6, (var21 + 1.0) * 0.5);
               } else {
                  var10 = Math.pow(var6, var21 * 0.5);
               }
            }

            this.pow1_1[var5][var21] = (float)var8;
            this.pow2_1[var5][var21] = (float)var10;
            this.pow1_2[var5][var21] = (float)(1.4142135623730951 * var8);
            this.pow2_2[var5][var21] = (float)(1.4142135623730951 * var10);
         }
      }

      for (int var22 = 0; var22 < 9; var22++) {
         Layer3.bandInfoStruct var33 = bandInfo[var22];
         this.map[var22][0] = this.mapbuf0[var22];
         int var4 = 0;
         int var7 = 0;
         int var72 = 0;

         for (int var58 = 0; var58 < 8; var72 += var33.longDiff[var7++]) {
            this.map[var22][0][var4++] = var33.longDiff[var7] >> 1;
            this.map[var22][0][var4++] = var72;
            this.map[var22][0][var4++] = 3;
            this.map[var22][0][var4++] = var58++;
         }

         var7 = 3;

         for (int var59 = 3; var59 < 13; var59++) {
            int var9 = var33.shortDiff[var7++] >> 1;

            for (int var66 = 0; var66 < 3; var66++) {
               this.map[var22][0][var4++] = var9;
               this.map[var22][0][var4++] = var72 + var66;
               this.map[var22][0][var4++] = var66;
               this.map[var22][0][var4++] = var59;
            }

            var72 += 6 * var9;
         }

         this.mapend[var22][0] = var4;
         this.map[var22][1] = this.mapbuf1[var22];
         var4 = 0;
         var7 = 0;
         var72 = 0;

         for (int var60 = 0; var60 < 13; var60++) {
            int var74 = var33.shortDiff[var7++] >> 1;

            for (int var67 = 0; var67 < 3; var67++) {
               this.map[var22][1][var4++] = var74;
               this.map[var22][1][var4++] = var72 + var67;
               this.map[var22][1][var4++] = var67;
               this.map[var22][1][var4++] = var60;
            }

            var72 += 6 * var74;
         }

         this.mapend[var22][1] = var4;
         this.map[var22][2] = this.mapbuf2[var22];
         var4 = 0;
         var7 = 0;

         for (int var61 = 0; var61 < 22; this.map[var22][2][var4++] = var61++) {
            this.map[var22][2][var4++] = var33.longDiff[var7++] >> 1;
         }

         this.mapend[var22][2] = var4;
      }

      for (int var23 = 0; var23 < 9; var23++) {
         for (int var34 = 0; var34 < 23; var34++) {
            this.longLimit[var23][var34] = (bandInfo[var23].longIdx[var34] - 1 + 8) / 18 + 1;
            if (this.longLimit[var23][var34] > var1) {
               this.longLimit[var23][var34] = var1;
            }
         }

         for (int var35 = 0; var35 < 14; var35++) {
            this.shortLimit[var23][var35] = (bandInfo[var23].shortIdx[var35] - 1) / 18 + 1;
            if (this.shortLimit[var23][var35] > var1) {
               this.shortLimit[var23][var35] = var1;
            }
         }
      }

      for (int var24 = 0; var24 < 5; var24++) {
         for (int var36 = 0; var36 < 6; var36++) {
            for (int var53 = 0; var53 < 6; var53++) {
               int var62 = var53 + var36 * 6 + var24 * 36;
               this.i_slen2[var62] = var24 | var36 << 3 | var53 << 6 | 12288;
            }
         }
      }

      for (int var25 = 0; var25 < 4; var25++) {
         for (int var37 = 0; var37 < 4; var37++) {
            for (int var54 = 0; var54 < 4; var54++) {
               int var63 = var54 + var37 * 4 + var25 * 16;
               this.i_slen2[var63 + 180] = var25 | var37 << 3 | var54 << 6 | 16384;
            }
         }
      }

      for (int var26 = 0; var26 < 4; var26++) {
         for (int var38 = 0; var38 < 3; var38++) {
            int var55 = var38 + var26 * 3;
            this.i_slen2[var55 + 244] = var26 | var38 << 3 | 20480;
            this.n_slen2[var55 + 500] = var26 | var38 << 3 | 8192 | 32768;
         }
      }

      for (int var27 = 0; var27 < 5; var27++) {
         for (int var39 = 0; var39 < 5; var39++) {
            for (int var56 = 0; var56 < 4; var56++) {
               for (int var64 = 0; var64 < 4; var64++) {
                  int var68 = var64 + var56 * 4 + var39 * 16 + var27 * 80;
                  this.n_slen2[var68] = var27 | var39 << 3 | var56 << 6 | var64 << 9 | 0;
               }
            }
         }
      }

      for (int var28 = 0; var28 < 5; var28++) {
         for (int var40 = 0; var40 < 5; var40++) {
            for (int var57 = 0; var57 < 4; var57++) {
               int var65 = var57 + var40 * 4 + var28 * 20;
               this.n_slen2[var65 + 400] = var28 | var40 << 3 | var57 << 6 | 4096;
            }
         }
      }
   }

   private void III_get_side_info_1(MPGLib.mpstr_tag var1, MPG123.III_sideinfo var2, int var3, int var4, int var5, int var6) {
      int var9 = var6 == 3 ? 4 : 0;
      var2.main_data_begin = this.common.getbits(var1, 9);
      if (var3 == 1) {
         var2.private_bits = this.common.getbits_fast(var1, 5);
      } else {
         var2.private_bits = this.common.getbits_fast(var1, 3);
      }

      for (int var7 = 0; var7 < var3; var7++) {
         var2.ch[var7].gr[0].scfsi = -1;
         var2.ch[var7].gr[1].scfsi = this.common.getbits_fast(var1, 4);
      }

      for (int var8 = 0; var8 < 2; var8++) {
         for (int var14 = 0; var14 < var3; var14++) {
            MPG123.gr_info_s var10 = var2.ch[var14].gr[var8];
            var10.part2_3_length = this.common.getbits(var1, 12);
            var10.big_values = this.common.getbits_fast(var1, 9);
            if (var10.big_values > 288) {
               System.err.printf("big_values too large! %d\n", var10.big_values);
               var10.big_values = 288;
            }

            int var11 = this.common.getbits_fast(var1, 8);
            var10.pow2gain = this.gainpow2;
            var10.pow2gainPos = 256 - var11 + var9;
            if (var1.pinfo != null) {
               var1.pinfo.qss[var8][var14] = var11;
            }

            if (var4 != 0) {
               var10.pow2gainPos += 2;
            }

            var10.scalefac_compress = this.common.getbits_fast(var1, 4);
            if (this.get1bit(var1) != 0) {
               var10.block_type = this.common.getbits_fast(var1, 2);
               var10.mixed_block_flag = this.get1bit(var1);
               var10.table_select[0] = this.common.getbits_fast(var1, 5);
               var10.table_select[1] = this.common.getbits_fast(var1, 5);
               var10.table_select[2] = 0;

               for (int var16 = 0; var16 < 3; var16++) {
                  int var17 = this.common.getbits_fast(var1, 3) << 3;
                  var10.full_gain[var16] = var10.pow2gain;
                  var10.full_gainPos[var16] = var10.pow2gainPos + var17;
                  if (var1.pinfo != null) {
                     var1.pinfo.sub_gain[var8][var14][var16] = var17 / 8;
                  }
               }

               if (var10.block_type == 0) {
                  System.err.printf("Blocktype == 0 and window-switching == 1 not allowed.\n");
               }

               var10.region1start = 18;
               var10.region2start = 288;
            } else {
               for (int var15 = 0; var15 < 3; var15++) {
                  var10.table_select[var15] = this.common.getbits_fast(var1, 5);
               }

               int var12 = this.common.getbits_fast(var1, 4);
               int var13 = this.common.getbits_fast(var1, 3);
               var10.region1start = bandInfo[var5].longIdx[var12 + 1] >> 1;
               var10.region2start = var12 + 1 + var13 + 1 < bandInfo[var5].longIdx.length
                  ? bandInfo[var5].longIdx[var12 + 1 + var13 + 1] >> 1
                  : bandInfo[var5].longDiff[var12 + 1 + var13 + 1 - bandInfo[var5].longIdx.length] >> 1;
               var10.block_type = 0;
               var10.mixed_block_flag = 0;
            }

            var10.preflag = this.get1bit(var1);
            var10.scalefac_scale = this.get1bit(var1);
            var10.count1table_select = this.get1bit(var1);
         }
      }
   }

   private void III_get_side_info_2(MPGLib.mpstr_tag var1, MPG123.III_sideinfo var2, int var3, int var4, int var5, int var6) {
      int var8 = var6 == 3 ? 4 : 0;
      var2.main_data_begin = this.common.getbits(var1, 8);
      if (var3 == 1) {
         var2.private_bits = this.get1bit(var1);
      } else {
         var2.private_bits = this.common.getbits_fast(var1, 2);
      }

      for (int var7 = 0; var7 < var3; var7++) {
         MPG123.gr_info_s var9 = var2.ch[var7].gr[0];
         var9.part2_3_length = this.common.getbits(var1, 12);
         var9.big_values = this.common.getbits_fast(var1, 9);
         if (var9.big_values > 288) {
            System.err.printf("big_values too large! %d\n", var9.big_values);
            var9.big_values = 288;
         }

         int var10 = this.common.getbits_fast(var1, 8);
         var9.pow2gain = this.gainpow2;
         var9.pow2gainPos = 256 - var10 + var8;
         if (var1.pinfo != null) {
            var1.pinfo.qss[0][var7] = var10;
         }

         if (var4 != 0) {
            var9.pow2gainPos += 2;
         }

         var9.scalefac_compress = this.common.getbits(var1, 9);
         if (this.get1bit(var1) != 0) {
            var9.block_type = this.common.getbits_fast(var1, 2);
            var9.mixed_block_flag = this.get1bit(var1);
            var9.table_select[0] = this.common.getbits_fast(var1, 5);
            var9.table_select[1] = this.common.getbits_fast(var1, 5);
            var9.table_select[2] = 0;

            for (int var14 = 0; var14 < 3; var14++) {
               int var15 = this.common.getbits_fast(var1, 3) << 3;
               var9.full_gain[var14] = var9.pow2gain;
               var9.full_gainPos[var14] = var9.pow2gainPos + var15;
               if (var1.pinfo != null) {
                  var1.pinfo.sub_gain[0][var7][var14] = var15 / 8;
               }
            }

            if (var9.block_type == 0) {
               System.err.printf("Blocktype == 0 and window-switching == 1 not allowed.\n");
            }

            if (var9.block_type == 2) {
               if (var5 == 8) {
                  var9.region1start = 36;
               } else {
                  var9.region1start = 18;
               }
            } else if (var5 == 8) {
               var9.region1start = 54;
            } else {
               var9.region1start = 27;
            }

            var9.region2start = 288;
         } else {
            for (int var11 = 0; var11 < 3; var11++) {
               var9.table_select[var11] = this.common.getbits_fast(var1, 5);
            }

            int var12 = this.common.getbits_fast(var1, 4);
            int var13 = this.common.getbits_fast(var1, 3);
            var9.region1start = bandInfo[var5].longIdx[var12 + 1] >> 1;
            var9.region2start = bandInfo[var5].longIdx[var12 + 1 + var13 + 1] >> 1;
            var9.block_type = 0;
            var9.mixed_block_flag = 0;
         }

         var9.scalefac_scale = this.get1bit(var1);
         var9.count1table_select = this.get1bit(var1);
      }
   }

   private int III_get_scale_factors_1(MPGLib.mpstr_tag var1, int[] var2, MPG123.gr_info_s var3) {
      int var4 = 0;
      int var6 = slen[0][var3.scalefac_compress];
      int var7 = slen[1][var3.scalefac_compress];
      int var5;
      if (var3.block_type == 2) {
         int var8 = 18;
         var5 = (var6 + var7) * 18;
         if (var3.mixed_block_flag != 0) {
            for (int var14 = 8; var14 != 0; var14--) {
               var2[var4++] = this.common.getbits_fast(var1, var6);
            }

            var8 = 9;
            var5 -= var6;
         }

         while (var8 != 0) {
            var2[var4++] = this.common.getbits_fast(var1, var6);
            var8--;
         }

         for (int var15 = 18; var15 != 0; var15--) {
            var2[var4++] = this.common.getbits_fast(var1, var7);
         }

         var2[var4++] = 0;
         var2[var4++] = 0;
         var2[var4++] = 0;
      } else {
         int var9 = var3.scfsi;
         if (var9 < 0) {
            for (int var20 = 11; var20 != 0; var20--) {
               var2[var4++] = this.common.getbits_fast(var1, var6);
            }

            for (int var21 = 10; var21 != 0; var21--) {
               var2[var4++] = this.common.getbits_fast(var1, var7);
            }

            var5 = (var6 + var7) * 10 + var6;
         } else {
            var5 = 0;
            if (0 == (var9 & 8)) {
               for (int var16 = 6; var16 != 0; var16--) {
                  var2[var4++] = this.common.getbits_fast(var1, var6);
               }

               var5 += var6 * 6;
            } else {
               var4 += 6;
            }

            if (0 == (var9 & 4)) {
               for (int var17 = 5; var17 != 0; var17--) {
                  var2[var4++] = this.common.getbits_fast(var1, var6);
               }

               var5 += var6 * 5;
            } else {
               var4 += 5;
            }

            if (0 == (var9 & 2)) {
               for (int var18 = 5; var18 != 0; var18--) {
                  var2[var4++] = this.common.getbits_fast(var1, var7);
               }

               var5 += var7 * 5;
            } else {
               var4 += 5;
            }

            if (0 != (var9 & 1)) {
               var4 += 5;
            } else {
               for (int var19 = 5; var19 != 0; var19--) {
                  var2[var4++] = this.common.getbits_fast(var1, var7);
               }

               var5 += var7 * 5;
            }
         }

         var2[var4++] = 0;
      }

      return var5;
   }

   private int III_get_scale_factors_2(MPGLib.mpstr_tag var1, int[] var2, MPG123.gr_info_s var3, int var4) {
      int var5 = 0;
      int var10 = 0;
      int var11 = 0;
      int var9;
      if (var4 != 0) {
         var9 = this.i_slen2[var3.scalefac_compress >> 1];
      } else {
         var9 = this.n_slen2[var3.scalefac_compress];
      }

      var3.preflag = var9 >> 15 & 1;
      var10 = 0;
      if (var3.block_type == 2) {
         var10++;
         if (var3.mixed_block_flag != 0) {
            var10++;
         }
      }

      int[] var6 = stab[var10][var9 >> 12 & 7];

      for (int var7 = 0; var7 < 4; var7++) {
         int var12 = var9 & 7;
         var9 >>= 3;
         if (var12 == 0) {
            for (int var14 = 0; var14 < var6[var7]; var14++) {
               var2[var5++] = 0;
            }
         } else {
            for (int var8 = 0; var8 < var6[var7]; var8++) {
               var2[var5++] = this.common.getbits_fast(var1, var12);
            }

            var11 += var6[var7] * var12;
         }
      }

      var10 = (var10 << 1) + 1;

      for (int var13 = 0; var13 < var10; var13++) {
         var2[var5++] = 0;
      }

      return var11;
   }

   private int III_dequantize_sample(MPGLib.mpstr_tag var1, float[] var2, int[] var3, MPG123.gr_info_s var4, int var5, int var6) {
      int var7 = 0;
      int var8 = 1 + var4.scalefac_scale;
      float[] var9 = var2;
      int var10 = 0;
      int[] var11 = new int[3];
      int var13 = var4.part2_3_length - var6;

      for (int var15 = 576 - var10 >> 1; var15 > 0; var15--) {
         var9[var10++] = 0.0F;
         var9[var10++] = 0.0F;
      }

      var9 = var2;
      var10 = 0;
      int var38 = var4.big_values;
      int var16 = var4.region1start;
      int var17 = var4.region2start;
      int var12 = 288 - var38 >> 1;
      if (var38 <= var16) {
         var11[0] = var38;
         var11[1] = 0;
         var11[2] = 0;
      } else {
         var11[0] = var16;
         if (var38 <= var17) {
            var11[1] = var38 - var11[0];
            var11[2] = 0;
         } else {
            var11[1] = var17 - var11[0];
            var11[2] = var38 - var17;
         }
      }

      for (int var39 = 0; var39 < 3; var39++) {
         if (var11[var39] < 0) {
            System.err.printf("hip: Bogus region length (%d)\n", var11[var39]);
            var11[var39] = 0;
         }
      }

      if (var4.block_type == 2) {
         int[] var43 = new int[4];
         byte var45 = 0;
         int var18 = 0;
         int var19 = 0;
         float var20 = 0.0F;
         int var23 = 0;
         int var14;
         int[] var21;
         if (var4.mixed_block_flag != 0) {
            var43[3] = -1;
            var43[0] = var43[1] = var43[2] = 2;
            var21 = this.map[var5][0];
            var23 = 0;
            var14 = this.mapend[var5][0];
         } else {
            var43[0] = var43[1] = var43[2] = var43[3] = -1;
            var21 = this.map[var5][1];
            var23 = 0;
            var14 = this.mapend[var5][1];
         }

         int var22 = 0;

         for (int var40 = 0; var40 < 2; var40++) {
            int var24 = var11[var40];
            Huffman.newhuff[] var25 = Huffman.ht;
            int var26 = var4.table_select[var40];

            while (var24 != 0) {
               if (0 == var22) {
                  var22 = var21[var23++];
                  var9 = var2;
                  var10 = var21[var23++];
                  var18 = var21[var23++];
                  var19 = var21[var23++];
                  if (var18 == 3) {
                     var20 = var4.pow2gain[var4.pow2gainPos + (var3[var7++] << var8)];
                     var45 = 1;
                  } else {
                     var20 = var4.full_gain[var18][var4.full_gainPos[var18] + (var3[var7++] << var8)];
                     var45 = 3;
                  }
               }

               short[] var29 = var25[var26].table;

               short var28;
               for (int var30 = 0; (var28 = var29[var30++]) < 0; var13--) {
                  if (this.get1bit(var1) != 0) {
                     var30 -= var28;
                  }
               }

               int var27 = var28 >> 4;
               var28 &= 15;
               if (var27 == 15) {
                  var43[var18] = var19;
                  var13 -= var25[var26].linbits + 1;
                  var27 += this.common.getbits(var1, var25[var26].linbits);
                  if (this.get1bit(var1) != 0) {
                     var9[var10] = -this.ispow[var27] * var20;
                  } else {
                     var9[var10] = this.ispow[var27] * var20;
                  }
               } else if (var27 != 0) {
                  var43[var18] = var19;
                  if (this.get1bit(var1) != 0) {
                     var9[var10] = -this.ispow[var27] * var20;
                  } else {
                     var9[var10] = this.ispow[var27] * var20;
                  }

                  var13--;
               } else {
                  var9[var10] = 0.0F;
               }

               var10 += var45;
               if (var28 == 15) {
                  var43[var18] = var19;
                  var13 -= var25[var26].linbits + 1;
                  var28 += this.common.getbits(var1, var25[var26].linbits);
                  if (this.get1bit(var1) != 0) {
                     var9[var10] = -this.ispow[var28] * var20;
                  } else {
                     var9[var10] = this.ispow[var28] * var20;
                  }
               } else if (var28 != 0) {
                  var43[var18] = var19;
                  if (this.get1bit(var1) != 0) {
                     var9[var10] = -this.ispow[var28] * var20;
                  } else {
                     var9[var10] = this.ispow[var28] * var20;
                  }

                  var13--;
               } else {
                  var9[var10] = 0.0F;
               }

               var10 += var45;
               var24--;
               var22--;
            }
         }

         for (; var12 != 0 && var13 > 0; var12--) {
            Huffman.newhuff[] var67 = Huffman.htc;
            int var72 = var4.count1table_select;
            short[] var75 = var67[var72].table;
            int var79 = 0;

            short var85;
            while ((var85 = var75[var79++]) < 0) {
               if (--var13 < 0) {
                  var13++;
                  var85 = 0;
                  break;
               }

               if (this.get1bit(var1) != 0) {
                  var79 -= var85;
               }
            }

            for (int var41 = 0; var41 < 4; var41++) {
               if (0 == (var41 & 1)) {
                  if (0 == var22) {
                     var22 = var21[var23++];
                     var9 = var2;
                     var10 = var21[var23++];
                     var18 = var21[var23++];
                     var19 = var21[var23++];
                     if (var18 == 3) {
                        var20 = var4.pow2gain[var4.pow2gainPos + (var3[var7++] << var8)];
                        var45 = 1;
                     } else {
                        var20 = var4.full_gain[var18][var4.full_gainPos[var18] + (var3[var7++] << var8)];
                        var45 = 3;
                     }
                  }

                  var22--;
               }

               if ((var85 & 8 >> var41) != 0) {
                  var43[var18] = var19;
                  if (--var13 < 0) {
                     var13++;
                     break;
                  }

                  if (this.get1bit(var1) != 0) {
                     var9[var10] = -var20;
                  } else {
                     var9[var10] = var20;
                  }
               } else {
                  var9[var10] = 0.0F;
               }

               var10 += var45;
            }
         }

         while (var23 < var14) {
            if (0 == var22) {
               var22 = var21[var23++];
               var9 = var2;
               var10 = var21[var23++];
               if (var21[var23++] == 3) {
                  var45 = 1;
               } else {
                  var45 = 3;
               }

               var23++;
            }

            var22--;
            var9[var10] = 0.0F;
            var10 += var45;
            var9[var10] = 0.0F;
            var10 += var45;
         }

         var4.maxband[0] = var43[0] + 1;
         var4.maxband[1] = var43[1] + 1;
         var4.maxband[2] = var43[2] + 1;
         var4.maxbandl = var43[3] + 1;
         int var68 = var43[0] > var43[1] ? var43[0] : var43[1];
         var68 = (var68 > var43[2] ? var68 : var43[2]) + 1;
         var4.maxb = var68 != 0 ? this.shortLimit[var5][var68] : this.longLimit[var5][var43[3] + 1];
      } else {
         int[] var42 = var4.preflag != 0 ? pretab1 : pretab2;
         var16 = 0;
         int var49 = -1;
         int var50 = 0;
         int[] var51 = this.map[var5][2];
         int var52 = 0;
         float var55 = 0.0F;
         int var66 = 0;

         for (int var46 = 0; var46 < 3; var46++) {
            int var70 = var11[var46];
            Huffman.newhuff[] var73 = Huffman.ht;
            int var76 = var4.table_select[var46];

            while (var70 != 0) {
               if (0 == var66) {
                  var66 = var51[var52++];
                  var55 = var4.pow2gain[var4.pow2gainPos + (var3[var7++] + var42[var16++] << var8)];
                  var50 = var51[var52++];
               }

               short[] var90 = var73[var76].table;

               short var86;
               for (int var91 = 0; (var86 = var90[var91++]) < 0; var13--) {
                  if (this.get1bit(var1) != 0) {
                     var91 -= var86;
                  }
               }

               int var80 = var86 >> 4;
               var86 &= 15;
               if (var80 == 15) {
                  var49 = var50;
                  var13 -= var73[var76].linbits + 1;
                  var80 += this.common.getbits(var1, var73[var76].linbits);
                  if (this.get1bit(var1) != 0) {
                     var9[var10++] = -this.ispow[var80] * var55;
                  } else {
                     var9[var10++] = this.ispow[var80] * var55;
                  }
               } else if (var80 != 0) {
                  var49 = var50;
                  if (this.get1bit(var1) != 0) {
                     var9[var10++] = -this.ispow[var80] * var55;
                  } else {
                     var9[var10++] = this.ispow[var80] * var55;
                  }

                  var13--;
               } else {
                  var9[var10++] = 0.0F;
               }

               if (var86 == 15) {
                  var49 = var50;
                  var13 -= var73[var76].linbits + 1;
                  var86 += this.common.getbits(var1, var73[var76].linbits);
                  if (this.get1bit(var1) != 0) {
                     var9[var10++] = -this.ispow[var86] * var55;
                  } else {
                     var9[var10++] = this.ispow[var86] * var55;
                  }
               } else if (var86 != 0) {
                  var49 = var50;
                  if (this.get1bit(var1) != 0) {
                     var9[var10++] = -this.ispow[var86] * var55;
                  } else {
                     var9[var10++] = this.ispow[var86] * var55;
                  }

                  var13--;
               } else {
                  var9[var10++] = 0.0F;
               }

               var70--;
               var66--;
            }
         }

         for (; var12 != 0 && var13 > 0; var12--) {
            Huffman.newhuff[] var71 = Huffman.htc;
            int var74 = var4.count1table_select;
            short[] var77 = var71[var74].table;
            int var82 = 0;

            short var89;
            while ((var89 = var77[var82++]) < 0) {
               if (--var13 < 0) {
                  var13++;
                  var89 = 0;
                  break;
               }

               if (this.get1bit(var1) != 0) {
                  var82 -= var89;
               }
            }

            for (int var47 = 0; var47 < 4; var47++) {
               if (0 == (var47 & 1)) {
                  if (0 == var66) {
                     var66 = var51[var52++];
                     var50 = var51[var52++];
                     var55 = var4.pow2gain[var4.pow2gainPos + (var3[var7++] + var42[var16++] << var8)];
                  }

                  var66--;
               }

               if ((var89 & 8 >> var47) != 0) {
                  var49 = var50;
                  if (--var13 < 0) {
                     var13++;
                     break;
                  }

                  if (this.get1bit(var1) != 0) {
                     var9[var10++] = -var55;
                  } else {
                     var9[var10++] = var55;
                  }
               } else {
                  var9[var10++] = 0.0F;
               }
            }
         }

         for (int var48 = 576 - var10 >> 1; var48 != 0; var48--) {
            var9[var10++] = 0.0F;
            var9[var10++] = 0.0F;
         }

         var4.maxbandl = var49 + 1;
         var4.maxb = this.longLimit[var5][var4.maxbandl];
      }

      while (var13 > 16) {
         this.common.getbits(var1, 16);
         var13 -= 16;
      }

      if (var13 > 0) {
         this.common.getbits(var1, var13);
      } else if (var13 < 0) {
         System.err.printf("hip: Can't rewind stream by %d bits!\n", -var13);
         return 1;
      }

      return 0;
   }

   private void III_i_stereo(float[][] var1, int[] var2, MPG123.gr_info_s var3, int var4, int var5, int var6) {
      float[][] var7 = var1;
      Layer3.bandInfoStruct var8 = bandInfo[var4];
      float[] var9;
      float[] var10;
      if (var6 != 0) {
         int var11 = var3.scalefac_compress & 1;
         if (var5 != 0) {
            var9 = this.pow1_2[var11];
            var10 = this.pow2_2[var11];
         } else {
            var9 = this.pow1_1[var11];
            var10 = this.pow2_1[var11];
         }
      } else if (var5 != 0) {
         var9 = this.tan1_2;
         var10 = this.tan2_2;
      } else {
         var9 = this.tan1_1;
         var10 = this.tan2_1;
      }

      if (var3.block_type == 2) {
         boolean var12 = false;
         if (var3.mixed_block_flag != 0) {
            var12 = true;
         }

         for (int var20 = 0; var20 < 3; var20++) {
            int var16 = var3.maxband[var20];
            if (var16 > 3) {
               var12 = false;
            }

            for (; var16 < 12; var16++) {
               int var13 = var2[var16 * 3 + var20 - var3.mixed_block_flag];
               if (var13 != 7) {
                  int var14 = var8.shortDiff[var16];
                  int var15 = var8.shortIdx[var16] + var20;
                  float var17 = var9[var13];
                  float var18 = var10[var13];

                  while (var14 > 0) {
                     float var19 = var7[0][var15];
                     var7[0][var15] = var19 * var17;
                     var7[1][var15] = var19 * var18;
                     var14--;
                     var15 += 3;
                  }
               }
            }

            int var24 = var2[33 + var20 - var3.mixed_block_flag];
            int var27 = var8.shortDiff[12];
            int var31 = var8.shortIdx[12] + var20;
            if (var24 != 7) {
               float var38 = var9[var24];
               float var42 = var10[var24];

               while (var27 > 0) {
                  float var44 = var7[0][var31];
                  var7[0][var31] = var44 * var38;
                  var7[1][var31] = var44 * var42;
                  var27--;
                  var31 += 3;
               }
            }
         }

         if (var12) {
            int var25 = var3.maxbandl;
            int var28 = var8.longIdx[var25];

            while (var25 < 8) {
               int var32 = var8.longDiff[var25];
               int var35 = var2[var25];
               if (var35 != 7) {
                  float var39 = var9[var35];
                  float var43 = var10[var35];

                  while (var32 > 0) {
                     float var45 = var7[0][var28];
                     var7[0][var28] = var45 * var39;
                     var7[1][var28] = var45 * var43;
                     var32--;
                     var28++;
                  }
               } else {
                  var28 += var32;
               }

               var25++;
            }
         }
      } else {
         int var21 = var3.maxbandl;
         int var26 = var8.longIdx[var21];

         while (var21 < 21) {
            int var29 = var8.longDiff[var21];
            int var22 = var2[var21];
            if (var22 != 7) {
               float var33 = var9[var22];
               float var36 = var10[var22];

               while (var29 > 0) {
                  float var40 = var7[0][var26];
                  var7[0][var26] = var40 * var33;
                  var7[1][var26] = var40 * var36;
                  var29--;
                  var26++;
               }
            } else {
               var26 += var29;
            }

            var21++;
         }

         int var23 = var2[20];
         if (var23 != 7) {
            float var34 = var9[var23];
            float var37 = var10[var23];

            for (int var30 = var8.longDiff[21]; var30 > 0; var26++) {
               float var41 = var7[0][var26];
               var7[0][var26] = var41 * var34;
               var7[1][var26] = var41 * var37;
               var30--;
            }
         }
      }
   }

   private void III_antialias(float[] var1, MPG123.gr_info_s var2) {
      int var3;
      if (var2.block_type == 2) {
         if (0 == var2.mixed_block_flag) {
            return;
         }

         var3 = 1;
      } else {
         var3 = var2.maxb - 1;
      }

      float[] var5 = var1;
      int var6 = 18;

      for (int var4 = var3; var4 != 0; var6 += 10) {
         float[] var8 = this.aa_cs;
         float[] var9 = this.aa_ca;
         int var10 = 0;
         int var11 = 0;
         float[] var12 = var5;
         int var13 = var6;

         for (int var7 = 7; var7 >= 0; var7--) {
            float var14 = var12[--var13];
            float var15 = var5[var6];
            var12[var13] = var14 * var8[var11] - var15 * var9[var10];
            var5[var6++] = var15 * var8[var11++] + var14 * var9[var10++];
         }

         var4--;
      }
   }

   private void dct36(float[] var1, int var2, float[] var3, int var4, float[] var5, int var6, float[] var7, float[] var8, int var9) {
      float[] var10 = var1;
      int var11 = var2;
      var10[var11 + 17] = var10[var11 + 17] + var10[var11 + 16];
      var10[var11 + 16] = var10[var11 + 16] + var10[var11 + 15];
      var10[var11 + 15] = var10[var11 + 15] + var10[var11 + 14];
      var10[var11 + 14] = var10[var11 + 14] + var10[var11 + 13];
      var10[var11 + 13] = var10[var11 + 13] + var10[var11 + 12];
      var10[var11 + 12] = var10[var11 + 12] + var10[var11 + 11];
      var10[var11 + 11] = var10[var11 + 11] + var10[var11 + 10];
      var10[var11 + 10] = var10[var11 + 10] + var10[var11 + 9];
      var10[var11 + 9] = var10[var11 + 9] + var10[var11 + 8];
      var10[var11 + 8] = var10[var11 + 8] + var10[var11 + 7];
      var10[var11 + 7] = var10[var11 + 7] + var10[var11 + 6];
      var10[var11 + 6] = var10[var11 + 6] + var10[var11 + 5];
      var10[var11 + 5] = var10[var11 + 5] + var10[var11 + 4];
      var10[var11 + 4] = var10[var11 + 4] + var10[var11 + 3];
      var10[var11 + 3] = var10[var11 + 3] + var10[var11 + 2];
      var10[var11 + 2] = var10[var11 + 2] + var10[var11 + 1];
      var10[var11 + 1] = var10[var11 + 1] + var10[var11 + 0];
      var10[var11 + 17] = var10[var11 + 17] + var10[var11 + 15];
      var10[var11 + 15] = var10[var11 + 15] + var10[var11 + 13];
      var10[var11 + 13] = var10[var11 + 13] + var10[var11 + 11];
      var10[var11 + 11] = var10[var11 + 11] + var10[var11 + 9];
      var10[var11 + 9] = var10[var11 + 9] + var10[var11 + 7];
      var10[var11 + 7] = var10[var11 + 7] + var10[var11 + 5];
      var10[var11 + 5] = var10[var11 + 5] + var10[var11 + 3];
      var10[var11 + 3] = var10[var11 + 3] + var10[var11 + 1];
      float[] var12 = this.COS9;
      float[] var13 = var5;
      int var14 = var6;
      float[] var15 = var7;
      float[] var16 = var3;
      int var17 = var4;
      float[] var18 = var8;
      float var19 = var10[var11 + 6 + 0] * var12[3];
      float var20 = var10[var11 + 12 + 0] * var12[6];
      float var21 = var10[var11 + 6 + 1] * var12[3];
      float var22 = var10[var11 + 12 + 1] * var12[6];
      float var23 = var10[var11 + 2 + 0] * var12[1] + var19 + var10[var11 + 10 + 0] * var12[5] + var10[var11 + 14 + 0] * var12[7];
      float var25 = var10[var11 + 2 + 1] * var12[1] + var21 + var10[var11 + 10 + 1] * var12[5] + var10[var11 + 14 + 1] * var12[7];
      float var24 = var10[var11 + 0 + 0] + var10[var11 + 4 + 0] * var12[2] + var10[var11 + 8 + 0] * var12[4] + var20 + var10[var11 + 16 + 0] * var12[8];
      float var26 = var10[var11 + 0 + 1] + var10[var11 + 4 + 1] * var12[2] + var10[var11 + 8 + 1] * var12[4] + var22 + var10[var11 + 16 + 1] * var12[8];
      float var27 = var23 + var24;
      float var28 = (var25 + var26) * this.tfcos36[0];
      float var29;
      var13[var14 + 9 + 0] = (var29 = var27 + var28) * var15[27];
      var13[var14 + 8 - 0] = var29 * var15[26];
      var27 -= var28;
      var18[var9 + 256] = var16[var17 + 8 - 0] + var27 * var15[8];
      var18[var9 + 288] = var16[var17 + 9 + 0] + var27 * var15[9];
      var27 = var24 - var23;
      var28 = (var26 - var25) * this.tfcos36[8];
      var13[var14 + 9 + 8] = (var29 = var27 + var28) * var15[35];
      var13[var14 + 8 - 8] = var29 * var15[18];
      var27 -= var28;
      var18[var9 + 0] = var16[var17 + 8 - 8] + var27 * var15[0];
      var18[var9 + 544] = var16[var17 + 9 + 8] + var27 * var15[17];
      var23 = (var10[var11 + 2 + 0] - var10[var11 + 10 + 0] - var10[var11 + 14 + 0]) * var12[3];
      var25 = (var10[var11 + 2 + 1] - var10[var11 + 10 + 1] - var10[var11 + 14 + 1]) * var12[3];
      var24 = (var10[var11 + 4 + 0] - var10[var11 + 8 + 0] - var10[var11 + 16 + 0]) * var12[6] - var10[var11 + 12 + 0] + var10[var11 + 0 + 0];
      var26 = (var10[var11 + 4 + 1] - var10[var11 + 8 + 1] - var10[var11 + 16 + 1]) * var12[6] - var10[var11 + 12 + 1] + var10[var11 + 0 + 1];
      var27 = var23 + var24;
      var28 = (var25 + var26) * this.tfcos36[1];
      var13[var14 + 9 + 1] = (var29 = var27 + var28) * var15[28];
      var13[var14 + 8 - 1] = var29 * var15[25];
      var27 -= var28;
      var18[var9 + 224] = var16[var17 + 8 - 1] + var27 * var15[7];
      var18[var9 + 320] = var16[var17 + 9 + 1] + var27 * var15[10];
      var27 = var24 - var23;
      var28 = (var26 - var25) * this.tfcos36[7];
      var13[var14 + 9 + 7] = (var29 = var27 + var28) * var15[34];
      var13[var14 + 8 - 7] = var29 * var15[19];
      var27 -= var28;
      var18[var9 + 32] = var16[var17 + 8 - 7] + var27 * var15[1];
      var18[var9 + 512] = var16[var17 + 9 + 7] + var27 * var15[16];
      var23 = var10[var11 + 2 + 0] * var12[5] - var19 - var10[var11 + 10 + 0] * var12[7] + var10[var11 + 14 + 0] * var12[1];
      var25 = var10[var11 + 2 + 1] * var12[5] - var21 - var10[var11 + 10 + 1] * var12[7] + var10[var11 + 14 + 1] * var12[1];
      var24 = var10[var11 + 0 + 0] - var10[var11 + 4 + 0] * var12[8] - var10[var11 + 8 + 0] * var12[2] + var20 + var10[var11 + 16 + 0] * var12[4];
      var26 = var10[var11 + 0 + 1] - var10[var11 + 4 + 1] * var12[8] - var10[var11 + 8 + 1] * var12[2] + var22 + var10[var11 + 16 + 1] * var12[4];
      var27 = var23 + var24;
      var28 = (var25 + var26) * this.tfcos36[2];
      var13[var14 + 9 + 2] = (var29 = var27 + var28) * var15[29];
      var13[var14 + 8 - 2] = var29 * var15[24];
      var27 -= var28;
      var18[var9 + 192] = var16[var17 + 8 - 2] + var27 * var15[6];
      var18[var9 + 352] = var16[var17 + 9 + 2] + var27 * var15[11];
      var27 = var24 - var23;
      var28 = (var26 - var25) * this.tfcos36[6];
      var13[var14 + 9 + 6] = (var29 = var27 + var28) * var15[33];
      var13[var14 + 8 - 6] = var29 * var15[20];
      var27 -= var28;
      var18[var9 + 64] = var16[var17 + 8 - 6] + var27 * var15[2];
      var18[var9 + 480] = var16[var17 + 9 + 6] + var27 * var15[15];
      var23 = var10[var11 + 2 + 0] * var12[7] - var19 + var10[var11 + 10 + 0] * var12[1] - var10[var11 + 14 + 0] * var12[5];
      var25 = var10[var11 + 2 + 1] * var12[7] - var21 + var10[var11 + 10 + 1] * var12[1] - var10[var11 + 14 + 1] * var12[5];
      var24 = var10[var11 + 0 + 0] - var10[var11 + 4 + 0] * var12[4] + var10[var11 + 8 + 0] * var12[8] + var20 - var10[var11 + 16 + 0] * var12[2];
      var26 = var10[var11 + 0 + 1] - var10[var11 + 4 + 1] * var12[4] + var10[var11 + 8 + 1] * var12[8] + var22 - var10[var11 + 16 + 1] * var12[2];
      var27 = var23 + var24;
      var28 = (var25 + var26) * this.tfcos36[3];
      var13[var14 + 9 + 3] = (var29 = var27 + var28) * var15[30];
      var13[var14 + 8 - 3] = var29 * var15[23];
      var27 -= var28;
      var18[var9 + 160] = var16[var17 + 8 - 3] + var27 * var15[5];
      var18[var9 + 384] = var16[var17 + 9 + 3] + var27 * var15[12];
      var27 = var24 - var23;
      var28 = (var26 - var25) * this.tfcos36[5];
      var13[var14 + 9 + 5] = (var29 = var27 + var28) * var15[32];
      var13[var14 + 8 - 5] = var29 * var15[21];
      var27 -= var28;
      var18[var9 + 96] = var16[var17 + 8 - 5] + var27 * var15[3];
      var18[var9 + 448] = var16[var17 + 9 + 5] + var27 * var15[14];
      var23 = var10[var11 + 0 + 0] - var10[var11 + 4 + 0] + var10[var11 + 8 + 0] - var10[var11 + 12 + 0] + var10[var11 + 16 + 0];
      var24 = (var10[var11 + 0 + 1] - var10[var11 + 4 + 1] + var10[var11 + 8 + 1] - var10[var11 + 12 + 1] + var10[var11 + 16 + 1]) * this.tfcos36[4];
      var13[var14 + 9 + 4] = (var25 = var23 + var24) * var15[31];
      var13[var14 + 8 - 4] = var25 * var15[22];
      var23 -= var24;
      var18[var9 + 128] = var16[var17 + 8 - 4] + var23 * var15[4];
      var18[var9 + 416] = var16[var17 + 9 + 4] + var23 * var15[13];
   }

   private void dct12(float[] var1, int var2, float[] var3, int var4, float[] var5, int var6, float[] var7, float[] var8, int var9) {
      float[] var16 = var3;
      int var17 = var4;
      var8[var9 + 0] = var16[var17 + 0];
      var8[var9 + 32] = var16[var17 + 1];
      var8[var9 + 64] = var16[var17 + 2];
      var8[var9 + 96] = var16[var17 + 3];
      var8[var9 + 128] = var16[var17 + 4];
      var8[var9 + 160] = var16[var17 + 5];
      float var15 = var1[var2 + 15];
      float var14;
      var15 += var14 = var1[var2 + 12];
      float var13;
      var14 += var13 = var1[var2 + 9];
      float var12;
      var13 += var12 = var1[var2 + 6];
      float var11;
      var12 += var11 = var1[var2 + 3];
      float var10;
      var11 += var10 = var1[var2 + 0];
      var15 += var13;
      var13 += var11;
      var12 *= this.COS6_1;
      var13 *= this.COS6_1;
      float var19 = var10 - var14;
      float var20 = (var11 - var15) * this.tfcos12[1];
      float var18 = var19 + var20;
      var19 -= var20;
      var8[var9 + 512] = var16[var17 + 17 - 1] + var18 * var7[10];
      var8[var9 + 416] = var16[var17 + 12 + 1] + var18 * var7[7];
      var8[var9 + 224] = var16[var17 + 6 + 1] + var19 * var7[1];
      var8[var9 + 320] = var16[var17 + 11 - 1] + var19 * var7[4];
      var10 += var14 * this.COS6_2;
      var14 = var10 + var12;
      var10 -= var12;
      var11 += var15 * this.COS6_2;
      var15 = (var11 + var13) * this.tfcos12[0];
      var11 = (var11 - var13) * this.tfcos12[2];
      var13 = var14 + var15;
      var14 -= var15;
      var12 = var10 + var11;
      var10 -= var11;
      var8[var9 + 544] = var16[var17 + 17 - 0] + var12 * var7[11];
      var8[var9 + 384] = var16[var17 + 12 + 0] + var12 * var7[6];
      var8[var9 + 448] = var16[var17 + 12 + 2] + var13 * var7[8];
      var8[var9 + 480] = var16[var17 + 17 - 2] + var13 * var7[9];
      var8[var9 + 192] = var16[var17 + 6 + 0] + var10 * var7[0];
      var8[var9 + 352] = var16[var17 + 11 - 0] + var10 * var7[5];
      var8[var9 + 256] = var16[var17 + 6 + 2] + var14 * var7[2];
      var8[var9 + 288] = var16[var17 + 11 - 2] + var14 * var7[3];
      var2++;
      var16 = var5;
      var17 = var6;
      var15 = var1[var2 + 15];
      var15 += var14 = var1[var2 + 12];
      var14 += var13 = var1[var2 + 9];
      var13 += var12 = var1[var2 + 6];
      var12 += var11 = var1[var2 + 3];
      var11 += var10 = var1[var2 + 0];
      var15 += var13;
      var13 += var11;
      var12 *= this.COS6_1;
      var13 *= this.COS6_1;
      var19 = var10 - var14;
      var20 = (var11 - var15) * this.tfcos12[1];
      var18 = var19 + var20;
      var19 -= var20;
      var16[var17 + 5 - 1] = var18 * var7[10];
      var16[var17 + 0 + 1] = var18 * var7[7];
      var8[var9 + 416] = var8[var9 + 416] + var19 * var7[1];
      var8[var9 + 512] = var8[var9 + 512] + var19 * var7[4];
      var10 += var14 * this.COS6_2;
      var14 = var10 + var12;
      var10 -= var12;
      var11 += var15 * this.COS6_2;
      var15 = (var11 + var13) * this.tfcos12[0];
      var11 = (var11 - var13) * this.tfcos12[2];
      var13 = var14 + var15;
      var14 -= var15;
      var12 = var10 + var11;
      var10 -= var11;
      var16[var17 + 5 - 0] = var12 * var7[11];
      var16[var17 + 0 + 0] = var12 * var7[6];
      var16[var17 + 0 + 2] = var13 * var7[8];
      var16[var17 + 5 - 2] = var13 * var7[9];
      var8[var9 + 384] = var8[var9 + 384] + var10 * var7[0];
      var8[var9 + 544] = var8[var9 + 544] + var10 * var7[5];
      var8[var9 + 448] = var8[var9 + 448] + var14 * var7[2];
      var8[var9 + 480] = var8[var9 + 480] + var14 * var7[3];
      var2++;
      var16 = var5;
      var17 = var6;
      var16[var17 + 12] = var16[var17 + 13] = var16[var17 + 14] = var16[var17 + 15] = var16[var17 + 16] = var16[var17 + 17] = 0.0F;
      var15 = var1[var2 + 15];
      var15 += var14 = var1[var2 + 12];
      var14 += var13 = var1[var2 + 9];
      var13 += var12 = var1[var2 + 6];
      var12 += var11 = var1[var2 + 3];
      var11 += var10 = var1[var2 + 0];
      var15 += var13;
      var13 += var11;
      var12 *= this.COS6_1;
      var13 *= this.COS6_1;
      var19 = var10 - var14;
      var20 = (var11 - var15) * this.tfcos12[1];
      var18 = var19 + var20;
      var19 -= var20;
      var16[var17 + 11 - 1] = var18 * var7[10];
      var16[var17 + 6 + 1] = var18 * var7[7];
      var16[var17 + 0 + 1] = var16[var17 + 0 + 1] + var19 * var7[1];
      var16[var17 + 5 - 1] = var16[var17 + 5 - 1] + var19 * var7[4];
      var10 += var14 * this.COS6_2;
      var14 = var10 + var12;
      var10 -= var12;
      var11 += var15 * this.COS6_2;
      var15 = (var11 + var13) * this.tfcos12[0];
      var11 = (var11 - var13) * this.tfcos12[2];
      var13 = var14 + var15;
      var14 -= var15;
      var12 = var10 + var11;
      var10 -= var11;
      var16[var17 + 11 - 0] = var12 * var7[11];
      var16[var17 + 6 + 0] = var12 * var7[6];
      var16[var17 + 6 + 2] = var13 * var7[8];
      var16[var17 + 11 - 2] = var13 * var7[9];
      var16[var17 + 0 + 0] = var16[var17 + 0 + 0] + var10 * var7[0];
      var16[var17 + 5 - 0] = var16[var17 + 5 - 0] + var10 * var7[5];
      var16[var17 + 0 + 2] = var16[var17 + 0 + 2] + var14 * var7[2];
      var16[var17 + 5 - 2] = var16[var17 + 5 - 2] + var14 * var7[3];
   }

   private void III_hybrid(MPGLib.mpstr_tag var1, float[] var2, float[] var3, int var4, MPG123.gr_info_s var5) {
      float[] var6 = var3;
      int var7 = 0;
      float[][][] var8 = var1.hybrid_block;
      int[] var9 = var1.hybrid_blc;
      int var15 = 0;
      int var16 = var9[var4];
      float[] var10 = var8[var16][var4];
      int var12 = 0;
      var16 = -var16 + 1;
      float[] var11 = var8[var16][var4];
      int var13 = 0;
      var9[var4] = var16;
      if (var5.mixed_block_flag != 0) {
         var15 = 2;
         this.dct36(var2, 0, var10, var12, var11, var13, this.win[0], var6, var7 + 0);
         this.dct36(var2, 18, var10, var12 + 18, var11, var13 + 18, this.win1[0], var6, var7 + 1);
         var12 += 36;
         var13 += 36;
         var7 += 2;
      }

      int var14 = var5.block_type;
      if (var14 == 2) {
         while (var15 < var5.maxb) {
            this.dct12(var2, var15 * 18, var10, var12, var11, var13, this.win[2], var6, var7 + 0);
            this.dct12(var2, (var15 + 1) * 18, var10, var12 + 18, var11, var13 + 18, this.win1[2], var6, var7 + 1);
            var15 += 2;
            var7 += 2;
            var12 += 36;
            var13 += 36;
         }
      } else {
         while (var15 < var5.maxb) {
            this.dct36(var2, var15 * 18, var10, var12, var11, var13, this.win[var14], var6, var7 + 0);
            this.dct36(var2, (var15 + 1) * 18, var10, var12 + 18, var11, var13 + 18, this.win1[var14], var6, var7 + 1);
            var15 += 2;
            var7 += 2;
            var12 += 36;
            var13 += 36;
         }
      }

      while (var15 < 32) {
         for (int var18 = 0; var18 < 18; var18++) {
            var6[var7 + var18 * 32] = var10[var12++];
            var11[var13++] = 0.0F;
         }

         var15++;
         var7++;
      }
   }

   public int layer3_audiodata_precedesframes(MPGLib.mpstr_tag var1) {
      int var2 = var1.bsize - 4 - var1.ssize;
      return (this.sideinfo.main_data_begin + var2 - 1) / var2;
   }

   public int do_layer3_sideinfo(MPGLib.mpstr_tag var1) {
      Frame var2 = var1.fr;
      int var3 = var2.stereo;
      int var4 = var2.single;
      int var6 = var2.sampling_frequency;
      if (var3 == 1) {
         var4 = 0;
      }

      int var5;
      if (var2.mode == 1) {
         var5 = var2.mode_ext & 2;
      } else {
         var5 = 0;
      }

      byte var7;
      if (var2.lsf != 0) {
         var7 = 1;
         this.III_get_side_info_2(var1, this.sideinfo, var3, var5, var6, var4);
      } else {
         var7 = 2;
         this.III_get_side_info_1(var1, this.sideinfo, var3, var5, var6, var4);
      }

      int var10 = 0;

      for (int var9 = 0; var9 < var7; var9++) {
         for (int var8 = 0; var8 < var3; var8++) {
            MPG123.gr_info_s var11 = this.sideinfo.ch[var8].gr[var9];
            var10 += var11.part2_3_length;
         }
      }

      return var10 - 8 * this.sideinfo.main_data_begin;
   }

   public int do_layer3(MPGLib.mpstr_tag var1, float[] var2, MPGLib.ProcessedBytes var3, Interface.ISynth var4) {
      int var8 = 0;
      int[][] var9 = new int[2][39];
      Frame var10 = var1.fr;
      int var11 = var10.stereo;
      int var12 = var10.single;
      int var15 = var10.sampling_frequency;
      if (this.common.set_pointer(var1, this.sideinfo.main_data_begin) == -1) {
         return 0;
      }

      byte var16;
      if (var11 == 1) {
         var16 = 1;
         var12 = 0;
      } else if (var12 >= 0) {
         var16 = 1;
      } else {
         var16 = 2;
      }

      int var13;
      int var14;
      if (var10.mode == 1) {
         var13 = var10.mode_ext & 2;
         var14 = var10.mode_ext & 1;
      } else {
         var14 = 0;
         var13 = 0;
      }

      byte var17;
      if (var10.lsf != 0) {
         var17 = 1;
      } else {
         var17 = 2;
      }

      for (int var5 = 0; var5 < var17; var5++) {
         MPG123.gr_info_s var18 = this.sideinfo.ch[0].gr[var5];
         int var19;
         if (var10.lsf != 0) {
            var19 = this.III_get_scale_factors_2(var1, var9[0], var18, 0);
         } else {
            var19 = this.III_get_scale_factors_1(var1, var9[0], var18);
         }

         if (var1.pinfo != null) {
            var1.pinfo.sfbits[var5][0] = var19;

            for (int var20 = 0; var20 < 39; var20++) {
               var1.pinfo.sfb_s[var5][0][var20] = var9[0][var20];
            }
         }

         if (this.III_dequantize_sample(var1, this.hybridIn[0], var9[0], var18, var15, var19) != 0) {
            return var8;
         }

         if (var11 == 2) {
            var18 = this.sideinfo.ch[1].gr[var5];
            if (var10.lsf != 0) {
               var19 = this.III_get_scale_factors_2(var1, var9[1], var18, var14);
            } else {
               var19 = this.III_get_scale_factors_1(var1, var9[1], var18);
            }

            if (var1.pinfo != null) {
               var1.pinfo.sfbits[var5][1] = var19;

               for (int var38 = 0; var38 < 39; var38++) {
                  var1.pinfo.sfb_s[var5][1][var38] = var9[1][var38];
               }
            }

            if (this.III_dequantize_sample(var1, this.hybridIn[1], var9[1], var18, var15, var19) != 0) {
               return var8;
            }

            if (var13 != 0) {
               for (int var39 = 0; var39 < 576; var39++) {
                  float var21 = this.hybridIn[0][var39];
                  float var22 = this.hybridIn[1][var39];
                  this.hybridIn[1][var39] = var21 - var22;
                  this.hybridIn[0][var39] = var21 + var22;
               }
            }

            if (var14 != 0) {
               this.III_i_stereo(this.hybridIn, var9[1], var18, var15, var13, var10.lsf);
            }

            if (var13 != 0 || var14 != 0 || var12 == 3) {
               if (var18.maxb > this.sideinfo.ch[0].gr[var5].maxb) {
                  this.sideinfo.ch[0].gr[var5].maxb = var18.maxb;
               } else {
                  var18.maxb = this.sideinfo.ch[0].gr[var5].maxb;
               }
            }

            switch (var12) {
               case 1:
                  float[] var44 = this.hybridIn[0];
                  float[] var49 = this.hybridIn[1];
                  int var51 = 0;
                  int var52 = 0;

                  for (int var41 = 0; var41 < 18 * var18.maxb; var41++) {
                     var44[var51++] = var49[var52++];
                  }
                  break;
               case 3:
                  float[] var43 = this.hybridIn[0];
                  float[] var48 = this.hybridIn[1];
                  int var23 = 0;
                  int var24 = 0;

                  for (int var40 = 0; var40 < 18 * var18.maxb; var23++) {
                     var43[var23] += var48[var24++];
                     var40++;
                  }
            }
         }

         if (var1.pinfo != null) {
            var1.pinfo.bitrate = Common.tabsel_123[var10.lsf][var10.lay - 1][var10.bitrate_index];
            var1.pinfo.sampfreq = Common.freqs[var15];
            var1.pinfo.emph = var10.emphasis;
            var1.pinfo.crc = var10.error_protection ? 1 : 0;
            var1.pinfo.padding = var10.padding;
            var1.pinfo.stereo = var10.stereo;
            var1.pinfo.js = var10.mode == 1 ? 1 : 0;
            var1.pinfo.ms_stereo = var13;
            var1.pinfo.i_stereo = var14;
            var1.pinfo.maindata = this.sideinfo.main_data_begin;

            for (int var6 = 0; var6 < var16; var6++) {
               MPG123.gr_info_s var45 = this.sideinfo.ch[var6].gr[var5];
               var1.pinfo.big_values[var5][var6] = var45.big_values;
               var1.pinfo.scalefac_scale[var5][var6] = var45.scalefac_scale;
               var1.pinfo.mixed[var5][var6] = var45.mixed_block_flag;
               var1.pinfo.mpg123blocktype[var5][var6] = var45.block_type;
               var1.pinfo.mainbits[var5][var6] = var45.part2_3_length;
               var1.pinfo.preflag[var5][var6] = var45.preflag;
               if (var5 == 1) {
                  var1.pinfo.scfsi[var6] = var45.scfsi;
               }
            }

            for (int var25 = 0; var25 < var16; var25++) {
               MPG123.gr_info_s var46 = this.sideinfo.ch[var25].gr[var5];
               float var42 = var1.pinfo.scalefac_scale[var5][var25] == 0 ? 0.5F : 1.0F;
               if (2 == var46.block_type) {
                  for (int var31 = 0; var31 < 3; var31++) {
                     for (var19 = 0; var19 < 12; var19++) {
                        int var50 = 3 * var19 + var31;
                        var1.pinfo.sfb_s[var5][var25][var50] = -var42 * var1.pinfo.sfb_s[var5][var25][var50 - var46.mixed_block_flag];
                        var1.pinfo.sfb_s[var5][var25][var50] = var1.pinfo.sfb_s[var5][var25][var50] - 2 * var1.pinfo.sub_gain[var5][var25][var31];
                     }

                     var1.pinfo.sfb_s[var5][var25][3 * var19 + var31] = -2 * var1.pinfo.sub_gain[var5][var25][var31];
                  }
               } else {
                  for (int var36 = 0; var36 < 21; var36++) {
                     var1.pinfo.sfb[var5][var25][var36] = var1.pinfo.sfb_s[var5][var25][var36];
                     if (var46.preflag != 0) {
                        var1.pinfo.sfb[var5][var25][var36] = var1.pinfo.sfb[var5][var25][var36] + pretab1[var36];
                     }

                     var1.pinfo.sfb[var5][var25][var36] = var1.pinfo.sfb[var5][var25][var36] * -var42;
                  }

                  var1.pinfo.sfb[var5][var25][21] = 0.0;
               }
            }

            for (int var26 = 0; var26 < var16; var26++) {
               int var47 = 0;

               for (int var37 = 0; var37 < 32; var37++) {
                  for (int var7 = 0; var7 < 18; var47++) {
                     var1.pinfo.mpg123xr[var5][var26][var47] = this.hybridIn[var26][var37 * 18 + var7];
                     var7++;
                  }
               }
            }
         }

         for (int var27 = 0; var27 < var16; var27++) {
            var18 = this.sideinfo.ch[var27].gr[var5];
            this.III_antialias(this.hybridIn[var27], var18);
            this.III_hybrid(var1, this.hybridIn[var27], this.hybridOut[var27], var27, var18);
         }

         for (int var28 = 0; var28 < 18; var28++) {
            if (var12 >= 0) {
               var8 += var4.synth_1to1_mono_ptr(var1, this.hybridOut[0], var28 * 32, var2, var3);
            } else {
               MPGLib.ProcessedBytes var33 = new MPGLib.ProcessedBytes();
               var33.pb = var3.pb;
               var8 += var4.synth_1to1_ptr(var1, this.hybridOut[0], var28 * 32, 0, var2, var33);
               var8 += var4.synth_1to1_ptr(var1, this.hybridOut[1], var28 * 32, 1, var2, var3);
            }
         }
      }

      return var8;
   }

   private static class bandInfoStruct {
      short[] longIdx = new short[23];
      short[] longDiff = new short[22];
      short[] shortIdx = new short[14];
      short[] shortDiff = new short[13];

      public bandInfoStruct(short[] var1, short[] var2, short[] var3, short[] var4) {
         this.longIdx = var1;
         this.longDiff = var2;
         this.shortIdx = var3;
         this.shortDiff = var4;
      }
   }
}
