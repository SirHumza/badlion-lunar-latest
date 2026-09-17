package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(long var1) {
      super(var1);
   }

   @Override
   protected float OCORHOIOHRHRIIRROCHRRROIOIOCRI() {
      float var1 = super.OCORHOIOHRHRIIRROCHRRROIOIOCRI();
      return var1 < 0.5 ? 2.0F * var1 * var1 : -1.0F + (4.0F - 2.0F * var1) * var1;
   }

   @Override
   protected long CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(float var1) {
      return (long)((float)this.durationMs * var1);
   }
}
