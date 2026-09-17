import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

class aFjcDJXw7PGlyBnAAwln3Km2OSuTaBLbmeqYpQg3yWraa0HaC3qrATpYQ31eIHl7kcc8alAcSjykBOsjZDjxSBhM9QGCLPhwjuqT extends SimpleChannelInboundHandler {
   aFjcDJXw7PGlyBnAAwln3Km2OSuTaBLbmeqYpQg3yWraa0HaC3qrATpYQ31eIHl7kcc8alAcSjykBOsjZDjxSBhM9QGCLPhwjuqT(
      wFd1hQmJ7M5zaiGtmRIMa8caAffZbDdVfkblaVfL5NBWOvgusH81O3Lpapt4eGs1tvARE7YRAo9Tg2fIlEmVnP6dVTZXgi0QBPeL var1
   ) {
      this.BatModClient = var1;
   }

   public void channelActive(ChannelHandlerContext var1) {
      super.channelActive(var1);
      ByteBuf var2 = Unpooled.buffer();

      try {
         var2.writeByte(254);
         var2.writeByte(1);
         var2.writeByte(250);
         char[] var3 = "MC|PingHost".toCharArray();
         var2.writeShort(var3.length);

         for (char var7 : var3) {
            var2.writeChar(var7);
         }

         var2.writeShort(
            7
               + 2
                  * this.BatModClient
                     .BatModClient
                     .BatModClient()
                     .length()
         );
         var2.writeByte(127);
         var3 = this.BatModClient
            .BatModClient
            .BatModClient()
            .toCharArray();
         var2.writeShort(var3.length);

         for (char var15 : var3) {
            var2.writeChar(var15);
         }

         var2.writeInt(
            this.BatModClient
               .BatModClient
               .Button()
         );
         var1.channel().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
      } finally {
         var2.release();
      }
   }

   protected void BatModClient(ChannelHandlerContext var1, ByteBuf var2) {
      short var3 = var2.readUnsignedByte();
      if (var3 == 255) {
         String var4 = new String(var2.readBytes(var2.readShort() * 2).array(), Charsets.UTF_16BE);
         String[] var5 = (String[])Iterables.toArray(
            qA5bWMiRpUjvglK4lkQ6RKDCp5wf7VfTP5AN6Tm3MD05LavLFkrPHSL7rpwxqPxOWip7u6dKCDiLJvjVGbFynPtQ4DV2HS8fdA8h.ButtonAction()
               .split(var4),
            String.class
         );
         if ("§1".equals(var5[0])) {
            int var6 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               var5[1], 0
            );
            String var7 = var5[2];
            String var8 = var5[3];
            int var9 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               var5[4], -1
            );
            int var10 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               var5[5], -1
            );
            this.BatModClient
               .Button
               .Checkbox = -1;
            this.BatModClient
               .Button
               .ProgressBar = var7;
            this.BatModClient
               .Button
               .ButtonAction = var8;
            this.BatModClient
               .Button
               .CustomSpinner = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.BatModProgressBar
               + ""
               + var9
               + ""
               + C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.ColorChooser
               + "/"
               + C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.BatModProgressBar
               + var10;
         }
      }

      var1.close();
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var1.close();
   }
}
