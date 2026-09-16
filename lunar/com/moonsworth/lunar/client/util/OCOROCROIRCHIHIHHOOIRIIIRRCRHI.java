package com.moonsworth.lunar.client.util;

import com.lunarclient.gameipc.paynow.v1.OpenPayNowJsCheckoutRequest;
import com.lunarclient.gameipc.tebex.v1.OpenTebexJsCheckoutRequest;
import java.util.Optional;
import lombok.Generated;

public final class OCOROCROIRCHIHIHHOOIRIIIRRCRHI {
   public static void OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(String var0, String var1) {
      Optional var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC();
      if (var2.isEmpty()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Tebex", "Ignoring open request as we have no launcher IPC connection"
         );
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Tebex", "Opening checkout for basket " + var0 + " in locale " + var1
         );
         com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = (com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get();
         var3.OCCOCOOHIICIHCRCIOIIHICRORRIRR()
            .openTebexJsCheckout(
               null,
               OpenTebexJsCheckoutRequest.newBuilder().setBasketIdent(var0).setLocale(var1).build(),
               var0x -> {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     "Tebex", "Sent open request to launcher. Response: " + var0x.getStatus()
                  );
                  if (var0x.getOpenMinecraftScreen()) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "Tebex", "Opening Minecraft screen to prevent movement"
                     );
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                        .bridge$submit(
                           () -> {
                              com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var0xx = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                                 .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
                                 );
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(var0xx);
                           }
                        );
                  } else {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "Tebex", "Skipping opening Minecraft screen"
                     );
                  }
               }
            );
      }
   }

   public static void HHCCIRORCRCHOIOHRRIRRRIORRCRRR(String var0) {
      Optional var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC();
      if (var1.isEmpty()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "PayNow", "Ignoring open request as we have no launcher IPC connection"
         );
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "PayNow", "Opening checkout for token " + var0
         );
         com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get();
         var2.ROIHOHIICIIHIHRIIHRCCCICHRHROO()
            .openPayNowJsCheckout(
               null,
               OpenPayNowJsCheckoutRequest.newBuilder().setCheckoutToken(var0).build(),
               var0x -> {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     "PayNow", "Sent open request to launcher. Response: " + var0x.getStatus()
                  );
                  if (var0x.getOpenMinecraftScreen()) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "PayNow", "Opening Minecraft screen to prevent movement"
                     );
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                        .bridge$submit(
                           () -> {
                              com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var0xx = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                                 .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
                                 );
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(var0xx);
                           }
                        );
                  } else {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "PayNow", "Skipping opening Minecraft screen"
                     );
                  }
               }
            );
      }
   }

   @Generated
   private OCOROCROIRCHIHIHHOOIRIIIRRCRHI() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
