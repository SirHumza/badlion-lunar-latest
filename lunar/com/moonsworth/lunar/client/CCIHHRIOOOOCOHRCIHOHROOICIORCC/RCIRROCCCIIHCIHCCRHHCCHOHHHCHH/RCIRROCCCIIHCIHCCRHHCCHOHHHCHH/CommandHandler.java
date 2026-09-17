package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4) {
         if (CRICCOOHHHCHOORCICOCOHIHOIRHOO("options", var3)) {
            JsonObject var7 = var3.getAsJsonObject("options");
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var8 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC
            );
            if (var8 != null) {
               for (HCHRIROHHHCORIOCROOCHRCIOROOCI var10 : var8.CHRHIHHORHROOCCIRRHORICOCRHOHI()) {
                  this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var10, var7);
               }
            }

            if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
               )
             {
               for (int var26 = 0; var26 < 50; var26++) {
                  String var34 = var26 + "hotkey";
                  if (var7.get(var34) instanceof JsonObject var11) {
                     this.CRRRICCRROCOHHOHIICIHORCOORRRH(var34, var34, var11);
                     if (CRICCOOHHHCHOORCICOCOHIHOIRHOO("text", var11) && !CRICCOOHHHCHOORCICOCOHIHOIRHOO("value", var11)) {
                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("text", "value", var11, var11);
                     }
                  }
               }
            }

            if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
               )
             {
               for (Entry var35 : var7.entrySet()) {
                  String var40 = (String)var35.getKey();
                  if (var40.endsWith("Size")) {
                     this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var40, var7);
                  }
               }
            }
         }

         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOCCRCRCOHIIORCCORCRCIRRROIOOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            && CRICCOOHHHCHOORCICOCOHIHOIRHOO("CUSTOM_DROPPED_ITEMS", var3)) {
            JsonObject var14 = var3.getAsJsonObject("CUSTOM_DROPPED_ITEMS");
            if (CRICCOOHHHCHOORCICOCOHIHOIRHOO("options", var14)) {
               JsonObject var20 = var14.getAsJsonObject("options");

               for (Entry var36 : new HashSet<>(var20.entrySet())) {
                  String var41 = (String)var36.getKey();
                  if (var41.endsWith("Scale") && var36.getValue() instanceof JsonPrimitive var46 && var46.isString()) {
                     var20.remove(var41);
                     var20.add(var41, new JsonPrimitive(Float.parseFloat(var46.getAsString())));
                  }
               }
            }
         }

         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            && CRICCOOHHHCHOORCICOCOHIHOIRHOO("sbCommandKeyBinds", var3)) {
            JsonObject var15 = var3.getAsJsonObject("sbCommandKeyBinds");

            for (Entry var29 : var15.entrySet()) {
               if (var29.getValue() instanceof JsonObject var37) {
                  this.CRRRICCRROCOHHOHIICIHORCOORRRH((String)var29.getKey(), (String)var29.getKey(), var37);
               }
            }
         }

         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOROCROIRCHIHIHHOOIRIIIRRCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )
          {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var16 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC
            );
            if (var16 != null) {
               for (HCHRIROHHHCORIOCROOCHRCIOROOCI var30 : var16.CHRHIHHORHROOCCIRRHORICOCRHOHI()) {
                  this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var30, var3);
               }
            }
         }

         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )
          {
            for (Entry var23 : var3.entrySet()) {
               if (((String)var23.getKey()).startsWith("CROSSHAIR_")
                  && var23.getValue() instanceof JsonObject var31
                  && var31.get("options") instanceof JsonObject var38) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("help_box_open", "crosshairDraw", var38, var38);
               }
            }
         }
      } else if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5) {
         for (Object var24 : var5.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
            if (var24 instanceof HCHRIROHHHCORIOCROOCHRCIOROOCI var32) {
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var32, var3);
            }
         }
      } else if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR
         )
       {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var25 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
            String var33 = var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var25);
            if (CRICCOOHHHCHOORCICOCOHIHOIRHOO(var33, var3)) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var39 = var25.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC
               );
               if (var39 != null) {
                  JsonObject var45 = var3.getAsJsonObject(var33);

                  for (HCHRIROHHHCORIOCROOCHRCIOROOCI var48 : var39.CHRHIHHORHROOCCIRRHORICOCRHOHI()) {
                     this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var48, var45);
                  }
               }
            }
         }
      } else if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6
         )
       {
         com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1, var6, var3, (var2x, var3x) -> this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2x, var3x)
         );
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH) {
         String var4 = var1.IHICORCROOROHCIHIHCOIHRRHICICO(var2);
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var4, var2.getId(), var3);
      } else if (var2 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH) {
         String var6 = var1.IHICORCROOROHCIHIHCOIHRRHICICO(var2);
         if (CRICCOOHHHCHOORCICOCOHIHOIRHOO(var6, var3)) {
            String var5 = var3.get(var6).getAsString().toUpperCase();
            if (!var5.startsWith("KEY_")) {
               var5 = "KEY_" + var5;
            }

            var3.addProperty(var6, var5);
         }
      } else if (var2 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHRIICOIOORCHCOIICOOIHIRHHICRI) {
         if (CRICCOOHHHCHOORCICOCOHIHOIRHOO("text", var3) && !CRICCOOHHHCHOORCICOCOHIHOIRHOO("value", var3)) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("text", "value", var3, var3);
         }
      } else {
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2, var3);
      }
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, String var2, JsonObject var3) {
      JsonObject var4 = new JsonObject();
      if (var3.has(var1)) {
         JsonElement var5 = var3.get(var1);
         if (var5.isJsonObject()) {
            var3 = var5.getAsJsonObject();
         }
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "value", var3, var4);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2 + "Shift", "shift", var3, var4);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2 + "Alt", "alt", var3, var4);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2 + "Control", "control", var3, var4);
      if (!var4.isEmpty()) {
         var3.add(var1, var4);
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2,
      JsonObject var3
   ) {
      this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1.IHICORCROOROHCIHIHCOIHRRHICICO(var2), var3);
   }

   private void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(String var1, JsonObject var2) {
      if (CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var2)) {
         JsonElement var3 = var2.get(var1);
         if (var3.isJsonPrimitive() && var3.getAsJsonPrimitive().isString()) {
            try {
               double var4 = Double.parseDouble(var3.getAsString());
               var2.remove(var1);
               var2.addProperty(var1, var4);
            } catch (Exception var6) {
            }
         }
      }
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2,
      JsonObject var3
   ) {
      String var4 = var2.getId();
      if (CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4, var3)) {
         JsonElement var5 = var3.get(var4);
         if (var5.isJsonPrimitive() && var5.getAsJsonPrimitive().isString()) {
            if (var2.getDefaultValue() instanceof Boolean) {
               try {
                  boolean var13 = Boolean.parseBoolean(var5.getAsString());
                  var3.remove(var4);
                  var3.addProperty(var4, var13);
               } catch (Exception var11) {
               }
            } else if (var2.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH
            )) {
               try {
                  double var14 = Double.parseDouble(var5.getAsString());
                  var3.remove(var4);
                  var3.addProperty(var4, var14);
               } catch (Exception var10) {
               }
            }
         } else if (var5.isJsonObject()) {
            Collection var6 = var2.CIIRCHCRCRHOCICHCHCRIICCCORICO();
            if (var6 != null) {
               JsonObject var7 = var5.getAsJsonObject();

               for (HCHRIROHHHCORIOCROOCHRCIOROOCI var9 : var6) {
                  this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var9, var7);
               }
            }
         }
      }

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var15 : var2.getChildren()) {
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var15, var3);
      }
   }

   private static boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(String var0, JsonObject var1) {
      return var1.has(var0) && !var1.get(var0).isJsonNull();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, JsonObject var3, JsonObject var4) {
      if (CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var3)) {
         var4.add(var2, var3.remove(var1));
      }
   }
}
