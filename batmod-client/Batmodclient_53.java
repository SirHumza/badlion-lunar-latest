public class KLzHb41jorJ4kU8vR13aMG2VqPrDEOFEr2BD4pRMuHE9S8hcotZVbArX1CKyGxvpb0vLLzJTMzWKKX2bwuOu8s3Tqp6eTn8fkY8M
   extends rCD7WGVYuaDgkyxX5HnTPZPTl19Au1ut70AdWgxLRpbXE7ztuHEXpeI54o8dhdIBdD70MCu42UtZceYA5L1de2Hp9uJ6TulRBQwY {
   orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ BatModClient;
   orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[] Button = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[8];

   public KLzHb41jorJ4kU8vR13aMG2VqPrDEOFEr2BD4pRMuHE9S8hcotZVbArX1CKyGxvpb0vLLzJTMzWKKX2bwuOu8s3Tqp6eTn8fkY8M() {
      byte var1 = -16;
      this.BatModClient = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
         this, 0, 0
      );
      this.BatModClient
         .BatModClient(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      this.BatModClient.Checkbox += 24
         + var1;

      for (int var2 = 0; var2 < this.Button.length; var2++) {
         this.Button[var2] = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this, 48, 0
         );
         double var3 = var2 * Math.PI * 2.0 / this.Button.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.Button[var2]
            .BatModClient(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this.Button[var2].Spinner = var5;
         this.Button[var2].ProgressBar = var6;
         this.Button[var2].Checkbox = 31
            + var1;
         var3 = var2 * Math.PI * -2.0 / this.Button.length
            + (Math.PI / 2);
         this.Button[var2].ColorChooser = (float)var3;
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
      for (orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ var11 : this.Button) {
         var11.BatModProgressBar = var3;
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
      this.BatModClient
         .BatModClient(var7);

      for (int var8 = 0; var8 < this.Button.length; var8++) {
         this.Button[var8]
            .BatModClient(var7);
      }
   }
}
