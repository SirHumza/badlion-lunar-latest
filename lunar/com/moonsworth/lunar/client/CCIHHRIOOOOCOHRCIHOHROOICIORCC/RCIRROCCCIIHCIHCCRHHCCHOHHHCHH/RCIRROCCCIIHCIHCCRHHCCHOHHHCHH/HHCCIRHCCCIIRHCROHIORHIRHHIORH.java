package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private Boolean CHHCORHROHCHIRORRHHICCIRCRIICI = null;

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (this.CHHCORHROHCHIRORRHHICCIRCRIICI != null
         && var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHIRRIIORRHORHRORIHOROIRCORCOO) {
         this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var3, "CROSSHAIR"), "options")
            .add("showInF5", new JsonPrimitive(this.CHHCORHROHCHIRORRHHICCIRCRIICI));
      }

      if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         && var3.has("showInF5")) {
         this.CHHCORHROHCHIRORRHHICCIRCRIICI = var3.remove("showInF5").getAsBoolean();
      }

      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
         && var4.getId().startsWith("CROSSHAIR_")) {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var3, "options")
            .ifPresent(var0 -> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var0, "dotSize").ifPresent(var1x -> {
               var0.remove("dotSize");
               var0.addProperty("dotSize", Math.max(0, var1x - 2));
            }));
      }
   }

   private JsonObject RHOCHHIRRCHHHOHOIRROIROHHHIHIO(JsonObject var1, String var2) {
      return OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, var2).orElseGet(() -> {
         JsonObject var2x = new JsonObject();
         var1.add(var2, var2x);
         return var2x;
      });
   }
}
