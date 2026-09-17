package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map.Entry;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements JsonDeserializer<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      if (!var1.isJsonObject()) {
         return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new String[0], new HashMap<>());
      }

      JsonObject var4 = var1.getAsJsonObject();
      String[] var5 = new String[0];
      HashMap var6 = new HashMap();

      for (Entry var8 : var4.entrySet()) {
         if (((JsonElement)var8.getValue()).isJsonArray() && ((String)var8.getKey()).equals("__values__")) {
            var5 = var3.deserialize((JsonElement)var8.getValue(), String[].class);
         } else if (((JsonElement)var8.getValue()).isJsonObject()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = var3.deserialize((JsonElement)var8.getValue(), RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class);

            for (String var13 : ((String)var8.getKey()).split("\\|")) {
               var6.put(var13, var9);
            }
         }
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var6);
   }
}
