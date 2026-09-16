package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map.Entry;
import org.joml.Vector3i;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements JsonDeserializer<IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH CRICCOOHHHCHOORCICOCOHIHOIRHOO(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      EnumMap var4 = new EnumMap<>(CRRRICCRROCOHHOHIICIHORCOORRRH.class);

      for (Entry var6 : var1.getAsJsonObject().entrySet()) {
         CRRRICCRROCOHHOHIICIHORCOORRRH var7;
         try {
            var7 = CRRRICCRROCOHHOHIICIHORCOORRRH.valueOf((String)var6.getKey());
         } catch (IllegalArgumentException var12) {
            continue;
         }

         HashSet var8 = new HashSet();

         for (JsonElement var10 : ((JsonElement)var6.getValue()).getAsJsonArray()) {
            JsonObject var11 = var10.getAsJsonObject();
            var8.add(new Vector3i(var11.get("x").getAsInt(), var11.get("y").getAsInt(), var11.get("z").getAsInt()));
         }

         var4.put(var7, var8);
      }

      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4);
   }
}
