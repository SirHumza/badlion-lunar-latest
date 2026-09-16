package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.websocket.handshake.v1.MinecraftIdentity;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Deprecated
   MOJANG("Mojang", MinecraftIdentity.Type.TYPE_MOJANG),
   XBOX("Xbox", MinecraftIdentity.Type.TYPE_MICROSOFT);

   private final String formatted;
   private final MinecraftIdentity.Type protobufType;

   @Generated
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3, MinecraftIdentity.Type var4) {
      this.formatted = var3;
      this.protobufType = var4;
   }

   @Generated
   public String getFormatted() {
      return this.formatted;
   }

   @Generated
   public MinecraftIdentity.Type getProtobufType() {
      return this.protobufType;
   }
}
