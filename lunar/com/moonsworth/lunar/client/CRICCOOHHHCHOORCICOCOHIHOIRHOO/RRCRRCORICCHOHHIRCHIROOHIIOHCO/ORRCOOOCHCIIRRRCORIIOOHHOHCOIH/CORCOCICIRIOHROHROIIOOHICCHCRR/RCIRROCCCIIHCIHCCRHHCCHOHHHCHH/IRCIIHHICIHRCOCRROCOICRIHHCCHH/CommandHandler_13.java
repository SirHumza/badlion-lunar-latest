package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map.Entry;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements JsonDeserializer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      if (!(var1 instanceof JsonObject var4)) {
         throw new JsonParseException(var1.toString());
      } else {
         LinkedHashSet var5 = new LinkedHashSet();

         for (Entry var7 : var4.entrySet()) {
            var5.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((String)var7.getKey(), (JsonElement)var7.getValue()));
         }

         this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var5);
         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
      }
   }

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, JsonElement var2) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.OICCIOHOHIHOHICIIIRCCICRCROHRR();
      var3.CCRIIICIIIIIIHHROHCROIRCCOHCOI(var1);
      if (!(var2 instanceof JsonObject var4)) {
         throw new JsonParseException(var2.toString());
      } else {
         JsonElement var5 = var4.get("command");
         if (var5 instanceof JsonPrimitive var6) {
            if (!var6.isString()) {
               throw new JsonParseException("command is not a string");
            }

            var3.ROIHCRCOHHRHRROCIIHIHIORCIHIOH(var6.getAsString());
            JsonElement var7 = var4.get("allowsArguments");
            if (var7 != null) {
               if (!(var7 instanceof JsonPrimitive var8)) {
                  throw new JsonParseException(var7.toString());
               }

               if (!var8.isBoolean()) {
                  throw new JsonParseException("allowsArguments is not a boolean");
               }

               boolean var9 = var8.getAsBoolean();
               var3.HICRCHHRCHOIRCOHROCIHHORHIOOCH(var9);
               boolean var10 = false;
               JsonElement var11 = var4.get("anySubCommand");
               if (var11 != null) {
                  if (!(var11 instanceof JsonPrimitive var12)) {
                     throw new JsonParseException(var11.toString());
                  }

                  if (!var12.isBoolean()) {
                     throw new JsonParseException("anySubCommands is not a boolean");
                  }

                  var10 = var12.getAsBoolean();
                  var3.HOIRRRIRHICOHCCORHIHCOHIIIHCCO(var10);
               }

               if (var9 && !var10) {
                  JsonElement var17 = var4.get("subCommands");
                  if (var17 == null) {
                     throw new JsonParseException("subCommands is null while anySubCommands is false");
                  }

                  if (!(var17 instanceof JsonObject var13)) {
                     throw new JsonParseException(var17.toString());
                  }

                  LinkedHashSet var14 = new LinkedHashSet();

                  for (Entry var16 : var13.entrySet()) {
                     var14.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((String)var16.getKey(), (JsonElement)var16.getValue()));
                  }

                  var3.CORCOCICIRIOHROHROIIOOHICCHCRR(var14);
               } else {
                  var3.CORCOCICIRIOHROHROIIOOHICCHCRR(new LinkedHashSet<>());
                  var3.CRICCOOHHHCHOORCICOCOHIHOIRHOO(new LinkedHashSet<>());
               }
            }

            return var3.OHRORIRIHHHROICRICCCICORIOCIHI();
         } else {
            throw new JsonParseException(var5.toString());
         }
      }
   }

   private void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Set<IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : var1) {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      if (var1.IRRHCIOORHOOORHHOOIRRIROIOHCOH() && !var1.OCIHCORIIRCCRRICRIIOHRHHIOIRCH()) {
         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : var1.OOHRIRHIOIOHHHIIHRICOROCOIHRIR()) {
            var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
         }
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final Set<IRCIIHHICIHRCOCRROCOICRIHHCCHH> RORRIHHIICOCCIICCOCIOCIHROOHHH;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Set<IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
         this.RORRIHHIICOCCIICCOCIOCIHROOHHH = var1;
      }

      public Set<IRCIIHHICIHRCOCRROCOICRIHHCCHH> HOCRHIORORRIOHCROICCRHCRHCOCOI() {
         return this.RORRIHHIICOCCIICCOCIOCIHROOHHH;
      }
   }
}
