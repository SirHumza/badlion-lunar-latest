package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   LINEAR("linear"),
   HERMITE("catmull_rom");

   public final String id;

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH fromString(String var0) {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
         if (var4.id.equals(var0)) {
            return var4;
         }
      }

      return LINEAR;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3) {
      this.id = var3;
   }
}
