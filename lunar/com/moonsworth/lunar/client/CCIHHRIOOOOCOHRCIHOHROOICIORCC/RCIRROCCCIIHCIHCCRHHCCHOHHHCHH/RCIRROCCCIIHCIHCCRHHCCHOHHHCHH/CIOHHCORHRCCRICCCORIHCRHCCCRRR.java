package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;

public class CIOHHCORHRCCRICCCORIHCRHCCCRRR
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH
         )
       {
         if (var3.has("options")) {
            var3 = var3.getAsJsonObject("options");
            String var5 = "labelColor";
            if (var3.has(var5) && !var3.get(var5).isJsonNull() && !var3.has("bracketColor")) {
               var3.add("bracketColor", var3.getAsJsonObject(var5));
            }
         }
      } else if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
         && var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO
         ) instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO
         && var3.has("options")) {
         var3 = var3.getAsJsonObject("options");
         String var8 = "textColor";
         if (var3.has(var8) && !var3.get(var8).isJsonNull() && !var3.has("bracketColor")) {
            var3.add("bracketColor", var3.getAsJsonObject(var8));
         }
      }
   }
}
