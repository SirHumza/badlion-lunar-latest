import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;

public class ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV {
   private final Cipher Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
   private byte[] BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = new byte[0];
   private byte[] vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = new byte[0];

   protected ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV(Cipher var1) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1;
   }

   private byte[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(ByteBuf var1) {
      int var2 = var1.readableBytes();
      if (this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.length < var2) {
         this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = new byte[var2];
      }

      var1.readBytes(this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW, 0, var2);
      return this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;
   }

   protected ByteBuf Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      ChannelHandlerContext var1, ByteBuf var2
   ) {
      int var3 = var2.readableBytes();
      byte[] var4 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
      ByteBuf var5 = var1.alloc()
         .heapBuffer(this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.getOutputSize(var3));
      var5.writerIndex(
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .update(var4, 0, var3, var5.array(), var5.arrayOffset())
      );
      return var5;
   }

   protected void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(ByteBuf var1, ByteBuf var2) {
      int var3 = var1.readableBytes();
      byte[] var4 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      int var5 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.getOutputSize(var3);
      if (this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.length < var5) {
         this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = new byte[var5];
      }

      var2.writeBytes(
         this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5,
         0,
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .update(var4, 0, var3, this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5)
      );
   }
}
