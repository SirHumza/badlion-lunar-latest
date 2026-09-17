package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.webosr.javascript.CallbackJS;
import java.io.File;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.Nullable;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String HIICORCCOHCHHRHROIRICRCIHICICR = "lcwaypoint";

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      int var4,
      int var5
   ) {
      if (var1 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_V
         && com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()
         && var4 == 0) {
         CHHHOCRRICRHOCRICIRRICCCRCHCIO();
      }
   }

   @CallbackJS("copyWaypoints")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var0) {
      AtomicInteger var1 = new AtomicInteger();
      JsonObject var2 = new JsonObject();
      JsonObject var3 = new JsonObject();
      var2.add("waypoints", var3);

      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : var0) {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var7.OIROIHRHRCRRRCHORIIIRIHHHHRCOI, var7.ROHCCRCHRRHORHCHORHIHCOICRHHHC, var7.RHRIOCICOIHHIRIIRIRCOOHROOHCOI)
            .ifPresent(var2x -> {
               var1.getAndIncrement();
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HOHHHORIIORRRROHRIIRCHCCICHHCI().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2x);
            });
      }

      IIHRRHORCRCROCHHOHORCHCROCIHRO.CROIHRIIRROCHORIIRIOCROOORRCCH(var2.toString());
      if (var1.get() == 0) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Could not find waypoints to copy!");
      } else if (var1.get() == 1) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               CORCOCICIRIOHROHROIIOOHICCHCRR.SUCCESS, "Copied waypoint", "You can import this waypoint from the waypoint UI dropdown or by pressing CTRL + V"
            );
      } else {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               CORCOCICIRIOHROHROIIOOHICCHCRR.SUCCESS,
               "Copied " + var1 + " waypoints",
               "You can import these waypoints from the waypoint UI dropdown or by pressing CTRL + V"
            );
      }
   }

   @CallbackJS("exportWaypoints")
   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var0) {
      AtomicInteger var1 = new AtomicInteger();
      JsonObject var2 = new JsonObject();
      JsonObject var3 = new JsonObject();
      var2.add("waypoints", var3);

      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : var0) {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var7.OIROIHRHRCRRRCHORIIIRIHHHHRCOI, var7.ROHCCRCHRRHORHCHORHIHCOICRHHHC, var7.RHRIOCICOIHHIRIIRIRCOOHROOHCOI)
            .ifPresent(var2x -> {
               var1.getAndIncrement();
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HOHHHORIIORRRROHRIIRCHCCICHHCI().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2x);
            });
      }

      if (var3.isEmpty()) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Could not find waypoints to export!");
      } else {
         String var9 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
         File var10 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Save Waypoints", new File("export-" + var9), "lcwaypoint", "lcwaypoint"
         );
         if (var10 != null) {
            try {
               String var11 = var10.getPath();
               if (!var11.toLowerCase().endsWith(".lcwaypoint")) {
                  var10 = new File(var11 + ".lcwaypoint");
               }

               FileUtils.write(var10, var2.toString(), Charset.defaultCharset());
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.SUCCESS, "Successfully exported waypoints!");
            } catch (Exception var8) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Failed to export waypoints!");
            }
         }
      }
   }

   @CallbackJS("importWaypointsFromClipboard")
   public static String HIHICCRCOHHCRCHCORIRRRHCIOIRII() {
      String var0 = IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOIIRIRCCOICRROOCHHCHRROORCOH();
      if (var0 != null && !var0.isEmpty()) {
         try {
            List var6 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonParser.parseString(var0).getAsJsonObject(), false);
            return IIHRRHORCRCROCHHOHORCHCROCIHRO(var6);
         } catch (Exception var5) {
            for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HOHHHORIIORRRROHRIIRCHCCICHHCI()
               .IOCICCICOCORRIOCHHORCHCRCOHHHR()) {
               try {
                  Collection var3 = var2.HRRHRCCOOIOIIIRORIOOORORHOORIH(null, var0);
                  if (var3 != null && !var3.isEmpty()) {
                     return IIHRRHORCRCROCHHOHORCHCROCIHRO(var3);
                  }
               } catch (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4) {
               }
            }
         }
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Failed to import waypoints from clipboard!");
      return null;
   }

   private static String IIHRRHORCRCROCHHOHORCHCROCIHRO(
      Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var0
   ) {
      JsonObject var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HOHHHORIIORRRROHRIIRCHCCICHHCI().HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0);
      JsonObject var2 = new JsonObject();
      JsonObject var3 = new JsonObject();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HOHHHORIIORRRROHRIIRCHCCICHHCI().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0);
      var2.add("waypoints", var3);
      var2.add("context", var1);
      return var2.toString();
   }

   @CallbackJS("saveImportedWaypoints")
   public static void IRIHOCHHIIOCRROOHRRCCOOCCCIOOR(String var0) {
      if (var0 != null) {
         try {
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonParser.parseString(var0).getAsJsonObject(), true);
         } catch (Exception var2) {
            var2.printStackTrace();
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Failed to import waypoint(s) from clipboard.");
         }
      }
   }

   @CallbackJS("importWaypointsFromFile")
   public static String RCIHRCCRHOIRIROIRCHIOCCIIIHOHO() {
      File var0 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "Select Waypoints File", null, "lcwaypoint", "lcwaypoint"
      );
      if (var0 != null && var0.exists()) {
         try {
            String var1 = FileUtils.readFileToString(var0, Charset.defaultCharset());
            List var2 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonParser.parseString(var1).getAsJsonObject(), false);
            return IIHRRHORCRCROCHHOHORCHCROCIHRO(var2);
         } catch (Exception var3) {
         }
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Failed to import waypoints from file!");
      return null;
   }

   @CallbackJS("pasteWaypoint")
   public static void CHHHOCRRICRHOCRICIRRICCCRCHCIO() {
      String var0 = IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOIIRIRCCOICRROOCHHCHRROORCOH();
      if (var0 != null) {
         try {
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonParser.parseString(var0).getAsJsonObject(), true);
         } catch (Exception var2) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Failed to import waypoint(s) from clipboard.");
         }
      }
   }

   private static List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      JsonObject var0, boolean var1
   ) {
      IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HOHHHORIIORRRROHRIIRCHCCICHHCI();
      List var3 = var2.HRRHRCCOOIOIIIRORIOOORORHOORIH(var0);

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var3) {
         String var6 = var5.getName();

         for (int var7 = 1; var2.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var5.getServer(), var5.getWorld(), var5.getName()).isPresent(); var7++) {
            var5.setName(var6 + " (" + var7 + ")");
         }

         if (var1) {
            var2.CRRRICCRROCOHHOHIICIHORCOORRRH(var5);
         }
      }

      if (var1) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.SUCCESS, "Imported %s waypoint(s)!".formatted(var3.size()));
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HOHHHORIIORRRROHRIIRCHCCICHHCI()
            .ROOCCICICICIRCOHOHCOCIHHCCHRII();
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HOHHHORIIORRRROHRIIRCHCCICHHCI()
            .HRIIIOIIRHOHORIRICIOIORRIRCHHO();
      }

      return var3;
   }

   private static Optional<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      String var0, String var1, String var2
   ) {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HOHHHORIIORRRROHRIIRCHCCICHHCI()
         .CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0, var1, var2);
   }

   @Nullable
   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      return null;
   }

   @Override
   public JsonElement provide() {
      return null;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      @SerializedName("server")
      private final String OIROIHRHRCRRRCHORIIIRIHHHHRCOI;
      @SerializedName("world")
      private final String ROHCCRCHRRHORHCHORHIHCOICRHHHC;
      @SerializedName("name")
      private final String RHRIOCICOIHHIRIIRIRCOOHROOHCOI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3) {
         this.OIROIHRHRCRRRCHORIIIRIHHHHRCOI = var1;
         this.ROHCCRCHRRHORHCHORHIHCOICRHHHC = var2;
         this.RHRIOCICOIHHIRIIRIRCOOHROOHCOI = var3;
      }

      @SerializedName("server")
      public String IHIOICOIHHRCICIIIOIHORIOCCIHOI() {
         return this.OIROIHRHRCRRRCHORIIIRIHHHHRCOI;
      }

      @SerializedName("world")
      public String RIHCICCCIIOIOIIRHOIORCHRCCIHHO() {
         return this.ROHCCRCHRRHORHCHORHIHCOICRHHHC;
      }

      @SerializedName("name")
      public String name() {
         return this.RHRIOCICOIHHIRIIRIRCOOHROOHCOI;
      }
   }
}
