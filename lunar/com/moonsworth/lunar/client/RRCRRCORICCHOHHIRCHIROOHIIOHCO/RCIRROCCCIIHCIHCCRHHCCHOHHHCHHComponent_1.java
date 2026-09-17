package com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.COIRRRCIORROCHIROCHROCHICCICIC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import lombok.Generated;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH,
   HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final String CIIIRRRCOIORIHIORIOIROHHICRHOH = "cosmetics/models/%s/%s/%s";
   protected String name;
   protected boolean RCCICCRCRHHRIHHRHIHCCCOIHHRCCH;
   protected boolean HROOIHORIROHIROHCCROIIRCRCCCCH;
   protected boolean RCOHORRHIIHHOHHOORIHCHRIHOICIO;
   private final Map<String, Boolean> IROCICCOOCCRCRHIIHHRHHHHIICCII = new HashMap<>();
   protected RCIROOOOICRHCCRRCIORHHIRCOIIIC RCOCRCCROHHHRIIORIOHHHHORIIORR;
   protected RCIROOOOICRHCCRRCIORHHIRCOIIIC RRIIHHICRHRIIICCIOHCROIIIRIROR;
   private RRCRRCORICCHOHHIRCHIROOHIIOHCO RIHHIICCOHIIIOCCRHRICCRRHIICIH;
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH CCCCHCHCCCHOCROROCHOIHCCORIROR = IRCIIHHICIHRCOCRROCOICRIHHCCHH.HEAD;
   private final List<COIRRRCIORROCHIROCHROCHICCICIC> OCCHCOROORROORRCRROHICICRRRCRO = new ArrayList<>();
   private float scale = 1.0F;

   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, RRCRRCORICCHOHHIRCHIROOHIIOHCO var3, boolean var4, COIRRRCIORROCHIROCHROCHICCICIC... var5
   ) {
      this.name = var1;
      this.RCCICCRCRHHRIHHRHIHCCCOIHHRCCH = var4;
      this.CCCCHCHCCCHOCROROCHOIHCCORIROR = var2;
      this.RIHHIICCOHIIIOCCRHRICCRRHIICIH = var3;
      this.RCOCRCCROHHHRIIORIOHHHHORIIORR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
         "lunar-jit", String.format("cosmetics/models/%s/%s/%s", var3.name().toLowerCase(Locale.ROOT), var1, var1 + ".webp")
      );
      this.RRIIHHICRHRIIICCIOHCROIIIRIROR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
         "lunar-jit", String.format("cosmetics/models/%s/%s/%s", var3.name().toLowerCase(Locale.ROOT), var1, var1 + ".obj")
      );
      this.OCCHCOROORROORRCRROHICICRRRCRO.addAll(Arrays.asList(var5));
   }

   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1) {
      this.load(var1);
      this.RCOCRCCROHHHRIIORIOHHHHORIIORR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
         "lunar-jit",
         String.format("cosmetics/models/%s/%s/%s", this.RIHHIICCOHIIIOCCRHRICCRRHIICIH.name().toLowerCase(Locale.ROOT), this.name, this.name + ".webp")
      );
      this.RRIIHHICRHRIIICCIOHCROIIIRIROR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
         "lunar-jit",
         String.format("cosmetics/models/%s/%s/%s", this.RIHHIICCOHIIIOCCRHRICCRRHIICIH.name().toLowerCase(Locale.ROOT), this.name, this.name + ".obj")
      );
   }

   public <T extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> T CRRRICCRROCOHHOHIICIHORCOORRRH(String... var1) {
      for (String var5 : var1) {
         this.IROCICCOOCCRCRHIIHHRHHHHIICCII.put(var5, true);
      }

      return (T)this;
   }

   public <T extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> T HIHOCCORHRIRIHHRRHIHIORIOOCIIO(String var1) {
      this.IROCICCOOCCRCRHIIHHRHHHHIICCII.put(var1, false);
      return (T)this;
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      boolean var4 = var2.RCIIIRRHHHHRHRIRHHROIRICHIHROC()
            == com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HAT
         && var3.RCIIIRRHHHHRHRIRHHROIRICHIHROC()
            == com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HAT;
      boolean var5 = var4 || var2.RCIIIRRHHHHRHRIRHHROIRICHIHROC() != var3.RCIIIRRHHHHRHRIRHHROIRICHIHROC();
      if (var5) {
         return this.IROCICCOOCCRCRHIIHHRHHHHIICCII.containsKey(var1.getName())
            ? this.IROCICCOOCCRCRHIIHHRHHHHIICCII.get(var1.getName())
            : this.IROCICCOOCCRCRHIIHHRHHHHIICCII.containsKey("any");
      } else {
         return false;
      }
   }

   @Override
   public boolean RICHIIORICCHROCCRIORORHOOIRIRH() {
      return this.HROOIHORIROHIROHCCROIIRCRCCCCH;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public boolean isDynamic() {
      return this.RCOHORRHIIHHOHHOORIHCHRIHOICIO;
   }

   @Override
   public boolean ICCRCOIRIROHCRHCCCCHCOIIRHHHOC() {
      return this.RCCICCRCRHHRIHHRHIHCCCOIHHRCCH;
   }

   @Override
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RHHIRHCIOIORIIRCROOIOIRCIOHIII() {
      return this.CCCCHCHCCCHOCROROCHOIHCCORIROR;
   }

   @Override
   public Collection<COIRRRCIORROCHIROCHROCHICCICIC> HICCHRROIRIHOHRIHCHHROIHRHIRII() {
      return this.OCCHCOROORROORRCRROHICICRRRCRO;
   }

   @Override
   public void tick() {
   }

   @Override
   public void load(JsonObject var1) {
      this.RCCICCRCRHHRIHHRHIHCCCOIHHRCCH = var1.get("animated").getAsBoolean();
      this.name = var1.get("name").getAsString();
      this.CCCCHCHCCCHOCROROCHOIHCCORIROR = IRCIIHHICIHRCOCRROCOICRIHHCCHH.valueOf(var1.get("bodyPart").getAsString());
      this.RIHHIICCOHIIIOCCRHRICCRRHIICIH = RRCRRCORICCHOHHIRCHIROOHIIOHCO.valueOf(var1.get("cosmeticType").getAsString());
      this.RCOHORRHIIHHOHHOORIHCHRIHOICIO = var1.has("dynamic") && var1.get("dynamic").getAsBoolean();
      this.HROOIHORIROHIROHCCROIIRCRCCCCH = var1.has("showWithArmor") && var1.get("showWithArmor").getAsBoolean();

      for (JsonElement var4 : var1.get("transformations").getAsJsonArray()) {
         if (!var4.isJsonNull()) {
            this.OCCHCOROORROORRCRROHICICRRRCRO.addAll(CORCOCICIRIOHROHROIIOOHICCHCRR.IIOCHOIICCIORCOROIROHICCHIOHIC(var4.getAsJsonObject()));
         }
      }

      if (var1.has("exclude")) {
         for (JsonElement var7 : var1.getAsJsonArray("exclude")) {
            if (var7.isJsonPrimitive()) {
               this.IROCICCOOCCRCRHIIHHRHHHHIICCII.put(var7.getAsString(), false);
            }
         }
      }

      if (var1.has("compatible")) {
         for (JsonElement var8 : var1.getAsJsonArray("compatible")) {
            if (var8.isJsonPrimitive()) {
               this.IROCICCOOCCRCRHIIHHRHHHHIICCII.put(var8.getAsString(), true);
            }
         }
      }
   }

   @Override
   public JsonObject save() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("animated", this.RCCICCRCRHHRIHHRHIHCCCOIHHRCCH);
      var1.addProperty("dynamic", this.RCOHORRHIIHHOHHOORIHCHRIHOICIO);
      var1.addProperty("name", this.name);
      var1.addProperty("bodyPart", this.CCCCHCHCCCHOCROROCHOIHCCORIROR.name());
      var1.addProperty("indexType", this.RIHHIICCOHIIIOCCRHRICCRRHIICIH.name());
      var1.addProperty("showWithArmor", this.RICHIIORICCHROCCRIORORHOOIRIRH());
      JsonArray var2 = new JsonArray();

      for (COIRRRCIORROCHIROCHROCHICCICIC var4 : this.OCCHCOROORROORRCRROHICICRRRCRO) {
         var2.add(var4.save());
      }

      var1.add("transformations", var2);
      JsonArray var7 = new JsonArray();
      JsonArray var8 = new JsonArray();

      for (Entry var6 : this.IROCICCOOCCRCRHIIHHRHHHHIICCII.entrySet()) {
         (var6.getValue() ? var7 : var8).add(new JsonPrimitive((String)var6.getKey()));
      }

      if (!var7.isEmpty()) {
         var1.add("compatible", var7);
      }

      if (!var8.isEmpty()) {
         var1.add("exclude", var8);
      }

      return var1;
   }

   @Generated
   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC IIHHORHOROOCIHHCORRRCIRHOIICCH() {
      return this.RCOCRCCROHHHRIIORIOHHHHORIIORR;
   }

   @Generated
   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC RCOOOOHOOROIHRCHRICOIIOHOHOIHR() {
      return this.RRIIHHICRHRIIICCIOHCROIIIRIROR;
   }

   @Generated
   public float getScale() {
      return this.scale;
   }

   @Generated
   public void setScale(float var1) {
      this.scale = var1;
   }
}
