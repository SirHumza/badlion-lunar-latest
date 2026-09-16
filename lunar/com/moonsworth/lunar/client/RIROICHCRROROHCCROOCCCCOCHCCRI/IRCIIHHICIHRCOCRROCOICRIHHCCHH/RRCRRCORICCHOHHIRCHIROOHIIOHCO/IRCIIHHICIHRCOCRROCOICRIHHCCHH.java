package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.cosmetic.v2.EquippedCosmetic;
import com.lunarclient.websocket.cosmetic.v2.Outfit;
import com.lunarclient.websocket.cosmetic.v2.UpdateOutfitRequest;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final UUID ORCOHROHRRHRCCHHIIOHROROHRIIRC;
   private String name;
   private List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> IIICHCIRHHHOCRHRHIRRCOCCOCCRHR;
   private boolean HHRRORICOOHHOICRRHCOCCHHRRRROH;
   @Nullable
   private final Instant OIHIHRCHOCRIOCORIIOORHRHHRIHHO;
   @Nullable
   private final Instant CIRIIOHHICOIOHOOHICOCIRICHCCOH;
   @Nullable
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH HHORIRRRHCCHHICIRIROROICOIROIO;
   @Nullable
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIROCOHOCRHOHCCRIHIRHOICHRIRIR;

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Outfit var0) {
      UUID var1 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getId());
      String var2 = var0.getName();
      boolean var3 = var0.getFavorite();
      Instant var4 = var0.hasCreatedAt() ? CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getCreatedAt()) : null;
      Instant var5 = var0.hasUpdatedAt() ? CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getUpdatedAt()) : null;
      List var6 = var0.getCosmeticsList();
      List var7 = var6.stream()
         .map(
            var0x -> {
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1x = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HCCICHCRRIICICCHCIRCRRIIRROHHC()
                  .OCRIHHORCRCHOCRRORHIIRHOCCCIIH(var0x.getCosmeticId());
               return var1x == null
                  ? null
                  : new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1x, CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0x.getGeckolibMetadata()));
            }
         )
         .filter(
            var0x -> var0x != null
               && var0x.OOICHRIOOOOIOHOIHOIRIRROCHRIOO() != null
               && var0x.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().RCIIIRRHHHHRHRIRHHROIRICHIHROC() != null
         )
         .collect(Collectors.toCollection(ArrayList::new));
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = null;
      if (var0.hasSkinHash()) {
         var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HIROOIRICIRHIHHIIIRCIOHHHIOHIC()
            .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .get(var0.getSkinHash());
      }

      com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = null;
      if (var0.hasBadgeId()) {
         var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HCOHROCRRIIHOORRCCROCROICRICIC()
            .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .get(var0.getBadgeId());
      }

      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var7, var3, var4, var5, var8, var9);
   }

   public Outfit IHCORRIORCRRRIRIIRHCRCCCCOIHRH() {
      Outfit.Builder var1 = Outfit.newBuilder()
         .setId(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(this.ORCOHROHRRHRCCHHIIOHROROHRIIRC))
         .setName(this.name)
         .addAllCosmetics(
            this.IIICHCIRHHHOCRHRHIRRCOCCOCCRHR
               .stream()
               .map(
                  var0 -> EquippedCosmetic.newBuilder()
                     .setCosmeticId((int)var0.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().RCOCIIHHOIHOOCCCIICCRHHRRCCCCH())
                     .setGeckolibMetadata(var0.IHRHIRIOIHOHCOCRIIHCCHROCIIOIR())
                     .build()
               )
               .collect(Collectors.toList())
         )
         .setFavorite(this.HHRRORICOOHHOICRRHCOCCHHRRRROH);
      if (this.OIHIHRCHOCRIOCORIIOORHRHHRIHHO != null) {
         var1.setCreatedAt(CCHORHIOORICCIRIHRIIHIICORIORO.CRICCOOHHHCHOORCICOCOHIHOIRHOO(this.OIHIHRCHOCRIOCORIIOORHRHHRIHHO));
      }

      if (this.CIRIIOHHICOIOHOOHICOCIRICHCCOH != null) {
         var1.setUpdatedAt(CCHORHIOORICCIRIHRIIHIICORIORO.CRICCOOHHHCHOORCICOCOHIHOIRHOO(this.CIRIIOHHICOIOHOOHICOCIRICHCCOH));
      }

      if (this.HHORIRRRHCCHHICIRIROROICOIROIO != null) {
         var1.setSkinHash(this.HHORIRRRHCCHHICIRIROROICOIROIO.getHash());
      }

      if (this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR != null) {
         var1.setBadgeId(this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR.id());
      }

      return var1.build();
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", this.ORCOHROHRRHRCCHHIIOHROROHRIIRC.toString());
      var1.addProperty("name", this.name);
      var1.addProperty("favorite", this.HHRRORICOOHHOICRRHCOCCHHRRRROH);
      var1.addProperty(
         "createdAt",
         this.OIHIHRCHOCRIOCORIIOORHRHHRIHHO == null
            ? null
            : RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR(this.OIHIHRCHOCRIOCORIIOORHRHHRIHHO)
      );
      var1.addProperty(
         "updatedAt",
         this.CIRIIOHHICOIOHOOHICOCIRICHCCOH == null
            ? null
            : RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR(this.CIRIIOHHICOIOHOOHICOCIRICHCCOH)
      );
      JsonArray var2 = new JsonArray();

      for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 : this.IIICHCIRHHHOCRHRHIRRCOCCOCCRHR) {
         var2.add(var4.provide());
      }

      if (this.HHORIRRRHCCHHICIRIROROICOIROIO != null) {
         var1.add("skin", this.HHORIRRRHCCHHICIRIROROICOIROIO.provide());
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HIROOIRICIRHIHHIIIRCIOHHHIOHIC().HRIHCIIROHROICCHICIIIRIIHROHCO() != null) {
         var1.add(
            "skin", IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HIROOIRICIRHIHHIIIRCIOHHHIOHIC().HRIHCIIROHROICCHICIIIRIIHROHCO().provide()
         );
      }

      if (this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR != null) {
         var1.add("badge", this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR.provide());
      }

      var1.add("cosmetics", var2);
      return var1;
   }

   public void HOHIOHROCHIHROHCRRCHCOIICORICI() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RCOIHOICHRIIHOCCCIHRRHHRROORCR()
         .RRICCCRROHRIHHIOCIRCOCCIRHHIIO()
         .updateOutfit(null, UpdateOutfitRequest.newBuilder().setOutfit(this.IHCORRIORCRRRIRIIRHCRCCCCOIHRH()).build(), var0 -> {});
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCRIIICORIICOIIOHIIHICCCOCRICC().IHRHOIHHCIRHICOCOORRHOOCIRRRIH();
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      UUID var1,
      String var2,
      List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> var3,
      boolean var4,
      @Nullable Instant var5,
      @Nullable Instant var6,
      @Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var7,
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8
   ) {
      this.ORCOHROHRRHRCCHHIIOHROROHRIIRC = var1;
      this.name = var2;
      this.IIICHCIRHHHOCRHRHIRRCOCCOCCRHR = var3;
      this.HHRRORICOOHHOICRRHCOCCHHRRRROH = var4;
      this.OIHIHRCHOCRIOCORIIOORHRHHRIHHO = var5;
      this.CIRIIOHHICOIOHOOHICOCIRICHCCOH = var6;
      this.HHORIRRRHCCHHICIRIROROICOIROIO = var7;
      this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR = var8;
   }

   @Generated
   public UUID getId() {
      return this.ORCOHROHRRHRCCHHIIOHROROHRIIRC;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> ROIOCHICROROCCOOHIIIIORCCIRHRO() {
      return this.IIICHCIRHHHOCRHRHIRRCOCCOCCRHR;
   }

   @Generated
   public boolean OIRORIRRIICROHIHOCOOCOCOIRRRHI() {
      return this.HHRRORICOOHHOICRRHCOCCHHRRRROH;
   }

   @Nullable
   @Generated
   public Instant CIHCCCOHCIOOCICCRRROOHOCORHOCI() {
      return this.OIHIHRCHOCRIOCORIIOORHRHHRIHHO;
   }

   @Nullable
   @Generated
   public Instant HRICICOIHIIIRRCRHORCROCICHIIOC() {
      return this.CIRIIOHHICOIOHOOHICOCIRICHCCOH;
   }

   @Nullable
   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RRCICOCHOIRHCICIHCHIIOIHRROHRH() {
      return this.HHORIRRRHCCHHICIRIROROICOIROIO;
   }

   @Nullable
   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RROOHCOHROIIROCRCRICHOHHCCOOCR() {
      return this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR;
   }

   @Generated
   public void setName(String var1) {
      this.name = var1;
   }

   @Generated
   public void HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> var1) {
      this.IIICHCIRHHHOCRHRHIRRCOCCOCCRHR = var1;
   }

   @Generated
   public void IIOCHOIICCIORCOROIROHICCHIOHIC(boolean var1) {
      this.HHRRORICOOHHOICRRHCOCCHHRRRROH = var1;
   }

   @Generated
   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.HHORIRRRHCCHHICIRIROROICOIROIO = var1;
   }

   @Generated
   public void CRRRICCRROCOHHOHIICIHORCOORRRH(@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR = var1;
   }
}
