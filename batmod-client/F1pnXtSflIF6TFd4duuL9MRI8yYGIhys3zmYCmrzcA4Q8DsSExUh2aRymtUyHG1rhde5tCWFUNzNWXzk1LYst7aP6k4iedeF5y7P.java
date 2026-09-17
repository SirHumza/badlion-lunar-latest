public class F1pnXtSflIF6TFd4duuL9MRI8yYGIhys3zmYCmrzcA4Q8DsSExUh2aRymtUyHG1rhde5tCWFUNzNWXzk1LYst7aP6k4iedeF5y7P {
   private float BatModClient;
   private float Button;
   private float CustomSpinner;

   public float BatModClient(float var1, float var2) {
      this.BatModClient += var1;
      var1 = (
            this.BatModClient
               - this.Button
         )
         * var2;
      this.CustomSpinner = this.CustomSpinner
         + (var1 - this.CustomSpinner) * 0.5F;
      if (var1 > 0.0F && var1 > this.CustomSpinner
         || var1 < 0.0F && var1 < this.CustomSpinner) {
         var1 = this.CustomSpinner;
      }

      this.Button += var1;
      return var1;
   }

   public void BatModClient() {
      this.BatModClient = 0.0F;
      this.Button = 0.0F;
      this.CustomSpinner = 0.0F;
   }
}
