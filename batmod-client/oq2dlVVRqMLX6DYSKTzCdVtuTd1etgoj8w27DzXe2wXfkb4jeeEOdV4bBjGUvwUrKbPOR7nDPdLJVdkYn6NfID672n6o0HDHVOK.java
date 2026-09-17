public class oq2dlVVRqMLX6DYSKTzCdVtuTd1etgoj8w27DzXe2wXfkb4jeeEOdV4bBjGUvwUrKbPOR7nDPdLJVdkYn6NfID672n6o0HDHVOK {
   private final xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY BatModClient;
   private final VOV84XzuMWrwpvkwu5LJHXBhpVvfHxiUkItS93saq12VjZEG0se88QHdeCp4DwciHolhZQ2v0URvP1bziGTpNQYa1K11aNqHenW Button;
   private final NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn CustomSpinner;
   private final NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn ButtonAction;
   private int Spinner = 0;
   private q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Checkbox;
   private int ProgressBar;
   private int BatModProgressBar;

   public oq2dlVVRqMLX6DYSKTzCdVtuTd1etgoj8w27DzXe2wXfkb4jeeEOdV4bBjGUvwUrKbPOR7nDPdLJVdkYn6NfID672n6o0HDHVOK(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2,
      VOV84XzuMWrwpvkwu5LJHXBhpVvfHxiUkItS93saq12VjZEG0se88QHdeCp4DwciHolhZQ2v0URvP1bziGTpNQYa1K11aNqHenW var3
   ) {
      this.BatModClient = var1;
      this.Button = var3;
      if (var3
         == VOV84XzuMWrwpvkwu5LJHXBhpVvfHxiUkItS93saq12VjZEG0se88QHdeCp4DwciHolhZQ2v0URvP1bziGTpNQYa1K11aNqHenW.BatModClient
         )
       {
         this.ButtonAction = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Checkbox;
         this.CustomSpinner = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner;
      } else {
         this.ButtonAction = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.CustomSpinner;
         this.CustomSpinner = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ButtonAction;
      }

      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = var2;

      while (
         var2.ColorChooser()
               > var4.ColorChooser() - 21
            && var2.ColorChooser() > 0
            && this.BatModClient(
               var1.Button(
                     var2.Button()
                  )
                  .CustomSpinner()
            )
      ) {
         var2 = var2.Button();
      }

      int var5 = this.BatModClient(
            var2, this.ButtonAction
         )
         - 1;
      if (var5 >= 0) {
         this.Checkbox = var2.BatModClient(
            this.ButtonAction, var5
         );
         this.BatModProgressBar = this.BatModClient(
            this.Checkbox,
            this.CustomSpinner
         );
         if (this.BatModProgressBar < 2
            || this.BatModProgressBar > 21) {
            this.Checkbox = null;
            this.BatModProgressBar = 0;
         }
      }

      if (this.Checkbox != null) {
         this.ProgressBar = this.CustomSpinner();
      }
   }

   protected int BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2
   ) {
      int var3;
      for (var3 = 0; var3 < 22; var3++) {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = var1.BatModClient(
            var2, var3
         );
         if (!this.BatModClient(
               this.BatModClient
                  .Button(var4)
                  .CustomSpinner()
            )
            || this.BatModClient
                  .Button(
                     var4.Button()
                  )
                  .CustomSpinner()
               != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
            )
          {
            break;
         }
      }

      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var5 = this.BatModClient
         .Button(
            var1.BatModClient(var2, var3)
         )
         .CustomSpinner();
      return var5
            == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
         ? var3
         : 0;
   }

   public int BatModClient() {
      return this.ProgressBar;
   }

   public int Button() {
      return this.BatModProgressBar;
   }

   protected int CustomSpinner() {
      label56:
      for (this.ProgressBar = 0;
         this.ProgressBar < 21;
         this.ProgressBar++
      ) {
         for (int var1 = 0; var1 < this.BatModProgressBar; var1++) {
            q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2 = this.Checkbox
               .BatModClient(
                  this.CustomSpinner, var1
               )
               .BatModClient(
                  this.ProgressBar
               );
            c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var3 = this.BatModClient
               .Button(var2)
               .CustomSpinner();
            if (!this.BatModClient(var3)) {
               break label56;
            }

            if (var3
               == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX
               )
             {
               this.Spinner++;
            }

            if (var1 == 0) {
               var3 = this.BatModClient
                  .Button(
                     var2.BatModClient(
                        this.ButtonAction
                     )
                  )
                  .CustomSpinner();
               if (var3
                  != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
                  )
                {
                  break label56;
               }
            } else if (var1 == this.BatModProgressBar - 1) {
               var3 = this.BatModClient
                  .Button(
                     var2.BatModClient(
                        this.CustomSpinner
                     )
                  )
                  .CustomSpinner();
               if (var3
                  != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
                  )
                {
                  break label56;
               }
            }
         }
      }

      for (int var4 = 0; var4 < this.BatModProgressBar; var4++) {
         if (this.BatModClient
               .Button(
                  this.Checkbox
                     .BatModClient(
                        this.CustomSpinner, var4
                     )
                     .BatModClient(
                        this.ProgressBar
                     )
               )
               .CustomSpinner()
            != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
            )
          {
            this.ProgressBar = 0;
            break;
         }
      }

      if (this.ProgressBar <= 21
         && this.ProgressBar >= 3) {
         return this.ProgressBar;
      }

      this.Checkbox = null;
      this.BatModProgressBar = 0;
      this.ProgressBar = 0;
      return 0;
   }

   protected boolean BatModClient(
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var1
   ) {
      return var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
            == wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModClient
         || var1
            == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
         || var1
            == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX;
   }

   public boolean ButtonAction() {
      return this.Checkbox != null
         && this.BatModProgressBar >= 2
         && this.BatModProgressBar <= 21
         && this.ProgressBar >= 3
         && this.ProgressBar <= 21;
   }

   public void Spinner() {
      for (int var1 = 0; var1 < this.BatModProgressBar; var1++) {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2 = this.Checkbox
            .BatModClient(
               this.CustomSpinner, var1
            );

         for (int var3 = 0; var3 < this.ProgressBar; var3++) {
            this.BatModClient
               .BatModClient(
                  var2.BatModClient(var3),
                  fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX
                     .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
                     .BatModClient(
                        PdyupCpw96ahHRjxMfRy8QKZWuBIIzlOIvZtPoa7nPs5xEdYG21s0ozLfIjs8jRr8EFvEQp0kLK6GdP32NGQA01GGsy0HMgMkuI.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj,
                        this.Button
                     ),
                  2
               );
         }
      }
   }
}
