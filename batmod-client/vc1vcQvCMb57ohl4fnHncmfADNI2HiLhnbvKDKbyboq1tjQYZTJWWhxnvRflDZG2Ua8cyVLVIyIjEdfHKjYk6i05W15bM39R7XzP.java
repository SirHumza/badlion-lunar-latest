import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP extends ByteToMessageDecoder {
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
            kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP var6 = new kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP(
               Unpooled.wrappedBuffer(var4)
            );

            try {
               int var7 = var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
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
