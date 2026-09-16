package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.time.DateTimeException;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static final HRCHROOHRIHCRCRHRIIROCIRHOIRHH CIHIRHHRCIOORCIICOCHRORCRCCICR = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
   private static final DateTimeFormatter CCHCCOOIOHROROHIOHIHCHICCOOCOO = new DateTimeFormatterBuilder()
      .appendLiteral("--")
      .appendValue(ChronoField.MONTH_OF_YEAR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.DAY_OF_MONTH, 2)
      .toFormatter();

   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
   }

   protected MonthDay IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      try {
         return MonthDay.parse(var1, CCHCCOOIOHROROHIOHIHCHICCOOCOO);
      } catch (DateTimeException var4) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, MonthDay.class, var4, var1);
      }
   }
}
