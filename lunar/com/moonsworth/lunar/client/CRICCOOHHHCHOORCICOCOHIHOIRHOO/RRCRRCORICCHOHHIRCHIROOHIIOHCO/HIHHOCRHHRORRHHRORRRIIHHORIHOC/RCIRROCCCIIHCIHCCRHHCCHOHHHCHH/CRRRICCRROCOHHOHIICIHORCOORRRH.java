package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.client.util.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import java.util.Map;
import lombok.Generated;

@RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO
public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @SerializedName("minecraftVersion")
   String CRIIOOIHIOHHRRRHIOROOCHCHHCCCI;
   @SerializedName("minecraftProtocolVersion")
   int RCCOORIRRRIIOCICOIRHHORIHHRHHC;
   @SerializedName("externalMods")
   Map<String, String> HRRHICCIIIOCOOCIOCRIOICROORIRI;

   @Generated
   public String OCOROCROIRCHIHIHHOOIRIIIRRCRHI() {
      return this.CRIIOOIHIOHHRRRHIOROOCHCHHCCCI;
   }

   @Generated
   public int HRIORHIHOOIHHOHRCOCHHRROOHRIHO() {
      return this.RCCOORIRRRIIOCICOIRHHORIHHRHHC;
   }

   @Generated
   public Map<String, String> IHCRRRCCIIROIOCCOOHIIROOOIHICO() {
      return this.HRRHICCIIIOCOOCIOCRIOICROORIRI;
   }

   @Generated
   public void ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(String var1) {
      this.CRIIOOIHIOHHRRRHIOROOCHCHHCCCI = var1;
   }

   @Generated
   public void HIHCHCORCCRCOHCRROHOHOOCHOROCC(int var1) {
      this.RCCOORIRRRIIOCICOIRHHORIHHRHHC = var1;
   }

   @Generated
   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Map<String, String> var1) {
      this.HRRHICCIIIOCOOCIOCRIOICROORIRI = var1;
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
      } else if (this.HRIORHIHOOIHHOHRCOCHHRROOHRIHO() != var2.HRIORHIHOOIHHOHRCOCHHRROOHRIHO()) {
         return false;
      } else {
         String var3 = this.OCOROCROIRCHIHIHHOOIRIIIRRCRHI();
         String var4 = var2.OCOROCROIRCHIHIHHOOIRIIIRRCRHI();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Map var5 = this.IHCRRRCCIIROIOCCOOHIIROOOIHICO();
            Map var6 = var2.IHCRRRCCIIROIOCCOOHIIROOOIHICO();
            return var5 == null ? var6 == null : var5.equals(var6);
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
      int var2 = 1;
      var2 = var2 * 59 + this.HRIORHIHOOIHHOHRCOCHHRROOHRIHO();
      String var3 = this.OCOROCROIRCHIHIHHOOIRIIIRRCRHI();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Map var4 = this.IHCRRRCCIIROIOCCOOHIIROOOIHICO();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "RewindProjectMetadata(minecraftVersion="
         + this.OCOROCROIRCHIHIHHOOIRIIIRRCRHI()
         + ", minecraftProtocolVersion="
         + this.HRIORHIHOOIHHOHRCOCHHRROOHRIHO()
         + ", externalMods="
         + this.IHCRRRCCIIROIOCCOOHIIROOOIHICO()
         + ")";
   }
}
