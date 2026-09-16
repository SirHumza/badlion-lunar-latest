package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final String HCCCIRRICHOCOCHOOROCRHICIRHRII = "**ArbitraryData**";
   private final Map<String, HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OCORIIRRORIRHIRCOCHCOIIHHHHCHI;

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH(Map<String, HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
      this.OCORIIRRORIRHIRCOCHCOIIHHHHCHI = var1;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH OCIROOIHIHRHOCCHIIIROOCRIIOCRR(JsonObject var0) {
      LinkedHashMap var1 = new LinkedHashMap();

      for (Entry var3 : var0.entrySet()) {
         if (((JsonElement)var3.getValue()).isJsonObject()) {
            var1.put((String)var3.getKey(), IIHHICHCCCOHCHROIRIHICCHHOROCR(((JsonElement)var3.getValue()).getAsJsonObject()));
         }
      }

      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCOCHHHCCIORCORCHIOOOCCCCHICH(JsonObject var0) {
      return IIHHICHCCCOHCHROIRIHICCHHOROCR(var0);
   }

   private static HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIHHICHCCCOHCHROIRIHICCHHOROCR(JsonObject var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      JsonObject var2 = null;

      for (Entry var4 : var0.entrySet()) {
         String var5 = (String)var4.getKey();
         if (var5.equals("**ArbitraryData**")) {
            if (((JsonElement)var4.getValue()).isJsonObject()) {
               var2 = ((JsonElement)var4.getValue()).getAsJsonObject();
            }
         } else if (!((JsonElement)var4.getValue()).isJsonObject() && !((JsonElement)var4.getValue()).isJsonNull()) {
            var1.put(var5, ((JsonElement)var4.getValue()).getAsString());
         }
      }

      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   public Set<String> HHOCOCIHCOROOIOHOHCCHOIRIOHCOR() {
      return Collections.unmodifiableSet(this.OCORIIRRORIRHIRCOCHCOIIHHHHCHI.keySet());
   }

   public boolean has(String var1) {
      return this.OCORIIRRORIRHIRCOCHCOIIHHHHCHI.containsKey(var1);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCRCCROHHIHRIIRHOROIOIRCRHHOHI(String var1) {
      return this.OCORIIRRORIRHIRCOCHCOIIHHHHCHI.get(var1);
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Map<String, String> settings;
      private final JsonObject OIIHRRHOCHHHRCCHIIORRHCCHRICII;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<String, String> var1) {
         this(var1, null);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<String, String> var1, JsonObject var2) {
         this.settings = var1;
         this.OIIHRRHOCHHHRCCHIIORRHCCHRICII = var2;
      }

      public JsonObject IHIOIHRIHHHCCHCOIHOHROIRHRICIC() {
         return this.OIIHRRHOCHHHRCCHIIORRHCCHRICII;
      }

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHRRRICCOOCRORCOIROOROCCOHRRHO(String var1) {
         LinkedHashMap var2 = new LinkedHashMap();
         this.settings.forEach((var2x, var3) -> {
            if (var2x.startsWith(var1)) {
               var2.put(var2x.substring(var1.length()), var3);
            }
         });
         return new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      }

      public boolean has(String var1) {
         return this.settings.containsKey(var1);
      }

      public String CCHORHIOORICCIRIHRIIHIICORIORO(String var1, String var2) {
         String var3 = this.settings.get(var1);
         return var3 == null ? var2 : var3;
      }

      public boolean OCRHORCRRHCRIORIOCIRHICIRHHCOR() {
         return this.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("enabled", false);
      }

      public boolean ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(String var1, boolean var2) {
         String var3 = this.settings.get(var1);
         return var3 == null ? var2 : Boolean.parseBoolean(var3);
      }

      public float CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, float var2) {
         String var3 = this.settings.get(var1);
         if (var3 != null && !var3.isEmpty()) {
            try {
               return Float.parseFloat(var3);
            } catch (NumberFormatException var5) {
               return var2;
            }
         } else {
            return var2;
         }
      }

      public Integer HIOIOHROHRCRIIRHIICRRHCHHHHIHH(String var1) {
         String var2 = this.settings.get(var1);
         if (var2 != null && !var2.isEmpty() && !var2.equals("0")) {
            int var3 = var2.indexOf(44);
            if (var3 >= 0) {
               var2 = var2.substring(0, var3);
            }

            try {
               int var4 = Integer.parseInt(var2.trim());
               return var4 == 0 ? null : var4;
            } catch (NumberFormatException var5) {
               return null;
            }
         } else {
            return null;
         }
      }

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH COOIROCORRIHROOCCRCOIOCOHHRROO(String var1) {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICHIOROOHIICRORCCROHOROHCCORRI(this.settings.get(var1));
      }

      public String ROCHCOOHRCROOOIHICOIIIOROCOHCO() {
         return this.settings.get("hudAnchor");
      }

      public float HIHOOROORCHCROHHIHRHICICHIICRR() {
         return this.CRRRICCRROCOHHOHIICIHORCOORRRH("hudRelativeX", 0.0F);
      }

      public float HROHOIHRICOOHHHIOHHOIIHCRRCIOH() {
         return this.CRRRICCRROCOHHOHIICIHORCOORRRH("hudRelativeY", 0.0F);
      }

      public float IICOHOIHOCIIRRCRRHHICHHCIOHCRC() {
         return this.CRRRICCRROCOHHOHIICIHORCOORRRH("hudScale", 1.0F);
      }
   }
}
