package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import org.jetbrains.annotations.Nullable;

public class CORCOCICIRIOHROHROIIOOHICCHCRR
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final String[] OCRRRCHROORHCHCOORCRCCRHCCHCRO = new String[]{
      "overlayMode",
      "gradientHeight",
      "darkenColor",
      "barrierColor",
      "topFaceOnly",
      "style",
      "showTitle",
      "mapName",
      "heightLimit",
      "currentHeight",
      "distanceToHeightLimit"
   };
   private static final String[] HCRHIOIHCIIIIRCHHCIRIIOHOROOOH = new String[]{
      "HEIGHT_LIMIT_BEDWARS", "HEIGHT_LIMIT_BRIDGE", "HEIGHT_LIMIT_VANILLA", "HEIGHT_LIMIT_SERVER"
   };
   private static final String[] ORIOHRCCROORIRHICRIORRHCOOROCI = new String[]{"bedwarsHeightLimit", "bridgeHeightLimit", "vanillaCeiling"};

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHIRRIIORRHORHRORIHOROIRCORCOO) {
         JsonObject var4 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var3, "HEIGHT_LIMIT").orElse(null);
         if (var4 != null) {
            for (String var8 : HCRHIOIHCIIIIRCHHCIRIIOHOROOOH) {
               if (var4.has(var8)) {
                  return;
               }
            }

            JsonObject var11 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var4, "options").orElse(new JsonObject());
            JsonObject var12 = new JsonObject();

            for (String var10 : OCRRRCHROORHCHCOORCRCCRHCCHCRO) {
               if (var11.has(var10) && !var11.get(var10).isJsonNull()) {
                  var12.add(var10, var11.get(var10));
               }
            }

            if (var11.has("darkenBlocksAtLimit") && !var11.get("darkenBlocksAtLimit").isJsonNull()) {
               var12.addProperty("showOverlay", var11.get("darkenBlocksAtLimit").getAsBoolean());
            }

            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "HEIGHT_LIMIT_BEDWARS", var11, "bedwarsHeightLimit", var12);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "HEIGHT_LIMIT_BRIDGE", var11, "bridgeHeightLimit", var12);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "HEIGHT_LIMIT_VANILLA", var11, "vanillaCeiling", var12);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "HEIGHT_LIMIT_SERVER", var11, null, var12);
            var11.remove("darkenBlocksAtLimit");

            for (String var21 : OCRRRCHROORHCHCOORCRCCRHCCHCRO) {
               var11.remove(var21);
            }

            for (String var22 : ORIOHRCCROORIRHICRIORRHCOOROCI) {
               var11.remove(var22);
            }

            if (var11.entrySet().isEmpty()) {
               var4.remove("options");
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1, String var2, JsonObject var3, @Nullable String var4, JsonObject var5) {
      JsonObject var6 = new JsonObject();
      if (var4 != null && var3.has(var4) && !var3.get(var4).isJsonNull() && !var3.get(var4).getAsBoolean()) {
         var6.addProperty("enabled", false);
      }

      if (!var5.entrySet().isEmpty()) {
         var6.add("options", var5.deepCopy());
      }

      if (!var6.entrySet().isEmpty()) {
         var1.add(var2, var6);
      }
   }
}
