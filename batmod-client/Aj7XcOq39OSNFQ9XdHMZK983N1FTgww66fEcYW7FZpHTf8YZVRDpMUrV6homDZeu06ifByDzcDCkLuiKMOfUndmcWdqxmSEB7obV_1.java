public class z0TJLEHX7omRjCmvAmmtLMv7fm6Yt8yPRNxpnN5fjQvJQ4hZqy3denKVy07pKsTYKGLvhfZdInlWiptDeWlvEG8H0PtsNDkHi1iC
   extends Aj7XcOq39OSNFQ9XdHMZK983N1FTgww66fEcYW7FZpHTf8YZVRDpMUrV6homDZeu06ifByDzcDCkLuiKMOfUndmcWdqxmSEB7obV {
   private r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr BatModClient;

   public z0TJLEHX7omRjCmvAmmtLMv7fm6Yt8yPRNxpnN5fjQvJQ4hZqy3denKVy07pKsTYKGLvhfZdInlWiptDeWlvEG8H0PtsNDkHi1iC(
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var1,
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var2
   ) {
      this.BatModClient = var2;

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var4 = 0; var4 < 3; var4++) {
            this.Button(
               new YNLbbz3aNwzJav2qftVi7oiYbQPybaxVPXJK9Lnu6WBAf4WXjDxIrXrSWEXRURLHTxAQz1iYLyG2V9JX0g6e3jgsfWeuBY3QnlA(
                  var2, var4 + var3 * 3, 62 + var4 * 18, 17 + var3 * 18
               )
            );
         }
      }

      for (int var5 = 0; var5 < 3; var5++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.Button(
               new YNLbbz3aNwzJav2qftVi7oiYbQPybaxVPXJK9Lnu6WBAf4WXjDxIrXrSWEXRURLHTxAQz1iYLyG2V9JX0g6e3jgsfWeuBY3QnlA(
                  var1, var7 + var5 * 9 + 9, 8 + var7 * 18, 84 + var5 * 18
               )
            );
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.Button(
            new YNLbbz3aNwzJav2qftVi7oiYbQPybaxVPXJK9Lnu6WBAf4WXjDxIrXrSWEXRURLHTxAQz1iYLyG2V9JX0g6e3jgsfWeuBY3QnlA(var1, var6, 8 + var6 * 18, 142)
         );
      }
   }

   @Override
   public boolean BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
      return this.BatModClient
         .ButtonAction(var1);
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1, int var2
   ) {
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3 = null;
      YNLbbz3aNwzJav2qftVi7oiYbQPybaxVPXJK9Lnu6WBAf4WXjDxIrXrSWEXRURLHTxAQz1iYLyG2V9JX0g6e3jgsfWeuBY3QnlA var4 = (YNLbbz3aNwzJav2qftVi7oiYbQPybaxVPXJK9Lnu6WBAf4WXjDxIrXrSWEXRURLHTxAQz1iYLyG2V9JX0g6e3jgsfWeuBY3QnlA)this.CustomSpinner
         .get(var2);
      if (var4 != null && var4.Button()) {
         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var5 = var4.BatModClient();
         var3 = var5.IntegerSpinner();
         if (var2 < 9) {
            if (!this.BatModClient(var5, 9, 45, true)) {
               return null;
            }
         } else if (!this.BatModClient(var5, 0, 9, false)) {
            return null;
         }

         if (var5.Button == 0) {
            var4.Button(
               (k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65)null
            );
         } else {
            var4.CustomSpinner();
         }

         if (var5.Button
            == var3.Button) {
            return null;
         }

         var4.BatModClient(var1, var5);
      }

      return var3;
   }
}
