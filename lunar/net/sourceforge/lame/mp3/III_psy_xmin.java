package net.sourceforge.lame.mp3;

public final class III_psy_xmin {
   float[] l = new float[22];
   float[][] s = new float[13][3];

   public void assign(III_psy_xmin var1) {
      System.arraycopy(var1.l, 0, this.l, 0, 22);

      for (int var2 = 0; var2 < 13; var2++) {
         for (int var3 = 0; var3 < 3; var3++) {
            this.s[var2][var3] = var1.s[var2][var3];
         }
      }
   }
}
