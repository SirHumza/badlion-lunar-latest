package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   GL_FLAT(7424),
   GL_SMOOTH(7425);

   private final int id;

   public static CRRRICCRROCOHHOHIICIHORCOORRRH fromId(int var0) {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : values()) {
         if (var4.id == var0) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public int getId() {
      return this.id;
   }

   @Generated
   CRRRICCRROCOHHOHIICIHORCOORRRH(int var3) {
      this.id = var3;
   }
}
