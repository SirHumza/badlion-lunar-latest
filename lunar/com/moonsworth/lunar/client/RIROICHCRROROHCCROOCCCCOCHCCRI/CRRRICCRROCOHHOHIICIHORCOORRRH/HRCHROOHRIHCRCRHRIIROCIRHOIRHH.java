package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.websocket.serverdiscovery.v1.ServerCard;
import com.lunarclient.websocket.serverdiscovery.v1.ServerSection;
import java.util.ArrayList;
import java.util.List;

public record HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
   @SerializedName("id")
   private final String RCHHIRRIOOHCHCHIIRORCHORHRRRHC;
   @SerializedName("name")
   private final String CHRROCCIRICIORORIOHIRHOROOHIOR;
   @SerializedName("icon")
   private final int HICCOOIOCCIIHIRCOCHCRHORCOHCIR;
   @SerializedName("showNotInterested")
   private final boolean HHHROCHIIHIIRCORRCHORRCCCIOHIC;
   @SerializedName("cardSize")
   private final String COCIIRORCCORHHHRICROCCOORRICCC;
   @SerializedName("cards")
   private final List<CRRRICCRROCOHHOHIICIHORCOORRRH> OOHRCICOOOORRRCICHCOCCCIIHOHOH;
   @SerializedName("description")
   private final String HIHOHRHRORCCHCIHORRCHORRCHRCHO;

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var1, String var2, int var3, boolean var4, String var5, List<CRRRICCRROCOHHOHIICIHORCOORRRH> var6, String var7) {
      this.RCHHIRRIOOHCHCHIIRORCHORHRRRHC = var1;
      this.CHRROCCIRICIORORIOHIRHOROOHIOR = var2;
      this.HICCOOIOCCIIHIRCOCHCRHORCOHCIR = var3;
      this.HHHROCHIIHIIRCORRCHORRCCCIOHIC = var4;
      this.COCIIRORCCORHHHRICROCCOORRICCC = var5;
      this.OOHRCICOOOORRRCICHCOCCCIIHOHOH = var6;
      this.HIHOHRHRORCCHCIHORRCHORRCHRCHO = var7;
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerSection var0) {
      ArrayList var1 = new ArrayList();

      for (ServerCard var3 : var0.getCardsList()) {
         var1.add(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3));
      }

      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         var0.getId(),
         var0.getName(),
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.ICOIRHOIORIIOIOHIOCRIIORHRRRRR(var0.getEmoji()),
         var0.getShowNotInterested(),
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getCardSize()),
         var1,
         var0.getDescription()
      );
   }

   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerSection.CardSize var0) {
      return switch (var0) {
         case CARD_SIZE_SMALL -> "sm";
         default -> "md";
      };
   }

   @SerializedName("id")
   public String id() {
      return this.RCHHIRRIOOHCHCHIIRORCHORHRRRHC;
   }

   @SerializedName("name")
   public String name() {
      return this.CHRROCCIRICIORORIOHIRHOROOHIOR;
   }

   @SerializedName("icon")
   public int HOHHHIOHRHROCRICIROHICICCORHRO() {
      return this.HICCOOIOCCIIHIRCOCHCRHORCOHCIR;
   }

   @SerializedName("showNotInterested")
   public boolean CRHIHICHRCOHHRRRRCCHOIHIRCRIHC() {
      return this.HHHROCHIIHIIRCORRCHORRCCCIOHIC;
   }

   @SerializedName("cardSize")
   public String ROHHROOOCCOOROOCRRRICIIRCOOIOR() {
      return this.COCIIRORCCORHHHRICROCCOORRICCC;
   }

   @SerializedName("cards")
   public List<CRRRICCRROCOHHOHIICIHORCOORRRH> IOCCIORIRIROIIROORROOCIHRRIIHH() {
      return this.OOHRCICOOOORRRCICHCOCCCIIHOHOH;
   }

   @SerializedName("description")
   public String description() {
      return this.HIHOHRHRORCCHCIHORRCHORRCHRCHO;
   }
}
