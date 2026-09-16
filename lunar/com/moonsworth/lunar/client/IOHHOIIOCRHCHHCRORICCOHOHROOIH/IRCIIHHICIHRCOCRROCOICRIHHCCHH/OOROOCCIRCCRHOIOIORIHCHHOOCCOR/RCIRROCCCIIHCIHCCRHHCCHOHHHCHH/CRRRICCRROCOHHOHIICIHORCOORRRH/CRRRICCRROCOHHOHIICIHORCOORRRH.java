package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.websocket.cosmetic.v2.CosmeticOwnershipVisibility;
import com.lunarclient.websocket.cosmetic.v2.SetCosmeticOwnershipVisibilityRequest;
import com.lunarclient.websocket.friend.v1.AcceptFriendRequestRequest;
import com.lunarclient.websocket.friend.v1.AcceptFriendRequestResponse;
import com.lunarclient.websocket.friend.v1.AddFriendPinRequest;
import com.lunarclient.websocket.friend.v1.BroadcastStatusChangeRequest;
import com.lunarclient.websocket.friend.v1.CancelFriendRequestRequest;
import com.lunarclient.websocket.friend.v1.DenyFriendRequestRequest;
import com.lunarclient.websocket.friend.v1.LastSeenVisibility;
import com.lunarclient.websocket.friend.v1.OfflineFriend;
import com.lunarclient.websocket.friend.v1.RemoveFriendPinRequest;
import com.lunarclient.websocket.friend.v1.SendFriendRequestRequest;
import com.lunarclient.websocket.friend.v1.SendFriendRequestResponse;
import com.lunarclient.websocket.friend.v1.SetLastSeenVisibilityRequest;
import com.lunarclient.websocket.friend.v1.ToggleFriendRequestsRequest;
import com.lunarclient.websocket.hostedworld.v1.JoinHostedWorldRequest;
import com.lunarclient.websocket.store.v1.IncomingGiftPrivacy;
import com.lunarclient.websocket.store.v1.SetIncomingGiftPrivacyRequest;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.COIHORRCHRRCHOCIRHHRRIOIHRIHCC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.webosr.javascript.CallbackJS;
import java.time.Instant;
import java.util.UUID;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static long ORRHCCCCHHCIOCHRROHCOHRCOHROHI = 0L;

   @CallbackJS("addFriend")
   public static void RCIHOOCROOHRICCHCHCICROCIHIOCH(String var0) {
      if (var0.matches("([a-zA-Z0-9_]+)") && var0.length() <= 16) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var1 -> var1.HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
                  .sendFriendRequest(
                     null,
                     SendFriendRequestRequest.newBuilder().setTargetUsername(var0).build(),
                     var0xx -> {
                        if (var0xx.getStatus() != SendFriendRequestResponse.Status.STATUS_OK) {
                           String var3 = switch (var0xx.getStatus()) {
                              case STATUS_TARGET_INVALID_USERNAME -> "Invalid username.";
                              case STATUS_TARGET_NOT_FOUND -> "Could not find this user.";
                              case STATUS_TARGET_FRIEND_REQUESTS_DISABLED -> "That user has disabled friend requests.";
                              case STATUS_TARGET_IS_SENDER -> "You can't friend yourself";
                              case STATUS_ALREADY_FRIENDS -> "Already friends with that user.";
                              case STATUS_ALREADY_HAVE_INBOUND_REQUEST -> "You have a pending friend request from that person.";
                              case STATUS_ALREADY_HAVE_OUTBOUND_REQUEST -> "You've already sent a friend request to this person.";
                              case STATUS_UNSPECIFIED, UNRECOGNIZED, STATUS_OK -> "Unknown error.";
                           };
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, var3);
                        } else {
                           UuidAndUsername var1x = var0xx.getTarget();
                           HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                              CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx.getTarget().getUuid()),
                              var0xx.getTarget().getUsername(),
                              Instant.now(),
                              var0xx.getTargetLogoColor().getColor(),
                              var0xx.getTargetPlusColor().getColor(),
                              var0xx.getTargetBadgeId() > 0
                                 ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                    .HCOHROCRRIIHOORRCCROCROICRICIC()
                                    .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                                    .get(var0xx.getTargetBadgeId())
                                 : null,
                              var0xx.getTargetRankName()
                           );
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .OIICRCOIOOHOOHORCRCIOHRCOIIHIC()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.SUCCESS, "Friend request sent to " + var1x.getUsername());
                        }
                     }
                  )
            );
      } else {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "incorrectUsername")
            );
      }
   }

   @CallbackJS("removeFriend")
   public static void CIHCORHHHOOCOHROIROROCOHCHHIRC(String var0) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .OCIIROIOORRIOIIIRHIRRCCIIRRROH(UUID.fromString(var0));
   }

   @CallbackJS("setFriendRequests")
   public static void HRHRORCIRICHCCCCCHICOOICIRHRIO(Boolean var0) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var1 -> {
               var1.HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
                  .toggleFriendRequests(null, ToggleFriendRequestsRequest.newBuilder().setAllowFriendRequests(var0).build(), var0xx -> {});
               var1.HCHRIROHHHCORIOCROOCHRCIOROOCI(var0);
            }
         );
   }

   @CallbackJS("acceptFriendRequest")
   public static void RCRHOOHHHHRCRCHHCCRRCCHHOCOHCR(String var0) {
      UUID var1 = UUID.fromString(var0);
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var2x -> var2x.HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
               .acceptFriendRequest(
                  null,
                  AcceptFriendRequestRequest.newBuilder().setSenderUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1)).build(),
                  var1xx -> {
                     if (var1xx.getStatus() != AcceptFriendRequestResponse.Status.STATUS_OK) {
                        String var5 = switch (var1xx.getStatus()) {
                           case STATUS_YOUR_FRIEND_LIST_FULL -> "Your friends list is full.";
                           case STATUS_TARGET_FRIEND_LIST_FULL -> "This user's friends list is full.";
                           case STATUS_ALREADY_FRIENDS -> "Already friends with this player!";
                           case STATUS_FRIEND_REQUEST_NOT_FOUND -> "Cannot find associated friend request.";
                           case STATUS_UNSPECIFIED, UNRECOGNIZED, STATUS_OK -> "Unknown error.";
                        };
                        var2.IHCHHRRIIIORORCHIICIIOORCOIOIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, var5);
                     } else {
                        OfflineFriend var2xx = var1xx.getOfflineFriend();
                        UUID var3 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2xx.getPlayer().getUuid());
                        com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = new com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           var3
                        );
                        var4.setName(var2xx.getPlayer().getUsername());
                        var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH((Location)null);
                        var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.OFFLINE);
                        if (var2xx.hasLastVisibleOnline()) {
                           var4.CCHORHIOORICCIRIHRIIHIICORIORO(var2xx.getLastVisibleOnline().getSeconds() * 1000L);
                        } else {
                           var4.CCHORHIOORICCIRIHRIIHIICORIORO(-1L);
                        }

                        if (var2xx.hasFriendsSince()) {
                           var4.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2xx.getFriendsSince()));
                        }

                        if (var2xx.hasSocials()) {
                           var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2xx.getSocials());
                        }

                        var2.RORROHRORCOOOOHRROHIOHCRHHCRCO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
                        var2.RORROHRORCOOOOHRROHIOHCRHHCRCO().OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
                        var2.IHCHHRRIIIORORCHIICIIOORCOIOIO()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              CORCOCICIRIOHROHROIIOOHICCHCRR.SUCCESS, var2xx.getPlayer().getUsername() + " has been added as a friend!"
                           );
                     }
                  }
               )
         );
      var2.OIICRCOIOOHOOHORCRCIOHRCOIIHIC().OCIIROIOORRIOIIIRHIRRCCIIRRROH(var1);
   }

   @CallbackJS("denyFriendRequest")
   public static void IHOIOOCOIHCOICCHCROOCHOIRORHHH(String var0) {
      UUID var1 = UUID.fromString(var0);
      boolean var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().OIICRCOIOOHOOHORCRCIOHRCOIIHIC().ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(var1);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var2x -> {
               if (var2) {
                  var2x.HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
                     .cancelFriendRequest(
                        null,
                        CancelFriendRequestRequest.newBuilder().setTargetUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1)).build(),
                        var0xx -> {}
                     );
               } else {
                  var2x.HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
                     .denyFriendRequest(
                        null,
                        DenyFriendRequestRequest.newBuilder().setSenderUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1)).build(),
                        var0xx -> {}
                     );
               }
            }
         );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().OIICRCOIOOHOOHORCRCIOHRCOIIHIC().OCIIROIOORRIOIIIRHIRRCCIIRRROH(var1);
   }

   @CallbackJS("setVisibilityStatus")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR var0) {
      if (var0 != null && var0 != com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.OFFLINE) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RROHIIOHORHICRHIHCCRRRHIHCHRCC().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var0x -> var0x.HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
                  .broadcastStatusChange(
                     null,
                     BroadcastStatusChangeRequest.newBuilder()
                        .setNewStatus(
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .RROHIIOHORHICRHIHCCRRRHIHCHRCC()
                              .CIHIIIROIRCIRROICHIHHCOHCCHHOC()
                              .getProtobuf()
                        )
                        .build(),
                     var0xx -> {}
                  )
            );
      } else {
         throw new RuntimeException("Invalid arguments provided: " + var0 + " is not a valid status");
      }
   }

   @CallbackJS("setLastSeenVisibility")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LastSeenVisibility var0) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO().ifPresent(var1 -> {
         var1.HCRCHOCOIOIIIRRCOIOORIHHRIIROO().setLastSeenVisibility(null, SetLastSeenVisibilityRequest.newBuilder().setVisibility(var0).build(), var0xx -> {});
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      });
   }

   @CallbackJS("setIncomingGiftPrivacy")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IncomingGiftPrivacy var0) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var1 -> {
               var1.HRCHHIRIHROOIHHRCHICORRROHRCRR()
                  .setIncomingGiftPrivacy(null, SetIncomingGiftPrivacyRequest.newBuilder().setIncomingGiftPrivacy(var0).build(), var0xx -> {});
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
            }
         );
   }

   @CallbackJS("setCosmeticOwnershipVisibility")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CosmeticOwnershipVisibility var0) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var1 -> {
               var1.RRICCCRROHRIHHIOCIRCOCCIRHHIIO()
                  .setCosmeticOwnershipVisibility(null, SetCosmeticOwnershipVisibilityRequest.newBuilder().setVisibility(var0).build(), var0xx -> {});
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
            }
         );
   }

   @CallbackJS("join")
   public static void HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(UUID var0) {
      if (System.currentTimeMillis() - ORRHCCCCHHCIOCHRROHCOHRCOHROHI > 1000L) {
         ORRHCCCCHHCIOCHRROHCOHRCOHROHI = System.currentTimeMillis();
         com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .RORROHRORCOOOOHRROHIOHCRHHCRCO()
            .CCHORHIOORICCIRIHRIIHIICORIORO(var0);
         if (var1 != null) {
            COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, JoinHostedWorldRequest.Source.SOURCE_FRIEND_LIST_INLINE);
         }
      }
   }

   @CallbackJS("setPinnedFriend")
   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var0, boolean var1) {
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .CCHORHIOORICCIRIHRIIHIICORIORO(var0);
      if (var2 != null && var2.ROOHROOCOCOOHCROIRIRHIHOORHIRH() != var1) {
         var2.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO(var1);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RORROHRORCOOOOHRROHIOHCRHHCRCO().OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
         if (var1) {
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .RCOIHOICHRIIHOCCCIHRRHHRROORCR()
               .HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
               .addFriendPin(
                  null,
                  AddFriendPinRequest.newBuilder().setTargetUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var0)).build(),
                  var0x -> {}
               );
         } else {
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .RCOIHOICHRIIHOCCCIHRRHHRROORCR()
               .HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
               .removeFriendPin(
                  null,
                  RemoveFriendPinRequest.newBuilder().setTargetUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var0)).build(),
                  var0x -> {}
               );
         }
      }
   }

   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .CHHOIIOICICROCOCIRRHORHRORICHO();
   }
}
