package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.time.DateTimeException;
import java.time.Year;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static final HICHRCOHCCRHOHCICOOCHOIHCCHIRI IOOIICIOICCHRIHHRCRHCHOIOHRHOH = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI();

   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI() {
   }

   protected Year IRRCCOICORICIHCHRHIHIHROIRHOCR(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      try {
         return Year.of(Integer.parseInt(var1));
      } catch (NumberFormatException var4) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, Year.class, new DateTimeException("Number format exception", var4), var1);
      } catch (DateTimeException var5) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, Year.class, var5, var1);
      }
   }
}
