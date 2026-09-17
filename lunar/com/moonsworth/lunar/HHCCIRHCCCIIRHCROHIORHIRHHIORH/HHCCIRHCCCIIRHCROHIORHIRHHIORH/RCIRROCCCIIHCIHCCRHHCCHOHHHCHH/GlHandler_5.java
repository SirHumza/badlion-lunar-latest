package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   DYNAMIC_WRITE(false, true, 35048),
   STATIC_WRITE(false, true, 35044),
   STREAM_WRITE(false, true, 35040),
   STATIC_READ(true, false, 35045),
   DYNAMIC_READ(true, false, 35049),
   STREAM_READ(true, false, 35041),
   DYNAMIC_COPY(false, false, 35050),
   STATIC_COPY(false, false, 35046),
   STREAM_COPY(false, false, 35042);

   private final boolean readable;
   private final boolean writable;
   private final int glId;

   @Override
   public boolean isSupported() {
      return true;
   }

   @Generated
   public boolean isReadable() {
      return this.readable;
   }

   @Generated
   public boolean isWritable() {
      return this.writable;
   }

   @Generated
   @Override
   public int getGlId() {
      return this.glId;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var3, boolean var4, int var5) {
      this.readable = var3;
      this.writable = var4;
      this.glId = var5;
   }
}
