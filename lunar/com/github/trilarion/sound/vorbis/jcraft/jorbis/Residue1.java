package com.github.trilarion.sound.vorbis.jcraft.jorbis;

import java.util.logging.Logger;

class Residue1 extends Residue0 {
   private static final Logger LOG = Logger.getLogger(Residue1.class.getName());

   @Override
   int inverse(Block var1, Object var2, float[][] var3, int[] var4, int var5) {
      int var6 = 0;

      for (int var7 = 0; var7 < var5; var7++) {
         if (var4[var7] != 0) {
            var3[var6++] = var3[var7];
         }
      }

      return var6 != 0 ? _01inverse(var1, var2, var3, var6, 1) : 0;
   }
}
