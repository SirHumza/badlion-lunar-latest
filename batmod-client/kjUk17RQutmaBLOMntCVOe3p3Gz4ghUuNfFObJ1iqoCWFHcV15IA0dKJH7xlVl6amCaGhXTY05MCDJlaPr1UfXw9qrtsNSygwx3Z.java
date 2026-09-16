import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class kjUk17RQutmaBLOMntCVOe3p3Gz4ghUuNfFObJ1iqoCWFHcV15IA0dKJH7xlVl6amCaGhXTY05MCDJlaPr1UfXw9qrtsNSygwx3Z extends ByteToMessageDecoder {
   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      var2.markReaderIndex();
      byte[] var4 = new byte[3];

      for (int var5 = 0; var5 < var4.length; var5++) {
         if (!var2.isReadable()) {
            var2.resetReaderIndex();
            return;
         }

         var4[var5] = var2.readByte();
         if (var4[var5] >= 0) {
            LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var6 = new LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx(
               Unpooled.wrappedBuffer(var4)
            );

            try {
               int var7 = var6.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
               if (var2.readableBytes() < var7) {
                  var2.resetReaderIndex();
                  return;
               }

               var3.add(var2.readBytes(var7));
            } finally {
               var6.release();
            }

            return;
         }
      }

      throw new CorruptedFrameException("length wider than 21-bit");
   }
}
