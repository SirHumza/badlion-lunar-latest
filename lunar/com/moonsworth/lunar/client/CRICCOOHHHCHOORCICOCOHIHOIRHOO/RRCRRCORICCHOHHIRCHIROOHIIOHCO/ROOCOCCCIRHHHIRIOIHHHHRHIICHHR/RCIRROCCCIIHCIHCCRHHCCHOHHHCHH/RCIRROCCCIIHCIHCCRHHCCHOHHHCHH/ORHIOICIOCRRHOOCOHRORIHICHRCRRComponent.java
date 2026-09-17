package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   BOTTOM_MIDDLE("bottomMiddle"),
   BOTTOM_LEFT("bottomLeft"),
   TOP_MIDDLE("topMiddle"),
   TOP_LEFT("topLeft");

   private final String translationKey;

   HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INVENTORY_SEARCH_INFO) String var3
   ) {
      this.translationKey = var3;
   }

   @Override
   public String id() {
      return this.translationKey;
   }

   @Override
   public String getLanguagePath() {
      return "features.INVENTORY_SEARCH.info";
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
