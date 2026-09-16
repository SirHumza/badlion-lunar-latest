package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.lang.reflect.Type;
import java.util.Map.Entry;

public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements JsonDeserializer<RRCRRCORICCHOHHIRCHIROOHIIOHCO>, JsonSerializer<RRCRRCORICCHOHHIRCHIROOHIIOHCO> {
   public BiMap<String, Class<? extends com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> IHOHRRCCHRHHOCHCOICOOIOOCRCRIH = HashBiMap.create();

   public static boolean HHRIICOIOORCHCOIICOOIHIRHHICRI(JsonElement var0) {
      if (var0.isJsonArray()) {
         return var0.getAsJsonArray().size() == 0;
      }

      if (var0.isJsonObject()) {
         return var0.getAsJsonObject().entrySet().size() == 0;
      }

      if (var0.isJsonPrimitive()) {
         JsonPrimitive var1 = var0.getAsJsonPrimitive();
         if (var1.isString()) {
            return var1.getAsString().isEmpty();
         }

         if (var1.isNumber()) {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.equals(var1.getAsDouble(), 0.0);
         }
      }

      return var0.isJsonNull();
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_local_space",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_initialization",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_rate_instant",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_rate_steady",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_lifetime_looping",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_lifetime_once",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_lifetime_expression",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_shape_disc",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_shape_box",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_shape_entity_aabb",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_shape_point",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:emitter_shape_sphere",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:particle_lifetime_expression",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:particle_kill_plane",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:particle_appearance_lighting",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:particle_initial_speed",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:particle_initial_spin",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:particle_motion_collision",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:particle_motion_dynamic",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class
         );
      this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
         .put(
            "minecraft:particle_motion_parametric",
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class
         );
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO ORHIOICIOCRRHOOCOHRORIHICHRCRR(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO();
      if (!var1.isJsonObject()) {
         throw new JsonParseException("The root element of Bedrock particle should be an object!");
      }

      JsonObject var5 = var1.getAsJsonObject();

      try {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, "particle_effect", "No particle_effect was found..."));
      } catch (com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7) {
         throw new JsonParseException("Couldn't parse some MoLang expression!", var7);
      }

      var4.setup();
      return var4;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, JsonObject var2) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, "description", "No particle_effect.description was found..."));
      if (var2.has("curves")) {
         JsonElement var3 = var2.get("curves");
         if (var3.isJsonObject()) {
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var3.getAsJsonObject());
         }
      }

      this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, "components", "No particle_effect.components was found..."));
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, JsonObject var2) {
      if (var2.has("identifier")) {
         var1.identifier = var2.get("identifier").getAsString();
      }

      JsonObject var3 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, "basic_render_parameters", "No particle_effect.basic_render_parameters was found...");
      if (var3.has("material")) {
         var1.ROCOIOORRCCICOIHOROIIHHCCIIIRO = CRRRICCRROCOHHOHIICIHORCOORRRH.fromString(var3.get("material").getAsString());
      }

      if (var3.has("bone")) {
         var1.bone = var3.get("bone").getAsString();
      }

      if (var3.has("texture")) {
         String var4 = var3.get("texture").getAsString();
         if (!var4.equals("textures/particle/particles")) {
            if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH()) {
               var4 = var4.replace("minecraft:textures/blocks/", "minecraft:textures/block/");
               var4 = var4.replace("minecraft:textures/items/", "minecraft:textures/item/");
               if (var3.has("modern_texture")) {
                  var4 = var3.get("modern_texture").getAsString();
               }
            } else {
               var4 = var4.replace("minecraft:textures/block/", "minecraft:textures/blocks/");
               var4 = var4.replace("minecraft:textures/item/", "minecraft:textures/items/");
            }

            var1.texture = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var4);
         }
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, JsonObject var2) {
      for (Entry var4 : var2.entrySet()) {
         JsonElement var5 = (JsonElement)var4.getValue();
         if (var5.isJsonObject()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
            var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.getAsJsonObject(), var1.RCIIHCRHCCRORIIOHCCICRRIICIHCI);
            var1.IROHHIRIRHIICICCHHRIHHOICRHHIR.put((String)var4.getKey(), var6);
         }
      }
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, JsonObject var2) {
      for (Entry var4 : var2.entrySet()) {
         String var5 = (String)var4.getKey();
         if (this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH.containsKey(var5)) {
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = null;

            try {
               var6 = (com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)((Class)this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH
                     .get(var5))
                  .getConstructor()
                  .newInstance();
            } catch (Exception var8) {
            }

            if (var6 != null) {
               var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((JsonElement)var4.getValue(), var1.RCIIHCRHCCRORIIOHCCICRRIICIHCI);
               var1.HRCCOHCRHCHHOOHRICOHHIROROOROI.add(var6);
            } else {
               System.out.println("Failed to parse given component " + var5 + " in " + var1.identifier + "!");
            }
         }
      }
   }

   private JsonObject HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1, String var2, String var3) {
      if (!var1.has(var2) && !var1.get(var2).isJsonObject()) {
         throw new JsonParseException(var3);
      } else {
         return var1.get(var2).getAsJsonObject();
      }
   }

   public JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      JsonObject var5 = new JsonObject();
      var4.addProperty("format_version", "1.10.0");
      var4.add("particle_effect", var5);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var1);
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, var1);
      return var4;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO var2) {
      JsonObject var3 = new JsonObject();
      JsonObject var4 = new JsonObject();
      var1.add("description", var3);
      var3.addProperty("identifier", var2.identifier);
      var3.add("basic_render_parameters", var4);
      var4.addProperty("material", var2.ROCOIOORRCCICOIHOROIIHHCCIIIRO.id);
      var4.addProperty("texture", "textures/particle/particles");
      if (var2.texture != null && !var2.texture.equals(RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHRHOCRCOCRCHIIOICCHRHCHOOIHI)) {
         var4.addProperty("texture", var2.texture.toString());
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO var2) {
      JsonObject var3 = new JsonObject();
      var1.add("curves", var3);

      for (Entry var5 : var2.IROHHIRIRHIICICCHHRIHHOICRHHIR.entrySet()) {
         var3.add((String)var5.getKey(), ((RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5.getValue()).RCHIIHHHCCIOHHRORHOORICCCRHOOI());
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO var2) {
      JsonObject var3 = new JsonObject();
      var1.add("components", var3);

      for (com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var2.HRCCOHCRHCHHOOHRICOHHIROROOROI) {
         JsonElement var6 = var5.RCHIIHHHCCIOHHRORHOORICCCRHOOI();
         if (!HHRIICOIOORCHCOIICOOIHIRHHICRI(var6) || var5.OHICORCORHICCCCROROCOIRHROOROR()) {
            var3.add((String)this.IHOHRRCCHRHHOCHCOICOOIOOCRCRIH.inverse().get(var5.getClass()), var6);
         }
      }
   }
}
