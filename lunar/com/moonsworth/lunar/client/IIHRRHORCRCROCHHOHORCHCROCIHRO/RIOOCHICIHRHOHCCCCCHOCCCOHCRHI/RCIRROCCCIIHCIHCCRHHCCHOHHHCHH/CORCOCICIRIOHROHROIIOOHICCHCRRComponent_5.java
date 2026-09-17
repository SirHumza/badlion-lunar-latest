package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.ICICIOCHHHIHOCHCOHORIHRCOHHOCR;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   public CRRRICCRROCOHHOHIICIHORCOORRRH(long var1) {
      super(var1, 0.0F);
   }

   @Override
   protected float OCORHOIOHRHRIIRROCHRRROIOIOCRI() {
      float var1 = super.OCORHOIOHRHRIIRROCHRRROIOIOCRI();
      float var2 = var1 * 2.0F - 1.0F;
      return (float)(ICICIOCHHHIHOCHCOHORIHRCOHHOCR.HRHRORCIRICHCCCCCHICOOICIRHRIO(var2 * Math.PI) + 1.0) / 2.0F;
   }

   @Override
   protected long CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(float var1) {
      return (long)((float)this.durationMs * var1);
   }
}
