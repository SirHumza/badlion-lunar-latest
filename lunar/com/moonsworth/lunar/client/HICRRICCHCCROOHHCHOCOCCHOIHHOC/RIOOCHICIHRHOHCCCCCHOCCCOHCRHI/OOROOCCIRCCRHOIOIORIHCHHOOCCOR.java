package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.websocket.conversation.v1.AddConversationParticipantsRequest;
import com.lunarclient.websocket.conversation.v1.AddConversationParticipantsResponse;
import com.lunarclient.websocket.conversation.v1.AddPinnedMessageRequest;
import com.lunarclient.websocket.conversation.v1.AddPinnedMessageResponse;
import com.lunarclient.websocket.conversation.v1.Conversation;
import com.lunarclient.websocket.conversation.v1.ConversationAddParticipantsPush;
import com.lunarclient.websocket.conversation.v1.ConversationAddPinnedMessagePush;
import com.lunarclient.websocket.conversation.v1.ConversationAddedPush;
import com.lunarclient.websocket.conversation.v1.ConversationMessage;
import com.lunarclient.websocket.conversation.v1.ConversationMessageHistoryDeletedPush;
import com.lunarclient.websocket.conversation.v1.ConversationMessagePush;
import com.lunarclient.websocket.conversation.v1.ConversationOwnerUpdatePush;
import com.lunarclient.websocket.conversation.v1.ConversationPreSendActionPush;
import com.lunarclient.websocket.conversation.v1.ConversationReference;
import com.lunarclient.websocket.conversation.v1.ConversationRemoveMessagePush;
import com.lunarclient.websocket.conversation.v1.ConversationRemoveParticipantPush;
import com.lunarclient.websocket.conversation.v1.ConversationRemovePinnedMessagePush;
import com.lunarclient.websocket.conversation.v1.ConversationRemovedPush;
import com.lunarclient.websocket.conversation.v1.ConversationSender;
import com.lunarclient.websocket.conversation.v1.ConversationService;
import com.lunarclient.websocket.conversation.v1.ConversationStub;
import com.lunarclient.websocket.conversation.v1.ConversationType;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateIconPolicyPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateIconPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateInvitePolicyPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateMessagePinningPolicyPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateNamePolicyPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateNamePush;
import com.lunarclient.websocket.conversation.v1.CreateConversationRequest;
import com.lunarclient.websocket.conversation.v1.CreateConversationResponse;
import com.lunarclient.websocket.conversation.v1.DeleteConversationMessageHistoryRequest;
import com.lunarclient.websocket.conversation.v1.DeleteConversationMessageHistoryResponse;
import com.lunarclient.websocket.conversation.v1.DeleteConversationMessageRequest;
import com.lunarclient.websocket.conversation.v1.DeleteConversationMessageResponse;
import com.lunarclient.websocket.conversation.v1.DeleteConversationRequest;
import com.lunarclient.websocket.conversation.v1.DeleteConversationResponse;
import com.lunarclient.websocket.conversation.v1.GetConversationsRequest;
import com.lunarclient.websocket.conversation.v1.GetConversationsResponse;
import com.lunarclient.websocket.conversation.v1.GetUploadUrlsRequest;
import com.lunarclient.websocket.conversation.v1.GetUploadUrlsResponse;
import com.lunarclient.websocket.conversation.v1.LoadConversationRequest;
import com.lunarclient.websocket.conversation.v1.LoadConversationResponse;
import com.lunarclient.websocket.conversation.v1.LoadPinnedMessagesRequest;
import com.lunarclient.websocket.conversation.v1.LoadPinnedMessagesResponse;
import com.lunarclient.websocket.conversation.v1.LoginResponse;
import com.lunarclient.websocket.conversation.v1.PreSendActionRequest;
import com.lunarclient.websocket.conversation.v1.PreSendActionResponse;
import com.lunarclient.websocket.conversation.v1.RemoveConversationParticipantRequest;
import com.lunarclient.websocket.conversation.v1.RemoveConversationParticipantResponse;
import com.lunarclient.websocket.conversation.v1.RemovePinnedMessageRequest;
import com.lunarclient.websocket.conversation.v1.RemovePinnedMessageResponse;
import com.lunarclient.websocket.conversation.v1.SendConversationMessageRequest;
import com.lunarclient.websocket.conversation.v1.SendConversationMessageResponse;
import com.lunarclient.websocket.conversation.v1.SetIconPolicyRequest;
import com.lunarclient.websocket.conversation.v1.SetIconPolicyResponse;
import com.lunarclient.websocket.conversation.v1.SetInvitePolicyRequest;
import com.lunarclient.websocket.conversation.v1.SetInvitePolicyResponse;
import com.lunarclient.websocket.conversation.v1.SetMessagePinningPolicyRequest;
import com.lunarclient.websocket.conversation.v1.SetMessagePinningPolicyResponse;
import com.lunarclient.websocket.conversation.v1.SetNamePolicyRequest;
import com.lunarclient.websocket.conversation.v1.SetNamePolicyResponse;
import com.lunarclient.websocket.conversation.v1.UnfocusConversationsRequest;
import com.lunarclient.websocket.conversation.v1.UnfocusConversationsResponse;
import com.lunarclient.websocket.conversation.v1.UpdateConversationIconRequest;
import com.lunarclient.websocket.conversation.v1.UpdateConversationIconResponse;
import com.lunarclient.websocket.conversation.v1.UpdateConversationNameRequest;
import com.lunarclient.websocket.conversation.v1.UpdateConversationNameResponse;
import com.lunarclient.websocket.conversation.v1.UpdateConversationOwnerRequest;
import com.lunarclient.websocket.conversation.v1.UpdateConversationOwnerResponse;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<UUID, com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH>
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO RHHIOHHRRHCROHCCIHIHCCOICHHROC = new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO();
   private final ConcurrentLinkedQueue<JsonObject> HCRRCIIORRHRRRCOOIHHHHOIHHCIRO = new ConcurrentLinkedQueue<>();
   private static final String OIIHRRHHCOHHCRICHCIIRCHHHHHRHI = "conversation.upsert";
   private static final String RIHHCIIHIRRHICCCOCOOHOHRROHIIH = "conversation.remove";
   private static final String CCIHOHIIICCCCRHCROOHCICCOOIIHO = "conversation.service.update";
   private static final String IORCHHIOHRRHORRICCICRHHHCOROHI = "conversation.message.upsert";
   private static final String HORHOCORIOOHHOIRICHOCIIHIIHIHC = "conversation.message.remove";
   private static final String COIRHOHIHCICRHIHOHCCOROIHCOOOI = "conversation.messageHistory.clear";
   private static final String OCCIHIHRCCHHIICOCHORCCROHHRROI = "conversation.messages.sync";
   private static final String HROCIHOCHHCIOORRRORIOROCOOIRHC = "conversation.presend.set";
   private static final String HROIHIHRHHCRCCCIHIHICCCOOORCHH = "conversation.presend.clear";
   private static final String HHOOOHCIRIRIIOHROIIRIHICOCHCCR = "conversation.owner.update";
   private static final String CHCICICRHHHRHHOCRROOCRCHRRICCH = "conversation.participants.add";
   private static final String OHRCHRORRHHHICOCRORRCHHRRHIOCC = "conversation.participants.remove";
   private static final String RICRRHORRCORHCHRCHRIROHOCHIHOI = "conversation.name.update";
   private static final String COOHICCHHCHRHOHRCCRCIROHCHHORC = "conversation.icon.update";
   private static final String OORCIOCOOROIRRCRORROOHROCRICCI = "conversation.pinned.add";
   private static final String COHRCIOCCROHOIICHOOCIOCOICCIII = "conversation.pinned.remove";
   private static final String HCORRROCCRORCHRIHRICCOOCOCRROR = "conversation.policy.invite.update";
   private static final String CIIOOIOIRHHRRICIORRHOHHORHRCHC = "conversation.policy.name.update";
   private static final String CCCORCHIRROHHROHHCHHCCHRICCRCI = "conversation.policy.icon.update";
   private static final String HIIHHOHHHCCIOOIOHCRHHHHIICIIIR = "conversation.policy.pinning.update";

   @Override
   protected Map<UUID, com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      return new ConcurrentHashMap<>();
   }

   public void RRCRHRRIRRORCOOCORCRRHOCHROIIH() {
      this.clear();
      this.RHHIOHHRRHCROHCCIHIHCCOICHHROC.clear();
      this.HCRRCIIORRHRRRCOOIHHHHOIHHCIRO.clear();
   }

   public boolean CROIRRRHRHRIHHRHCIRIRRIHRHRHOC() {
      return this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().values().stream().anyMatch(var0 -> var0.getUnreadCount() > 0);
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(LoginResponse var1) {
      this.RHHIOHHRRHCROHCCIHIHCCOICHHROC
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1.getParticipantLimit(), var1.getTotalConversations(), var1.getMaxMessageLength(), var1.getStickerPacksList(), var1.getEmojiCategoriesList()
         );
      this.clear();

      for (ConversationStub var3 : var1.getConversationsList()) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var3.getConversationReference()
         );
         if (var4 != null && var3.hasUserState()) {
            var4.RHHIIRORCOIORHIOHRHCIHRHHIRCRH(var3.getUserState().getUnreadCount());
            var4.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.getUserState().getLastSeenTime()));
         }
      }

      this.OCOHOHIHCCCCHHRRHCROHIHCRHIRRR();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GetConversationsResponse var1) {
      if (var1 != null) {
         this.RHHIOHHRRHCROHCCIHIHCCOICHHROC.OIIHIOIORRHHRCRRCCORRHHCHRHORH(var1.getTotalConversations());
         this.OCOHOHIHCCCCHHRRHCROHIHCRHIRRR();
         if (var1.getStatus() == GetConversationsResponse.Status.STATUS_OK) {
            for (Conversation var3 : var1.getConversationsList()) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
            }
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Conversation var1) {
      UUID var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.getConversationReference());
      if (var2 != null) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .get(var2);
         if (var3 == null) {
            var3 = com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1
            );
            this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().put(var2, var3);
         } else {
            var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         }

         ConversationReference var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         if (var4 != null) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.upsert", var4, var3.provide().getAsJsonObject());
         }
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationMessagePush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getConversationReference(),
         (var2, var3) -> {
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1.getMessage()
            );
            if (var4 != null) {
               var4.HROOORICCCOROOORORCORRHRHORIRC(var1.hasUpdated() && var1.getUpdated());
               var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
               if (!var4.IOORHOHORIIRRORIRHHRHCCORCIRIH()
                  && (var2.HOIHHCCCCOOIHCIHCHOIHIRCIHHOOH() == null || var4.ORHCHHRRCOHRHRIOHIOOIRHICOOIHR().isAfter(var2.HOIHHCCCCOOIHCIHCHOIHIRCIHHOOH()))) {
                  var2.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var4.ORHCHHRRCOHRHRIOHIOOIRHICOOIHR());
               }

               JsonObject var5 = new JsonObject();
               var5.add("message", var4.provide());
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.message.upsert", var3, var5);
            }
         }
      );
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationPreSendActionPush var1) {
      if (var1.getSender().getSenderCase() == ConversationSender.SenderCase.PLAYER) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference(), (var2, var3) -> {
            UuidAndUsername var4 = var1.getSender().getPlayer();
            var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var1.getAction());
            JsonObject var5 = new JsonObject();
            var5.addProperty("userId", CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.getUuid()).toString());
            var5.addProperty("action", var1.getAction().name());
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.presend.set", var3, var5);
         });
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationOwnerUpdatePush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getConversationReference(),
         (var2, var3) -> {
            var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1.getInvoker()
               )
            );
            var2.IORRORCRRHRRORHIRHRROHCRRIHRII(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPreviousOwnerUuid()));
            var2.RCOCOHHCOOICCICCRCCORORROHRCCC(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getOwnerUuid()));
            JsonObject var4 = new JsonObject();
            if (var2.HOHRHCROHHHHCICIIRRHIHOORHHHCO() != null) {
               var4.addProperty("ownerUuid", var2.HOHRHCROHHHHCICIIRRHIHOORHHHCO().toString());
            }

            if (var2.IRIIORCHHIHHOCRCRRCRICRIHOHRRI() != null) {
               var4.addProperty("previousOwnerUuid", var2.IRIIORCHHIHHOCRCRRCRICRIHOHRRI().toString());
            }

            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.owner.update", var3, var4);
         }
      );
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationAddParticipantsPush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getConversationReference(),
         (var2, var3) -> {
            var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1.getInvoker()
               )
            );
            HashSet var4 = new HashSet();
            var2.ROOOCIOIOHHIOICHOIHIHHORRIOOIC().forEach(var1xx -> {
               if (var1xx.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI() != null) {
                  var4.add(var1xx.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI());
               }
            });
            JsonObject var5 = new JsonObject();
            JsonArray var6 = new JsonArray();
            var1.getParticipantsList()
               .forEach(
                  var3x -> {
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4x = com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var3x
                     );
                     UUID var5x = var4x.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI();
                     if (var5x == null || var4.add(var5x)) {
                        var2.ROOOCIOIOHHIOICHOIHIHHORRIOOIC().add(var4x);
                        var6.add(var4x.provide());
                     }
                  }
               );
            if (!var6.isEmpty()) {
               var5.add("participants", var6);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.participants.add", var3, var5);
            }
         }
      );
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationRemoveParticipantPush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getConversationReference(),
         (var2, var3) -> {
            var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1.getInvoker()
               )
            );
            UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getParticipant().getUuid());
            var2.ROOOCIOIOHHIOICHOIHIHHORRIOOIC().removeIf(var1xx -> var1xx.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var4));
            JsonObject var5 = new JsonObject();
            var5.addProperty("participantId", var4.toString());
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.participants.remove", var3, var5);
         }
      );
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateNamePush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getConversationReference(),
         (var2, var3) -> {
            var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1.getInvoker()
               )
            );
            var2.setName(var1.getName());
            JsonObject var4 = new JsonObject();
            var4.addProperty("name", var1.getName());
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.name.update", var3, var4);
         }
      );
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateIconPush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getConversationReference(),
         (var2, var3) -> {
            var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1.getInvoker()
               )
            );
            var2.COIRIHRCCIIHCCICRHHOHRIOICRRII(var1.getImageUrl());
            JsonObject var4 = new JsonObject();
            var4.addProperty("conversationImageUrl", var1.getImageUrl());
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.icon.update", var3, var4);
         }
      );
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationAddPinnedMessagePush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getConversationReference(),
         (var2, var3) -> {
            var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1.getInvoker()
               )
            );
            UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getMessageId());
            var2.CIOIORRCHRIHIRHIOIORCOICRHCIRC().add(var4);
            JsonObject var5 = new JsonObject();
            var5.addProperty("messageId", var4.toString());
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.pinned.add", var3, var5);
         }
      );
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationRemovePinnedMessagePush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getConversationReference(),
         (var2, var3) -> {
            var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1.getInvoker()
               )
            );
            UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getMessageId());
            var2.CIOIORRCHRIHIRHIOIORCOICRHCIRC().remove(var4);
            JsonObject var5 = new JsonObject();
            var5.addProperty("messageId", var4.toString());
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.pinned.remove", var3, var5);
         }
      );
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateInvitePolicyPush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference(), (var2, var3) -> {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPolicy());
         JsonObject var4 = new JsonObject();
         var4.addProperty("policy", var1.getPolicy().name());
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.policy.invite.update", var3, var4);
      });
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateNamePolicyPush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference(), (var2, var3) -> {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPolicy());
         JsonObject var4 = new JsonObject();
         var4.addProperty("policy", var1.getPolicy().name());
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.policy.name.update", var3, var4);
      });
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateIconPolicyPush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference(), (var2, var3) -> {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPolicy());
         JsonObject var4 = new JsonObject();
         var4.addProperty("policy", var1.getPolicy().name());
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.policy.icon.update", var3, var4);
      });
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateMessagePinningPolicyPush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference(), (var2, var3) -> {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPolicy());
         JsonObject var4 = new JsonObject();
         var4.addProperty("policy", var1.getPolicy().name());
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.policy.pinning.update", var3, var4);
      });
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationAddedPush var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversation());
      UUID var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.getConversation().getConversationReference());
      if (var2 != null) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .get(var2);
         if (var3 != null) {
            ConversationReference var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
            if (var4 != null) {
               var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1.getSender()
                  )
               );
               var3.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getAddedAt()));
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.upsert", var4, var3.provide().getAsJsonObject());
            }
         }
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationRemovedPush var1) {
      UUID var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.getConversationReference());
      if (var2 != null) {
         this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().remove(var2);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.remove", var1.getConversationReference(), null);
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationRemoveMessagePush var1) {
      UUID var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.getConversationReference());
      if (var2 != null) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .get(var2);
         if (var3 != null) {
            UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getId());
            var3.ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(var4);
            JsonObject var5 = new JsonObject();
            var5.addProperty("messageId", var4.toString());
            ConversationReference var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
            if (var6 != null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.message.remove", var6, var5);
            }
         }
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationMessageHistoryDeletedPush var1) {
      UUID var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.getConversationReference());
      if (var2 != null) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .get(var2);
         if (var3 != null) {
            UUID var4 = var1.hasSenderUuid() ? CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getSenderUuid()) : null;
            var3.ICOHIIIRCIORCORHRRROOOOCOOROIC(var4);
            JsonObject var5 = new JsonObject();
            if (var4 != null) {
               var5.addProperty("senderUuid", var4.toString());
            }

            ConversationReference var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
            if (var6 != null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.messageHistory.clear", var6, var5);
            }
         }
      }
   }

   public void IOHRRHOHCHIRRIRRHCRHIHHOCCROCO() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GetConversationsRequest.getDefaultInstance(), this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SendConversationMessageRequest var1, Consumer<SendConversationMessageResponse> var2) {
      if (var1.getConversationReference().hasConversationReference() && var1.hasMessageContents()) {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var2x -> var2x.sendConversationMessage(null, var1, var2::accept));
      } else {
         var2.accept(null);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PreSendActionRequest var1, Consumer<PreSendActionResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var2x -> var2x.preSendAction(null, var1, var2::accept));
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LoadConversationRequest var1, Consumer<LoadConversationResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.loadConversation(
               null,
               var1,
               var3x -> {
                  com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var1.getConversationReference()
                  );
                  if (var4 == null) {
                     var2.accept(var3x);
                  } else {
                     var4.CICOIHIRIIHHCIOICHRHICRIRCIOHC(var3x.getMessagesList());
                     if (!var3x.getMessagesList().isEmpty()) {
                        JsonObject var5 = new JsonObject();
                        JsonArray var6 = new JsonArray();

                        for (ConversationMessage var8 : var3x.getMessagesList()) {
                           com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              var8
                           );
                           if (var9 != null) {
                              var6.add(var9.provide());
                           }
                        }

                        var5.add("messages", var6);
                        ConversationReference var10 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
                        if (var10 != null) {
                           this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.messages.sync", var10, var5);
                        }
                     }

                     var2.accept(var3x);
                  }
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CreateConversationRequest var1, Consumer<CreateConversationResponse> var2) {
      if (var1.getType() == ConversationType.CONVERSATION_TYPE_UNSPECIFIED) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3 -> var3.createConversation(null, var1, var2xx -> {
            if (var2xx.hasConversation()) {
               CreateConversationResponse.Status var3x = var2xx.getStatus();
               if (var3x == CreateConversationResponse.Status.STATUS_OK || var3x == CreateConversationResponse.Status.STATUS_CONVERSATION_ALREADY_EXISTS) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2xx.getConversation());
               }
            }

            var2.accept(var2xx);
         }));
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DeleteConversationRequest var1, Consumer<DeleteConversationResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3 -> var3.deleteConversation(null, var1, var3x -> {
            if (var3x.getStatus() == DeleteConversationResponse.Status.STATUS_OK) {
               UUID var4 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.getConversationReference());
               if (var4 != null) {
                  this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().remove(var4);
               }

               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.remove", var1.getConversationReference(), null);
            }

            var2.accept(var3x);
         }));
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DeleteConversationMessageRequest var1, Consumer<DeleteConversationMessageResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.deleteConversationMessage(
               null,
               var1,
               var3x -> {
                  if (var3x.getStatus() == DeleteConversationMessageResponse.Status.STATUS_OK) {
                     UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getMessageId());
                     UUID var5 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.getConversationReference());
                     if (var5 != null) {
                        com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var6 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                           .get(var5);
                        if (var6 != null) {
                           var6.ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(var4);
                        }
                     }

                     JsonObject var7 = new JsonObject();
                     var7.addProperty("messageId", var4.toString());
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.message.remove", var1.getConversationReference(), var7);
                  }

                  var2.accept(var3x);
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DeleteConversationMessageHistoryRequest var1, Consumer<DeleteConversationMessageHistoryResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var2x -> var2x.deleteConversationMessageHistory(null, var1, var2::accept));
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UpdateConversationOwnerRequest var1, Consumer<UpdateConversationOwnerResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3 -> var3.updateConversationOwner(null, var1, var3x -> {
            if (var3x.getStatus() == UpdateConversationOwnerResponse.Status.STATUS_OK) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference());
            }

            var2.accept(var3x);
         }));
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AddConversationParticipantsRequest var1, Consumer<AddConversationParticipantsResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3 -> var3.addConversationParticipants(null, var1, var3x -> {
            if (var3x.getStatus() == AddConversationParticipantsResponse.Status.STATUS_OK) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference());
            }

            var2.accept(var3x);
         }));
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemoveConversationParticipantRequest var1, Consumer<RemoveConversationParticipantResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3 -> var3.removeConversationParticipant(null, var1, var3x -> {
            if (var3x.getStatus() == RemoveConversationParticipantResponse.Status.STATUS_OK) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference());
            }

            var2.accept(var3x);
         }));
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UpdateConversationNameRequest var1, Consumer<UpdateConversationNameResponse> var2) {
      if (var1.getConversationReference().hasConversationReference() && !var1.getName().trim().isEmpty()) {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3 -> var3.updateConversationName(null, var1, var3x -> {
            if (var3x.getStatus() == UpdateConversationNameResponse.Status.STATUS_OK) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference());
            }

            var2.accept(var3x);
         }));
      } else {
         var2.accept(null);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UpdateConversationIconRequest var1, Consumer<UpdateConversationIconResponse> var2) {
      if (var1.getConversationReference().hasConversationReference() && var1.hasImage()) {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3 -> var3.updateConversationIcon(null, var1, var3x -> {
            if (var3x.getStatus() == UpdateConversationIconResponse.Status.STATUS_OK) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference());
            }

            var2.accept(var3x);
         }));
      } else {
         var2.accept(null);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LoadPinnedMessagesRequest var1, Consumer<LoadPinnedMessagesResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.loadPinnedMessages(
               null,
               var1,
               var3x -> {
                  if (var3x.getStatus() == LoadPinnedMessagesResponse.Status.STATUS_OK) {
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var1.getConversationReference()
                     );
                     if (var4 != null) {
                        var4.HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var3x.getMessagesList());
                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.upsert", var1.getConversationReference(), var4.provide().getAsJsonObject());
                     }
                  }

                  var2.accept(var3x);
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AddPinnedMessageRequest var1, Consumer<AddPinnedMessageResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.addPinnedMessage(
               null,
               var1,
               var3x -> {
                  if (var3x.getStatus() == AddPinnedMessageResponse.Status.STATUS_OK) {
                     UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getMessageId());
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var1.getConversationReference()
                     );
                     if (var5 != null) {
                        var5.CIOIORRCHRIHIRHIOIORCOICRHCIRC().add(var4);
                     }

                     JsonObject var6 = new JsonObject();
                     var6.addProperty("messageId", var4.toString());
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.pinned.add", var1.getConversationReference(), var6);
                  }

                  var2.accept(var3x);
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemovePinnedMessageRequest var1, Consumer<RemovePinnedMessageResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.removePinnedMessage(
               null,
               var1,
               var3x -> {
                  if (var3x.getStatus() == RemovePinnedMessageResponse.Status.STATUS_OK) {
                     UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getMessageId());
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var1.getConversationReference()
                     );
                     if (var5 != null) {
                        var5.CIOIORRCHRIHIRHIOIORCOICRHCIRC().remove(var4);
                     }

                     JsonObject var6 = new JsonObject();
                     var6.addProperty("messageId", var4.toString());
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.pinned.remove", var1.getConversationReference(), var6);
                  }

                  var2.accept(var3x);
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SetInvitePolicyRequest var1, Consumer<SetInvitePolicyResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.setInvitePolicy(
               null,
               var1,
               var3x -> {
                  if (var3x.getStatus() == SetInvitePolicyResponse.Status.STATUS_OK) {
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var1.getConversationReference()
                     );
                     if (var4 != null) {
                        var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPolicy());
                     }

                     JsonObject var5 = new JsonObject();
                     var5.addProperty("policy", var1.getPolicy().name());
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.policy.invite.update", var1.getConversationReference(), var5);
                  }

                  var2.accept(var3x);
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SetNamePolicyRequest var1, Consumer<SetNamePolicyResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.setNamePolicy(
               null,
               var1,
               var3x -> {
                  if (var3x.getStatus() == SetNamePolicyResponse.Status.STATUS_OK) {
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var1.getConversationReference()
                     );
                     if (var4 != null) {
                        var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPolicy());
                     }

                     JsonObject var5 = new JsonObject();
                     var5.addProperty("policy", var1.getPolicy().name());
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.policy.name.update", var1.getConversationReference(), var5);
                  }

                  var2.accept(var3x);
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SetIconPolicyRequest var1, Consumer<SetIconPolicyResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.setIconPolicy(
               null,
               var1,
               var3x -> {
                  if (var3x.getStatus() == SetIconPolicyResponse.Status.STATUS_OK) {
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var1.getConversationReference()
                     );
                     if (var4 != null) {
                        var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPolicy());
                     }

                     JsonObject var5 = new JsonObject();
                     var5.addProperty("policy", var1.getPolicy().name());
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.policy.icon.update", var1.getConversationReference(), var5);
                  }

                  var2.accept(var3x);
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SetMessagePinningPolicyRequest var1, Consumer<SetMessagePinningPolicyResponse> var2) {
      if (!var1.getConversationReference().hasConversationReference()) {
         var2.accept(null);
      } else {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2,
            var3 -> var3.setMessagePinningPolicy(
               null,
               var1,
               var3x -> {
                  if (var3x.getStatus() == SetMessagePinningPolicyResponse.Status.STATUS_OK) {
                     com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var1.getConversationReference()
                     );
                     if (var4 != null) {
                        var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPolicy());
                     }

                     JsonObject var5 = new JsonObject();
                     var5.addProperty("policy", var1.getPolicy().name());
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.policy.pinning.update", var1.getConversationReference(), var5);
                  }

                  var2.accept(var3x);
               }
            )
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GetUploadUrlsRequest var1, Consumer<GetUploadUrlsResponse> var2) {
      if (var1.getConversationReference().hasConversationReference() && var1.getItemsCount() != 0) {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var2x -> var2x.getUploadUrls(null, var1, var2::accept));
      } else {
         var2.accept(null);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UnfocusConversationsRequest var1, Consumer<UnfocusConversationsResponse> var2) {
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var2,
         var3 -> var3.unfocusConversations(
            null,
            var1,
            var2xx -> {
               for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                  .values()) {
                  var4.CHRCIHHRIRHRHRCORROIOIORCIORHI().clear();
               }

               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.presend.clear", null, null);
               var2.accept(var2xx);
            }
         )
      );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GetConversationsRequest var1, Consumer<GetConversationsResponse> var2) {
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var2x -> var2x.getConversations(null, var1, var2::accept));
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationReference var1) {
      GetConversationsRequest var2 = GetConversationsRequest.newBuilder().setConversationReference(var1).setLimit(1).build();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
   }

   private void OCOHOHIHCCCCHHRRHCROHIHCRHIRRR() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("conversation.service.update", null, this.RHHIOHHRRHCROHCCIHIHCCOICHHROC.provide().getAsJsonObject());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, @Nullable ConversationReference var2, @Nullable JsonObject var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("action", var1);
      if (var2 != null && var2.hasConversationReference()) {
         var4.addProperty("threadRef", CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getConversationReference()).toString());
      }

      if (var3 != null) {
         var4.add("payload", var3);
      }

      this.HCRRCIIORRHRRRCOOIHHHHOIHHCIRO.add(var4);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ConversationReference var1,
      BiConsumer<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH, ConversationReference> var2
   ) {
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1
      );
      if (var3 != null) {
         ConversationReference var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         if (var4 != null) {
            var2.accept(var3, var4);
         }
      }
   }

   @Nullable
   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationReference var1) {
      UUID var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      return var2 == null
         ? null
         : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .computeIfAbsent(
               var2,
               var1x -> new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1)
            );
   }

   @Nullable
   private UUID HHCCIRHCCCIIRHCROHIORHIRHHIORH(ConversationReference var1) {
      return var1.hasConversationReference() ? CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference()) : null;
   }

   @Nullable
   private ConversationReference RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1
   ) {
      return var1.IIRHOCCCOCOICOROOOIROCCRRIHROC() == null
         ? null
         : ConversationReference.newBuilder()
            .setConversationReference(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1.IIRHOCCCOCOICOROOOIROCCRRIHROC()))
            .build();
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Consumer<?> var1, Consumer<ConversationService.Interface> var2) {
      com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .RCOIHOICHRIIHOCCCIHRRHHRROORCR();
      if (var3 != null
         && var3.ROORROCCCRCRCOHHOROROIRHCIROHR() == com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.READY) {
         var2.accept(var3.OOIOOICRHHHIICOHOHCOHCRRRCRCHH());
      } else {
         var1.accept(null);
      }
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.add("service", this.RHHIOHHRRHCROHCCIHIHCCOICHHROC.provide());
      JsonArray var2 = new JsonArray();

      for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .values()) {
         var2.add(var4.provide());
      }

      var1.add("threads", var2);
      return var1;
   }

   @Nullable
   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      JsonArray var1 = new JsonArray();

      JsonObject var2;
      while ((var2 = this.HCRRCIIORRHRRRCOOIHHHHOIHHCIRO.poll()) != null) {
         var1.add(var2);
      }

      return var1.isEmpty() ? null : var1;
   }

   @Generated
   public com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO HCCROIHCHIOHHIHIOCHOHRCHIOCHOR() {
      return this.RHHIOHHRRHCROHCCIHIHCCOICHHROC;
   }

   @Generated
   public ConcurrentLinkedQueue<JsonObject> HOCHRRHIRCHHOOOOHIORHRIIRRRCRR() {
      return this.HCRRCIIORRHRRRCOOIHHHHOIHHCIRO;
   }
}
