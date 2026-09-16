package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements JsonDeserializer<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI> {
   private RHOCHHIRRCHHHOHOIRROIROHHHIHIO IRIOIRHHCOHHORHHOOCRIRROROCRIO = null;
   private CORCOCICIRIOHROHROIIOOHICCHCRR IIIRHHIHCCCIHHROICHRHOHCHHHHHO = null;
   private CORCOCICIRIOHROHROIIOOHICCHCRR RCIOIHRCOCHIIOICIOIOHIOOCORRCO = null;
   private CORCOCICIRIOHROHROIIOOHICCHCRR HRICRICHOHHRRCCORRHHOOHIHOHHCH = null;
   private CORCOCICIRIOHROHROIIOOHICCHCRR IOCRIRRIHIIHIOOROIHCICCCICORHR = null;
   private CORCOCICIRIOHROHROIIOOHICCHCRR OIIRROCCOOROOCCCHHOOOCROOOOHRH = null;

   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      this.IRIOIRHHCOHHORHHOOCRIRROROCRIO = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHIIROIOIHOHCHICOIIIHOHHCOIOCI()
         .ICIRRIRICOCHOIOIRHHRRHRCHHICHO();
      JsonObject var5 = var4.getAsJsonObject("catacombs");
      JsonObject var6 = var5.getAsJsonObject("basic");
      String var7 = var6.get("finalPattern").getAsString();
      JsonObject var8 = var6.getAsJsonObject("bloodOpen");
      JsonObject var9 = var6.getAsJsonObject("bloodClear");
      this.IIIRHHIHCCCIHHROICHRHOHCHHHHHO = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var8, var7);
      this.RCIOIHRCOCHIIOICIOIOHIOOCORRCO = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var9, var7);
      HashMap var10 = new HashMap();

      for (Entry var12 : var5.entrySet()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var13;
         try {
            var13 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.valueOf(
               (String)var12.getKey()
            );
         } catch (IllegalArgumentException var27) {
            continue;
         }

         ArrayList var14 = new ArrayList();
         JsonObject var15 = ((JsonElement)var12.getValue()).getAsJsonObject();
         String var16 = var15.get("bossName").getAsString();
         NamedTextColor var17 = NamedTextColor.NAMES.valueOrThrow(var15.get("color").getAsString());
         JsonArray var18 = var15.getAsJsonArray("uniqueSplits");
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var16, var17, var14);

         for (JsonElement var20 : var18) {
            JsonObject var21 = var20.getAsJsonObject();
            var14.add(this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var21, var7));
         }

         var10.put(var13, var14);
      }

      JsonObject var28 = var4.getAsJsonObject("kuudra");
      JsonObject var29 = var28.getAsJsonObject("basic");
      String var30 = var29.get("finalPattern").getAsString();
      JsonObject var31 = var29.getAsJsonObject("supplies");
      JsonObject var32 = var29.getAsJsonObject("build");
      JsonObject var33 = var29.getAsJsonObject("stun");
      this.HRICRICHOHHRRCCORRHHOOHIHOHHCH = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var31, var30);
      this.IOCRIRRIHIIHIOOROIHCICCCICORHR = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var32, var30);
      this.OIIRROCCOOROOCCCHHOOOCROOOOHRH = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var33, var30);
      HashMap var34 = new HashMap();

      for (Entry var36 : var28.entrySet()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var37;
         try {
            var37 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.valueOf(
               (String)var36.getKey()
            );
         } catch (IllegalArgumentException var26) {
            continue;
         }

         ArrayList var38 = new ArrayList();
         JsonArray var22 = ((JsonElement)var36.getValue()).getAsJsonObject().getAsJsonArray("uniqueSplits");
         this.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(var38);

         for (JsonElement var24 : var22) {
            JsonObject var25 = var24.getAsJsonObject();
            var38.add(this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var25, var30));
         }

         var34.put(var37, var38);
      }

      return new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         var10, var34
      );
   }

   private CORCOCICIRIOHROHROIIOOHICCHCRR OOROOCCIRCCRHOIOIORIHCHHOOCCOR(JsonObject var1, String var2) {
      String var3;
      if (var1.has("name")) {
         var3 = var1.get("name").getAsString();
      } else {
         if (!var1.has("translatableName")) {
            throw new JsonParseException("Timer has no name or translatable name");
         }

         var3 = this.IRIOIRHHCOHHORHHOOCRIRROROCRIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.get("translatableName").getAsString());
      }

      NamedTextColor var4 = NamedTextColor.NAMES.valueOrThrow(var1.get("color").getAsString());
      TextComponent var5 = (TextComponent)Component.text(var3).color(var4);
      if (var1.has("final") && var1.get("final").getAsBoolean()) {
         return new CORCOCICIRIOHROHROIIOOHICCHCRR(var5, var2);
      }

      String var6 = var1.get("pattern").getAsString();
      return new CORCOCICIRIOHROHROIIOOHICCHCRR(var5, var6);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, NamedTextColor var2, List<CORCOCICIRIOHROHROIIOOHICCHCRR> var3) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, (TextComponent)Component.text(this.IRIOIRHHCOHHORHHOOCRIRROROCRIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH("bossEntry", var1)).color(var2), var3
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, TextComponent var2, List<CORCOCICIRIOHROHROIIOOHICCHCRR> var3) {
      var3.add(new CORCOCICIRIOHROHROIIOOHICCHCRR(this.IIIRHHIHCCCIHHROICHRHOHCHHHHHO));
      var3.add(new CORCOCICIRIOHROHROIIOOHICCHCRR(this.RCIOIHRCOCHIIOICIOIOHIOOCORRCO));
      var3.add(new CORCOCICIRIOHROHROIIOOHICCHCRR(var2, "\\[BOSS\\] " + var1 + ": .*"));
   }

   private void ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(List<CORCOCICIRIOHROHROIIOOHICCHCRR> var1) {
      var1.add(new CORCOCICIRIOHROHROIIOOHICCHCRR(this.HRICRICHOHHRRCCORRHHOOHIHOHHCH));
      var1.add(new CORCOCICIRIOHROHROIIOOHICCHCRR(this.IOCRIRRIHIIHIOOROIHCICCCICORHR));
      var1.add(new CORCOCICIRIOHROHROIIOOHICCHCRR(this.OIIRROCCOOROOCCCHHOOOCROOOOHRH));
   }
}
