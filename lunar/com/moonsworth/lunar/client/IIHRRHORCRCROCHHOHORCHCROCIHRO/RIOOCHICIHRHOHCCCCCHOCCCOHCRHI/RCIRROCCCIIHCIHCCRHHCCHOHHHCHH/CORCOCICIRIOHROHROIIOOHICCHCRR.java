package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public class CORCOCICIRIOHROHROIIOOHICCHCRR extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public CORCOCICIRIOHROHROIIOOHICCHCRR(long var1) {
      super(var1, 1.0F);
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR(long var1, float var3) {
      super(var1, var3);
   }

   @Override
   protected float OCORHOIOHRHRIIRROCHRRROIOIOCRI() {
      float var1 = (float)(this.durationMs - this.COIHHHIRRCOHCCCCCHCRRIORRCIOIR()) / (float)this.durationMs;
      return this.RIIRIHIHRIICCICOOCRCRRCROHIIIO() ? 1.0F - var1 : var1;
   }

   @Override
   protected long CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(float var1) {
      return (long)((float)this.durationMs * var1);
   }
}
