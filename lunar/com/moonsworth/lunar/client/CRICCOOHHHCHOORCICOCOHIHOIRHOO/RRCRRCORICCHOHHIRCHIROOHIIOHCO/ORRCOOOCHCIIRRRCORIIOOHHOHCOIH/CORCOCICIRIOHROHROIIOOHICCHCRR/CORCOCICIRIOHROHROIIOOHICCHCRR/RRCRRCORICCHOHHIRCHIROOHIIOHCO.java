package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import org.joml.Vector3i;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements JsonDeserializer<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> {
   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH HICRRICCHCCROOHHCHOCOCCHOIHHOC(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      if (!(var1 instanceof JsonObject var4)) {
         throw new JsonParseException(var1.toString());
      } else {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            new EnumMap<>(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
            )
         );

         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 : com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()) {
            HashSet var10 = new HashSet();
            JsonElement var11 = var4.get(var9.getId());
            if (var11 == null) {
               throw new JsonParseException(var1.toString());
            }

            if (!(var11 instanceof JsonArray var12)) {
               throw new JsonParseException(var1.toString());
            }

            Iterator var13 = var12.iterator();

            while (true) {
               if (var13.hasNext()) {
                  JsonElement var14 = (JsonElement)var13.next();
                  if (!(var14 instanceof JsonObject var15)) {
                     throw new JsonParseException(var1.toString());
                  }

                  JsonElement var16 = var15.get("x");
                  JsonElement var17 = var15.get("y");
                  JsonElement var18 = var15.get("z");
                  if (var16 != null && var17 != null && var18 != null) {
                     if (var16.isJsonPrimitive() && var17.isJsonPrimitive() && var18.isJsonPrimitive()) {
                        Vector3i var19 = new Vector3i(var16.getAsInt(), var17.getAsInt(), var18.getAsInt());
                        var10.add(var19);
                        continue;
                     }

                     throw new JsonParseException(var1.toString());
                  }

                  throw new JsonParseException(var1.toString());
               }

               var5.RHOHCRHCRIORROHICICCIRHHHIHCCR().put(var9, var10);
               break;
            }
         }

         return var5;
      }
   }
}
