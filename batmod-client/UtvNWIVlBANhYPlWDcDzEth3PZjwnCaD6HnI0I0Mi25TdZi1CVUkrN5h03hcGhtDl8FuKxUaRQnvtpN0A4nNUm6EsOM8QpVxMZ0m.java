public class UtvNWIVlBANhYPlWDcDzEth3PZjwnCaD6HnI0I0Mi25TdZi1CVUkrN5h03hcGhtDl8FuKxUaRQnvtpN0A4nNUm6EsOM8QpVxMZ0m {
   public float[] BatModClient;
   public final int Button;

   public UtvNWIVlBANhYPlWDcDzEth3PZjwnCaD6HnI0I0Mi25TdZi1CVUkrN5h03hcGhtDl8FuKxUaRQnvtpN0A4nNUm6EsOM8QpVxMZ0m(float[] var1, int var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public float BatModClient(int var1) {
      if (this.BatModClient == null) {
         throw new NullPointerException("uvs");
      }

      int var2 = this.ButtonAction(var1);
      return var2 != 0 && var2 != 1
         ? this.BatModClient[2]
         : this.BatModClient[0];
   }

   public float Button(int var1) {
      if (this.BatModClient == null) {
         throw new NullPointerException("uvs");
      }

      int var2 = this.ButtonAction(var1);
      return var2 != 0 && var2 != 3
         ? this.BatModClient[3]
         : this.BatModClient[1];
   }

   private int ButtonAction(int var1) {
      return (var1 + this.Button / 90) % 4;
   }

   public int CustomSpinner(int var1) {
      return (var1 + (4 - this.Button / 90)) % 4;
   }

   public void BatModClient(float[] var1) {
      if (this.BatModClient == null) {
         this.BatModClient = var1;
      }
   }
}
