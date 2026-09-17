package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.time.LocalDateTime;
import java.time.Month;

public interface IHHCHHHCRIHOOCOIOOCRIIICIOROIR<T extends CRICCOOHHHCHOORCICOCOHIHOIRHOO> {
   default boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(LocalDateTime var1, Month var2) {
      return true;
   }

   default boolean CHORHRICHOCIHRRICRHIORHRIRCOOR() {
      LocalDateTime var1 = LocalDateTime.now();
      Month var2 = var1.getMonth();
      return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
   }

   T HOOHIRCRHCCOOHCOHORHOOOCOHCHHI();
}
