package com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   SERVER(false),
   CLIENT_INTERNAL(true),
   CLIENT_REMOTE(true),
   CLIENT_CRITERIA(true),
   CLIENT_OVERRIDE(true);

   private final boolean client;

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var3) {
      this.client = var3;
   }

   @Generated
   public boolean isClient() {
      return this.client;
   }
}
