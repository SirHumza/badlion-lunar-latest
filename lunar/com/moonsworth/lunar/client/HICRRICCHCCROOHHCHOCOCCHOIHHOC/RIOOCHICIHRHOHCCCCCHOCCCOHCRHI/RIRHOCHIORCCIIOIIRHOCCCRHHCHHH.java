package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import lombok.Generated;

public class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH>
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final GameProfileRepository RHOOOHHCRRRIRHIORHRHRCRORIIRHC = com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.COCOCCIORORHIIROHIOIOHIHCRIOOO()
      .createProfileRepository();
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CHHHOICHCRHOIHRHICRCCICHRHCHHO = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   @Nullable
   private static final Method OCRHOCHOCIOCIIOROROHIIRCHICCOO;
   private final List<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HCCIICRRHIHCROROCRHCHRHOHHOHOO = new ArrayList<>();
   private final Set<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHRHHCIRHROHIHIOHOOOCIHIHHHOOO = new HashSet<>();
   private com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHHORHICHHHROIRHIRCOHRICIHOOHO;
   private String ORORCCOOOHCIRROHOICRRHCOOIHIIR = null;

   @Override
   protected Map<String, com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      return new ConcurrentHashMap<>();
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "saved_skins.json";
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (!this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.remove(var1)) {
         this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.add(0, var1);
      }

      this.RCIHCCRIICRRIRIICCHOHIHIHHROHC();
   }

   private void RCIHCCRIICRRIRIICCHOHIHIHHROHC() {
      while (this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.size() > 8) {
         this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.remove(this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.size() - 1);
      }

      this.HHRHHCIRHROHIHIOHOOOCIHIHHHOOO.clear();
      this.HHRHHCIRHROHIHIOHOOOCIHIHHHOOO.addAll(this.HCCIICRRHIHCROROCRHCHRHOHHOHOO);
      this.IRCCIIIOCIRCCCROHOHOROORRHOHHI();
   }

   public static boolean IHORRHOROHHHIORCCHRCRIRRHHCCCO(UUID var0) {
      return (var0.hashCode() & 1) == 1;
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCCRICOCIHOHCRIHIOIIIOORIROCCI(
      String var1
   ) {
      GameProfile var2 = CHCCORHIOOICOHHOOROOIHICHCRIIH(var1);
      var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2);
      return this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
   }

   public static GameProfile CHCCORHIOOICOHHOOROOIHICHCRIIH(String var0) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19) {
         RHOOOHHCRRRIRHIORHRHRCRORIIRHC.findProfilesByNames(new String[]{var0}, var1);
      } else {
         try {
            Class var2 = Class.forName("com.mojang.authlib.Agent");
            RHOOOHHCRRRIRHIORHRHRCRORIIRHC.getClass()
               .getDeclaredMethod("findProfilesByNames", String[].class, var2, ProfileLookupCallback.class)
               .invoke(RHOOOHHCRRRIRHIORHRHRCRORIIRHC, new String[]{var0}, var2.getDeclaredField("MINECRAFT").get(null), var1);
         } catch (Exception var3) {
            throw new RuntimeException(var3);
         }
      }

      return var1.CIHOIIIHOHCCRCIOCOHHIIHHHOICRO();
   }

   public static GameProfile RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(GameProfile var0) {
      MinecraftSessionService var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSessionService();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19) {
         var0 = var1.fetchProfile(var0.getId(), true).profile();
      } else {
         try {
            var0 = (GameProfile)var1.getClass().getDeclaredMethod("fillProfileProperties", GameProfile.class, boolean.class).invoke(var1, var0, true);
         } catch (Exception var3) {
            throw new RuntimeException(var3);
         }
      }

      return var0;
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OCRRIOCOIROCIRRORICCICHCCHOHRC() {
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile());
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      GameProfile var1
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2;
      if (var1.getId() != null && IHORRHOROHHHIORCCHRCRIRRHHCCCO(var1.getId())) {
         var2 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.SLIM;
      } else {
         var2 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CLASSIC;
      }

      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OICOCIOCIHCOCRHHCOHHOHOCOOIROO() {
      return this.RCCHOORHRCORICCCHRCOCIHOICRRIO(null);
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCCHOORHRCORICCCHRCOCIHOICRRIO(
      String var1
   ) {
      GameProfile var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile();
      if (var2.getProperties().isEmpty()) {
         var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HIOOOIRCCROCRIRCROOHRCCOOIOIOH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getProfileProperties());
      }

      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1 != null ? var1 : var2.getName() + "'s skin");
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      GameProfile var1
   ) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var1.getName() + "'s skin");
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      GameProfile var1, String var2
   ) {
      MinecraftProfileTexture var3 = CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
      if (var3 != null) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3
         );
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var3.getUrl(), var4, var2
         );
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5);
      } else {
         return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
      }
   }

   public static com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      MinecraftProfileTexture var0
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CLASSIC;
      if ("slim".equals(var0.getMetadata("model"))) {
         var1 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.SLIM;
      }

      return var1;
   }

   public static MinecraftProfileTexture CORCOCICIRIOHROHROIIOOHICCHCRR(GameProfile var0) {
      MinecraftSessionService var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSessionService();
      MinecraftProfileTexture var2;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 20) {
         var2 = var1.getTextures(var0).skin();
      } else {
         try {
            Map var3 = (Map)OCRHOCHOCIOCIIOROROHIIRCHICCOO.invoke(var1, var0, false);
            var2 = (MinecraftProfileTexture)var3.get(Type.SKIN);
         } catch (Exception var4) {
            throw new IllegalStateException("Failed to get textures for " + var0.getName() + " from MinecraftSessionService", var4);
         }
      }

      return var2;
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().computeIfAbsent(var1.getHash(), var1x -> var1);
   }

   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
      String var2 = var1.getUserFriendlyName() + "'s skin";
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var1.getDefaultSkinUrl(),
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.SLIM,
            var2
         )
      );
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().remove(var1.getHash());
   }

   @Override
   public void init() {
      super.init();
      if (!this.OHRRCRHHCOHOHHCORRROHROOCOCCHH()) {
         for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 : com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.values()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
         }
      }
   }

   @Override
   public void load(JsonObject var1) {
      HashMap var2 = new HashMap();
      this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.clear();

      for (Entry var4 : var1.entrySet()) {
         String var5 = (String)var4.getKey();
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6;
         if (((JsonElement)var4.getValue()).isJsonObject()) {
            JsonObject var7 = ((JsonElement)var4.getValue()).getAsJsonObject();
            var6 = new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var5,
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.valueOf(
                  var7.get("type").getAsString().toUpperCase()
               ),
               var7.get("name").getAsString()
            );
            JsonElement var8 = var7.get("favoriteIndex");
            if (var8 != null) {
               int var9 = var8.getAsJsonPrimitive().getAsInt();
               this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.add(var6);
               var2.put(var6, var9);
            }
         } else {
            var6 = new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var5,
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CLASSIC,
               "unnamed skin"
            );
         }

         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6);
      }

      this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.sort(Comparator.comparing(var2::get));
      this.RCIHCCRIICRRIRIICCHOHIHIHHROHC();
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      this.IRCCIIIOCIRCCCROHOHOROORRHOHHI();
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().values().forEach(var2 -> {
         JsonObject var3 = new JsonObject();
         var3.addProperty("type", var2.IRIIRHOOOCCHRORRIRIHIHHOORRCOC().toString());
         var3.addProperty("name", var2.getName());
         int var4 = this.HCCIICRRHIHCROROCRHCHRHOHHOHOO.indexOf(var2);
         if (var4 != -1) {
            var3.addProperty("favoriteIndex", var4);
         }

         var1.add(var2.getUrl(), var3);
      });
   }

   @Override
   public void close() {
      this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
   }

   public void IRCCIIIOCIRCCCROHOHOROORRHOHHI() {
      if (this.IHHORHICHHHROIRHIRCOHRICIHOOHO == null) {
         this.IHHORHICHHHROIRHIRCOHRICIHOOHO = this.OICOCIOCIHCOCRHHCOHHOHOCOOIROO();
      }

      this.CHHHOICHCRHOIHRHICRCCICHRHCHHO.IIHRRHORCRCROCHHOHORCHCROCIHRO("actual", this.IHHORHICHHHROIRHIRCOHRICIHOOHO.provide());
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var1 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.values();
      JsonArray var2 = new JsonArray(var1.length);

      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 : var1) {
         var2.add(var6.provide());
      }

      this.CHHHOICHCRHOIHRHICRCCICHRHCHHO.IIHRRHORCRCROCHHOHORCHCROCIHRO("skinTypes", var2);
      Collection var7 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().values();
      JsonArray var8 = new JsonArray(var7.size());

      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 : var7) {
         var8.add(var10.provide());
      }

      this.CHHHOICHCRHOIHRHICRCCICHRHCHHO.IIHRRHORCRCROCHHOHORCHCROCIHRO("savedSkins", var8);
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.IHHORHICHHHROIRHIRCOHRICIHOOHO = var1;
      this.ORORCCOOOHCIRROHOICRRHCOOIHIIR = var1.IRIIRHOOOCCHRORRIRIHIHHOORRCOC().toString();
   }

   @Generated
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.CHHHOICHCRHOIHRHICRCCICHRHCHHO;
   }

   @Generated
   public List<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHRCCCHRCHIROHHOCCCOCIRROHIIOC() {
      return this.HCCIICRRHIHCROROCRHCHRHOHHOHOO;
   }

   @Generated
   public Set<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RIRCOOHCHORRHIHOIROIICCRCHOORO() {
      return this.HHRHHCIRHROHIHIOHOOOCIHIHHHOOO;
   }

   @Generated
   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HRIHCIIROHROICCHICIIIRIIHROHCO() {
      return this.IHHORHICHHHROIRHIRCOHRICIHOOHO;
   }

   @Generated
   public void CHHOCRCRHHCCHCCHROROIOIRHHOHHO(String var1) {
      this.ORORCCOOOHCIRROHOICRRHCOOIHIIR = var1;
   }

   @Generated
   public String ROOOCRCCIRHCIIHCHHRCHICCOHOHII() {
      return this.ORORCCOOOHCIRROHOICRRHCOOIHIIR;
   }

   static {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 20) {
         OCRHOCHOCIOCIIOROROHIIRCHICCOO = null;
      } else {
         try {
            OCRHOCHOCIOCIIOROROHIIRCHICCOO = MinecraftSessionService.class.getDeclaredMethod("getTextures", GameProfile.class, boolean.class);
         } catch (Exception var1) {
            throw new IllegalStateException("Failed to initialized SavedSkinManager", var1);
         }
      }
   }
}
