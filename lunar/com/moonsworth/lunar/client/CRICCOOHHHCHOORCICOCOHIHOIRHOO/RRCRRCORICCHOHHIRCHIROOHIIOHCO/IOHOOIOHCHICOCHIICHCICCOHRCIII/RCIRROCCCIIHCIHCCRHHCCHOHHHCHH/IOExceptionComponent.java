package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import lombok.Generated;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final String CHCICIOIHRRHOIHCIICOCCCRHOCHRO;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC CHRRHHHCOHOROCRCIROHHRCORHHCRI;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
      this.CHCICIOIHRRHOIHCIICOCCCRHOCHRO = var1;
      this.CHRRHHHCOHOROCRCIROHHRCORHHCRI = var2 == null ? null : RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", var2);
   }

   public abstract List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> OIHCRRRHIRROIIOORHCCOHOCROIICC();

   public List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HHOICCCRHIIOIHIHHHRIROIHOROIHI() {
      List var1 = this.OIHCRRRHIRROIIOORHCCOHOCROIICC();
      if (var1 != null && !var1.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 : var1) {
            try {
               Collection var5 = this.HRRHRCCOOIOIIIRORIOOORORHOORIH((String)var4.OHICIOOICHICOIOCOROIIOCCHRRCIC, (String)var4.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC);
               if (var5 != null) {
                  var2.addAll(var5);
               }
            } catch (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Waypoints", "Failed to decode waypoint data from " + (String)var4.OHICIOOICHICOIOCOROIIOCCHRRCIC + ": " + var6.getMessage()
               );
            }
         }

         return var2;
      } else {
         return Collections.emptyList();
      }
   }

   public Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HRRHRCCOOIOIIIRORIOOORORHOORIH(
      @Nullable String var1, String var2
   ) {
      if (var2 != null && !var2.trim().isEmpty()) {
         try {
            Collection var3 = this.OHRRHHOCROROCCIRROIHOCCHCIHCIR(var1, var2);
            return var3 != null ? var3 : Collections.emptyList();
         } catch (Exception var4) {
            throw new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               "Failed to decode waypoint data: " + var4.getMessage(), var4
            );
         }
      } else {
         return Collections.emptyList();
      }
   }

   protected abstract Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHRRHHOCROROCCIRROIHOCCHCIHCIR(
      @Nullable String var1, String var2
   );

   protected int parseInt(String var1, int var2) {
      try {
         return var1 != null ? Integer.parseInt(var1.trim()) : var2;
      } catch (NumberFormatException var4) {
         return var2;
      }
   }

   protected float HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, float var2) {
      try {
         return var1 != null ? Float.parseFloat(var1.trim()) : var2;
      } catch (NumberFormatException var4) {
         return var2;
      }
   }

   protected boolean parseBoolean(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      }

      String var3 = var1.trim().toLowerCase();

      return switch (var3) {
         case "true", "1", "yes", "enabled" -> true;
         case "false", "0", "no", "disabled" -> false;
         default -> var2;
      };
   }

   protected int CHCIRRHRCIRCHIIROHOOOHRCOHORII(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         String var2 = var1.toLowerCase();
         if (var2.contains("nether") || var2.equals("-1")) {
            return -1;
         } else {
            return !var2.contains("end") && !var2.equals("1") ? 0 : 1;
         }
      }
   }

   protected String IRRCCOICORICIHCHRHIHIHROIRHOCR(String var1, boolean var2) {
      if (var1 != null && !var1.trim().isEmpty()) {
         String var3 = var1.trim();
         return var2 ? "mp:" + var3 : "sp:" + var3;
      } else {
         return var2 ? "mp:unknown" : "sp:unknown";
      }
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("name", this.CHCICIOIHRRHOIHCIICOCCCRHOCHRO);
      if (this.CHRRHHHCOHOROCRCIROHHRCORHHCRI != null) {
         var1.addProperty("icon", this.CHRRHHHCOHOROCRCIROHHRCORHHCRI.bridge$getPath());
      }

      return var1;
   }

   @Generated
   public String getName() {
      return this.CHCICIOIHRRHOIHCIICOCCCRHOCHRO;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IOException {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
         super(var1);
      }

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Throwable var2) {
         super(var1, var2);
      }
   }
}
