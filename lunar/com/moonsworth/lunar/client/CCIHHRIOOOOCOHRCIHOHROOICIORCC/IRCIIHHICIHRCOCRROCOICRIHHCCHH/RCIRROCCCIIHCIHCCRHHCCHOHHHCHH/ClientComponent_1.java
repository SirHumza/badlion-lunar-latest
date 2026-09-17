package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonPrimitive;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OCICRRCHRIRORHIRHIHOIRCCIHCHRH();
   }

   @Override
   public JsonPrimitive RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, JsonPrimitive var2) {
      if (var1.startsWith("chatOpacity")) {
         return new JsonPrimitive(Math.max(0.4, var2.getAsFloat()));
      } else {
         return var1.startsWith("key_") && var2.isString()
            ? new JsonPrimitive(
               com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRIIHHRHRORIIHOHIICRICCIICIICC(
                  var2.getAsString()
               )
            )
            : var2;
      }
   }
}
