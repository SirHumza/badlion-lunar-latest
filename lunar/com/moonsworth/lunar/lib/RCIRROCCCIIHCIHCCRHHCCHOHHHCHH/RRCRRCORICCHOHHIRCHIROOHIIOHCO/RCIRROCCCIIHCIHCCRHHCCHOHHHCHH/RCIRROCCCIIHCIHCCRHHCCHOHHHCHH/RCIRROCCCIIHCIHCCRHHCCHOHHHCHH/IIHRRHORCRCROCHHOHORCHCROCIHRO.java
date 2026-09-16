package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static final IIHRRHORCRCROCHHOHORCHCROCIHRO RRCCOORICOCRRROHCHORCIIIRHICCH = new IIHRRHORCRCROCHHOHORCHCROCIHRO();
   private static final DateTimeFormatter ORHIICHRRIHOHRHCRRHRHIIHRHIHOC = new DateTimeFormatterBuilder()
      .appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
      .appendLiteral('-')
      .appendValue(ChronoField.MONTH_OF_YEAR, 2)
      .toFormatter();

   protected IIHRRHORCRCROCHHOHORCHCROCIHRO() {
   }

   protected YearMonth RICRIRRCOHRCOCRRHHCRHRROOIOHHR(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      try {
         return YearMonth.parse(var1, ORHIICHRRIHOHRHCRRHRHIIHRHIHOC);
      } catch (DateTimeException var4) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, YearMonth.class, var4, var1);
      }
   }
}
