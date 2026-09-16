package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   RGBA8(4),
   RED8(1),
   DEPTH32(4);

   private final int pixelSize;

   public boolean hasColorAspect() {
      return this == RGBA8 || this == RED8;
   }

   public boolean hasDepthAspect() {
      return this == DEPTH32;
   }

   @Generated
   public int pixelSize() {
      return this.pixelSize;
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3) {
      this.pixelSize = var3;
   }
}
