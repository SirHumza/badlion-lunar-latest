package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import it.unimi.dsi.fastutil.Pair;
import java.util.List;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHIRRIIORRHORHRORIHOROIRCORCOO) {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var3, "UHC_OVERLAY")
            .flatMap(var0 -> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var0, "options"))
            .ifPresent(
               var0 -> {
                  JsonArray var1x = new JsonArray();
                  String var2x = "skullScale";
                  if (var0.has(var2x) && !var0.get(var2x).isJsonNull()) {
                     float var3x = var0.remove(var2x).getAsFloat();
                     var0.addProperty("playerHeadScale", var3x);
                     var1x.add("minecraft:player_head");
                  }

                  for (Pair var4 : List.of(
                     Pair.of("minecraft:gold_ingot", "goldIngotScale"),
                     Pair.of("minecraft:gold_nugget", "goldNuggetScale"),
                     Pair.of("minecraft:gold_ore", "goldOreScale"),
                     Pair.of("minecraft:golden_apple", "goldAppleScale")
                  )) {
                     String var5 = (String)var4.second();
                     if (var0.has(var5) && !var0.get(var5).isJsonNull()) {
                        var1x.add((String)var4.first());
                     }
                  }

                  if (!var1x.isEmpty()) {
                     var0.add("selectedItems", var1x);
                  }
               }
            );
      }
   }
}
