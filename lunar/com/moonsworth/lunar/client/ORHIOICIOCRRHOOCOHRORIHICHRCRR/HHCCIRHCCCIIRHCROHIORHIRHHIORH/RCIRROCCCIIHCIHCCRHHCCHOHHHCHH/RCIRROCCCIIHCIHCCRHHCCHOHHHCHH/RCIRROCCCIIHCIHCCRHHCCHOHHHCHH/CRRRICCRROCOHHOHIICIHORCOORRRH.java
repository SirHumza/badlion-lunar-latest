package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   ROTATE_XYZ("rotate_xyz"),
   ROTATE_Y("rotate_y"),
   LOOKAT_XYZ("lookat_xyz"),
   LOOKAT_Y("lookat_y"),
   DIRECTION_X("direction_x"),
   DIRECTION_Y("direction_y"),
   DIRECTION_Z("direction_z");

   public final String id;

   public static CRRRICCRROCOHHOHIICIHORCOORRRH fromString(String var0) {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : values()) {
         if (var4.id.equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   CRRRICCRROCOHHOHIICIHORCOORRRH(String var3) {
      this.id = var3;
   }
}
