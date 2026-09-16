package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
      super(var1, null);
   }

   @Override
   public List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> OIHCRRRHIRROIIOORHCCOHOCROIICC() {
      File var1 = new File(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "journeymap/data");
      if (var1.exists() && var1.isDirectory()) {
         File[] var2 = var1.listFiles();
         if (var2 == null) {
            return Collections.emptyList();
         }

         ArrayList var3 = new ArrayList();

         for (File var7 : var2) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3);
         }

         return var3;
      } else {
         return Collections.emptyList();
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1, List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> var2) {
      if (var1.isDirectory()) {
         String var3 = var1.getName();
         File[] var4 = var1.listFiles();
         if (var4 != null) {
            for (File var8 : var4) {
               if (var8.isDirectory()) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var3, var2);
               }
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1, String var2, List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> var3) {
      String var4 = var1.getName().replaceAll("~", " ");
      File var5 = new File(var1, "waypoints");
      if (var5.exists() && var5.isDirectory()) {
         File[] var6 = var5.listFiles();
         if (var6 != null) {
            for (File var10 : var6) {
               if (var10.isFile() && var10.getName().endsWith(".json")) {
                  try {
                     String var11 = Files.readString(var10.toPath());
                     String var12 = var2 + ":" + var4;
                     var3.add(RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(var12, var11));
                  } catch (IOException var13) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                        "JourneyMap", "Failed to read waypoint file: " + var10.getPath(), var13
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   protected Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHRRHHOCROROCCIRROIHOCCHCIHCIR(
      String var1, String var2
   ) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "JourneyMap", "Importing waypoints from JourneyMap: " + var1
      );

      try {
         JsonObject var3 = JsonParser.parseString(var2).getAsJsonObject();
         return this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var3, var1);
      } catch (JsonParseException var4) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "JourneyMap", "Failed to parse JSON data: " + var4.getMessage(), var4
         );
         return Collections.emptyList();
      }
   }

   private Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      JsonObject var1, String var2
   ) {
      for (String var5 : List.of("name", "x", "y", "z", "dimensions")) {
         if (!var1.has(var5)) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "JourneyMap", "Skipping waypoint with missing required field: " + var5
            );
            return Collections.emptyList();
         }
      }

      String var16 = var1.get("name").getAsString();
      float var17 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.get("x").getAsString(), 0.0F);
      float var6 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.get("y").getAsString(), 0.0F);
      float var7 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.get("z").getAsString(), 0.0F);
      boolean var8 = !var1.has("enable") || var1.get("enable").getAsBoolean();
      JsonArray var9 = var1.get("dimensions").getAsJsonArray();
      ArrayList var10 = new ArrayList();

      for (JsonElement var12 : var9) {
         String var13 = var12.getAsString();
         int var14 = this.CHCIRRHRCIRCHIIROHOOOHRCOHORII(var13);
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIROORIICIROCCOIROCRIRCCRHCIOI()
            .RRHCHIHOIRICOICHIHOIRIOHHRHOOI(var16)
            .RRROCCOIROROHIRRHOHIRRIHOCIIRO(var8)
            .OCOHORHCROHICRRIHCIHHRRCIHICRI(CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var17, var6, var7))
            .HRIOHRORCHIICCICIHRIIHHCHHOHHO(var2)
            .RCOROOHHCORIRCRHOHRCCIHRCORCHH(var14)
            .ICOHOCROHOHHHCCOCIHHRHOCOOCOCC("")
            .OOCHIIROORIOCCCCCOORRIRIOHOORH(false)
            .OIHHRHHICRCHRIORRIHHOICCHCCRRR();
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15, var1);
         var10.add(var15);
      }

      return var10;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      JsonObject var2
   ) {
      if (var2.has("r") && var2.has("g") && var2.has("b")) {
         float var3 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2.get("r").getAsString(), 0.0F) / 255.0F;
         float var4 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2.get("g").getAsString(), 0.0F) / 255.0F;
         float var5 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2.get("b").getAsString(), 0.0F) / 255.0F;
         float var6 = var2.has("a") ? this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2.get("a").getAsString(), 255.0F) / 255.0F : 1.0F;
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().CRHROHHHCIHHCOHCOORCRIHHIICROR(var3);
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().RORCHCIIICOHIRROOORHOCCCCIOCCI(var4);
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().IOHHOIIOCRHCHHCRORICCOHOHROOIH(var5);
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().RRCRRIIRHHRCCICHOCOIHROROCICHC(var6);
      } else {
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().IHCRCORHOIRRIRIHOHCIRIOHRIHIIO();
      }
   }
}
