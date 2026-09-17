import java.util.Random;

public class Tt2yxGW5bWVn3eQt0jSSgjcw67poudOVLP5s7S0tgVf1QREcEL3f1Ycfwuf2ILwjoCPODE0ej1Pj8bQ1I5TrBvuJincuXOMdYx7Y
   extends rxkzLwUaDsCsiHvPLtSBAPxUcFTNjpV676qxlV5nRSq8QXIQjKuVJjRCmuaN8kAKlvBoYzvuNMxShotuuoMVN4gsW81BxppkLjRd {
   private c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G BatModClient;

   public Tt2yxGW5bWVn3eQt0jSSgjcw67poudOVLP5s7S0tgVf1QREcEL3f1Ycfwuf2ILwjoCPODE0ej1Pj8bQ1I5TrBvuJincuXOMdYx7Y(
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var1
   ) {
      this.BatModClient = var1;
   }

   @Override
   public boolean BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      Random var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      var3 = var3.BatModClient(-8, 0, -8);

      while (
         var3.ColorChooser() > 5
            && var1.ButtonAction(var3)
      ) {
         var3 = var3.Button();
      }

      if (var3.ColorChooser() <= 4) {
         return false;
      }

      var3 = var3.Button(4);
      boolean[] var4 = new boolean[2048];
      int var5 = var2.nextInt(4) + 4;

      for (int var6 = 0; var6 < var5; var6++) {
         double var7 = var2.nextDouble() * 6.0 + 3.0;
         double var9 = var2.nextDouble() * 4.0 + 2.0;
         double var11 = var2.nextDouble() * 6.0 + 3.0;
         double var13 = var2.nextDouble() * (16.0 - var7 - 2.0) + 1.0 + var7 / 2.0;
         double var15 = var2.nextDouble() * (8.0 - var9 - 4.0) + 2.0 + var9 / 2.0;
         double var17 = var2.nextDouble() * (16.0 - var11 - 2.0) + 1.0 + var11 / 2.0;

         for (int var19 = 1; var19 < 15; var19++) {
            for (int var20 = 1; var20 < 15; var20++) {
               for (int var21 = 1; var21 < 7; var21++) {
                  double var22 = (var19 - var13) / (var7 / 2.0);
                  double var24 = (var21 - var15) / (var9 / 2.0);
                  double var26 = (var20 - var17) / (var11 / 2.0);
                  double var28 = var22 * var22 + var24 * var24 + var26 * var26;
                  if (var28 < 1.0) {
                     var4[(var19 * 16 + var20) * 8 + var21] = true;
                  }
               }
            }
         }
      }

      for (int var32 = 0; var32 < 16; var32++) {
         for (int var37 = 0; var37 < 16; var37++) {
            for (int var8 = 0; var8 < 8; var8++) {
               boolean var46 = !var4[(var32 * 16 + var37) * 8 + var8]
                  && (
                     var32 < 15 && var4[((var32 + 1) * 16 + var37) * 8 + var8]
                        || var32 > 0 && var4[((var32 - 1) * 16 + var37) * 8 + var8]
                        || var37 < 15 && var4[(var32 * 16 + var37 + 1) * 8 + var8]
                        || var37 > 0 && var4[(var32 * 16 + (var37 - 1)) * 8 + var8]
                        || var8 < 7 && var4[(var32 * 16 + var37) * 8 + var8 + 1]
                        || var8 > 0 && var4[(var32 * 16 + var37) * 8 + (var8 - 1)]
                  );
               if (var46) {
                  wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis var10 = var1.Button(
                        var3.BatModClient(var32, var8, var37)
                     )
                     .CustomSpinner()
                     .Checkbox();
                  if (var8 >= 4 && var10.BatModClient()) {
                     return false;
                  }

                  if (var8 < 4
                     && !var10.Button()
                     && var1.Button(
                              var3.BatModClient(var32, var8, var37)
                           )
                           .CustomSpinner()
                        != this.BatModClient) {
                     return false;
                  }
               }
            }
         }
      }

      for (int var33 = 0; var33 < 16; var33++) {
         for (int var38 = 0; var38 < 16; var38++) {
            for (int var42 = 0; var42 < 8; var42++) {
               if (var4[(var33 * 16 + var38) * 8 + var42]) {
                  var1.BatModClient(
                     var3.BatModClient(var33, var42, var38),
                     var42 >= 4
                        ? fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
                           .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
                        : this.BatModClient
                           .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                     2
                  );
               }
            }
         }
      }

      for (int var34 = 0; var34 < 16; var34++) {
         for (int var39 = 0; var39 < 16; var39++) {
            for (int var43 = 4; var43 < 8; var43++) {
               if (var4[(var34 * 16 + var39) * 8 + var43]) {
                  q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var47 = var3.BatModClient(
                     var34, var43 - 1, var39
                  );
                  if (var1.Button(var47)
                           .CustomSpinner()
                        == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ButtonAction
                     && var1.Button(
                           lgztjp9dBcvciD1FcN7oVWuA5AIHGq5lxa5hstirKdlduaseZUrQmocfYXmJQkIEJUX2ooQpWGRxVpintpY086VRD7ZidXbakU1Y.BatModClient,
                           var3.BatModClient(var34, var43, var39)
                        )
                        > 0) {
                     Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF var49 = var1.CustomSpinner(
                        var47
                     );
                     if (var49.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz
                           .CustomSpinner()
                        == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb
                        )
                      {
                        var1.BatModClient(
                           var47,
                           fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb
                              .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                           2
                        );
                     } else {
                        var1.BatModClient(
                           var47,
                           fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.CustomSpinner
                              .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                           2
                        );
                     }
                  }
               }
            }
         }
      }

      if (this.BatModClient
            .Checkbox()
         == wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.ColorChooser
         )
       {
         for (int var35 = 0; var35 < 16; var35++) {
            for (int var40 = 0; var40 < 16; var40++) {
               for (int var44 = 0; var44 < 8; var44++) {
                  boolean var48 = !var4[(var35 * 16 + var40) * 8 + var44]
                     && (
                        var35 < 15 && var4[((var35 + 1) * 16 + var40) * 8 + var44]
                           || var35 > 0 && var4[((var35 - 1) * 16 + var40) * 8 + var44]
                           || var40 < 15 && var4[(var35 * 16 + var40 + 1) * 8 + var44]
                           || var40 > 0 && var4[(var35 * 16 + (var40 - 1)) * 8 + var44]
                           || var44 < 7 && var4[(var35 * 16 + var40) * 8 + var44 + 1]
                           || var44 > 0 && var4[(var35 * 16 + var40) * 8 + (var44 - 1)]
                     );
                  if (var48
                     && (var44 < 4 || var2.nextInt(2) != 0)
                     && var1.Button(
                           var3.BatModClient(var35, var44, var40)
                        )
                        .CustomSpinner()
                        .Checkbox()
                        .Button()) {
                     var1.BatModClient(
                        var3.BatModClient(var35, var44, var40),
                        fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Button
                           .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                        2
                     );
                  }
               }
            }
         }
      }

      if (this.BatModClient
            .Checkbox()
         == wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModProgressBar
         )
       {
         for (int var36 = 0; var36 < 16; var36++) {
            for (int var41 = 0; var41 < 16; var41++) {
               byte var45 = 4;
               if (var1.InstallationLogger(
                  var3.BatModClient(var36, var45, var41)
               )) {
                  var1.BatModClient(
                     var3.BatModClient(var36, var45, var41),
                     fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x
                        .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                     2
                  );
               }
            }
         }
      }

      return true;
   }
}
