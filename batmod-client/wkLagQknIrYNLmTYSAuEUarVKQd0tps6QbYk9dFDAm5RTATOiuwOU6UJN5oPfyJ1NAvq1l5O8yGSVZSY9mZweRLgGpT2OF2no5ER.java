public class wkLagQknIrYNLmTYSAuEUarVKQd0tps6QbYk9dFDAm5RTATOiuwOU6UJN5oPfyJ1NAvq1l5O8yGSVZSY9mZweRLgGpT2OF2no5ER {
   private final long[] BatModClient = new long[240];
   private int Button;
   private int CustomSpinner;
   private int ButtonAction;

   public void BatModClient(long var1) {
      this.BatModClient[this.ButtonAction] = var1;
      this.ButtonAction++;
      if (this.ButtonAction == 240) {
         this.ButtonAction = 0;
      }

      if (this.CustomSpinner < 240) {
         this.Button = 0;
         this.CustomSpinner++;
      } else {
         this.Button = this.BatModClient(
            this.ButtonAction + 1
         );
      }
   }

   public int BatModClient(long var1, int var3) {
      double var4 = var1 / 1.6666666E7;
      return (int)(var4 * var3);
   }

   public int BatModClient() {
      return this.Button;
   }

   public int Button() {
      return this.ButtonAction;
   }

   public int BatModClient(int var1) {
      return var1 % 240;
   }

   public long[] CustomSpinner() {
      return this.BatModClient;
   }
}
