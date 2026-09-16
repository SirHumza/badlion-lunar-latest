package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOROCROIRCHIHIHHOOIRIIIRRCRHI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import lombok.Generated;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static IRCIIHHICIHRCOCRROCOICRIHHCCHH OHOIHIRHIIIOIOROCCOHOROIOCIRCI;
   private static IRCIIHHICIHRCOCRROCOICRIHHCCHH CRCORRIIIHIIHHRICHHOROIOIIIHIR;
   private static RCIROOOOICRHCCRRCIORHHIRCOIIIC CCRIOHCRRICIIIORCROOHCRCOIIORI = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "lunar", "sound_mod/sound_mappings.json"
   );
   private Map<RCIROOOOICRHCCRRCIORHHIRCOIIIC, String> CHIHCOORORCOCHIRIOOOHOHRIHCICH = new HashMap<>();
   private Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ROROHCHOORHOHIIICOIRHRROIHRHHH = new HashMap<>();

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH CRIRHOCOHIOHCCCHOCRCICRCCCORCH() {
      if (OHOIHIRHIIIOIOROCCOHOROIOCIRCI == null) {
         OHOIHIRHIIIOIOROCCOHOROIOCIRCI = RIIRCHROOOOORRCIRIOCHCOIOHRRHH(true);
      }

      return OHOIHIRHIIIOIOROCCOHOROIOCIRCI;
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH HCCIIHHCHCHCOICIRCIIHOROHHCROH() {
      if (CRCORRIIIHIIHHRICHHOROIOIIIHIR == null) {
         CRCORRIIIHIIHHRICHHOROIOIIIHIR = RIIRCHROOOOORRCIRIOCHCOIOHRRHH(false);
      }

      return CRCORRIIIHIIHHRICHHOROIOIIIHIR;
   }

   private static IRCIIHHICIHRCOCRROCOICRIHHCCHH RIIRCHROOOOORRCIRIOCHCOIOHRRHH(boolean var0) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getResourceManager();
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();

      try {
         JsonObject var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCRIOHCRRICIIIORCROOHCRCOIIORI, var1);
         if (var3 == null) {
            return var2;
         }

         JsonObject var4 = var3.get(var0 ? "modern" : "legacy").getAsJsonObject();

         for (Entry var6 : var4.get("name_mappings").getAsJsonObject().entrySet()) {
            var2.CHIHCOORORCOCHIRIOOOHOHRIHCICH.put(RCIROOOOICRHCCRRCIORHHIRCOIIIC.create((String)var6.getKey()), ((JsonElement)var6.getValue()).getAsString());
         }

         for (Entry var11 : var4.get("category_mappings").getAsJsonObject().entrySet()) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
            JsonObject var8 = ((JsonElement)var11.getValue()).getAsJsonObject();
            var7.IOHCRHORCHRHIHOOCIHHORHCROHCHI = (String)var11.getKey();
            var7.prettyName = var8.get("pretty_name").getAsString();
            var7.CHOHIIRHCHOOHHRICCHHOICHCHORIH = var7.IOHCRHORCHRHIHOOCIHHORHCROHCHI;
            var7.index = 0;
            var2.ROROHCHOORHOHIIICOIRHRROIHRHHH.put((String)var11.getKey(), var7);
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var7, var7.CHOHIIRHCHOOHHRICCHHOICHCHORIH, 1);
         }
      } catch (Exception var9) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, "Loading SoundMappings");
      }

      return var2;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var0, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2, int var3
   ) {
      if (var0.has("sub_mappings")) {
         var0.get("sub_mappings").getAsJsonObject().entrySet().forEach(var3x -> {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
            var4.IOHCRHORCHRHIHOOCIHHORHCROHCHI = var3x.getKey();
            var4.prettyName = var3x.getValue().getAsJsonObject().get("pretty_name").getAsString();
            var4.CHOHIIRHCHOOHHRICCHHOICHCHORIH = var2 + "." + var4.IOHCRHORCHRHIHOOCIHHORHCROHCHI;
            var4.index = var3;
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x.getValue().getAsJsonObject(), var4, var4.CHOHIIRHCHOOHHRICCHHOICHCHORIH, var3 + 1);
            var1.IRHOIRHHOOIOOCCHCRHOCCHIOHCCHR.put(var4.IOHCRHORCHRHIHOOCIHHORHCROHCHI, var4);
         });
      }
   }

   @Nullable
   private static JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      String var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
      return var2 == null ? null : new JsonParser().parse(var2).getAsJsonObject();
   }

   @Nullable
   private static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = var1.bridge$getResource(var0);
      if (var2 == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Couldn't find the sound mappings file: " + var0
         );
         return null;
      }

      try (InputStream var3 = var2.bridge$getInputStream()) {
         return IOUtils.toString(var3);
      }
   }

   @Generated
   public Map<RCIROOOOICRHCCRRCIORHHIRCOIIIC, String> HOCCRIHHIOHHRCCHOROICOROOHHOHC() {
      return this.CHIHCOORORCOCHIRIOOOHOHRIHCICH;
   }

   @Generated
   public Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RIRHOHCRCIICIRHIOHHCHHHIOICORC() {
      return this.ROROHCHOORHOHIIICOIRHRROIHRHHH;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private String IOHCRHORCHRHIHOOCIHHORHCROHCHI;
      private String prettyName;
      private String CHOHIIRHCHOOHHRICCHHOICHCHORIH;
      private int index = 0;
      private Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IRHOIRHHOOIOOCCHCRHOCCHIOHCCHR = new HashMap<>();

      @Generated
      public String OOHCRIOHOCHROROHHOIHOIRRORRIHH() {
         return this.IOHCRHORCHRHIHOOCIHHORHCROHCHI;
      }

      @Generated
      public String getPrettyName() {
         return this.prettyName;
      }

      @Generated
      public String HHRRROCROCCHROHIOCICIHICICCCRO() {
         return this.CHOHIIRHCHOOHHRICCHHOICHCHORIH;
      }

      @Generated
      public int getIndex() {
         return this.index;
      }

      @Generated
      public Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IRHRHHROCOHHCCCRCOCHCHCIIHHOIR() {
         return this.IRHOIRHHOOIOOCCHCRHOCCHIOHCCHR;
      }
   }
}
