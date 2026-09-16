package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.CIIHHCHIRCRRIHOIOCCCROHOIOCCII;

public class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
         && !var4.OCOOCOCOIICRIRHIOHRIIRHIIOIHRI()) {
         JsonObject var5 = new JsonObject();
         if (var3.has("options")) {
            JsonObject var6 = var3.getAsJsonObject("options").deepCopy();
            if (!var6.has("stopwatchKeybind")) {
               var6.addProperty(
                  "stopwatchKeybind",
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_U.name()
               );
               var6.addProperty("stopwatchKeybindShift", false);
               var6.addProperty("stopwatchKeybindControl", false);
               var6.addProperty("stopwatchKeybindAlt", false);
            }

            if (!var6.has("timeDisplayOption")) {
               var6.addProperty("timeDisplayOption", CIIHHCHIRCRRIHOIOCCCROHOIOCCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.STOPWATCH.id());
            }

            var6.addProperty("stopwatchName", "Stopwatch");
            var5.add("options", var6);
         }

         String[] var11 = new String[]{"x", "y", "position"};

         for (String var10 : var11) {
            if (var3.has(var10) && !var3.get(var10).isJsonNull()) {
               var5.add(var10, var3.get(var10));
            }
         }

         JsonArray var12;
         if (!var3.has("stopwatches")) {
            var12 = new JsonArray();
            var3.add("stopwatches", var12);
         } else {
            var12 = var3.getAsJsonArray("stopwatches");
         }

         String var13 = "MIGRATED_STOPWATCH";
         var12.add(var13);
         var3.add("stopwatches", var12);
         var3.add(var13, var5);
         var4.ROIIRHIRRRCRROCIIOICIIRICHCCHO(true);
      }
   }
}
