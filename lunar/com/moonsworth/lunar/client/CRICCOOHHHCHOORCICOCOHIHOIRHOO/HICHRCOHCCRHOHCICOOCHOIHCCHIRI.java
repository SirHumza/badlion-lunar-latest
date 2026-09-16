package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import lombok.Generated;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI implements com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   private final String OIHRHIRRHRRIRHROORRROCOHOIHCRC;
   private final String IOIIRHROCOICOHROCORIHCIHCCRROC;
   private final String RCRHIICIROCHHICHCHOIOIHIRCHCHH;
   private final List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHHRICOOOCRROCIHCHHCCORCCRHHRH;
   private JsonObject CHROCOIOHCROIRCHRRRHOIRHIHHICH;

   public boolean COOOICOOORICCIHCIRHOOIRHIHCHOH() {
      return this.OIHRHIRRHRRIRHROORRROCOHOIHCRC != null && this.IOIIRHROCOICOHROCORIHCIHCCRROC != null;
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(JsonObject var1) {
      this.CHROCOIOHCROIRCHRRRHOIRHIHHICH = var1;
   }

   @Override
   public void load(JsonObject var1) {
      JsonObject var2 = new JsonObject();
      if (var1.isJsonObject() && var1.has("keybinds")) {
         var2 = var1.get("keybinds").getAsJsonObject();
      }

      this.CRRRICCRROCOHHOHIICIHORCOORRRH(var2);
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      String var2 = this.OOHRCRHHIOOIRCCHHHICHHICICRHCH();
      if (var2 != null) {
         JsonObject var3 = new JsonObject();

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 : IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getGameSettings()
            .bridge$getKeyBindings()) {
            if (var7.bridge$getCategory().equals(var2)) {
               var3.addProperty(var7.bridge$getUntranslatedKeyDescription(), var7.bridge$getKey().name());
            }
         }

         if (!var3.isEmpty()) {
            var1.add("keybinds", var3);
         }

         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var3);
      }
   }

   @Generated
   public String ICHOIRCIHHIORHHCCCRIHICIHHCHIH() {
      return this.OIHRHIRRHRRIRHROORRROCOHOIHCRC;
   }

   @Generated
   public String OOHRCRHHIOOIRCCHHHICHHICICRHCH() {
      return this.IOIIRHROCOICOHROCORIHCIHCCRROC;
   }

   @Generated
   public String ICHRRIIRHOIOCCORIOHHOHCCCOIRRH() {
      return this.RCRHIICIROCHHICHCHOIOIHIRCHCHH;
   }

   @Generated
   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CHHOIROOORROCCOCHORRHIOIOIIIRO() {
      return this.HHHRICOOOCRROCIHCHHCCORCCRHHRH;
   }

   @Generated
   public JsonObject OIIOORHICCRHOHOCRCHHOOHOHCHHOH() {
      return this.CHROCOIOHCROIRCHRRRHOIRHIHHICH;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      String var1,
      String var2,
      String var3,
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var4,
      JsonObject var5
   ) {
      this.OIHRHIRRHRRIRHROORRROCOHOIHCRC = var1;
      this.IOIIRHROCOICOHROCORIHCIHCCRROC = var2;
      this.RCRHIICIROCHHICHCHOIOIHIRCHCHH = var3;
      this.HHHRICOOOCRROCIHCHHCCORCCRHHRH = var4;
      this.CHROCOIOHCROIRCHRRRHOIRHIHHICH = var5;
   }
}
