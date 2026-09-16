package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import lombok.Generated;

public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final String IHHHICORCOIOIOCOCRIOROCHROHIOO;
   private final Map<String, String> CCOROHHHCOHORORHCIHRHHHHRRCCOR = new HashMap<>();
   private final Map<String, Integer> IROHRORCIOOCOCHRIOIOIOROROHHHR = new HashMap<>();
   private boolean loaded = false;

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var1) {
      this.IHHHICORCOIOIOCOCRIOROCHROHIOO = var1;
   }

   protected abstract boolean IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(JsonObject var1);

   public void init() {
      String var1 = "tier-tagger.json";
      Path var2 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHIRHHICRHCCHRHIIIOIRRROCRHRIH.resolve(var1);
      if (!var2.toFile().exists()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Unable to load %s, file doesn't exist", var1
         );
      } else {
         String var3 = Files.readString(var2);
         JsonElement var4 = JsonParser.parseString(var3);
         if (!var4.isJsonObject()) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Unable to load %s, not a json object", var1
            );
         } else {
            JsonObject var5 = var4.getAsJsonObject();
            this.loaded = this.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var5);
         }
      }
   }

   @Nullable
   public String RRHCOHIOHRCIIOROOHOCOOOCHOHOIH(String var1) {
      return this.CCOROHHHCOHORORHCIHRHHHHRRCCOR.get(var1.toLowerCase(Locale.ROOT));
   }

   public int HORIRRHCOHOHHRIRHRIOIIRCCHRHCO(String var1) {
      return this.IROHRORCIOOCOCHRIOIOIOROROHHHR.getOrDefault(var1.toLowerCase(Locale.ROOT), 16777215);
   }

   protected void RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(JsonObject var1) {
      if (!var1.has("gameModeData")) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "No game mode data for %s", this.IHHHICORCOIOIOCOCRIOROCHROHIOO
         );
      } else {
         var1 = var1.getAsJsonObject("gameModeData");

         for (String var3 : var1.keySet()) {
            JsonObject var4 = var1.getAsJsonObject(var3);
            String var5 = this.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var4);
            Integer var6 = this.IOHIHIIHCCCCCIHRORIOIOORCIOHII(var4);
            if (var5 != null) {
               this.CCOROHHHCOHORORHCIHRHHHHRRCCOR.put(var3.toLowerCase(Locale.ROOT), var5);
            } else {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Missing icon for %s for %s", var3, this.IHHHICORCOIOIOCOCRIOROCHROHIOO
               );
            }

            if (var6 != null) {
               this.IROHRORCIOOCOCHRIOIOIOROROHHHR.put(var3.toLowerCase(Locale.ROOT), var6);
            } else {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Missing color for %s for %s", var3, this.IHHHICORCOIOIOCOCRIOROCHROHIOO
               );
            }
         }

         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "[%s] Loaded %s icons, %s colors",
            this.IHHHICORCOIOIOCOCRIOROCHROHIOO,
            this.CCOROHHHCOHORORHCIHRHHHHRRCCOR.size(),
            this.IROHRORCIOOCOCHRIOIOIOROROHHHR.size()
         );
      }
   }

   protected List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> OIHCOHRCICCCRHRCROOCIOIRRHHHIH(JsonObject var1) {
      ArrayList var2 = new ArrayList();

      for (String var4 : var1.keySet()) {
         var2.add(
            new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var4, var1.get(var4).getAsString(), Optional.ofNullable(this.RRHCOHIOHRCIIOROOHOCOOOCHOHOIH(var4)), this.HORIRRHCOHOHHRIRHRIOIIRCCHRHCO(var4)
            )
         );
      }

      return var2;
   }

   @Nullable
   protected String ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(JsonObject var1) {
      if (!var1.has("icon")) {
         return null;
      }

      JsonElement var2 = var1.get("icon");
      String var3 = null;
      if (var2.isJsonObject()) {
         JsonObject var4 = var2.getAsJsonObject();
         if (var4.has("minVersion")) {
            String var5 = var4.get("minVersion").getAsString();
            Optional var6 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.get(var5);
            if (var6.isEmpty()) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Invalid MinecraftVersion? %s", var5
               );
               var6 = Optional.of(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOCOHCHCCRHCCIOIOOCHROIOCCOCIR);
            }

            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
               >= ((com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var6.get()).getOrdinal()) {
               var3 = var4.get("value").getAsString();
            } else if (var4.has("orElse")) {
               var3 = var4.get("orElse").getAsString();
            } else {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Missing 'orElse' in icon object"
               );
            }
         } else {
            var3 = var4.get("value").getAsString();
         }
      } else {
         var3 = var2.getAsString();
      }

      return var3;
   }

   @Nullable
   protected Integer IOHIHIIHCCCCCIHRORIOIOORCIOHII(JsonObject var1) {
      if (var1.has("color")) {
         String var2 = var1.get("color").getAsString();
         return OCOHORHCROHICRRIHCIHHRRCIHICRI.ICIIOHIRRHRORROIIHCIRCIIOIHCHR(var2);
      } else {
         return null;
      }
   }

   @Generated
   public boolean isLoaded() {
      return this.loaded;
   }
}
