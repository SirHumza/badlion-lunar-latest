package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonObject;
import com.lunarclient.websocket.serverdiscovery.v1.DiscoverServersRequest;
import com.lunarclient.websocket.serverdiscovery.v1.LoadAutocompleteSuggestionsRequest;
import com.lunarclient.websocket.serverdiscovery.v1.LoadServerModalRequest;
import com.lunarclient.websocket.serverdiscovery.v1.LoginResponse;
import com.lunarclient.websocket.serverdiscovery.v1.SearchServersRequest;
import com.lunarclient.websocket.serverdiscovery.v1.ServerDiscoveryService;
import com.lunarclient.websocket.serverdiscovery.v1.ServerSectionCardsPush;
import com.lunarclient.websocket.serverdiscovery.v1.TrackSectionNotInterestedRequest;
import com.lunarclient.websocket.serverdiscovery.v1.TrackServerJoinRequest;
import com.moonsworth.lunar.client.util.CHRCRHHRCCOICCOOIIRIOHCOHCHHIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class OIHCOHRCICCCRHRCROOCIOIRRHHHIH implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private static final String ICOOIHORHICROOCHORHCCOCOOCOHHC = "serverDiscovery:sectionCards";
   private volatile int ICHOHHRCOOHOHIIIRORIHIHRRCCHII;
   @Nullable
   private volatile HHCCIRHCCCIIRHCROHIORHIRHHIORH IOIIIOHRHHHRHOIOIORICROIOIHICR;
   private volatile List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> RRRHHROIOOOIHHCRCOHORRHCCROHHO = List.of();
   private volatile com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HHORHHHHCCOIRCOOCIRCOCIIORCCOO = com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED;

   @Override
   public void close() {
      this.ICHOHHRCOOHOHIIIRORIHIHRRCCHII = 0;
      this.IOIIIOHRHHHRHOIOIORICROIOIHICR = null;
      this.RRRHHROIOOOIHHCRCOHORRHCCROHHO = List.of();
      this.HHORHHHHCCOIRCOOCIRCOCIIORCCOO = com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED;
   }

   @Override
   public void init() {
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(LoginResponse var1) {
      this.ICHOHHRCOOHOHIIIRORIHIHRRCCHII = var1.getTotalServers();
      this.IOIIIOHRHHHRHOIOIORICROIOIHICR = var1.hasAnnouncement()
         ? com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1.getAnnouncement()
         )
         : null;
      this.RRRHHROIOOOIHHCRCOHORRHCCROHHO = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getGameTypesList(),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
      this.HHORHHHHCCOIRCOOCIRCOCIIORCCOO = com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.READY;
   }

   public void CHCCOIRIORCCOCHCCOCRCHOHCORHII() {
      this.HHORHHHHCCOIRCOOCIRCOCIIORCCOO = com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED;
   }

   public JsonObject RHHROHCHCIIHCHICOCHHCCIOOIRIOH() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("state", this.HHORHHHHCCOIRCOOCIRCOCIIORCCOO.getId());
      var1.addProperty("totalServers", this.ICHOHHRCOOHOHIIIRORIHIHRRCCHII);
      var1.add(
         "announcement",
         com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJsonTree(this.IOIIIOHRHHHRHOIOIORICROIOIHICR)
      );
      var1.add(
         "gameTypes",
         com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJsonTree(this.RRRHHROIOOOIHHCRCOHORRHCCROHHO)
      );
      return var1;
   }

   public void IHICORCROOROHCIHIHCOIHRRHICICO(
      Consumer<List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH>> var1
   ) {
      if (this.RICOCRIHROHOCHHCHCIIIOHHHRICHH() == null) {
         var1.accept(List.of());
      } else {
         this.RICOCRIHROHOCHHCHCIIIOHHHRICHH()
            .discoverServers(
               null,
               DiscoverServersRequest.getDefaultInstance(),
               var1x -> var1.accept(
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1x.getSectionsList(),
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
                  )
               )
            );
      }
   }

   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      String var1,
      Consumer<List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH>> var2
   ) {
      if (this.RICOCRIHROHOCHHCHCIIIOHHHRICHH() == null) {
         var2.accept(List.of());
      } else {
         this.RICOCRIHROHOCHHCHCIIIOHHHRICHH()
            .searchServers(
               null,
               SearchServersRequest.newBuilder().setQuery(var1 == null ? "" : var1).build(),
               var1x -> var2.accept(
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1x.getServersList(),
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
                  )
               )
            );
      }
   }

   public void HCHRIROHHHCORIOCROOCHRCIOROOCI(
      Consumer<List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>> var1
   ) {
      if (this.RICOCRIHROHOCHHCHCIIIOHHHRICHH() == null) {
         var1.accept(List.of());
      } else {
         this.RICOCRIHROHOCHHCHCIIIOHHHRICHH()
            .loadAutocompleteSuggestions(
               null,
               LoadAutocompleteSuggestionsRequest.getDefaultInstance(),
               var1x -> var1.accept(
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1x.getSuggestionsList(),
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
                  )
               )
            );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      Consumer<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> var2,
      Runnable var3
   ) {
      if (var1 != null && !var1.isEmpty() && this.RICOCRIHROHOCHHCHCIIIOHHHRICHH() != null) {
         this.RICOCRIHROHOCHHCHCIIIOHHHRICHH()
            .loadServerModal(
               null,
               LoadServerModalRequest.newBuilder().setServerMappingsId(var1).build(),
               var2x -> {
                  if (var2x != null && var2x.hasDetails()) {
                     var2.accept(
                        com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           var2x.getDetails()
                        )
                     );
                  } else {
                     var3.run();
                  }
               }
            );
      } else {
         var3.run();
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ServerSectionCardsPush var1) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
      if (var2 != null) {
         JsonObject var3 = new JsonObject();
         var3.addProperty("sectionId", var1.getSectionId());
         var3.add(
            "cards",
            com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
               .toJsonTree(
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1.getCardsList(),
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
                  )
               )
         );
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.COIHRHIHIHIIRCCOHOIHHOOIRRCOII().HHIICHIOCCIICOCROHHHOCIRCOHROO(), "serverDiscovery:sectionCards", var3);
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, String var2, String var3, String var4, String var5) {
      if (var4 != null && !var4.isEmpty()) {
         this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1, var2, var5);
         this.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var3 != null && !var3.isEmpty() ? var3 : var4, var4);
      }
   }

   public void RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(String var1, String var2) {
      if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isEmpty()) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$submit(
               () -> {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var2x = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .HROHCRIOCIHCORHOHIOCIHOHHCIIRH();
                  var2x.bridge$load();
                  if (var2x.bridge$containsUnpinnedAddress(var2)) {
                     com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .CIICCRHHHOHOIOHCHRHOORCICRCORC("Server is already saved");
                  } else {
                     var2x.bridge$add(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, false)
                     );
                     var2x.bridge$save();
                     com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .CIICCRHHHOHOIOHCHRHOORCICRCORC("Saved " + var1 + " to your servers!");
                  }
               }
            );
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, Runnable var2) {
      if (var1 != null && !var1.isEmpty() && this.RICOCRIHROHOCHHCHCIIIOHHHRICHH() != null) {
         this.RICOCRIHROHOCHHCHCIIIOHHHRICHH()
            .trackSectionNotInterested(null, TrackSectionNotInterestedRequest.newBuilder().setId(var1).build(), var1x -> var2.run());
      } else {
         var2.run();
      }
   }

   private void CORCOCICIRIOHROHROIIOOHICCHCRR(String var1, String var2, String var3) {
      if (this.RICOCRIHROHOCHHCHCIIIOHHHRICHH() != null) {
         this.RICOCRIHROHOCHHCHCIIIOHHHRICHH()
            .trackServerJoin(
               null,
               TrackServerJoinRequest.newBuilder()
                  .setSectionId(var3 == null ? "" : var3)
                  .setCardServerMappingsId(var2 == null ? "" : var2)
                  .setCardRecommendationId(var1 == null ? "" : var1)
                  .build(),
               var0 -> {}
            );
      }
   }

   private void RRHOOOORORHHOOIHRCCHIIHHIIIIOH(String var1, String var2) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> {
               CHRCRHHRCCOICCOOIIRIOHCOHCHHIC.OOCHCRIRHOHRCIHHRCROOOIHCCOCIR();
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(null);
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2x = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, false);
               com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .OORRROHOHHOOROORRRCCCOCCOOCCHI()
                  .RCCOHRIIRRIHHHHCRIOHRHRRHIOIOH()
                  .get(var2);
               if (var3 != null && var3.name().equals(var1)) {
                  var2x.bridge$setIsPinned(true);
                  com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                     .OORRROHOHHOOROORRRCCCOCCOOCCHI()
                     .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2x);
               }

               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$connect(var2x, null);
            }
         );
   }

   private ServerDiscoveryService.Interface RICOCRIHROHOCHHCHCIIIOHHHRICHH() {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().RCOIHOICHRIIHOCCCIHRRHHRROORCR() == null
         ? null
         : com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .RCOIHOICHRIIHOCCCIHRRHHRROORCR()
            .ROOCHOCCIHCIIIRHHCROCIHHCICOIH();
   }

   private static <P, M> List<M> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<P> var0, Function<P, M> var1) {
      ArrayList var2 = new ArrayList(var0.size());

      for (Object var4 : var0) {
         var2.add(var1.apply(var4));
      }

      return var2;
   }

   @Generated
   public int getTotalServers() {
      return this.ICHOHHRCOOHOHIIIRORIHIHRRCCHII;
   }

   @Nullable
   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH CHHCCIRHOIOIHRHICRHIHOHROICRRI() {
      return this.IOIIIOHRHHHRHOIOIORICROIOIHICR;
   }

   @Generated
   public List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> HOICOCOCOCOROCHIIOHRHRHOHIRCOI() {
      return this.RRRHHROIOOOIHHCRCOHORRHCCROHHO;
   }

   @Generated
   public com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RIORCRCRIOICHIHHRHICCHRIIIHOCC() {
      return this.HHORHHHHCCOIRCOOCIRCOCIIORCCOO;
   }
}
