public class hBKdaG1lOR0unJKfEjlPLMJFN7u4dJRJR5WHR73oJQfLgf2JltC3ewvIDNrpUnqLJxddUNL96AlyMnp9jJNT26rz9gGmguHdKUmq {
   private xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY BatModClient;
   private boolean Button;
   private int CustomSpinner = -1;
   private int ButtonAction;
   private int Spinner;
   private J1vbbYEDRq7xxA0fG56PRdEolwRqaCkDvrcH3i8ntXQE1AQDHdQRssoSIiIgWjmMrOulCdsxBV8Jjp98h98eNlbCs2QMhXMYOpEW Checkbox;
   private int ProgressBar;
   private int BatModProgressBar;
   private int ColorChooser;

   public hBKdaG1lOR0unJKfEjlPLMJFN7u4dJRJR5WHR73oJQfLgf2JltC3ewvIDNrpUnqLJxddUNL96AlyMnp9jJNT26rz9gGmguHdKUmq(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1
   ) {
      this.BatModClient = var1;
   }

   public void BatModClient() {
      if (this.BatModClient
         .ColorTextPane()) {
         this.CustomSpinner = 0;
      } else if (this.CustomSpinner != 2) {
         if (this.CustomSpinner == 0) {
            float var1 = this.BatModClient
               .CustomSpinner(0.0F);
            if (var1 < 0.5 || var1 > 0.501) {
               return;
            }

            this.CustomSpinner = this.BatModClient
                     .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                     .nextInt(10)
                  == 0
               ? 1
               : 2;
            this.Button = false;
            if (this.CustomSpinner == 2) {
               return;
            }
         }

         if (this.CustomSpinner != -1) {
            if (!this.Button) {
               if (!this.Button()) {
                  return;
               }

               this.Button = true;
            }

            if (this.Spinner > 0) {
               this.Spinner--;
            } else {
               this.Spinner = 2;
               if (this.ButtonAction > 0) {
                  this.CustomSpinner();
                  this.ButtonAction--;
               } else {
                  this.CustomSpinner = 2;
               }
            }
         }
      }
   }

   private boolean Button() {
      for (EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var3 : this.BatModClient
         .Checkbox) {
         if (!var3.e_()) {
            this.Checkbox = this.BatModClient
               .fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i()
               .BatModClient(
                  new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var3), 1
               );
            if (this.Checkbox != null
               && this.Checkbox
                     .CustomSpinner()
                  >= 10
               && this.Checkbox
                     .ButtonAction()
                  >= 20
               && this.Checkbox
                     .Spinner()
                  >= 20) {
               q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = this.Checkbox
                  .BatModClient();
               float var5 = this.Checkbox
                  .Button();
               boolean var6 = false;

               for (int var7 = 0; var7 < 10; var7++) {
                  float var8 = this.BatModClient
                        .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                        .nextFloat()
                     * (float) Math.PI
                     * 2.0F;
                  this.ProgressBar = var4.BatModProgressBar()
                     + (int)(
                        u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
                                 var8
                              )
                              * var5
                           * 0.9
                     );
                  this.BatModProgressBar = var4.ColorChooser();
                  this.ColorChooser = var4.IntegerSpinner()
                     + (int)(
                        u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                                 var8
                              )
                              * var5
                           * 0.9
                     );
                  var6 = false;

                  for (J1vbbYEDRq7xxA0fG56PRdEolwRqaCkDvrcH3i8ntXQE1AQDHdQRssoSIiIgWjmMrOulCdsxBV8Jjp98h98eNlbCs2QMhXMYOpEW var10 : this.BatModClient
                     .fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i()
                     .Button()) {
                     if (var10 != this.Checkbox
                        && var10.BatModClient(
                           new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                              this.ProgressBar,
                              this.BatModProgressBar,
                              this.ColorChooser
                           )
                        )) {
                        var6 = true;
                        break;
                     }
                  }

                  if (!var6) {
                     break;
                  }
               }

               if (var6) {
                  return false;
               }

               qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var11 = this.BatModClient(
                  new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                     this.ProgressBar,
                     this.BatModProgressBar,
                     this.ColorChooser
                  )
               );
               if (var11 != null) {
                  this.Spinner = 0;
                  this.ButtonAction = 20;
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean CustomSpinner() {
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1 = this.BatModClient(
         new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
            this.ProgressBar,
            this.BatModProgressBar,
            this.ColorChooser
         )
      );
      if (var1 == null) {
         return false;
      }

      MIWxKURrOycNXaNQiOPEjNZ6xHTLN1iWHpRt9mblPuCmp0CQOn0CEP2i0bqz1ChpmERPsFvv4Z0W5d08jeP0hSsknhqdhQEMyzAD var2;
      try {
         var2 = new MIWxKURrOycNXaNQiOPEjNZ6xHTLN1iWHpRt9mblPuCmp0CQOn0CEP2i0bqz1ChpmERPsFvv4Z0W5d08jeP0hSsknhqdhQEMyzAD(
            this.BatModClient
         );
         var2.BatModClient(
            this.BatModClient
               .K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL(
                  new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var2)
               ),
            (hM6oicVpdHa9ITKKi7gXDUUuQ0Ya2uKoBkZBP5lFonFWaHBxstRb4Mya29tQeD6BZO17gRZ099QFcvZTCfYmunEQnYRYB3MkMzAR)null
         );
         var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(false);
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }

      var2.Button(
         var1.BatModClient,
         var1.Button,
         var1.CustomSpinner,
         this.BatModClient
               .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
               .nextFloat()
            * 360.0F,
         0.0F
      );
      this.BatModClient
         .BatModClient(var2);
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3 = this.Checkbox
         .BatModClient();
      var2.BatModClient(
         var3,
         this.Checkbox
            .Button()
      );
      return true;
   }

   private qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      for (int var2 = 0; var2 < 10; var2++) {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3 = var1.BatModClient(
            this.BatModClient
                  .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                  .nextInt(16)
               - 8,
            this.BatModClient
                  .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                  .nextInt(6)
               - 3,
            this.BatModClient
                  .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                  .nextInt(16)
               - 8
         );
         if (this.Checkbox
               .BatModClient(var3)
            && v6NJV6LNUw6OzDUgIMMI7wWHuA0py0WegDrdW6ogD2oi3LIqiBHYO8Ryb28h3DedBI8kEBV0YCBMCja3PQ9LVIuGf3cD3pqvwZY.BatModClient(
               XFDCAwN64dGDJbvkcNFgllOI3AjrWUyVO3CBEpYmO9p5DWCPUh6ozIFZspQBs36mSh7nI8F654ZNWu4d8AtC5dugvMrl6909SG2.BatModClient,
               this.BatModClient,
               var3
            )) {
            return new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
               var3.BatModProgressBar(),
               var3.ColorChooser(),
               var3.IntegerSpinner()
            );
         }
      }

      return null;
   }
}
