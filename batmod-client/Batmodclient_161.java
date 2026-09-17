public class Umd3g6jjuX9LQ0mgFholTA8SrXI9yt2Xf8JgsaV6ASACwTjY2rWb0Rv2DTNvoOWn2MjziKhWqaqOP8OFj0wysjWuowgbHAqkPZEu {
   private int BatModClient = -1;
   private int[] Button = null;

   public Umd3g6jjuX9LQ0mgFholTA8SrXI9yt2Xf8JgsaV6ASACwTjY2rWb0Rv2DTNvoOWn2MjziKhWqaqOP8OFj0wysjWuowgbHAqkPZEu(int var1) {
      this.BatModClient = var1;
   }

   public Umd3g6jjuX9LQ0mgFholTA8SrXI9yt2Xf8JgsaV6ASACwTjY2rWb0Rv2DTNvoOWn2MjziKhWqaqOP8OFj0wysjWuowgbHAqkPZEu(int var1, int var2) {
      this.BatModClient = var1;
      if (var2 >= 0 && var2 <= 15) {
         this.Button = new int[]{var2};
      }
   }

   public Umd3g6jjuX9LQ0mgFholTA8SrXI9yt2Xf8JgsaV6ASACwTjY2rWb0Rv2DTNvoOWn2MjziKhWqaqOP8OFj0wysjWuowgbHAqkPZEu(int var1, int[] var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public int[] Button() {
      return this.Button;
   }

   public boolean BatModClient(
      v8mSf68oadPo4sAYUwPQVkNjNQIAXfFzUrQ51Ir4NLv3s9MrO3arF75RO8yO6PKKGPzEaG09zKtfLZ4eLKQS0MGmpHRe6KMV0Ijo var1
   ) {
      return var1.ButtonAction()
            != this.BatModClient
         ? false
         : dh3T0KbGnQUsnOLSGmyurT1o1oylcPpHqsD79GLZsrSiWN79iFiQSA6v94v8zZ1IA40vBWfKAfDGTb6EMNNDbsP05Q5L5ztKHCf.BatModClient(
            var1.Checkbox(),
            this.Button
         );
   }

   public boolean BatModClient(int var1, int var2) {
      return var1 != this.BatModClient
         ? false
         : dh3T0KbGnQUsnOLSGmyurT1o1oylcPpHqsD79GLZsrSiWN79iFiQSA6v94v8zZ1IA40vBWfKAfDGTb6EMNNDbsP05Q5L5ztKHCf.BatModClient(
            var2, this.Button
         );
   }

   public void BatModClient(int var1) {
      if (this.Button != null && var1 >= 0 && var1 <= 15) {
         for (int var2 = 0; var2 < this.Button.length; var2++) {
            if (this.Button[var2] == var1) {
               return;
            }
         }

         this.Button = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            this.Button, var1
         );
      }
   }

   @Override
   public String toString() {
      return ""
         + this.BatModClient
         + ":"
         + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            this.Button
         );
   }
}
