package com.moonsworth.lunar.client.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   COLLECTING,
   RENDERING_OPAQUE,
   RENDERING_TRANSLUCENT,
   POST_RENDER;

   public boolean isBefore(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return this.ordinal() < var1.ordinal();
   }

   public boolean isAfter(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return this.ordinal() > var1.ordinal();
   }
}
