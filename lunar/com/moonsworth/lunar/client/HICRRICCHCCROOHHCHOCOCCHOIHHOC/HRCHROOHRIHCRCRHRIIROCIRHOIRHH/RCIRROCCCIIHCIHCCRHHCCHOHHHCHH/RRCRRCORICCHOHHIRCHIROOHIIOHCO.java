package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.regex.Pattern;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Override
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1) {
      for (JsonElement var3 : var1.getAsJsonArray()) {
         if (var3.isJsonObject()) {
            JsonObject var4 = var3.getAsJsonObject();
            String var5 = var4.get("identifier").getAsString();
            Pattern var6 = Pattern.compile(var4.get("regex").getAsString());
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var6);
         }
      }
   }
}
