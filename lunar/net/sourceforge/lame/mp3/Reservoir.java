package net.sourceforge.lame.mp3;

public class Reservoir {
   BitStream bs;

   public final void setModules(BitStream var1) {
      this.bs = var1;
   }

   public final int ResvFrameBegin(LameGlobalFlags var1, MeanBits var2) {
      LameInternalFlags var3 = var1.internal_flags;
      IIISideInfo var5 = var3.l3_side;
      int var6 = this.bs.getframebits(var1);
      var2.bits = (var6 - var3.sideinfo_len * 8) / var3.mode_gr;
      int var7 = 2048 * var3.mode_gr - 8;
      int var4;
      if (var1.getBitRate() > 320) {
         var4 = 8 * (int)(var1.getBitRate() * 1000 / (var1.getOutSampleRate() / 1152.0F) / 8.0F + 0.5);
      } else {
         var4 = 11520;
         if (var1.strict_ISO) {
            var4 = 8 * (int)(320000.0F / (var1.getOutSampleRate() / 1152.0F) / 8.0F + 0.5);
         }
      }

      var3.ResvMax = var4 - var6;
      if (var3.ResvMax > var7) {
         var3.ResvMax = var7;
      }

      if (var3.ResvMax < 0 || var1.disable_reservoir) {
         var3.ResvMax = 0;
      }

      int var8 = var2.bits * var3.mode_gr + Math.min(var3.ResvSize, var3.ResvMax);
      if (var8 > var4) {
         var8 = var4;
      }

      assert 0 == var3.ResvMax % 8;
      assert var3.ResvMax >= 0;
      var5.resvDrain_pre = 0;
      if (var3.pinfo != null) {
         var3.pinfo.mean_bits = var2.bits / 2;
         var3.pinfo.resvsize = var3.ResvSize;
      }

      return var8;
   }

   public final int ResvMaxBits(LameGlobalFlags var1, int var2, MeanBits var3, int var4) {
      LameInternalFlags var5 = var1.internal_flags;
      int var7 = var5.ResvSize;
      int var8 = var5.ResvMax;
      if (var4 != 0) {
         var7 += var2;
      }

      if ((var5.substep_shaping & 1) != 0) {
         var8 = (int)(var8 * 0.9);
      }

      var3.bits = var2;
      int var6;
      if (var7 * 10 > var8 * 9) {
         var6 = var7 - var8 * 9 / 10;
         var3.bits += var6;
         var5.substep_shaping |= 128;
      } else {
         var6 = 0;
         var5.substep_shaping &= 127;
         if (!var1.disable_reservoir && 0 == (var5.substep_shaping & 1)) {
            var3.bits = (int)(var3.bits - 0.1 * var2);
         }
      }

      int var9 = var7 < var5.ResvMax * 6 / 10 ? var7 : var5.ResvMax * 6 / 10;
      var9 -= var6;
      if (var9 < 0) {
         var9 = 0;
      }

      return var9;
   }

   public final void ResvAdjust(LameInternalFlags var1, GrInfo var2) {
      var1.ResvSize = var1.ResvSize - (var2.part2_3_length + var2.part2_length);
   }

   public final void ResvFrameEnd(LameInternalFlags var1, int var2) {
      IIISideInfo var4 = var1.l3_side;
      var1.ResvSize = var1.ResvSize + var2 * var1.mode_gr;
      int var5 = 0;
      var4.resvDrain_post = 0;
      var4.resvDrain_pre = 0;
      int var3;
      if ((var3 = var1.ResvSize % 8) != 0) {
         var5 += var3;
      }

      var3 = var1.ResvSize - var5 - var1.ResvMax;
      if (var3 > 0) {
         assert 0 == var3 % 8;
         assert var3 >= 0;
         var5 += var3;
      }

      int var6 = Math.min(var4.main_data_begin * 8, var5) / 8;
      var4.resvDrain_pre += 8 * var6;
      var5 -= 8 * var6;
      var1.ResvSize -= 8 * var6;
      var4.main_data_begin -= var6;
      var4.resvDrain_post += var5;
      var1.ResvSize -= var5;
   }
}
