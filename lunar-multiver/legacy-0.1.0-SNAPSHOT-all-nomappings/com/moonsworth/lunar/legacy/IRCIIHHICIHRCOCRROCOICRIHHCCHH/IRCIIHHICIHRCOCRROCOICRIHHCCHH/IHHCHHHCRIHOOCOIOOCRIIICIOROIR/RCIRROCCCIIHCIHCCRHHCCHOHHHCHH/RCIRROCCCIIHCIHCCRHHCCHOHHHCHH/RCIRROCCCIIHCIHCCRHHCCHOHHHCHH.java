package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import io.netty.buffer.Unpooled;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.Packet_v1_8;
import net.minecraft.network.play.server.SPacketCustomPayload;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
@Mixin(PlayerList.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public MinecraftServer server;

   @Inject(
      method = "initializeConnectionToPlayer$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/network/NetHandlerPlayServer;sendPacket$v1_12(Lnet/minecraft/network/Packet_v1_8;)V", ordinal = 2)
   )
   @RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private void lunar$registerBukkitApiChannel(CallbackInfo var1, @Local NetHandlerPlayServer var2) {
      PacketBuffer var3 = new PacketBuffer(Unpooled.buffer());
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var3.writeString$v1_8("lunarclient:pm");
      } else {
         var3.writeStringToBuffer$v1_7("lunarclient:pm");
      }

      SPacketCustomPayload var4 = new SPacketCustomPayload("REGISTER", var3);
      var2.sendPacket$v1_12((Packet_v1_8)var4);
   }

   @ModifyConstant(method = "<init>*", constant = @Constant(intValue = 8))
   private int lunar$modifyMaxPlayers(int var1) {
      return 12;
   }
}
