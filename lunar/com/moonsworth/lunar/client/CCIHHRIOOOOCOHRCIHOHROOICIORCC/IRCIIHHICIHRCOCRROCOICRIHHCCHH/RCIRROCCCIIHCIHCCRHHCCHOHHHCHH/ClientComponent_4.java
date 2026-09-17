package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonPrimitive;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      return true;
   }

   @Override
   public JsonPrimitive RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, JsonPrimitive var2) {
      if (!var1.equals("fov")) {
         return var2;
      }

      double var3 = var2.getAsDouble();
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion()
         .RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRHOCHRCRICCRHHCIRCIOCRORCCHRO)) {
         if (var3 < -1.0 || var3 > 1.0) {
            double var5 = (var3 - 70.0) / 40.0;
            var3 = var5 >= -1.0 && var5 <= 1.0 ? var5 : 0.0;
         }
      } else {
         var3 = ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(var3);
      }

      return new JsonPrimitive(var3);
   }

   public static double ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(double var0) {
      if (!(var0 < 30.0) && !(var0 > 110.0)) {
         return var0;
      }

      double var2 = var0 * 40.0 + 70.0;
      return var2 >= 30.0 && var2 <= 110.0 ? var2 : 70.0;
   }
}
