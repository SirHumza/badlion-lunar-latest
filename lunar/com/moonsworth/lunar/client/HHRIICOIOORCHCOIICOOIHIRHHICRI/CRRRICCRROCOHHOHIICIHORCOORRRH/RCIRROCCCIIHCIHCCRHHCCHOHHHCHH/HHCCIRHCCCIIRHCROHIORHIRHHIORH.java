package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Double> {
   private final double HCOIRIOHHCCRROHCRHRHRICOIRHRRC;
   private final double CIOOIOOICIORIOOOHICCRCCCRHIHOH;
   private final int HOCOHRIIHRCHIOOCIRHCOOIICROIHC;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(double var1, double var3, boolean var5, boolean var6, int var7) {
      super(var5, var6);
      this.HCOIRIOHHCCRROHCRHRHRICOIRHRRC = var1;
      this.CIOOIOOICIORIOOOHICCRCCCRHIHOH = var3;
      this.HOCOHRIIHRCHIOOCIRHCOOIICROIHC = var7;
   }

   public Double ROOIOORHCOCHRHIIICHROICCIHIOOO() {
      return this.HCOIRIOHHCCRROHCRHRHRICOIRHRRC;
   }

   public Double ICROOOHRHIOICCCIIOCHRHIHHHOIRI() {
      return this.CIOOIOOICIORIOOOHICCRCCCRHIHOH;
   }

   @Override
   public boolean IRHOOHROCICOCIICROOROIICCCHIRC() {
      return this.HOCOHRIIHRCHIOOCIRHCOOIICROIHC == 1;
   }

   @Override
   public String OCOCHIOCCCHOHOORHCCOIHICHRCRHO() {
      return "Double";
   }

   public Double OOCHRIIIRIHRRCRIORHCROIIHCRRIC(double var1) {
      return var1;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, double var2, boolean var4, boolean var5, int var6) {
      int var7 = 5;
      var7 = 31 * var7 + Double.hashCode(var0);
      var7 = 31 * var7 + Double.hashCode(var2);
      var7 = 31 * var7 + Boolean.hashCode(var4);
      var7 = 31 * var7 + Boolean.hashCode(var5);
      var7 = 31 * var7 + Integer.hashCode(var6);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var7x -> new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var2, var4, var5, var6));
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         Double var3 = this.ROOIOORHCOCHRHIIICHROICCIHIOOO();
         Double var4 = var2.ROOIOORHCOCHRHIIICHROICCIHIOOO();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Double var5 = this.ICROOOHRHIOICCCIIOCHRHIHHHOIRI();
            Double var6 = var2.ICROOOHRHIOICCCIIOCHRHIHHHOIRI();
            return (var5 == null ? var6 == null : var5.equals(var6)) ? this.RHCHHHCCIHOHOCHOIRORRHRCCRIRIR() == var2.RHCHHHCCIHOHOCHOIRORRHRCCRIRIR() : false;
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      Double var3 = this.ROOIOORHCOCHRHIIICHROICCIHIOOO();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Double var4 = this.ICROOOHRHIOICCCIIOCHRHIHHHOIRI();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      return var2 * 59 + this.RHCHHHCCIHOHOCHOIRORRHRCCRIRIR();
   }

   @Generated
   @Override
   public int RHCHHHCCIHOHOCHOIRORRHRCCRIRIR() {
      return this.HOCOHRIIHRCHIOOCIRHCOOIICROIHC;
   }
}
