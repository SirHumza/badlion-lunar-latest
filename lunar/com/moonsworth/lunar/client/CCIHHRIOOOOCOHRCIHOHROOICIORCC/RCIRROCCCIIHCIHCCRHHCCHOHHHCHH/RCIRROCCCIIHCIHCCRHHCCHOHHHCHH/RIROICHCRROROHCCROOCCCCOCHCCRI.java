package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;

public class RIROICHCRROROHCCROOCCCCOCHCCRI
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH
         )
       {
         JsonObject var4;
         if (this.IIHRRHORCRCROCHHOHORCHCROCIHRO("options", var3)) {
            var4 = var3.getAsJsonObject("options");
            JsonObject var5;
            JsonObject var6;
            if (this.IIHRRHORCRCROCHHOHORCHCROCIHRO("PING_NAMETAG", var3)) {
               var5 = var3.getAsJsonObject("PING_NAMETAG");
               var6 = this.IIHRRHORCRCROCHHOHORCHCROCIHRO("options", var5) ? var5.getAsJsonObject("options") : new JsonObject();
            } else {
               var5 = new JsonObject();
               var6 = new JsonObject();
               var5.add("options", var6);
               var3.add("PING_NAMETAG", var5);
            }

            if (this.IIHRRHORCRCROCHHOHORCHCROCIHRO("enablePingNametag", var4)) {
               boolean var7 = var4.remove("enablePingNametag").getAsBoolean();
               if (var7) {
                  var5.remove("enabled");
                  var5.addProperty("enabled", true);
               }
            }

            if (this.IIHRRHORCRCROCHHOHORCHCROCIHRO("pingAbove", var4)) {
               boolean var10 = var4.remove("pingAbove").getAsBoolean();
               var6.addProperty("pingAbove", var10);
            }
         } else {
            var4 = new JsonObject();
            var3.add("options", var4);
         }

         if (this.IIHRRHORCRCROCHHOHORCHCROCIHRO("PING_HUD", var3)) {
            JsonObject var8 = var3.getAsJsonObject("PING_HUD");
            if (this.IIHRRHORCRCROCHHOHORCHCROCIHRO("options", var8)) {
               JsonObject var9 = var8.getAsJsonObject("options");
               if (this.IIHRRHORCRCROCHHOHORCHCROCIHRO("pingShowMs", var9)) {
                  boolean var11 = var9.remove("pingShowMs").getAsBoolean();
                  var4.addProperty("pingShowMs", var11);
               }
            }
         }
      }
   }

   private boolean IIHRRHORCRCROCHHOHORCHCROCIHRO(String var1, JsonObject var2) {
      return var2.has(var1) && !var2.get(var1).isJsonNull();
   }
}
