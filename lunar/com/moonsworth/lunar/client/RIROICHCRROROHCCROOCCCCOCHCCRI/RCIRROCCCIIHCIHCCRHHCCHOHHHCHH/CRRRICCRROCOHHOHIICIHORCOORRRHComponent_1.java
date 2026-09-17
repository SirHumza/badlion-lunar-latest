package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.conversation.v1.ConversationMessageEmbed;
import com.lunarclient.websocket.conversation.v1.ImageEmbed;
import com.lunarclient.websocket.conversation.v1.LinkPreviewEmbed;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import java.time.Instant;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final String CORHHIRIICROROICHRHIIIIHOCIROC;
   private final String HIIIHOCHOORRCOCRHICROHRRHHORIC;
   @Nullable
   private final Instant OOHOICIROCICRHRRRRHOHCCORHHHHR;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, String var2, @Nullable Instant var3) {
      this.CORHHIRIICROROICHRHIIIIHOCIROC = var1;
      this.HIIIHOCHOORRCOCRHICROHRRHHORIC = var2;
      this.OOHOICIROCICRHRRRRHOHCCORHHHHR = var3;
   }

   @Nullable
   public static CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationMessageEmbed var0) {
      return switch (var0.getEmbedCase()) {
         case IMAGE -> {
            ImageEmbed var2 = var0.getImage();
            yield new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2.getRawUrl(), var2.getProxiedUrl(), var2.getMimeType(), CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getCapturedAt())
            );
         }
         case LINK_PREVIEW -> {
            LinkPreviewEmbed var1 = var0.getLinkPreview();
            yield new CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1.getRawUrl(),
               var1.getProxiedUrl(),
               var1.getTitle(),
               var1.getDescription(),
               var1.getSiteName(),
               var1.getContentType(),
               CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getCapturedAt())
            );
         }
         default -> null;
      };
   }

   public abstract CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH COIICCIOHROIOHCCOIHHIRRRICCCCR();

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("type", this.COIICCIOHROIOHCCOIHHIRRRICCCCR().name());
      var1.addProperty("rawUrl", this.CORHHIRIICROROICHRHIIIIHOCIROC);
      var1.addProperty("proxiedUrl", this.HIIIHOCHOORRCOCRHICROHRRHHORIC);
      if (this.OOHOICIROCICRHRRRRHOHCCORHHHHR != null) {
         var1.addProperty("capturedAtMs", this.OOHOICIROCICRHRRRRHOHCCORHHHHR.toEpochMilli());
      }

      return var1;
   }

   public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      IMAGE,
      LINK_PREVIEW;
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
      private final String CRHIIICHHHCOHCRHOCCCCHHOICOHRC;
      private final String CRCIHRCHHRRIHIHCCHCRRHCOOOOCHI;
      private final String CIHROIHIHOIHOCCCIRCIOHHOHIOHIC;
      private final String COHOHRROHROIOHROHRRIOIIHCHIIRC;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, String var3, String var4, String var5, String var6, @Nullable Instant var7) {
         super(var1, var2, var7);
         this.CRHIIICHHHCOHCRHOCCCCHHOICOHRC = var3;
         this.CRCIHRCHHRRIHIHCCHCRRHCOOOOCHI = var4;
         this.CIHROIHIHOIHOCCCIRCIOHHOHIOHIC = var5;
         this.COHOHRROHROIOHROHRRIOIIHCHIIRC = var6;
      }

      @Override
      public CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH COIICCIOHROIOHCCOIHHIRRRICCCCR() {
         return CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.LINK_PREVIEW;
      }

      @Override
      public JsonElement provide() {
         JsonObject var1 = super.provide().getAsJsonObject();
         var1.addProperty("title", this.CRHIIICHHHCOHCRHOCCCCHHOICOHRC);
         var1.addProperty("description", this.CRCIHRCHHRRIHIHCCHCRRHCOOOOCHI);
         var1.addProperty("siteName", this.CIHROIHIHOIHOCCCIRCIOHHOHIOHIC);
         var1.addProperty("mimeType", this.COHOHRROHROIOHROHRRIOIIHCHIIRC);
         return var1;
      }

      @Generated
      public String getTitle() {
         return this.CRHIIICHHHCOHCRHOCCCCHHOICOHRC;
      }

      @Generated
      public String getDescription() {
         return this.CRCIHRCHHRRIHIHCCHCRRHCOOOOCHI;
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
      private final String HCOIIIOROCCROCHHIHOOHIOIIIOIOC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3, @Nullable Instant var4) {
         super(var1, var2, var4);
         this.HCOIIIOROCCROCHHIHOOHIOIIIOIOC = var3;
      }

      @Override
      public CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH COIICCIOHROIOHCCOIHHIRRRICCCCR() {
         return CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IMAGE;
      }

      @Override
      public JsonElement provide() {
         JsonObject var1 = super.provide().getAsJsonObject();
         var1.addProperty("mimeType", this.HCOIIIOROCCROCHHIHOOHIOIIIOIOC);
         return var1;
      }
   }
}
