package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lunarclient.websocket.jam.v1.OwnedJam;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import lombok.Generated;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI,
   HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH HCIHCHCHHCORHHOHOIHROOCOCCIHHR = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private static final Map<Integer, com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RIRCIICROOHCRRHOICORHOHRRIIRCR = new HashMap<>();
   private final Map<UUID, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IHRRCOCHIHRROIHIORHRIOHIOCIHIH = new ConcurrentHashMap<>();
   private final Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IHCHCHRRIRICCCOROOOOIIRROIRIHO = new ConcurrentHashMap<>();
   private final Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RHOCCHCOCOCIRIICHIICRHHCIRHOCI = new ConcurrentHashMap<>();
   private final long HHORIIOHCHIHHIIRORCCHRCHORIRRR = 6600000L;
   private List<OwnedJam> HICIHCIHCCHORIOCHRHHRHOICHOHIR = new ArrayList<>();
   private final Logger RCICHIRCCICRHOCICRHICICICHICII = LogManager.getLogger(IRCIIHHICIHRCOCRROCOICRIHHCCHH.class.getName());

   private void IOHHOIIOCRHCHHCRORICCOHOHROOIH(Consumer<String> var1) {
      UUID var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile().getId();
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.IHRRCOCHIHRROIHIORHRIOHIOCIHIH.get(var2);
      if (var3 != null && var3.IHCCORIHIHHRHOROCCRROCIORHORRC > System.currentTimeMillis()) {
         var1.accept(var3.OHOROICORHIORCIHRIRRCIHRRIICIC);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO().isEmpty()) {
         var1.accept(null);
      } else {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .get()
            .RCRIHICRIIROCHHHHCROCRCHHRIIOI()
            .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               "GAME_STYNGR_JWT",
               var3x -> {
                  try {
                     this.RCICHIRCCICRHOCICRHICICICHICII.info("Fetching Styngr JWT...");
                     HttpRequest var4 = HttpRequest.newBuilder()
                        .uri(URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.RHCCCIOHCRHIICRCHIOCHICHOHRCCR() + "/styngr/jwt"))
                        .header("Content-Type", "application/json")
                        .header("x-installation-id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR)
                        .header("X-Overwolf-Muid", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOROIOCCRCOROORRIOOOICRHHRIHHC)
                        .header("Authorization", var3x)
                        .POST(BodyPublishers.ofString("{\"platform\": \"GAME\"}"))
                        .build();
                     HttpResponse var5 = HttpClient.newHttpClient().send(var4, BodyHandlers.ofString());
                     JsonObject var6 = JsonParser.parseString((String)var5.body()).getAsJsonObject();
                     String var7 = var6.get("styngrJwt").getAsString();
                     this.IHRRCOCHIHRROIHIORHRIOHIOCIHIH
                        .put(var2, new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, System.currentTimeMillis() + 6600000L));
                     var1.accept(var7);
                  } catch (Exception var8) {
                     this.RCICHIRCCICRHOCICRHICICICHICII.info("An error occurred while attempting to get a Styngr JWT: " + var8.getMessage());
                     var8.printStackTrace();
                  }
               }
            );
      }
   }

   private void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(String var1, Consumer<String> var2) {
      if (var1 == null) {
         var2.accept(null);
      } else {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.IHCHCHRRIRICCCOROOOOIIRROIRIHO.get(var1);
         if (var3 != null && var3.IHCCORIHIHHRHOROCCRROCIORHORRC > System.currentTimeMillis()) {
            var2.accept(var3.OHOROICORHIORCIHRIRRCIHRRIICIC);
         } else {
            try {
               this.RCICHIRCCICRHOCICRHICICICHICII.info("Fetching Styngr store token...");
               HttpRequest var4 = HttpRequest.newBuilder()
                  .uri(URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.HCOHOCCHRHOCCOIOOCIIHRHOHHRROC() + "/v2/sdk/tokens/sdkuser"))
                  .header("Content-Type", "application/json")
                  .header("Authorization", "Bearer " + var1)
                  .POST(BodyPublishers.noBody())
                  .build();
               HttpResponse var5 = HttpClient.newHttpClient().send(var4, BodyHandlers.ofString());
               JsonObject var6 = JsonParser.parseString((String)var5.body()).getAsJsonObject();
               String var7 = var6.get("accessToken").getAsString();
               this.IHCHCHRRIRICCCOROOOOIIRROIRIHO
                  .put(var1, new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, System.currentTimeMillis() + 6600000L));
               var2.accept(var7);
            } catch (Exception var8) {
               this.RCICHIRCCICRHOCICRHICICICHICII.info("An error occurred while attempting to get a Styngr Store Token: " + var8.getMessage());
               var8.printStackTrace();
            }
         }
      }
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(String var1, Consumer<String> var2) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.RHOCCHCOCOCIRIICHIICRHHCIRHOCI.get(var1);
      if (var3 != null && var3.IHCCORIHIHHRHOROCCRROCIORHORRC > System.currentTimeMillis()) {
         var2.accept(var3.OHOROICORHIORCIHRIRRCIHRRIICIC);
      } else {
         new Thread(
               () -> this.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
                  var3x -> this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     var3x,
                     var3xx -> {
                        try {
                           this.RCICHIRCCICRHOCICRHICICICHICII.info("Fetching styng url for styng_id: " + var1);
                           HttpRequest var4 = HttpRequest.newBuilder()
                              .uri(URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.HCOHOCCHRHOCCOIOOCIIHRHOHHRROC() + "/v1/sdk/styngs/" + var1 + "/play"))
                              .header("Content-Type", "application/json")
                              .header("Authorization", "Bearer " + var3xx)
                              .POST(BodyPublishers.noBody())
                              .build();
                           HttpResponse var5 = HttpClient.newHttpClient().send(var4, BodyHandlers.ofString());
                           JsonObject var6 = JsonParser.parseString((String)var5.body()).getAsJsonObject();
                           String var7 = var6.get("url").getAsString();
                           long var8 = Instant.parse(var6.get("expiresAt").getAsString()).toEpochMilli();
                           long var10 = var8 - System.currentTimeMillis();
                           IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              var7, (long)(System.currentTimeMillis() + var10 * 0.9)
                           );
                           this.RHOCCHCOCOCIRIICHIICRHHCIRHOCI.put(var1, var12);
                           var2.accept(var7);
                        } catch (Exception var13) {
                           this.RCICHIRCCICRHOCICRHICICICHICII.info("An error occurred while attempting to get styng url: " + var13.getMessage());
                           var13.printStackTrace();
                           var2.accept("");
                        }
                     }
                  )
               )
            )
            .start();
      }
   }

   @Override
   public void init() {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            var1 -> {
               this.IHRRCOCHIHRROIHIORHRIOHIOCIHIH.clear();
               this.IHCHCHRRIRICCCOROOOOIIRROIRIHO.clear();
               this.HCIHCHCHHCORHHOHOIHROOCOCCIHHR.clear();
            }
         );
      this.RCORCCHRHOIHRRRIHRCRRIIOHCHROI();
   }

   @Override
   public void close() {
   }

   private void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonArray var1) {
      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
         .fromJson(var1, com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[].class)) {
         RIRCIICROOHCRRHOICORHOHRRIIRCR.put(var5.getId(), var5);
      }
   }

   @Override
   public void load(JsonObject var1) {
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1.getAsJsonArray("jams"));
      this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      var1.add("jams", IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJsonTree(RIRCIICROOHCRRHOICORHOHRRIIRCR.values()));
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "jams.json";
   }

   public void RCORCCHRHOIHRRRIHRCRRIIOHCHROI() {
      try {
         HttpRequest var1 = HttpRequest.newBuilder()
            .uri(URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.RHCCCIOHCRHIICRCHIOCHICHOHRCCR() + "/styngr/jams"))
            .header("X-Installation-Id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR)
            .header("X-Overwolf-Muid", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOROIOCCRCOROORRIOOOICRHHRIHHC)
            .GET()
            .build();
         HttpClient.newHttpClient()
            .sendAsync(var1, BodyHandlers.ofString())
            .thenAccept(
               var1x -> {
                  JsonElement var2x;
                  try {
                     var2x = JsonParser.parseString(var1x.body());
                  } catch (Exception var6) {
                     var6.printStackTrace();
                     this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
                     return;
                  }

                  if (!var2x.isJsonArray()) {
                     this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
                  } else {
                     JsonObject var3 = new JsonObject();

                     try {
                        var3.add("jams", var2x.getAsJsonArray());
                        this.load(var3);
                     } catch (IOException var5) {
                        com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           var5, "Jams Processor - Download"
                        );
                        this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
                     }
                  }
               }
            );
      } catch (Exception var2) {
         var2.printStackTrace();
         this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
      }
   }

   public void CHRRCCOOHCCRRCIRRIOCIROCOOCIHO() {
      JsonArray var1 = new JsonArray();

      for (OwnedJam var3 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().OIOOIHRRCRIIOCCRROOOROOIOCCOHO().HRRIOCHRORRIIHCHCHOOOCHHCHORIC()) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = HCCIIOHOROCIICCOOORHCHRRCHROHC()
            .get(var3.getJamId());
         if (var4 != null) {
            JsonElement var5 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJsonTree(var4);
            if (var3.hasGiftInfo()) {
               CRRRICCRROCOHHOHIICIHORCOORRRH var6 = new CRRRICCRROCOHHOHIICIHORCOORRRH(
                  CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.getGiftInfo().getGiftedBy().getUuid()),
                  var3.getGiftInfo().getGiftedBy().getUsername(),
                  var3.getGiftInfo().getMessage(),
                  var3.getGiftInfo().getIsAnonymous()
               );
               var5.getAsJsonObject().add("gifter", var6.provide());
            }

            var1.add(var5);
         }
      }

      this.HCIHCHCHHCORHHOHOIHROOCOCCIHHR.IIHRRHORCRCROCHHOHORCHCROCIHRO("items", var1);
   }

   @Generated
   @Override
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.HCIHCHCHHCORHHOHOIHROOCOCCIHHR;
   }

   @Generated
   public static Map<Integer, com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HCCIIOHOROCIICCOOORHCHRRCHROHC() {
      return RIRCIICROOHCRRHOICORHOHRRIIRCR;
   }

   @Generated
   public List<OwnedJam> HRRIOCHRORRIIHCHCHOOOCHHCHORIC() {
      return this.HICIHCIHCCHORIOCHRHHRHOICHOHIR;
   }

   @Generated
   public void OHRRIORRCRIRORHRIOOCORIIRRRRRO(List<OwnedJam> var1) {
      this.HICIHCIHCCHORIOCHRHHRHOICHOHIR = var1;
   }

   record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String OHOROICORHIORCIHRIRRCIHRRIICIC;
      private final long IHCCORIHIHHRHOROCCRROCIORHORRC;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, long var2) {
         this.OHOROICORHIORCIHRIRRCIHRRIICIC = var1;
         this.IHCCORIHIHHRHOROCCRROCIORHORRC = var2;
      }

      public String value() {
         return this.OHOROICORHIORCIHRIRRCIHRRIICIC;
      }

      public long HOICRORIIHCOOCIICIICOCCHHOHHIH() {
         return this.IHCCORIHIHHRHOROCCRROCIORHORRC;
      }
   }
}
