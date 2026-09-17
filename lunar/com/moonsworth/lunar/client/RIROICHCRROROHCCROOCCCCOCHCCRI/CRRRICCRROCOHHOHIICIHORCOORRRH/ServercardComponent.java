package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.websocket.serverdiscovery.v1.ServerCard;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public record CRRRICCRROCOHHOHIICIHORCOORRRH() {
   @SerializedName("recommendationId")
   private final String OOICCRHHRRCROHCIOHIICCHOIRCOII;
   @SerializedName("serverMappingsId")
   private final String CRHOCHORRCIHRRIOHCHRHHHHRHIICI;
   @SerializedName("name")
   private final String IOHRRCCOIHOHHICRCROCOCOOOIROHR;
   @SerializedName("logoUrl")
   private final String OOCIOOHIIHHHHORCCCICCHRHHCCCCI;
   @SerializedName("backgroundUrl")
   private final String IRROHCIRROHOIHIHCCCCHRHCIHCOCC;
   @SerializedName("primaryColor")
   private final String IIRCHCOOROIHHIOROHORCHIOCCRHIH;
   @SerializedName("primaryAddress")
   private final String IRIIIORROIOHICRRRICRCIROROIOOH;
   @SerializedName("badge")
   private final String IIIORRIRIRCRIIORHOOHIIHHHHRCHO;
   @SerializedName("lastJoined")
   @Nullable
   private final Long IRRIHOOOIIOHRHCCRICRHHORCHCCOC;
   @SerializedName("gameTypes")
   private final List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> HHOHHRICHHCOCOIOOOCRCHIIHCOHHO;
   @SerializedName("announcement")
   @Nullable
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHIHRHOCRIHROOOCROCRORRHHIORIH;
   @SerializedName("regionCodes")
   private final List<String> RRIHROHIORICICHHCORRICRRCOIHRC;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      String var1,
      String var2,
      String var3,
      String var4,
      String var5,
      String var6,
      String var7,
      String var8,
      @Nullable Long var9,
      List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> var10,
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11,
      List<String> var12
   ) {
      this.OOICCRHHRRCROHCIOHIICCHOIRCOII = var1;
      this.CRHOCHORRCIHRRIOHCHRHHHHRHIICI = var2;
      this.IOHRRCCOIHOHHICRCROCOCOOOIROHR = var3;
      this.OOCIOOHIIHHHHORCCCICCHRHHCCCCI = var4;
      this.IRROHCIRROHOIHIHCCCCHRHCIHCOCC = var5;
      this.IIRCHCOOROIHHIOROHORCHIOCCRHIH = var6;
      this.IRIIIORROIOHICRRRICRCIROROIOOH = var7;
      this.IIIORRIRIRCRIIORHOOHIIHHHHRCHO = var8;
      this.IRRIHOOOIIOHRHCCRICRHHORCHCCOC = var9;
      this.HHOHHRICHHCOCOIOOOCRCHIIHCOHHO = var10;
      this.HHIHRHOCRIHROOOCROCRORRHHIORIH = var11;
      this.RRIHROHIORICICHHCORRICRRCOIHRC = var12;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerCard var0) {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH(
         var0.getRecommendationId(),
         var0.getServerMappingsId(),
         var0.getName(),
         var0.getLogoUrl(),
         var0.getBackgroundUrl(),
         var0.hasPrimaryColor() ? IHCICHIIIHORHRIICHOHOHHOCHRORO(var0.getPrimaryColor().getColor()) : null,
         var0.getPrimaryAddress(),
         var0.getBadge().name(),
         var0.hasLastJoined() ? CCHORHIOORICCIRIHRIIHIICORIORO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.getLastJoined()) : null,
         var0.getGameTypesList().stream().map(RRCRRCORICCHOHHIRCHIROOHIIOHCO::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH).toList(),
         var0.hasAnnouncement() ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getAnnouncement()) : null,
         new ArrayList<>(var0.getRegionCodesList())
      );
   }

   private static String IHCICHIIIHORHRIICHOHOHHOCHRORO(int var0) {
      return String.format("#%06X", 16777215 & var0);
   }

   @SerializedName("recommendationId")
   public String HOHCCCOOHOOIHHROIHIOCRCRIHCIOI() {
      return this.OOICCRHHRRCROHCIOHIICCHOIRCOII;
   }

   @SerializedName("serverMappingsId")
   public String HIOOCHHORHICICCORCOIRHHHRICICO() {
      return this.CRHOCHORRCIHRRIOHCHRHHHHRHIICI;
   }

   @SerializedName("name")
   public String name() {
      return this.IOHRRCCOIHOHHICRCROCOCOOOIROHR;
   }

   @SerializedName("logoUrl")
   public String HHIHOOIIRHOCIRHHHOCCRHIOCHIIRI() {
      return this.OOCIOOHIIHHHHORCCCICCHRHHCCCCI;
   }

   @SerializedName("backgroundUrl")
   public String IRICRRICCHRHOIRHCOCOCIIRIHCCIH() {
      return this.IRROHCIRROHOIHIHCCCCHRHCIHCOCC;
   }

   @SerializedName("primaryColor")
   public String ROICOHCHRRHOIOIROIHHHRIHIOCIOO() {
      return this.IIRCHCOOROIHHIOROHORCHIOCCRHIH;
   }

   @SerializedName("primaryAddress")
   public String IRRCRICHHIIRCRORCOIRHROCCICROH() {
      return this.IRIIIORROIOHICRRRICRCIROROIOOH;
   }

   @SerializedName("badge")
   public String HIRHCICHIRHIHCIIRICOIHIOHRRCOH() {
      return this.IIIORRIRIRCRIIORHOOHIIHHHHRCHO;
   }

   @SerializedName("lastJoined")
   @Nullable
   public Long OCIRICCIRORIOOIORCOHORROHOHIIO() {
      return this.IRRIHOOOIIOHRHCCRICRHHORCHCCOC;
   }

   @SerializedName("gameTypes")
   public List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> HHOHIROIOORCHIICRRHHOHCCIIHORH() {
      return this.HHOHHRICHHCOCOIOOOCRCHIIHCOHHO;
   }

   @SerializedName("announcement")
   @Nullable
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIIHIIIIHIHIRCOCIOHCIHOHRRROOH() {
      return this.HHIHRHOCRIHROOOCROCRORRHHIORIH;
   }

   @SerializedName("regionCodes")
   public List<String> RHCCIOROOIRCHRIIIHRRCCHRHRIORO() {
      return this.RRIHROHIORICICHHCORRICRRCOIHRC;
   }
}
