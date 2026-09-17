package com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.google.gson.JsonArray;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import com.moonsworth.lunar.client.util.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import lombok.Generated;
import org.jspecify.annotations.Nullable;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final File ROHRCRHRRIICHCORCCICHOCOIROROC = IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOOOHICOOORRRIRHCCHIHICIICIROI.resolve("sounds").toFile();
   private static final long ROOIOICIHCCIOCRHIRRHHRROHIIIIR = 1048576L;
   private static final IRCIIHHICIHRCOCRROCOICRIHHCCHH OOICIRORRHCHRRCIHOIOHCCOHCHHOO = IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHROHHHCIHHCOHCOORCRIHHIICROR(
      "mp3", "wav", "ogg"
   );
   private static final long OROHCOIIHHCIICOIRCCCRRHOCIICOH = 10000L;
   private static final Map<OOOOCCOOOHCHCIIHOIHCRIIOOROHRC, Long> RIRRIHOROHHIHIOCCCCIHCICROHROR = new WeakHashMap<>();
   private static List<String> IHOHCIHIORORCOHIOOHROOIRIRIIIC;
   private static JsonArray HIHIRCIIIHHRIRHOHORIOHCCOHOHOC;

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(OOOOCCOOOHCHCIIHOIHCRIIOOROHRC var0) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOOOCCOOOHCHCIIHOIHCRIIOOROHRC var0, @Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      if (!var0.CHIOCRCHIHICOHCOHCHIRORRIOCIRH() && !(CRRRICCRROCOHHOHIICIHORCOORRRH(var0) <= 0.0F)) {
         if (var0.isFile()) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1);
         } else {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
         }
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(OOOOCCOOOHCHCIIHOIHCRIIOOROHRC var0, @Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2;
      try {
         var2 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var0.get());
      } catch (RuntimeException var4) {
         CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1);
         return;
      }

      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSoundHandler().bridge$getAllRegisteredSounds().contains(var2)) {
         CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1);
      } else {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getSoundHandler()
            .bridge$playSound(var2, true, CRRRICCRROCOHHOHIICIHORCOORRRH(var0));
      }
   }

   private static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(OOOOCCOOOHCHCIIHOIHCRIIOOROHRC var0, @Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      File var2 = new File(OIOCOORICIICRICRRHCIIRIOROIHHO(), var0.getFileName());
      if (!IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var2)) {
         CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1);
      } else {
         float var3 = CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
         if (ORCOCORROHIROCCIORORRRRCHIOOCH.RCCCROCHCICCROHCOCCRRROCIIHCCH(() -> HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1))) {
            try {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getSoundHandler()
                  .bridge$playMp3FromURL(var2.toURI().toString(), var3, false, false);
            } catch (Exception var5) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Could not play Lunar sound!", var5.getMessage()
               );
            }
         }
      }
   }

   private static boolean IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(File var0) {
      if (var0.isFile() && OOICIRORRHCHRRCIHOIOHCCOHCHHOO.accept(var0.getParentFile(), var0.getName()) && RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var0)) {
         try {
            return OIOCOORICIICRICRRHCIIRIOROIHHO().getCanonicalFile().equals(var0.getCanonicalFile().getParentFile());
         } catch (IOException var2) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Could not resolve sound file path!", var2.getMessage()
            );
            return false;
         }
      } else {
         return false;
      }
   }

   private static float CRRRICCRROCOHHOHIICIHORCOORRRH(OOOOCCOOOHCHCIIHOIHCRIIOOROHRC var0) {
      float var1 = var0.ROOCROROCHIICHRCRCORCIROHHOOCR().get().intValue() / 100.0F;
      return var1
         * IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .IOIHHHICCHORIOHOIIICOCORCICOCO()
            .get();
   }

   private static void CRRRICCRROCOHHOHIICIHORCOORRRH(OOOOCCOOOHCHCIIHOIHCRIIOOROHRC var0, @Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
      if (var2 != null) {
         long var3 = System.currentTimeMillis();
         Long var5 = RIRRIHOROHHIHIOCCCCIHCICROHROR.get(var0);
         if (var5 == null || var3 - var5 >= 10000L) {
            RIRRIHOROHHIHIOCCCCIHCICROHROR.put(var0, var3);
            String var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("messages", "soundMissing", var0.get(), var0.getName());
            String var7 = IOIOHIORIROHRRCOOOHCROHORCOIIH(var1);
            if (var7 != null) {
               var6 = var6
                  + " "
                  + IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("messages", "soundMissingConfigure", var7);
            }

            var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(Component.text(var6, NamedTextColor.RED));
         }
      }
   }

   private static @Nullable String IOIOHIORIROHRRCOOOHCROHORCOIIH(@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      if (var0 == null) {
         return null;
      }

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1 = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRIIOCRCRHHRORCROHRRIOCCHROORO);
      return var1 == null ? null : var1.getName();
   }

   public static File OIOCOORICIICRICRRHCIIRIOROIHHO() {
      if (!ROHRCRHRRIICHCORCCICHOCOIROROC.exists() && !ROHRCRHRRIICHCORCCICHOCOIROROC.mkdirs()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Could not create the Lunar sounds folder!"
         );
      }

      return ROHRCRHRRIICHCORCCICHOCOIROROC;
   }

   public static List<String> CHOHORHHOIOHHCCROHIORHOCHOHCRO() {
      ArrayList var0 = new ArrayList();
      var0.add("none");
      var0.addAll(CHOCHIHOCIOCCCRCOCHHCHOIOCRRRO());
      RCHORIORHIIIRCRCHORHHCOHIRRRRH().forEach(var1 -> var0.add("file:" + var1));
      return var0;
   }

   public static JsonArray RHOCORCCRRRCCHCROOICICORHHHOCC() {
      if (HIHIRCIIIHHRIRHOHORIOHCCOHOHOC == null) {
         HIHIRCIIIHHRIRHOHORIOHCCOHOHOC = new JsonArray();
         CHOHORHHOIOHHCCROHIORHOCHOHCRO().forEach(HIHIRCIIIHHRIRHOHORIOHCCOHOHOC::add);
      }

      return HIHIRCIIIHHRIRHOHORIOHCCOHOHOC;
   }

   public static void OOICOCOCHOROIIHRORHORRRHIOHCRR() {
      HIHIRCIIIHHRIRHOHORIOHCCOHOHOC = null;
   }

   private static List<String> CHOCHIHOCIOCCCRCOCHHCHOIOCRRRO() {
      if (IHOHCIHIORORCOHIOOHROOIRIRIIIC == null) {
         IHOHCIHIORORCOHIOOHROOIRIRIIIC = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getSoundHandler()
            .bridge$getAllRegisteredSounds()
            .stream()
            .map(var0 -> var0.bridge$getDomain() + ":" + var0.bridge$getPath())
            .sorted()
            .toList();
      }

      return IHOHCIHIORORCOHIOOHROOIRIRIIIC;
   }

   public static List<String> RCHORIORHIIIRCRCHORHHCOHIRRRRH() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OIOCOORICIICRICRRHCIIRIOROIHHO(), OOICIRORRHCHRRCIHOIOHCCOHCHHOO);
   }

   public static List<String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var0, IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      ArrayList var2 = new ArrayList();
      File[] var3 = var0.listFiles(var1);
      if (var3 != null) {
         Arrays.stream(var3).filter(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::RHCHRCOCCOIIIHCHRHIRCORHRHRICR).map(File::getName).forEach(var2::add);
      }

      return var2;
   }

   public static boolean RHCHRCOCCOIIIHCHRHIRCORHRHRICR(File var0) {
      try {
         return Files.size(var0.toPath()) <= 1048576L;
      } catch (IOException var2) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Could not get sound file size!", var2.getMessage()
         );
         return false;
      }
   }

   @Generated
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
