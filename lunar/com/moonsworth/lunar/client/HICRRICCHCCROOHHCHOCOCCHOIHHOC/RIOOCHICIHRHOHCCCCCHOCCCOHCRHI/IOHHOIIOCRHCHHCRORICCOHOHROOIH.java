package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.common.hash.Hashing;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class IOHHOIIOCRHCHHCRORICCOHOHROOIH implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final Map<String, Component> CHCRIOHOCCOHHOHIIOOHRHCCIIIIHO = new HashMap<>();

   @Override
   public void init() {
      new Thread(
            () -> {
               Path var1 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHIRHHICRHCCHRHIIIOIRRROCRHRIH.resolve("vanilla_capes.json");
               if (var1.toFile().exists()) {
                  try {
                     String var2 = Files.readString(var1);

                     for (JsonElement var5 : com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
                        .fromJson(var2, JsonArray.class)) {
                        if (var5.isJsonObject()) {
                           JsonObject var6 = var5.getAsJsonObject();
                           this.CHCRIOHOCCOHHOHIIOOHRHCCIIIIHO
                              .put(
                                 var6.get("hash").getAsString(),
                                 RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    var6.get("name").getAsString(),
                                    IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.valueOf(var6.get("rarity").getAsString())
                                 )
                              );
                        }
                     }
                  } catch (Exception var7) {
                     com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var7, "Loading Vanilla Cape Data"
                     );
                  }
               }
            }
         )
         .start();
   }

   @Override
   public void close() {
   }

   public Optional<Component> RCOCRROHHROHHOCRCCCHCIROIIOORC(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var1
   ) {
      if (this.CHCRIOHOCCOHHOHIIOOHRHCCIIIIHO.isEmpty()) {
         return Optional.empty();
      }

      String[] var2 = var1.bridge$getPath().split("/");
      if (var2.length < 2) {
         return Optional.empty();
      }

      String var3 = var2[1];
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5) {
         var3 = Hashing.sha1().hashUnencodedChars(var3).toString();
      }

      return Optional.ofNullable(this.CHCRIOHOCCOHHOHIIOOHRHCCIIIIHO.get(var3));
   }

   private static Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      TextComponent var2 = Component.text(var0);
      switch (var1) {
         case UNCOMMON:
            var2 = (TextComponent)var2.color(TextColor.color(98, 214, 90));
            break;
         case RARE:
            var2 = (TextComponent)var2.color(TextColor.color(56, 194, 224));
            break;
         case EPIC:
            var2 = (TextComponent)var2.color(TextColor.color(179, 0, 224));
            break;
         case LEGENDARY:
            var2 = (TextComponent)var2.color(TextColor.color(255, 187, 0));
            break;
         case MOJANG:
            var2 = (TextComponent)var2.color(TextColor.color(224, 41, 43));
      }

      return var2;
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      COMMON,
      UNCOMMON,
      RARE,
      EPIC,
      LEGENDARY,
      MOJANG;
   }
}
