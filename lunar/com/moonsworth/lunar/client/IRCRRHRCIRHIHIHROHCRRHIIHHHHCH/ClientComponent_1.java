package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Function;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static Boolean IIHROOIROICORRCICRHRIHRIRRCRHR;

   public static boolean IOROOCHHROORHOIRORICRRRIRCRCHC() {
      if (IIHROOIROICORRCICRHRIHRIRRCRHR == null) {
         IIHROOIROICORRCICRHRIHRIRRCRHR = CIRIORRCROHCOHHOCHICCOCHHRHIIO().stream().anyMatch(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO);
      }

      return IIHROOIROICORRCICRHRIHRIRRCRHR;
   }

   public static boolean RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(File var0) {
      return CRRRICCRROCOHHOHIICIHORCOORRRH(IHCRORHRORIICHRHRCHRRIRRHHOCOO(var0), ".zip")
         || CRRRICCRROCOHHOHIICIHORCOORRRH(ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var0), ".json");
   }

   public static boolean ROHRROCORRHHICICIOHRIHRCCRICHI() {
      return CIRIORRCROHCOHHOCHICCOCHHRHIIO().stream().anyMatch(var0 -> CRRRICCRROCOHHOHIICIHORCOORRRH(IHCRORHRORIICHRHRCHRRIRRHHOCOO(var0), ".zip"));
   }

   public static boolean RIOOCIRIHRHHCROIHOHOCHRICRCHCI() {
      return CIRIORRCROHCOHHOCHICCOCHHRHIIO().stream().anyMatch(var0 -> CRRRICCRROCOHHOHIICIHORCOORRRH(ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var0), ".json"));
   }

   public static List<File> ORCHCHHICCIRIOCHIIRRRIRCOHCOCR() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::IHCRORHRORIICHRHRCHRRIRRHHOCOO, ".zip");
   }

   public static List<File> ROOHOOIICHIIRRHIORCRHRRCHRHRHC() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::ICICIOCHHHIHOCHCOHORIHRCOHHOCR, ".json");
   }

   private static List<File> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Function<File, File> var0, String var1) {
      LinkedHashMap var2 = new LinkedHashMap();

      for (File var4 : CIRIORRCROHCOHHOCHICCOCHHRHIIO()) {
         File[] var5 = ((File)var0.apply(var4)).listFiles((var1x, var2x) -> var2x.toLowerCase(Locale.ROOT).endsWith(var1));
         if (var5 != null) {
            for (File var9 : var5) {
               var2.putIfAbsent(var9.getName().toLowerCase(Locale.ROOT), var9);
            }
         }
      }

      return List.copyOf(var2.values());
   }

   public static File IHCRORHRORIICHRHRCHRRIRRHHOCOO(File var0) {
      return new File(var0, "BLClient-Mod-Profiles");
   }

   public static File ICICIOCHHHIHOCHCOHORIHRCOHHOCR(File var0) {
      return new File(var0, "feather" + File.separator + "configuration" + File.separator + "profiles");
   }

   private static boolean CRRRICCRROCOHHOHIICIHORCOORRRH(File var0, String var1) {
      File[] var2 = var0.listFiles((var1x, var2x) -> var2x.toLowerCase(Locale.ROOT).endsWith(var1));
      return var2 != null && var2.length > 0;
   }

   private static Set<File> CIRIORRCROHCOHHOCHICCOCHHRHIIO() {
      LinkedHashSet var0 = new LinkedHashSet();
      var0.add(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir().getAbsoluteFile());
      var0.add(ICIHCIOHOCHOHCHIRRCRCRROHOHHOR().getAbsoluteFile());
      return var0;
   }

   private static File ICIHCIOHOCHOHCHIRRCRCRROHOHHOR() {
      String var0 = System.getProperty("user.home", ".");
      if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
         String var1 = System.getenv("APPDATA");
         return new File(var1 != null ? var1 : var0, ".minecraft");
      } else {
         return RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos()
            ? new File(var0, "Library" + File.separator + "Application Support" + File.separator + "minecraft")
            : new File(var0, ".minecraft");
      }
   }
}
