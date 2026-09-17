package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final Set<String> ROCICORRCIROICCHCCCHOHIRIIHORI = Set.of(
      "recentColors",
      "recentModColors",
      "modCategories",
      "version",
      "originalVersion",
      "mcVersionCreatedOn",
      "badlionVersionCreatedOn",
      "guiScale",
      "boxes",
      "successNotification",
      "warningNotification",
      "infoNotification",
      "errorNotification",
      "lastDisplayWidth",
      "lastDisplayHeight",
      "defaultModMode",
      "textModeSettings",
      "graphicModeSettings",
      "hideModsInF3"
   );
   private final Map<String, com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HCRRHCOIOICHOCHRCIIHRRCHICRHCC;
   private final Map<String, JsonObject> IHOOOHHRIHHRCRCIOIRCIRCIIRCHCR;
   private final JsonObject RHCCIOCOROORRRHORCRRROCROCHCHH;
   private final JsonObject ICHIRCORIORHRHIRHCCRCIRORRRHCO;
   private final String CHOHIICIRRCOIRHIOOOCOHRCHCRHHC;

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Map<String, com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1,
      Map<String, JsonObject> var2,
      JsonObject var3,
      JsonObject var4,
      String var5
   ) {
      this.HCRRHCOIOICHOCHRCIIHRRCHICRHCC = var1;
      this.IHOOOHHRIHHRCRCIOIRCIRCIIRCHCR = var2;
      this.RHCCIOCOROORRRHORCRRROCROCHCHH = var3;
      this.ICHIRCORIORHRHIRHCCRCIRORRRHCO = var4;
      this.CHOHIICIRRCOIRHIOOOCOHRCHCRHHC = var5;
   }

   public static com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HIHHOCRHHRORRHHRORRRIIHHORIHOC(
      JsonObject var0
   ) {
      LinkedHashMap var1 = new LinkedHashMap();

      for (Entry var3 : var0.entrySet()) {
         if (!ROCICORRCIROICCHCCCHOHIRIIHORI.contains(var3.getKey()) && ((JsonElement)var3.getValue()).isJsonObject()) {
            var1.put(
               (String)var3.getKey(),
               new com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  ((JsonElement)var3.getValue()).getAsJsonObject()
               )
            );
         }
      }

      LinkedHashMap var7 = new LinkedHashMap();
      JsonElement var8 = var0.get("boxes");
      if (var8 != null && var8.isJsonArray()) {
         for (JsonElement var5 : var8.getAsJsonArray()) {
            if (var5.isJsonObject()) {
               JsonObject var6 = var5.getAsJsonObject();
               if (var6.has("identifier")) {
                  var7.put(var6.get("identifier").getAsString().toLowerCase(Locale.ROOT), var6);
               }
            }
         }
      }

      return new com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1,
         var7,
         RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var0.get("graphicModeSettings")),
         RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var0.get("textModeSettings")),
         var0.has("defaultModMode") ? var0.get("defaultModMode").getAsString() : "GRAPHICS"
      );
   }

   private static JsonObject RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(JsonElement var0) {
      return var0 != null && var0.isJsonObject() ? var0.getAsJsonObject() : new JsonObject();
   }

   public Set<String> HHOCOCIHCOROOIOHOHCCHOIRIOHCOR() {
      return Collections.unmodifiableSet(this.HCRRHCOIOICHOCHRCIIHRRCHICRHCC.keySet());
   }

   public com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH ICIRRHRIORRCHCCHIRIICHOOIRRHIC(
      String var1
   ) {
      return this.HCRRHCOIOICHOCHRCIIHRRCHICRHCC.get(var1);
   }

   public com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI(
      String var1
   ) {
      JsonObject var2 = this.IHOOOHHRIHHRCRCIOIRCIRCIIRCHCR.get(var1.toLowerCase(Locale.ROOT));
      return var2 == null
         ? null
         : com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(
            var2
         );
   }

   public boolean HRCHROCHROIIOOIOHIRRICIHIRROOH() {
      return "TEXT".equalsIgnoreCase(this.CHOHIICIRRCOIRHIOOOCOHRCHCRHHC);
   }

   public JsonElement IOCIIROIRCOHIRHHHROHCOOHIICIHI(String var1, String var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, "graphicModeSettings", this.RHCCIOCOROORRRHORCRRROCROCHCHH);
   }

   public JsonElement CCRHOICIRORRHOOOCIHHHHCHCICHOH(String var1, String var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, "textModeSettings", this.ICHIRCORIORHRHIRHCCRCIRORRRHCO);
   }

   private JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3, JsonObject var4) {
      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.HCRRHCOIOICHOCHRCIIHRRCHICRHCC
         .get(var1);
      if (var5 != null) {
         JsonElement var6 = var5.IHHHIHOHOOHOHCIIRHIIICCRHCRRRR.get(var3);
         if (var6 != null && var6.isJsonObject()) {
            JsonElement var7 = var6.getAsJsonObject().get(var2);
            if (var7 != null && var7.isJsonObject() && var7.getAsJsonObject().has("set") && var7.getAsJsonObject().get("set").getAsBoolean()) {
               return var7;
            }
         }
      }

      return var4.get(var2);
   }

   public static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final JsonObject IHHHIHOHOOHOHCIIRHIIICCRHCRRRR;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var1) {
         this.IHHHIHOHOOHOHCIIRHIIICCRHCRRRR = var1;
      }

      public boolean has(String var1) {
         return this.IHHHIHOHOOHOHCIIRHIIICCRHCRRRR.has(var1) && !this.IHHHIHOHOOHOHCIIRHIIICCRHCRRRR.get(var1).isJsonNull();
      }

      public boolean OCRHORCRRHCRIORIOCIRHICIRHHCOR() {
         return this.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("enabled", false);
      }

      public boolean ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(String var1, boolean var2) {
         JsonElement var3 = this.IRHROHHCIOHHIOOIORRHIHCHHHCRCC(var1);
         return var3 != null && var3.isJsonPrimitive() && var3.getAsJsonPrimitive().isBoolean() ? var3.getAsBoolean() : var2;
      }

      public float CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, float var2) {
         JsonElement var3 = this.IRHROHHCIOHHIOOIORRHIHCHHHCRCC(var1);
         return var3 != null && var3.isJsonPrimitive() && var3.getAsJsonPrimitive().isNumber() ? var3.getAsFloat() : var2;
      }

      public String CCHORHIOORICCIRIHRIIHIICORIORO(String var1, String var2) {
         JsonElement var3 = this.IRHROHHCIOHHIOOIORRHIHCHHHCRCC(var1);
         return var3 != null && var3.isJsonPrimitive() && var3.getAsJsonPrimitive().isString() ? var3.getAsString() : var2;
      }

      public com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIHIRCIOIHIRRICIHHROORCOOHRICC(
         String var1
      ) {
         return com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
            this.IHHHIHOHOOHOHCIIRHIIICCRHCRRRR.get(var1)
         );
      }

      public JsonElement OHOOIIIHRRIOOIOIRRHCRROHRHOHRI(String var1) {
         return this.IHHHIHOHOOHOHCIIRHIIICCRHCRRRR.get(var1);
      }

      public com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HICRCCCICOCCRORIICHRCOIIHHIIRC(
         String var1
      ) {
         JsonElement var2 = this.IHHHIHOHOOHOHCIIRHIIICCRHCRRRR.get(var1);
         return var2 != null && var2.isJsonObject()
            ? new com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var2.getAsJsonObject()
            )
            : null;
      }

      private JsonElement IRHROHHCIOHHIOOIORRHIHCHHHCRCC(String var1) {
         JsonElement var2 = this.IHHHIHOHOOHOHCIIRHIIICCRHCRRRR.get(var1);
         return var2 != null && var2.isJsonObject() && var2.getAsJsonObject().has("value") ? var2.getAsJsonObject().get("value") : var2;
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String IOHHHRIROIOORORICCRRHCHRCCOCIR;
      private final float ROCOORRCHCICICRRCIOROORROIORHC;
      private final float HCRCCROCRCHOIOIOIRHIRHIIRIHOIO;
      private final float ICIRCCIORIOHHOHHOCHCOIICRRIRRR;
      private final float IOHRCIHIORCORCIORCRIRIOICOROOR;
      private final int HIHCHICIHIRIORORRCHIIOCRRHIOOO;
      private final int OOIHCIHHOCIRRICCCCHIIIIRRCIOOC;
      private final boolean computed;
      private final float IHRRRHORIRHCCHIHRIOHIRHOCROICR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, float var2, float var3, float var4, float var5, int var6, int var7, boolean var8, float var9) {
         this.IOHHHRIROIOORORICCRRHCHRCCOCIR = var1;
         this.ROCOORRCHCICICRRCIOROORROIORHC = var2;
         this.HCRCCROCRCHOIOIOIRHIRHIIRIHOIO = var3;
         this.ICIRCCIORIOHHOHHOCHCOIICRRIRRR = var4;
         this.IOHRCIHIORCORCIORCRIRIOICOROOR = var5;
         this.HIHCHICIHIRIORORRCHIIOCRRHIOOO = var6;
         this.OOIHCIHHOCIRRICCCCHIIIIRRCIOOC = var7;
         this.computed = var8;
         this.IHRRRHORIRHCCHIHRIOHIRHOCROICR = var9;
      }

      static com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOCHRIIIRIHRRCRIORHCROIIHCRRIC(
         JsonObject var0
      ) {
         return new com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var0.has("quadrant") ? var0.get("quadrant").getAsString() : "TOP_LEFT",
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, "xPosition", 0.0F),
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, "yPosition", 0.0F),
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, "width", 0.0F),
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, "height", 0.0F),
            (int)IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, "screenWidth", 1920.0F),
            (int)IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, "screenHeight", 1080.0F),
            var0.has("type") && "computed".equalsIgnoreCase(var0.get("type").getAsString()),
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, "scale", 2.0F)
         );
      }

      private static float IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, float var2) {
         return var0.has(var1) && var0.get(var1).isJsonPrimitive() ? var0.get(var1).getAsFloat() : var2;
      }

      public float HOCROIOIOHOHRRRORIIHRRRICHHOIH() {
         return this.CHROCOHCRIIHHIRHCCICROIOOHHRIC() + Math.round(this.RIICOIOCRHHHHCHOOCRROOHRHRHIIR() * this.ROCOORRCHCICICRRCIOROORROIORHC);
      }

      public float CRHRIHOCROHIHHCOIIRRCRCRRHRHRR() {
         return this.RCIIHIICIRORRRIRROOOHOCHOOHCIH() + Math.round(this.CHRIOIIICHHOHIRCHRIIHRIICIOCRC() * this.HCRCCROCRCHOIOIOIRHIRHIIRIHOIO);
      }

      public float RIICOIOCRHHHHCHOOCRROOHRHRHIIR() {
         return this.HIHCHICIHIRIORORRCHIIOCRRHIOOO / 3.0F;
      }

      public float CHRIOIIICHHOHIRCHRIIHRIICIOCRC() {
         return this.OOIHCIHHOCIRRICCCCHIIIIRRCIOOC / 3.0F;
      }

      public float CHROCOHCRIIHHIRHCCICROIOOHHRIC() {
         return this.RICHRHRRIOHRRCOOICICOIIORORCRO() * this.RIICOIOCRHHHHCHOOCRROOHRHRHIIR();
      }

      public float RCIIHIICIRORRRIRROOOHOCHOOHCIH() {
         return this.OIOHORCIHIRIIICCHRCRHCOCROIIHH() * this.CHRIOIIICHHOHIRCHRIIHRIICIOCRC();
      }

      private int RICHRHRRIOHRRCOOICICOIIORORCRO() {
         return switch (this.IOHHHRIROIOORORICCRRHCHRCCOCIR) {
            case "TOP_CENTER", "MIDDLE_CENTER", "BOTTOM_CENTER" -> 1;
            case "TOP_RIGHT", "MIDDLE_RIGHT", "BOTTOM_RIGHT" -> 2;
            default -> 0;
         };
      }

      private int OIOHORCIHIRIIICCHRCRHCOCROIIHH() {
         return switch (this.IOHHHRIROIOORORICCRRHCHRCCOCIR) {
            case "MIDDLE_LEFT", "MIDDLE_CENTER", "MIDDLE_RIGHT" -> 1;
            case "BOTTOM_LEFT", "BOTTOM_CENTER", "BOTTOM_RIGHT" -> 2;
            default -> 0;
         };
      }

      public String CRRHIORHIHCOIOICRCICRIHHRICHHH() {
         return this.IOHHHRIROIOORORICCRRHCHRCCOCIR;
      }

      public float OOIOOHHOOOHICCIOOHRCHCORORCCHI() {
         return this.ROCOORRCHCICICRRCIOROORROIORHC;
      }

      public float RCICOCCIRIIHROROROICRRCRCOIRCH() {
         return this.HCRCCROCRCHOIOIOIRHIRHIIRIHOIO;
      }

      public float IHHOOHCOCCCHRRRCOHIHIOOIHRIHRH() {
         return this.ICIRCCIORIOHHOHHOCHCOIICRRIRRR;
      }

      public float CCOOCCIOHCRRIOCHOCICRROICHHCHI() {
         return this.IOHRCIHIORCORCIORCRIRIOICOROOR;
      }

      public int CROHHIHOOORRIORRCROOCCCHHHHRRC() {
         return this.HIHCHICIHIRIORORRCHIIOCRRHIOOO;
      }

      public int HRCCOCHROHHORIRRCICIRHHRHOICOO() {
         return this.OOIHCIHHOCIRRICCCCHIIIIRRCIOOC;
      }

      public boolean OHIRRCORHHCIRHOOCICRIROIHIOIHC() {
         return this.computed;
      }

      public float scale() {
         return this.IHRRRHORIRHCCHIHRIOHIRHOCROICR;
      }
   }
}
