public class sdeSZfIDZjN9OrmsYthk8T3BGBq61hjRQCwXFUeICzyxyYqfbkzjjFDjsZsnrwl7SKdbN4aNECx0ZeqsPpNGwfueeJScESKtVD3z
   extends rCD7WGVYuaDgkyxX5HnTPZPTl19Au1ut70AdWgxLRpbXE7ztuHEXpeI54o8dhdIBdD70MCu42UtZceYA5L1de2Hp9uJ6TulRBQwY {
   private static final int[][] BatModClient = new int[][]{
      {4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}
   };
   private static final int[][] Button = new int[][]{
      {0, 0}, {0, 5}, {0, 14}, {0, 18}
   };
   private static final int CustomSpinner = BatModClient.length;
   private final orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[] ButtonAction = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[CustomSpinner];

   public sdeSZfIDZjN9OrmsYthk8T3BGBq61hjRQCwXFUeICzyxyYqfbkzjjFDjsZsnrwl7SKdbN4aNECx0ZeqsPpNGwfueeJScESKtVD3z() {
      float var1 = -3.5F;

      for (int var2 = 0; var2 < this.ButtonAction.length; var2++) {
         this.ButtonAction[var2] = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this,
            Button[var2][0],
            Button[var2][1]
         );
         this.ButtonAction[var2]
            .BatModClient(
               BatModClient[var2][0] * -0.5F,
               0.0F,
               BatModClient[var2][2] * -0.5F,
               BatModClient[var2][0],
               BatModClient[var2][1],
               BatModClient[var2][2]
            );
         this.ButtonAction[var2]
            .BatModClient(
               0.0F, 24 - BatModClient[var2][1], var1
            );
         if (var2 < this.ButtonAction.length - 1) {
            var1 += (
                  BatModClient[var2][2]
                     + BatModClient[var2 + 1][2]
               )
               * 0.5F;
         }
      }
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

      for (int var8 = 0; var8 < this.ButtonAction.length; var8++) {
         this.ButtonAction[var8]
            .BatModClient(var7);
      }
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
      for (int var8 = 0; var8 < this.ButtonAction.length; var8++) {
         this.ButtonAction[var8].ColorChooser = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
               var3 * 0.9F + var8 * 0.15F * (float) Math.PI
            )
            * (float) Math.PI
            * 0.01F
            * (1 + Math.abs(var8 - 2));
         this.ButtonAction[var8].Spinner = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               var3 * 0.9F + var8 * 0.15F * (float) Math.PI
            )
            * (float) Math.PI
            * 0.1F
            * Math.abs(var8 - 2);
      }
   }
}
