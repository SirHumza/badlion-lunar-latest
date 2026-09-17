public class P2t1NfVsnzf3eniHIDzpifseu6TR0bPWQuxWiR6qEOOuPnajMJeTQK7cKzJHIHMnhggxDIQObc5FliNjy3vxSaa9W3d0xATpUVO
   extends rCD7WGVYuaDgkyxX5HnTPZPTl19Au1ut70AdWgxLRpbXE7ztuHEXpeI54o8dhdIBdD70MCu42UtZceYA5L1de2Hp9uJ6TulRBQwY {
   orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[] BatModClient = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ[8];
   orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ Button;

   public P2t1NfVsnzf3eniHIDzpifseu6TR0bPWQuxWiR6qEOOuPnajMJeTQK7cKzJHIHMnhggxDIQObc5FliNjy3vxSaa9W3d0xATpUVO() {
      for (int var1 = 0; var1 < this.BatModClient.length; var1++) {
         byte var2 = 0;
         int var3 = var1;
         if (var1 == 2) {
            var2 = 24;
            var3 = 10;
         } else if (var1 == 3) {
            var2 = 24;
            var3 = 19;
         }

         this.BatModClient[var1] = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
            this, var2, var3
         );
         this.BatModClient[var1]
            .BatModClient(-4.0F, 16 + var1, -4.0F, 8, 1, 8);
      }

      this.Button = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
         this, 0, 16
      );
      this.Button
         .BatModClient(-2.0F, 18.0F, -2.0F, 4, 4, 4);
   }

   @Override
   public void BatModClient(
      B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R var1, float var2, float var3, float var4
   ) {
      b64xbqZjhUYRV0gMdQpw44fILJIOaE00NwRFjS0hU45rlk9xFruH7UoCuIPqsl1cRxh0Baf7Q0vdbdAbQvmGOjkudX3Xio0eAdD var5 = (b64xbqZjhUYRV0gMdQpw44fILJIOaE00NwRFjS0hU45rlk9xFruH7UoCuIPqsl1cRxh0Baf7Q0vdbdAbQvmGOjkudX3Xio0eAdD)var1;
      float var6 = var5.CustomSpinner
         + (
               var5.Button
                  - var5.CustomSpinner
            )
            * var4;
      if (var6 < 0.0F) {
         var6 = 0.0F;
      }

      for (int var7 = 0; var7 < this.BatModClient.length; var7++) {
         this.BatModClient[var7].Checkbox = -(
               4 - var7
            )
            * var6
            * 1.7F;
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
      this.Button
         .BatModClient(var7);

      for (int var8 = 0; var8 < this.BatModClient.length; var8++) {
         this.BatModClient[var8]
            .BatModClient(var7);
      }
   }
}
