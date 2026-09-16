package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import java.util.ArrayList;
import java.util.Map.Entry;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHIRRIIORRHORHRORIHOROIRCORCOO) {
         this.OCOROCROIRCHIHIHHOOIRIIIRRCRHI(var3);
         this.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(var3);
      } else if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIOHIORIROHRRCOOOHCROHORCOIIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         this.HRHIHIRHRCHHRORRRCORHOCIRHRIOR(var3);
      }
   }

   private void ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(JsonObject var1) {
      OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, "OVERLAY_MOD")
         .flatMap(var0 -> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var0, "options"))
         .ifPresent(var2 -> {
            if (var2.has("heldItemScale") || var2.has("totemScale")) {
               boolean var3 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1.getAsJsonObject("OVERLAY_MOD"), "enabled").orElse(false);
               JsonObject var4 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, "ITEM_CUSTOMIZER");
               if (var3) {
                  this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, true);
               }

               JsonObject var5 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var4, "CUSTOM_HELD_ITEMS");
               if (var3) {
                  this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5, true);
               }

               JsonObject var6 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var5, "individualConfigs");
               OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var2, "heldItemScale").ifPresent(var3x -> {
                  JsonObject var4x = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var6, "global");
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4x, var3x.floatValue(), var3);
               });
               OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var2, "totemScale").ifPresent(var3x -> {
                  JsonObject var4x = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var6, "minecraft:totem_of_undying");
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4x, var3x.floatValue(), var3);
               });
            }
         });
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1, float var2, boolean var3) {
      if (var3) {
         this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, true);
      }

      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, "splitHands", new JsonPrimitive(true));
      JsonObject var4 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, "leftHand");
      if (var3) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, "leftHand", new JsonPrimitive(true));
      }

      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, "scale", new JsonPrimitive(String.valueOf(var2)));
      JsonObject var5 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, "rightHand");
      if (var3) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, "rightHand", new JsonPrimitive(true));
      }

      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, "scale", new JsonPrimitive(String.valueOf(var2)));
   }

   private void HRHIHIRHRCHHRORRRCORHOCIRHRIOR(JsonObject var1) {
      boolean var2 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1, "enabled").orElse(true);
      JsonObject var3 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, "ONE_SEVEN_ITEMS_LEGACY");
      this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var3, var2);
      JsonObject var4 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, "ONE_SEVEN_ANIMATIONS_LEGACY");
      this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, var2);
      OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, "options")
         .ifPresent(
            var3x -> {
               for (Entry var5 : new ArrayList<>(var3x.entrySet())) {
                  JsonElement var6 = (JsonElement)var5.getValue();
                  if (var6.isJsonPrimitive() && ("1.8".equals(var6.getAsString()) || "1.7".equals(var6.getAsString()))) {
                     var6 = new JsonPrimitive("1.7".equals(var6.getAsString()));
                     String var7 = (String)var5.getKey();
                     var3x.remove(var7);
                     JsonObject var8;
                     if ((!var7.endsWith("Animation") || var7.equals("blockHitAnimation")) && !var7.equals("hurtCameraShake")) {
                        if (!var7.startsWith("firstPerson")
                           && !var7.equals("thirdPersonHeldItems")
                           && !var7.equals("itemTransforms")
                           && !var7.equals("blockHitAnimation")) {
                           var8 = var3x;
                        } else {
                           var8 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var3, "options");
                        }
                     } else {
                        var8 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var4, "options");
                     }

                     this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8, var7, var6);
                  }
               }
            }
         );
   }

   private void OCOROCROIRCHIHIHHOOIRIIIRRCRHI(JsonObject var1) {
      if (var1.has("UHC_OVERLAY") && var1.get("UHC_OVERLAY").isJsonObject()) {
         JsonObject var2 = var1.remove("UHC_OVERLAY").getAsJsonObject();
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var2, "options")
            .ifPresent(
               var3 -> {
                  JsonObject var4 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, "ITEM_CUSTOMIZER");
                  JsonObject var5 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var4, "CUSTOM_DROPPED_ITEMS");
                  boolean var6 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.IOIICIRIICICIIOORHCIIIIRRIHRHI(var2, "enabled").orElse(false);
                  if (var6) {
                     this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, var6);
                     this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5, var6);
                  }

                  JsonObject var7 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var5, "options");
                  OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.IOHIHIIHCCCCCIHRORIOIOORCIOHII(var3, "selectedItems")
                     .ifPresent(var2xx -> this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, "selectedItems", var2xx));

                  for (Entry var9 : var3.entrySet()) {
                     String var10 = (String)var9.getKey();
                     JsonElement var11 = (JsonElement)var9.getValue();
                     if (var10.endsWith("Scale") && var11.isJsonPrimitive()) {
                        this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, var10, var11);
                     }
                  }
               }
            );
      }
   }

   private JsonObject RHOCHHIRRCHHHOHOIRROIROHHHIHIO(JsonObject var1, String var2) {
      return OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, var2).orElseGet(() -> {
         JsonObject var2x = new JsonObject();
         var1.add(var2, var2x);
         return var2x;
      });
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var1, String var2, JsonElement var3) {
      if (var1.has(var2)) {
         var1.remove(var2);
      }

      var1.add(var2, var3);
   }

   private void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(JsonObject var1, boolean var2) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, "enabled", new JsonPrimitive(var2));
   }
}
