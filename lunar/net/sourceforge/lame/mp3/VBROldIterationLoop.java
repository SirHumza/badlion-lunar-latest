package net.sourceforge.lame.mp3;

public final class VBROldIterationLoop implements IIterationLoop {
   private final Quantize quantize;

   VBROldIterationLoop(Quantize var1) {
      this.quantize = var1;
   }

   @Override
   public void iteration_loop(LameGlobalFlags var1, float[][] var2, float[] var3, III_psy_ratio[][] var4) {
      LameInternalFlags var5 = var1.internal_flags;
      float[][][] var6 = new float[2][2][39];
      float[] var7 = new float[576];
      int[][] var8 = new int[2][2];
      int[] var9 = new int[15];
      int[][] var10 = new int[2][2];
      int[][] var11 = new int[2][2];
      int var12 = 0;
      IIISideInfo var13 = var5.l3_side;
      int var14 = this.quantize.VBR_old_prepare(var1, var2, var3, var4, var6, var9, var10, var11, var8);

      while (true) {
         int var15 = 0;

         for (int var16 = 0; var16 < var5.mode_gr; var16++) {
            for (int var17 = 0; var17 < var5.channels_out; var17++) {
               GrInfo var18 = var13.tt[var16][var17];
               boolean var19 = this.quantize.init_xrpow(var5, var18, var7);
               if (var19 && var11[var16][var17] != 0) {
                  this.quantize.VBR_encode_granule(var1, var18, var6[var16][var17], var7, var17, var10[var16][var17], var11[var16][var17]);
                  if ((var5.substep_shaping & 1) != 0) {
                     this.quantize.trancate_smallspectrums(var5, var13.tt[var16][var17], var6[var16][var17], var7);
                  }

                  int var20 = var18.part2_3_length + var18.part2_length;
                  var15 += var20;
               }
            }
         }

         if (var14 != 0 && 0 == var1.VBR_hard_min) {
            var5.bitrate_index = 1;
         } else {
            var5.bitrate_index = var5.VBR_min_bitrate;
         }

         while (var5.bitrate_index < var5.VBR_max_bitrate && var15 > var9[var5.bitrate_index]) {
            var5.bitrate_index++;
         }

         MeanBits var22 = new MeanBits(var12);
         int var24 = this.quantize.rv.ResvFrameBegin(var1, var22);
         var12 = var22.bits;
         if (var15 <= var24) {
            for (int var21 = 0; var21 < var5.mode_gr; var21++) {
               for (int var23 = 0; var23 < var5.channels_out; var23++) {
                  this.quantize.iteration_finish_one(var5, var21, var23);
               }
            }

            this.quantize.rv.ResvFrameEnd(var5, var12);
            return;
         }

         this.quantize.bitpressure_strategy(var5, var6, var10, var11);
      }
   }
}
