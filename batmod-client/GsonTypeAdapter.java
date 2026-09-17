import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;

public class GsonTypeAdapter extends MessageToByteEncoder {
   protected void BatModClient(
      ChannelHandlerContext var1, TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ var2, ByteBuf var3
   ) {
      int var4 = BatModJson.BatModClient()
         .ButtonAction()
         .Button(var2);
      if (var4 == -1) {
         throw new IOException("Can't serialize unregistered packet");
      }

      kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP var5 = new kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP(
         var3
      );
      var5.Button(var4);

      try {
         var2.Button(var5);
      } catch (Throwable var7) {
         var7.printStackTrace();
      }
   }
}
