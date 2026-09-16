package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;

public class ICICIOCHHHIHOCHCOHORIHRCOHHOCR
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         && var3.has("actions")) {
         for (JsonElement var6 : var3.getAsJsonArray("actions")) {
            if (var6.isJsonObject()) {
               JsonObject var7 = var6.getAsJsonObject();
               if (var7.has("action")) {
                  String var8 = var7.remove("action").getAsString();
                  if (Objects.equals(var8, "hide_msg")) {
                     var7.addProperty("hideMessage", true);
                  } else if (Objects.equals(var8, "show_title")) {
                     var7.addProperty("showTitleAction", true);
                  } else if (Objects.equals(var8, "hide_and_show_title")) {
                     var7.addProperty("hideMessage", true);
                     var7.addProperty("showTitleAction", true);
                  }
               }
            }
         }
      }
   }
}
