package net.sourceforge.lame.mpg;

public class Decode {
   private TabInit tab = new TabInit();
   private DCT64 dct64 = new DCT64();

   private int writeSampleClipped(float var1, int var2, float[] var3, int var4) {
      if (var1 > 32767.0) {
         var3[var4] = 32767.0F;
         var2++;
      } else if (var1 < -32768.0) {
         var3[var4] = -32768.0F;
         var2++;
      } else {
         var3[var4] = (int)(var1 > 0.0F ? var1 + 0.5 : var1 - 0.5);
      }

      return var2;
   }

   private void writeSampleUnclipped(float var1, float[] var2, int var3) {
      var2[var3] = var1;
   }

   int synth1to1mono(MPGLib.mpstr_tag var1, float[] var2, int var3, float[] var4, MPGLib.ProcessedBytes var5) {
      float[] var6 = new float[64];
      int var7 = this.synth_1to1(var1, var2, var3, 0, var6, new MPGLib.ProcessedBytes());

      for (byte var8 = 0; var8 < var6.length; var8 += 2) {
         var4[var5.pb++] = var6[var8];
      }

      return var7;
   }

   void synth1to1monoUnclipped(MPGLib.mpstr_tag var1, float[] var2, int var3, float[] var4, MPGLib.ProcessedBytes var5) {
      float[] var6 = new float[64];
      this.synth_1to1_unclipped(var1, var2, var3, 0, var6, new MPGLib.ProcessedBytes());

      for (byte var7 = 0; var7 < var6.length; var7 += 2) {
         var4[var5.pb++] = var6[var7];
      }
   }

