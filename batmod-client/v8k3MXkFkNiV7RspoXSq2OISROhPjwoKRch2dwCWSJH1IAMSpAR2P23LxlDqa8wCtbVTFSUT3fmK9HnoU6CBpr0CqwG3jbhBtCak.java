import java.util.Map;

final class v8k3MXkFkNiV7RspoXSq2OISROhPjwoKRch2dwCWSJH1IAMSpAR2P23LxlDqa8wCtbVTFSUT3fmK9HnoU6CBpr0CqwG3jbhBtCak
   implements sgDjnXfhDMnHJ6pEF7rIEGI4DPt1X6S7JigeijgcDumhYHN0G2EtzRS3QYynyt1YkXyOLat64ppIGdBAE3DnvV2xtTcyXuGhVzvF {
   v8k3MXkFkNiV7RspoXSq2OISROhPjwoKRch2dwCWSJH1IAMSpAR2P23LxlDqa8wCtbVTFSUT3fmK9HnoU6CBpr0CqwG3jbhBtCak(Map var1) {
      this.BatModClient = var1;
   }

   @Override
   public void BatModClient(
      DaQRUcjnGEWAwHApQcUxp4sZeHlGiCcxPfOgJiyjqgSaeICXTGCfcrUpDcBfTQjFv2GBWVbKjwTjGgEbu9k4O9rMM6A1ZhbviS var1,
      XfPecFep61ZBzdk4gspvUeqsHUhhK1lUpLuDIigASeSJxX7FTLbfAamzE80cuvVAUxtYce77SOzCIzTawmktcknHHvZPlMMeaoS1 var2
   ) {
      synchronized (this.BatModClient) {
         this.BatModClient.put("Response", var2);
         this.BatModClient.notifyAll();
      }
   }

   @Override
   public void BatModClient(
      DaQRUcjnGEWAwHApQcUxp4sZeHlGiCcxPfOgJiyjqgSaeICXTGCfcrUpDcBfTQjFv2GBWVbKjwTjGgEbu9k4O9rMM6A1ZhbviS var1, Exception var2
   ) {
      synchronized (this.BatModClient) {
         this.BatModClient.put("Exception", var2);
         this.BatModClient.notifyAll();
      }
   }
}
