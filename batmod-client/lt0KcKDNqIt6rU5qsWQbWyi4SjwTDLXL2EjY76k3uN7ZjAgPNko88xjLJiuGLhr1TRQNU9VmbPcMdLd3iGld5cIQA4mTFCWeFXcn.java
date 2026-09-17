public class lt0KcKDNqIt6rU5qsWQbWyi4SjwTDLXL2EjY76k3uN7ZjAgPNko88xjLJiuGLhr1TRQNU9VmbPcMdLd3iGld5cIQA4mTFCWeFXcn
   implements kQBUKVbQYNqWTdjw7hwBOcBSlmjaMudn5zTLs2guhXVtjteHYYcaoYMGVaZl0SMBQx9NR9bHQLUIRovrNwuWpEspYuVQawexr1t {
   protected int BatModClient;
   protected int Button;
   protected WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj[][] CustomSpinner;
   protected boolean ButtonAction;
   protected xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY Spinner;

   public lt0KcKDNqIt6rU5qsWQbWyi4SjwTDLXL2EjY76k3uN7ZjAgPNko88xjLJiuGLhr1TRQNU9VmbPcMdLd3iGld5cIQA4mTFCWeFXcn(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3,
      int var4
   ) {
      this.Spinner = var1;
      this.BatModClient = var2.BatModProgressBar()
            - var4
         >> 4;
      this.Button = var2.IntegerSpinner()
            - var4
         >> 4;
      int var5 = var3.BatModProgressBar() + var4 >> 4;
      int var6 = var3.IntegerSpinner() + var4 >> 4;
      this.CustomSpinner = new WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj[var5
         - this.BatModClient
         + 1][var6 - this.Button + 1];
      this.ButtonAction = true;

      for (int var7 = this.BatModClient; var7 <= var5; var7++) {
         for (int var8 = this.Button; var8 <= var6; var8++) {
            this.CustomSpinner[var7
               - this.BatModClient][var8
               - this.Button] = var1.BatModClient(
               var7, var8
            );
         }
      }

      for (int var10 = var2.BatModProgressBar() >> 4;
         var10 <= var3.BatModProgressBar() >> 4;
         var10++
      ) {
         for (int var11 = var2.IntegerSpinner() >> 4;
            var11 <= var3.IntegerSpinner() >> 4;
            var11++
         ) {
            WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var9 = this.CustomSpinner[var10
               - this.BatModClient][var11
               - this.Button];
            if (var9 != null
               && !var9.CustomSpinner(
                  var2.ColorChooser(),
                  var3.ColorChooser()
               )) {
               this.ButtonAction = false;
            }
         }
      }
   }

   @Override
   public boolean s_() {
      return this.ButtonAction;
   }

   @Override
   public gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      int var2 = (var1.BatModProgressBar() >> 4)
         - this.BatModClient;
      int var3 = (var1.IntegerSpinner() >> 4)
         - this.Button;
      return this.CustomSpinner[var2][var3]
         .BatModClient(
            var1,
            jHQADUFE1Sl9N4ReyjEZSQ3Es9M7tX3VeCQpyPtGsJowMgBEjWvFFPRne9i1broDReTcDf69UbhE1h9uUfYEXhprqDwj7ylw6pqk.BatModClient
         );
   }

   @Override
   public int BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1, int var2
   ) {
      int var3 = this.Button(
         lgztjp9dBcvciD1FcN7oVWuA5AIHGq5lxa5hstirKdlduaseZUrQmocfYXmJQkIEJUX2ooQpWGRxVpintpY086VRD7ZidXbakU1Y.BatModClient,
         var1
      );
      int var4 = this.Button(
         lgztjp9dBcvciD1FcN7oVWuA5AIHGq5lxa5hstirKdlduaseZUrQmocfYXmJQkIEJUX2ooQpWGRxVpintpY086VRD7ZidXbakU1Y.Button,
         var1
      );
      if (var4 < var2) {
         var4 = var2;
      }

      return var3 << 20 | var4 << 4;
   }

   @Override
   public jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS Button(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      if (var1.ColorChooser() >= 0
         && var1.ColorChooser() < 256) {
         int var2 = (var1.BatModProgressBar() >> 4)
            - this.BatModClient;
         int var3 = (var1.IntegerSpinner() >> 4)
            - this.Button;
         if (var2 >= 0
            && var2 < this.CustomSpinner.length
            && var3 >= 0
            && var3 < this.CustomSpinner[var2].length) {
            WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var4 = this.CustomSpinner[var2][var3];
            if (var4 != null) {
               return var4.ButtonAction(var1);
            }
         }
      }

      return fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
         .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt();
   }

   @Override
   public Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF CustomSpinner(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return this.Spinner
         .CustomSpinner(var1);
   }

   private int Button(
      lgztjp9dBcvciD1FcN7oVWuA5AIHGq5lxa5hstirKdlduaseZUrQmocfYXmJQkIEJUX2ooQpWGRxVpintpY086VRD7ZidXbakU1Y var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2
   ) {
      if (var1
            == lgztjp9dBcvciD1FcN7oVWuA5AIHGq5lxa5hstirKdlduaseZUrQmocfYXmJQkIEJUX2ooQpWGRxVpintpY086VRD7ZidXbakU1Y.BatModClient
         && this.Spinner
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN()) {
         return 0;
      }

      if (var2.ColorChooser() >= 0
         && var2.ColorChooser() < 256) {
         if (this.Button(var2)
            .CustomSpinner()
            .Spinner()) {
            int var9 = 0;

            for (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var7 : NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.values()) {
               int var8 = this.BatModClient(
                  var1, var2.BatModClient(var7)
               );
               if (var8 > var9) {
                  var9 = var8;
               }

               if (var9 >= 15) {
                  return var9;
               }
            }

            return var9;
         } else {
            int var3 = (var2.BatModProgressBar() >> 4)
               - this.BatModClient;
            int var4 = (var2.IntegerSpinner() >> 4)
               - this.Button;
            return this.CustomSpinner[var3][var4]
               .BatModClient(var1, var2);
         }
      } else {
         return var1.CustomSpinner;
      }
   }

   @Override
   public boolean ButtonAction(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return this.Button(var1)
            .CustomSpinner()
            .Checkbox()
         == wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModClient;
   }

   public int BatModClient(
      lgztjp9dBcvciD1FcN7oVWuA5AIHGq5lxa5hstirKdlduaseZUrQmocfYXmJQkIEJUX2ooQpWGRxVpintpY086VRD7ZidXbakU1Y var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2
   ) {
      if (var2.ColorChooser() >= 0
         && var2.ColorChooser() < 256) {
         int var3 = (var2.BatModProgressBar() >> 4)
            - this.BatModClient;
         int var4 = (var2.IntegerSpinner() >> 4)
            - this.Button;
         return this.CustomSpinner[var3][var4]
            .BatModClient(var1, var2);
      } else {
         return var1.CustomSpinner;
      }
   }

   @Override
   public int BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2
   ) {
      jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var3 = this.Button(
         var1
      );
      return var3.CustomSpinner()
         .Button(this, var1, var3, var2);
   }

   @Override
   public X2Vr1O4DSTdlVzTHC08vBjTsnuTSx2f4ovgQB5BdrdVuUjiLxZQpM63guZCtKKDo69VpbFpWDdnO2VJHyfzVEj15IuHff0BmzY17 CustomSpinner() {
      return this.Spinner
         .CustomSpinner();
   }
}
