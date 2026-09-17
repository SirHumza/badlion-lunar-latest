package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.conversation.v1.LunarEmoji;
import com.lunarclient.websocket.conversation.v1.LunarEmojiCategory;
import com.lunarclient.websocket.conversation.v1.LunarSticker;
import com.lunarclient.websocket.conversation.v1.LunarStickerPack;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private int RORRRIORCCIHRICICCIHOOCOOHROCH;
   private int CRIOHOIOIHHCCRRCRHRCOOICOCIRRI;
   private int CORCOCCHOHHHRHOIHROHOCIRIRHRHR;
   private final List<LunarStickerPack> COIOCRIIIHHHHIRRRCCHHHOOCIRHIR = new ArrayList<>();
   private final List<LunarEmojiCategory> RHHCCOIRRIRHCROHHIRHCRHICRHCRH = new ArrayList<>();

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, int var3, List<LunarStickerPack> var4, List<LunarEmojiCategory> var5) {
      this.RORRRIORCCIHRICICCIHOOCOOHROCH = var1;
      this.CRIOHOIOIHHCCRRCRHRCOOICOCIRRI = var2;
      this.CORCOCCHOHHHRHOIHROHOCIRIRHRHR = var3;
      this.COIOCRIIIHHHHIRRRCCHHHOOCIRHIR.clear();
      this.COIOCRIIIHHHHIRRRCCHHHOOCIRHIR.addAll(var4);
      this.RHHCCOIRRIRHCROHHIRHCRHICRHCRH.clear();
      this.RHHCCOIRRIRHCROHHIRHCRHICRHCRH.addAll(var5);
   }

   public void clear() {
      this.RORRRIORCCIHRICICCIHOOCOOHROCH = 0;
      this.CRIOHOIOIHHCCRRCRHRCOOICOCIRRI = 0;
      this.CORCOCCHOHHHRHOIHROHOCIRIRHRHR = 0;
      this.COIOCRIIIHHHHIRRRCCHHHOOCIRHIR.clear();
      this.RHHCCOIRRIRHCROHHIRHCRHICRHCRH.clear();
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("participantLimit", this.RORRRIORCCIHRICICCIHOOCOOHROCH);
      var1.addProperty("totalConversations", this.CRIOHOIOIHHCCRRCRHRCOOICOCIRRI);
      var1.addProperty("maxMessageLength", this.CORCOCCHOHHHRHOIHROHOCIRIRHRHR);
      JsonArray var2 = new JsonArray();
      this.COIOCRIIIHHHHIRRRCCHHHOOCIRHIR.forEach(var2x -> var2.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x)));
      var1.add("stickerPacks", var2);
      JsonArray var3 = new JsonArray();
      this.RHHCCOIRRIRHCROHHIRHCRHICRHCRH.forEach(var2x -> var3.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x)));
      var1.add("emojiCategories", var3);
      return var1;
   }

   private JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LunarStickerPack var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("id", var1.getId());
      var2.addProperty("name", var1.getName());
      var2.addProperty("iconUrl", var1.getIconUrl());
      JsonArray var3 = new JsonArray();
      var1.getStickersList().forEach(var2x -> var3.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x)));
      var2.add("stickers", var3);
      return var2;
   }

   private JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LunarSticker var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("id", var1.getId());
      var2.addProperty("url", var1.getUrl());
      var2.addProperty("name", var1.getName());
      return var2;
   }

   private JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LunarEmojiCategory var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("id", var1.getId());
      var2.addProperty("name", var1.getName());
      var2.addProperty("iconUrl", var1.getIconUrl());
      JsonArray var3 = new JsonArray();
      var1.getEmojisList().forEach(var2x -> var3.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x)));
      var2.add("emojis", var3);
      return var2;
   }

   private JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LunarEmoji var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("id", var1.getId());
      var2.addProperty("url", var1.getUrl());
      var2.addProperty("name", var1.getName());
      return var2;
   }

   @Generated
   public int getParticipantLimit() {
      return this.RORRRIORCCIHRICICCIHOOCOOHROCH;
   }

   @Generated
   public int getTotalConversations() {
      return this.CRIOHOIOIHHCCRRCRHRCOOICOCIRRI;
   }

   @Generated
   public int getMaxMessageLength() {
      return this.CORCOCCHOHHHRHOIHROHOCIRIRHRHR;
   }

   @Generated
   public List<LunarStickerPack> CCCHIOOHOOCRORIRRHRHHHRIIHCORC() {
      return this.COIOCRIIIHHHHIRRRCCHHHOOCIRHIR;
   }

   @Generated
   public List<LunarEmojiCategory> CHCHIOROHHICCROIOORHHRRIOIOIHR() {
      return this.RHHCCOIRRIRHCROHHIRHCRHICRHCRH;
   }

   @Generated
   public void ROORHICROORIRHCCOOHORCCICRIORO(int var1) {
      this.RORRRIORCCIHRICICCIHOOCOOHROCH = var1;
   }

   @Generated
   public void OIIHIOIORRHHRCRRCCORRHHCHRHORH(int var1) {
      this.CRIOHOIOIHHCCRRCRHRCOOICOCIRRI = var1;
   }

   @Generated
   public void HORHCHIRIOIOOCOHOIRIRICICHIORH(int var1) {
      this.CORCOCCHOHHHRHOIHROHOCIRIRHRHR = var1;
   }
}
