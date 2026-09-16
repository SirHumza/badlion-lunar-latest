package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import io.netty.channel.ChannelHandlerContext;
import java.net.SocketAddress;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetworkManager_v1_7;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(NetworkManager_v1_7.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Shadow
   public INetHandler packetListener;
   @Unique
   private String lunar$enteredHostName;

   @Shadow
   public abstract SocketAddress getRemoteAddress();

   @Shadow
   public abstract void channelInactive(ChannelHandlerContext var1);

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getClientPacketListener() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.packetListener;
   }

   @Nullable
   public String bridge$getEnteredHostName() {
      return this.lunar$enteredHostName;
   }

   public void bridge$setEnteredHostName(String var1) {
      this.lunar$enteredHostName = var1;
   }

   public SocketAddress bridge$getRemoteAddress() {
      return this.getRemoteAddress();
   }

   public void bridge$channelInactive() {
      this.channelInactive(null);
   }
}
