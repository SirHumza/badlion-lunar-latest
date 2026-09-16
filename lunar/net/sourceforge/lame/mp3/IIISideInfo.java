package net.sourceforge.lame.mp3;

public class IIISideInfo {
   GrInfo[][] tt = new GrInfo[2][2];
   int main_data_begin;
   int private_bits;
   int resvDrain_pre;
   int resvDrain_post;
   int[][] scfsi = new int[2][4];

   public IIISideInfo() {
      for (int var1 = 0; var1 < 2; var1++) {
         for (int var2 = 0; var2 < 2; var2++) {
            this.tt[var1][var2] = new GrInfo();
         }
      }
   }
}
