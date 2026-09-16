package com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lunarclient.gameipc.browser.v1.OpenUrlRequest;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final AtomicBoolean RHOCOHCCIOHICOCIHCHOCHOHIHOOOR = new AtomicBoolean(false);
   private Set<com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HIHCRCHOOHRIORCOOHHHOOCRIRIOIR;
   private Set<com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> RRCORIRHIRROCCOHOHICCHIHCICHRC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      try {
         this.IROHIHHHRIIOOHOCOIHHRCOHOOHRIC();
      } catch (Exception var2) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error(
            "Unexpected error while fetching malicious data!", var2
         );
      }
   }

   private void IROHIHHHRIIOOHOCOIHHRCOHOOHRIC() {
      HttpRequest var1 = HttpRequest.newBuilder()
         .uri(URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.RHCCCIOHCRHIICRCHIOCHICHOHRCCR() + "/game/safety"))
         .header("X-Installation-Id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR)
         .header("X-Overwolf-Muid", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOROIOCCRCOROORRIOOOICRHHRIHHC)
         .GET()
         .build();
      HttpClient.newHttpClient()
         .sendAsync(var1, BodyHandlers.ofString())
         .thenAccept(
            var1x -> {
               JsonElement var2;
               try {
                  var2 = JsonParser.parseString(var1x.body());
               } catch (Exception var6) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error(
                     "Invalid JSON received for malicious data: " + var1x.body(), var6
                  );
                  return;
               }

               if (var2.isJsonObject()) {
                  JsonObject var3 = var2.getAsJsonObject();
                  HashSet var4 = new HashSet();
                  HashSet var5 = new HashSet();
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var3,
                     "maliciousServers",
                     (var1xx, var2x) -> var4.add(
                        new com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           var1xx, var2x
                        )
                     )
                  );
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var3,
                     "maliciousUrls",
                     (var1xx, var2x) -> {
                        try {
                           var5.add(
                              new com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 Pattern.compile(var1xx), var2x
                              )
                           );
                        } catch (Exception var4x) {
                           com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error(
                              String.format("Invalid regex '%s' in maliciousUrls list", var1xx), var4x
                           );
                        }
                     }
                  );
                  this.HIHCRCHOOHRIORCOOHHHOOCRIRIOIR = Set.copyOf(var4);
                  this.RRCORIRHIRROCCOHOHICCHIHCICHRC = Set.copyOf(var5);
                  this.RHOCOHCCIOHICOCIHCHOCHOHIHOOOR.set(true);
               }
            }
         );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var1,
      String var2,
      BiConsumer<String, com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var3
   ) {
      if (var1.has(var2) && var1.get(var2).isJsonArray()) {
         for (JsonElement var5 : var1.getAsJsonArray(var2)) {
            if (var5.isJsonObject()) {
               JsonObject var6 = var5.getAsJsonObject();
               if (var6.has("pattern") && var6.get("pattern").isJsonPrimitive() && var6.has("behaviour") && var6.get("behaviour").isJsonArray()) {
                  String var7 = var6.get("pattern").getAsString();
                  String var8 = var6.getAsJsonArray("behaviour").get(0).getAsString();

                  com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9;
                  try {
                     var9 = com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.valueOf(
                        var8
                     );
                  } catch (IllegalArgumentException var11) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.warn(
                        String.format("Invalid behaviour '%s' for pattern '%s'", var8, var7), var11
                     );
                     continue;
                  }

                  var3.accept(var7, var9);
               }
            }
         }
      }
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ORHIOICIOCRRHOOCOHRORIHICHRCRR var1, URI var2) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      String var4 = var2.toString();
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2,
         () -> {
            if (var3.bridge$getGameSettings().bridge$isChatPromptLinks()) {
               var3.bridge$displayScreen(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, var2, false)
               );
            } else {
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, OpenUrlRequest.Initiator.INITIATOR_UNSPECIFIED);
               var3.bridge$displayScreen(var1);
            }
         },
         () -> var3.bridge$displayScreen(var1)
      );
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URI var1, Runnable var2, Runnable var3) {
      String var4 = var1.toString();
      if (!this.RHOCOHCCIOHICOCIHCHOCHOHIHOOOR.get()) {
         return false;
      } else {
         Optional var5 = this.RRCORIRHIRROCCOHOHICCHIHCICHRC.stream().filter(var1x -> var1x.IROOCIIRICCORROHOIHIOCRRRCIHRH().matcher(var4).find()).findFirst();
         if (var5.isEmpty()) {
            return false;
         } else {
            com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = (com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5.get();
            com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = var6.IOHHIHOOCHOOHHHHRHIHHCIHHOCCHI();
            if (var7 == com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PROMPT
               && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                  .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                  .ICHIRCOCROHIHRHHHOHHOOCRCIOOIC()
                  .contains(var4)) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                     var4
                  ),
                  "safety.maliciousUrl.prompt",
                  var2,
                  var3
               );
               return true;
            } else if (var7 == com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BLOCK) {
               this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("safety.maliciousUrl.block", var3);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Runnable var2, Runnable var3) {
      if (!this.RHOCOHCCIOHICOCIHCHOCHOHIHOOOR.get()) {
         return false;
      } else {
         Optional var4 = this.HIHCRCHOOHRIORCOOHHHOOCRIRIOIR
            .stream()
            .filter(
               var1x -> com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR(
                  var1x.HHIOHCROORIRCOCICOCIHIIIHOCHIH(), var1
               )
            )
            .findFirst();
         if (var4.isEmpty()) {
            return false;
         } else {
            com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = (com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var4.get();
            com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = var5.IOHHIHOOCHOOHHHHRHIHHCIHHOCCHI();
            if (var6 == com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PROMPT
               && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                  .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                  .RRCIROIOHIOHCHIHCOORIOOOOROHRC()
                  .contains(var1)) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                     var1
                  ),
                  "safety.maliciousServer.prompt",
                  var2,
                  var3
               );
               return true;
            } else if (var6 == com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BLOCK) {
               this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("safety.maliciousServer.block", var3);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      String var2,
      Runnable var3,
      Runnable var4
   ) {
      IRRCCOICORICIHCHRHIHIHROIRHOCR var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCCRCICOCHOIHHHICIROOIOOCROCII();
      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$displayScreen(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "header"),
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "warning"),
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "confirmButton"),
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "denyButton"),
                  () -> {
                     var6.CIRCIIIHOCCOOIOCCOCRCIICHICHIO();
                     var3.run();
                  },
                  () -> {
                     var6.CIRCIIIHOCCOOIOCCOCRCIICHICHIO();
                     var4.run();
                  }
               )
         );
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, Runnable var2) {
      IRRCCOICORICIHCHRHIHIHROIRHOCR var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCCRCICOCHOIHHHICIROOIOOCROCII();
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         new com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
      );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$displayScreen(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(() -> {
                  var4.CIRCIIIHOCCOOIOCCOCRCIICHICHIO();
                  var2.run();
               }, var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "header"), var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "warning"))
         );
   }

   protected record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      private final Pattern HRCIIOIRHRIOORICOIOHHRRHOCIHIO;
      private final com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIRHRRCIOCOHCRIHOOCIRCHOORHOIH;

      protected HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         Pattern var1, com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
      ) {
         this.HRCIIOIRHRIOORICOIOHHRRHOCIHIO = var1;
         this.CIRHRRCIOCOHCRIHOOCIRCHOORHOIH = var2;
      }

      public Pattern IROOCIIRICCORROHOIHIOCRRRCIHRH() {
         return this.HRCIIOIRHRIOORICOIOHHRRHOCIHIO;
      }

      public com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOHHIHOOCHOOHHHHRHIHHCIHHOCCHI() {
         return this.CIRHRRCIOCOHCRIHOOCIRCHOORHOIH;
      }
   }

   protected record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final String HRRHOCHOHOHIIRROCHIRHHRCHIHCOH;
      private final com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHORIIROHHHIHCCRROIOORHOCHHHOO;

      protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         String var1, com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
      ) {
         this.HRRHOCHOHOHIIRROCHIRHHRCHIHCOH = var1;
         this.RHORIIROHHHIHCCRROIOORHOCHHHOO = var2;
      }

      public String HHIOHCROORIRCOCICOCIHIIIHOCHIH() {
         return this.HRRHOCHOHOHIIRROCHIRHHRCHIHCOH;
      }

      public com.moonsworth.lunar.client.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOHHIHOOCHOOHHHHRHIHHCIHHOCCHI() {
         return this.RHORIIROHHHIHCCRROIOORHOCHHHOO;
      }
   }

   protected enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      PROMPT,
      BLOCK;
   }
}
