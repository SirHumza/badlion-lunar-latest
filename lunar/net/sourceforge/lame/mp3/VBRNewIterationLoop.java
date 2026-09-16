package net.sourceforge.lame.mp3;

public final class VBRNewIterationLoop implements IIterationLoop {
   private final Quantize quantize;

   VBRNewIterationLoop(Quantize var1) {
      this.quantize = var1;
   }

   @Override
   public final void iteration_loop(LameGlobalFlags var1, float[][] var2, float[] var3, III_psy_ratio[][] var4) {
      LameInternalFlags var5 = var1.internal_flags;
      float[][][] var6 = new float[2][2][39];
      float[][][] var7 = new float[2][2][576];
      int[] var8 = new int[15];
      int[][] var9 = new int[2][2];
      IIISideInfo var10 = var5.l3_side;
      int var11 = this.quantize.VBR_new_prepare(var1, var2, var4, var6, var8, var9);

      for (int var12 = 0; var12 < var5.mode_gr; var12++) {
         for (int var13 = 0; var13 < var5.channels_out; var13++) {
            GrInfo var14 = var10.tt[var12][var13];
            if (!this.quantize.init_xrpow(var5, var14, var7[var12][var13])) {
               var9[var12][var13] = 0;
            }
         }
      }

      int var19 = this.quantize.vbr.VBR_encode_frame(var5, var7, var6, var9);
      if (!var1.free_format) {
         if (var11 != 0 && 0 == var1.VBR_hard_min) {
            var5.bitrate_index = 1;
         } else {
            var5.bitrate_index = var5.VBR_min_bitrate;
         }

         while (var5.bitrate_index < var5.VBR_max_bitrate && var19 > var8[var5.bitrate_index]) {
            var5.bitrate_index++;
         }

         if (var5.bitrate_index > var5.VBR_max_bitrate) {
            var5.bitrate_index = var5.VBR_max_bitrate;
         }
      } else {
         var5.bitrate_index = 0;
      }

      if (var19 > var8[var5.bitrate_index]) {
         throw new RuntimeException("INTERNAL ERROR IN VBR NEW CODE, please send bug report");
      }

      int var20 = 0;
      MeanBits var15 = new MeanBits(var20);
      int var22 = this.quantize.rv.ResvFrameBegin(var1, var15);
      var20 = var15.bits;
      assert var19 <= var22;

      for (int var16 = 0; var16 < var5.mode_gr; var16++) {
         for (int var17 = 0; var17 < var5.channels_out; var17++) {
            GrInfo var18 = var10.tt[var16][var17];
            this.quantize.rv.ResvAdjust(var5, var18);
         }
      }

      this.quantize.rv.ResvFrameEnd(var5, var20);
   }
}
