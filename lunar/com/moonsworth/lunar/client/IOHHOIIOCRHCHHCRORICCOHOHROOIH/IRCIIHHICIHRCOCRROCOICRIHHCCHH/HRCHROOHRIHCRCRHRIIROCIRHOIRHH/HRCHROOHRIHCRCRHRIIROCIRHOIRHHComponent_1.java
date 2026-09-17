package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.util.UUID;

public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final UUID CIORCOICHCCCIOHCRCHHCRROORIHRI;
   private final int HORORHORROCCIIIHCRRIICIICHOCOO;
   private final String CROICROHRHHRHHOHCRCRHORRHORRRI;
   private final Integer[] OCIROORRICOIHOCICCOCHHIIIIRIOI;
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH HHCOHHRHCORHHCHRCOOORRRCHICOCH;
   private final String HRRCCICHCCHOCHROOOOIHIIICHOHHH;
   private final int OOOOOIRRHOIROCHRCCIRIHHHIHCCCI;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, int var2, String var3, Integer[] var4, IRCIIHHICIHRCOCRROCOICRIHHCCHH var5, String var6, int var7) {
      this.CIORCOICHCCCIOHCRCHHCRROORIHRI = var1;
      this.HORORHORROCCIIIHCRRIICIICHOCOO = var2;
      this.CROICROHRHHRHHOHCRCRHORRHORRRI = var3;
      this.OCIROORRICOIHOCICCOCHHIIIIRIOI = var4;
      this.HHCOHHRHCORHHCHRCOOORRRCHICOCH = var5;
      this.HRRCCICHCCHOCHROOOOIHIIICHOHHH = var6;
      this.OOOOOIRRHOIROCHRCCIRIHHHIHCCCI = var7;
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", this.CIORCOICHCCCIOHCRCHHCRROORIHRI.toString());
      var1.addProperty("name", this.CROICROHRHHRHHOHCRCRHORRHORRRI);
      var1.addProperty("currency", this.HRRCCICHCCHOCHROOOOIHIIICHOHHH);
      var1.addProperty("fractionDigits", this.OOOOOIRRHOIROCHRCCIRIHHHIHCCCI);
      JsonObject var2 = new JsonObject();
      if (this.HHCOHHRHCORHHCHRCOOORRRCHICOCH.HRHRHRRIRCHCHHIRRCICCRRIIHHIHC() != null) {
         var2.addProperty("coins", this.HHCOHHRHCORHHCHRCOOORRRCHICOCH.HRHRHRRIRCHCHHIRRCICCRRIIHHIHC());
      }

      var2.addProperty("value", this.HHCOHHRHCORHHCHRCOOORRRCHICOCH.value());
      if (this.HHCOHHRHCORHHCHRCOOORRRCHICOCH.IROCHHHRCHIHHIOIRRIRCRHHOCIHHO() != null
         && this.HHCOHHRHCORHHCHRCOOORRRCHICOCH.IROCHHHRCHIHHIOIRRIRCRHHOCIHHO() != this.HHCOHHRHCORHHCHRCOOORRRCHICOCH.value()) {
         var2.addProperty("original", this.HHCOHHRHCORHHCHRCOOORRRCHICOCH.IROCHHHRCHIHHIOIRRIRCRHHOCIHHO());
      }

      var1.add("value", var2);
      JsonArray var3 = new JsonArray();
      if (this.OCIROORRICOIHOCICCOCHHIIIIRIOI != null) {
         Integer[] var4 = this.OCIROORRICOIHOCICCOCHHIIIIRIOI;
         int var5 = var4.length;

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = var4[var6];
            JsonObject var8 = new JsonObject();
            var8.addProperty("id", var7);
            var3.add(var8);
         }
      }

      var1.add("cosmetics", var3);
      return var1;
   }

   public UUID id() {
      return this.CIORCOICHCCCIOHCRCHHCRROORIHRI;
   }

   public int IIROCCRRRCHICCRRRIIHOROOIHCCRH() {
      return this.HORORHORROCCIIIHCRRIICIICHOCOO;
   }

   public String name() {
      return this.CROICROHRHHRHHOHCRCRHORRHORRRI;
   }

   public Integer[] HOROORCICHORRIRHHRIIICIIIIORHC() {
      return this.OCIROORRICOIHOCICCOCHHIIIIRIOI;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH HOHOOCIICOHHOORORIRHOOIRIOROHR() {
      return this.HHCOHHRHCORHHCHRCOOORRRCHICOCH;
   }

   public String HIRHCICIOHCRCRHCICIIOOCIOOHCHR() {
      return this.HRRCCICHCCHOCHROOOOIHIIICHOHHH;
   }

   public int OROROHICRCOIIHHOOOOCRRRRCIOHIH() {
      return this.OOOOOIRRHOIROCHRCCIRIHHHIHCCCI;
   }
}
