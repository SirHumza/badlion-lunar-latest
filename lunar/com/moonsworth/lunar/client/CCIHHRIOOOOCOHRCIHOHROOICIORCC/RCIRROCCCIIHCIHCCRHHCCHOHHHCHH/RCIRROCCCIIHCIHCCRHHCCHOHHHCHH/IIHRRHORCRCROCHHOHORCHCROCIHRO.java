package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4) {
         String var6 = var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var4);
         String var7 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var6, var4);
         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.CRRRICCRROCOHHOHIICIHORCOORRRH
            )
          {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var26 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
            );
            if (var26 != null) {
               for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var46 : var26.getChildren()) {
                  String var55 = var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var46);
                  String var63 = var55.replace("_CHILD", "").toLowerCase().replace("particle_changer", "particleMod");
                  this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var63, var55, var3);
               }
            }
         } else if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )
          {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var25 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
            );
            if (var25 != null) {
               for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 : var25.getChildren()) {
                  String var11 = var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var10);
                  String var12 = var11.replace("ITEM_COUNTER", "item_counter_child").replace("_CHILD", "").toLowerCase();
                  this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var12, var11, var3);
               }
            }
         } else {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var8 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
            );
            if (var8 != null) {
               var8.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var3x -> {
                  String var4x = var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var3x);
                  String var5x = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4x, var3x);
                  this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5x, var4x, var3);
               });
            }
         }

         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var27
            && var27.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO
            )
            && CRICCOOHHHCHOORCICOCOHIHOIRHOO("position", var3)) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "position", var3, null);
         }

         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOIHOROOIOOCOIHCRIRIRIRRICIIHC.IRCIIHHICIHRCOCRROCOICRIHHCCHH
            && CRICCOOHHHCHOORCICOCOHIHOIRHOO("qpKeyBinds", var3)) {
            JsonObject var28 = var3.getAsJsonObject("qpKeyBinds");

            for (Entry var47 : new HashSet<>(var28.entrySet())) {
               String var56 = (String)var47.getKey();
               String var64 = var56 + "_kblc";
               JsonObject var13 = var28.getAsJsonObject(var56);
               if (this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var64, var56, var13)) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var64, var56, var13);
               }
            }
         }

         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7 + "_enabled_bl", "enabled", var3);
         if (CRICCOOHHHCHOORCICOCOHIHOIRHOO("options", var3)) {
            JsonObject var29 = var3.getAsJsonObject("options");
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var38 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC
            );
            if (var38 != null) {
               for (HCHRIROHHHCORIOCROOCHRCIOROOCI var57 : var38.CHRHIHHORHROOCCIRRHORICOCRHOHI()) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var57, var29);
               }
            }
         }

         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOROCROIRCHIHIHHOOIRIIIRRCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var30
            && !var3.has("options")) {
            for (RCIROOOOICRHCCRRCIORHHIRCOIIIC var49 : var30.IROOCHICCRORIHCRORROROOIHCORHR().keySet()) {
               String var58 = var49.toString();
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var58 + "_nr", var58, var3);
            }
         }
      } else if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5) {
         boolean var18 = var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

         for (Object var31 : var5.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
            if (var31 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var50) {
               String var59 = var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var50);
               String var65 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var59, var50);
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var65, var59, var3);
            } else {
               if (!(var31 instanceof HCHRIROHHHCORIOCROOCHRCIOROOCI var40)) {
                  return;
               }

               if (!var18
                  || !var40.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCROORRCOOHHHRCCIIRRHHRIRHOOHI
                  )) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var40, var3);
               }
            }
         }

         if (var18) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1,
               ((com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var2)
                  .HRCORCRIOCHCHHCOCHOHOICCOCHCRR(),
               var3
            );
         }

         if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OCOHORHCROHICRRIHCIHHRRCIHICRI) {
            JsonObject var21 = new JsonObject();

            for (Entry var41 : new HashSet<>(var3.entrySet())) {
               String var51 = ((String)var41.getKey()).replace("_clr_nr", "").replace("fav_color_", "favColor");
               JsonObject var60 = ((JsonElement)var41.getValue()).getAsJsonObject();
               this.CCRHOICIRORRHOOOCIHHHHCHCICHOH(var60);
               var21.add(var51, var60);
               var3.remove((String)var41.getKey());
            }

            var3.add("colors", var21);
         } else if (var2 instanceof IIHRHCCOOHOOOOCHRRCOROOIOHCOOO) {
            JsonObject var22 = new JsonObject();

            for (Entry var42 : new HashSet<>(var3.entrySet())) {
               JsonElement var52 = (JsonElement)var42.getValue();

               for (Entry var66 : var52.getAsJsonObject().entrySet()) {
                  JsonObject var68 = ((JsonElement)var66.getValue()).getAsJsonObject();

                  for (Entry var15 : var68.entrySet()) {
                     JsonObject var16 = ((JsonElement)var15.getValue()).getAsJsonObject();
                     String var17 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("color", var16::has);
                     if (this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var17, "color", var16)) {
                        this.CCRHOICIRORRHOOOCIHHHHCHCICHOH(var16.getAsJsonObject("color"));
                     }
                  }
               }

               var22.add((String)var42.getKey(), var52);
               var3.remove((String)var42.getKey());
            }

            var3.add("waypoints", var22);
         } else if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO
            )
          {
            JsonElement var23 = var3.get("migrationVersion");
            if (var23 != null && var23.getAsInt() >= 1) {
               return;
            }

            JsonElement var34 = var3.get("gammaFromFile");
            if (var34 != null) {
               float var43 = var34.getAsFloat();
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO()
                  .bridge$getGameSettings()
                  .bridge$setGamma(var43);
            }

            JsonElement var44 = var3.get("skip_lighting_bl");
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var53 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .HHCRORCOROHHHRRIICHHROOOCHHIIH()
               .IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
               );
            if (var53 != null) {
               var53.setEnabled(var44 == null || var44.getAsBoolean());
            }
         }
      } else if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR
         )
       {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var24 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
            String var35 = var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var24);
            String var45 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var35, var24);
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var45, var35, var3);
            if (CRICCOOHHHCHOORCICOCOHIHOIRHOO(var35, var3)) {
               JsonObject var54 = var3.getAsJsonObject(var35);
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var62 = var24.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC
               );
               if (var62 != null) {
                  for (HCHRIROHHHCORIOCROOCHRCIOROOCI var69 : var62.CHRHIHHORHROOCCIRRHORICOCRHOHI()) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var69, var54);
                  }
               }
            }
         }
      }
   }

   private void CCRHOICIRORRHOOOCIHHHHCHCICHOH(JsonObject var1) {
      String var2 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("value", var1::has);
      String var3 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("chroma", var1::has);
      String var4 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("chromaSpeed", var1::has);
      String var5 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("chromaType", var1::has);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, "value", var1);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, "chroma", var1);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, "chromaSpeed", var1);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, "chromaType", var1);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, JsonObject var3) {
      String var4 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1 + "_shift", var3::has);
      String var5 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1 + "_alt", var3::has);
      String var6 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1 + "_control", var3::has);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var2 + "Shift", var3);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var2 + "Alt", var3);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var2 + "Control", var3);
      var1 = var1 + "_kblc";
      var4 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1 + "_shift", var3::has);
      var5 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1 + "_alt", var3::has);
      var6 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1 + "_control", var3::has);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var2 + "Shift", var3);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var2 + "Alt", var3);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var2 + "Control", var3);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2,
      JsonObject var3
   ) {
      String var4 = var1.IHICORCROOROHCIHIHCOIHRRHICICO(var2);
      String var5 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3::has);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var5, var4, var3);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2,
      String var3,
      String var4,
      JsonObject var5
   ) {
      if (this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var4, var5)) {
         if (var2 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI var6) {
            JsonObject var8 = var5.getAsJsonObject(var4);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var6.ORIHICRCCORORROOIICCOCCIIHOOHR(), var8);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var6.OCIHHIIOCRHCCOOHROIIIICOHCIRCI(), var8);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var6.HOIRCIOOCCHCORIOIOHOORROCOCHRH(), var8);
         } else if (var2 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHRIICOIOORCHCOIICOOIHIRHHICRI var7) {
            JsonObject var10 = var5.getAsJsonObject(var4);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var7.IHRICIIHICOOOIHIRIRCRHHHIHOROO(), var10);
         } else if (var2 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH) {
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3 + "_shift", var4 + "Shift", var5);
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3 + "_alt", var4 + "Alt", var5);
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3 + "_control", var4 + "Control", var5);
            var3 = var3 + "_kblc";
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3 + "_shift", var4 + "Shift", var5);
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3 + "_alt", var4 + "Alt", var5);
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3 + "_control", var4 + "Control", var5);
         }
      }

      if (CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4, var5)
         && var2 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIROICHCRROROHCCROOCCCCOCHCCRI) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, var5, var2);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      JsonObject var3,
      @Nullable HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var4
   ) {
      String var5 = var3.get(var2).getAsString();
      String var6 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4, var3::has);
      String var7 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(var6, var5);
      var3.addProperty(var2, var7);
   }

   @Override
   public String HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      String var1, @Nullable com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      return IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR(var1, var2);
   }

   @Override
   public String[] OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      String var1, @Nullable com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      return new String[]{IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var2)};
   }

   @Override
   public String RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, @Nullable HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2) {
      System.out.println("SettingsMigratorV0toV1 does not support upgradeOptionId!");
      return var1;
   }

   @Override
   public String[] RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var1, @Nullable HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2) {
      return IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCHCROCHRROHROOCCHIHIOCHOICOC(var1);
   }

   @Override
   public String CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, String var2, @Nullable HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var3) {
      return IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HOHCCHOIOHOHHOROHOIIHOOHORRHRO(var1, var2);
   }

   @Override
   public String HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, String var2, @Nullable HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var3) {
      return IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(var1, var2);
   }

   private boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, JsonObject var3) {
      if (!var1.equals(var2) && CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var3)) {
         var3.add(var2, var3.get(var1));
         var3.remove(var1);
         return true;
      } else {
         return false;
      }
   }

   private static boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(String var0, JsonObject var1) {
      return var1.has(var0) && !var1.get(var0).isJsonNull();
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final BiMap<String, String> HOOHORRHOCORRHOHCOOOHHRRCORCIH = this.OHCHROORCICOCROOCCIRIRHOOICRIO();
      private final Map<String, String[]> CRCIIOOHRICIRRIORIHCOCRCIHIIHO;
      private final Map<String, BiMap<String, String>> RHOHOIRRRHIRCHIRHHHOIRCROOHHHR;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         Map var1 = this.CIOIRCCIHOIOHCIRHICIRHCOCROICR();
         HashMap var2 = new HashMap();
         if (var1 != null) {
            for (Entry var4 : var1.entrySet()) {
               String var5 = (String)var4.getValue();
               if (var2.containsKey(var5)) {
                  ArrayList var6 = new ArrayList(List.of((String[])var2.get(var5)));
                  var6.add((String)var4.getKey());
                  var2.put(var5, var6.toArray(new String[0]));
               } else {
                  var2.put(var5, Collections.singleton((String)var4.getKey()).toArray(new String[0]));
               }
            }
         }

         this.CRCIIOOHRICIRRIORIHCOCRCIHIIHO = var2;
         this.RHOHOIRRRHIRCHIRHHHOIRCROOHHHR = this.RHHCOIORIOOHICCHOHCHICHOCOOCRI();
      }

      public static String CORCOCICIRIOHROHROIIOOHICCHCRR(
         String var0, @Nullable com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         if (var1 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )
          {
            return var0.replace("particleMod", "PARTICLE_CHANGER").toUpperCase() + "_CHILD";
         } else {
            return var1 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
               ? var0.replace("item_counter_child", "ITEM_COUNTER").toUpperCase() + "_CHILD"
               : (String)CRHOCIIICHHHRIHRCRRIRRCOIHIIRH().HOOHORRHOCORRHOHCOOOHHRRCORCIH.inverse().getOrDefault(var0, var0);
         }
      }

      public static String CHIOIOHHCRCIHHHRROORORHIHRORIH(String var0) {
         throw new RuntimeException("Unimplemented method: asNewOptionId()");
      }

      public static String CRICCOOHHHCHOORCICOCOHIHOIRHOO(
         String var0, @Nullable com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         if (var1 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )
          {
            return var0.replace("_CHILD", "").toLowerCase().replace("particle_changer", "particleMod");
         } else {
            return var1 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
               ? var0.replace("ITEM_COUNTER", "item_counter_child").replace("_CHILD", "").toLowerCase()
               : (String)CRHOCIIICHHHRIHRCRRIRRCOIHIIRH().HOOHORRHOCORRHOHCOOOHHRRCORCIH.getOrDefault(var0, var0);
         }
      }

      public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, Predicate<String> var1) {
         String[] var2 = CRHOCIIICHHHRIHRCRRIRRCOIHIIRH().CRCIIOOHRICIRRIORIHCOCRCIHIIHO.get(var0);
         if (var2 != null) {
            for (String var6 : var2) {
               if (var1.test(var6)) {
                  return var6;
               }
            }
         }

         return var0;
      }

      public static String[] CRCHCROCHRROHROOCCHIHIOCHOICOC(String var0) {
         return CRHOCIIICHHHRIHRCRRIRRCOIHIIRH().CRCIIOOHRICIRRIORIHCOCRCIHIIHO.get(var0);
      }

      public static String ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(String var0, String var1) {
         Map var2 = CRHOCIIICHHHRIHRCRRIRRCOIHIIRH().RHOHOIRRRHIRCHIRHHHOIRCROOHHHR;
         return var2.containsKey(var0) ? (String)((BiMap)var2.get(var0)).getOrDefault(var1, var1) : var1;
      }

      public static String HOHCCHOIOHOHHOROHOIIHOOHORRHRO(String var0, String var1) {
         Map var2 = CRHOCIIICHHHRIHRCRRIRRCOIHIIRH().RHOHOIRRRHIRCHIRHHHOIRCROOHHHR;
         return var2.containsKey(var0) ? (String)((BiMap)var2.get(var0)).inverse().getOrDefault(var1, var1) : var1;
      }

      private static IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRHOCIIICHHHRIHRCRRIRRCOIHIIRH() {
         return IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORCIRICRRCHOHOIHCHOCRRHCHHRRII;
      }

      private BiMap<String, String> OHCHROORCICOCROOCCIRIRHOOICRIO() {
         InputStream var1 = this.getClass().getResourceAsStream("/assets/conversion/V0toV1/features.json");
         return var1 == null
            ? null
            : ImmutableBiMap.copyOf(
               com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(new InputStreamReader(var1), Map.class)
            );
      }

      private Map<String, String> CIOIRCCIHOIOHCIRHICIRHCOCROICR() {
         InputStream var1 = this.getClass().getResourceAsStream("/assets/conversion/V0toV1/options.json");
         return var1 == null
            ? null
            : ImmutableMap.copyOf(
               com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(new InputStreamReader(var1), Map.class)
            );
      }

      private Map<String, BiMap<String, String>> RHHCOIORIOOHICCHOHCHICHOCOOCRI() {
         InputStream var1 = this.getClass().getResourceAsStream("/assets/conversion/V0toV1/enumValues.json");
         if (var1 == null) {
            return null;
         }

         Map var2 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
            .fromJson(new InputStreamReader(var1), Map.class);
         Builder var3 = ImmutableMap.builder();

         for (Entry var5 : var2.entrySet()) {
            var3.put((String)var5.getKey(), ImmutableBiMap.copyOf((Map)var5.getValue()));
         }

         return var3.build();
      }

      private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
         private static final IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORCIRICRRCHOHOIHCHOCRRHCHHRRII = new IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }
   }
}
