public class lLRRbzpiOsrJVJiJYRgYMGteqbw33iRj6nWWtOPLgTLYJBhnBIVAtqFDNTQqBlZ0ITlS80GzIUYjFLhMmKYIbb2tY5qw91igTbfy
   extends gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI
   implements oobbgPu04Z1a1Bb3M8CaBJMc3JhqB9IsHToXd2VsYpcbyuRQvcR4cFnKaSbUBRPYIvIN7rBiwDujZGA7wIJvkjJKmwKy5C3YMLVl {
   public float Spinner;
   public float Checkbox;
   public int ProgressBar;
   private int BatModProgressBar;

   @Override
   public void BatModClient() {
      if (++this.BatModProgressBar % 20 * 4 == 0) {
         this.BatModClient
            .CustomSpinner(
               this.Button,
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0,
               1,
               this.ProgressBar
            );
      }

      this.Checkbox = this.Spinner;
      int var1 = this.Button
         .BatModProgressBar();
      int var2 = this.Button
         .ColorChooser();
      int var3 = this.Button
         .IntegerSpinner();
      float var4 = 0.1F;
      if (this.ProgressBar > 0
         && this.Spinner == 0.0F) {
         double var5 = var1 + 0.5;
         double var7 = var3 + 0.5;
         this.BatModClient
            .BatModClient(
               var5,
               var2 + 0.5,
               var7,
               "random.chestopen",
               0.5F,
               this.BatModClient
                        .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                        .nextFloat()
                     * 0.1F
                  + 0.9F
            );
      }

      if (this.ProgressBar == 0
            && this.Spinner > 0.0F
         || this.ProgressBar > 0
            && this.Spinner < 1.0F) {
         float var11 = this.Spinner;
         if (this.ProgressBar > 0) {
            this.Spinner += var4;
         } else {
            this.Spinner -= var4;
         }

         if (this.Spinner > 1.0F) {
            this.Spinner = 1.0F;
         }

         float var6 = 0.5F;
         if (this.Spinner < var6 && var11 >= var6) {
            double var12 = var1 + 0.5;
            double var9 = var3 + 0.5;
            this.BatModClient
               .BatModClient(
                  var12,
                  var2 + 0.5,
                  var9,
                  "random.chestclosed",
                  0.5F,
                  this.BatModClient
                           .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .nextFloat()
                        * 0.1F
                     + 0.9F
               );
         }

         if (this.Spinner < 0.0F) {
            this.Spinner = 0.0F;
         }
      }
   }

   @Override
   public boolean CustomSpinner(int var1, int var2) {
      if (var1 == 1) {
         this.ProgressBar = var2;
         return true;
      } else {
         return super.CustomSpinner(var1, var2);
      }
   }

   @Override
   public void G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr() {
      this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
      super.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
   }

   public void Button() {
      this.ProgressBar++;
      this.BatModClient
         .CustomSpinner(
            this.Button,
            fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0,
            1,
            this.ProgressBar
         );
   }

   public void CustomSpinner() {
      this.ProgressBar--;
      this.BatModClient
         .CustomSpinner(
            this.Button,
            fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0,
            1,
            this.ProgressBar
         );
   }

   public boolean BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
      return this.BatModClient
               .BatModClient(
                  this.Button
               )
            != this
         ? false
         : var1.Spinner(
               this.Button
                     .BatModProgressBar()
                  + 0.5,
               this.Button
                     .ColorChooser()
                  + 0.5,
               this.Button
                     .IntegerSpinner()
                  + 0.5
            )
            <= 64.0;
   }
}
