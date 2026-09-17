package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final Set<String> HCHRRCCHOCHRRHCRHOROCCICIOHIII = Set.of("SKYBLOCK", "HYPIXEL_BEDWARS");

   private CRRRICCRROCOHHOHIICIHORCOORRRH() {
   }

   public static com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      File var0, String var1
   ) {
      String var3 = null;

      JsonObject var2;
      try (ZipFile var4 = new ZipFile(var0)) {
         ZipEntry var5 = var4.getEntry("data.json");
         if (var5 == null) {
            throw new IOException("Not a Badlion profile: missing data.json in " + var0.getName());
         }

         InputStreamReader var6 = new InputStreamReader(var4.getInputStream(var5), StandardCharsets.UTF_8);

         try {
            var2 = JsonParser.parseReader(var6).getAsJsonObject();
         } catch (Throwable var13) {
            try {
               var6.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }

            throw var13;
         }

         var6.close();
         ZipEntry var17 = var4.getEntry("info.json");
         if (var17 != null) {
            try (InputStreamReader var7 = new InputStreamReader(var4.getInputStream(var17), StandardCharsets.UTF_8)) {
               JsonObject var8 = JsonParser.parseReader(var7).getAsJsonObject();
               if (var8.has("name") && !var8.get("name").isJsonNull()) {
                  var3 = var8.get("name").getAsString();
               }
            }
         }
      }

      String var16 = var1 != null && !var1.isBlank() ? var1 : var3;
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var2), var16);
   }

   public static String ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(File var0) {
      try (ZipFile var1 = new ZipFile(var0)) {
         ZipEntry var2 = var1.getEntry("info.json");
         if (var2 == null) {
            return null;
         }

         try (InputStreamReader var3 = new InputStreamReader(var1.getInputStream(var2), StandardCharsets.UTF_8)) {
            JsonObject var4 = JsonParser.parseReader(var3).getAsJsonObject();
            return var4.has("name") && !var4.get("name").isJsonNull() ? var4.get("name").getAsString() : null;
         }
      } catch (Exception var10) {
         return null;
      }
   }

   private static HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(File var0, JsonObject var1) {
      JsonElement var2 = var1.get("crosshair");
      if (var2 != null && var2.isJsonObject()) {
         JsonObject var3 = var2.getAsJsonObject();
         if (var3.has("mode")
            && "CANVAS".equals(var3.get("mode").getAsString())
            && var3.has("currentCanvasCrosshair")
            && !var3.get("currentCanvasCrosshair").isJsonNull()) {
            String var4 = var3.get("currentCanvasCrosshair").getAsString();
            String var5 = var4.startsWith("crosshair-canvas-") ? var4.substring("crosshair-canvas-".length()) : var4;
            File var6 = new File(var0.getParentFile(), "crosshairs" + File.separator + var5);
            if (!var6.isFile()) {
               return null;
            }

            try {
               BufferedImage var7 = ImageIO.read(var6);
               if (var7 != null && var7.getWidth() == var7.getHeight() && var7.getWidth() >= 2 && var7.getWidth() <= 64) {
                  int[] var8 = new int[var7.getWidth() * var7.getHeight()];
                  var7.getRGB(0, 0, var7.getWidth(), var7.getHeight(), var8, 0, var7.getWidth());
                  return new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7.getWidth(), var8);
               } else {
                  return null;
               }
            } catch (Exception var9) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Couldn't read Badlion canvas crosshair from %s: %s", var6, var9.getMessage()
               );
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      JsonObject var0, String var1
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null, var1);
   }

   public static com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var0, HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = new HHCCIRHCCCIIRHCROHIORHIRHHIORH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var0), var1);
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(
         var3.CRRIOOICOICOHIOHHRHIRICIRRHOHH()
      );
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.CRRIOOICOICOHIOHHRHIRICIRRHOHH(), CCOOIRHHHCHCOCOOHIHHCICRCCCROH());
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RCCIROHIHIOOOIOOCIRORHCRROIROR();
      String var5 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2);
      File var6 = new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI + File.separator + var5);
      if (!var6.exists() && !var6.mkdirs()) {
         throw new IOException("Could not create profile directory: " + var6);
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(new File(var6, "mods.json"), var3.CRRIOOICOICOHIOHHRHIRICIRRHOHH());
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(new File(var6, "general.json"), var3.OIHIRCCOIHIHCCIHRHIIIRHICHIRRR());
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(new File(var6, "controls.json"), var3.ROCCHOOCCOCCICIOHIIOCIIRHOHRIH());
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(new File(var6, "performance.json"), var3.IHRHOIORROCRRCORRHRIOCIOOHCIHO());
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = new com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var5, var5, false, false, ""
      );
      var4.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var7);
      var4.HIOCIHCOHORCROIOCRCCIRHCRHIICC();
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Imported Badlion profile as Lunar profile '%s' (%d mods mapped, %d skipped)",
         var5,
         var3.ORIHCIOHCICOORCROIORIHICOCRIHO().size(),
         var3.OCHOHHCIIHOOOCRIOCHOIOORICHCCH().size()
      );
      return var7;
   }

   private static Iterable<? extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CCOOIRHHHCHCOCOOHIHHCICRCCCROH() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null
         ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().OHHRCRIOOCIORORHIOHRICRHHORCIH()
         : List.of();
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var0, Iterable<? extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1
   ) {
      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : var1) {
         if (HCHRRCCHOCHRRHCRHOROCCICIOHIII.contains(var3.getId())) {
            JsonElement var4 = var0.get(var3.getId());
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
            );
            if (var4 != null && var4.isJsonObject() && var5 != null) {
               JsonObject var6 = var4.getAsJsonObject();

               for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 : var5.getChildren()) {
                  if (!var6.has(var8.getId())) {
                     JsonObject var9 = new JsonObject();
                     var9.addProperty("enabled", false);
                     var6.add(var8.getId(), var9);
                  }
               }
            }
         }
      }
   }

   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0, String var1
   ) {
      String var2 = var1 != null && !var1.isBlank() ? var1.trim() : "Badlion Import";
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
