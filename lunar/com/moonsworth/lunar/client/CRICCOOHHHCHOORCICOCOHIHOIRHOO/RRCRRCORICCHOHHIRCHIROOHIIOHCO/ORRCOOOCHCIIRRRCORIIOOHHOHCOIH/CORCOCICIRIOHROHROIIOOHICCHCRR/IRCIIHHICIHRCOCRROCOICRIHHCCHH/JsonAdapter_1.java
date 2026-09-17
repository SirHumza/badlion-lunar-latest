package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.CIIHHCHIRCRRIHOIOCCCROHOIOCCII;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final File HOIOHICHOIORHIOHCIOOHRRIOIICCH = new File(
      IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI + File.separator + "skyblock_rabbit_collection.json"
   );
   public static final RCIROOOOICRHCCRRCIORHHIRCOIIIC CRCHOCCRIRRCRRRCCRCICRIRCORHIR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("entity.experience_orb.pickup");
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH OHIROOCOIROOHROOOIRIHHHRCRIHCI;
   private long HCCOOIHCICOCIRRRRRRCHIRIRHIIOR;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      this.OHIROOCOIROOHROOOIRIHHHRCRIHCI = var1;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.OHIROOCOIROOHROOOIRIHHHRCRIHCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new CRRRICCRROCOHHOHIICIHORCOORRRH());
      if (HOIOHICHOIORHIOHCIOOHRRIOIICCH.exists()) {
         try {
            String var2 = var1.HIHROIHRICRORHIIORCCROCHOORCRO();
            JsonElement var3 = JsonParser.parseReader(new FileReader(HOIOHICHOIORHIOHCIOOHRRIOIICCH));
            if (!var3.isJsonObject()) {
               return;
            }

            JsonObject var4 = var3.getAsJsonObject();
            String var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile().getId().toString();
            if (!var4.has(var5)) {
               return;
            }

            JsonObject var6 = var4.getAsJsonObject(var5);
            if (!var6.has(var2)) {
               return;
            }

            this.OHIROOCOIROOHROOOIRIHHHRCRIHCI
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var6.getAsJsonObject(var2), CRRRICCRROCOHHOHIICIHORCOORRRH.class)
               );
         } catch (IOException var7) {
            com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var7, "Loading SkyBlock Hoppity Rabbit Collection"
            );
         }
      }
   }

   public void ROHRCHCRHOOCOIHRRHRHOHOIIOHHCC(String var1) {
      if (var1 != null) {
         try {
            JsonElement var2;
            if (HOIOHICHOIORHIOHCIOOHRRIOIICCH.exists()) {
               try {
                  var2 = JsonParser.parseReader(new FileReader(HOIOHICHOIORHIOHCIOOHRRIOIICCH));
               } catch (JsonParseException var12) {
                  var2 = new JsonObject();
               }
            } else {
               var2 = new JsonObject();
            }

            if (!var2.isJsonObject()) {
               return;
            }

            String var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile().getId().toString();
            JsonObject var4 = var2.getAsJsonObject();
            JsonObject var5 = var4.getAsJsonObject(var3);
            if (var5 == null) {
               var5 = new JsonObject();
            }

            JsonObject var6 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
               .toJsonTree(this.OHIROOCOIROOHROOOIRIHHHRCRIHCI.RROIIIOIICCRHOCORIOHRIICRIRRHI())
               .getAsJsonObject();
            var5.add(var1, var6);
            var4.add(var3, var5);

            try (FileWriter var7 = new FileWriter(HOIOHICHOIORHIOHCIOOHRRIOIICCH)) {
               IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJson(var4, var7);
            }
         } catch (IOException var13) {
            com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var13, "Saving SkyBlock Hoppity Rabbit Collection"
            );
         }

         this.OHIROOCOIROOHROOOIRIHHHRCRIHCI.RROIIIOIICCRHOCORIOHRIICRIRRHI().CCHCOROOHHCIHOHOCHIHRHOHOCROII(false);
      }
   }

   public TextComponent RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1, long var3) {
      if (this.OHIROOCOIROOHROOOIRIHHHRCRIHCI.OORCOOIRIHCCHHRICICHRIOIIHCRHO() <= 0.0) {
         return (TextComponent)Component.text("Never").style(Style.style(NamedTextColor.RED));
      }

      Style var5 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.OHIROOCOIROOHROOOIRIHHHRCRIHCI.ORIHOCORHHORHROROROCCORRHHIHRH()
      );
      if (var3 >= var1) {
         return (TextComponent)Component.text("Now").style(var5);
      }

      long var6 = (long)((var1 - var3) / this.OHIROOCOIROOHROOOIRIHHHRCRIHCI.OORCOOIRIHCCHHRICICHRIOIIHCRHO()) * 1000L;
      return (TextComponent)Component.text(CIIHHCHIRCRRIHOIOCCCROHOIOCCII.IHRHHHORORIROOCORCIORRCOCHHHRI(var6)).style(var5);
   }

   public TextComponent RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(long var1) {
      long var3 = this.OHIROOCOIROOHROOOIRIHHHRCRIHCI.HRCCRRICOHHIHHHHROICORIIHHHIHR() + this.OHIROOCOIROOHROOOIRIHHHRCRIHCI.OIIHIICHRCRHORIHHCHRHHORIHROOH();
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3);
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, int var2) {
      long var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
      if (var3 - this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR > var2) {
         this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR = var3;
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSoundHandler().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      }
   }
}
