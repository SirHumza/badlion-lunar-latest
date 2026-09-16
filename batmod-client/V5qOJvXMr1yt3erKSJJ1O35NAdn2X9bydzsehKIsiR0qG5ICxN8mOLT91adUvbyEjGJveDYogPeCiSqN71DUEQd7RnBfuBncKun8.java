import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public class V5qOJvXMr1yt3erKSJJ1O35NAdn2X9bydzsehKIsiR0qG5ICxN8mOLT91adUvbyEjGJveDYogPeCiSqN71DUEQd7RnBfuBncKun8 extends Thread {
   private final iu07a3ZhTh1FTyMVemj0lEP6jfqxinKBavdQzGfAZgxrMDLJAmElyMtdwNWsxZqpgD7GK8D5AaMDRvZD9qGH8byog23Kr8BbQQOh Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
   private final InetAddress BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;
   private final MulticastSocket vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5;

   public V5qOJvXMr1yt3erKSJJ1O35NAdn2X9bydzsehKIsiR0qG5ICxN8mOLT91adUvbyEjGJveDYogPeCiSqN71DUEQd7RnBfuBncKun8(
      iu07a3ZhTh1FTyMVemj0lEP6jfqxinKBavdQzGfAZgxrMDLJAmElyMtdwNWsxZqpgD7GK8D5AaMDRvZD9qGH8byog23Kr8BbQQOh var1
   ) {
      super(
         "LanServerDetector #"
            + Qw96GSbDVUYm2844rgnLp5IXJIiPROk24PURHlWtAZ7etMS1USaNJghsRdl910V2o7BCJ8z7rofnIZgUKjN420f6bNiK4lpUge2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
               .incrementAndGet()
      );
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1;
      this.setDaemon(true);
      this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = new MulticastSocket(4445);
      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = InetAddress.getByName("224.0.2.60");
      this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.setSoTimeout(5000);
      this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         .joinGroup(this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW);
   }

   @Override
   public void run() {
      byte[] var1 = new byte[1024];

      while (!this.isInterrupted()) {
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);

         try {
            this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.receive(var2);
         } catch (SocketTimeoutException var5) {
            continue;
         } catch (IOException var6) {
            Qw96GSbDVUYm2844rgnLp5IXJIiPROk24PURHlWtAZ7etMS1USaNJghsRdl910V2o7BCJ8z7rofnIZgUKjN420f6bNiK4lpUge2.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
               .error("Couldn't ping server", var6);
            break;
         }

         String var3 = new String(var2.getData(), var2.getOffset(), var2.getLength());
         Qw96GSbDVUYm2844rgnLp5IXJIiPROk24PURHlWtAZ7etMS1USaNJghsRdl910V2o7BCJ8z7rofnIZgUKjN420f6bNiK4lpUge2.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
            .debug(var2.getAddress() + ": " + var3);
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3, var2.getAddress());
      }

      try {
         this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            .leaveGroup(this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW);
      } catch (IOException var4) {
      }

      this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.close();
   }
}
