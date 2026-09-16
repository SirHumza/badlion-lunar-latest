package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO,
   com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   @Nullable
   private final Predicate<String> RRIIRHOCCRIOCCOOROHCIOCCRCRICI;
   private final List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CCHOCRRIHHICOHOOOCHHOCICHCHICR = new ArrayList<>();
   private JsonObject OIIRRIOOCCIIIRRIOCIHICOCHOHRIO = null;

   @Override
   public Map<com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH>> IHIHIIHRHCOICHOIOCIORORCCIRHHO() {
      HashMap var1 = new HashMap();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.CCHOCRRIHHICOHOOOCHHOCICHCHICR) {
         if (var3.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.ORRCRCCOHRCIOOCOICRICOOHOCROCH)) {
            for (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : Objects.requireNonNull(
                  var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.ORRCRCCOHRCIOOCOICRICOOHOCROCH)
               )
               .CCCCRRHICIRRIIRCIRROOROHRCRIRI()) {
               if (!var1.containsKey(var6)) {
                  var1.put(var6, new ArrayList());
               }

               ((List)var1.get(var6)).add(var3);
            }
         }
      }

      return var1;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var2
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRRCCOICORICIHCHRHIHIHROIRHOCR var3 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHHOCHOCHOCCHIIICRHRRROICHHIIC
      );
      if (var3 == null || var3.RROCRHIIHORCOCIRICHOCCICORCCCO()) {
         this.CCHOCRRIHHICOHOOOCHHOCICHCHICR.clear();
         var2.forEach(var1x -> this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1x, false));
      }
   }

   public boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(@NotNull IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, true);
   }

   private boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(@NotNull IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, boolean var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRRCCOICORICIHCHRHIHIHROIRHOCR var3 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHHOCHOCHOCCHIIICRHRRROICHHIIC
      );
      if (var3 != null && !var3.RROCRHIIHORCOCIRICHOCCICORCCCO()) {
         return false;
      }

      this.CCHOCRRIHHICOHOOOCHHOCICHCHICR.add(var1);
      var1.ORHHROIRHRHOHCOCORCHROHRICCHOO();
      if (var2) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(var1);
      }

      return true;
   }

   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(@NotNull IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.CCHOCRRIHHICOHOOOCHHOCICHCHICR.remove(var1);
   }

   @Override
   public void load(JsonObject var1) {
      int var2 = var1.has("version") ? var1.get("version").getAsInt() : 0;
      HashSet var3 = this.RRIIRHOCCRIOCCOOROHCIOCCRCRICI == null ? null : new HashSet();
      this.OIIRRIOOCCIIIRRIOCIHICOCHOHRIO = null;

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 : this.getChildren()) {
         try {
            String var6 = var5.getId();
            if (var3 != null) {
               var3.add(var6);
            }

            JsonObject var7 = var1.has(var6) && !var1.get(var6).isJsonNull() ? var1.getAsJsonObject(var6) : new JsonObject();
            var7.addProperty("version", var2);
            var5.load(var7);
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      if (this.RRIIRHOCCRIOCCOOROHCIOCCRCRICI != null && var3 != null) {
         JsonObject var9 = new JsonObject();

         for (String var11 : var1.keySet()) {
            if (this.RRIIRHOCCRIOCCOOROHCIOCCRCRICI.test(var11) && !var3.contains(var11)) {
               var9.add(var11, var1.get(var11));
            }
         }

         if (!var9.isEmpty()) {
            this.OIIRRIOOCCIIIRRIOCIHICOCHOHRIO = var9;
         }
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.getChildren()) {
         try {
            JsonObject var4 = new JsonObject();
            var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4);
            if (!var4.entrySet().isEmpty()) {
               var1.add(var3.getId(), var4);
            }
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      if (this.OIIRRIOOCCIIIRRIOCIHICOCHOHRIO != null) {
         for (Entry var7 : this.OIIRRIOOCCIIIRRIOCIHICOCHOHRIO.entrySet()) {
            var1.add((String)var7.getKey(), (JsonElement)var7.getValue());
         }
      }
   }

   @Override
   public int priority() {
      return 1500;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(@Nullable Predicate<String> var1) {
      this.RRIIRHOCCRIOCCOOROHCIOCCRCRICI = var1;
   }

   @Generated
   @Override
   public List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> getChildren() {
      return this.CCHOCRRIHHICOHOOOCHHOCICHCHICR;
   }
}
