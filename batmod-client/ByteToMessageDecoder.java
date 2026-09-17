import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;

public class Elbw9xBVk4Qxfnd5Ur6Zq208KqGbhYVgIsF1954bvR36rKWyYNdpF0uhBOp0dTgjtNPJHO7cYBEQhP16R1fUOFDQnHZxyvHxvKrH extends ByteToMessageDecoder {
   private final Inflater BatModClient;
   private int Button;

   public Elbw9xBVk4Qxfnd5Ur6Zq208KqGbhYVgIsF1954bvR36rKWyYNdpF0uhBOp0dTgjtNPJHO7cYBEQhP16R1fUOFDQnHZxyvHxvKrH(int var1) {
      this.Button = var1;
      this.BatModClient = new Inflater();
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      if (var2.readableBytes() != 0) {
         LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var4 = new LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx(
            var2
         );
         int var5 = var4.ButtonAction();
         if (var5 == 0) {
            var3.add(var4.readBytes(var4.readableBytes()));
         } else {
            if (var5 < this.Button) {
               throw new DecoderException(
                  "Badly compressed packet - size of "
                     + var5
                     + " is below server threshold of "
                     + this.Button
               );
            }

            if (var5 > 2097152) {
               throw new DecoderException("Badly compressed packet - size of " + var5 + " is larger than protocol maximum of " + 2097152);
            }

            byte[] var6 = new byte[var4.readableBytes()];
            var4.readBytes(var6);
            this.BatModClient.setInput(var6);
            byte[] var7 = new byte[var5];
            this.BatModClient.inflate(var7);
            var3.add(Unpooled.wrappedBuffer(var7));
            this.BatModClient.reset();
         }
      }
   }

   public void BatModClient(int var1) {
      this.Button = var1;
   }
}
