package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String[] IHIIOHHCCCHCHHOHCHCHRCORHRRIRI = new String[]{"x", "y", "position"};

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, JsonObject var2
   ) {
      String var3 = var0.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var1);
      if (!var2.has(var3)) {
         JsonObject var4 = new JsonObject();
         if (var2.has("enabled") && !var2.get("enabled").isJsonNull()) {
            var4.add("enabled", var2.get("enabled"));
         }

         if (var1.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO)) {
            for (String var8 : IHIIOHHCCCHCHHOHCHCHRCORHRRIRI) {
               if (var2.has(var8) && !var2.get(var8).isJsonNull()) {
                  var4.add(var8, var2.get(var8));
               }
            }
         }

         if (var2.has("options")) {
            JsonObject var11 = var2.getAsJsonObject("options");
            JsonObject var12 = new JsonObject();
            IHHCHHHCRIHOOCOIOOCRIIICIOROIR var13 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
            if (var13 != null) {
               for (HCHRIROHHHCORIOCROOCHRCIOROOCI var9 : var13.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
                  String var10 = var0.IHICORCROOROHCIHIHCOIHRRHICICO(var9);
                  if (var11.has(var10) && !var11.get(var10).isJsonNull()) {
                     var12.add(var10, var11.get(var10));
                  }
               }
            }

            var4.add("options", var12);
         }

         var2.add(var3, var4);
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      JsonObject var2,
      BiConsumer<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>, JsonObject> var3
   ) {
      for (Entry var5 : var2.entrySet()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var1.get(
            var5.getKey()
         );
         if (var6 != null) {
            JsonElement var7 = (JsonElement)var5.getValue();
            if (var7.isJsonObject()) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var7.getAsJsonObject(), var3);
            }
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      JsonObject var1,
      BiConsumer<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>, JsonObject> var2
   ) {
      if (var1.has("childProperties")) {
         JsonObject var3 = var1.getAsJsonObject("childProperties");

         for (Entry var5 : var3.entrySet()) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var0.CIOOCROROCCOHHRORCICHIHIOHICOH()
               .get(var5.getKey());
            if (var6 != null && ((JsonElement)var5.getValue()).isJsonObject()) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, ((JsonElement)var5.getValue()).getAsJsonObject(), var2);
            }
         }
      }

      if (var1.has("keyframes")) {
         JsonObject var11 = var1.getAsJsonObject("keyframes");

         for (Entry var13 : var11.entrySet()) {
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var14 = var0.HCIORRCRIRHIOIHORHHHRRIRRIROIC().get(var13.getKey());
            if (var14 != null && ((JsonElement)var13.getValue()).isJsonObject()) {
               JsonObject var7 = ((JsonElement)var13.getValue()).getAsJsonObject();
               if (var7.has("values")) {
                  JsonObject var8 = var7.getAsJsonObject("values");

                  for (Entry var10 : var8.entrySet()) {
                     if (((JsonElement)var10.getValue()).isJsonObject()) {
                        var2.accept(var14.getOption(), ((JsonElement)var10.getValue()).getAsJsonObject());
                     }
                  }
               }
            }
         }
      }
   }
}
