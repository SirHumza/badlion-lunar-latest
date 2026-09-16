package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Override
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1) {
      JsonObject var2 = var1.getAsJsonObject();

      for (String var4 : var2.keySet()) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .CROHIOCIRCHHOROIOOROHIRHRHRORR()
            .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .put(var4, var2.get(var4).getAsString());
      }
   }
}
