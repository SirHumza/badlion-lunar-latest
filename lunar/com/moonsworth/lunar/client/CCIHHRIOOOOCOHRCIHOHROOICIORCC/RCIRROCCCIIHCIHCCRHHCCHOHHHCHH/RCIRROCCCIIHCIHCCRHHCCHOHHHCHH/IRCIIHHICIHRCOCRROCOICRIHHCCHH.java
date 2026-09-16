package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         && var3.has("options")) {
         var3 = var3.getAsJsonObject("options");
         String var4 = "blockOverlayColor";
         if (var3.has(var4) && !var3.get(var4).isJsonNull()) {
            JsonObject var5 = var3.get(var4).getAsJsonObject();
            if (var5.has("value")) {
               int var6 = var5.get("value").getAsInt();
               var6 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var6, 0.25F);
               var5.addProperty("value", var6);
            }
         }
      }
   }
}
