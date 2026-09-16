package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.conversation.v1.ConversationImage;
import com.lunarclient.websocket.conversation.v1.ConversationMessageContents;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final List<String> ROCHICOROIOCHOCHICHHRHOHIROIHI;
   @Nullable
   private final CRRRICCRROCOHHOHIICIHORCOORRRH OIRCORHROOHOHCRCIHHROICHCHHHIO;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(List<String> var1, @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var2) {
      this.ROCHICOROIOCHOCHICHHRHOHIROIHI = List.copyOf(var1);
      this.OIRCORHROOHOHCRCIHHROICHCHHHIO = var2;
   }

   @Nullable
   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationMessageContents var0) {
      ArrayList var1 = new ArrayList();

      for (ConversationImage var3 : var0.getImagesList()) {
         var1.add(var3.getUrl());
      }

      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var0.hasEmbed()
         ? com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var0.getEmbed()
         )
         : null;
      switch (var0.getContentsCase()) {
         case PLAIN_TEXT:
            return new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var0.getPlainText(), var1, var4
            );
         case STICKER:
            return new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var0.getSticker().getId(), var0.getSticker().getUrl(), var0.getSticker().getName()
               ),
               var1,
               var4
            );
         case SYSTEM:
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var5 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getSystem());
            if (var5 == null) {
               return null;
            }

            return new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               var5, var1, var4
            );
         case CONTENTS_NOT_SET:
         default:
            return null;
      }
   }

   public abstract com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO ICIIOIIHCOROOHCHHCHIHICIIRHRIO();

   public abstract String CCIHIOORIIHRRCRHHCRIHCIIICCOIO();

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("type", this.ICIIOIIHCOROOHCHHCHIHICIIRHRIO().name());
      JsonArray var2 = new JsonArray();
      this.ROCHICOROIOCHOCHICHHRHOHIROIHI.forEach(var2::add);
      var1.add("imageUrls", var2);
      if (this.OIRCORHROOHOHCRCIHHROICHCHHHIO != null) {
         var1.add("embed", this.OIRCORHROOHOHCRCIHHROICHCHHHIO.provide());
      }

      return var1;
   }

   public static class CRRRICCRROCOHHOHIICIHORCOORRRH
      extends com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI OCCIOCHCHIRROCIHOHCHIOICHHRIOH;

      public CRRRICCRROCOHHOHIICIHORCOORRRH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1, List<String> var2, @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var3) {
         super(var2, var3);
         this.OCCIOCHCHIRROCIHOHCHIOICHHRIOH = var1;
      }

      @Override
      public com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO ICIIOIIHCOROOHCHHCHIHICIIRHRIO() {
         return com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.SYSTEM;
      }

      @Override
      public String CCIHIOORIIHRRCRHHCRIHCIIICCOIO() {
         return this.OCCIOCHCHIRROCIHOHCHIOICHHRIOH.HCCROHRCRIIRCHRRORORCRRHOIIOHH();
      }

      @Override
      public JsonElement provide() {
         JsonObject var1 = super.provide().getAsJsonObject();
         var1.add("systemEvent", this.OCCIOCHCHIRROCIHOHCHIOICHHRIOH.provide());
         return var1;
      }

      @Generated
      public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI CRIORIORRORCORHROHHIROCHORIHOI() {
         return this.OCCIOCHCHIRROCIHOHCHIOICHHRIOH;
      }
   }

   public static class HHCCIRHCCCIIRHCROHIORHIRHHIORH
      extends com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private final com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH ROIRCRICIRHOIORRCRICRRHIRCIHOI;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
         List<String> var2,
         @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var3
      ) {
         super(var2, var3);
         this.ROIRCRICIRHOIORRCRICRRHIRCIHOI = var1;
      }

      @Override
      public com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO ICIIOIIHCOROOHCHHCHIHICIIRHRIO() {
         return com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.STICKER;
      }

      @Override
      public String CCIHIOORIIHRRCRHHCRIHCIIICCOIO() {
         return this.ROIRCRICIRHOIORRCRICRRHIRCIHOI.name();
      }

      @Override
      public JsonElement provide() {
         JsonObject var1 = super.provide().getAsJsonObject();
         JsonObject var2 = new JsonObject();
         var2.addProperty("id", this.ROIRCRICIRHOIORRCRICRRHIRCIHOI.id());
         var2.addProperty("url", this.ROIRCRICIRHOIORRCRICRRHIRCIHOI.url());
         var2.addProperty("name", this.ROIRCRICIRHOIORRCRICRRHIRCIHOI.name());
         var1.add("sticker", var2);
         return var1;
      }
   }

   public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final String CIHRHICCOIRICROHRHIHHOCICIOCOR;
      private final String IOCIHCOCRCHCCIHHOHICCCCIRHIHIR;
      private final String IIIIIORIROIHORRCORRIIORIRCHHOI;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, String var3) {
         this.CIHRHICCOIRICROHRHIHHOCICIOCOR = var1;
         this.IOCIHCOCRCHCCIHHOHICCCCIRHIHIR = var2;
         this.IIIIIORIROIHORRCORRIIORIRCHHOI = var3;
      }

      public String id() {
         return this.CIHRHICCOIRICROHRHIHHOCICIOCOR;
      }

      public String url() {
         return this.IOCIHCOCRCHCCIHHOHICCCCIRHIHIR;
      }

      public String name() {
         return this.IIIIIORIROIHORRCORRIIORIRCHHOI;
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private final String IOCCOORRIHORHRCCRCHRORCHHIHIRO;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, List<String> var2, @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var3) {
         super(var2, var3);
         this.IOCCOORRIHORHRCCRCHRORCHHIHIRO = var1;
      }

      @Override
      public com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO ICIIOIIHCOROOHCHHCHIHICIIRHRIO() {
         return com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.PLAIN_TEXT;
      }

      @Override
      public String CCIHIOORIIHRRCRHHCRIHCIIICCOIO() {
         return this.IOCCOORRIHORHRCCRCHRORCHHIHIRO;
      }

      @Override
      public JsonElement provide() {
         JsonObject var1 = super.provide().getAsJsonObject();
         var1.addProperty("plainText", this.IOCCOORRIHORHRCCRCHRORCHHIHIRO);
         return var1;
      }
   }

   public enum RRCRRCORICCHOHHIRCHIROOHIIOHCO {
      PLAIN_TEXT,
      STICKER,
      SYSTEM;
   }
}
