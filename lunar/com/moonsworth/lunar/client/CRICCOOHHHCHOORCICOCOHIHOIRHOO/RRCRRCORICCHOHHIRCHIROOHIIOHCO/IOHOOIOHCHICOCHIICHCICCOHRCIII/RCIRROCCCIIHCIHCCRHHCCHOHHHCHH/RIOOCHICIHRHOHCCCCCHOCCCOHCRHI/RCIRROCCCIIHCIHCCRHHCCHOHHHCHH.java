package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Pattern CIHIRICHHOHIOROCCHIRHCICRROHCH = Pattern.compile("Multiplayer_(.+)");
   private static final Pattern OOHHIIIIHRRRCIHCCIHOCIOCCHHHCH = Pattern.compile("(.+)");
   private static final Pattern OHCHICCCRHOIIRCIICRRRRCOCRRCRO = Pattern.compile("dim%([\\-0-9]+)");

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
      super(var1, null);
   }

   @Override
   public List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> OIHCRRRHIRROIIOORHCCOHOCROIICC() {
      File var1 = new File(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "xaero/minimap");
      if (var1.exists() && var1.isDirectory()) {
         File[] var2 = var1.listFiles();
         if (var2 == null) {
            return Collections.emptyList();
         }

         ArrayList var3 = new ArrayList();

         for (File var7 : var2) {
            if (var7.isDirectory()) {
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, var3);
            }
         }

         return var3;
      } else {
         return Collections.emptyList();
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(File var1, List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> var2) {
      String var3 = var1.getName();
      boolean var4 = var3.startsWith("Multiplayer_");
      String var5 = this.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var3, var4);
      File[] var6 = var1.listFiles();
      if (var6 != null) {
         for (File var10 : var6) {
            if (var10.isDirectory()) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var5, var4, var2);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1, String var2, boolean var3, List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> var4) {
      Matcher var5 = OHCHICCCRHOIIRCIICRRRRCOCRRCRO.matcher(var1.getName());
      if (var5.matches()) {
         int var6 = this.parseInt(var5.group(1), 0);
         File var7 = new File(var1, "waypoints.txt");
         if (var7.exists() && var7.isFile()) {
            try {
               String var8 = Files.readString(var7.toPath());
               String var9 = (var3 ? "mp:" : "sp:") + var2 + ":" + var6;
               var4.add(RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(var9, var8));
            } catch (IOException var10) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Waypoints", "Failed to read Xaero's waypoints file: " + var7.getPath(), var10
               );
            }
         }
      }
   }

   private String RICRIRRCOHRCOCRRHHCRHRROOIOHHR(String var1, boolean var2) {
      if (var2) {
         Matcher var4 = CIHIRICHHOHIOROCCHIRHCICRROHCH.matcher(var1);
         return var4.matches() ? var4.group(1) : var1;
      } else {
         Matcher var3 = OOHHIIIIHRRRCIHCCIHOCIOCCHHHCH.matcher(var1);
         return var3.matches() ? var3.group(1).replaceAll("%us%", "_") : var1;
      }
   }

   @Override
   protected Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHRRHHOCROROCCIRROIHOCCHCIHCIR(
      String var1, String var2
   ) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Waypoints", "Importing waypoints from Xaero's Minimap: " + var1
      );
      if (var2 != null && !var2.isEmpty()) {
         String[] var3 = var1.split(":");
         if (var3.length < 3) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Waypoints", "Invalid name format for Xaero's waypoints: " + var1
            );
            return Collections.emptyList();
         }

         String var4 = var3[0];
         String var5 = var3[1];
         int var6 = this.parseInt(var3[2], 0);
         ArrayList var7 = new ArrayList();
         String[] var8 = var2.split("\n");

         for (String var12 : var8) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var12, var4, var5, var6
            );
            if (var13 != null) {
               var7.add(var13);
            }
         }

         return var7;
      } else {
         return Collections.emptyList();
      }
   }

   private com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, String var2, String var3, int var4
   ) {
      if (!var1.startsWith("#") && !var1.trim().isEmpty()) {
         String[] var5 = var1.split(":");
         if (var5.length >= 8 && var5[0].equals("waypoint")) {
            String var6 = var5[1];
            int var7 = this.parseInt(var5[3], 0);
            int var8 = this.parseInt(var5[4], 0);
            int var9 = this.parseInt(var5[5], 0);
            boolean var10 = this.parseBoolean(var5[7], false);
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIROORIICIROCCOIROCRIRCCRHCIOI()
               .RRHCHIHOIRICOICHIHOIRIOHHRHOOI(var6)
               .OCOHORHCROHICRRIHCIHHRRCIHICRI(CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var7, var8, var9))
               .RRROCCOIROROHIRRHOHIRRIHOCIIRO(!var10)
               .HRIOHRORCHIICCICIHRIIHHCHHOHHO(var2 + ":" + var3)
               .RCOROOHHCORIRCRHOHRCCIHRCORCHH(var4)
               .ICOHOCROHOHHHCCOCIHHRHOCOOCOCC("")
               .OOCHIIROORIOCCCCCOORRIRIOHOORH(false)
               .OIHHRHHICRCHRIORRIHHOICCHCCRRR();
            var11.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().CHIHRIROCCRICOHIRCRIOOHOHRRCHC().IHCRCORHOIRRIRIHOHCIRIOHRIHIIO();
            return var11;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
