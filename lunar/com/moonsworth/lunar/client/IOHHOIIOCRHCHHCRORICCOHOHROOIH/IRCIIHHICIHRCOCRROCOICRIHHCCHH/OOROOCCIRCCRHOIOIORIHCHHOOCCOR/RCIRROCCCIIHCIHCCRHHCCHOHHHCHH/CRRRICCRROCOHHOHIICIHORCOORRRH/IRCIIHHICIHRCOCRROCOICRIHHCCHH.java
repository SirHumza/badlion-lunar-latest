package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.websocket.conversation.v1.AddConversationParticipantsRequest;
import com.lunarclient.websocket.conversation.v1.AddPinnedMessageRequest;
import com.lunarclient.websocket.conversation.v1.ConversationImage;
import com.lunarclient.websocket.conversation.v1.ConversationMessageContents;
import com.lunarclient.websocket.conversation.v1.ConversationReference;
import com.lunarclient.websocket.conversation.v1.ConversationType;
import com.lunarclient.websocket.conversation.v1.CreateConversationRequest;
import com.lunarclient.websocket.conversation.v1.CreateConversationResponse;
import com.lunarclient.websocket.conversation.v1.DeleteConversationMessageHistoryRequest;
import com.lunarclient.websocket.conversation.v1.DeleteConversationMessageRequest;
import com.lunarclient.websocket.conversation.v1.DeleteConversationRequest;
import com.lunarclient.websocket.conversation.v1.GetConversationsRequest;
import com.lunarclient.websocket.conversation.v1.GetConversationsResponse;
import com.lunarclient.websocket.conversation.v1.GetUploadUrlsRequest;
import com.lunarclient.websocket.conversation.v1.IconPolicy;
import com.lunarclient.websocket.conversation.v1.InvitePolicy;
import com.lunarclient.websocket.conversation.v1.LoadConversationRequest;
import com.lunarclient.websocket.conversation.v1.LoadPinnedMessagesRequest;
import com.lunarclient.websocket.conversation.v1.LunarSticker;
import com.lunarclient.websocket.conversation.v1.MessagePinningPolicy;
import com.lunarclient.websocket.conversation.v1.NamePolicy;
import com.lunarclient.websocket.conversation.v1.PreSendAction;
import com.lunarclient.websocket.conversation.v1.PreSendActionRequest;
import com.lunarclient.websocket.conversation.v1.RemoveConversationParticipantRequest;
import com.lunarclient.websocket.conversation.v1.RemovePinnedMessageRequest;
import com.lunarclient.websocket.conversation.v1.SendConversationMessageRequest;
import com.lunarclient.websocket.conversation.v1.SendConversationMessageResponse;
import com.lunarclient.websocket.conversation.v1.SetIconPolicyRequest;
import com.lunarclient.websocket.conversation.v1.SetInvitePolicyRequest;
import com.lunarclient.websocket.conversation.v1.SetMessagePinningPolicyRequest;
import com.lunarclient.websocket.conversation.v1.SetNamePolicyRequest;
import com.lunarclient.websocket.conversation.v1.UnfocusConversationsRequest;
import com.lunarclient.websocket.conversation.v1.UpdateConversationIconRequest;
import com.lunarclient.websocket.conversation.v1.UpdateConversationNameRequest;
import com.lunarclient.websocket.conversation.v1.UpdateConversationOwnerRequest;
import com.lunarclient.websocket.conversation.v1.UploadRequestItem;
import com.lunarclient.websocket.conversation.v1.UploadUsage;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import com.moonsworth.webosr.javascript.CallbackJS;
import com.moonsworth.webosr.wrappers.PromiseJS;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Override
   public JsonElement provide() {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().IORIICHCCOROCHIIIICCCOCIHCHHHO().provide();
   }

   @Nullable
   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .IORIICHCCOROCHIIIICCCOCIHCHHHO()
         .HRRORHCRHHRROHIOROOOORRIRRCCIC();
   }

   @Override
   public boolean ICIHOHIHCCOIOROOIOHCICIROIORIO() {
      return true;
   }

   @CallbackJS("refreshConversations")
   public static void IOHRRHOHCHIRRIRRHCRHIHHOCCROCO() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().IOHRRHOHCHIRRIRRHCRHIHHOCCROCO();
   }

   @CallbackJS("getConversations")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PromiseJS<Void> var0, long var1, int var3) {
      GetConversationsRequest.Builder var4 = GetConversationsRequest.newBuilder();
      if (var1 > 0L) {
         var4.setCursor(CCHORHIOORICCIRIHRIIHIICORIORO.IHROCRRIRIROCCCRCRRROCRRCRIIHH(var1));
      }

      if (var3 > 0) {
         var4.setLimit(var3);
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.build(), var1x -> {
         if (var1x == null) {
            var0.reject(GetConversationsResponse.Status.STATUS_UNSPECIFIED.name());
         } else {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x);
            GetConversationsResponse.Status var2 = var1x.getStatus();
            if (var2 != GetConversationsResponse.Status.STATUS_OK) {
               var0.reject(var2.name());
            } else {
               var0.resolve();
            }
         }
      });
   }

   @CallbackJS("unfocusConversations")
   public static void CORCIOCHRCRICOHCRCIOIOIOHHOORO() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IORIICHCCOROCHIIIICCCOCIHCHHHO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UnfocusConversationsRequest.getDefaultInstance(), var0 -> {});
   }

   @CallbackJS("sendConversationMessage")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      PromiseJS<CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var0,
      UUID var1,
      String var2,
      String var3,
      List<String> var4,
      @Nullable String var5
   ) {
      ConversationReference var6 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var1);
      if (var6 == null) {
         var0.reject(SendConversationMessageResponse.Status.STATUS_UNKNOWN_CONVERSATION.name());
      } else {
         String var7 = var2 == null ? "" : var2.trim();
         if (var7.isEmpty()) {
            var0.reject(SendConversationMessageResponse.Status.STATUS_UNSPECIFIED.name());
         } else {
            String var8 = var3 == null ? "" : var3.trim();
            String var9 = var5 == null ? "" : var5.trim();
            ConversationMessageContents.Builder var10 = ConversationMessageContents.newBuilder();
            boolean var11 = false;
            if (!var8.isEmpty()) {
               var10.setPlainText(var8);
               var11 = true;
            }

            if (!var9.isEmpty()) {
               var10.setSticker(LunarSticker.newBuilder().setId(var9).build());
               var11 = true;
            }

            for (String var13 : var4) {
               if (var13 != null && !var13.isBlank()) {
                  var10.addImages(ConversationImage.newBuilder().setUrl(var13.trim()).build());
                  var11 = true;
               }
            }

            if (!var11) {
               var0.reject(SendConversationMessageResponse.Status.STATUS_UNSPECIFIED.name());
            } else {
               SendConversationMessageRequest var14 = SendConversationMessageRequest.newBuilder()
                  .setConversationReference(var6)
                  .setMessageContents(var10.build())
                  .build();
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IORIICHCCOROCHIIIICCCOCIHCHHHO()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, var3x -> {
                     if (var3x == null) {
                        var0.reject(SendConversationMessageResponse.Status.STATUS_UNSPECIFIED.name());
                     } else {
                        SendConversationMessageResponse.Status var4x = var3x.getStatus();
                        if (var4x != SendConversationMessageResponse.Status.STATUS_OK) {
                           var0.reject(var4x.name());
                        } else {
                           var0.resolve(new CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.toString(), var7, var4x.name()));
                        }
                     }
                  });
            }
         }
      }
   }

   @CallbackJS("preSendAction")
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, PreSendAction var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         PreSendActionRequest var3 = PreSendActionRequest.newBuilder().setConversationReference(var2).setAction(var1).build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("loadConversation")
   public static String RHRCRCIOIOICRHRCCROIICCRRCOOOI(UUID var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null, null, null);
   }

   @CallbackJS("loadConversationBefore")
   public static String OOROOCCIRCCRHOIOIORIHCHHOOCCOR(UUID var0, UUID var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, null, null);
   }

   @CallbackJS("loadConversationAfter")
   public static String CORCOCICIRIOHROHROIIOOHICCHCRR(UUID var0, UUID var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null, var1, null);
   }

   @CallbackJS("loadConversationAnchor")
   public static String CRICCOOHHHCHOORCICOCOHIHOIRHOO(UUID var0, UUID var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null, null, var1);
   }

   @CallbackJS("createConversation")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      PromiseJS<String> var0, ConversationType var1, CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var2
   ) {
      if (var1 == null || var1 == ConversationType.CONVERSATION_TYPE_UNSPECIFIED) {
         var0.reject(CreateConversationResponse.Status.STATUS_INVALID_PARTICIPANTS.name());
      } else if (var2 != null && var2.length != 0) {
         CreateConversationRequest.Builder var3 = CreateConversationRequest.newBuilder().setType(var1);

         for (CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 : var2) {
            if (var7 == null || var7.HIIRRROHIHORHHHCCOORRCCOOCHRHC == null) {
               var0.reject(CreateConversationResponse.Status.STATUS_INVALID_PARTICIPANTS.name());
               return;
            }

            var3.addParticipantUuids(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var7.HIIRRROHIHORHHHCCOORRCCOOCHRHC));
         }

         CreateConversationRequest var8 = var3.build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var1x -> {
            if (var1x == null) {
               var0.reject(CreateConversationResponse.Status.STATUS_UNSPECIFIED.name());
            } else {
               CreateConversationResponse.Status var2x = var1x.getStatus();
               if (var2x != CreateConversationResponse.Status.STATUS_OK && var2x != CreateConversationResponse.Status.STATUS_CONVERSATION_ALREADY_EXISTS) {
                  var0.reject(var2x.name());
               } else if (!var1x.hasConversation()) {
                  var0.reject(CreateConversationResponse.Status.STATUS_UNSPECIFIED.name());
               } else {
                  ConversationReference var3x = var1x.getConversation().getConversationReference();
                  UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x.getConversationReference());
                  var0.resolve(var4.toString());
               }
            }
         });
      } else {
         var0.reject(CreateConversationResponse.Status.STATUS_INVALID_PARTICIPANTS.name());
      }
   }

   @CallbackJS("deleteConversation")
   public static String HORHCHIIOCRROHOHRCORCCICCRCCHO(UUID var0) {
      ConversationReference var1 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var1 == null) {
         return "";
      }

      DeleteConversationRequest var2 = DeleteConversationRequest.newBuilder().setConversationReference(var1).build();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var0x -> {});
      return var0.toString();
   }

   @CallbackJS("deleteConversationMessage")
   public static String HICHRCOHCCRHOHCICOOCHOIHCCHIRI(UUID var0, UUID var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         DeleteConversationMessageRequest var3 = DeleteConversationMessageRequest.newBuilder()
            .setConversationReference(var2)
            .setMessageId(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1))
            .build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var1.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("deleteConversationMessageHistory")
   public static String CIHCOICOOICHOCCHICIHRCOCIHRIOC(UUID var0) {
      ConversationReference var1 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var1 == null) {
         return "";
      }

      DeleteConversationMessageHistoryRequest var2 = DeleteConversationMessageHistoryRequest.newBuilder().setConversationReference(var1).build();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var0x -> {});
      return var0.toString();
   }

   @CallbackJS("updateConversationOwner")
   public static String IIHRRHORCRCROCHHOHORCHCROCIHRO(UUID var0, UUID var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         UpdateConversationOwnerRequest var3 = UpdateConversationOwnerRequest.newBuilder()
            .setTargetUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1))
            .setConversationReference(var2)
            .build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("addConversationParticipants")
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 == null) {
         return "";
      }

      AddConversationParticipantsRequest.Builder var3 = AddConversationParticipantsRequest.newBuilder().setConversationReference(var2);

      for (CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 : var1) {
         var3.addTargets(
            UuidAndUsername.newBuilder()
               .setUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var7.HIIRRROHIHORHHHCCOORRCCOOCHRHC))
               .setUsername(var7.HOCOOHORRHOHOHHICRRROHIHHIOOCC)
               .build()
         );
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IORIICHCCOROCHIIIICCCOCIHCHHHO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.build(), var0x -> {});
      return var0.toString();
   }

   @CallbackJS("removeConversationParticipant")
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, UUID var1, String var2) {
      ConversationReference var3 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var3 != null && var1 != null) {
         RemoveConversationParticipantRequest var4 = RemoveConversationParticipantRequest.newBuilder()
            .setConversationReference(var3)
            .setTarget(UuidAndUsername.newBuilder().setUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1)).setUsername(var2).build())
            .build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("updateConversationName")
   public static String HRCHROOHRIHCRCRHRIIROCIRHOIRHH(UUID var0, String var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      String var3 = var1 == null ? "" : var1.trim();
      if (var2 != null && !var3.isEmpty()) {
         UpdateConversationNameRequest var4 = UpdateConversationNameRequest.newBuilder().setConversationReference(var2).setName(var3).build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("updateConversationIcon")
   public static String OOROOCCIRCCRHOIOIORIHCHHOOCCOR(UUID var0, String var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null && !var1.isBlank()) {
         UpdateConversationIconRequest var3 = UpdateConversationIconRequest.newBuilder()
            .setConversationReference(var2)
            .setImage(ConversationImage.newBuilder().setUrl(var1.trim()).build())
            .build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("loadPinnedMessages")
   public static String HOCCCIICRCIIIIRHHICOCOOIICHIOR(UUID var0) {
      ConversationReference var1 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var1 == null) {
         return "";
      }

      LoadPinnedMessagesRequest var2 = LoadPinnedMessagesRequest.newBuilder().setConversationReference(var1).build();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var0x -> {});
      return var0.toString();
   }

   @CallbackJS("addPinnedMessage")
   public static String OCOHORHCROHICRRIHCIHHRRCIHICRI(UUID var0, UUID var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         AddPinnedMessageRequest var3 = AddPinnedMessageRequest.newBuilder()
            .setConversationReference(var2)
            .setMessageId(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1))
            .build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var1.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("removePinnedMessage")
   public static String CIOHHCORHRCCRICCCORIHCRHCCCRRR(UUID var0, UUID var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         RemovePinnedMessageRequest var3 = RemovePinnedMessageRequest.newBuilder()
            .setConversationReference(var2)
            .setMessageId(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1))
            .build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var1.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("setInvitePolicy")
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, InvitePolicy var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         SetInvitePolicyRequest var3 = SetInvitePolicyRequest.newBuilder().setConversationReference(var2).setPolicy(var1).build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("setNamePolicy")
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, NamePolicy var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         SetNamePolicyRequest var3 = SetNamePolicyRequest.newBuilder().setConversationReference(var2).setPolicy(var1).build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("setIconPolicy")
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, IconPolicy var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         SetIconPolicyRequest var3 = SetIconPolicyRequest.newBuilder().setConversationReference(var2).setPolicy(var1).build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("setMessagePinningPolicy")
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, MessagePinningPolicy var1) {
      ConversationReference var2 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var2 != null && var1 != null) {
         SetMessagePinningPolicyRequest var3 = SetMessagePinningPolicyRequest.newBuilder().setConversationReference(var2).setPolicy(var1).build();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0x -> {});
         return var0.toString();
      } else {
         return "";
      }
   }

   @CallbackJS("pickGroupIconForPreview")
   public static void HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO(UUID var0) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0)
      );
   }

   @CallbackJS("uploadPendingGroupIcon")
   public static void CCHHRHRHCRHIHIHRIOICROHCHIIIHI(UUID var0) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var0, HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0)
      );
   }

   @CallbackJS("pickChatImagesForPreview")
   public static void OHRRIORRCRIRORHRIOOCORIIRRRRRO(UUID var0) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0, HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0)
      );
   }

   @CallbackJS("uploadPendingChatImages")
   public static void CICOIHIRIIHHCIOICHRHICRIRCIOHC(UUID var0) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH(
         var0, HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0)
      );
   }

   @CallbackJS("getUploadUrls")
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, UploadUsage var1, CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var2) {
      ConversationReference var3 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var3 == null) {
         return "";
      }

      GetUploadUrlsRequest.Builder var4 = GetUploadUrlsRequest.newBuilder().setConversationReference(var3).setUsage(var1);

      for (CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 : var2) {
         var4.addItems(UploadRequestItem.newBuilder().setContentType(var8.contentType).setExpectedSizeBytes(var8.HHHICIRHRRRHCCRORHHHICIOOIOHRI).build());
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IORIICHCCOROCHIIIICCCOCIHCHHHO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.build(), var0x -> {});
      return var0.toString();
   }

   @CallbackJS("searchGifs")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      PromiseJS<RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var0, @Nullable String var1, int var2
   ) {
      CompletableFuture.<RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR>supplyAsync(
            () -> RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1, var2), ORCOCORROHIROCCIORORRRRCHIOOCH.RHOHHCCOOIHIIRCORRRIORCRIIOHHI()
         )
         .whenComplete((var1x, var2x) -> {
            if (var2x != null) {
               var0.reject("SEARCH_GIFS_FAILED");
            } else {
               var0.resolve(var1x);
            }
         });
   }

   @Nullable
   private static ConversationReference HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(@Nullable UUID var0) {
      return var0 == null
         ? null
         : ConversationReference.newBuilder().setConversationReference(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var0)).build();
   }

   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, @Nullable UUID var1, @Nullable UUID var2, @Nullable UUID var3) {
      ConversationReference var4 = HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var0);
      if (var4 == null) {
         return "";
      }

      LoadConversationRequest.Builder var5 = LoadConversationRequest.newBuilder().setConversationReference(var4);
      if (var1 != null) {
         var5.setBeforeMessageId(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1));
      }

      if (var2 != null) {
         var5.setAfterMessageId(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var2));
      }

      if (var3 != null) {
         var5.setAnchorMessageId(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var3));
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IORIICHCCOROCHIIIICCCOCIHCHHHO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.build(), var0x -> {});
      return var0.toString();
   }

   public record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      @SerializedName("content_type")
      private final String contentType;
      @SerializedName("expected_size_bytes")
      private final int HHHICIRHRRRHCCRORHHHICIOOIOHRI;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, int var2) {
         this.contentType = var1;
         this.HHHICIRHRRRHCCRORHHHICIOOIOHRI = var2;
      }

      @SerializedName("content_type")
      public String COOOIOCROCIHRROHRIOHCICROIRRHO() {
         return this.contentType;
      }

      @SerializedName("expected_size_bytes")
      public int RRHRRIOIOCRROHROHHHOCCIIORCROI() {
         return this.HHHICIRHRRRHCCRORHHHICIOOIOHRI;
      }
   }

   public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      @SerializedName("conversationId")
      private final String IRCRCOHRHRIOHRIOHIIOIHOCHHCICC;
      @SerializedName("clientMessageId")
      private final String HRIRIORROHCOORICHORIIIRIHIRRIH;
      @SerializedName("status")
      private final String RROHICROHCHICOHRCRHOHIHRIICHHO;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, String var3) {
         this.IRCRCOHRHRIOHRIOHIIOIHOCHHCICC = var1;
         this.HRIRIORROHCOORICHORIIIRIHIRRIH = var2;
         this.RROHICROHCHICOHRCRHOHIHRIICHHO = var3;
      }

      @SerializedName("conversationId")
      public String RIICHRIIIROCICORCHCIIIOICICOII() {
         return this.IRCRCOHRHRIOHRIOHIIOIHOCHHCICC;
      }

      @SerializedName("clientMessageId")
      public String ICHRHROCHIOCIOCHRORRHHHCHOIHHO() {
         return this.HRIRIORROHCOORICHORIIIRIHIRRIH;
      }

      @SerializedName("status")
      public String status() {
         return this.RROHICROHCHICOHRCRHOHIHRIICHHO;
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      @SerializedName("uuid")
      private final UUID HIIRRROHIHORHHHCCOORRCCOOCHRHC;
      @SerializedName("username")
      private final String HOCOOHORRHOHOHHICRRROHIHHIOOCC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, String var2) {
         this.HIIRRROHIHORHHHCCOORRCCOOCHRHC = var1;
         this.HOCOOHORRHOHOHHICRRROHIHHIOOCC = var2;
      }

      @SerializedName("uuid")
      public UUID uuid() {
         return this.HIIRRROHIHORHHHCCOORRCCOOCHRHC;
      }

      @SerializedName("username")
      public String username() {
         return this.HOCOOHORRHOHOHHICRRROHIHHIOOCC;
      }
   }
}
