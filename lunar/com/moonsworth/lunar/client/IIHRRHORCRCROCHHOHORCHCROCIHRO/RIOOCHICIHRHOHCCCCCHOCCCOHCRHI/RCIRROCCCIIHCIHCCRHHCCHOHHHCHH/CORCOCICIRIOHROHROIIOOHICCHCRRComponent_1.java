package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   private final float exponent;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(long var1) {
      this(var1, 2.0F);
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(long var1, float var3) {
      super(var1);
      this.exponent = var3;
   }

   @Override
   public float OCORHOIOHRHRIIRROCHRRROIOIOCRI() {
      float var1 = super.OCORHOIOHRHRIIRROCHRRROIOIOCRI();
      return (float)Math.pow(var1, this.exponent);
   }
}
