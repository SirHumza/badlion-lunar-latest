package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import javax.annotation.Nullable;
import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   ALL("all", null),
   EASY("easy", HHCCIRHCCCIIRHCROHIORHIRHHIORH.EASY),
   MEDIUM("medium", HHCCIRHCCCIIRHCROHIORHIRHHIORH.MEDIUM),
   HARD("hard", HHCCIRHCCCIIRHCROHIORHIRHHIORH.HARD);

   private final String id;
   @Nullable
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH difficulty;

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id());
   }

   @Generated
   CRRRICCRROCOHHOHIICIHORCOORRRH(String var3, @Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH var4) {
      this.id = var3;
      this.difficulty = var4;
   }

   @Nullable
   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH getDifficulty() {
      return this.difficulty;
   }
}
