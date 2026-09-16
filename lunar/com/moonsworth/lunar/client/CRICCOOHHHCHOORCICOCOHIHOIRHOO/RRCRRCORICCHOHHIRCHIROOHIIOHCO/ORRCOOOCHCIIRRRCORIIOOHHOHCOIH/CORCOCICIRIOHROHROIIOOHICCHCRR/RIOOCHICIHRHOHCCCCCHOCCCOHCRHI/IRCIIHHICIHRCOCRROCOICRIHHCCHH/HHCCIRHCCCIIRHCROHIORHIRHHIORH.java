package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import org.joml.Vector3i;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements JsonDeserializer<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIRHCHHOICHRICOOCRORCCIOOIHOIR(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      HashMap var5 = new HashMap();
      JsonObject var6 = var4.getAsJsonObject("pearl");

      for (Entry var8 : var6.entrySet()) {
         String var9 = (String)var8.getKey();
         JsonObject var10 = ((JsonElement)var8.getValue()).getAsJsonObject();
         Vector3i var11 = this.RRORIOHCCOCRHICHRIHHCIHOOHICHO(var10.get("pos").getAsString());
         ArrayList var12 = new ArrayList();

         for (JsonElement var14 : var10.getAsJsonArray("waypoints")) {
            Vector3i var15 = this.RRORIOHCCOCRHICHRIHHCIHOOHICHO(var14.getAsString());
            var12.add(var15);
         }

         ArrayList var21 = new ArrayList();

         for (JsonElement var24 : var10.getAsJsonArray("second")) {
            Vector3i var16 = this.RRORIOHCCOCRHICHRIHHCIHOOHICHO(var24.getAsString());
            var21.add(var16);
         }

         IRCIIHHICIHRCOCRROCOICRIHHCCHH var23 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11, var12, var21);
         var5.put(var9, var23);
      }

      ArrayList var17 = new ArrayList();

      for (JsonElement var20 : var4.getAsJsonArray("stun")) {
         var17.add(this.RRORIOHCCOCRHICHRIHHCIHOOHICHO(var20.getAsString()));
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var17);
   }

   private Vector3i RRORIOHCCOCRHICHRIHHCIHOOHICHO(String var1) {
      String[] var2 = var1.split(",");
      int var3 = Integer.parseInt(var2[0]);
      int var4 = Integer.parseInt(var2[1]);
      int var5 = Integer.parseInt(var2[2]);
      return new Vector3i(var3, var4, var5);
   }
}
