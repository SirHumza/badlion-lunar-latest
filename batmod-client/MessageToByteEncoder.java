import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class JGY3Y46Y6p9PEaPqKfg2I8O0YcZ2HOj8SNp98b34Ju6QwOctBTvwq16vulHo2ufla8fAZOV4mOsNZdDy1WEbNNF2dNr8OKquGviQ extends MessageToByteEncoder {
   private final byte[] BatModClient = new byte[8192];
   private final Deflater Button;
   private int CustomSpinner;

   public JGY3Y46Y6p9PEaPqKfg2I8O0YcZ2HOj8SNp98b34Ju6QwOctBTvwq16vulHo2ufla8fAZOV4mOsNZdDy1WEbNNF2dNr8OKquGviQ(int var1) {
      this.CustomSpinner = var1;
      this.Button = new Deflater();
   }

   protected void BatModClient(
      ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3
   ) {
      int var4 = var2.readableBytes();
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var5 = new LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx(
         var3
      );
      if (var4 < this.CustomSpinner) {
         var5.Button(0);
         var5.writeBytes(var2);
      } else {
         byte[] var6 = new byte[var4];
         var2.readBytes(var6);
         var5.Button(var6.length);
         this.Button.setInput(var6, 0, var4);
         this.Button.finish();

         while (!this.Button.finished()) {
            int var7 = this.Button
               .deflate(this.BatModClient);
            var5.writeBytes(this.BatModClient, 0, var7);
         }

         this.Button.reset();
      }
   }

   public void BatModClient(int var1) {
      this.CustomSpinner = var1;
   }
}
