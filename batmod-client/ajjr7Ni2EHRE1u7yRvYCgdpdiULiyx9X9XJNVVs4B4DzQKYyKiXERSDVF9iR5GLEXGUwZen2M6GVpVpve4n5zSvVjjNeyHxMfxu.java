import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu extends MessageToByteEncoder {
   protected void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3
   ) {
      int var4 = var2.readableBytes();
      int var5 = kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var4
      );
      if (var5 > 3) {
         throw new IllegalArgumentException("unable to fit " + var4 + " into " + 3);
      }

      kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP var6 = new kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP(
         var3
      );
      var6.ensureWritable(var5 + var4);
      var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var4);
      var6.writeBytes(var2, var2.readerIndex(), var4);
   }
}
