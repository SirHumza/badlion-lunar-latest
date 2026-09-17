package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   FULLSCREEN("fullscreen"),
   FULLSCREEN_2("fullscreen2"),
   WINDOWED("window");

   private final String translationKey;

   CRRRICCRROCOHHOHIICIHORCOORRRH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.STORAGE_OVERLAY_INFO) String var3
   ) {
      this.translationKey = var3;
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
}
