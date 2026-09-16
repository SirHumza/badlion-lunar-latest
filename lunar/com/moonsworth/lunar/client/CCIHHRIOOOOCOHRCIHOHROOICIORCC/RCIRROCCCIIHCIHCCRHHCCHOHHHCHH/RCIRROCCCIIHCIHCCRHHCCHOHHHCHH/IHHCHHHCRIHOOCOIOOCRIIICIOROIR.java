package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 : com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.values()) {
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var7.getName(), var7.getShowCosmetic().getId(), var3);
         }
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, String var2, JsonObject var3) {
      if (!var1.equals(var2) && CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var3)) {
         var3.add(var2, var3.get(var1));
         var3.remove(var1);
      }
   }

   private static boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(String var0, JsonObject var1) {
      return var1.has(var0) && !var1.get(var0).isJsonNull();
   }
}
