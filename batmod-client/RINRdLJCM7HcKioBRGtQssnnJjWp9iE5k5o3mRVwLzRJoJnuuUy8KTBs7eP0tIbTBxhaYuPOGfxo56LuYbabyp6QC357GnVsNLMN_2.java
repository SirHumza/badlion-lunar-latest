import java.util.Random;

public abstract class zWyqsscBXkVVksBj6mlWjKj9YW6ZWfoh8A1ncPLzXFLaV500yeFKi2pV10F8jxzCSGgfEnzNvnOxst0BIY4bkB1LOnivQ4rZXvn
   extends RINRdLJCM7HcKioBRGtQssnnJjWp9iE5k5o3mRVwLzRJoJnuuUy8KTBs7eP0tIbTBxhaYuPOGfxo56LuYbabyp6QC357GnVsNLMN {
   protected final int BatModClient;
   protected final jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS Button;
   protected final jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS CustomSpinner;
   protected int ButtonAction;

   public zWyqsscBXkVVksBj6mlWjKj9YW6ZWfoh8A1ncPLzXFLaV500yeFKi2pV10F8jxzCSGgfEnzNvnOxst0BIY4bkB1LOnivQ4rZXvn(
      boolean var1,
      int var2,
      int var3,
      jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var4,
      jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var5
   ) {
      super(var1);
      this.BatModClient = var2;
      this.ButtonAction = var3;
      this.Button = var4;
      this.CustomSpinner = var5;
   }

   protected int BatModClient(Random var1) {
      int var2 = var1.nextInt(3) + this.BatModClient;
      if (this.ButtonAction > 1) {
         var2 += var1.nextInt(this.ButtonAction);
      }

      return var2;
   }

   private boolean CustomSpinner(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2,
      int var3
   ) {
      boolean var4 = true;
      if (var2.ColorChooser() >= 1
         && var2.ColorChooser() + var3 + 1 <= 256) {
         for (int var5 = 0; var5 <= 1 + var3; var5++) {
            byte var6 = 2;
            if (var5 == 0) {
               var6 = 1;
            } else if (var5 >= 1 + var3 - 2) {
               var6 = 2;
            }

            for (int var7 = -var6; var7 <= var6 && var4; var7++) {
               for (int var8 = -var6; var8 <= var6 && var4; var8++) {
                  if (var2.ColorChooser() + var5 < 0
                     || var2.ColorChooser() + var5 >= 256
                     || !this.BatModClient(
                        var1.Button(
                              var2.BatModClient(var7, var5, var8)
                           )
                           .CustomSpinner()
                     )) {
                     var4 = false;
                  }
               }
            }
         }

         return var4;
      } else {
         return false;
      }
   }

   private boolean BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2
   ) {
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3 = var1.Button();
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var4 = var2.Button(
            var3
         )
         .CustomSpinner();
      if ((
            var4
                  == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.CustomSpinner
               || var4
                  == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ButtonAction
         )
         && var1.ColorChooser() >= 2) {
         this.BatModClient(var2, var3);
         this.BatModClient(
            var2, var3.Checkbox()
         );
         this.BatModClient(
            var2, var3.ButtonAction()
         );
         this.BatModClient(
            var2,
            var3.ButtonAction()
               .Checkbox()
         );
         return true;
      } else {
         return false;
      }
   }

   protected boolean BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      Random var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3,
      int var4
   ) {
      return this.CustomSpinner(var1, var3, var4)
         && this.BatModClient(var3, var1);
   }

   protected void BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2,
      int var3
   ) {
      int var4 = var3 * var3;

      for (int var5 = -var3; var5 <= var3 + 1; var5++) {
         for (int var6 = -var3; var6 <= var3 + 1; var6++) {
            int var7 = var5 - 1;
            int var8 = var6 - 1;
            if (var5 * var5 + var6 * var6 <= var4
               || var7 * var7 + var8 * var8 <= var4
               || var5 * var5 + var8 * var8 <= var4
               || var7 * var7 + var6 * var6 <= var4) {
               q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var9 = var2.BatModClient(
                  var5, 0, var6
               );
               wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis var10 = var1.Button(
                     var9
                  )
                  .CustomSpinner()
                  .Checkbox();
               if (var10
                     == wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModClient
                  || var10
                     == wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.IntegerSpinner
                  )
                {
                  this.BatModClient(
                     var1, var9, this.CustomSpinner
                  );
               }
            }
         }
      }
   }

   protected void Button(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2,
      int var3
   ) {
      int var4 = var3 * var3;

      for (int var5 = -var3; var5 <= var3; var5++) {
         for (int var6 = -var3; var6 <= var3; var6++) {
            if (var5 * var5 + var6 * var6 <= var4) {
               q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var7 = var2.BatModClient(
                  var5, 0, var6
               );
               wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis var8 = var1.Button(
                     var7
                  )
                  .CustomSpinner()
                  .Checkbox();
               if (var8
                     == wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModClient
                  || var8
                     == wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.IntegerSpinner
                  )
                {
                  this.BatModClient(
                     var1, var7, this.CustomSpinner
                  );
               }
            }
         }
      }
   }
}
