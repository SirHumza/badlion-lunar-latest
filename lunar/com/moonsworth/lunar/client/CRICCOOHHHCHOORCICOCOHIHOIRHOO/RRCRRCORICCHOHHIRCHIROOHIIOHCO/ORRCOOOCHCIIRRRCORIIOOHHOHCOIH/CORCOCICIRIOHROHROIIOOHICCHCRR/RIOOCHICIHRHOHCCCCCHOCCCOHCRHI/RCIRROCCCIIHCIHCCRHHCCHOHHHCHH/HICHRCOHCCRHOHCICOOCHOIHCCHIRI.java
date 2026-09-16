package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import lombok.Generated;
import org.joml.Vector3i;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   public Map<String, List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> RRCHOCOHHHIRCIOHOOHOHOOCOCROOC;
   public Map<String, Map<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Set<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>>> ICOOHCHIHIHORHCOIHORORCRCORCCH;

   public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
      COAL(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCHCOROOHHCIHOHOCHIHRHOHOCROII().ICROOCRRHOOICOOIOCOHCHOHOIOOOH(),
         new Vector3i(20, 61, 10),
         "COAL_BLOCK"
      ),
      GOLD(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCHCOROOHHCIHOHOCHIHRHOHOCROII().RRHCHIHOIRICOICHIHOIRIOHHRHOOI(),
         new Vector3i(20, 61, 15),
         "GOLD_BLOCK"
      ),
      QUARTZ(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCHCOROOHHCIHOHOCHIHRHOHOCROII().HRIOHRORCHIICCICIHRIIHHCHHOHHO(),
         new Vector3i(20, 61, 20),
         "QUARTZ_BLOCK"
      ),
      TERRACOTTA(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCHCOROOHHCIHOHOCHIHRHOHOCROII().CHHOOIOHHRCIRIRRHHHOOCRCCHHOOR(),
         new Vector3i(10, 61, 10),
         "HARDENED_CLAY"
      ),
      EMERALD(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCHCOROOHHCIHOHOCHIHRHOHOCROII().IRRIROIHICHIOCIHOORIOIICIOHHIC(),
         new Vector3i(10, 61, 15),
         "EMERALD_BLOCK"
      ),
      DIAMOND(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCHCOROOHHCIHOHOCHIHRHOHOCROII().ICOHOCROHOHHHCCOCIHHRHOCOOCOCC(),
         new Vector3i(10, 61, 20),
         "DIAMOND_BLOCK"
      ),
      WATER(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCHCOROOHHCIHOHOCHIHRHOHOCROII().RRHCOHIOHRCIIOROOHOCOOOCHOHOIH(),
         new Vector3i(15, 60, 5),
         "WATER"
      );

      private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH block;
      private final Vector3i relativePos;
      private final String id;

      public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH byId(String var0) {
         for (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH var4 : values()) {
            if (var4.id.equals(var0)) {
               return var4;
            }
         }

         return null;
      }

      @Generated
      public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getBlock() {
         return this.block;
      }

      @Generated
      public Vector3i getRelativePos() {
         return this.relativePos;
      }

      @Generated
      public String getId() {
         return this.id;
      }

      @Generated
      CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3, Vector3i var4, String var5
      ) {
         this.block = var3;
         this.relativePos = var4;
         this.id = var5;
      }
   }

   public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      PURPLE(Component.text("Purple").color(NamedTextColor.LIGHT_PURPLE), new Vector3i(16, 57, 19), "PURPLE_WOOL"),
      ORANGE(Component.text("Orange").color(NamedTextColor.GOLD), new Vector3i(16, 57, 18), "ORANGE_WOOL"),
      BLUE(Component.text("Blue").color(NamedTextColor.BLUE), new Vector3i(16, 57, 17), "BLUE_WOOL"),
      GREEN(Component.text("Green").color(NamedTextColor.GREEN), new Vector3i(16, 57, 16), "LIME_WOOL"),
      RED(Component.text("Red").color(NamedTextColor.RED), new Vector3i(16, 57, 15), "RED_WOOL");

      private final Component pretty;
      private final Vector3i relativePos;
      private final String serializedName;

      private static HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH bySerializedName(String var0) {
         for (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : values()) {
            if (var4.serializedName.equals(var0)) {
               return var4;
            }
         }

         return null;
      }

      @Generated
      public Component getPretty() {
         return this.pretty;
      }

      @Generated
      public Vector3i getRelativePos() {
         return this.relativePos;
      }

      @Generated
      public String getSerializedName() {
         return this.serializedName;
      }

      @Generated
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(Component var3, Vector3i var4, String var5) {
         this.pretty = var3;
         this.relativePos = var4;
         this.serializedName = var5;
      }
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements JsonDeserializer<HICHRCOHCCRHOHCICOOCHOIHCCHIRI> {
      public HICHRCOHCCRHOHCICOOCHOIHCCHIRI IHHCHHHCRIHOOCOIOOCRIIICIOROIR(JsonElement var1, Type var2, JsonDeserializationContext var3) {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI var4 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI();
         JsonObject var5 = var1.getAsJsonObject();
         JsonObject var6 = var5.get("fast").getAsJsonObject();
         JsonObject var7 = var5.get("normal").getAsJsonObject();
         var4.RRCHOCOHHHIRCIOHOOHOHOOCOCROOC = this.IHIRRIIORRHORHRORIHOROIRCORCOO(var6);
         var4.ICOOHCHIHIHORHCOIHORORCRCORCCH = this.IOIICIRIICICIIOORHCIIIIRRIHRHI(var7);
         return var4;
      }

      private Map<String, List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> IHIRRIIORRHORHRORIHOROIRCORCOO(JsonObject var1) {
         HashMap var2 = new HashMap();

         for (Entry var4 : var1.entrySet()) {
            JsonArray var5 = ((JsonElement)var4.getValue()).getAsJsonArray();
            ArrayList var6 = new ArrayList();

            for (JsonElement var8 : var5) {
               var6.add(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8.getAsJsonObject(), true));
            }

            var2.put((String)var4.getKey(), var6);
         }

         return var2;
      }

      private Map<String, Map<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Set<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>>> IOIICIRIICICIIOORHCIIIIRRIHRHI(
         JsonObject var1
      ) {
         HashMap var2 = new HashMap();

         for (Entry var4 : var1.entrySet()) {
            HashMap var5 = new HashMap();

            for (Entry var7 : ((JsonElement)var4.getValue()).getAsJsonObject().entrySet()) {
               JsonArray var8 = ((JsonElement)var7.getValue()).getAsJsonArray();
               HashSet var9 = new HashSet();

               for (JsonElement var11 : var8) {
                  var9.add(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11.getAsJsonObject(), false));
               }

               var5.put(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.bySerializedName((String)var7.getKey()), var9);
            }

            var2.put((String)var4.getKey(), var5);
         }

         return var2;
      }

      private HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var1, boolean var2) {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.byId(
            var1.get("a").getAsString()
         );
         int var4 = var2 ? var1.get("b").getAsInt() : -1;
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = var2
            ? HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FLIP
            : HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.byId(var1.get("b").getAsString());
         return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3, var5);
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final int ICRICOICRCRIRORRCHOIOIRCHHCRIR;
      private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH RHHOOIICORCROOHHHRIOIIHRCORRHO;
      private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRCOCCRIOIHIRRROHCCRIRIICOICCO;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         int var1,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
      ) {
         this.ICRICOICRCRIRORRCHOIOIRCHHCRIR = var1;
         this.RHHOOIICORCROOHHHRIOIIHRCORRHO = var2;
         this.CRCOCCRIOIHIRRROHCCRIRIICOICCO = var3;
      }

      public int HIRCRCOCCHORCRHHCCIRCHCHIHIIIH() {
         return this.ICRICOICRCRIRORRCHOIOIRCHHCRIR;
      }

      public HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH HHIHOIROIIOHCCOIHROHOHOCICOHIC() {
         return this.RHHOOIICORCROOHHHRIOIIHRCORRHO;
      }

      public HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICCHHCIOHRRIRHRHOORIRIRRCOOCRI() {
         return this.CRCOCCRIOIHIRRROHCCRIRIICOICCO;
      }

      public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
         FLIP("FLIP"),
         UP("UP"),
         DOWN("DOWN");

         private final String id;

         private static HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH byId(String var0) {
            for (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
               if (var4.id.equals(var0)) {
                  return var4;
               }
            }

            return null;
         }

         @Generated
         public String getId() {
            return this.id;
         }

         @Generated
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
            this.id = var3;
         }
      }
   }
}
