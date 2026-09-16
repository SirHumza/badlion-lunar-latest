package com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements JsonSerializer<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH> {
   public JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      Type var2,
      JsonSerializationContext var3
   ) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("title", var1.bridge$getTitle());
      Throwable var5 = var1.bridge$getCause();
      var4.addProperty("message", var5.getClass().getName() + ": " + var5.getMessage());
      JsonArray var6 = new JsonArray();

      for (StackTraceElement var10 : var5.getStackTrace()) {
         var6.add(new JsonPrimitive(var10.toString()));
      }

      var4.add("stacktrace", var6);
      return var4;
   }
}
