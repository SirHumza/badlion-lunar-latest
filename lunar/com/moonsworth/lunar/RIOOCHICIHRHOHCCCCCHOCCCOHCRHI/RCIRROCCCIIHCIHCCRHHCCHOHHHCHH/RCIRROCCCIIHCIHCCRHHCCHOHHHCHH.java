package com.moonsworth.lunar.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final float[] HIOIIRIHIICCRHCORCRORIOCIOHCII = new float[4];
   private static final float[] HRICCCRRROIIRRIHRCCCHRRCIHIIOR = new float[4];

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FloatBuffer var0, float[] var1, float[] var2) {
      for (int var3 = 0; var3 < 4; var3++) {
         var2[var3] = var1[0] * var0.get(var0.position() + 0 + var3)
            + var1[1] * var0.get(var0.position() + 4 + var3)
            + var1[2] * var0.get(var0.position() + 8 + var3)
            + var1[3] * var0.get(var0.position() + 12 + var3);
      }
   }

   public static boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      float var0, float var1, float var2, FloatBuffer var3, FloatBuffer var4, IntBuffer var5, FloatBuffer var6
   ) {
      float[] var7 = HIOIIRIHIICCRHCORCRORIOCIOHCII;
      float[] var8 = HRICCCRRROIIRRIHRCCCHRRCIHIIOR;
      var7[0] = var0;
      var7[1] = var1;
      var7[2] = var2;
      var7[3] = 1.0F;
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var7, var8);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var8, var7);
      if (var7[3] == 0.0) {
         return false;
      }

      var7[3] = 1.0F / var7[3] * 0.5F;
      var7[0] = var7[0] * var7[3] + 0.5F;
      var7[1] = var7[1] * var7[3] + 0.5F;
      var7[2] = var7[2] * var7[3] + 0.5F;
      var6.put(0, var7[0] * var5.get(var5.position() + 2) + var5.get(var5.position() + 0));
      var6.put(1, var7[1] * var5.get(var5.position() + 3) + var5.get(var5.position() + 1));
      var6.put(2, var7[2]);
      return true;
   }
}
