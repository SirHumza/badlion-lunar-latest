package shadersmod.client;

public class BatModClient {
   private int BatModClient;
   private Umd3g6jjuX9LQ0mgFholTA8SrXI9yt2Xf8JgsaV6ASACwTjY2rWb0Rv2DTNvoOWn2MjziKhWqaqOP8OFj0wysjWuowgbHAqkPZEu[] Button;

   public BatModClient(
      int var1, Umd3g6jjuX9LQ0mgFholTA8SrXI9yt2Xf8JgsaV6ASACwTjY2rWb0Rv2DTNvoOWn2MjziKhWqaqOP8OFj0wysjWuowgbHAqkPZEu[] var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public boolean BatModClient(int var1, int var2) {
      for (int var3 = 0; var3 < this.Button.length; var3++) {
         Umd3g6jjuX9LQ0mgFholTA8SrXI9yt2Xf8JgsaV6ASACwTjY2rWb0Rv2DTNvoOWn2MjziKhWqaqOP8OFj0wysjWuowgbHAqkPZEu var4 = this.Button[var3];
         if (var4.BatModClient(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public int[] Button() {
      int[] var1 = new int[this.Button.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = this.Button[var2]
            .BatModClient();
      }

      return var1;
   }
}
