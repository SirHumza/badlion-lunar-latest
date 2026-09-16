package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map.Entry;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         JsonObject var4 = new JsonObject();
         JsonObject var5 = new JsonObject();
         boolean var6 = false;
         if (var3.has("SKYBLOCK_HIGHLIGHT_SPIRIT_BOW")) {
            JsonObject var7 = var3.getAsJsonObject("SKYBLOCK_HIGHLIGHT_SPIRIT_BOW");
            boolean var8 = var7.has("enabled") && var7.get("enabled").getAsBoolean();
            var6 |= var8;
            var5.addProperty("highlightSpiritBow", var8);
            if (var7.has("options")) {
               JsonObject var9 = var7.getAsJsonObject("options");
               var9.entrySet().forEach(var1x -> var5.add(var1x.getKey(), var1x.getValue()));
            }

            var3.remove("SKYBLOCK_HIGHLIGHT_SPIRIT_BOW");
         }

         if (var3.has("SKYBLOCK_SPIRIT_BEAR_TIMER_HUD")) {
            JsonObject var13 = var3.getAsJsonObject("SKYBLOCK_SPIRIT_BEAR_TIMER_HUD");
            boolean var14 = var13.has("enabled") && var13.get("enabled").getAsBoolean();
            var6 |= var14;
            var5.addProperty("spiritBearTimerHud", var14);
            if (var13.has("options")) {
               JsonObject var15 = var13.getAsJsonObject("options");

               for (Entry var11 : var15.entrySet()) {
                  String var12 = (String)var11.getKey();
                  var12 = var12.equals("spiritBearColor") ? "spiritBearTimerColor" : var12;
                  var5.add(var12, (JsonElement)var11.getValue());
               }
            }

            var3.remove("SKYBLOCK_SPIRIT_BEAR_TIMER_HUD");
         }

         var4.addProperty("enabled", var6);
         var4.add("options", var5);
         var3.add("SKYBLOCK_FLOOR_FOUR", var4);
      }
   }
}
