package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import org.jspecify.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCOCHHHCCIORCORCHIOOOCCCCHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
         )
       {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, var3);
      } else if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         this.CHHIICHRIIROIOHIHIIROICOCCROCI(var3);
      } else if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         this.COOCCHICCCIIICRHIOCOCIOOORCOCC(var3);
      } else if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5
         )
       {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5, var3);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCOCHHHCCIORCORCHIOOOCCCCHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      JsonObject var3
   ) {
      if (var3.has("options")) {
         JsonObject var4 = var3.getAsJsonObject("options");
         String var5 = var1.IHICORCROOROHCIHIHCOIHRRHICICO(var2.CICOCHRIIRIRRROOHRICIRRRHOIHCR());
         String var6 = var1.IHICORCROOROHCIHIHCOIHRRHICICO(var2.ICCIIRRIHRRCORCORHIOORIRRRRCIH());
         if (!var4.has(var5) && var4.has(var6)) {
            var4.add(var5, var4.get(var6));
         }
      }
   }

   private void CHHIICHRIIROIOHIHIIROICOCCROCI(JsonObject var1) {
      if (var1.has("options")) {
         JsonObject var2 = var1.getAsJsonObject("options");
         if (var2.has("scale")) {
            Double var3 = this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var2, "scale");
            if (var3 != null) {
               var2.addProperty("childScale", var3);
            }
         }
      }
   }

   private void COOCCHICCCIIICRHIOCOCIOOORCOCC(JsonObject var1) {
      if (var1.has("options")) {
         JsonObject var2 = var1.getAsJsonObject("options");
         if (!var2.has("hudStyle") && var2.has("useLegacyStyle")) {
            boolean var3 = var2.remove("useLegacyStyle").getAsBoolean();
            if (var3) {
               var2.addProperty("hudStyle", "legacy");
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      JsonObject var3
   ) {
      if (var3.has("options")) {
         JsonObject var4 = var3.remove("options").getAsJsonObject();
         String var5 = null;
         if (var3.has("custom_crosshair")) {
            var5 = var3.remove("custom_crosshair").getAsString();
         }

         String var6 = "crosshairColorVanilla";
         if (var4.has("crosshairColor")) {
            var6 = var4.remove("crosshairColor").getAsString();
         }

         var4.addProperty(
            var1.IHICORCROOROHCIHIHCOIHRRHICICO(var2.ORIHHIIRIRRHICOOHIHOIIOIHCCOOH.ORRIOCCOHORCROORICOIIHIIIOROIR()), "crosshairColorVanilla".equals(var6)
         );
         if (var4.has("crosshairSize")) {
            Double var7 = this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var4, "crosshairSize");
            if (var7 != null) {
               var4.addProperty("crosshairWidth", var7.intValue());
               var4.addProperty("crosshairHeight", var7.intValue());
            }
         }

         if (var4.has("crosshairThickness")) {
            Double var10 = this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var4, "crosshairThickness");
            if (var10 != null) {
               var4.addProperty("dotSize", var10.intValue() * 3);
            }
         }

         JsonObject var11 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.HRCOCHHHCCIORCORCHIOOOCCCCHICH(var4, "friendlyColor");
         JsonObject var8 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.HRCOCHHHCCIORCORCHIOOOCCCCHICH(var4, "enemyColor");
         if ("crosshairColorDynamic".equals(var6)) {
            if (var11 != null) {
               JsonObject var9 = var4.deepCopy();
               this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var11, var9);
               var3.add(var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var2.ROHCROOOHOCIRORIOCRCHHIOOOIICO), this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var9, var5));
            }

            if (var8 != null) {
               JsonObject var12 = var4.deepCopy();
               this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var8, var12);
               var3.add(var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var2.ROIHOHRRRROCIRIOHIRCHHIICIRORC), this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var12, var5));
            }
         }

         var3.add(var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var2.ORIHHIIRIRRHICOOHIHOIIOIHCCOOH), this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var4.deepCopy(), var5));
      }
   }

   private void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonObject var1, JsonObject var2) {
      if (var2.has("color")) {
         var2.remove("color");
      }

      var2.add("color", var1);
   }

   private JsonObject IIRHCHHOICHRICOOCRORCCIOOIHOIR(JsonObject var1, String var2) {
      JsonObject var3 = new JsonObject();
      var3.addProperty("enabled", true);
      var3.add("options", var1);
      if (var2 != null) {
         var3.addProperty("customCrosshair", var2);
      }

      return var3;
   }

   private @Nullable Double OHHRIOHROOIHOROCIRHCHORIHRRRRI(JsonObject var1, String var2) {
      JsonElement var3 = var1.remove(var2);
      if (var3 instanceof JsonPrimitive var4) {
         return var4.isString() ? Double.parseDouble(var3.getAsString()) : var3.getAsDouble();
      } else {
         return null;
      }
   }
}
