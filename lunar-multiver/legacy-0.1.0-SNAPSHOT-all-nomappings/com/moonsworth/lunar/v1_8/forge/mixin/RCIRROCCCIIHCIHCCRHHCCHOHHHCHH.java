package com.moonsworth.lunar.v1_8.forge.mixin;

import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.handshake.client.C00Handshake;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(C00Handshake.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public int protocolVersion;
   @Shadow
   public String ip;
   @Shadow
   public int port;
   @Shadow
   public EnumConnectionState requestedState;

   @Overwrite
   public void readPacketData(PacketBuffer var1) {
      this.protocolVersion = var1.readVarIntFromBuffer();
      this.ip = var1.readStringFromBuffer(32767);
      this.port = var1.readUnsignedShort();
      this.requestedState = EnumConnectionState.getById(var1.readVarIntFromBuffer());
   }

   @Overwrite
   public void writePacketData(PacketBuffer var1) {
      var1.writeVarIntToBuffer(this.protocolVersion);
      var1.writeString(this.ip);
      var1.writeShort(this.port);
      var1.writeVarIntToBuffer(this.requestedState.getId());
   }
}
