package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;

public class IHIRRIIORRHORHRORIHOROIRCORCOO
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         && var3.has("options")) {
         var3 = var3.getAsJsonObject("options");
         String var4 = "timeChangerTime";
         if (var3.has(var4) && !var3.get(var4).isJsonNull()) {
            int var5 = var3.get(var4).getAsInt();
            var3.addProperty(var4, var5 + 24000);
         }
      }
   }
}
