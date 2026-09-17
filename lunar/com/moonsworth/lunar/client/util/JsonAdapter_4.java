package com.moonsworth.lunar.client.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileReader;

public class IOIICIRIICICIIOORHCIIIIRRIHRHI {
   private static boolean IOCRCHROHCCIRIRCHHCRIIIORHHCRH = false;
   private static boolean HHHIIRCOHHHOOOHICOIROIRHROHICI = true;

   public static boolean OCOROCRHHRCIORHICCRORHROIIORCR() {
      if (!IOCRCHROHCCIRIRCHHCRIIIORHHCRH) {
         initialize();
      }

      return HHHIIRCOHHHOOOHICOIROIRHROHICI;
   }

   private static void initialize() {
      IOCRCHROHCCIRIRCHHCRIIIORHHCRH = true;

      try {
         File var0 = new File(new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI, HCHOIRHIIRCOHRROOHRIOHHHRCCCOH()), "performance.json");
         if (!var0.exists()) {
            return;
         }

         try (FileReader var1 = new FileReader(var0)) {
            JsonElement var2 = JsonParser.parseReader(var1);
            if (var2.isJsonObject()) {
               JsonElement var3 = var2.getAsJsonObject().get("noErrorContext");
               if (var3 != null && var3.isJsonPrimitive()) {
                  HHHIIRCOHHHOOOHICOIROIRHROHICI = var3.getAsBoolean();
               }
            }
         }
      } catch (Exception var6) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error("Unable to read early Lunar options", var6);
      }
   }

   private static String HCHOIRHIIRCOHRROOHRIOHHHRCCCOH() {
      File var0 = new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI, "profile_manager.json");
      if (var0.exists()) {
         try (FileReader var1 = new FileReader(var0)) {
            JsonElement var2 = JsonParser.parseReader(var1);
            if (var2.isJsonArray()) {
               for (JsonElement var4 : var2.getAsJsonArray()) {
                  JsonObject var5 = var4.getAsJsonObject();
                  if (var5.get("active").getAsBoolean()) {
                     return var5.get("name").getAsString();
                  }
               }
            }
         } catch (Exception var9) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error(
               "Unable to read active profile name for early Lunar options", var9
            );
         }
      }

      return "Default";
   }

   public static boolean CCHOCHCRCRCICIHHOORCIHHCHRIRRI() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FASTER_PACK_LOADING
         .isEnabled();
   }
}
