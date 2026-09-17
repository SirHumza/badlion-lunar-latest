import java.util.Random;

public class Ez3lVpHdG9PqIxKqSTxqNmaI9fGkKPPXoJ7XzJF2yafPxIkHsQcVrSWnKP82iAm2gUGSLJCqgJ1SBCR0g21nfi7DTSDBegMkeasV
   extends rxkzLwUaDsCsiHvPLtSBAPxUcFTNjpV676qxlV5nRSq8QXIQjKuVJjRCmuaN8kAKlvBoYzvuNMxShotuuoMVN4gsW81BxppkLjRd {
   private final c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G BatModClient;
   private final int Button;

   public Ez3lVpHdG9PqIxKqSTxqNmaI9fGkKPPXoJ7XzJF2yafPxIkHsQcVrSWnKP82iAm2gUGSLJCqgJ1SBCR0g21nfi7DTSDBegMkeasV(
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var1, int var2
   ) {
      super(false);
      this.BatModClient = var1;
      this.Button = var2;
   }

   @Override
   public boolean BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      Random var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      while (true) {
         label50: {
            if (var3.ColorChooser() > 3) {
               if (var1.ButtonAction(
                  var3.Button()
               )) {
                  break label50;
               }

               c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var4 = var1.Button(
                     var3.Button()
                  )
                  .CustomSpinner();
               if (var4
                     != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.CustomSpinner
                  && var4
                     != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ButtonAction
                  && var4
                     != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Button
                  )
                {
                  break label50;
               }
            }

            if (var3.ColorChooser() <= 3) {
               return false;
            }

            int var12 = this.Button;

            for (int var5 = 0; var12 >= 0 && var5 < 3; var5++) {
               int var6 = var12 + var2.nextInt(2);
               int var7 = var12 + var2.nextInt(2);
               int var8 = var12 + var2.nextInt(2);
               float var9 = (var6 + var7 + var8) * 0.333F + 0.5F;

               for (q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var11 : q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW.BatModClient(
                  var3.BatModClient(-var6, -var7, -var8),
                  var3.BatModClient(var6, var7, var8)
               )) {
                  if (var11.Checkbox(var3) <= var9 * var9) {
                     var1.BatModClient(
                        var11,
                        this.BatModClient
                           .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                        4
                     );
                  }
               }

               var3 = var3.BatModClient(
                  -(var12 + 1) + var2.nextInt(2 + var12 * 2), 0 - var2.nextInt(2), -(var12 + 1) + var2.nextInt(2 + var12 * 2)
               );
            }

            return true;
         }

         var3 = var3.Button();
      }
   }
}
