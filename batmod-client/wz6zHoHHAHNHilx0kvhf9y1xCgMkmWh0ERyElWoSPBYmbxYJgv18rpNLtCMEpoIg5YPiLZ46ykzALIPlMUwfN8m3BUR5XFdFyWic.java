public class wz6zHoHHAHNHilx0kvhf9y1xCgMkmWh0ERyElWoSPBYmbxYJgv18rpNLtCMEpoIg5YPiLZ46ykzALIPlMUwfN8m3BUR5XFdFyWic
   extends uiNrnIgsHuPBwt80RSvqkxZ93Qpqr1UJaZoATXGroBwZ1aFnHdgb6IQxcxCMD8wMA7Vo8BCF0HsGxY7SNAJBe4cm1W49G9pdGxO {
   private boolean CustomSpinner;
   private boolean ButtonAction;
   private int Spinner;
   private int Checkbox;

   public wz6zHoHHAHNHilx0kvhf9y1xCgMkmWh0ERyElWoSPBYmbxYJgv18rpNLtCMEpoIg5YPiLZ46ykzALIPlMUwfN8m3BUR5XFdFyWic(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1
   ) {
      super(var1);
   }

   @Override
   public void ButtonAction() {
      super.ButtonAction();
      this.Checkbox++;
      long var1 = this.BatModClient
         .BatModJson();
      long var3 = var1 / 24000L + 1L;
      if (!this.CustomSpinner
         && this.Checkbox > 20) {
         this.CustomSpinner = true;
         this.Button
            .BatModClient
            .BatModClient(
               new KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(5, 0.0F)
            );
      }

      this.ButtonAction = var1 > 120500L;
      if (this.ButtonAction) {
         this.Spinner++;
      }

      if (var1 % 24000L == 500L) {
         if (var3 <= 6L) {
            this.Button
               .BatModClient(
                  new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("demo.day." + var3)
               );
         }
      } else if (var3 == 1L) {
         if (var1 == 100L) {
            this.Button
               .BatModClient
               .BatModClient(
                  new KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(5, 101.0F)
               );
         } else if (var1 == 175L) {
            this.Button
               .BatModClient
               .BatModClient(
                  new KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(5, 102.0F)
               );
         } else if (var1 == 250L) {
            this.Button
               .BatModClient
               .BatModClient(
                  new KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(5, 103.0F)
               );
         }
      } else if (var3 == 5L && var1 % 24000L == 22000L) {
         this.Button
            .BatModClient(
               new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("demo.day.warning")
            );
      }
   }

   private void Checkbox() {
      if (this.Spinner > 100) {
         this.Button
            .BatModClient(
               new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("demo.reminder")
            );
         this.Spinner = 0;
      }
   }

   @Override
   public void BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2
   ) {
      if (this.ButtonAction) {
         this.Checkbox();
      } else {
         super.BatModClient(var1, var2);
      }
   }

   @Override
   public void BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      if (!this.ButtonAction) {
         super.BatModClient(var1);
      }
   }

   @Override
   public boolean Button(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return this.ButtonAction
         ? false
         : super.Button(var1);
   }

   @Override
   public boolean BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3
   ) {
      if (this.ButtonAction) {
         this.Checkbox();
         return false;
      } else {
         return super.BatModClient(var1, var2, var3);
      }
   }

   @Override
   public boolean BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var5,
      float var6,
      float var7,
      float var8
   ) {
      if (this.ButtonAction) {
         this.Checkbox();
         return false;
      } else {
         return super.BatModClient(
            var1, var2, var3, var4, var5, var6, var7, var8
         );
      }
   }
}
