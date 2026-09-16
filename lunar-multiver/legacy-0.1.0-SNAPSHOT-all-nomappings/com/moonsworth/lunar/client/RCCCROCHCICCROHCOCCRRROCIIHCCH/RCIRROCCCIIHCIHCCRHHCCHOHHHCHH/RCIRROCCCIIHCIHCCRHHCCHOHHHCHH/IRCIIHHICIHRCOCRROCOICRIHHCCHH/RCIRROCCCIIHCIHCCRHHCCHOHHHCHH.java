package com.moonsworth.lunar.client.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "net.minecraft.client.network.OldServerPinger$2")
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @ModifyArg(
      method = "initChannel(Lio/netty/channel/Channel;)V",
      at = @At(value = "INVOKE", target = "Lio/netty/channel/ChannelConfig;setOption(Lio/netty/channel/ChannelOption;Ljava/lang/Object;)Z", ordinal = 1),
      index = 1
   )
   private Object lunar$tcpNoDelay(Object var1) {
      return true;
   }

   @Redirect(
      method = "initChannel(Lio/netty/channel/Channel;)V",
      at = @At(value = "INVOKE", target = "Lio/netty/channel/ChannelConfig;setOption(Lio/netty/channel/ChannelOption;Ljava/lang/Object;)Z", ordinal = 0)
   )
   private boolean lunar$noIp(ChannelConfig var1, ChannelOption var2, Object var3) {
      return true;
   }
}
