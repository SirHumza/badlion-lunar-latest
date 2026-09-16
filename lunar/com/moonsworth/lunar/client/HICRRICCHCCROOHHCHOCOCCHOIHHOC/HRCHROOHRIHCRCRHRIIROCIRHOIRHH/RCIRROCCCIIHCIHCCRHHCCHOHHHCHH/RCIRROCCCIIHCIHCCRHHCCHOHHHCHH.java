package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Override
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1) {
      if (var1.getAsJsonObject().has("active")) {
         JsonElement var2 = var1.getAsJsonObject().get("active");
         if (var2.isJsonArray()) {
            for (JsonElement var4 : var2.getAsJsonArray()) {
               this.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(var4.getAsJsonObject());
            }
         } else {
            this.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(var2.getAsJsonObject());
         }
      }

      HashMap var11 = new HashMap();
      if (var1.getAsJsonObject().has("colors")) {
         JsonObject var12 = var1.getAsJsonObject().get("colors").getAsJsonObject();

         for (String var5 : var12.keySet()) {
            JsonObject var6 = var12.get(var5).getAsJsonObject();
            String var7 = var6.get("default").getAsString();
            String var8 = var6.get("hover").getAsString();
            int var9 = (int)Long.parseLong(var7.substring(1), 16);
            int var10 = (int)Long.parseLong(var8.substring(1), 16);
            var11.put(
               var5,
               new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var9, var10
               )
            );
         }
      }

      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .OIHHCIOCHOCOIHCICOOIOICCRICORH()
         .RIROICHCRROROHCCROOCCCCOCHCCRI(var11);
   }

   private void HOIHOROOIOOCOIHCRIRIRIRRICIIHC(JsonObject var1) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.get("id").getAsInt(),
         var1.get("name").getAsString(),
         var1.get("text").getAsString(),
         var1.get("color").getAsString(),
         var1.get("icon").getAsString(),
         var1.get("link").getAsString(),
         var1.get("dismissable").getAsBoolean()
      );
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .OIHHCIOCHOCOIHCICOOIOICCRICORH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
   }
}
