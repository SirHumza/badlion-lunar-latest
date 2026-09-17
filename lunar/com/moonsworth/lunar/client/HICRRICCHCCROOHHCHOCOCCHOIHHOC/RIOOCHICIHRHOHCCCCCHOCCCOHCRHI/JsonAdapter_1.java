package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lunarclient.gameipc.browser.v1.OpenUrlRequest;
import com.lunarclient.gameipc.store.v1.StartStorePreviewSessionPush;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jspecify.annotations.Nullable;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Void>
   implements com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final int ICIOHRIHIHHHIOHHHCIIIOOCIIIRRO = 2;
   private static final int RICIHCIIIOCOCCIRCOHCCHORHCCHOC = 4;
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH COOIIROHHOIOHIOIHROHHCICHROIII = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private List<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ICORIOCCHROHHIOCORRIOCRRCHRRIC = null;
   private com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CICHCROROHHRRIRCIIHHRRCIRIRRRI = null;
   private boolean CHIIRCIOHCORHOOOIHIOIOOHCCICIO;
   private boolean RCHIHCHCCICICCRRRHRCRHCHIIRHCR;
   private int CIHOIORIHOHOROHCICOOOOHHHIOIRI;

   @Override
   protected Set<Void> ORRHHOHHRICCROHHICIOOHOOCRRRCC() {
      return new HashSet<>();
   }

   @Override
   public void init() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.class,
         var1 -> {
            if (var1.RCORHIHICHCOORRRHCHCRICCHICOOO() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR
               )
             {
               if (this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO
                  && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() == null
                  && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer() == null) {
                  this.RHOIOOROOHCOHIRHCRCRRCIRIHCCRC();
               }
            } else {
               if (this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO
                  && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
                  && var1.RCORHIHICHCOORRRHCHCRICCHICOOO() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO
                  )
                {
                  var1.cancel();
                  if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                        .HHOCRICRHROCOORCHIOOOCRHCCCCCR()
                     == com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OIIRHOHOHOHHHHCCOHROOICOCHOCCI
                     )
                   {
                     com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                        .OHCRORCOIOCCCHOHHCIICCRHOORCIR()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.NULL
                        );
                  } else {
                     com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                        .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OIIRHOHOHOHHHHCCOHROOICOCHOCCI
                        );
                  }
               }
            }
         }
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         var1 -> {
            if (this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO) {
               this.HIICRHCOOHIIOIRCCCORCRCIRORHHO();
            }
         }
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
         var1 -> {
            if (this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer() == null) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Preview", "Preview session survived into another world, ending it"
               );
               this.HIICRHCOOHIIOIRCCCORCRCIRORHHO();
            }

            if (this.RCHIHCHCCICICCRRRHRCRHCHIIRHCR && this.CIHOIORIHOHOROHCICOOOOHHHIOIRI < 4) {
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() == null
                  && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer() == null) {
                  this.CIHOIORIHOHOROHCICOOOOHHHIOIRI++;
                  this.RCHIHCHCCICICCRRRHRCRHCHIIRHCR = !IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$deleteWorld(IHCOHROICCHROOIHCOIOOHOCOHCHCI());
                  if (this.RCHIHCHCCICICCRRRHRCRHCHIIRHCR && this.CIHOIORIHOHOROHCICOOOOHHHIOIRI >= 4) {
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .ORCOCORROHIROCCIORORRRRCHIOOCH(
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                              "storePreviewTitle"
                           ),
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                              "storePreviewWorldNotRemoved"
                           )
                        );
                  }
               }
            }
         }
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         var1 -> {
            if (var1.CCICCIOCIHOOIHCIRCHHHRROHIHHIH()
                  == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_ESCAPE
               && var1.COCHHOHRHIHICIHOHHHHICHRIIHCRI()
                  == com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOWN
               && this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO
               && com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                     .HHOCRICRHROCOORCHIOOOCRHCCCCCR()
                  == com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OIIRHOHOHOHHHHCCOHROOICOCHOCCI
               )
             {
               com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                  .OHCRORCOIOCCCHOHHCIICCRHOORCIR()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.NULL
                  );
            }
         }
      );
   }

   public void COIRRRCIORROCHIROCHROCHICCICIC(
      List<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
   ) {
      if (this.ICORIOCCHROHHIOCORRIOCRRCHRRIC == null) {
         this.ICORIOCCHROHHIOCORRIOCRRCHRRIC = new ArrayList<>();
      }

      for (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : var1) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
      }

      if (this.ICORIOCCHROHHIOCORRIOCRRCHRRIC.isEmpty()) {
         this.ICORIOCCHROHHIOCORRIOCRRCHRRIC = null;
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .ORCOCORROHIROCCIORORRRRCHIOOCH(
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewTitle"
               ),
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewEmpty"
               )
            );
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Preview", "Store preview session had no cosmetics to show."
         );
         this.RRICCIIIHIRCCIORROIRHRCCRCIOIH();
      } else {
         this.RRICCIIIHIRCCIORROIRHRCCRCIOIH();
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
         if (var4 != null) {
            var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIHHHROOICOROOOHCHRCOHROCCHCI
            );
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      for (int var2 = 0; var2 < this.ICORIOCCHROHHIOCORRIOCRRCHRRIC.size(); var2++) {
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.ICORIOCCHROHHIOCORRIOCRRCHRRIC
            .get(var2);
         if (var3.IIROCCRRRCHICCRRRIIHOROOIHCCRH() == var1.IIROCCRRRCHICCRRRIIHOROOIHCCRH()) {
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var3.id(),
               var1.IIROCCRRRCHICCRRRIIHOROOIHCCRH(),
               var1.name(),
               var1.HOROORCICHORRIRHHRIIICIIIIORHC(),
               var1.HOHOOCIICOHHOORORIRHOOIRIOROHR(),
               var1.HIRHCICIOHCRCRHCICIIOOCIOOHCHR(),
               var1.OROROHICRCOIIHHOOOOCRRRRCIOHIH()
            );
            this.ICORIOCCHROHHIOCORRIOCRRCHRRIC.set(var2, var4);
            if (this.CICHCROROHHRRIRCIIHHRRCIRIRRRI != null
               && this.CICHCROROHHRRIRCIIHHRRCIRIRRRI.IIROCCRRRCHICCRRRIIHOROOIHCCRH() == var1.IIROCCRRRCHICCRRRIIHOROOIHCCRH()) {
               this.CICHCROROHHRRIRCIIHHRRCIRIRRRI = var4;
            }

            return;
         }
      }

      this.ICORIOCCHROHHIOCORRIOCRRCHRRIC.add(var1);
   }

   public void IOOHCIRHHOCRRHHOHORHCCIROHIICO() {
      if (this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO && this.ICORIOCCHROHHIOCORRIOCRRCHRRIC != null && !this.ICORIOCCHROHHIOCORRIOCRRCHRRIC.isEmpty()) {
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
         if (var1 != null) {
            if (var1.HHOCRICRHROCOORCHIOOOCRHCCCCCR()
               == com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OIIRHOHOHOHHHHCCOHROOICOCHOCCI
               )
             {
               var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OIIRHCIIOOOORRRORIICHOCOHCROIR
               );
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(null);
            }

            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIHHHROOICOROOOHCHRCOHROCCHCI
            );
         }
      }
   }

   public void IOHHRRIIOIRICROIROORCRRRHHRRHI() {
      if (!this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO) {
         this.ICORIOCCHROHHIOCORRIOCRRCHRRIC = null;
         this.CICHCROROHHRRIRCIIHHRRCIRIRRRI = null;
         this.RRICCIIIHIRCCIORROIRHRCCRCIOIH();
      }
   }

   public void IOCIIROIRCOHIRHHHROHCOOHIICIHI(UUID var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().ICRIOCOOICRIIIRIHIRIOIHCOHHIIC().HHRIIIRIRIICRRHHICOHIHICHHRCRR()) {
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORORCIORRICORCHRRCCHHRRHROORRI();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .CIICCRHHHOHOIOHCHRHOORCICRCORC(
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewLogin"
               )
            );
      } else if (this.ICORIOCCHROHHIOCORRIOCRRCHRRIC != null) {
         if (!this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO || IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
            this.CICHCROROHHRRIRCIIHHRRCIRIRRRI = this.ICORIOCCHROHHIOCORRIOCRRCHRRIC
               .stream()
               .filter(var1x -> var1x.id().equals(var1))
               .findFirst()
               .orElse(null);
            if (this.CICHCROROHHRRIRCIIHHRRCIRIRRRI != null) {
               ORHIOICIOCRRHOOCOHRORIHICHRCRR var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCRIIICORIICOIIOHIIHICCCOCRICC();
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHICORCROOROHCIHIHCOIHRRHICICO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getSession();
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
                  if (this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO) {
                     com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                        .RICIHCRIIOIHRIOOIOCOROHCICIRRO();
                     com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                        .OHCRORCOIOCCCHOHHCIICCRHOORCIR()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.NULL
                        );
                     if (var3 != null) {
                        UUID var6 = var3.bridge$getProfile().getId();
                        List var5 = this.IRICICCHCHHRCIHOCCCRICHHOHIRRH();
                        var2.CRRRICCRROCOHHOHIICIHORCOORRRH(var6, var5);
                        if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null) {
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .IOHRIRCHOCIOIOIHIHOCCCHOHOHOCH()
                              .ORHIOICIOCRRHOOCOHRORIHICHRCRR(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
                        }
                     }

                     this.RRICCIIIHIRCCIORROIRHRCCRCIOIH();
                  }
               } else {
                  if (var3 != null) {
                     List var4 = this.IRICICCHCHHRCIHOCCCRICHHOHIRRH();
                     var2.CRRRICCRROCOHHOHIICIHORCOORRRH(var3.bridge$getProfile().getId(), var4);
                  }

                  this.RCHIHCHCCICICCRRRHRCRHCHIIRHCR = !IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$deleteWorld(IHCOHROICCHROOIHCOIOOHOCOHCHCI());
                  this.CIHOIORIHOHOROHCICOOOOHHHIOIRI = 0;
                  this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO = true;
                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                     .RICIHCRIIOIHRIOOIOCOROHCICIRRO();
                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                     .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OIIRHCIIOOOORRRORIICHOCOHCROIR
                     );
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$joinWorld(
                        "Cosmetic Preview World",
                        IHCOHROICCHROOIHCOIOOHOCOHCHCI(),
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                           .CHRHCRCCIICRORCOHCORHRROIHRCHO("Cosmetic Preview World"),
                        this::RHOIOOROOHCOHIRHCRCRRCIRIHCCRC
                     );
                  this.RRICCIIIHIRCCIORROIRHRCCRCIOIH();
               }
            }
         }
      }
   }

   private void RHOIOOROOHCOHIRHCRCRRCIRIHCCRC() {
      if (this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Preview", "Could not open the preview world %s", IHCOHROICCHROOIHCOIOOHOCOHCHCI()
         );
         this.HIICRHCOOHIIOIRCCCORCRCIRORHHO();
         this.RCHIHCHCCICICCRRRHRCRHCHIIRHCR = false;
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().ICICIOCHHHIHOCHCOHORIHRCOHHOCR(true);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .ORCOCORROHIROCCIORORRRRCHIOOCH(
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewTitle"
               ),
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewWorldFailed"
               )
            );
      }
   }

   public void CCRHOICIRORRHOOOCIHHHHCHCICHOH(UUID var1) {
      if (this.ICORIOCCHROHHIOCORRIOCRRCHRRIC != null) {
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.ICORIOCCHROHHIOCORRIOCRRCHRRIC
            .stream()
            .filter(var1x -> var1x.id().equals(var1))
            .findFirst()
            .orElse(null);
         if (var2 != null) {
            String var3 = "https://store.lunarclient.com/checkout/instant?package=" + var2.IIROCCRRRCHICCRRRIIHOROOIHCCRH() + "&addedVia=game-package-preview";
            com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var3, OpenUrlRequest.Initiator.INITIATOR_STORE_PREVIEW
            );
         }
      }
   }

   public void HIICRHCOOHIIOIRCCCORCRCIRORHHO() {
      if (this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHICORCROOROHCIHIHCOIHRRHICICO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getSession();
         if (var1 != null) {
            ORHIOICIOCRRHOOCOHRORIHICHRCRR var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCRIIICORIICOIIOHIIHICCCOCRICC();
            var2.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.bridge$getProfile().getId(), null);
            var2.IHRHOIHHCIRHICOCOORRHOOCIRRRIH();
         }

         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
         if (var3 != null) {
            var3.RICIHCRIIOIHRIOOIOCOROHCICIRRO();
         }

         this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO = false;
         this.CICHCROROHHRRIRCIIHHRRCIRIRRRI = null;
         this.ICORIOCCHROHHIOCORRIOCRRCHRRIC = null;
         this.RCHIHCHCCICICCRRRHRCRHCHIIRHCR = true;
         this.CIHOIORIHOHOROHCICOOOOHHHIOIRI = 0;
         this.RRICCIIIHIRCCIORROIRHRCCRCIOIH();
      }
   }

   private List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> IRICICCHCHHRCIHOCCCRICHHOHIRRH() {
      ArrayList var1 = new ArrayList();
      CORCOCICIRIOHROHROIIOOHICCHCRR var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HCCICHCRRIICICCHCIRCRRIIRROHHC();
      if (this.CICHCROROHHRRIRCIIHHRRCIRIRRRI != null && this.CICHCROROHHRRIRCIIHHRRCIRIRRRI.HOROORCICHORRIRHHRIIICIIIIORHC() != null) {
         Integer[] var3 = this.CICHCROROHHRRIRCIIHHRRCIRIRRRI.HOROORCICHORRIRHHRIIICIIIIORHC();
         int var4 = var3.length;

         for (int var5 = 0; var5 < var4; var5++) {
            int var6 = var3[var5];
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var6, new JsonObject()
            );
            if (var7 != null) {
               var1.add(var7);
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(StartStorePreviewSessionPush var1) {
      if (this.IRCOHRRIHOICIRCHCCORCHORRRRCCO()) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .ORCOCORROHIROCCIORORRRRCHIOOCH(
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewTitle"
               ),
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewLoading"
               )
            );
         CompletableFuture var2;
         if (var1.getPackageId() != 0) {
            var2 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPackageId(), var1.getBasketIdent(), var1.getCurrency()).thenApply(var0 -> {
               ArrayList var1x = new ArrayList();
               if (var0 != null) {
                  var1x.add(var0);
               }

               return var1x;
            });
         } else {
            var2 = this.OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(var1.getBasketIdent(), var1.getCurrency());
         }

         var2.thenAcceptAsync(
               var1x -> {
                  if (this.IRCOHRRIHOICIRCHCCORCHORRRRCCO()) {
                     this.COIRRRCIORROCHIROCHROCHICCICIC(
                        (List<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>)var1x
                     );
                  }
               },
               ORCOCORROHIROCCIORORRRRCHIOOCH.ICOHCOIOCHHIRIHCCCRICHCCIOIORR()
            )
            .exceptionally(
               var0 -> {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "Preview", "Failed to start preview session: " + var0.getMessage()
                  );
                  return null;
               }
            );
      }
   }

   private boolean IRCOHRRIHOICIRCHCCORCHORRRRCCO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null && !this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .ORCOCORROHIROCCIORORRRRCHIOOCH(
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewTitle"
               ),
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "storePreviewInWorld"
               )
            );
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Preview", "Cosmetics cannot be previewed while in a world."
         );
         return false;
      } else {
         return true;
      }
   }

   private CompletableFuture<List<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(
      String var1, String var2
   ) {
      if (var1.isEmpty()) {
         return CompletableFuture.completedFuture(Collections.emptyList());
      }

      HttpRequest var3 = HttpRequest.newBuilder()
         .uri(URI.create(com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI.RHCCCIOHCRHIICRCHIOCHICHOHRCCR() + "/store/basket/info"))
         .header("X-Basket-Ident", var1)
         .GET()
         .build();
      return HttpClient.newHttpClient()
         .sendAsync(var3, BodyHandlers.ofString())
         .thenCompose(
            var3x -> {
               try {
                  JsonObject var4 = JsonParser.parseString(var3x.body()).getAsJsonObject();
                  JsonObject var5 = var4.getAsJsonObject("basket");
                  JsonArray var6 = var5.getAsJsonArray("items");
                  List var7 = var6.asList()
                     .stream()
                     .map(var0 -> var0.getAsJsonObject().get("id").getAsInt())
                     .map(var3xx -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3xx, var1, var2))
                     .toList();
                  return CompletableFuture.allOf(var7.toArray(CompletableFuture[]::new))
                     .thenApply(var1xx -> var7.stream().map(CompletableFuture::join).filter(Objects::nonNull).collect(Collectors.toList()));
               } catch (Exception var8) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "Preview", "Failed to parse basket response: " + var8.getMessage()
                  );
                  return CompletableFuture.completedFuture(Collections.emptyList());
               }
            }
         )
         .exceptionally(
            var0 -> {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Preview", "Failed to load basket: " + var0.getMessage()
               );
               return Collections.emptyList();
            }
         );
   }

   private CompletableFuture<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1, String var2, String var3
   ) {
      if (var1 == 0) {
         return CompletableFuture.completedFuture(null);
      }

      Builder var4 = HttpRequest.newBuilder()
         .uri(URI.create(com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI.RHCCCIOHCRHIICRCHIOCHICHOHRCCR() + "/store/package/" + var1 + "/info"))
         .header("X-Basket-Ident", var2)
         .GET();
      if (!var3.isEmpty()) {
         var4.header("X-Currency-Code", var3);
      }

      HttpRequest var5 = var4.build();
      return HttpClient.newHttpClient()
         .sendAsync(var5, BodyHandlers.ofString())
         .thenApply(
            var1x -> {
               try {
                  JsonObject var2x = JsonParser.parseString(var1x.body()).getAsJsonObject();
                  JsonObject var3x = var2x.getAsJsonObject("package");
                  JsonObject var4x = var3x.getAsJsonObject("preview");
                  JsonArray var5x = var4x.getAsJsonArray("items");
                  Integer[] var6 = var5x.asList().stream().filter(var0x -> {
                     String var1xx = var0x.getAsJsonObject().get("type").getAsString();
                     return var1xx.equals("COSMETIC");
                  }).map(var0x -> {
                     JsonObject var1xx = var0x.getAsJsonObject();
                     JsonObject var2xx = var1xx.getAsJsonObject("data");
                     return var2xx.get("id").getAsInt();
                  }).toArray(Integer[]::new);
                  if (var6.length == 0) {
                     return null;
                  }

                  Currency var7 = Currency.getInstance(var3x.get("currency").getAsString());
                  String var8 = var7.getSymbol();
                  int var9 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7);
                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     RIIHIHHCRHCHRCICHOROHCHIIHCICH(var3x),
                     IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3x.get("finalPrice").getAsDouble(), var9),
                     IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3x.get("originalPrice").getAsDouble(), var9)
                  );
                  return new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     UUID.randomUUID(), var1, var3x.get("name").getAsString(), var6, var10, var8, var9
                  );
               } catch (Exception var11) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "Preview", "Failed to parse package response for ID " + var1 + ": " + var11.getMessage()
                  );
                  return null;
               }
            }
         )
         .exceptionally(
            var1x -> {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Preview", "Failed to load package " + var1 + ": " + var1x.getMessage()
               );
               return null;
            }
         );
   }

   private void RRICCIIIHIRCCIORROIRHRCCRCIOIH() {
      this.COOIIROHHOIOHIOIHROHHCICHROIII.IIHRRHORCRCROCHHOHORCHCROCIHRO("isOverlayVisible", this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO);
      if (this.ICORIOCCHROHHIOCORRIOCRRCHRRIC != null) {
         JsonArray var1 = new JsonArray();

         for (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : this.ICORIOCCHROHHIOCORRIOCRRCHRRIC) {
            var1.add(var3.provide());
         }

         this.COOIIROHHOIOHIOIHROHHCICHROIII.IIHRRHORCRCROCHHOHORCHCROCIHRO("previewEntries", var1);
      } else {
         this.COOIIROHHOIOHIOIHROHHCICHROIII.IIHRRHORCRCROCHHOHORCHCROCIHRO("previewEntries", new JsonArray());
      }

      if (this.CICHCROROHHRRIRCIIHHRRCIRIRRRI != null) {
         this.COOIIROHHOIOHIOIHROHHCICHROIII.IIHRRHORCRCROCHHOHORCHCROCIHRO("previewEntry", this.CICHCROROHHRRIRCIIHHRRCIRIRRRI.provide());
      } else {
         this.COOIIROHHOIOHIOIHROHHCICHROIII.IIHRRHORCRCROCHHOHORCHCROCIHRO("previewEntry", null);
      }

      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
      if (var4 != null) {
         var4.CHRCCRRRRHRCCIICIHRCCOOIRIICRO("cosmeticPreview");
      }
   }

   private static String IHCOHROICCHROOIHCOIOOHOCOHCHCI() {
      return "lunar_cosmetic_preview_"
         + com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRHRHRCHHRCHCCRCRRCRICOICHCRRO(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
            )
            .<String>map(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH::getId)
            .orElse(String.valueOf(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION));
   }

   private static @Nullable Integer RIIHIHHCRHCHRCICHOROHCHIIHCICH(JsonObject var0) {
      JsonElement var1 = var0.get("coinsPrice");
      return var1 != null && !var1.isJsonNull() ? var1.getAsInt() : null;
   }

   private static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Currency var0) {
      int var1 = var0.getDefaultFractionDigits();
      return var1 < 0 ? 2 : var1;
   }

   private static double IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var0, int var2) {
      return BigDecimal.valueOf(var0).setScale(var2, RoundingMode.HALF_UP).doubleValue();
   }

   @Generated
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.COOIIROHHOIOHIOIHROHHCICHROIII;
   }

   @Generated
   public List<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCCOIRCOIHICHIHHHICHIORHOIIOIO() {
      return this.ICORIOCCHROHHIOCORRIOCRRCHRRIC;
   }

   @Generated
   public void HIHCCHCCOCOHRICOICHRCOIHIIRIHO(
      List<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
   ) {
      this.ICORIOCCHROHHIOCORRIOCRRCHRRIC = var1;
   }

   @Generated
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IORCOHHORORORHRIOHCIORRRHOIOCH() {
      return this.CICHCROROHHRRIRCIIHHRRCIRIRRRI;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.CICHCROROHHRRIRCIIHHRRCIRIRRRI = var1;
   }

   @Generated
   public boolean HCCROIIICICIIICRIIRHHHOCCOIORC() {
      return this.CHIIRCIOHCORHOOOIHIOIOOHCCICIO;
   }
}
