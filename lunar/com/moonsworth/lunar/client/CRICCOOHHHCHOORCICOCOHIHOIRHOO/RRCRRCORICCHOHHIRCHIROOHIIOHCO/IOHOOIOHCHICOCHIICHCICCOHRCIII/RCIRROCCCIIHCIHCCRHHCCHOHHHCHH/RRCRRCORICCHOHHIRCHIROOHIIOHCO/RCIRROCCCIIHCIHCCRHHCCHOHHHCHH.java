package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Pattern HHRHOCIOIRRRCOOCHRHOCHORORCROI = Pattern.compile("^(\\d{1,3}\\.){3}\\d{1,3}$");
   private static final Pattern RHOROOCOOICRIHIOIHHIHRRCHHRCOI = Pattern.compile("^[a-zA-Z0-9][-a-zA-Z0-9.]*\\.[a-zA-Z]{2,}$");

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
      super(var1, null);
   }

   @Override
   public List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> OIHCRRRHIRROIIOORHCCOHOCROIICC() {
      File var1 = new File(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "voxelmap");
      if (var1.exists() && var1.isDirectory()) {
         File[] var2 = var1.listFiles(var0 -> var0.getName().endsWith(".points"));
         if (var2 == null) {
            return Collections.emptyList();
         }

         ArrayList var3 = new ArrayList();

         for (File var7 : var2) {
            try {
               String var8 = Files.readString(var7.toPath());
               var3.add(RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(var7.getName(), var8));
            } catch (IOException var9) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Waypoints", "Failed to read VoxelMap file: " + var7.getPath(), var9
               );
            }
         }

         return var3;
      } else {
         return Collections.emptyList();
      }
   }

   @Override
   protected Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHRRHHOCROROCCIRROIHOCCHCIHCIR(
      String var1, String var2
   ) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Waypoints", "Importing waypoints from VoxelMap: " + var1
      );
      if (var2 != null && !var2.trim().isEmpty()) {
         ArrayList var3 = new ArrayList();
         String[] var4 = var2.split("\n");

         for (String var8 : var4) {
            if (var8.startsWith("name:")) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = this.RCOCRROHHROHHOCRCCCHCIROIIOORC(
                  var8, var1
               );
               if (var9 != null) {
                  var3.add(var9);
               }
            }
         }

         return var3;
      } else {
         return Collections.emptyList();
      }
   }

   private com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCOCRROHHROHHOCRCCCHCIROIIOORC(
      String var1, String var2
   ) {
      Map var3 = this.IIOOHRRHRIIRRCICIRCORHCHORORHO(var1);

      for (String var6 : List.of("name", "x", "y", "z", "dimensions")) {
         if (!var3.containsKey(var6)) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Waypoints", "Skipping waypoint with missing required field: " + var6
            );
            return null;
         }
      }

      String var15 = (String)var3.get("name");
      int var16 = this.parseInt((String)var3.get("x"), 0);
      int var7 = this.parseInt((String)var3.get("y"), 0);
      int var8 = this.parseInt((String)var3.get("z"), 0);
      boolean var9 = this.parseBoolean((String)var3.get("enabled"), true);
      String var10 = ((String)var3.get("dimensions")).toLowerCase();
      int var11 = this.CHCIRRHRCIRCHIIROHOOOHRCOHORII(var10);
      String var12 = var3.getOrDefault("world", "");
      String var13 = this.IRHOHHRHCIHHOOOHIHOCCICHOROOCO(var2.replace(".points", ""));
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIROORIICIROCCOIROCRIRCCRHCIOI()
         .RRHCHIHOIRICOICHIHOIRIOHHRHOOI(var15)
         .RRROCCOIROROHIRRHOHIRRIHOCIIRO(var9)
         .OCOHORHCROHICRRIHCIHHRRCIHICRI(CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var16, var7, var8))
         .HRIOHRORCHIICCICIHRIIHHCHHOHHO(var13)
         .RCOROOHHCORIRCRHOHRCCIHRCORCHH(var11)
         .ICOHOCROHOHHHCCOCIHHRHOCOOCOCC(var12)
         .OOCHIIROORIOCCCCCOORRIRIOHOORH(false)
         .OIHHRHHICRCHRIORRIHHOICCHCCRRR();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, var3);
      return var14;
   }

   private Map<String, String> IIOOHRRHRIIRRCICIRCORHCHORORHO(String var1) {
      HashMap var2 = new HashMap();
      String[] var3 = var1.split(",");

      for (String var7 : var3) {
         int var8 = var7.indexOf(58);
         if (var8 > 0) {
            String var9 = var7.substring(0, var8);
            String var10 = var7.substring(var8 + 1).replaceAll("~comma~", ",");
            var2.put(var9, var10);
         }
      }

      return var2;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      Map<String, String> var2
   ) {
      if (var2.containsKey("red") && var2.containsKey("green") && var2.containsKey("blue")) {
         float var3 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((String)var2.get("red"), 1.0F);
         float var4 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((String)var2.get("green"), 1.0F);
         float var5 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((String)var2.get("blue"), 1.0F);
         float var6 = var2.containsKey("alpha") ? this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((String)var2.get("alpha"), 1.0F) : 1.0F;
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().CRHROHHHCIHHCOHCOORCRIHHIICROR(var3);
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().RORCHCIIICOHIRROOORHOCCCCIOCCI(var4);
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().IOHHOIIOCRHCHHCRORICCOHOHROOIH(var5);
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().RRCRRIIRHHRCCICHOCOIHROROCICHC(var6);
      } else {
         var1.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().IHCRCORHOIRRIRIHOHCIRIOHRIHIIO();
      }
   }

   private String IRHOHHRHCIHHOOOHIHOCCICHOROOCO(String var1) {
      String var2 = var1.trim();
      if (HHRHOCIOIRRRCOOCHRHOCHORORCROI.matcher(var2).matches()) {
         return "mp:" + var2;
      } else {
         return RHOROOCOOICRIHIOIHHIHRRCHHRCOI.matcher(var2).matches() ? "mp:" + var2 : "sp:" + var2;
      }
   }
}
