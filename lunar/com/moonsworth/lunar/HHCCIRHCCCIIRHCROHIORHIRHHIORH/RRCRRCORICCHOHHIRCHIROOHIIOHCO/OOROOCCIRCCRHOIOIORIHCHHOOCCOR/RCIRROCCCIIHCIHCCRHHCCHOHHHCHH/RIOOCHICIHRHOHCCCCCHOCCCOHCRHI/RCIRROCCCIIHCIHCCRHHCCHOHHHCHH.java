package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final boolean hasUV;
   private final boolean hasColor;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, boolean var2) {
      this.hasUV = var1;
      this.hasColor = var2;
   }

   @Generated
   public boolean HHCHOCHCOICCORICHRIOCRRHIHCICO() {
      return this.hasUV;
   }

   @Generated
   public boolean CIHHIRCIRROCHROHOIHROOCRHRHOOI() {
      return this.hasColor;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(
         var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
      )) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else {
         return this.HHCHOCHCOICCORICHRIOCRRHIHCICO() != var2.HHCHOCHCOICCORICHRIOCRRHIHCICO()
            ? false
            : this.CIHHIRCIRROCHROHOIHROOCRHRHOOI() == var2.CIHHIRCIRROCHROHOIHROOCRHRHOOI();
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + (this.HHCHOCHCOICCORICHRIOCRRHIHCICO() ? 79 : 97);
      return var2 * 59 + (this.CIHHIRCIRROCHROHOIHROOCRHRHOOI() ? 79 : 97);
   }
}
