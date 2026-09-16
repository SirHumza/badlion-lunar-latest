package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import java.util.Map.Entry;

public class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof IIHRHCCOOHOOOOCHRRCOROOIOHCOOO) {
         try {
            for (Entry var5 : var3.get("waypoints").getAsJsonObject().entrySet()) {
               JsonObject var6 = ((JsonElement)var5.getValue()).getAsJsonObject();

               for (Entry var8 : var6.entrySet()) {
                  JsonObject var9 = ((JsonElement)var8.getValue()).getAsJsonObject();

                  for (Entry var11 : var9.entrySet()) {
                     JsonObject var12 = ((JsonElement)var11.getValue()).getAsJsonObject();
                     this.HOHCCHOIOHOHHOROHOIIHOOHORRHRO(var12);
                  }
               }
            }
         } catch (Exception var13) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Error while loading waypoints: " + var13
            );
            var13.printStackTrace();
         }
      }
   }

   private void HOHCCHOIOHOHHOROHOIIHOOHORRHRO(JsonObject var1) {
      JsonObject var2 = new JsonObject();
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("showBeam", var1, var2);
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("showText", var1, var2);
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("color", var1, var2);
      var1.add("renderConfig", var2);
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, JsonObject var2, JsonObject var3) {
      if (var2.has(var1)) {
         var3.add(var1, var2.remove(var1));
      }
   }
}
