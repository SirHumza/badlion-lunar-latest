package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.conversation.v1.ConversationMessage;
import com.lunarclient.websocket.conversation.v1.ConversationMessageKind;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.CIIHHCHIRCRRIHOIOCCCROHOIOCCII;
import java.time.Instant;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final UUID RROCCRIROCOHOOROHRIHIOCOROHHOH;
   private Instant CCIOCCRRCCCHICHHRHIHROROIRCHRH;
   @Nullable
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH IHCHHRCICICHHHHROOHOOCRCCRRHCC;
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH IOIRHIIROHIIHHOCRIOCOIRHHHHCCO;
   private ConversationMessageKind IHICCCOCOHHRHOICOCRCHCORHHRRRI;
   private boolean HOHIIIIIHHROICOIRHHHHICORHRRCI;
   private boolean CROHIHRCIHHICIROICORCRHORHOIRI;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      UUID var1, Instant var2, @Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var3, HHCCIRHCCCIIRHCROHIORHIRHHIORH var4, ConversationMessageKind var5, boolean var6
   ) {
      this.RROCCRIROCOHOOROHRIHIOCOROHHOH = var1;
      this.CCIOCCRRCCCHICHHRHIHROROIRCHRH = var2;
      this.IHCHHRCICICHHHHROOHOOCRCCRRHCC = var3;
      this.IOIRHIIROHIIHHOCRIOCOIRHHHHCCO = var4;
      this.IHICCCOCOHHRHOICOCRCHCORHHRRRI = var5;
      this.HOHIIIIIHHROICOIRHHHHICORHRRCI = var6;
      this.CROHIHRCIHHICIROICORCRHORHOIRI = false;
   }

   @Nullable
   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationMessage var0) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = var0.hasSender() ? IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getSender()) : null;
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getContents());
      if (var2 == null) {
         return null;
      }

      if (var1 == null && var2 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var3) {
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var4 = var3.CRIORIORRORCORHROHHIROCHORIHOI();
         var1 = var4.IRICICHCRCCRRCOHCCCIOCOCCRORCH();
      }

      return new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getId()),
         CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getSentAt()),
         var1,
         var2,
         var0.getKind(),
         var0.getPinned()
      );
   }

   public String getPlainText() {
      return this.IOIRHIIROHIIHHOCRIOCOIRHHHHCCO.CCIHIOORIIHRRCRHHCRIHCIIICCOIO();
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", this.RROCCRIROCOHOOROHRIHIOCOROHHOH.toString());
      var1.addProperty("sentAtMs", this.CCIOCCRRCCCHICHHRHIHROROIRCHRH.toEpochMilli());
      var1.addProperty("sentAt", CIIHHCHIRCRRIHOIOCCCROHOIOCCII.IHORRHOROHHHIORCCHRCRIRRHHCCCO(this.CCIOCCRRCCCHICHHRHIHROROIRCHRH.toEpochMilli()));
      var1.addProperty("kind", this.IHICCCOCOHHRHOICOCRCHCORHHRRRI.name());
      var1.addProperty("pinned", this.HOHIIIIIHHROICOIRHHHHICORHRRCI);
      var1.addProperty("updated", this.CROHIHRCIHHICIROICORCRHORHOIRI);
      var1.addProperty("plainText", this.getPlainText());
      if (this.IHCHHRCICICHHHHROOHOOCRCCRRHCC != null) {
         var1.add("sender", this.IHCHHRCICICHHHHROOHOOCRCCRRHCC.provide());
      }

      var1.add("content", this.IOIRHIIROHIIHHOCRIOCOIRHHHHCCO.provide());
      return var1;
   }

   @Generated
   public UUID getId() {
      return this.RROCCRIROCOHOOROHRIHIOCOROHHOH;
   }

   @Generated
   public Instant ORHCHHRRCOHRHRIOHIOOIRHICOOIHR() {
      return this.CCIOCCRRCCCHICHHRHIHROROIRCHRH;
   }

   @Nullable
   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH ORIICICCHRRIHHCOHRRCCCHOIHOCCH() {
      return this.IHCHHRCICICHHHHROOHOOCRCCRRHCC;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH OOOICRHHIRIHHCCOOHRIROICOICOIC() {
      return this.IOIRHIIROHIIHHOCRIOCOIRHHHHCCO;
   }

   @Generated
   public ConversationMessageKind getKind() {
      return this.IHICCCOCOHHRHOICOCRCHCORHHRRRI;
   }

   @Generated
   public boolean ROOHROOCOCOOHCROIRIRHIHOORHIRH() {
      return this.HOHIIIIIHHROICOIRHHHHICORHRRCI;
   }

   @Generated
   public boolean IOORHOHORIIRRORIRHHRHCCORCIRIH() {
      return this.CROHIHRCIHHICIROICORCRHORHOIRI;
   }

   @Generated
   public void CRRRICCRROCOHHOHIICIHORCOORRRH(Instant var1) {
      this.CCIOCCRRCCCHICHHRHIHROROIRCHRH = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.IHCHHRCICICHHHHROOHOOCRCCRRHCC = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.IOIRHIIROHIIHHOCRIOCOIRHHHHCCO = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationMessageKind var1) {
      this.IHICCCOCOHHRHOICOCRCHCORHHRRRI = var1;
   }

   @Generated
   public void HHIHIIOICHCCHIIRRCCRHHHOOCOOCO(boolean var1) {
      this.HOHIIIIIHHROICOIRHHHHICORHRRCI = var1;
   }

   @Generated
   public void HROOORICCCOROOORORCORRHRHORIRC(boolean var1) {
      this.CROHIHRCIHHICIROICORCRHORHOIRI = var1;
   }
}
