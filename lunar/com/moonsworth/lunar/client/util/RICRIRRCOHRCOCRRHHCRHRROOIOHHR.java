package com.moonsworth.lunar.client.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class RICRIRRCOHRCOCRRHHCRHRROOIOHHR {
   public static final DateTimeFormatter HRHCIHHCCRCRCICIHHRORCCHROCORH = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
      .withLocale(Locale.getDefault());
   public static final DateTimeFormatter CCOIHIICCROHHRCCRIRHIHCOCOROIO = DateTimeFormatter.ofPattern("d MMMM uuuu", Locale.getDefault());

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LocalDate var0, ZoneId var1) {
      LocalDate var2 = LocalDate.now(var1);
      long var3 = ChronoUnit.DAYS.between(var2, var0);
      if (var3 == 0L) {
         return CORCOCICIRIOHROHROIIOOHICCHCRR("today");
      } else if (var3 == 1L) {
         return CORCOCICIRIOHROHROIIOOHICCHCRR("tomorrow");
      } else if (var3 == -1L) {
         return CORCOCICIRIOHROHROIIOOHICCHCRR("yesterday");
      } else {
         return var3 > 0L ? CORCOCICIRIOHROHROIIOOHICCHCRR("inDays", var3) : CORCOCICIRIOHROHROIIOOHICCHCRR("daysAgo", Math.abs(var3));
      }
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Instant var0, ZoneId var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.atZone(var1).toLocalDate(), var1);
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, ZoneId var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Instant.ofEpochMilli(var0), var2);
   }

   public static String HRHRORCIRICHCCCCCHICOOICIRHRIO(long var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, ZoneId.systemDefault());
   }

   public static String CORCOCICIRIOHROHROIIOOHICCHCRR(Instant var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, ZoneId.systemDefault());
   }

   public static String HHCCIRHCCCIIRHCROHIORHIRHHIORH(LocalDate var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, ZoneId.systemDefault());
   }

   private static String CORCOCICIRIOHROHROIIOOHICCHCRR(String var0, Object... var1) {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("date", var0, var1);
   }
}
