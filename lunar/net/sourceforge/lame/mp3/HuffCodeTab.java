package net.sourceforge.lame.mp3;

public class HuffCodeTab {
   final int xlen;
   final int linmax;
   final int[] table;
   final int[] hlen;

   public HuffCodeTab(int var1, int var2, int[] var3, int[] var4) {
      this.xlen = var1;
      this.linmax = var2;
      this.table = var3;
      this.hlen = var4;
   }
}
