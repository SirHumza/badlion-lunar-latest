package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   LEFT(-1, 0),
   UP(0, 1),
   RIGHT(1, 0),
   DOWN(0, -1);

   private final int i;
   private final int j;

   public CRRRICCRROCOHHOHIICIHORCOORRRH getAdjacent() {
      return this == LEFT ? DOWN : values()[this.ordinal() - 1];
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH getOpposite() {
      return values()[(this.ordinal() + 2) % 4];
   }

   @Generated
   CRRRICCRROCOHHOHIICIHORCOORRRH(int var3, int var4) {
      this.i = var3;
      this.j = var4;
   }

   @Generated
   public int getI() {
      return this.i;
   }

   @Generated
   public int getJ() {
      return this.j;
   }
}
