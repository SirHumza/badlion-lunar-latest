package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.client.util.ICCIIIRHHOOIHCCHIRRCRHICHIHRIH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final String HICIIICICHHHRCORHRHHCCHOHHIROR = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir()
      + "options/skytils/waypoints.json";

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
      super(var1, var2);
   }

   @Override
   public List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> OIHCRRRHIRROIIOORHCCOHOCROIICC() {
      String var1 = this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO();
      return var1 == null ? Collections.emptyList() : List.of(RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(null, var1));
   }

   private String RIIRRHICCRIOOIIRHOOHOOIIRRIOCO() {
      File var1 = new File(this.HICIIICICHHHRCORHRHHCCHOHHIROR);
      return var1.exists() && var1.isFile() ? Files.readString(var1.toPath()) : null;
   }

   @Override
   protected Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHRRHHOCROROCCIRROIHOCCHCIHCIR(
      @Nullable String var1, String var2
   ) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Waypoints", "Importing waypoints from Skytils: " + var1
      );
      ArrayList var3 = new ArrayList();
      String var4 = this.RIOHCCCCIRIROIHCHIIRCCHOHHIOHR(var2);
      if (var4 == null) {
         return List.of();
      }

      JsonObject var5 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var4, JsonObject.class);

      for (JsonElement var8 : var5.getAsJsonArray("categories")) {
         JsonObject var9 = var8.getAsJsonObject();
         JsonArray var10 = var9.getAsJsonArray("waypoints");
         CRRRICCRROCOHHOHIICIHORCOORRRH var11 = null;
         if (var9.has("location")) {
            var11 = CRRRICCRROCOHHOHIICIHORCOORRRH.getByMode(var9.get("location").getAsString());
         }

         for (JsonElement var13 : var10) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var13, var11
            );
            var3.add(var14);
         }
      }

      return var3;
   }

   private String RIOHCCCCIRIROIHCHIIRCCHOHHIOHR(String var1) {
      if (var1.startsWith("<Skytils-Waypoint-Data>(V1):") && var1.length() >= 29) {
         String var2 = var1.substring(28);
         return ICCIIIRHHOOIHCCHIRRCRHICHIHRIH.ICHHCOOCHRRHICRROCROHIRCCRRHOC(var2);
      } else {
         return null;
      }
   }

   @NotNull
   private static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonElement var0, CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      JsonObject var2 = var0.getAsJsonObject();
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIROORIICIROCCOIROCRIRCCRHCIOI()
         .RRHCHIHOIRICOICHIHOIRIOHHRHOOI(var2.get("name").getAsString())
         .OCOHORHCROHICRRIHCIHHRRCIHICRI(
            CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2.get("x").getAsDouble(), var2.get("y").getAsDouble(), var2.get("z").getAsDouble())
         )
         .RICCICOHIICIIORHCHCRCRHOOOCHIC(true)
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1)
         .HRIOHRORCHIICCICIHRIIHHCHHOHHO(IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HIRHRIOCOCCCORCRICIICOIIIOCOHI())
         .OOCHIIROORIOCCCCCOORRIRIOHOORH(false)
         .ICOHOCROHOHHHCCOCIHHRHOCOOCOCC("")
         .OIHHRHHICRCHRIORRIHHOICCHCCRRR();
   }
}
