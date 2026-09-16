package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   GL_MODELVIEW(5888),
   GL_PROJECTION(5889),
   GL_TEXTURE(5890),
   GL_COLOR(6144);

   private final int id;

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH fromId(int var0) {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : values()) {
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
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var3) {
      this.id = var3;
   }
}
