package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.lunarclient.common.v1.UserSocialPlatform;
import com.lunarclient.gameipc.browser.v1.OpenUrlRequest;
import com.lunarclient.websocket.socials.v1.UnlinkSocialRequest;
import com.lunarclient.websocket.socials.v1.UnlinkSocialResponse;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.webosr.javascript.CallbackJS;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCHCOIHCIIROIOIOCHOOORRCOIHCI().CORROIRHRRIHCRHIROHHORCCHIIRCO();
   }

   @CallbackJS("openSocialMedia")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UserSocialPlatform var0) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCHCOIHCIIROIOIOCHOOORRCOIHCI()
         .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .get(var0);
      if (var1 != null) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var1x -> var1x.RCRIHICRIIROCHHHHCROCRCHHRIIOI()
                  .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                     "GAME_SOCIAL_LINK",
                     var1xx -> {
                        if (var1xx != null) {
                           String var2 = "https://www.lunarclient.com/" + var1.getId().toLowerCase(Locale.ROOT) + "-link/";
                           String var3 = URLEncoder.encode(var1xx, StandardCharsets.UTF_8);
                           String var4 = URLEncoder.encode(
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile().getId().toString(),
                              StandardCharsets.UTF_8
                           );
                           String var5 = URLEncoder.encode(
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getUsername(), StandardCharsets.UTF_8
                           );
                           boolean var6 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                              .IHIHCOIRIHIRHICORCCHCOOICIIOIC()
                              .HIRROCORCHCHRORRHRIHCIHIHCCHIC();
                           String var7 = var2 + "?token=" + var3 + "&uuid=" + var4 + "&username=" + var5 + "&premium=" + var6;
                           if (com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                              var7, OpenUrlRequest.Initiator.INITIATOR_SOCIAL_LINK
                           )) {
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                 .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                                 .CIICCRHHHOHOIOHCHRHOORCICRCORC("Opened link in browser");
                           } else {
                              IIHRRHORCRCROCHHOHORCHCROCIHRO.CROIHRIIRROCHORIIRIOCROOORRCCH(var7);
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                 .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                                 .CIICCRHHHOHOIOHCHRHOORCICRCORC("Copied link to clipboard");
                           }
                        }
                     }
                  )
            );
      }
   }

   @CallbackJS("unlinkSocial")
   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(UserSocialPlatform var0) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var1 -> var1.ICRIHROIRHIHOCOOCRCHCHRRCHOHHC()
               .unlinkSocial(
                  null,
                  UnlinkSocialRequest.newBuilder().setPlatform(var0).build(),
                  var1x -> {
                     if (var1x.getStatus() == UnlinkSocialResponse.Status.STATUS_OK) {
                        com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .HHCHCOIHCIIROIOIOCHOOORRCOIHCI()
                           .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                           .get(var0);
                        if (var2 != null) {
                           var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null);
                        }

                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCHCOIHCIIROIOIOCHOOORRCOIHCI().RRIIRIHICIRHHCCRCHIHICOCRRORHI(true);
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                           .CIICCRHHHOHOIOHCHRHOORCICRCORC("Unlinked social account");
                     }
                  }
               )
         );
   }
}
