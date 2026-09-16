package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   private boolean ORCCOOICCCIOORRCHCCHIHCRCCOHRH;

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO(long var1) {
      super(var1, 1.0F);
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO(long var1, float var3) {
      super(var1, var3);
   }

   public float ORRICCOCRHRHRHOOIROHRHIHROOROH(boolean var1) {
      this.COCCHRIOCIHRCRRHICICHIIRCCHIHO(var1);
      if (this.HROOIHCCIIORCIHIORHCOROHIROICH()) {
         return super.OICICHCIIHCIHHRRROIIIIHIIICCRI();
      } else {
         return var1 ? 1.0F : 0.0F;
      }
   }

   private void COCCHRIOCIHRCRRHICICHIIRCCHIHO(boolean var1) {
      if (var1 && !this.ORCCOOICCCIOORRCHCCHIHCRCCOHRH) {
         this.ORCCOOICCCIOORRCHCCHIHCRCCOHRH = true;
         this.start();
      } else if (this.ORCCOOICCCIOORRCHCCHIHCRCCOHRH && !var1) {
         this.ORCCOOICCCIOORRCHCCHIHCRCCOHRH = false;
         this.start();
      }
   }
}
