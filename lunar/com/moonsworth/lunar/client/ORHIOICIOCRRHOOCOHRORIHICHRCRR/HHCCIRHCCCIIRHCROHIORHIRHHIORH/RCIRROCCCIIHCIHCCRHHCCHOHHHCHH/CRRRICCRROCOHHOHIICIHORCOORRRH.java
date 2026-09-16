package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   OPAQUE("particles_opaque"),
   ALPHA("particles_alpha"),
   BLEND("particles_blend");

   public final String id;

   public static CRRRICCRROCOHHOHIICIHORCOORRRH fromString(String var0) {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : values()) {
         if (var4.id.equals(var0)) {
            return var4;
         }
      }

      return OPAQUE;
   }

   @Generated
   CRRRICCRROCOHHOHIICIHORCOORRRH(String var3) {
      this.id = var3;
   }
}
