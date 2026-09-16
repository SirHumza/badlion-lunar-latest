package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import com.google.protobuf.util.JsonFormat;
import com.lunarclient.gameipc.browser.v1.OpenUrlRequest;
import com.lunarclient.gameipc.promotion.v1.PlayPromotionRequest;
import com.lunarclient.gameipc.promotion.v1.PromotionType;
import com.lunarclient.websocket.promotion.v1.ClaimPendingRewardRequest;
import com.lunarclient.websocket.promotion.v1.ClaimPendingRewardResponse;
import com.lunarclient.websocket.promotion.v1.PendingRewardType;
import com.lunarclient.websocket.promotion.v1.PromotionReward;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.webosr.javascript.CallbackJS;
import org.jetbrains.annotations.NotNull;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static long RICHOHOROCOCOCHOHOHCCRCOIHICRH = 0L;

   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .RCICCRRICHCCRHHCOCOIRCRIICCOIH()
         .CORROIRHRRIHCRHIROHHORCCHIIRCO();
   }

   @CallbackJS("playPromotion")
   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(PromotionType var0) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC()
         .ifPresent(
            var1 -> {
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .RCICCRRICHCCRHHCOCOIRCRIICCOIH()
                  .OHHRCRIOOCIORORHIOHRICRHHORCIH()
                  .contains(var0)) {
                  var1.IOIHCOROOICCRIRHRHHHHOCOHIHIOC()
                     .playPromotion(
                        null,
                        PlayPromotionRequest.newBuilder().setType(var0).build(),
                        var0xx -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                           .CIICCRHHHOHOIOHCHRHOORCICRCORC("Open the launcher to view the promotion")
                     );
               }
            }
         );
   }

   @CallbackJS("refresh")
   public static void refresh() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused()) {
         if (System.currentTimeMillis() - RICHOHOROCOCOCHOHOHCCRCOIHICRH < 5000L) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                  "Wait a second before refreshing again.."
               );
         } else {
            RICHOHOROCOCOCHOHOHCCRCOIHICRH = System.currentTimeMillis();
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCOIHOICHRIIHOCCCIHRRHHRROORCR().RHHROIIIHCCIHOCOCOHCHIHIOOIRIO();
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.INFO,
                  "Refreshing...",
                  "Checking for quest completion"
               );
         }
      }
   }

   @CallbackJS("openMedalPromotion")
   public static void OIHRIROIOHIOHOIOHHOOCCICOCOIRH() {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
         .OHCRORCOIOCCCHOHHCIICCRHOORCIR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HOHHIIOOHRCIOCOHRIIOIIOIHCRRCC, OpenUrlRequest.Initiator.INITIATOR_HOME_CTA
         );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.INFO,
            "Opened Medal.tv",
            "Complete the Medal quest in your browser!"
         );
   }

   @CallbackJS("claimReward")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PendingRewardType var0, String var1) {
      try {
         PromotionReward.Builder var2 = PromotionReward.newBuilder();
         JsonFormat.parser().merge(var1, var2);
         PromotionReward var3 = var2.build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .RCOIHOICHRIIHOCCCIHRRHHRROORCR()
            .HCORIRRICOOCHCORIIIROIOCHOCCCR()
            .claimPendingReward(
               null,
               ClaimPendingRewardRequest.newBuilder().setReward(var3).setType(var0).build(),
               var2x -> {
                  ClaimPendingRewardResponse.Result var3x = var2x.getResult();
                  if (var3x == ClaimPendingRewardResponse.Result.RESULT_SUCCESS) {
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.INFO,
                           "Success!",
                           "Successfully claimed reward"
                        );
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCICCRRICHCCRHHCOCOIRCRIICCOIH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCOIHOICHRIIHOCCCIHRRHHRROORCR().RHHROIIIHCCIHOCOCOHCHIHIOOIRIO();
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HCCICHCRRIICICCHCIRCRRIIRROHHC().HOHIOHROCHIHROHCRRCHCOIICORICI();
                     if (var0 == PendingRewardType.PENDING_REWARD_TYPE_MEDAL) {
                        CRRRICCRROCOHHOHIICIHORCOORRRH.IOIIROROOICRCHCOHHIIHRCRIOIOOH(var3.getCosmetic().getCosmeticId());
                     }

                     com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                              .COIHRHIHIHIIRCCOHOIHHOOIRRCOII()
                              .HHIICHIOCCIICOCROHHHOCIRCOHROO(),
                           "promotion:claimSuccess",
                           RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3)
                        );
                  } else if (var3x == ClaimPendingRewardResponse.Result.RESULT_PLAYER_ALREADY_OWNED) {
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                           "Failed to claim reward",
                           "You already own this reward"
                        );
                  } else if (var3x == ClaimPendingRewardResponse.Result.RESULT_PLAYER_ALREADY_CLAIMED) {
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                           "Failed to claim reward",
                           "You have already claimed this reward"
                        );
                  } else {
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                           "Failed to claim reward",
                           "Unknown error"
                        );
                  }
               }
            );
      } catch (Exception var4) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
               "Failed to claim reward",
               "Unknown error"
            );
      }
   }

   @NotNull
   private static JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PromotionReward var0) {
      JsonObject var1 = new JsonObject();
      if (var0.hasCosmetic()) {
         var1.addProperty("cosmeticId", var0.getCosmetic().getCosmeticId());
      }

      if (var0.hasBadge()) {
         var1.addProperty("badgeId", var0.getBadge().getBadgeId());
      }

      if (var0.hasEmote()) {
         var1.addProperty("emoteId", var0.getEmote().getEmoteId());
      }

      if (var0.hasSpray()) {
         var1.addProperty("sprayId", var0.getSpray().getSprayId());
      }

      return var1;
   }
}
