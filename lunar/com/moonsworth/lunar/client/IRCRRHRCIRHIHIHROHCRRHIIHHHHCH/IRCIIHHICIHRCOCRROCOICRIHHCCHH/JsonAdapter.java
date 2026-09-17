package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public final class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
   }

   public static com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      File var0, String var1
   ) {
      JsonObject var2;
      try (BufferedReader var3 = Files.newBufferedReader(var0.toPath(), StandardCharsets.UTF_8)) {
         var2 = JsonParser.parseReader(var3).getAsJsonObject();
      }

      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, IOHIHIIHCCCCCIHRORIOIOORCIOHII(var0), RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0), var1);
   }

   private static JsonArray IOHIHIIHCCCCCIHRORIOIOORCIOHII(File var0) {
      JsonElement var1 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, "autotext.json", "misc" + File.separator + "autotext.json");
      return var1 != null && var1.isJsonArray() ? var1.getAsJsonArray() : null;
   }

   private static JsonObject RCIROOOOICRHCCRRCIORHHIRCOIIIC(File var0) {
      JsonElement var1 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, new String[]{"sidebar.json"});
      return var1 != null && var1.isJsonObject() ? var1.getAsJsonObject() : null;
   }

   private static JsonElement IRCIIHHICIHRCOCRROCOICRIHHCCHH(File var0, String... var1) {
      File var2 = var0.getParentFile();

      for (int var3 = 0; var3 < 3 && var2 != null; var2 = var2.getParentFile()) {
         for (String var7 : var1) {
            File var8 = new File(var2, var7);
            if (var8.isFile()) {
               try (BufferedReader var9 = Files.newBufferedReader(var8.toPath(), StandardCharsets.UTF_8)) {
                  return JsonParser.parseReader(var9);
               } catch (Exception var14) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     "Couldn't read Feather config from %s: %s", var8, var14.getMessage()
                  );
               }
            }
         }

         var3++;
      }

      return null;
   }

   public static com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      JsonObject var0, String var1
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null, null, var1);
   }

   public static com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var0, JsonArray var1, JsonObject var2, String var3
   ) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new CRRRICCRROCOHHOHIICIHORCOORRRH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var0), var1, var2);
      ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(var4.CRRIOOICOICOHIOHHRHIRICIRRHOHH());
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RCCIROHIHIOOOIOOCIRORHCRROIROR();
      String var6 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var3);
      File var7 = new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI + File.separator + var6);
      if (!var7.exists() && !var7.mkdirs()) {
         throw new IOException("Could not create profile directory: " + var7);
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(new File(var7, "mods.json"), var4.CRRIOOICOICOHIOHHRHIRICIRRHOHH());
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(new File(var7, "general.json"), var4.OIHIRCCOIHIHCCIHRHIIIRHICHIRRR());
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(new File(var7, "controls.json"), var4.ROCCHOOCCOCCICIOHIIOCIIRHOHRIH());
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(new File(var7, "performance.json"), var4.IHRHOIORROCRRCORRHRIOCIOOHCIHO());
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = new com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var6, var6, false, false, ""
      );
      var5.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var8);
      var5.HIOCIHCOHORCROIOCRCCIRHCRHIICC();
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Imported Feather profile '%s' as Lunar profile '%s' (%d mods mapped, %d skipped)",
         var3,
         var6,
         var4.ORIHCIOHCICOORCROIORIHICOCRIHO().size(),
         var4.OCHOHHCIIHOOOCRIOCHOIOORICHCCH().size()
      );
      return var8;
   }

   public static void ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(JsonObject var0) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null) {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
            JsonElement var3 = var0.get(var2.getId());
            if (var3 != null && var3.isJsonObject()) {
               HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3.getAsJsonObject());
            }
         }
      }
   }

   private static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, JsonObject var1
   ) {
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2 = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
      JsonElement var3 = var1.get("options");
      if (var2 != null && var3 != null && var3.isJsonObject()) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3.getAsJsonObject());
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
      );
      if (var4 != null) {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 : var4.getChildren()) {
            JsonElement var7 = var1.get(var6.getId());
            if (var7 != null && var7.isJsonObject()) {
               HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6, var7.getAsJsonObject());
            }
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHHCHHHCRIHOOCOIOOCRIIICIOROIR var0, JsonObject var1) {
      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var3 : var0.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH);
         if (var4 != null) {
            JsonElement var5 = var1.get(var3.getId());
            if (var5 != null && var5.isJsonPrimitive() && var5.getAsJsonPrimitive().isNumber()) {
               double var6 = var5.getAsDouble();
               double var8 = Math.max(var4.getMin().doubleValue(), Math.min(var4.getMax().doubleValue(), var6));
               if (var8 != var6) {
                  if (!(var3.get() instanceof Float) && !(var3.get() instanceof Double)) {
                     var1.addProperty(var3.getId(), Math.round(var8));
                  } else {
                     var1.addProperty(var3.getId(), var8);
                  }
               }
            }
         }
      }
   }

   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0, String var1
   ) {
      String var2 = var1 != null && !var1.isBlank() ? var1.trim() : "Feather Import";
      String var3 = var2;
      int var4 = 2;

      while (IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var3)) {
         var3 = var2 + " (" + var4++ + ")";
      }

      return var3;
   }

   private static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0, String var1
   ) {
      return var0.RIIHCRRCIRICIHHHIROCRHCHCCCHHI().stream().anyMatch(var1x -> var1x.getName().equalsIgnoreCase(var1))
         || new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI + File.separator + var1).exists();
   }

   private static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(File var0, JsonObject var1) {
      try (BufferedWriter var2 = Files.newBufferedWriter(var0.toPath(), StandardCharsets.UTF_8)) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJson(var1, var2);
      }
   }
}
