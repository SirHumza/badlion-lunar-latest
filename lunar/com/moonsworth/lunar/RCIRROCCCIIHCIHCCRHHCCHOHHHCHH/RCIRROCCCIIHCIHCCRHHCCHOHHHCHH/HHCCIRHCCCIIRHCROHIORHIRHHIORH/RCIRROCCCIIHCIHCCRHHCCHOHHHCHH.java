package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.util.Map;
import java.util.Objects;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private Object instance;
   private Boolean IRIHOIRCHIRRCRIOORCOICORHHORHH;
   private final String HRCROCOHHHICRHIHHOOCIIRRRCCIRR;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Boolean var2) {
      this.HRCROCOHHHICRHIHHOOCIIRRRCCIRR = var1;
      this.IRIHOIRCHIRRCRIOORCOICORHHORHH = var2;
   }

   public abstract Map<String, Class<?>> OCIROOIHIHRHOCCHIIIROOCRIIOCRR();

   public Object HRCOCHHHCCIORCORCHIOOOCCCCHICH() {
      return this.instance;
   }

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(Object var1) {
      this.instance = var1;
   }

   public Object IIHHICHCCCOHCHROIRIHICCHHOROCR() {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   private Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (var1.HRCOCHHHCCIORCORCHIOOOCCCCHICH() == null) {
         return null;
      } else {
         return var1.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
            ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.HRCOCHHHCCIORCORCHIOOOCCCCHICH())
            : var1.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
      }
   }

   public String IIIIRHIHROIRCROHHROIHIIHRCRRHO() {
      return this.HRCROCOHHHICRHIHHOOCIIRRRCCIRR;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class ").append(this.getClass()).append(" {\n");
      var1.append("    instance: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.instance)).append("\n");
      var1.append("    isNullable: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.IRIHOIRCHIRRCRIOORCOICORHHORHH)).append("\n");
      var1.append("    schemaType: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HRCROCOHHHICRHIHHOOCIIRRRCCIRR)).append("\n");
      var1.append("}");
      return var1.toString();
   }

   private String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Object var1) {
      return var1 == null ? "null" : var1.toString().replace("\n", "\n    ");
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         return Objects.equals(this.instance, var2.instance)
            && Objects.equals(this.IRIHOIRCHIRRCRIOORCOICORHHORHH, var2.IRIHOIRCHIRRCRIOORCOICORHHORHH)
            && Objects.equals(this.HRCROCOHHHICRHIHHOOCIIRRRCCIRR, var2.HRCROCOHHHICRHIHHOOCIIRRRCCIRR);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.instance, this.IRIHOIRCHIRRCRIOORCOICORHHORHH, this.HRCROCOHHHICRHIHHOOCIIRRRCCIRR);
   }

   public Boolean RRRHHIRORHCHHCOOCIHOICORHHCHHO() {
      return Boolean.TRUE.equals(this.IRIHOIRCHIRRCRIOORCOICORHHORHH) ? Boolean.TRUE : Boolean.FALSE;
   }
}
