package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import java.lang.reflect.Type;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI implements JsonDeserializer<RORCHCIIICOHIRROOORHOCCCCIOCCI> {
   public RORCHCIIICOHIRROOORHOCCCCIOCCI IOIICIRIICICIIOORHCIIIIRRIHRHI(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      if (!var1.isJsonPrimitive()) {
         throw new JsonParseException("Expected a string");
      }

      JsonPrimitive var4 = var1.getAsJsonPrimitive();
      if (!var4.isString()) {
         throw new JsonParseException("Expected a string");
      }

      String[] var5 = var4.getAsString().split(",");
      if (var5.length != 3) {
         throw new JsonParseException("Expected 3 comma separated integers");
      }

      int var6 = Integer.parseInt(var5[0]);
      int var7 = Integer.parseInt(var5[1]);
      int var8 = Integer.parseInt(var5[2]);
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var7, var8);
   }
}
