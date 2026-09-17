package com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCHHROCIRRRICRHROHROHOCCCHOIOH = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   public float[] RCRRCIIOOORIOCHOIORHHORHRHRIOC = new float[16];
   public int size = 0;

   public void OOCHRIIIRIHRRCRIORHCROIIHCRRIC(int var1) {
      int var2 = this.RCRRCIIOOORIOCHOIORHHORHRHRIOC.length - this.size;
      if (var2 < var1) {
         float[] var3 = new float[Math.max(this.RCRRCIIOOORIOCHOIORHHORHRHRIOC.length * 2, this.size + var1)];
         System.arraycopy(this.RCRRCIIOOORIOCHOIORHHORHRHRIOC, 0, var3, 0, this.RCRRCIIOOORIOCHOIORHHORHRHRIOC.length);
         this.RCRRCIIOOORIOCHOIORHHORHRHRIOC = var3;
      }
   }
}
