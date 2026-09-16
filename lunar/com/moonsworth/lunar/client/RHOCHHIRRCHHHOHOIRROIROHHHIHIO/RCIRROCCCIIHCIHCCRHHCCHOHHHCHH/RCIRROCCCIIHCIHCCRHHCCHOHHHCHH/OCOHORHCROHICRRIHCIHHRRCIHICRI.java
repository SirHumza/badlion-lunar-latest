package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.moonsworth.lunar.client.util.COIRRRCIORROCHIROCHROCHICCICIC;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import java.util.ArrayList;
import java.util.List;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI extends CIOHHCORHRCCRICCCORIHCRHCCCRRR<List<COIRRRCIORROCHIROCHROCHICCICIC>> {
   public List<COIRRRCIORROCHIROCHROCHICCICIC> CORCOCICIRIOHROHROIIOOHICCHCRR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3 = var1.HHIHOIRIOCOCIOROHCCCRRIOOOIRIC().toString();
      ArrayList var4 = new ArrayList();
      JsonArray var5 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var3, JsonArray.class);
      if (var5 == null) {
         return new ArrayList<>();
      }

      for (JsonElement var7 : var5) {
         if (!var7.isJsonNull()) {
            var4.addAll(
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.IIOCHOIICCIORCOROIROHICCHIOHIC(
                  var7.getAsJsonObject()
               )
            );
         }
      }

      return var4;
   }
}
