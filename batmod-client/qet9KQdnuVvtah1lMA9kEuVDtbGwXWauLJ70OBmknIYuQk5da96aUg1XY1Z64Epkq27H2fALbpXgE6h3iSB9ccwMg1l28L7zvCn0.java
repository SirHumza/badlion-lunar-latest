import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.InetSocketAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class qet9KQdnuVvtah1lMA9kEuVDtbGwXWauLJ70OBmknIYuQk5da96aUg1XY1Z64Epkq27H2fALbpXgE6h3iSB9ccwMg1l28L7zvCn0 extends ChannelInboundHandlerAdapter {
   private static final Logger Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = LogManager.getLogger();
   private H7AwzqscESAKgDPLoVx0nkIjZF3utHvtFMaN5NJuEsFBjPwsCVwjgisF7D13E4SIBOejWLIDgi6DohTnZia8mONR2im7Mh55kzY BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;

   public qet9KQdnuVvtah1lMA9kEuVDtbGwXWauLJ70OBmknIYuQk5da96aUg1XY1Z64Epkq27H2fALbpXgE6h3iSB9ccwMg1l28L7zvCn0(
      H7AwzqscESAKgDPLoVx0nkIjZF3utHvtFMaN5NJuEsFBjPwsCVwjgisF7D13E4SIBOejWLIDgi6DohTnZia8mONR2im7Mh55kzY var1
   ) {
      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      ByteBuf var3 = (ByteBuf)var2;
      var3.markReaderIndex();
      boolean var4 = true;

      try {
         if (var3.readUnsignedByte() == 254) {
            InetSocketAddress var5 = (InetSocketAddress)var1.channel().remoteAddress();
            TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var6 = this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
               .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
            int var7 = var3.readableBytes();
            switch (var7) {
               case 0:
                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.debug(
                     "Ping: (<1.3.x) from {}:{}", new Object[]{var5.getAddress(), var5.getPort()}
                  );
                  String var8 = String.format(
                     "%s§%d§%d",
                     var6.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W(),
                     var6.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(),
                     var6.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee()
                  );
                  this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var1, this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var8)
                  );
                  break;
               case 1:
                  if (var3.readUnsignedByte() != 1) {
                     return;
                  }

                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.debug(
                     "Ping: (1.4-1.5.x) from {}:{}", new Object[]{var5.getAddress(), var5.getPort()}
                  );
                  String var9 = String.format(
                     "§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d",
                     127,
                     var6.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF(),
                     var6.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W(),
                     var6.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(),
                     var6.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee()
                  );
                  this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var1, this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var9)
                  );
                  break;
               default:
                  boolean var10 = var3.readUnsignedByte() == 1;
                  var10 &= var3.readUnsignedByte() == 250;
                  var10 &= "MC|PingHost".equals(new String(var3.readBytes(var3.readShort() * 2).array(), Charsets.UTF_16BE));
                  int var11 = var3.readUnsignedShort();
                  var10 &= var3.readUnsignedByte() >= 73;
                  var10 &= 3 + var3.readBytes(var3.readShort() * 2).array().length + 4 == var11;
                  var10 &= var3.readInt() <= 65535;
                  var10 &= var3.readableBytes() == 0;
                  if (!var10) {
                     return;
                  }

                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.debug(
                     "Ping: (1.6) from {}:{}", new Object[]{var5.getAddress(), var5.getPort()}
                  );
                  String var12 = String.format(
                     "§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d",
                     127,
                     var6.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF(),
                     var6.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W(),
                     var6.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(),
                     var6.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee()
                  );
                  ByteBuf var13 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var12);

                  try {
                     this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var13);
                  } finally {
                     var13.release();
                  }
            }

            var3.release();
            var4 = false;
         }
      } catch (RuntimeException var23) {
      } finally {
         if (var4) {
            var3.resetReaderIndex();
            var1.channel().pipeline().remove("legacy_query");
            var1.fireChannelRead(var2);
         }
      }
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(ChannelHandlerContext var1, ByteBuf var2) {
      var1.pipeline().firstContext().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE);
   }

   private ByteBuf Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1) {
      ByteBuf var2 = Unpooled.buffer();
      var2.writeByte(255);
      char[] var3 = var1.toCharArray();
      var2.writeShort(var3.length);

      for (char var7 : var3) {
         var2.writeChar(var7);
      }

      return var2;
   }
}
