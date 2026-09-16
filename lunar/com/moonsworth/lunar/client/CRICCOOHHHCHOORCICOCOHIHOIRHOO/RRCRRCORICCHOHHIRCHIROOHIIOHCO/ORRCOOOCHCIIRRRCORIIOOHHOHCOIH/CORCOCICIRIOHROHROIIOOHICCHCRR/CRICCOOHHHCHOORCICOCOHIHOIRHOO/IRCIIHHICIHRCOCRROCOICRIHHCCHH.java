package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map.Entry;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements JsonDeserializer<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIROICHCRROROHCCROOCCCCOCHCCRI(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      HashMap var5 = new HashMap();

      for (Entry var7 : var4.getAsJsonObject("categories").entrySet()) {
         var5.put((String)var7.getKey(), ((JsonElement)var7.getValue()).getAsString());
      }

      HashMap var9 = new HashMap();

      for (Entry var8 : var4.getAsJsonObject("xp").entrySet()) {
         var9.put((String)var8.getKey(), ((JsonElement)var8.getValue()).getAsDouble());
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var9);
   }
}
