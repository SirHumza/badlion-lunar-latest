package net.sourceforge.lame.mp3;

public final class ABRIterationLoop implements IIterationLoop {
   private final Quantize quantize;

   ABRIterationLoop(Quantize var1) {
      this.quantize = var1;
   }

   @Override
   public final void iteration_loop(LameGlobalFlags var1, float[][] var2, float[] var3, III_psy_ratio[][] var4) {
      LameInternalFlags var5 = var1.internal_flags;
      float[] var6 = new float[39];
      float[] var7 = new float[576];
      int[][] var8 = new int[2][2];
      int[] var9 = new int[1];
      int[] var10 = new int[1];
      IIISideInfo var11 = var5.l3_side;
      int var12 = 0;
      this.quantize.calc_target_bits(var1, var2, var3, var8, var10, var9);

      for (int var13 = 0; var13 < var5.mode_gr; var13++) {
         if (var5.mode_ext == 2) {
            this.quantize.ms_convert(var5.l3_side, var13);
         }

         for (int var14 = 0; var14 < var5.channels_out; var14++) {
            GrInfo var17 = var11.tt[var13][var14];
            float var16;
            if (var17.block_type != 2) {
               float var15 = 0.0F;
               var16 = var5.PSY.mask_adjust - var15;
            } else {
               float var21 = 0.0F;
               var16 = var5.PSY.mask_adjust_short - var21;
            }

            var5.masking_lower = (float)Math.pow(10.0, var16 * 0.1);
            this.quantize.init_outer_loop(var5, var17);
            if (this.quantize.init_xrpow(var5, var17, var7)) {
               int var18 = this.quantize.qupvt.calc_xmin(var1, var4[var13][var14], var17, var6);
               if (0 == var18) {
                  var8[var13][var14] = var10[0];
               }

               this.quantize.outer_loop(var1, var17, var6, var7, var14, var8[var13][var14]);
            }

            this.quantize.iteration_finish_one(var5, var13, var14);
         }
      }

      for (var5.bitrate_index = var5.VBR_min_bitrate; var5.bitrate_index <= var5.VBR_max_bitrate; var5.bitrate_index++) {
         MeanBits var19 = new MeanBits(var12);
         int var20 = this.quantize.rv.ResvFrameBegin(var1, var19);
         var12 = var19.bits;
         if (var20 >= 0) {
            break;
         }
      }

      assert var5.bitrate_index <= var5.VBR_max_bitrate;
      this.quantize.rv.ResvFrameEnd(var5, var12);
   }
}
