package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.websocket.conversation.v1.Conversation;
import com.lunarclient.websocket.conversation.v1.ConversationMessage;
import com.lunarclient.websocket.conversation.v1.ConversationParticipant;
import com.lunarclient.websocket.conversation.v1.ConversationReference;
import com.lunarclient.websocket.conversation.v1.ConversationType;
import com.lunarclient.websocket.conversation.v1.IconPolicy;
import com.lunarclient.websocket.conversation.v1.InvitePolicy;
import com.lunarclient.websocket.conversation.v1.MessagePinningPolicy;
import com.lunarclient.websocket.conversation.v1.NamePolicy;
import com.lunarclient.websocket.conversation.v1.PreSendAction;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Nullable
   private UUID RORRIRIRCRHHCHIOOIORCCHIRHRHRC;
   private final List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHCICCOCOCIRRCOIHOIIHIRROICOHO = new ArrayList<>();
   private final Deque<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHOCHICHCCHHRRIHHCHOHOHICOIRCR = new ArrayDeque<>();
   private final Set<UUID> RRORHOCOHCHOOCORICICHHCHCOICRR = new HashSet<>();
   private final Map<UUID, PreSendAction> HOHIORHOCRCHHCCROOROOHHRROCORI = new HashMap<>();
   private ConversationType RHHIOIHRIIHCCIRIOIROIRHOOHOCOR;
   @Nullable
   private Instant CROHIICORHIIOROIIIRRCICCCIOHOI;
   @Nullable
   private String name;
   @Nullable
   private String IRHRORRIIIIIOCOOICHCHOIHRRRHCO;
   @Nullable
   private UUID ICRRIIRCHHHCROORIRIOHIOOOIHOII;
   private int RORRRIORCCIHRICICCIHOOCOOHROCH;
   private InvitePolicy HCRICROOCHHIRRHIHHHOIRIHRCORHC = InvitePolicy.INVITE_POLICY_UNSPECIFIED;
   private NamePolicy ORIRRRCIICIIOHIRICCIOHIICRCIOC = NamePolicy.NAME_POLICY_UNSPECIFIED;
   private IconPolicy RCHOOOIROCCHRHIHHOIICHHIHROORI = IconPolicy.ICON_POLICY_UNSPECIFIED;
   private MessagePinningPolicy ROIHCICOORCRICHRRORCOOHOHRHRHI = MessagePinningPolicy.MESSAGE_PINNING_POLICY_UNSPECIFIED;
   private int RROIRCRCHIOHIOROCOHIHIIOOIIOHC;
   private boolean CHRRCIRCOCICOCORHRIOCCCICHCRRR = true;
   @Nullable
   private Instant RIIROHHCCRCIHICRIOIIOICCICORHI;
   @Nullable
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH HOHHIHOROIICOHHHCHRCHRCIOOORHO;
   @Nullable
   private UUID IIOIOHHHOORRHHIROCCHRHCIRIOCCI;
   @Nullable
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH IIRHIRCRICIROCCOIIRIHHICCIICOH;
   @Nullable
   private Instant OHCIHHRIHORHOCIHORROIIHHCCOHIR;

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(ConversationReference var1) {
      if (var1.hasConversationReference()) {
         this.RORRIRIRCRHHCHIOOIORCCHIRHRHRC = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getConversationReference());
      }
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(Conversation var0) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0.getConversationReference());
      var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0);
      return var1;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Conversation var1) {
      this.CHRRCIRCOCICOCORHRIOCCCICHCRRR = false;
      if (var1.getConversationReference().hasConversationReference()) {
         this.RORRIRIRCRHHCHIOOIORCCHIRHRHRC = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1.getConversationReference().getConversationReference()
         );
      }

      this.RHHIOIHRIIHCCIRIOIROIRHOOHOCOR = var1.getType();
      this.CROHIICORHIIOROIIIRRCICCCIOHOI = var1.hasLastActivityTime()
         ? CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getLastActivityTime())
         : null;
      this.name = var1.hasName() ? var1.getName() : null;
      this.IRHRORRIIIIIOCOOICHCHOIHRRRHCO = var1.hasConversationImageUrl() ? var1.getConversationImageUrl() : null;
      this.ICRRIIRCHHHCROORIRIOHIOOOIHOII = var1.hasOwnerUuid() ? CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getOwnerUuid()) : null;
      this.RORRRIORCCIHRICICCIHOOCOOHROCH = var1.hasParticipantLimit() ? var1.getParticipantLimit() : 0;
      this.HCRICROOCHHIRRHIHHHOIRIHRCORHC = var1.hasInvitePolicy() ? var1.getInvitePolicy() : InvitePolicy.INVITE_POLICY_UNSPECIFIED;
      this.ORIRRRCIICIIOHIRICCIOHIICRCIOC = var1.hasNamePolicy() ? var1.getNamePolicy() : NamePolicy.NAME_POLICY_UNSPECIFIED;
      this.RCHOOOIROCCHRHIHHOIICHHIHROORI = var1.hasIconPolicy() ? var1.getIconPolicy() : IconPolicy.ICON_POLICY_UNSPECIFIED;
      this.ROIHCICOORCRICHRRORCOOHOHRHRHI = var1.hasMessagePinningPolicy()
         ? var1.getMessagePinningPolicy()
         : MessagePinningPolicy.MESSAGE_PINNING_POLICY_UNSPECIFIED;
      if (var1.hasUserState()) {
         this.RROIRCRCHIOHIOROCOHIHIIOOIIOHC = var1.getUserState().getUnreadCount();
         this.RIIROHHCCRCIHICRIOIIOICCICORHI = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getUserState().getLastSeenTime());
      } else {
         this.RROIRCRCHIOHIOROCOHIHIIOOIIOHC = 0;
         this.RIIROHHCCRCIHICRIOIIOICCICORHI = null;
      }

      this.HHCICCOCOCIRRCOIHOIIHIRROICOHO.clear();

      for (ConversationParticipant var3 : var1.getParticipantsList()) {
         this.HHCICCOCOCIRRCOIHOIIHIRROICOHO.add(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3));
      }

      if (var1.hasLatestMessage()) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1.getLatestMessage()
         );
         if (var4 != null) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      Optional var2 = this.OHOCHICHCCHHRRIHHCHOHOHICOIRCR.stream().filter(var1x -> var1x.getId().equals(var1.getId())).findFirst();
      if (var2.isPresent()) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get();
         var3.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.ORHCHHRRCOHRHRIOHIOOIRHICOOIHR());
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.ORIICICCHRRIHHCOHRRCCCHOIHOCCH());
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.OOOICRHHIRIHHCCOOHRIROICOICOIC());
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getKind());
         var3.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO(var1.ROOHROOCOCOOHCROIRIRHIHOORHIRH());
         var3.HROOORICCCOROOORORCORRHRHORIRC(var1.IOORHOHORIIRRORIRHHRHCCORCIRIH());
         if (var1.ROOHROOCOCOOHCROIRIRHIHOORHIRH()) {
            this.RRORHOCOHCHOOCORICICHHCHCOICRR.add(var1.getId());
         } else {
            this.RRORHOCOHCHOOCORICICHHCHCOICRR.remove(var1.getId());
         }
      } else {
         this.OHOCHICHCCHHRRIHHCHOHOHICOIRCR.addFirst(var1);
         if (var1.ROOHROOCOCOOHCROIRIRHIHOORHIRH()) {
            this.RRORHOCOHCHOOCORICICHHCHCOICRR.add(var1.getId());
         }
      }
   }

   public void CICOIHIRIIHHCIOICHRHICRIRCIOHC(List<ConversationMessage> var1) {
      for (ConversationMessage var3 : var1) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3
         );
         if (var4 != null) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
         }
      }
   }

   public void ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(UUID var1) {
      this.OHOCHICHCCHHRRIHHCHOHOHICOIRCR.removeIf(var1x -> var1x.getId().equals(var1));
      this.RRORHOCOHCHOOCORICICHHCHCOICRR.remove(var1);
   }

   public void ICOHIIIRCIORCORHRRROOOOCOOROIC(@Nullable UUID var1) {
      HashSet var2 = new HashSet();
      this.OHOCHICHCCHHRRIHHCHOHOHICOIRCR.removeIf(var2x -> {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var2x.ORIICICCHRRIHHCOHRRCCCHOIHOCCH();
         boolean var4 = var1 == null || var3 != null && var1.equals(var3.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI());
         if (var4) {
            var2.add(var2x.getId());
         }

         return var4;
      });
      this.RRORHOCOHCHOOCORICICHHCHCOICRR.removeAll(var2);
   }

   public void HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(List<ConversationMessage> var1) {
      this.RRORHOCOHCHOOCORICICHHCHCOICRR.clear();

      for (ConversationMessage var3 : var1) {
         UUID var4 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.getId());
         this.RRORHOCOHCHOOCORICICHHCHCOICRR.add(var4);
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3
         );
         if (var5 != null) {
            var5.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO(true);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UuidAndUsername var1, PreSendAction var2) {
      UUID var3 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getUuid());
      if (var2 != PreSendAction.PRE_SEND_ACTION_NONE && var2 != PreSendAction.PRE_SEND_ACTION_UNSPECIFIED) {
         this.HOHIORHOCRCHHCCROOROOHHRROCORI.put(var3, var2);
      } else {
         this.HOHIORHOCRCHHCCROOROOHHRROCORI.remove(var3);
      }
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      if (this.RORRIRIRCRHHCHIOOIORCCHIRHRHRC != null) {
         var1.addProperty("conversationId", this.RORRIRIRCRHHCHIOOIORCCHIRHRHRC.toString());
      }

      var1.addProperty(
         "type",
         this.RHHIOIHRIIHCCIRIOIROIRHOOHOCOR != null ? this.RHHIOIHRIIHCCIRIOIROIRHOOHOCOR.name() : ConversationType.CONVERSATION_TYPE_UNSPECIFIED.name()
      );
      if (this.name != null) {
         var1.addProperty("name", this.name);
      }

      if (this.IRHRORRIIIIIOCOOICHCHOIHRRRHCO != null) {
         var1.addProperty("conversationImageUrl", this.IRHRORRIIIIIOCOOICHCHOIHRRRHCO);
      }

      if (this.ICRRIIRCHHHCROORIRIOHIOOOIHOII != null) {
         var1.addProperty("ownerUuid", this.ICRRIIRCHHHCROORIRIOHIOOOIHOII.toString());
      }

      var1.addProperty("participantLimit", this.RORRRIORCCIHRICICCIHOOCOOHROCH);
      var1.addProperty("invitePolicy", this.HCRICROOCHHIRRHIHHHOIRIHRCORHC.name());
      var1.addProperty("namePolicy", this.ORIRRRCIICIIOHIRICCIOHIICRCIOC.name());
      var1.addProperty("iconPolicy", this.RCHOOOIROCCHRHIHHOIICHHIHROORI.name());
      var1.addProperty("messagePinningPolicy", this.ROIHCICOORCRICHRRORCOOHOHRHRHI.name());
      var1.addProperty("unreadCount", this.RROIRCRCHIOHIOROCOHIHIIOOIIOHC);
      var1.addProperty("isStub", this.CHRRCIRCOCICOCORHRIOCCCICHCRRR);
      if (this.RIIROHHCCRCIHICRIOIIOICCICORHI != null) {
         var1.addProperty("lastSeenTimeMs", this.RIIROHHCCRCIHICRIOIIOICCICORHI.toEpochMilli());
      }

      if (this.CROHIICORHIIOROIIIRRCICCCIOHOI != null) {
         var1.addProperty("lastActivityTimeMs", this.CROHIICORHIIOROIIIRRCICCCIOHOI.toEpochMilli());
      }

      JsonArray var2 = new JsonArray();
      this.HHCICCOCOCIRRCOIHOIIHIRROICOHO.forEach(var1x -> var2.add(var1x.provide()));
      var1.add("participants", var2);
      JsonArray var3 = new JsonArray();
      this.RRORHOCOHCHOOCORICICHHCHCOICRR.forEach(var1x -> var3.add(var1x.toString()));
      var1.add("pinnedMessageIds", var3);
      JsonArray var4 = new JsonArray();
      this.HOHIORHOCRCHHCCROOROOHHRROCORI.forEach((var1x, var2x) -> {
         JsonObject var3x = new JsonObject();
         var3x.addProperty("userId", var1x.toString());
         var3x.addProperty("action", var2x.name());
         var4.add(var3x);
      });
      var1.add("preSendActions", var4);
      JsonArray var5 = new JsonArray();
      this.OHOCHICHCCHHRRIHHCHOHOHICOIRCR.forEach(var1x -> var5.add(var1x.provide()));
      var1.add("messages", var5);
      return var1;
   }

   @Nullable
   @Generated
   public UUID IIRHOCCCOCOICOROOOIROCCRRIHROC() {
      return this.RORRIRIRCRHHCHIOOIORCCHIRHRHRC;
   }

   @Generated
   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> ROOOCIOIOHHIOICHOIHIHHORRIOOIC() {
      return this.HHCICCOCOCIRRCOIHOIIHIRROICOHO;
   }

   @Generated
   public Deque<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HCOHCOROIHHIIRCHOIRROCHIRHRCCH() {
      return this.OHOCHICHCCHHRRIHHCHOHOHICOIRCR;
   }

   @Generated
   public Set<UUID> CIOIORRCHRIHIRHIOIORCOICRHCIRC() {
      return this.RRORHOCOHCHOOCORICICHHCHCOICRR;
   }

   @Generated
   public Map<UUID, PreSendAction> CHRCIHHRIRHRHRCORROIOIORCIORHI() {
      return this.HOHIORHOCRCHHCCROOROOHHRROCORI;
   }

   @Generated
   public ConversationType getType() {
      return this.RHHIOIHRIIHCCIRIOIROIRHOOHOCOR;
   }

   @Nullable
   @Generated
   public Instant HOIHHCCCCOOIHCIHCHOIHIRCIHHOOH() {
      return this.CROHIICORHIIOROIIIRRCICCCIOHOI;
   }

   @Nullable
   @Generated
   public String getName() {
      return this.name;
   }

   @Nullable
   @Generated
   public String getConversationImageUrl() {
      return this.IRHRORRIIIIIOCOOICHCHOIHRRRHCO;
   }

   @Nullable
   @Generated
   public UUID HOHRHCROHHHHCICIIRRHIHOORHHHCO() {
      return this.ICRRIIRCHHHCROORIRIOHIOOOIHOII;
   }

   @Generated
   public int getParticipantLimit() {
      return this.RORRRIORCCIHRICICCIHOOCOOHROCH;
   }

   @Generated
   public InvitePolicy getInvitePolicy() {
      return this.HCRICROOCHHIRRHIHHHOIRIHRCORHC;
   }

   @Generated
   public NamePolicy getNamePolicy() {
      return this.ORIRRRCIICIIOHIRICCIOHIICRCIOC;
   }

   @Generated
   public IconPolicy getIconPolicy() {
      return this.RCHOOOIROCCHRHIHHOIICHHIHROORI;
   }

   @Generated
   public MessagePinningPolicy getMessagePinningPolicy() {
      return this.ROIHCICOORCRICHRRORCOOHOHRHRHI;
   }

   @Generated
   public int getUnreadCount() {
      return this.RROIRCRCHIOHIOROCOHIHIIOOIIOHC;
   }

   @Generated
   public boolean HHRHIHCIOHRIICIHCHCCOIOCIRHHIO() {
      return this.CHRRCIRCOCICOCORHRIOCCCICHCRRR;
   }

   @Nullable
   @Generated
   public Instant CRRIHHHCROOICHRCIRRRHHIIIORCRR() {
      return this.RIIROHHCCRCIHICRIOIIOICCICORHI;
   }

   @Nullable
   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RIIIHIICICHRICCOCIOIIIOHRROCHI() {
      return this.HOHHIHOROIICOHHHCHRCHRCIOOORHO;
   }

   @Nullable
   @Generated
   public UUID IRIIORCHHIHHOCRCRRCRICRIHOHRRI() {
      return this.IIOIOHHHOORRHHIROCCHRHCIRIOCCI;
   }

   @Nullable
   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IICHCOICHRIRCRICHIRICRRCOIRICI() {
      return this.IIRHIRCRICIROCCOIIRIHHICCIICOH;
   }

   @Nullable
   @Generated
   public Instant RORCIOCOROIOORORIROOHRCCRRICCI() {
      return this.OHCIHHRIHORHOCIHORROIIHHCCOHIR;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationType var1) {
      this.RHHIOIHRIIHCCIRIOIROIRHOOHOCOR = var1;
   }

   @Generated
   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(@Nullable Instant var1) {
      this.CROHIICORHIIOROIIIRRCICCCIOHOI = var1;
   }

   @Generated
   public void setName(@Nullable String var1) {
      this.name = var1;
   }

   @Generated
   public void COIRIHRCCIIHCCICRHHOHRIOICRRII(@Nullable String var1) {
      this.IRHRORRIIIIIOCOOICHCHOIHRRRHCO = var1;
   }

   @Generated
   public void RCOCOHHCOOICCICCRCCORORROHRCCC(@Nullable UUID var1) {
      this.ICRRIIRCHHHCROORIRIOHIOOOIHOII = var1;
   }

   @Generated
   public void ROORHICROORIRHCCOOHORCCICRIORO(int var1) {
      this.RORRRIORCCIHRICICCIHOOCOOHROCH = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InvitePolicy var1) {
      this.HCRICROOCHHIRRHIHHHOIRIHRCORHC = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(NamePolicy var1) {
      this.ORIRRRCIICIIOHIRICCIOHIICRCIOC = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IconPolicy var1) {
      this.RCHOOOIROCCHRHIHHOIICHHIHROORI = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MessagePinningPolicy var1) {
      this.ROIHCICOORCRICHRRORCOOHOHRHRHI = var1;
   }

   @Generated
   public void RHHIIRORCOIORHIOHRHCIHRHHIRCRH(int var1) {
      this.RROIRCRCHIOHIOROCOHIHIIOOIIOHC = var1;
   }

   @Generated
   public void OIOCHROIHRRIORCCCIIORRHICHORCR(boolean var1) {
      this.CHRRCIRCOCICOCORHRIOCCCICHCRRR = var1;
   }

   @Generated
   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(@Nullable Instant var1) {
      this.RIIROHHCCRCIHICRIOIIOICCICORHI = var1;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.HOHHIHOROIICOHHHCHRCHRCIOOORHO = var1;
   }

   @Generated
   public void IORRORCRRHRRORHIRHRROHCRRIHRII(@Nullable UUID var1) {
      this.IIOIOHHHOORRHHIROCCHRHCIRIOCCI = var1;
   }

   @Generated
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.IIRHIRCRICIROCCOIIRIHHICCIICOH = var1;
   }

   @Generated
   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(@Nullable Instant var1) {
      this.OHCIHHRIHORHOCIHORROIIHHCCOHIR = var1;
   }
}
