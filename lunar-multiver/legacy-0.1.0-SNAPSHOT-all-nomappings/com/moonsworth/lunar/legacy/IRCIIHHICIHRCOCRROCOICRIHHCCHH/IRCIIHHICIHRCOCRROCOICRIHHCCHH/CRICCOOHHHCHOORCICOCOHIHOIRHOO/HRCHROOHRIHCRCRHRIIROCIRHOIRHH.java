package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.client.network.NetHandlerLoginClient;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetworkManager_v1_7;
import net.minecraft.network.Packet_v1_7;
import net.minecraft.network.play.client.CPacketEntityAction;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(NetworkManager_v1_7.class)
public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Shadow
   public Channel channel;
   @Shadow
   public INetHandler packetListener;
   @Final
   @Shadow
   public boolean isClientSide;
   @Unique
   private static final String LUNAR_HANDLER_KEY = "lunar_handler";

   @Inject(method = "scheduleOutboundPacket", at = @At("HEAD"))
   private void lunar$interceptEntityActionPacket(Packet_v1_7 var1, GenericFutureListener[] var2, CallbackInfo var3) {
      if (var1 instanceof CPacketEntityAction var4) {
         if (var4.func_149513_d$v1_7() == 4) {
            com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIOORHROROCIIOHCOHHOOIIIICCO = true;
         } else if (var4.func_149513_d$v1_7() == 5) {
            com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIOORHROROCIIOHCOHHOOIIIICCO = false;
         }
      }
   }

   @Inject(method = "channelActive", at = @At("HEAD"))
   private void lunar$rewindPacketEvent(ChannelHandlerContext var1, CallbackInfo var2) {
      if (var1.channel().pipeline().get("lunar_handler") == null) {
         final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
         final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this.isClientSide
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CLIENTBOUND
            : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SERVERBOUND;
         ChannelInboundHandlerAdapter var5 = new ChannelInboundHandlerAdapter() {
            public void channelRead(ChannelHandlerContext var1, Object var2x) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3x = var3.OHOHRHIIIIIORCIHCHCHCIIHOOIIOI();
               if (var3x != null) {
                  EnumConnectionState var4x = (EnumConnectionState)var1.channel().attr(NetworkManager_v1_7.attrKeyConnectionState).get();
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5x = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()[var4x.ordinal()];
                  if (var2x instanceof ByteBuf var6 && var6.readableBytes() > 0) {
                     var3x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new IIRHCHHOICHRICOOCRORCCIOOIHOIR(null, var6, var4, var5x));
                  } else if (var2x instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH var7
                     )
                   {
                     var3x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new IIRHCHHOICHRICOOCRORCCIOOIHOIR(var7, null, var4, var5x));
                  }
               }

               super.channelRead(var1, var2x);
            }
         };
         if (var1.channel().pipeline().get("decoder") != null) {
            var1.channel().pipeline().addBefore("decoder", "lunar_handler", var5);
         } else {
            var1.channel().pipeline().addFirst("lunar_handler", var5);
         }
      }
   }

   @Inject(method = "closeChannel", at = @At("HEAD"))
   private void lunar$handleCloseChannel(CallbackInfo var1) {
      if (this.channel.isOpen() && this.packetListener instanceof NetHandlerLoginClient) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$submit(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH::HRHIOHRHORHOCIICRCHICCOIROORHC
            );
      }
   }
}
