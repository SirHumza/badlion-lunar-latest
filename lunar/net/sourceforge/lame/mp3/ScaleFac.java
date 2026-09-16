package net.sourceforge.lame.mp3;

public final class ScaleFac {
   int[] l = new int[23];
   int[] s = new int[14];
   int[] psfb21 = new int[7];
   int[] psfb12 = new int[7];

   public ScaleFac() {
   }

   public ScaleFac(int[] var1, int[] var2, int[] var3, int[] var4) {
      System.arraycopy(var1, 0, this.l, 0, Math.min(var1.length, this.l.length));
      System.arraycopy(var2, 0, this.s, 0, Math.min(var2.length, this.s.length));
      System.arraycopy(var3, 0, this.psfb21, 0, Math.min(var3.length, this.psfb21.length));
      System.arraycopy(var4, 0, this.psfb12, 0, Math.min(var4.length, this.psfb12.length));
   }
}