   int synth_1to1(MPGLib.mpstr_tag var1, float[] var2, int var3, int var4, float[] var5, MPGLib.ProcessedBytes var6) {
      int var8 = 0;
      if (0 == var4) {
         var1.synth_bo--;
         var1.synth_bo &= 15;
      } else {
         var6.pb++;
      }

      float[] var7;
      int var9;
      if ((var1.synth_bo & 1) != 0) {
         var7 = var1.synth_buffs[var4][0];
         var9 = var1.synth_bo;
         float[] var10 = new float[64];
         this.dct64.dct64_1(var1.synth_buffs[var4][1], var1.synth_bo + 1 & 15, var1.synth_buffs[var4][0], var1.synth_bo, var10, 32, var2, var3, this.tab.pnts);
      } else {
         var7 = var1.synth_buffs[var4][1];
         var9 = var1.synth_bo + 1;
         float[] var15 = new float[64];
         this.dct64.dct64_1(var1.synth_buffs[var4][0], var1.synth_bo, var1.synth_buffs[var4][1], var1.synth_bo + 1, var15, 32, var2, var3, this.tab.pnts);
      }

      int var16 = 16 - var9;
      int var11 = 0;

      for (int var12 = 16; var12 != 0; var6.pb += 2) {
         float var13 = this.tab.decwin[var16 + 0] * var7[var11 + 0];
         var13 -= this.tab.decwin[var16 + 1] * var7[var11 + 1];
         var13 += this.tab.decwin[var16 + 2] * var7[var11 + 2];
         var13 -= this.tab.decwin[var16 + 3] * var7[var11 + 3];
         var13 += this.tab.decwin[var16 + 4] * var7[var11 + 4];
         var13 -= this.tab.decwin[var16 + 5] * var7[var11 + 5];
         var13 += this.tab.decwin[var16 + 6] * var7[var11 + 6];
         var13 -= this.tab.decwin[var16 + 7] * var7[var11 + 7];
         var13 += this.tab.decwin[var16 + 8] * var7[var11 + 8];
         var13 -= this.tab.decwin[var16 + 9] * var7[var11 + 9];
         var13 += this.tab.decwin[var16 + 10] * var7[var11 + 10];
         var13 -= this.tab.decwin[var16 + 11] * var7[var11 + 11];
         var13 += this.tab.decwin[var16 + 12] * var7[var11 + 12];
         var13 -= this.tab.decwin[var16 + 13] * var7[var11 + 13];
         var13 += this.tab.decwin[var16 + 14] * var7[var11 + 14];
         var13 -= this.tab.decwin[var16 + 15] * var7[var11 + 15];
         var8 = this.writeSampleClipped(var13, var8, var5, var6.pb);
         var12--;
         var11 += 16;
         var16 += 32;
      }

      float var20 = this.tab.decwin[var16 + 0] * var7[var11 + 0];
      var20 += this.tab.decwin[var16 + 2] * var7[var11 + 2];
      var20 += this.tab.decwin[var16 + 4] * var7[var11 + 4];
      var20 += this.tab.decwin[var16 + 6] * var7[var11 + 6];
      var20 += this.tab.decwin[var16 + 8] * var7[var11 + 8];
      var20 += this.tab.decwin[var16 + 10] * var7[var11 + 10];
      var20 += this.tab.decwin[var16 + 12] * var7[var11 + 12];
      var20 += this.tab.decwin[var16 + 14] * var7[var11 + 14];
      var8 = this.writeSampleClipped(var20, var8, var5, var6.pb);
      var11 -= 16;
      var16 -= 32;
      var6.pb += 2;
      var16 += var9 << 1;

      for (int var28 = 15; var28 != 0; var6.pb += 2) {
         float var44 = -this.tab.decwin[var16 + -1] * var7[var11 + 0];
         var44 -= this.tab.decwin[var16 + -2] * var7[var11 + 1];
         var44 -= this.tab.decwin[var16 + -3] * var7[var11 + 2];
         var44 -= this.tab.decwin[var16 + -4] * var7[var11 + 3];
         var44 -= this.tab.decwin[var16 + -5] * var7[var11 + 4];
         var44 -= this.tab.decwin[var16 + -6] * var7[var11 + 5];
         var44 -= this.tab.decwin[var16 + -7] * var7[var11 + 6];
         var44 -= this.tab.decwin[var16 + -8] * var7[var11 + 7];
         var44 -= this.tab.decwin[var16 + -9] * var7[var11 + 8];
         var44 -= this.tab.decwin[var16 + -10] * var7[var11 + 9];
         var44 -= this.tab.decwin[var16 + -11] * var7[var11 + 10];
         var44 -= this.tab.decwin[var16 + -12] * var7[var11 + 11];
         var44 -= this.tab.decwin[var16 + -13] * var7[var11 + 12];
         var44 -= this.tab.decwin[var16 + -14] * var7[var11 + 13];
         var44 -= this.tab.decwin[var16 + -15] * var7[var11 + 14];
         var44 -= this.tab.decwin[var16 + 0] * var7[var11 + 15];
         var8 = this.writeSampleClipped(var44, var8, var5, var6.pb);
         var28--;
         var11 -= 16;
         var16 -= 32;
      }

      if (var4 == 1) {
         var6.pb--;
      }

      return var8;
   }

