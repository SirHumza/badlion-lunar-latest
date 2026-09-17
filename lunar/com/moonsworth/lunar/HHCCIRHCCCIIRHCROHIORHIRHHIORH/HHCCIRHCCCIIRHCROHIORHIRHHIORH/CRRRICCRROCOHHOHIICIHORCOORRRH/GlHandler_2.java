package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   LESS_DEPTH_TEST(513, true),
   EQUAL_DEPTH_TEST(514, true),
   LEQUAL_DEPTH_TEST(515, true),
   GREATER_DEPTH_TEST(516, true),
   NO_DEPTH_TEST(519, true),
   NEVER_DEPTH_TEST(512, true),
   NOTEQUAL_DEPTH_TEST(517, true),
   GEQUAL_DEPTH_TEST(518, true);

   private final int glId;
   private final boolean supported;

   @Override
   public boolean isSupported() {
      return this.supported;
   }

   @Generated
   @Override
   public int getGlId() {
      return this.glId;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var3, boolean var4) {
      this.glId = var3;
      this.supported = var4;
   }
}
