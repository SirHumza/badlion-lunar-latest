package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import org.jetbrains.annotations.Nullable;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final String[] CHORCOHOHICOROCHCOIIIIIHIHCICR = new String[]{"x", "y", "position"};
   private static final String HHCCCCIIHCIOIRIRCCCOICOHHCHOIH = "hypixel_bedwars_height_limit";
   private static final String ROIIROIRORHRCHOIHCOCIIOICCHRRC = "hypixel_bedwars_height_limit_enabled_bl";

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHIRRIIORRHORHRORIHOROIRCORCOO
         && !var3.has("HEIGHT_LIMIT")) {
         JsonObject var4 = new JsonObject();
         JsonObject var5 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var3, "HYPIXEL_BEDWARS").orElse(null);
         boolean var6 = this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var5, "enabled");
         if (var5 != null) {
            JsonObject var7 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var5, "HYPIXEL_BEDWARS_HEIGHT_LIMIT_CHILD").orElse(null);
            if (var7 != null) {
               var6 = var6 && this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var7, "enabled");

               for (String var11 : CHORCOHOHICOROCHCOIIIIIHIHCICR) {
                  if (var7.has(var11) && !var7.get(var11).isJsonNull()) {
                     var4.add(var11, var7.get(var11));
                  }
               }

               OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var7, "options").ifPresent(var1x -> var4.add("options", var1x.deepCopy()));
               var5.remove("HYPIXEL_BEDWARS_HEIGHT_LIMIT_CHILD");
            } else {
               JsonObject var8 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var5, "hypixel_bedwars_height_limit").orElse(null);
               if (var8 != null) {
                  var6 = var6 && this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var8, "hypixel_bedwars_height_limit_enabled_bl");
               }
            }

            var5.remove("hypixel_bedwars_height_limit");
         }

         if (var6) {
            var4.addProperty("enabled", true);
         }

         if (!var4.entrySet().isEmpty()) {
            var3.add("HEIGHT_LIMIT", var4);
         }
      }
   }

   private boolean HICRRICCHCCROOHHCHOCOCCHOIHHOC(@Nullable JsonObject var1, String var2) {
      return var1 == null || !var1.has(var2) || var1.get(var2).isJsonNull() || var1.get(var2).getAsBoolean();
   }
}
