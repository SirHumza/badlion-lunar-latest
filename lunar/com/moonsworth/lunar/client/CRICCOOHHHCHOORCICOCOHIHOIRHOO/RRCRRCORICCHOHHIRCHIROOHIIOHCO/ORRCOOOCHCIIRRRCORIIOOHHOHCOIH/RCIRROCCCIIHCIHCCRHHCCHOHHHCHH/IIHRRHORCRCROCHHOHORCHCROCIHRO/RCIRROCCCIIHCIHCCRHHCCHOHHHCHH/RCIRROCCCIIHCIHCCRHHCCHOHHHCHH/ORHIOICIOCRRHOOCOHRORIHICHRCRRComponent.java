package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import lombok.Generated;

public enum RRCRRCORICCHOHHIRCHIROOHIIOHCO implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   DEFAULT("default", 0),
   SMALL("small", 1),
   NORMAL("normal", 2),
   LARGE("large", 3);

   private final String translationKey;
   private final int scale;

   RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.STORAGE_OVERLAY_INFO) String var3,
      int var4
   ) {
      this.translationKey = var3;
      this.scale = var4;
   }

   @Override
   public String id() {
      return this.translationKey;
   }

   @Override
   public String getLanguagePath() {
      return "features.STORAGE_OVERLAY.info";
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id());
   }

   @Generated
   public String getTranslationKey() {
      return this.translationKey;
   }

   @Generated
   public int getScale() {
      return this.scale;
   }
}