   void synth_1to1_unclipped(MPGLib.mpstr_tag var1, float[] var2, int var3, int var4, float[] var5, MPGLib.ProcessedBytes var6) {
      if (0 == var4) {
         var1.synth_bo--;
         var1.synth_bo &= 15;
      } else {
         var6.pb++;
      }

      float[] var7;
      int var8;
      if ((var1.synth_bo & 1) != 0) {
         var7 = var1.synth_buffs[var4][0];
         var8 = var1.synth_bo;
         float[] var9 = new float[64];
         this.dct64.dct64_1(var1.synth_buffs[var4][1], var1.synth_bo + 1 & 15, var1.synth_buffs[var4][0], var1.synth_bo, var9, 32, var2, var3, this.tab.pnts);
      } else {
         var7 = var1.synth_buffs[var4][1];
         var8 = var1.synth_bo + 1;
         float[] var13 = new float[64];
         this.dct64.dct64_1(var1.synth_buffs[var4][0], var1.synth_bo, var1.synth_buffs[var4][1], var1.synth_bo + 1, var13, 32, var2, var3, this.tab.pnts);
      }

      int var14 = 16 - var8;
      int var10 = 0;

      for (int var11 = 16; var11 != 0; var6.pb += 2) {
         float var12 = this.tab.decwin[var14 + 0] * var7[var10 + 0];
         var12 -= this.tab.decwin[var14 + 1] * var7[var10 + 1];
         var12 += this.tab.decwin[var14 + 2] * var7[var10 + 2];
         var12 -= this.tab.decwin[var14 + 3] * var7[var10 + 3];
         var12 += this.tab.decwin[var14 + 4] * var7[var10 + 4];
         var12 -= this.tab.decwin[var14 + 5] * var7[var10 + 5];
         var12 += this.tab.decwin[var14 + 6] * var7[var10 + 6];
         var12 -= this.tab.decwin[var14 + 7] * var7[var10 + 7];
         var12 += this.tab.decwin[var14 + 8] * var7[var10 + 8];
         var12 -= this.tab.decwin[var14 + 9] * var7[var10 + 9];
         var12 += this.tab.decwin[var14 + 10] * var7[var10 + 10];
         var12 -= this.tab.decwin[var14 + 11] * var7[var10 + 11];
         var12 += this.tab.decwin[var14 + 12] * var7[var10 + 12];
         var12 -= this.tab.decwin[var14 + 13] * var7[var10 + 13];
         var12 += this.tab.decwin[var14 + 14] * var7[var10 + 14];
         var12 -= this.tab.decwin[var14 + 15] * var7[var10 + 15];
         this.writeSampleUnclipped(var12, var5, var6.pb);
         var11--;
         var10 += 16;
         var14 += 32;
      }

      float var18 = this.tab.decwin[var14 + 0] * var7[var10 + 0];
      var18 += this.tab.decwin[var14 + 2] * var7[var10 + 2];
      var18 += this.tab.decwin[var14 + 4] * var7[var10 + 4];
      var18 += this.tab.decwin[var14 + 6] * var7[var10 + 6];
      var18 += this.tab.decwin[var14 + 8] * var7[var10 + 8];
      var18 += this.tab.decwin[var14 + 10] * var7[var10 + 10];
      var18 += this.tab.decwin[var14 + 12] * var7[var10 + 12];
      var18 += this.tab.decwin[var14 + 14] * var7[var10 + 14];
      this.writeSampleUnclipped(var18, var5, var6.pb);
      var10 -= 16;
      var14 -= 32;
      var6.pb += 2;
      var14 += var8 << 1;

      for (int var26 = 15; var26 != 0; var6.pb += 2) {
         float var42 = -this.tab.decwin[var14 + -1] * var7[var10 + 0];
         var42 -= this.tab.decwin[var14 + -2] * var7[var10 + 1];
         var42 -= this.tab.decwin[var14 + -3] * var7[var10 + 2];
         var42 -= this.tab.decwin[var14 + -4] * var7[var10 + 3];
         var42 -= this.tab.decwin[var14 + -5] * var7[var10 + 4];
         var42 -= this.tab.decwin[var14 + -6] * var7[var10 + 5];
         var42 -= this.tab.decwin[var14 + -7] * var7[var10 + 6];
         var42 -= this.tab.decwin[var14 + -8] * var7[var10 + 7];
         var42 -= this.tab.decwin[var14 + -9] * var7[var10 + 8];
         var42 -= this.tab.decwin[var14 + -10] * var7[var10 + 9];
         var42 -= this.tab.decwin[var14 + -11] * var7[var10 + 10];
         var42 -= this.tab.decwin[var14 + -12] * var7[var10 + 11];
         var42 -= this.tab.decwin[var14 + -13] * var7[var10 + 12];
         var42 -= this.tab.decwin[var14 + -14] * var7[var10 + 13];
         var42 -= this.tab.decwin[var14 + -15] * var7[var10 + 14];
         var42 -= this.tab.decwin[var14 + 0] * var7[var10 + 15];
         this.writeSampleUnclipped(var42, var5, var6.pb);
         var26--;
         var10 -= 16;
         var14 -= 32;
      }

      if (var4 == 1) {
         var6.pb--;
      }
   }
}
