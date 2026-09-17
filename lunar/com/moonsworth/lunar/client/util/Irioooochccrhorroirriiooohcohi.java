package com.moonsworth.lunar.client.util;

import lombok.Generated;

public class IOIOHIORIROHRRCOOOHCROHORCOIIH {
   private String CORRIIICHHRRCCOOROHRORCHCROIRI;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOIICRCHCHRRIHCHOOICHRCRRRRHOI;
   private int IOHCRIOHOHOOHCHHCICOOROOCHIIOI;

   @Generated
   public IOIOHIORIROHRRCOOOHCROHORCOIIH(
      String var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, int var3
   ) {
      this.CORRIIICHHRRCCOOROHRORCHCROIRI = var1;
      this.HOIICRCHCHRRIHCHOOICHRCRRRRHOI = var2;
      this.IOHCRIOHOHOOHCHHCICOOROOCHIIOI = var3;
   }

   @Generated
   public String IRIOOOOCHCCRHORROIRRIIOOOHCOHI() {
      return this.CORRIIICHHRRCCOOROHRORCHCROIRI;
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCICCIOCIHOOIHCIRCHHHRROHIHHIH() {
      return this.HOIICRCHCHRRIHCHOOICHRCRRRRHOI;
   }

   @Generated
   public int CROOIRROCHHIIHROIORHRIOHOROOIC() {
      return this.IOHCRIOHOHOOHCHHCICOOROOCHIIOI;
   }

   @Generated
   public void OCHCHCCROOCOHHOIOHRRHCROICOOHI(String var1) {
      this.CORRIIICHHRRCCOOROHRORCHCROIRI = var1;
   }

   @Generated
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.HOIICRCHCHRRIHCHOOICHRCRRRRHOI = var1;
   }

   @Generated
   public void IOOHCHIHOOIROCCIRCCORRRHCCHHRO(int var1) {
      this.IOHCRIOHOHOOHCHHCICOOROOCHIIOI = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IOIOHIORIROHRRCOOOHCROHORCOIIH var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (this.CROOIRROCHHIIHROIORHRIOHOROOIC() != var2.CROOIRROCHHIIHROIORHRIOHOROOIC()) {
         return false;
      } else {
         String var3 = this.IRIOOOOCHCCRHORROIRRIIOOOHCOHI();
         String var4 = var2.IRIOOOOCHCCRHORROIRRIIOOOHCOHI();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.CCICCIOCIHOOIHCIRCHHHRROHIHHIH();
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var2.CCICCIOCIHOOIHCIRCHHHRROHIHHIH();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof IOIOHIORIROHRRCOOOHCROHORCOIIH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.CROOIRROCHHIIHROIORHRIOHOROOIC();
      String var3 = this.IRIOOOOCHCCRHORROIRRIIOOOHCOHI();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this.CCICCIOCIHOOIHCIRCHHHRROHIHHIH();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "KeyVersionPair(keyCode="
         + this.IRIOOOOCHCCRHORROIRRIIOOOHCOHI()
         + ", key="
         + this.CCICCIOCIHOOIHCIRCHHHRROHIHHIH()
         + ", legacyKeyCode="
         + this.CROOIRROCHHIIHROIORHRIOHOROOIC()
         + ")";
   }
}
