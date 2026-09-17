package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   COUNT_2(2),
   COUNT_3(3),
   COUNT_4(4),
   COUNT_5(5);

   private final int chestsPerRow;

   @Override
   public String id() {
      return "chestsPerRow" + this.chestsPerRow;
   }

   @Override
   public String toString() {
      return String.valueOf(this.chestsPerRow);
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3) {
      this.chestsPerRow = var3;
   }

   @Generated
   public int getChestsPerRow() {
      return this.chestsPerRow;
   }
}
