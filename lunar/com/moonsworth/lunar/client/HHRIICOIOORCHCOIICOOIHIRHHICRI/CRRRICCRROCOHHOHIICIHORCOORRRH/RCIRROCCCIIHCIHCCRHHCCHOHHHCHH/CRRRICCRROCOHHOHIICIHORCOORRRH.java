package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Float> {
   private final float OICIIHCIOOHRHOIRROOIORRRRCOCCH;
   private final float OHRCIOICHCCIRHROOCCHIOCIRRRHHC;
   private final int OOCROCROCHORRRIRIHCHROIHHIHOCI;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(float var1, float var2, boolean var3, boolean var4, int var5) {
      super(var3, var4);
      this.OICIIHCIOOHRHOIRROOIORRRRCOCCH = var1;
      this.OHRCIOICHCCIRHROOCCHIOCIRRRHHC = var2;
      this.OOCROCROCHORRRIRIHCHROIHHIHOCI = var5;
   }

   public Float RCOCCHORROORIOOCCOOCRICOHCROIC() {
      return this.OICIIHCIOOHRHOIRROOIORRRRCOCCH;
   }

   public Float HHORIIRCCHCICCHOHIOHRCORICIIOH() {
      return this.OHRCIOICHCCIRHROOCCHIOCIRRRHHC;
   }

   @Override
   public boolean IRHOOHROCICOCIICROOROIICCCHIRC() {
      return this.OOCROCROCHORRRIRIHCHROIHHIHOCI == 1;
   }

   @Override
   public String OCOCHIOCCCHOHOORHCCOIHICHRCRHO() {
      return "Float";
   }

   public Float OCIROOIHIHRHOCCHIIIROOCRIIOCRR(double var1) {
      return (float)var1;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var0, float var1, boolean var2, boolean var3, int var4) {
      int var5 = 4;
      var5 = 31 * var5 + Float.hashCode(var0);
      var5 = 31 * var5 + Float.hashCode(var1);
      var5 = 31 * var5 + Boolean.hashCode(var2);
      var5 = 31 * var5 + Boolean.hashCode(var3);
      var5 = 31 * var5 + Integer.hashCode(var4);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var5x -> new CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1, var2, var3, var4));
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         Float var3 = this.RCOCCHORROORIOOCCOOCRICOHCROIC();
         Float var4 = var2.RCOCCHORROORIOOCCOOCRICOHCROIC();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Float var5 = this.HHORIIRCCHCICCHOHIOHRCORICIIOH();
            Float var6 = var2.HHORIIRCCHCICCHOHIOHRCORICIIOH();
            return (var5 == null ? var6 == null : var5.equals(var6)) ? this.RHCHHHCCIHOHOCHOIRORRHRCCRIRIR() == var2.RHCHHHCCIHOHOCHOIRORRHRCCRIRIR() : false;
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      Float var3 = this.RCOCCHORROORIOOCCOOCRICOHCROIC();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Float var4 = this.HHORIIRCCHCICCHOHIOHRCORICIIOH();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      return var2 * 59 + this.RHCHHHCCIHOHOCHOIRORRHRCCRIRIR();
   }

   @Generated
   @Override
   public int RHCHHHCCIHOHOCHOIRORRHRCCRIRIR() {
      return this.OOCROCROCHORRRIRIHCHROIHHIHOCI;
   }
}
