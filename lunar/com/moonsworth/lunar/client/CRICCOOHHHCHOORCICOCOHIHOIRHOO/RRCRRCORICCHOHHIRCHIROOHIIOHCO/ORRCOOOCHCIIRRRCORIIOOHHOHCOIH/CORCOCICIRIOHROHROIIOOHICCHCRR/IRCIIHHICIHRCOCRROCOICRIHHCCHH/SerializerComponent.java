package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.joml.Vector3i;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements JsonDeserializer<IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH CORCOCICIRIOHROHROIIOOHICCHCRR(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      HashMap var5 = new HashMap();

      for (String var7 : var4.keySet()) {
         JsonObject var8 = var4.getAsJsonObject(var7);
         HashMap var9 = new HashMap();

         for (String var11 : var8.keySet()) {
            JsonObject var12 = var8.getAsJsonObject(var11);
            var9.put(
               var11,
               new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.RRORIOHCCOCRHICHRIHHCIHOOHICHO(var12.get("pos").getAsString()), var12.get("message").getAsString()
               )
            );
         }

         var5.put(var7, var9);
      }

      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5);
   }

   private Vector3i RRORIOHCCOCRHICHRIHHCIHOOHICHO(String var1) {
      String[] var2 = var1.split(",");
      int var3 = Integer.parseInt(var2[0]);
      int var4 = Integer.parseInt(var2[1]);
      int var5 = Integer.parseInt(var2[2]);
      return new Vector3i(var3, var4, var5);
   }
}
