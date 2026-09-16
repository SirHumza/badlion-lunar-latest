package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   public static CRRRICCRROCOHHOHIICIHORCOORRRH RIOICCHIORRRRCROIIHCRCOIIRIOOH = new CRRRICCRROCOHHOHIICIHORCOORRRH();
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI OCHRICIORORCRHORHORHICHROHRHHR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR("color")
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(0)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private boolean showBeam = true;
   private com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROOHCRHOCCHIHOIHRRIHCRIHOIOICH = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PI_MAP_PIN_SOLID;
   private boolean highlightBlock = false;
   private boolean showText = true;
   private boolean showDistance = true;
   private Float ICHRROIRHOHOCORCOCOROIRIRRRICC = null;
   private CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OICHCICHHCHCRHOIICOHOCORCRIRCI = null;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      boolean var1, com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2, boolean var3, boolean var4, boolean var5
   ) {
      this.showBeam = var1;
      this.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH = var2;
      this.highlightBlock = var3;
      this.showText = var4;
      this.showDistance = var5;
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.showBeam = var1.showBeam;
      this.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH = var1.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH;
      this.highlightBlock = var1.highlightBlock;
      this.showText = var1.showText;
      this.showDistance = var1.showDistance;
      this.OCHRICIORORCRHORHORHICHROHRHHR.CORCOCICIRIOHROHROIIOOHICCHCRR(var1.OCHRICIORORCRHORHORHICHROHRHHR);
   }

   public void load(JsonObject var1) {
      if (var1.has("color")) {
         this.OCHRICIORORCRHORHORHICHROHRHHR.load(var1);
      }

      if (var1.has("showBeam")) {
         this.showBeam = var1.get("showBeam").getAsBoolean();
      }

      if (var1.has("icon")) {
         this.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.valueOf(
            var1.get("icon").getAsString()
         );
      }

      if (var1.has("highlightBlock")) {
         this.highlightBlock = var1.get("highlightBlock").getAsBoolean();
      }

      if (var1.has("showText")) {
         this.showText = var1.get("showText").getAsBoolean();
      }

      if (var1.has("showDistance")) {
         this.showDistance = var1.get("showDistance").getAsBoolean();
      }
   }

   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("showBeam", this.showBeam);
      var1.addProperty("showText", this.showText);
      var1.addProperty("showDistance", this.showDistance);
      var1.addProperty("highlightBlock", this.highlightBlock);
      var1.addProperty("icon", this.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH.ordinal());
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.OCHRICIORORCRHORHORHICHROHRHHR
         .IHCRORHRORIICHRHRCHRRIRRHHOCOO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRHRCRCCHCICIRIRCIRHRCIHCIRHIO);
      if (var2 != null) {
         var1.add("color", var2.provide());
      }

      return var1;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      var1.addProperty("showBeam", this.showBeam);
      var1.addProperty("showText", this.showText);
      var1.addProperty("showDistance", this.showDistance);
      var1.addProperty("highlightBlock", this.highlightBlock);
      var1.addProperty("icon", this.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH.name());
      this.OCHRICIORORCRHORHORHICHROHRHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
   }

   @Generated
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI CHIHRIROCCRICOHIRCRIOOHOHRRCHC() {
      return this.OCHRICIORORCRHORHORHICHROHRHHR;
   }

   @Generated
   public boolean isShowBeam() {
      return this.showBeam;
   }

   @Generated
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getIcon() {
      return this.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH;
   }

   @Generated
   public boolean isHighlightBlock() {
      return this.highlightBlock;
   }

   @Generated
   public boolean isShowText() {
      return this.showText;
   }

   @Generated
   public boolean isShowDistance() {
      return this.showDistance;
   }

   @Generated
   public Float IHIHRRRCCROIRRCCCIIHIHIOIRIOHC() {
      return this.ICHRROIRHOHOCORCOCOROIRIRRRICC;
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOICRIORHCHCIOHRHRROORHCCRIOOR() {
      return this.OICHCICHHCHCRHOIICOHOCORCRIRCI;
   }

   @Generated
   public void OCRRIOHCHCCRRHRCCOHCIORRRORCRH(boolean var1) {
      this.showBeam = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH = var1;
   }

   @Generated
   public void RICRHCHRRCCIICRCHICCIHHHCIICOH(boolean var1) {
      this.highlightBlock = var1;
   }

   @Generated
   public void ORHOOCIRIHHOCHHRIRIOIIICHOORCR(boolean var1) {
      this.showText = var1;
   }

   @Generated
   public void HRHRIHCHOHOOHHOOIOORHRRICHHCHI(boolean var1) {
      this.showDistance = var1;
   }

   @Generated
   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(Float var1) {
      this.ICHRROIRHOHOCORCOCOROIRIRRRICC = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.OICHCICHHCHCRHOIICOHOCORCRIRCI = var1;
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      boolean var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      boolean var3,
      boolean var4,
      boolean var5,
      Float var6,
      CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7
   ) {
      this.showBeam = var1;
      this.ROOHCRHOCCHIHOIHRRIHCRIHOIOICH = var2;
      this.highlightBlock = var3;
      this.showText = var4;
      this.showDistance = var5;
      this.ICHRROIRHOHOCORCOCOROIRIRRRICC = var6;
      this.OICHCICHHCHCRHOIICOHOCORCRIRCI = var7;
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private boolean onlyShowTextWhenLookingNear;
      private boolean showIcons;
      private float textIconScale;
      private float labelScale;
      private float boxPadding;
      boolean boxBorders;
      boolean textShadow;

      @Generated
      public boolean isOnlyShowTextWhenLookingNear() {
         return this.onlyShowTextWhenLookingNear;
      }

      @Generated
      public boolean isShowIcons() {
         return this.showIcons;
      }

      @Generated
      public float getTextIconScale() {
         return this.textIconScale;
      }

      @Generated
      public float getLabelScale() {
         return this.labelScale;
      }

      @Generated
      public float getBoxPadding() {
         return this.boxPadding;
      }

      @Generated
      public boolean isBoxBorders() {
         return this.boxBorders;
      }

      @Generated
      public boolean isTextShadow() {
         return this.textShadow;
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, boolean var2, float var3, float var4, float var5, boolean var6, boolean var7) {
         this.onlyShowTextWhenLookingNear = var1;
         this.showIcons = var2;
         this.textIconScale = var3;
         this.labelScale = var4;
         this.boxPadding = var5;
         this.boxBorders = var6;
         this.textShadow = var7;
      }
   }
}
