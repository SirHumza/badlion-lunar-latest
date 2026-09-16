import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class lAKqNhMqZGM0Cxmm0phoB3lHfM77nEhwgOnZHiVZjzXdu59XKzrY2HDqlNwYcBkWwYrvt4ufgkfpmfK5t6MhfYoJJf3iRGCkgDQa extends MessageToByteEncoder {
   protected void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3
   ) {
      int var4 = var2.readableBytes();
      int var5 = LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var4
      );
      if (var5 > 3) {
         throw new IllegalArgumentException("unable to fit " + var4 + " into " + 3);
      }

      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var6 = new LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx(
         var3
      );
      var6.ensureWritable(var5 + var4);
      var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var4);
      var6.writeBytes(var2, var2.readerIndex(), var4);
   }
}
