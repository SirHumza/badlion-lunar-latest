package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   GL_NEVER(512),
   GL_LESS(513),
   GL_EQUAL(514),
   GL_LEQUAL(515),
   GL_GREATER(516),
   GL_NOTEQUAL(517),
   GL_GEQUAL(518),
   GL_ALWAYS(519);

   private final int id;

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH fromId(int var0) {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
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
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var3) {
      this.id = var3;
   }
}
