package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Deprecated
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var0,
      boolean var1
   ) {
      String var2 = var0.getName();
      String var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var2, var1);
      if (var3 == null) {
         var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var2, var1);
      }

      return var3;
   }

   @Deprecated
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var0,
      String var1,
      boolean var2
   ) {
      if (var1.startsWith("get")) {
         if ("getCallbacks".equals(var1)) {
            if (OCOHORHCROHICRRIHCIHHRRCIHICRI(var0)) {
               return null;
            }
         } else if ("getMetaClass".equals(var1) && CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0)) {
            return null;
         }

         return var2 ? RCCCROCHCICCROHCOCCRRROCIIHCCH(var1, 3) : RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var1, 3);
      } else {
         return null;
      }
   }

   @Deprecated
   public static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var0,
      String var1,
      boolean var2
   ) {
      if (var1.startsWith("is")) {
         Class var3 = var0.getRawType();
         if (var3 == Boolean.class || var3 == boolean.class) {
            return var2 ? RCCCROCHCICCROHCOCCRRROCIIHCCH(var1, 2) : RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var1, 2);
         }
      }

      return null;
   }

   @Deprecated
   public static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var0,
      boolean var1
   ) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, "set", var1);
   }

   @Deprecated
   public static String HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var0,
      String var1,
      boolean var2
   ) {
      String var3 = var0.getName();
      if (var3.startsWith(var1)) {
         return var2 ? RCCCROCHCICCROHCOCCRRROCIIHCCH(var3, var1.length()) : RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var3, var1.length());
      } else {
         return null;
      }
   }

   public static Object OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var0
   ) {
      Class var1 = var0.RRICIOOORRIORHHICIRCIOCHRHRCHH();
      Class var2 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHCICHRICRIIIHRRCICHOOOIOOOICH(var1);
      if (var2 != null) {
         return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.defaultValue(var2);
      } else if (var0.HCHCCRRRHHICOIRRIOOOOHHHOIIORR() || var0.HCHHHORHIRHCRRRHRIICHHROHICCOH()) {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NON_EMPTY;
      } else if (var1 == String.class) {
         return "";
      } else if (var0.IROCHOHCORHCOCCCOCHORCICRORIIC(Date.class)) {
         return new Date(0L);
      } else if (var0.IROCHOHCORHCOCCCOCHORCICRORIIC(Calendar.class)) {
         GregorianCalendar var3 = new GregorianCalendar();
         var3.setTimeInMillis(0L);
         return var3;
      } else {
         return null;
      }
   }

   protected static boolean OCOHORHCROHICRRIHCIHHRRCIHICRI(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var0
   ) {
      Class var1 = var0.getRawType();
      if (var1.isArray()) {
         Class var2 = var1.getComponentType();
         String var3 = var2.getName();
         if (var3.contains(".cglib")) {
            return var3.startsWith("net.sf.cglib") || var3.startsWith("org.hibernate.repackage.cglib") || var3.startsWith("org.springframework.cglib");
         }
      }

      return false;
   }

   protected static boolean CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var0
   ) {
      return var0.getRawType().getName().startsWith("groovy.lang");
   }

   protected static String RHCHRCOCCOIIIHCHRHIRCORHRHRICR(String var0, int var1) {
      int var2 = var0.length();
      if (var2 == var1) {
         return null;
      }

      char var3 = var0.charAt(var1);
      char var4 = Character.toLowerCase(var3);
      if (var3 == var4) {
         return var0.substring(var1);
      }

      StringBuilder var5 = new StringBuilder(var2 - var1);
      var5.append(var4);

      for (int var6 = var1 + 1; var6 < var2; var6++) {
         var3 = var0.charAt(var6);
         var4 = Character.toLowerCase(var3);
         if (var3 == var4) {
            var5.append(var0, var6, var2);
            break;
         }

         var5.append(var4);
      }

      return var5.toString();
   }

   public static String RCCCROCHCICCROHCOCCRRROCIIHCCH(String var0, int var1) {
      int var2 = var0.length();
      if (var2 == var1) {
         return null;
      }

      char var3 = var0.charAt(var1);
      char var4 = Character.toLowerCase(var3);
      if (var3 == var4) {
         return var0.substring(var1);
      }

      if (var1 + 1 < var2 && Character.isUpperCase(var0.charAt(var1 + 1))) {
         return var0.substring(var1);
      }

      StringBuilder var5 = new StringBuilder(var2 - var1);
      var5.append(var4);
      var5.append(var0, var1 + 1, var2);
      return var5.toString();
   }

   public static String HOIHOROOIOOCOIHCRIRIRIRRICIIHC(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var0
   ) {
      String var1 = var0.RRICIOOORRIORHHICIRCIOCHRHRCHH().getName();
      String var2;
      String var3;
      if (HIRHCCCROOHORORRRRCHICHROHRRIH(var1)) {
         if (var1.indexOf(46, 10) >= 0) {
            return null;
         }

         var2 = "Java 8 date/time";
         var3 = "com.moonsworth.lunar.lib.jackson.datatype:jackson-datatype-jsr310";
      } else {
         if (!HOIIROHHIIROROHCRROHCORIOHCIHH(var1)) {
            return null;
         }

         var2 = "Joda date/time";
         var3 = "com.moonsworth.lunar.lib.jackson.datatype:jackson-datatype-joda";
      }

      return String.format(
         "%s type %s not supported by default: add Module \"%s\" to enable handling",
         var2,
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRORCOIRRIICOOICOIOCORHORCHCOC(var0),
         var3
      );
   }

   public static boolean OIRCRCOOHCOHHCIHHIROIOCHCIHOHH(Class<?> var0) {
      return HIRHCCCROOHORORRRRCHICHROHRRIH(var0.getName());
   }

   private static boolean HIRHCCCROOHORORRRRCHICHROHRRIH(String var0) {
      return var0.startsWith("java.time.");
   }

   public static boolean OCCCCRRCROIRIHRROHCHCHORCOCICC(Class<?> var0) {
      return HOIIROHHIIROROHCRROHCORIOHCIHH(var0.getName());
   }

   private static boolean HOIIROHHIIROROHCRROHCORIOHCIHH(String var0) {
      return var0.startsWith("org.joda.time.");
   }
}
