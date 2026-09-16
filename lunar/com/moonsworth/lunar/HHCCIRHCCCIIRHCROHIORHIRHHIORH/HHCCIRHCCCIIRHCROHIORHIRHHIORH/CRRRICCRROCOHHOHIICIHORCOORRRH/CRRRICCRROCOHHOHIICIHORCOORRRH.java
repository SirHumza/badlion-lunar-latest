package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   GL_POINT(6912, false),
   GL_LINE(6913, true),
   GL_FILL(6914, true);

   private final int glId;
   private final boolean supported;

   @Generated
   @Override
   public int getGlId() {
      return this.glId;
   }

   @Generated
   @Override
   public boolean isSupported() {
      return this.supported;
   }

   @Generated
   CRRRICCRROCOHHOHIICIHORCOORRRH(int var3, boolean var4) {
      this.glId = var3;
      this.supported = var4;
   }
}
