import java.util.Random;

public class JnkNmJHwXcE8RQeRBWvlzXs1e5PK3WJDyuIPgU2QfEGRjtkTSsHmpCbAmkSoqRX0B6aXTZN7Cv4OHVfxtj8BrbA6Aix5A98lY9uB
   extends jkYi7hkCQaHBMkKA7QEQmtjUnlsH2cwUoAUHHWA1iNnWc8aejyZGqr8KVgznAymE5pM3UlsAlWeHvpsePpzP3IztKwj3f6Kz4f5L {
   protected void BatModClient(
      long var1,
      int var3,
      int var4,
      Z7u3kXmE1Z1La5wuW43LvM3MqXi2h2heVDrb5yErQvVFes5dvNjvuTD4vtNVaxJ74kxMHODIIL6qJ5Q6XSDm9TINzbpL91BffMM7 var5,
      double var6,
      double var8,
      double var10
   ) {
      this.BatModClient(
         var1,
         var3,
         var4,
         var5,
         var6,
         var8,
         var10,
         1.0F + this.Button.nextFloat() * 6.0F,
         0.0F,
         0.0F,
         -1,
         -1,
         0.5
      );
   }

   protected void BatModClient(
      long var1,
      int var3,
      int var4,
      Z7u3kXmE1Z1La5wuW43LvM3MqXi2h2heVDrb5yErQvVFes5dvNjvuTD4vtNVaxJ74kxMHODIIL6qJ5Q6XSDm9TINzbpL91BffMM7 var5,
      double var6,
      double var8,
      double var10,
      float var12,
      float var13,
      float var14,
      int var15,
      int var16,
      double var17
   ) {
      double var19 = var3 * 16 + 8;
      double var21 = var4 * 16 + 8;
      float var23 = 0.0F;
      float var24 = 0.0F;
      Random var25 = new Random(var1);
      if (var16 <= 0) {
         int var26 = this.BatModClient * 16 - 16;
         var16 = var26 - var25.nextInt(var26 / 4);
      }

      boolean var63 = false;
      if (var15 == -1) {
         var15 = var16 / 2;
         var63 = true;
      }

      int var27 = var25.nextInt(var16 / 2) + var16 / 4;
      boolean var28 = var25.nextInt(6) == 0;

      while (var15 < var16) {
         double var29 = 1.5
            + u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                  var15 * (float) Math.PI / var16
               )
               * var12
               * 1.0F;
         double var31 = var29 * var17;
         float var33 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
            var14
         );
         float var34 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            var14
         );
         var6 += u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
               var13
            )
            * var33;
         var8 += var34;
         var10 += u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               var13
            )
            * var33;
         if (var28) {
            var14 *= 0.92F;
         } else {
            var14 *= 0.7F;
         }

         var14 += var24 * 0.1F;
         var13 += var23 * 0.1F;
         var24 *= 0.9F;
         var23 *= 0.75F;
         var24 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 2.0F;
         var23 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 4.0F;
         if (!var63 && var15 == var27 && var12 > 1.0F) {
            this.BatModClient(
               var25.nextLong(),
               var3,
               var4,
               var5,
               var6,
               var8,
               var10,
               var25.nextFloat() * 0.5F + 0.5F,
               var13 - (float) (Math.PI / 2),
               var14 / 3.0F,
               var15,
               var16,
               1.0
            );
            this.BatModClient(
               var25.nextLong(),
               var3,
               var4,
               var5,
               var6,
               var8,
               var10,
               var25.nextFloat() * 0.5F + 0.5F,
               var13 + (float) (Math.PI / 2),
               var14 / 3.0F,
               var15,
               var16,
               1.0
            );
            return;
         }

         if (var63 || var25.nextInt(4) != 0) {
            double var35 = var6 - var19;
            double var37 = var10 - var21;
            double var39 = var16 - var15;
            double var41 = var12 + 2.0F + 16.0F;
            if (var35 * var35 + var37 * var37 - var39 * var39 > var41 * var41) {
               return;
            }

            if (var6 >= var19 - 16.0 - var29 * 2.0
               && var10 >= var21 - 16.0 - var29 * 2.0
               && var6 <= var19 + 16.0 + var29 * 2.0
               && var10 <= var21 + 16.0 + var29 * 2.0) {
               int var43 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                     var6 - var29
                  )
                  - var3 * 16
                  - 1;
               int var44 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                     var6 + var29
                  )
                  - var3 * 16
                  + 1;
               int var45 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                     var8 - var31
                  )
                  - 1;
               int var46 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                     var8 + var31
                  )
                  + 1;
               int var47 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                     var10 - var29
                  )
                  - var4 * 16
                  - 1;
               int var48 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                     var10 + var29
                  )
                  - var4 * 16
                  + 1;
               if (var43 < 0) {
                  var43 = 0;
               }

               if (var44 > 16) {
                  var44 = 16;
               }

               if (var45 < 1) {
                  var45 = 1;
               }

               if (var46 > 120) {
                  var46 = 120;
               }

               if (var47 < 0) {
                  var47 = 0;
               }

               if (var48 > 16) {
                  var48 = 16;
               }

               boolean var49 = false;

               for (int var50 = var43; !var49 && var50 < var44; var50++) {
                  for (int var51 = var47; !var49 && var51 < var48; var51++) {
                     for (int var52 = var46 + 1; !var49 && var52 >= var45 - 1; var52--) {
                        if (var52 >= 0 && var52 < 128) {
                           jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var53 = var5.BatModClient(
                              var50, var52, var51
                           );
                           if (var53.CustomSpinner()
                                 == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.TextField
                              || var53.CustomSpinner()
                                 == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ColorTextPane
                              )
                            {
                              var49 = true;
                           }

                           if (var52 != var45 - 1 && var50 != var43 && var50 != var44 - 1 && var51 != var47 && var51 != var48 - 1) {
                              var52 = var45;
                           }
                        }
                     }
                  }
               }

               if (!var49) {
                  for (int var64 = var43; var64 < var44; var64++) {
                     double var65 = (var64 + var3 * 16 + 0.5 - var6) / var29;

                     for (int var66 = var47; var66 < var48; var66++) {
                        double var54 = (var66 + var4 * 16 + 0.5 - var10) / var29;

                        for (int var56 = var46; var56 > var45; var56--) {
                           double var57 = (var56 - 1 + 0.5 - var8) / var31;
                           if (var57 > -0.7 && var65 * var65 + var57 * var57 + var54 * var54 < 1.0) {
                              jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var59 = var5.BatModClient(
                                 var64, var56, var66
                              );
                              if (var59.CustomSpinner()
                                    == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
                                 || var59.CustomSpinner()
                                    == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ButtonAction
                                 || var59.CustomSpinner()
                                    == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.CustomSpinner
                                 )
                               {
                                 var5.BatModClient(
                                    var64,
                                    var56,
                                    var66,
                                    fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
                                       .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
                                 );
                              }
                           }
                        }
                     }
                  }

                  if (var63) {
                     break;
                  }
               }
            }
         }

         var15++;
      }
   }

   @Override
   protected void BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      int var2,
      int var3,
      int var4,
      int var5,
      Z7u3kXmE1Z1La5wuW43LvM3MqXi2h2heVDrb5yErQvVFes5dvNjvuTD4vtNVaxJ74kxMHODIIL6qJ5Q6XSDm9TINzbpL91BffMM7 var6
   ) {
      int var7 = this.Button
         .nextInt(
            this.Button
                  .nextInt(this.Button.nextInt(10) + 1)
               + 1
         );
      if (this.Button.nextInt(5) != 0) {
         var7 = 0;
      }

      for (int var8 = 0; var8 < var7; var8++) {
         double var9 = var2 * 16 + this.Button.nextInt(16);
         double var11 = this.Button.nextInt(128);
         double var13 = var3 * 16 + this.Button.nextInt(16);
         int var15 = 1;
         if (this.Button.nextInt(4) == 0) {
            this.BatModClient(
               this.Button.nextLong(),
               var4,
               var5,
               var6,
               var9,
               var11,
               var13
            );
            var15 += this.Button.nextInt(4);
         }

         for (int var16 = 0; var16 < var15; var16++) {
            float var17 = this.Button.nextFloat()
               * (float) Math.PI
               * 2.0F;
            float var18 = (this.Button.nextFloat() - 0.5F)
               * 2.0F
               / 8.0F;
            float var19 = this.Button.nextFloat() * 2.0F
               + this.Button.nextFloat();
            this.BatModClient(
               this.Button.nextLong(),
               var4,
               var5,
               var6,
               var9,
               var11,
               var13,
               var19 * 2.0F,
               var17,
               var18,
               0,
               0,
               0.5
            );
         }
      }
   }
}
