package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   LOCKED("locked", true, true),
   VISUAL("visual", false, true),
   DISABLED("disabled", false, false);

   private final String translationKey;
   private final boolean isInteractionsLocked;
   private final boolean isVisible;

   HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.STORAGE_OVERLAY_INFO) String var3,
      boolean var4,
      boolean var5
   ) {
      this.translationKey = var3;
      this.isInteractionsLocked = var4;
      this.isVisible = var5;
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
   public boolean isInteractionsLocked() {
      return this.isInteractionsLocked;
   }

   @Generated
   public boolean isVisible() {
      return this.isVisible;
   }
}
