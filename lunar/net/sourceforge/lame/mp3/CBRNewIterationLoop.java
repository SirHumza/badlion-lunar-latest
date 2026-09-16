package net.sourceforge.lame.mp3;

public final class CBRNewIterationLoop implements IIterationLoop {
   private final Quantize quantize;

   CBRNewIterationLoop(Quantize var1) {
      this.quantize = var1;
   }

   @Override
   public void iteration_loop(LameGlobalFlags var1, float[][] var2, float[] var3, III_psy_ratio[][] var4) {
      LameInternalFlags var5 = var1.internal_flags;
      float[] var6 = new float[39];
      float[] var7 = new float[576];
      int[] var8 = new int[2];
      int var9 = 0;
      IIISideInfo var11 = var5.l3_side;
      MeanBits var12 = new MeanBits(var9);
      this.quantize.rv.ResvFrameBegin(var1, var12);
      var9 = var12.bits;

      for (int var13 = 0; var13 < var5.mode_gr; var13++) {
         int var10 = this.quantize.qupvt.on_pe(var1, var2, var8, var9, var13, var13);
         if (var5.mode_ext == 2) {
            this.quantize.ms_convert(var5.l3_side, var13);
            this.quantize.qupvt.reduce_side(var8, var3[var13], var9, var10);
         }

         for (int var14 = 0; var14 < var5.channels_out; var14++) {
            GrInfo var17 = var11.tt[var13][var14];
            float var16;
            if (var17.block_type != 2) {
               float var15 = 0.0F;
               var16 = var5.PSY.mask_adjust - var15;
            } else {
               float var19 = 0.0F;
               var16 = var5.PSY.mask_adjust_short - var19;
            }

            var5.masking_lower = (float)Math.pow(10.0, var16 * 0.1);
            this.quantize.init_outer_loop(var5, var17);
            if (this.quantize.init_xrpow(var5, var17, var7)) {
               this.quantize.qupvt.calc_xmin(var1, var4[var13][var14], var17, var6);
               this.quantize.outer_loop(var1, var17, var6, var7, var14, var8[var14]);
            }

            this.quantize.iteration_finish_one(var5, var13, var14);
            assert var17.part2_3_length <= 4095;
            assert var17.part2_3_length <= var8[var14];
         }
      }

      this.quantize.rv.ResvFrameEnd(var5, var9);
   }
}
