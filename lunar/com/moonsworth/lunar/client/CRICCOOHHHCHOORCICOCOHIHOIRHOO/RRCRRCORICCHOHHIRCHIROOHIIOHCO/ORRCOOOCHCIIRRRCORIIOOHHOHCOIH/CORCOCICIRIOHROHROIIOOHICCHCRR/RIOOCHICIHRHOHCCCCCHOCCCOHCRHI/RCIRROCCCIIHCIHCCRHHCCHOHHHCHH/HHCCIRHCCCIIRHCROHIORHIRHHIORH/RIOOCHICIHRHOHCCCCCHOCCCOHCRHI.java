package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import lombok.Generated;
import org.apache.commons.lang3.text.WordUtils;

public enum RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   BAT(false),
   CHEST(false),
   ITEM_DROP(false),
   ESSENCE(true),
   FAIRY_SOUL(true);

   private final boolean nonstandardShape;

   @Override
   public String toString() {
      return WordUtils.capitalizeFully(this.name().replace('_', ' '), new char[]{' '});
   }

   @Generated
   public boolean isNonstandardShape() {
      return this.nonstandardShape;
   }

   @Generated
   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(boolean var3) {
      this.nonstandardShape = var3;
   }
}
