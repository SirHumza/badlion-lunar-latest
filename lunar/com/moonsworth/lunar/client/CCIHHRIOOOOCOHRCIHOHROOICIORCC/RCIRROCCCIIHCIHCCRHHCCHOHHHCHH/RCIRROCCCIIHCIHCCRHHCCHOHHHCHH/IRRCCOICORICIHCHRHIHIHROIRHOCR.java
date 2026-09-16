package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IRRCCOICORICIHCHRHIHIHROIRHOCR
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final List<Consumer<JsonObject>> CRIHICCOHOCHORHRROIHHRROIHIHIH = new ArrayList<>();

   public IRRCCOICORICIHCHRHIHIHROIRHOCR() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .HHRCIHOCOCHOHIOIIORRRIIRRIIIIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIRHHICCCOCCRRCOCOCCCOIROOIOOR,
               (var1, var2, var3) -> {
                  if (var3 == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.LOADED_CONFIG) {
                     this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().HOORIHHORRRRHCIRCIHCCCRRCCICIR()
                     );
                  }
               }
            );
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("clearGlass", var3, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("redString", var3, (var0, var1x) -> var1x.add("coloredString", var0));
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("fireHeight", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("shieldHeight", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("minimalViewBobbing", var3);
      } else if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO
         )
       {
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("glint", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("hideFoliage", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("groundArrows", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("stuckArrows", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("hideSkulls", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("hideHelmet", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("hideChest", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("hideLeggings", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("hideBoots", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("selfOnly", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("hideEndportals", var3);
         this.CORCOCICIRIOHROHROIIOOHICCHCRR("entityShadow", var3);
      } else if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OHHRIOHROOIHOROCIRHCHORIHRRRRI) {
         var3.addProperty("seenOverlayMigration", false);
      }

      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO
         )
       {
         if (this.OCIIROIOORRIOIIIRHIRRCCIIRRROH(var3)) {
            if (var3.has("enabled")) {
               var3.remove("enabled");
            }

            var3.add("enabled", new JsonPrimitive(true));
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
         if (var4.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIRHHICCCOCCRRCOCOCCCOIROOIOOR
            )
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.LOADED_CONFIG) {
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4);
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonElement var1, JsonObject var2) {
      String var3 = var1.getAsString();
      if (var3.equalsIgnoreCase("regular")) {
         var2.addProperty("clearGlass", true);
      } else if (var3.equalsIgnoreCase("all")) {
         var2.addProperty("clearGlass", true);
         var2.addProperty("clearColoredGlass", true);
      }
   }

   private void CORCOCICIRIOHROHROIIOOHICCHCRR(String var1, JsonObject var2) {
      if (var2.has(var1)) {
         JsonElement var3 = var2.remove(var1);
         this.CRIHICCOHOCHORHRROIHHRROIHIHIH.add(var2x -> var2x.add(var1, var3));
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, JsonObject var2, IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3) {
      if (var2.has(var1)) {
         JsonElement var4 = var2.remove(var1);
         this.CRIHICCOHOCHORHRROIHHRROIHIHIH.add(var2x -> var3.addOption(var4, var2x));
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
      if (!this.CRIHICCOHOCHORHRROIHHRROIHIHIH.isEmpty()) {
         JsonObject var2 = new JsonObject();
         var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
         if (this.OCIIROIOORRIOIIIRHIRRCCIIRRROH(var2)) {
            if (var2.has("enabled")) {
               var2.remove("enabled");
            }

            var2.add("enabled", new JsonPrimitive(true));
         }

         if (var2.has("version")) {
            var2.remove("version");
         }

         var2.addProperty(
            "version",
            com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCCRIIOROHCIIOROCCCHOCIHHOOCIH
         );
         var1.load(var2);
      }
   }

   private boolean OCIIROIOORRIOIIIRHIRRCCIIRRROH(JsonObject var1) {
      if (this.CRIHICCOHOCHORHRROIHHRROIHIHIH.isEmpty()) {
         return false;
      }

      JsonObject var2;
      if (var1.has("options")) {
         var2 = var1.getAsJsonObject("options");
      } else {
         var2 = new JsonObject();
         var1.add("options", var2);
      }

      Iterator var3 = this.CRIHICCOHOCHORHRROIHHRROIHIHIH.iterator();

      while (var3.hasNext()) {
         ((Consumer)var3.next()).accept(var2);
         var3.remove();
      }

      return true;
   }

   @FunctionalInterface
   private interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      void addOption(JsonElement var1, JsonObject var2);
   }
}
