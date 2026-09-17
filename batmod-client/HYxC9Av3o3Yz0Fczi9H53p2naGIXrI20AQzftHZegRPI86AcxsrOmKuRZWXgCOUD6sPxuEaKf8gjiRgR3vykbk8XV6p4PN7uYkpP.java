public class HYxC9Av3o3Yz0Fczi9H53p2naGIXrI20AQzftHZegRPI86AcxsrOmKuRZWXgCOUD6sPxuEaKf8gjiRgR3vykbk8XV6p4PN7uYkpP {
   float BatModClient;
   private double Checkbox;
   public int Button;
   public float CustomSpinner;
   public float ButtonAction = 1.0F;
   public float Spinner;
   private long ProgressBar;
   private long BatModProgressBar;
   private long ColorChooser;
   private double IntegerSpinner = 1.0;

   public HYxC9Av3o3Yz0Fczi9H53p2naGIXrI20AQzftHZegRPI86AcxsrOmKuRZWXgCOUD6sPxuEaKf8gjiRgR3vykbk8XV6p4PN7uYkpP(float var1) {
      this.BatModClient = var1;
      this.ProgressBar = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee();
      this.BatModProgressBar = System.nanoTime() / 1000000L;
   }

   public void BatModClient() {
      long var1 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee();
      long var3 = var1 - this.ProgressBar;
      long var5 = System.nanoTime() / 1000000L;
      double var7 = var5 / 1000.0;
      if (var3 <= 1000L && var3 >= 0L) {
         this.ColorChooser += var3;
         if (this.ColorChooser > 1000L) {
            long var9 = var5 - this.BatModProgressBar;
            double var11 = (double)this.ColorChooser / var9;
            this.IntegerSpinner = this.IntegerSpinner
               + (var11 - this.IntegerSpinner) * 0.2F;
            this.BatModProgressBar = var5;
            this.ColorChooser = 0L;
         }

         if (this.ColorChooser < 0L) {
            this.BatModProgressBar = var5;
         }
      } else {
         this.Checkbox = var7;
      }

      this.ProgressBar = var1;
      double var13 = (var7 - this.Checkbox)
         * this.IntegerSpinner;
      this.Checkbox = var7;
      var13 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var13, 0.0, 1.0
      );
      this.Spinner = (float)(
         this.Spinner
            + var13
               * this.ButtonAction
               * this.BatModClient
      );
      this.Button = (int)this.Spinner;
      this.Spinner = this.Spinner
         - this.Button;
      if (this.Button > 10) {
         this.Button = 10;
      }

      this.CustomSpinner = this.Spinner;
   }
}
