package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.lunarclient.apollo.button.v1.ButtonClientAction;
import com.lunarclient.gameipc.browser.v1.OpenUrlRequest;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import java.net.URI;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final String HRCCCRCIORIIRCCORRRCOIORCRCIOH = "*";

   public static boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(String var0, String var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = var2.bridge$getCurrentScreen();
      if (var2.bridge$getGameSettings().bridge$isChatLinks() && !var1.isEmpty()) {
         URI var4 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORICICIICROCRICRHRHHRCHHRCRHOR(var1);
         if (var4 == null) {
            return false;
         }

         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH();
         AtomicBoolean var6 = new AtomicBoolean(false);
         Runnable var7 = () -> {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
               .COCIHIRICIOIHHRIROHCOIHRROOHOR()
               .get()) {
               var2.bridge$displayScreen(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1, var4, false)
               );
               var6.set(true);
               var5.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "OpenUrlPrompt");
            } else {
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, OpenUrlRequest.Initiator.INITIATOR_UNSPECIFIED);
               var2.bridge$displayScreen(var3);
               var5.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "OpenUrl");
            }
         };
         if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHOIROCHCHORIOOOIHCIIIRHIORIIH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var7, () -> var2.bridge$displayScreen(var3))) {
            var7.run();
         }

         return var6.get();
      } else {
         return false;
      }
   }

   public static boolean IIHRRHORCRCROCHHOHORCHCROCIHRO(String var0, String var1) {
      if (!var1.startsWith("/")) {
         return false;
      }

      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = var2.bridge$getCurrentScreen();
      IRRCCOICORICIHCHRHIHIHROIRHOCR var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      String var5 = var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.apollo.module.inventory.runCommandPrompt", "text", var1);
      String var6 = var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.apollo.module.inventory.runCommandPrompt", "confirmButton");
      String var7 = var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.apollo.module.inventory.runCommandPrompt", "cancelButton");
      var2.bridge$displayScreen(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("", var5, var6, var7, () -> {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$sendCommand(var1);
               var2.bridge$displayScreen(var3);
            }, () -> var2.bridge$displayScreen(var3))
      );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CIRCCCHCCCROROIIOIHIOROIHCHRCH().OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "RunCommand");
      return true;
   }

   public static void OCOHORHCROHICRRIHCIHHRRCIHICRI(String var0, String var1) {
      if (var1.startsWith("/")) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH();
         if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
               .ICROICCCHICCIOOIHOIRCIHRIROHRH()
         )) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$sendCommand(var1);
            var2.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "ButtonRunCommand");
         } else {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
            ORHIOICIOCRRHOOCOHRORIHICHRCRR var4 = var3.bridge$getCurrentScreen();
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               new com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var1
               ),
               "gui.apollo.button.runCommandPrompt",
               var1,
               () -> {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$sendCommand(var1);
                  var3.bridge$displayScreen(var4);
               },
               () -> var3.bridge$displayScreen(var4)
            );
            var2.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "ButtonRunCommandPrompt");
         }
      }
   }

   public static void CIOHHCORHRCCRICCCORIHCRHCCCRRR(String var0, String var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = var2.bridge$getCurrentScreen();
      if (var2.bridge$getGameSettings().bridge$isChatLinks() && !var1.isEmpty() && !"*".equals(var1)) {
         URI var4 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORICICIICROCRICRHRHHRCHHRCRHOR(var1);
         if (var4 != null) {
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CIRCCCHCCCROROIIOIHIOROIHCHRCH();
            Runnable var6 = () -> {
               if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1,
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                     .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                     .IIRCRCCCOCORCRCROCHOHHCHIIIRIO()
               )) {
                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, OpenUrlRequest.Initiator.INITIATOR_UNSPECIFIED);
                  var2.bridge$displayScreen(var3);
                  var5.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "ButtonOpenUrl");
               } else {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     new com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        var1
                     ),
                     "gui.apollo.button.openUrlPrompt",
                     var1,
                     () -> {
                        RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, OpenUrlRequest.Initiator.INITIATOR_UNSPECIFIED);
                        var2.bridge$displayScreen(var3);
                     },
                     () -> var2.bridge$displayScreen(var3)
                  );
                  var5.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "ButtonOpenUrlPrompt");
               }
            };
            if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHOIROCHCHORIOOOIHCIIIRHIORIIH()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var6, () -> var2.bridge$displayScreen(var3))) {
               var6.run();
            }
         }
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, ButtonClientAction var1) {
      switch (var1) {
         case BUTTON_CLIENT_ACTION_OPEN_MINIMAP_VIEW:
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .HICRHORRRIHRCCCICRRIHCOIROHRIO();
            if (var3 != null && var3.isEnabled()) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$displayScreen(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3)
                        )
                  );
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
                  .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "ButtonClientAction");
            }
            break;
         case BUTTON_CLIENT_ACTION_OPEN_WAYPOINTS_MENU:
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
            if (var2 != null) {
               var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIORCOORRIOCRORCRCCOHRIHHHOOH
               );
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
                  .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, "ButtonClientAction");
            }
      }
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, OHIIIOHIRIRCCRRIOIICCHHIORRHOH<String> var1) {
      String var2 = HIIRCRROICHCOROOCCCCOIOOOCCIIC(var0);
      return var2 == null ? false : var1.contains(var2) || var1.contains(HIIRCRROICHCOROOCCCCOIOOOCCIIC("*"));
   }

   @Nullable
   public static String HIIRCRROICHCOROOCCCCOIOOOCCIIC(String var0) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getCurrentServerData();
      if (var1 == null) {
         return null;
      }

      String var2 = var1.bridge$serverIP().toLowerCase(Locale.ROOT);
      return var2 + " " + var0;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      String var1,
      String var2,
      Runnable var3,
      Runnable var4
   ) {
      IRRCCOICORICIHCHRHIHIHROIRHOCR var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      com.moonsworth.lunar.client.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCCRCICOCHOIHHHICIROOIOOCROCII();
      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$displayScreen(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "header"),
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "warning", var2),
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "confirmButton"),
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "denyButton"),
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

   @Generated
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
