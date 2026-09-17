package com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.nio.charset.StandardCharsets;

public final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final Channel ICHIHHOOOORROIRHHRHRRCHOIIHROR;
   private final Channel CCCCOOIIOHRICOIHHCCOCRCOIOROHH;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var1, String var2, int var3, int var4) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Socket Bridge", "Connecting " + var2 + ":" + var3 + " and localhost:" + var4
      );
      final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      Bootstrap var6 = new Bootstrap();
      ((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)var6.group(new NioEventLoopGroup(1))).channel(NioSocketChannel.class))
               .option(ChannelOption.TCP_NODELAY, true))
            .option(ChannelOption.SO_KEEPALIVE, true))
         .handler(new ChannelInitializer<Channel>() {
            protected void initChannel(Channel var1) {
               var1.pipeline().addLast(new ChannelHandler[]{var5});
            }
         });
      ChannelFuture var7 = var6.connect(var2, var3);
      ChannelFuture var8 = var6.connect("localhost", var4);
      this.ICHIHHOOOORROIRHHRHRRCHOIIHROR = var7.channel();
      this.CCCCOOIIOHRICOIHHCCOCRCOIOROHH = var8.channel();
      var7.addListener(var2x -> {
         ByteBuf var3x = Unpooled.buffer();
         var3x.writeInt(var1.length());
         var3x.writeBytes(var1.getBytes(StandardCharsets.UTF_8));
         this.ICHIHHOOOORROIRHHRHRRCHOIIHROR.writeAndFlush(var3x);
      });
   }

   @Sharable
   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ChannelInboundHandlerAdapter {
      public void channelRead(ChannelHandlerContext var1, Object var2) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1).writeAndFlush(var2);
      }

      public void channelInactive(ChannelHandlerContext var1) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1).close();
      }

      public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1).close();
      }

      private Channel RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ChannelHandlerContext var1) {
         return var1.channel() == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.ICHIHHOOOORROIRHHRHRRCHOIIHROR
            ? RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.CCCCOOIIOHRICOIHHCCOCRCOIOROHH
            : RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.ICHIHHOOOORROIRHHRHRRCHOIIHROR;
      }
   }
}
