package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   VANILLA("vanilla"),
   VANILLA_ICON("vanilla_icon"),
   INDICATOR("indicator"),
   INDICATOR_DOT("indicator_dot"),
   PROGRESS("progress");

   private final String id;

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   public boolean isVanilla() {
      return this == VANILLA || this == VANILLA_ICON;
   }

   public boolean isIndicator() {
      return this == INDICATOR || this == INDICATOR_DOT;
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
      this.id = var3;
   }
}
