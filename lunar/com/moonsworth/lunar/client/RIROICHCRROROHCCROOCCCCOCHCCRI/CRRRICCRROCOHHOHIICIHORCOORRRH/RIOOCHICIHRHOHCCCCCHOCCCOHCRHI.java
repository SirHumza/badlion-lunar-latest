package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.websocket.serverdiscovery.v1.ServerModalDetails;

public record RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
   @SerializedName("description")
   private final String RCIOICOCRHCHICIRORORIOCIIHRICH;
   @SerializedName("twitter")
   private final String CIRHHCIRHCOHICIRIRRHHOICRCHHOH;
   @SerializedName("discord")
   private final String RRHRICOOORRICOCIHRHORROCIOOHCH;
   @SerializedName("youtube")
   private final String RHIORRCRIHOOOROHORCIHOIICRIOHO;
   @SerializedName("instagram")
   private final String IIHOCCIRHIROROOCROIOICOIHOIOII;
   @SerializedName("twitch")
   private final String RHOCHHOICCIIIORIHOHCRRRHIOCOII;
   @SerializedName("telegram")
   private final String OHIHIRHHIIHHICOHCRHRIHHCCIIRHC;
   @SerializedName("reddit")
   private final String HRHCCIIRRORCHCROHOROOIRROOOORH;
   @SerializedName("tiktok")
   private final String CCHHRORHHRCOCHRRCRIRICIOIOCOCC;
   @SerializedName("facebook")
   private final String RRHHIHRORCHHCRRRCHRICRHROCIRRR;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10
   ) {
      this.RCIOICOCRHCHICIRORORIOCIIHRICH = var1;
      this.CIRHHCIRHCOHICIRIRRHHOICRCHHOH = var2;
      this.RRHRICOOORRICOCIHRHORROCIOOHCH = var3;
      this.RHIORRCRIHOOOROHORCIHOIICRIOHO = var4;
      this.IIHOCCIRHIROROOCROIOICOIHOIOII = var5;
      this.RHOCHHOICCIIIORIHOHCRRRHIOCOII = var6;
      this.OHIHIRHHIIHHICOHCRHRIHHCCIIRHC = var7;
      this.HRHCCIIRRORCHCROHOROOIRROOOORH = var8;
      this.CCHHRORHHRCOCHRRCRIRICIOIOCOCC = var9;
      this.RRHHIHRORCHHCRRRCHRICRHROCIRRR = var10;
   }

   public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerModalDetails var0) {
      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         var0.getDescription(),
         var0.getTwitter(),
         var0.getDiscord(),
         var0.getYoutube(),
         var0.getInstagram(),
         var0.getTwitch(),
         var0.getTelegram(),
         var0.getReddit(),
         var0.getTiktok(),
         var0.getFacebook()
      );
   }

   @SerializedName("description")
   public String description() {
      return this.RCIOICOCRHCHICIRORORIOCIIHRICH;
   }

   @SerializedName("twitter")
   public String twitter() {
      return this.CIRHHCIRHCOHICIRIRRHHOICRCHHOH;
   }

   @SerializedName("discord")
   public String discord() {
      return this.RRHRICOOORRICOCIHRHORROCIOOHCH;
   }

   @SerializedName("youtube")
   public String youtube() {
      return this.RHIORRCRIHOOOROHORCIHOIICRIOHO;
   }

   @SerializedName("instagram")
   public String instagram() {
      return this.IIHOCCIRHIROROOCROIOICOIHOIOII;
   }

   @SerializedName("twitch")
   public String twitch() {
      return this.RHOCHHOICCIIIORIHOHCRRRHIOCOII;
   }

   @SerializedName("telegram")
   public String IRHCOIIOIRRHHRIIIRCHIOOICRCOHR() {
      return this.OHIHIRHHIIHHICOHCRHRIHHCCIIRHC;
   }

   @SerializedName("reddit")
   public String CHHCOIIHROOCCCCRIRRHCRHHIHCCCH() {
      return this.HRHCCIIRRORCHCROHOROOIRROOOORH;
   }

   @SerializedName("tiktok")
   public String OOHHHIICRRHHIICCICIIHCIHHHOIHI() {
      return this.CCHHRORHHRCOCHRRCRIRICIOIOCOCC;
   }

   @SerializedName("facebook")
   public String COHRCCIHCOHROHIIICIHRCIRHIORHO() {
      return this.RRHHIHRORCHHCRRRCHRICRHROCIRRR;
   }
}
