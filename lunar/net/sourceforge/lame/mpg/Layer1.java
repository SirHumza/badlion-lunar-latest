package net.sourceforge.lame.mpg;

public class Layer1 {
   private Common common;
   private Decode decode;

   public Layer1(Common var1, Decode var2) {
      this.common = var1;
      this.decode = var2;
   }

   private void I_step_one(MPGLib.mpstr_tag var1, int[] var2, int[] var3, Frame var4) {
      int var5 = 0;
      int var6 = 0;
      assert var4.stereo == 1 || var4.stereo == 2;
      if (var4.stereo == 2) {
         int var8 = var4.jsbound;

         for (int var7 = 0; var7 < var8; var7++) {
            var2[var5++] = this.common.getbits(var1, 4);
            var2[var5++] = this.common.getbits(var1, 4);
         }

         for (int var13 = var8; var13 < 32; var13++) {
            var2[var5++] = this.common.getbits(var1, 4);
         }

         var5 = 0;

         for (int var14 = 0; var14 < var8; var14++) {
            if (var2[var5]++ != 0) {
               var3[var6++] = this.common.getbits(var1, 6);
            }

            if (var2[var5++] != 0) {
               var3[var6++] = this.common.getbits(var1, 6);
            }
         }

         for (int var15 = var8; var15 < 32; var15++) {
            if (var2[var5++] != 0) {
               var3[var6++] = this.common.getbits(var1, 6);
               var3[var6++] = this.common.getbits(var1, 6);
            }
         }
      } else {
         for (int var16 = 0; var16 < 32; var16++) {
            var2[var5++] = this.common.getbits(var1, 4);
         }

         var5 = 0;

         for (int var17 = 0; var17 < 32; var17++) {
            if (var2[var5++] != 0) {
               var3[var6++] = this.common.getbits(var1, 6);
            }
         }
      }
   }

   private void I_step_two(MPGLib.mpstr_tag var1, float[][] var2, int[] var3, int[] var4, Frame var5) {
      int[] var8 = new int[64];
      int var10 = 0;
      int var11 = 0;
      assert var5.stereo == 1 || var5.stereo == 2;
      if (var5.stereo == 2) {
         int var12 = var5.jsbound;
         int var13 = 0;
         int var14 = 0;
         var10 = 0;
         int var9 = 0;

         for (int var6 = 0; var6 < var12; var6++) {
            int var7 = var3[var10++];
            if (var7 != 0) {
               var8[var9++] = this.common.getbits(var1, var7 + 1);
            }

            var7 = var3[var10++];
            if (var7 != 0) {
               var8[var9++] = this.common.getbits(var1, var7 + 1);
            }
         }

         for (int var16 = var12; var16 < 32; var16++) {
            int var24 = var3[var10++];
            if (var24 != 0) {
               var8[var9++] = this.common.getbits(var1, var24 + 1);
            }
         }

         var10 = 0;
         var9 = 0;

         for (int var17 = 0; var17 < var12; var17++) {
            int var25 = var3[var10++];
            if (var25 != 0) {
               var2[0][var13++] = ((-1 << var25) + var8[var9++] + 1) * this.common.muls[var25 + 1][var4[var11++]];
            } else {
               var2[0][var13++] = 0.0F;
            }

            var25 = var3[var10++];
            if (var25 != 0) {
               var2[1][var14++] = ((-1 << var25) + var8[var9++] + 1) * this.common.muls[var25 + 1][var4[var11++]];
            } else {
               var2[1][var14++] = 0.0F;
            }
         }

         for (int var18 = var12; var18 < 32; var18++) {
            int var27 = var3[var10++];
            if (var27 != 0) {
               float var15 = (-1 << var27) + var8[var9++] + 1;
               var2[0][var13++] = var15 * this.common.muls[var27 + 1][var4[var11++]];
               var2[1][var14++] = var15 * this.common.muls[var27 + 1][var4[var11++]];
            } else {
               var2[0][var13++] = var2[1][var14++] = 0.0F;
            }
         }

         for (int var19 = var5.down_sample_sblimit; var19 < 32; var19++) {
            var2[0][var19] = var2[1][var19] = 0.0F;
         }
      } else {
         int var40 = 0;
         var10 = 0;
         int var31 = 0;

         for (int var20 = 0; var20 < 32; var20++) {
            int var28 = var3[var10++];
            if (var28 != 0) {
               var8[var31++] = this.common.getbits(var1, var28 + 1);
            }
         }

         var10 = 0;
         var31 = 0;

         for (int var21 = 0; var21 < 32; var21++) {
            int var29 = var3[var10++];
            if (var29 != 0) {
               var2[0][var40++] = ((-1 << var29) + var8[var31++] + 1) * this.common.muls[var29 + 1][var4[var11++]];
            } else {
               var2[0][var40++] = 0.0F;
            }
         }

         for (int var22 = var5.down_sample_sblimit; var22 < 32; var22++) {
            var2[0][var22] = 0.0F;
         }
      }
   }

   public int do_layer1(MPGLib.mpstr_tag var1, float[] var2, MPGLib.ProcessedBytes var3) {
      int var4 = 0;
      int[] var5 = new int[64];
      int[] var6 = new int[64];
      float[][] var7 = new float[2][32];
      Frame var8 = var1.fr;
      int var10 = var8.stereo;
      int var11 = var8.single;
      var8.jsbound = var8.mode == 1 ? (var8.mode_ext << 2) + 4 : 32;
      if (var10 == 1 || var11 == 3) {
         var11 = 0;
      }

      this.I_step_one(var1, var5, var6, var8);

      for (int var9 = 0; var9 < 12; var9++) {
         this.I_step_two(var1, var7, var5, var6, var8);
         if (var11 >= 0) {
            var4 += this.decode.synth1to1mono(var1, var7[var11], 0, var2, var3);
         } else {
            MPGLib.ProcessedBytes var12 = new MPGLib.ProcessedBytes();
            var12.pb = var3.pb;
            var4 += this.decode.synth_1to1(var1, var7[0], 0, 0, var2, var12);
            var4 += this.decode.synth_1to1(var1, var7[1], 0, 1, var2, var3);
         }
      }

      return var4;
   }
}
