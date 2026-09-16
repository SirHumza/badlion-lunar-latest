package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.List;
import lombok.Generated;

public class RIROICHCRROROHCCROOCCCCOCHCCRI implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final int RIRIROOOOHCICHIHIIIHRRIRHHCCOH;
   private final List<com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO> RCRRIHOIHHCCHORRRIRORRHCHOCIRH;
   private com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.CORCOCICIRIOHROHROIIOOHICCHCRR HORRCHIHHOHHCCHCICRCRCIIHIOROC;

   public RIROICHCRROROHCCROOCCCCOCHCCRI(
      int var1,
      List<com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO> var2,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.CORCOCICIRIOHROHROIIOOHICCHCRR var3
   ) {
      this.RIRIROOOOHCICHIHIIIHRRIRHHCCOH = var1;
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH = var2;
      this.HORRCHIHHOHHCCHCICRCRCIIHIOROC = var3;
   }

   @Override
   public boolean ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(int var1) {
      return var1 == this.RIRIROOOOHCICHIHIIIHRRIRHHCCOH;
   }

   @Override
   public boolean IIRIIICCOORHIRHCIIROIHOROCICCC(int var1) {
      return this.RIRIROOOOHCICHIHIIIHRRIRHHCCOH <= 4;
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public double call() {
      return this.HORRCHIHHOHHCCHCICRCRCIIHIOROC.run();
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public double call(double var1) {
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(0).value = var1;
      return this.HORRCHIHHOHHCCHCICRCRCIIHIOROC.run();
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public double call(double var1, double var3) {
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(0).value = var1;
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(1).value = var3;
      return this.HORRCHIHHOHHCCHCICRCRCIIHIOROC.run();
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public double call(double var1, double var3, double var5) {
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(0).value = var1;
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(1).value = var3;
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(2).value = var5;
      return this.HORRCHIHHOHHCCHCICRCRCIIHIOROC.run();
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public double call(double var1, double var3, double var5, double var7) {
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(0).value = var1;
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(1).value = var3;
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(2).value = var5;
      this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(3).value = var7;
      return this.HORRCHIHHOHHCCHCICRCRCIIHIOROC.run();
   }

   @Override
   public double call(double... var1) {
      for (int var2 = 0; var2 < this.RIRIROOOOHCICHIHIIIHRRIRHHCCOH; var2++) {
         this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH.get(var2).value = var1[var2];
      }

      return this.HORRCHIHHOHHCCHCICRCRCIIHIOROC.run();
   }

   @Generated
   public List<com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO> CHIIRRHOCIOOHIIOIRCIIOICCIOOHI() {
      return this.RCRRIHOIHHCCHORRRIRORRHCHOCIRH;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      this.HORRCHIHHOHHCCHCICRCRCIIHIOROC = var1;
   }

   @Generated
   public com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.CORCOCICIRIOHROHROIIOOHICCHCRR HOHCOHOHOORCOIICHOHCRCRIHCROHC() {
      return this.HORRCHIHHOHHCCHCICRCRCIIHIOROC;
   }
}
