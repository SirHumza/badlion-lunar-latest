package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import lombok.Generated;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final Map<String, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH> RRHHHCOOICRIRCCCOIORIHIHRHROOO = new HashMap<>();
   private final Set<String> RCROCOCIOOHHOIHIHHHIOHCROHCRII = new LinkedHashSet<>();
   private int HICIIHICHOHHIICRCHIOOOCRHHHIHR = HHCCIRHCCCIIRHCROHIORHIRHHIORH.CICORHRHIOCOOCCICRICHOOCROIHRH;
   private final Map<String, Set<String>> RICRROIIIHORIOCHCOORHRIIOHHIOH = new HashMap<>();

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2) {
      if (var1.IRRHCIOORHOOORHHOOIRRIROIOHCOH() && var1.OCIHCORIIRCCRRICRIIOHRHHIOIRCH()) {
         var1.OOHRCHOICIHIRCOOIRRIHROHIIHOHI().add(var2);
         this.RICRROIIIHORIOCHCOORHRIIOHHIOH.put(var1.key(), var1.OOHRCHOICIHIRCOOIRRIHROHIIHOHI());
      } else {
         throw new IllegalArgumentException("Tried to add a user defined subcommand to a command that does not allow it.");
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2) {
      if (var1.IRRHCIOORHOOORHHOOIRRIROIOHCOH() && var1.OCIHCORIIRCCRRICRIIOHRHHIOIRCH()) {
         var1.OOHRCHOICIHIRCOOIRRIHROHIIHOHI().remove(var2);
         this.RICRROIIIHORIOCHCOORHRIIOHHIOH.get(var1.key()).remove(var2);
      } else {
         throw new IllegalArgumentException("Tried to remove a user defined subcommand to a command that does not allow it.");
      }
   }

   public void CHCHCOCORRHHOIICICIOIHHHHOIOOC() {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.CIICIHOIRIIHHHHIRHHIOHICHOCRHR();
      if (var1 != null && !var1.HOCRHIORORRIOHCROICCRHCRHCOCOI().isEmpty()) {
         if (this.HICIIHICHOHHIICRCHIOOOCRHHHIHR < HHCCIRHCCCIIRHCROHIORHIRHHIORH.CICORHRHIOCOOCCICRICHOOCROIHRH) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1, this.HICIIHICHOHHIICRCHIOOOCRHHHIHR);
            this.HICIIHICHOHHIICRCHIOOOCRHHHIHR = HHCCIRHCCCIIRHCROHIORHIRHHIORH.CICORHRHIOCOOCCICRICHOOCROIHRH;
         }

         for (Entry var3 : this.RICRROIIIHORIOCHCOORHRIIOHHIOH.entrySet()) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this.CRRHROIHCIOHCICOOHHHOOHROHOROH((String)var3.getKey());
            if (var4 != null && var4.OOHRCHOICIHIRCOOIRRIHROHIIHOHI() != null) {
               var4.OOHRCHOICIHIRCOOIRRIHROHIIHOHI().addAll((Collection<? extends String>)var3.getValue());
            }
         }
      }
   }

   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIICIHOIRIIHHHHIRHHIOHICHOCRHR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHIIROIOIHOHCHICOIIIHOHHCOIOCI()
         .ORICRIRORRCHHHRRHOORHIRCICHCCO()
         .IHHHHIRRCRRIIHHOIIOHCOICOROCHH();
   }

   public IRCRRHRCIRHIHIHROHCRRHIIHHHHCH CRRRICCRROCOHHOHIICIHORCOORRRH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      return !this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.containsKey(var1.key())
         ? this.ROCHIOHHRRCOCIIHRROIIHOROICRHH(var1.key())
         : this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.get(var1.key());
   }

   public IRCRRHRCIRHIHIHROHCRRHIIHHHHCH HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2) {
      return !this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.containsKey(var1.key(var2))
         ? this.ROCHIOHHRRCOCIIHRROIIHOROICRHH(var1.key(var2))
         : this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.get(var1.key(var2));
   }

   IRCRRHRCIRHIHIHROHCRRHIIHHHHCH ROCHIOHHRRCOCIIHRROIIHOROICRHH(String var1) {
      if (this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.containsKey(var1)) {
         return this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.get(var1);
      }

      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var2 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRCIHRIHOHORIROHIROORCOCCHOOI(var1)
         .IHCOIHIICIIHOOIICCHHCRORHORHCI(true)
         .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.put(var1, var2);
      var2.OOCCRCRCOHIIORCCORCRCIRRROIOOR(() -> {
         if (this.CRCCHCHOCRROOHCORCCOOIIHIIROHR()) {
            String var2x = this.RIOOCHOIIRROHCORCROHCHCHIIIIOO(var1);
            if (var2x != null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$sendCommand("/" + var2x);
            }
         }
      });
      return var2;
   }

   public boolean CRCCHCHOCRROOHCORCCOOIIHIIROHR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().IHIIROIOIHOHCHICOIIIHOHHCOIOCI().isEnabled()
         && OCOHORHCROHICRRIHCIHHRRCIHICRI.RRRCCHIOCICOIOIRRCOOIRHHCORCIH();
   }

   public String RIOOCHOIIRROHCORCROHCHCHIIIIOO(String var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.CIICIHOIRIIHHHHIRHHIOHICHOCRHR();
      if (var2 == null) {
         return null;
      }

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : var2.HOCRHIORORRIOHCROICCRHCRHCOCOI()) {
         String var5 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var4);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH CRRHROIHCIOHCICOOHHHOOHROHOROH(String var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.CIICIHOIRIIHHHHIRHHIOHICHOCRHR();
      if (var2 == null) {
         return null;
      }

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : var2.HOCRHIORORRIOHCROICCRHCRHCOCOI()) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      if (var2.key().equals(var1)) {
         return var2;
      }

      if (var2.IRRHCIOORHOOORHHOOIRRIROIOHCOH()) {
         if (!var2.OCIHCORIIRCCRRICRIIOHRHHIOIRCH()) {
            for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : var2.OOHRIRHIOIOHHHIIHRICOROCOIHRIR()) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         } else if (var1.startsWith(var2.key() + ":")) {
            int var7 = var2.key().length() + 1;
            String var8 = var1.substring(var7);

            for (String var6 : var2.OOHRCHOICIHIRCOOIRRIHROHIIHOHI()) {
               if (var8.equals(var6)) {
                  return var2;
               }
            }
         }
      }

      return null;
   }

   private String IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      if (var2.key().equals(var1)) {
         return var2.getCommand();
      }

      if (var2.IRRHCIOORHOOORHHOOIRRIROIOHCOH()) {
         if (!var2.OCIHCORIIRCCRRICRIIOHRHHIOIRCH()) {
            for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : var2.OOHRIRHIOIOHHHIIHRICOROCOIHRIR()) {
               String var5 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         } else if (var1.startsWith(var2.key() + ":")) {
            int var7 = var2.key().length() + 1;
            String var8 = var1.substring(var7);

            for (String var6 : var2.OOHRCHOICIHIRCOOIRRIHROHIIHOHI()) {
               if (var8.equals(var6)) {
                  return var2.getCommand() + " " + var6;
               }
            }
         }
      }

      return null;
   }

   public void load(JsonObject var1) {
      JsonObject var2 = var1.getAsJsonObject();
      this.HICIIHICHOHHIICRCHIOOOCRHHHIHR = var2.has("sbCommandsVersion") ? var2.get("sbCommandsVersion").getAsInt() : 0;
      if (var2.has("sbCommandKeyBinds")) {
         JsonObject var3 = var2.get("sbCommandKeyBinds").getAsJsonObject();

         for (Entry var5 : var3.entrySet()) {
            String var6 = (String)var5.getKey();
            JsonObject var7 = ((JsonElement)var5.getValue()).getAsJsonObject();
            this.ROCHIOHHRRCOCIIHRROIIHOROICRHH(var6).load(var7);
         }
      }

      if (var2.has("sbCommandFavorites")) {
         this.RCROCOCIOOHHOIHIHHHIOHCROHCRII.clear();

         for (JsonElement var15 : var2.getAsJsonArray("sbCommandFavorites")) {
            this.RCROCOCIOOHHOIHIHHHIOHCROHCRII.add(var15.getAsString());
         }
      }

      if (var2.has("sbUserDefinedSubCommands")) {
         this.RICRROIIIHORIOCHCOORHRIIOHHIOH.clear();
         JsonObject var12 = var2.get("sbUserDefinedSubCommands").getAsJsonObject();

         for (Entry var16 : var12.entrySet()) {
            String var17 = (String)var16.getKey();
            JsonArray var18 = ((JsonElement)var16.getValue()).getAsJsonArray();
            LinkedHashSet var8 = new LinkedHashSet();

            for (JsonElement var10 : var18) {
               var8.add(var10.getAsString());
            }

            this.RICRROIIIHORIOCHCOORHRIIOHHIOH.put(var17, var8);
         }
      }

      this.CHCHCOCORRHHOIICICIOIHHHHOIOOC();
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      this.CHCHCOCORRHHOIICICIOIHHHHOIOOC();
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.CIICIHOIRIIHHHHIRHHIOHICHOCRHR();
      if (var2 != null && !var2.HOCRHIORORRIOHCROICCRHCRHCOCOI().isEmpty()) {
         var1.addProperty("sbCommandsVersion", this.HICIIHICHOHHIICRCHIOOOCRHHHIHR);
         JsonObject var3 = new JsonObject();

         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 : var2.HOCRHIORORRIOHCROICCRHCRHCOCOI()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var3);
         }

         var1.add("sbCommandKeyBinds", var3);
         JsonArray var13 = new JsonArray();

         for (String var6 : this.RCROCOCIOOHHOIHIHHHIOHCROHCRII) {
            var13.add(new JsonPrimitive(var6));
         }

         var1.add("sbCommandFavorites", var13);
         JsonObject var15 = new JsonObject();

         for (Entry var7 : this.RICRROIIIHORIOCHCOORHRIIOHHIOH.entrySet()) {
            String var8 = (String)var7.getKey();
            Set var9 = (Set)var7.getValue();
            JsonArray var10 = new JsonArray();

            for (String var12 : var9) {
               var10.add(new JsonPrimitive(var12));
            }

            var15.add(var8, var10);
         }

         var1.add("sbUserDefinedSubCommands", var15);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, JsonObject var2) {
      if (this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.containsKey(var1.key())) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var3 = this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.get(var1.key());
         JsonObject var4 = new JsonObject();
         var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4);
         var2.add(var1.key(), var4);
      }

      if (var1.IRRHCIOORHOOORHHOOIRRIROIOHCOH()) {
         if (var1.OCIHCORIIRCCRRICRIIOHRHHIOIRCH()) {
            if (var1.OOHRCHOICIHIRCOOIRRIHROHIIHOHI() != null) {
               for (String var9 : var1.OOHRCHOICIHIRCOOIRRIHROHIIHOHI()) {
                  IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var5 = this.RRHHHCOOICRIRCCCOIORIHIHRHROOO.get(var1.key(var9));
                  JsonObject var6 = new JsonObject();
                  var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6);
                  var2.add(var1.key(var9), var6);
               }
            }
         } else {
            for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 : var1.OOHRIRHIOIOHHHIIHRICOROCOIHRIR()) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var2);
            }
         }
      }
   }

   @Generated
   public Map<String, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH> RCHCROHCIHOIIOCHOROHRHRHRRHIIO() {
      return this.RRHHHCOOICRIRCCCOIORIHIHRHROOO;
   }

   @Generated
   public Set<String> HICICOHHCRCOCIHCRCICIOCRHOOIOH() {
      return this.RCROCOCIOOHHOIHIHHHIOHCROHCRII;
   }

   @Generated
   public int IIIHHOCRCRHHOOHIOCOHCHIRCHOCHO() {
      return this.HICIIHICHOHHIICRCHIOOOCRHHHIHR;
   }

   @Generated
   public Map<String, Set<String>> OHHHORIRCCHIHIHCOOIRCRORRORROI() {
      return this.RICRROIIIHORIOCHCOORHRIIOHHIOH;
   }
}
