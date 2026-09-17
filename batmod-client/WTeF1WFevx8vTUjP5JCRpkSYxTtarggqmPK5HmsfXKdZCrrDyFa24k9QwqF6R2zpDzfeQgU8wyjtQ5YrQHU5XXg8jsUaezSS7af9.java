public class WTeF1WFevx8vTUjP5JCRpkSYxTtarggqmPK5HmsfXKdZCrrDyFa24k9QwqF6R2zpDzfeQgU8wyjtQ5YrQHU5XXg8jsUaezSS7af9
   extends rCD7WGVYuaDgkyxX5HnTPZPTl19Au1ut70AdWgxLRpbXE7ztuHEXpeI54o8dhdIBdD70MCu42UtZceYA5L1de2Hp9uJ6TulRBQwY {
   private orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[] BatModClient = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[7];
   private orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[] Button;
   private float[] CustomSpinner = new float[7];
   private static final int[][] ButtonAction = new int[][]{
      {3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}
   };
   private static final int[][] Spinner = new int[][]{
      {0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}
   };

   public WTeF1WFevx8vTUjP5JCRpkSYxTtarggqmPK5HmsfXKdZCrrDyFa24k9QwqF6R2zpDzfeQgU8wyjtQ5YrQHU5XXg8jsUaezSS7af9() {
      float var1 = -3.5F;

      for (int var2 = 0; var2 < this.BatModClient.length; var2++) {
         this.BatModClient[var2] = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this,
            Spinner[var2][0],
            Spinner[var2][1]
         );
         this.BatModClient[var2]
            .BatModClient(
               ButtonAction[var2][0] * -0.5F,
               0.0F,
               ButtonAction[var2][2] * -0.5F,
               ButtonAction[var2][0],
               ButtonAction[var2][1],
               ButtonAction[var2][2]
            );
         this.BatModClient[var2]
            .BatModClient(
               0.0F, 24 - ButtonAction[var2][1], var1
            );
         this.CustomSpinner[var2] = var1;
         if (var2 < this.BatModClient.length - 1) {
            var1 += (
                  ButtonAction[var2][2]
                     + ButtonAction[var2 + 1][2]
               )
               * 0.5F;
         }
      }

      this.Button = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[3];
      this.Button[0] = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
         this, 20, 0
      );
      this.Button[0]
         .BatModClient(
            -5.0F,
            0.0F,
            ButtonAction[2][2] * -0.5F,
            10,
            8,
            ButtonAction[2][2]
         );
      this.Button[0]
         .BatModClient(
            0.0F, 16.0F, this.CustomSpinner[2]
         );
      this.Button[1] = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
         this, 20, 11
      );
      this.Button[1]
         .BatModClient(
            -3.0F,
            0.0F,
            ButtonAction[4][2] * -0.5F,
            6,
            4,
            ButtonAction[4][2]
         );
      this.Button[1]
         .BatModClient(
            0.0F, 20.0F, this.CustomSpinner[4]
         );
      this.Button[2] = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
         this, 20, 18
      );
      this.Button[2]
         .BatModClient(
            -3.0F,
            0.0F,
            ButtonAction[4][2] * -0.5F,
            6,
            5,
            ButtonAction[1][2]
         );
      this.Button[2]
         .BatModClient(
            0.0F, 19.0F, this.CustomSpinner[1]
         );
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

      for (int var8 = 0; var8 < this.BatModClient.length; var8++) {
         this.BatModClient[var8]
            .BatModClient(var7);
      }

      for (int var9 = 0; var9 < this.Button.length; var9++) {
         this.Button[var9]
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
      for (int var8 = 0; var8 < this.BatModClient.length; var8++) {
         this.BatModClient[var8].ColorChooser = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
               var3 * 0.9F + var8 * 0.15F * (float) Math.PI
            )
            * (float) Math.PI
            * 0.05F
            * (1 + Math.abs(var8 - 2));
         this.BatModClient[var8].Spinner = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               var3 * 0.9F + var8 * 0.15F * (float) Math.PI
            )
            * (float) Math.PI
            * 0.2F
            * Math.abs(var8 - 2);
      }

      this.Button[0].ColorChooser = this.BatModClient[2]
         .ColorChooser;
      this.Button[1].ColorChooser = this.BatModClient[4]
         .ColorChooser;
      this.Button[1].Spinner = this.BatModClient[4]
         .Spinner;
      this.Button[2].ColorChooser = this.BatModClient[1]
         .ColorChooser;
      this.Button[2].Spinner = this.BatModClient[1]
         .Spinner;
   }
}
