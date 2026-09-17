public class wKCPqLPImXYtiE13lG0Cod0XmmsyQ2M1QxnZpOjg2DDZ7fj0YjRiQPCsJ1Q9jev8pQg7Ti1N2qQcrr414RL9y0BY5Hmmkll3nXFv
   extends rCD7WGVYuaDgkyxX5HnTPZPTl19Au1ut70AdWgxLRpbXE7ztuHEXpeI54o8dhdIBdD70MCu42UtZceYA5L1de2Hp9uJ6TulRBQwY {
   public orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ BatModClient;
   public orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ Button;
   public orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ CustomSpinner;
   public orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ ButtonAction;
   public orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ Spinner;

   public wKCPqLPImXYtiE13lG0Cod0XmmsyQ2M1QxnZpOjg2DDZ7fj0YjRiQPCsJ1Q9jev8pQg7Ti1N2qQcrr414RL9y0BY5Hmmkll3nXFv() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.CustomSpinner = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this, 0, 0
         )
         .Button(64, 64);
      this.CustomSpinner
         .BatModClient(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.CustomSpinner
         .BatModClient(0.0F, 0.0F + var1, 0.0F);
      this.ButtonAction = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this, 32, 0
         )
         .Button(64, 64);
      this.ButtonAction
         .BatModClient(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.ButtonAction
         .BatModClient(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.Spinner = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this, 32, 0
         )
         .Button(64, 64);
      this.Spinner
         .BatModClient(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.Spinner
         .BatModClient(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.BatModClient = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this, 0, 16
         )
         .Button(64, 64);
      this.BatModClient
         .BatModClient(-5.0F, -10.0F, -5.0F, 10, 10, 10, var2 - 0.5F);
      this.BatModClient
         .BatModClient(0.0F, 0.0F + var1 + 9.0F, 0.0F);
      this.Button = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this, 0, 36
         )
         .Button(64, 64);
      this.Button
         .BatModClient(-6.0F, -12.0F, -6.0F, 12, 12, 12, var2 - 0.5F);
      this.Button
         .BatModClient(0.0F, 0.0F + var1 + 20.0F, 0.0F);
   }

   @Override
   public void BatModClient(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var7
   ) {
      super.BatModClient(var1, var2, var3, var4, var5, var6, var7);
      this.CustomSpinner.ColorChooser = var4
         / (180.0F / (float)Math.PI);
      this.CustomSpinner.BatModProgressBar = var5
         / (180.0F / (float)Math.PI);
      this.BatModClient.ColorChooser = var4
         / (180.0F / (float)Math.PI)
         * 0.25F;
      float var8 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         this.BatModClient.ColorChooser
      );
      float var9 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
         this.BatModClient.ColorChooser
      );
      this.ButtonAction.IntegerSpinner = 1.0F;
      this.Spinner.IntegerSpinner = -1.0F;
      this.ButtonAction.ColorChooser = 0.0F
         + this.BatModClient.ColorChooser;
      this.Spinner.ColorChooser = (float) Math.PI
         + this.BatModClient.ColorChooser;
      this.ButtonAction.Spinner = var9
         * 5.0F;
      this.ButtonAction.ProgressBar = -var8
         * 5.0F;
      this.Spinner.Spinner = -var9
         * 5.0F;
      this.Spinner.ProgressBar = var8
         * 5.0F;
   }

   @Override
   public void BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7
   ) {
      this.BatModClient(var2, var3, var4, var5, var6, var7, var1);
      this.BatModClient
         .BatModClient(var7);
      this.Button
         .BatModClient(var7);
      this.CustomSpinner
         .BatModClient(var7);
      this.ButtonAction
         .BatModClient(var7);
      this.Spinner
         .BatModClient(var7);
   }
}
