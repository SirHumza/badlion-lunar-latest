package com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonObject;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private boolean HOCROOHRHRIOIICORHRIIICROCCRHC;
   private boolean OCCRRIHCIIRIORCOHIOIOCOOROOHIO = true;
   private boolean showOverChestplate = true;
   private boolean showOverLeggings = true;
   private boolean showOverBoots = true;
   private boolean CHOIRRCRRHHOOHIHIRHRHHIOOOOOOI = true;
   private boolean HRHROHOIIOIRCCRCCIOORIOIRHROHO;
   private float COIHCRIIRCICIOOCRHORIRIORROHHC;

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1) {
      this.HOCROOHRHRIOIICORHRIIICROCCRHC = var1.has("clothCloak") && var1.get("clothCloak").getAsBoolean();
      this.COIHCRIIRCICIOOCRHORIRIORROHHC = var1.has("hatHeightOffset") ? var1.get("hatHeightOffset").getAsFloat() : 0.0F;
      this.HRHROHOIIOIRCCRCCIOORIOIRHROHO = var1.has("flipShoulder") && var1.get("flipShoulder").getAsBoolean();
      this.OCCRRIHCIIRIORCOHIOIOCOOROOHIO = !var1.has("showHatsOverHelmet") || var1.get("showHatsOverHelmet").getAsBoolean();
      this.showOverChestplate = !var1.has("showOverChestplate") || var1.get("showOverChestplate").getAsBoolean();
      this.showOverLeggings = !var1.has("showOverLeggings") || var1.get("showOverLeggings").getAsBoolean();
      this.showOverBoots = !var1.has("showOverBoots") || var1.get("showOverBoots").getAsBoolean();
      this.CHOIRRCRRHHOOHIHIRHRHHIOOOOOOI = !var1.has("showHatsOverSkinlayer") || var1.get("showHatsOverSkinlayer").getAsBoolean();
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var1) {
      if (this.HOCROOHRHRIOIICORHRIIICROCCRHC) {
         var1.addProperty("clothCloak", true);
      } else {
         var1.remove("clothCloak");
      }

      if (this.HRHROHOIIOIRCCRCCIOORIOIRHROHO) {
         var1.addProperty("flipShoulder", true);
      } else if (var1.has("flipShoulder")) {
         var1.remove("flipShoulder");
      }

      if (this.COIHCRIIRCICIOOCRHORIRIORROHHC != 0.0F) {
         var1.addProperty("hatHeightOffset", this.COIHCRIIRCICIOOCRHORIRIORROHHC);
      } else {
         var1.remove("hatHeightOffset");
      }

      if (!this.OCCRRIHCIIRIORCOHIOIOCOOROOHIO) {
         var1.addProperty("showHatsOverHelmet", true);
      } else {
         var1.remove("showHatsOverHelmet");
      }

      if (!this.showOverChestplate) {
         var1.addProperty("showOverChestplate", true);
      } else {
         var1.remove("showOverChestplate");
      }

      if (!this.showOverLeggings) {
         var1.addProperty("showOverLeggings", true);
      } else {
         var1.remove("showOverLeggings");
      }

      if (!this.showOverBoots) {
         var1.addProperty("showOverBoots", true);
      } else {
         var1.remove("showOverBoots");
      }

      if (!this.CHOIRRCRRHHOOHIHIRHRHHIOOOOOOI) {
         var1.addProperty("showHatsOverSkinlayer", true);
      } else {
         var1.remove("showHatsOverSkinlayer");
      }
   }

   @Generated
   public boolean OIRCOHHHOOCCRRRIORORIHIHHRIOIH() {
      return this.HOCROOHRHRIOIICORHRIIICROCCRHC;
   }

   @Generated
   public boolean HICHRIIIOOIOCICROICCOICRHCIOOC() {
      return this.OCCRRIHCIIRIORCOHIOIOCOOROOHIO;
   }

   @Generated
   public boolean isShowOverChestplate() {
      return this.showOverChestplate;
   }

   @Generated
   public boolean isShowOverLeggings() {
      return this.showOverLeggings;
   }

   @Generated
   public boolean isShowOverBoots() {
      return this.showOverBoots;
   }

   @Generated
   public boolean HHCRRHRCRIIRCRCOHCICHCHICIRRRC() {
      return this.CHOIRRCRRHHOOHIHIRHRHHIOOOOOOI;
   }

   @Generated
   public boolean IHIHRCORCCCOHIIHHRHCCHIOORIHCH() {
      return this.HRHROHOIIOIRCCRCCIOORIOIRHROHO;
   }

   @Generated
   public float getHatHeightOffset() {
      return this.COIHCRIIRCICIOOCRHORIRIORROHHC;
   }

   @Generated
   public void CRHROHHHCIHHCOHCOORCRIHHIICROR(boolean var1) {
      this.HOCROOHRHRIOIICORHRIIICROCCRHC = var1;
   }

   @Generated
   public void RORCHCIIICOHIRROOORHOCCCCIOCCI(boolean var1) {
      this.OCCRRIHCIIRIORCOHIOIOCOOROOHIO = var1;
   }

   @Generated
   public void IOHHOIIOCRHCHHCRORICCOHOHROOIH(boolean var1) {
      this.showOverChestplate = var1;
   }

   @Generated
   public void IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(boolean var1) {
      this.showOverLeggings = var1;
   }

   @Generated
   public void RHCHRCOCCOIIIHCHRHIRCORHRHRICR(boolean var1) {
      this.showOverBoots = var1;
   }

   @Generated
   public void RCCCROCHCICCROHCOCCRRROCIIHCCH(boolean var1) {
      this.CHOIRRCRRHHOOHIHIRHRHHIOOOOOOI = var1;
   }

   @Generated
   public void OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(boolean var1) {
      this.HRHROHOIIOIRCCRCCIOORIOIRHROHO = var1;
   }

   @Generated
   public void RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(float var1) {
      this.COIHCRIIRCICIOOCRHORIRIORROHHC = var1;
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
      } else if (this.OIRCOHHHOOCCRRRIORORIHIHHRIOIH() != var2.OIRCOHHHOOCCRRRIORORIHIHHRIOIH()) {
         return false;
      } else if (this.HICHRIIIOOIOCICROICCOICRHCIOOC() != var2.HICHRIIIOOIOCICROICCOICRHCIOOC()) {
         return false;
      } else if (this.isShowOverChestplate() != var2.isShowOverChestplate()) {
         return false;
      } else if (this.isShowOverLeggings() != var2.isShowOverLeggings()) {
         return false;
      } else if (this.isShowOverBoots() != var2.isShowOverBoots()) {
         return false;
      } else if (this.HHCRRHRCRIIRCRCOHCICHCHICIRRRC() != var2.HHCRRHRCRIIRCRCOHCICHCHICIRRRC()) {
         return false;
      } else {
         return this.IHIHRCORCCCOHIIHHRHCCHIOORIHCH() != var2.IHIHRCORCCCOHIIHHRHCCHIOORIHCH()
            ? false
            : Float.compare(this.getHatHeightOffset(), var2.getHatHeightOffset()) == 0;
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
      var2 = var2 * 59 + (this.OIRCOHHHOOCCRRRIORORIHIHHRIOIH() ? 79 : 97);
      var2 = var2 * 59 + (this.HICHRIIIOOIOCICROICCOICRHCIOOC() ? 79 : 97);
      var2 = var2 * 59 + (this.isShowOverChestplate() ? 79 : 97);
      var2 = var2 * 59 + (this.isShowOverLeggings() ? 79 : 97);
      var2 = var2 * 59 + (this.isShowOverBoots() ? 79 : 97);
      var2 = var2 * 59 + (this.HHCRRHRCRIIRCRCOHCICHCHICIRRRC() ? 79 : 97);
      var2 = var2 * 59 + (this.IHIHRCORCCCOHIIHHRHCCHIOORIHCH() ? 79 : 97);
      return var2 * 59 + Float.floatToIntBits(this.getHatHeightOffset());
   }

   @Generated
   @Override
   public String toString() {
      return "CosmeticSettings(useClothCloaks="
         + this.OIRCOHHHOOCCRRRIORORIHIHHRIOIH()
         + ", showHatsOverHelmet="
         + this.HICHRIIIOOIOCICROICCOICRHCIOOC()
         + ", showOverChestplate="
         + this.isShowOverChestplate()
         + ", showOverLeggings="
         + this.isShowOverLeggings()
         + ", showOverBoots="
         + this.isShowOverBoots()
         + ", showHatsOverSkinlayer="
         + this.HHCRRHRCRIIRCRCOHCICHCHICIRRRC()
         + ", flipArm="
         + this.IHIHRCORCCCOHIIHHRHCCHIOORIHCH()
         + ", hatHeightOffset="
         + this.getHatHeightOffset()
         + ")";
   }
}
