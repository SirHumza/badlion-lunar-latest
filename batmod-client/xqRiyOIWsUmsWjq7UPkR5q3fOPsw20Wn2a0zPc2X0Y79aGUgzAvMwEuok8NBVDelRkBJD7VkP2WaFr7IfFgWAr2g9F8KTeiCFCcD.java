import java.util.List;

public class xqRiyOIWsUmsWjq7UPkR5q3fOPsw20Wn2a0zPc2X0Y79aGUgzAvMwEuok8NBVDelRkBJD7VkP2WaFr7IfFgWAr2g9F8KTeiCFCcD
   extends ymCiJ1bOln4uhxTb9T485uJ4IbXvKvWhtrlgB78oxSxs2SSPJMj8R1eMcdKNKc5x192FC83Mu6wYvQI3hkC78BL80e01cMQ9PLLs
   implements kOHLLyZW0SXfmpR9th94xpQnMuDKboaWH9iSYne5Ui3EpsRdOGVBYpuBDKGbNXnbRRU1rpwebKh1ORqPJr2adHMycQbBAElXqPhN,
   oobbgPu04Z1a1Bb3M8CaBJMc3JhqB9IsHToXd2VsYpcbyuRQvcR4cFnKaSbUBRPYIvIN7rBiwDujZGA7wIJvkjJKmwKy5C3YMLVl {
   private k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[] Spinner = new k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[5];
   private String Checkbox;
   private int ProgressBar = -1;

   @Override
   public void BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      super.BatModClient(var1);
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var2 = var1.CustomSpinner(
         "Items", 10
      );
      this.Spinner = new k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[this.ColorChooser()];
      if (var1.Button("CustomName", 8)) {
         this.Checkbox = var1.IntegerSpinner(
            "CustomName"
         );
      }

      this.ProgressBar = var1.Checkbox(
         "TransferCooldown"
      );

      for (int var3 = 0; var3 < var2.Spinner(); var3++) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4 = var2.Button(
            var3
         );
         byte var5 = var4.ButtonAction("Slot");
         if (var5 >= 0 && var5 < this.Spinner.length) {
            this.Spinner[var5] = k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65.BatModClient(
               var4
            );
         }
      }
   }

   @Override
   public void Button(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      super.Button(var1);
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var2 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

      for (int var3 = 0; var3 < this.Spinner.length; var3++) {
         if (this.Spinner[var3] != null) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
            var4.BatModClient("Slot", (byte)var3);
            this.Spinner[var3]
               .Button(var4);
            var2.BatModClient(var4);
         }
      }

      var1.BatModClient("Items", var2);
      var1.BatModClient(
         "TransferCooldown", this.ProgressBar
      );
      if (this.n_()) {
         var1.BatModClient(
            "CustomName", this.Checkbox
         );
      }
   }

   @Override
   public void z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP() {
      super.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
   }

   @Override
   public int ColorChooser() {
      return this.Spinner.length;
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 ColorTextPane(
      int var1
   ) {
      return this.Spinner[var1];
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Button(
      int var1, int var2
   ) {
      if (this.Spinner[var1] != null) {
         if (this.Spinner[var1].Button
            <= var2) {
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = this.Spinner[var1];
            this.Spinner[var1] = null;
            return var4;
         }

         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3 = this.Spinner[var1]
            .BatModClient(var2);
         if (this.Spinner[var1].Button
            == 0) {
            this.Spinner[var1] = null;
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModInstallerMain(
      int var1
   ) {
      if (this.Spinner[var1] != null) {
         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2 = this.Spinner[var1];
         this.Spinner[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   @Override
   public void CustomSpinner(
      int var1, k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2
   ) {
      this.Spinner[var1] = var2;
      if (var2 != null
         && var2.Button
            > this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8()) {
         var2.Button = this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
      }
   }

   @Override
   public String C_() {
      return this.n_() ? this.Checkbox : "container.hopper";
   }

   @Override
   public boolean n_() {
      return this.Checkbox != null
         && this.Checkbox.length() > 0;
   }

   public void BatModClient(String var1) {
      this.Checkbox = var1;
   }

   @Override
   public int LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8() {
      return 64;
   }

   @Override
   public boolean ButtonAction(
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

   @Override
   public void Spinner(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
   }

   @Override
   public void Checkbox(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
   }

   @Override
   public boolean ButtonAction(
      int var1, k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2
   ) {
      return true;
   }

   @Override
   public void BatModClient() {
      if (this.BatModClient != null
         && !this.BatModClient.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
         )
       {
         this.ProgressBar--;
         if (!this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM()) {
            this.Button(0);
            this.InstallationLogger();
         }
      }
   }

   public boolean InstallationLogger() {
      if (this.BatModClient != null
         && !this.BatModClient.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
         )
       {
         if (!this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM()
            && AiqKTk3Bj1wAV1kI2a6brmiDcJjCbgawsTK4VZ7itNV30pxfAzeuxtvYk1nqtidio8Wh68dYlV0KqdznWnPzWFee0pe70qfBCHvz.Checkbox(
               this.IntegerSpinner()
            )) {
            boolean var1 = false;
            if (!this.ExitCode()) {
               var1 = this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4();
            }

            if (!this.BatModJson()) {
               var1 = BatModClient(this) || var1;
            }

            if (var1) {
               this.Button(8);
               this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean ExitCode() {
      for (k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 : this.Spinner) {
         if (var4 != null) {
            return false;
         }
      }

      return true;
   }

   private boolean BatModJson() {
      for (k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 : this.Spinner) {
         if (var4 == null
            || var4.Button
               != var4.Button()) {
            return false;
         }
      }

      return true;
   }

   private boolean o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4() {
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var1 = this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr();
      if (var1 == null) {
         return false;
      }

      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2 = AiqKTk3Bj1wAV1kI2a6brmiDcJjCbgawsTK4VZ7itNV30pxfAzeuxtvYk1nqtidio8Wh68dYlV0KqdznWnPzWFee0pe70qfBCHvz.Spinner(
            this.IntegerSpinner()
         )
         .Spinner();
      if (this.BatModClient(var1, var2)) {
         return false;
      }

      for (int var3 = 0; var3 < this.ColorChooser(); var3++) {
         if (this.ColorTextPane(var3) != null) {
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = this.ColorTextPane(
                  var3
               )
               .IntegerSpinner();
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var5 = BatModClient(
               var1, this.Button(var3, 1), var2
            );
            if (var5 == null || var5.Button == 0) {
               var1.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
               return true;
            }

            this.CustomSpinner(var3, var4);
         }
      }

      return false;
   }

   private boolean BatModClient(
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2
   ) {
      if (var1 instanceof DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92) {
         DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92 var3 = (DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92)var1;
         int[] var4 = var3.BatModClient(var2);

         for (int var5 = 0; var5 < var4.length; var5++) {
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var6 = var3.ColorTextPane(
               var4[var5]
            );
            if (var6 == null
               || var6.Button
                  != var6.Button()) {
               return false;
            }
         }
      } else {
         int var7 = var1.ColorChooser();

         for (int var8 = 0; var8 < var7; var8++) {
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var9 = var1.ColorTextPane(
               var8
            );
            if (var9 == null
               || var9.Button
                  != var9.Button()) {
               return false;
            }
         }
      }

      return true;
   }

   private static boolean Button(
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var0,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var1
   ) {
      if (var0 instanceof DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92) {
         DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92 var2 = (DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92)var0;
         int[] var3 = var2.BatModClient(var1);

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var2.ColorTextPane(var3[var4]) != null) {
               return false;
            }
         }
      } else {
         int var5 = var0.ColorChooser();

         for (int var6 = 0; var6 < var5; var6++) {
            if (var0.ColorTextPane(var6) != null) {
               return false;
            }
         }
      }

      return true;
   }

   public static boolean BatModClient(
      kOHLLyZW0SXfmpR9th94xpQnMuDKboaWH9iSYne5Ui3EpsRdOGVBYpuBDKGbNXnbRRU1rpwebKh1ORqPJr2adHMycQbBAElXqPhN var0
   ) {
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var1 = Button(
         var0
      );
      if (var1 != null) {
         NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient;
         if (Button(var1, var2)) {
            return false;
         }

         if (var1 instanceof DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92) {
            DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92 var3 = (DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92)var1;
            int[] var4 = var3.BatModClient(var2);

            for (int var5 = 0; var5 < var4.length; var5++) {
               if (BatModClient(var0, var1, var4[var5], var2)) {
                  return true;
               }
            }
         } else {
            int var7 = var1.ColorChooser();

            for (int var9 = 0; var9 < var7; var9++) {
               if (BatModClient(var0, var1, var9, var2)) {
                  return true;
               }
            }
         }
      } else {
         for (fKeG9s4EK64XIpPCFZENGxw3ZF8SFNgfFfhniJ9IRYvo1Wk5O6eryh1flMvCsQ8bR5vugDjKNeTVqbUhZjJYm6qBEc7FngiKKYLm var8 : BatModClient(
            var0.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL(),
            var0.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj(),
            var0.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF() + 1.0,
            var0.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
         )) {
            if (BatModClient(var0, var8)) {
               return true;
            }
         }
      }

      return false;
   }

   private static boolean BatModClient(
      kOHLLyZW0SXfmpR9th94xpQnMuDKboaWH9iSYne5Ui3EpsRdOGVBYpuBDKGbNXnbRRU1rpwebKh1ORqPJr2adHMycQbBAElXqPhN var0,
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var1,
      int var2,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var3
   ) {
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = var1.ColorTextPane(
         var2
      );
      if (var4 != null && Button(var1, var4, var2, var3)) {
         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var5 = var4.IntegerSpinner();
         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var6 = BatModClient(
            var0,
            var1.Button(var2, 1),
            (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn)null
         );
         if (var6 == null || var6.Button == 0) {
            var1.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
            return true;
         }

         var1.CustomSpinner(var2, var5);
      }

      return false;
   }

   public static boolean BatModClient(
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var0,
      fKeG9s4EK64XIpPCFZENGxw3ZF8SFNgfFfhniJ9IRYvo1Wk5O6eryh1flMvCsQ8bR5vugDjKNeTVqbUhZjJYm6qBEc7FngiKKYLm var1
   ) {
      boolean var2 = false;
      if (var1 == null) {
         return false;
      }

      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3 = var1.BatModProgressBar()
         .IntegerSpinner();
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = BatModClient(
         var0, var3, (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn)null
      );
      if (var4 != null && var4.Button != 0) {
         var1.BatModClient(var4);
      } else {
         var2 = true;
         var1.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj();
      }

      return var2;
   }

   public static k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModClient(
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var0,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2
   ) {
      if (var0 instanceof DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92 && var2 != null) {
         DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92 var6 = (DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92)var0;
         int[] var7 = var6.BatModClient(var2);

         for (int var5 = 0;
            var5 < var7.length && var1 != null && var1.Button > 0;
            var5++
         ) {
            var1 = CustomSpinner(var0, var1, var7[var5], var2);
         }
      } else {
         int var3 = var0.ColorChooser();

         for (int var4 = 0;
            var4 < var3 && var1 != null && var1.Button > 0;
            var4++
         ) {
            var1 = CustomSpinner(var0, var1, var4, var2);
         }
      }

      if (var1 != null && var1.Button == 0) {
         var1 = null;
      }

      return var1;
   }

   private static boolean BatModClient(
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var0,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1,
      int var2,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var3
   ) {
      return !var0.ButtonAction(var2, var1)
         ? false
         : !(var0 instanceof DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92)
            || ((DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92)var0)
               .BatModClient(var2, var1, var3);
   }

   private static boolean Button(
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var0,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1,
      int var2,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var3
   ) {
      return !(var0 instanceof DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92)
         || ((DQcvOpfVkOOTOH9WKEN1E82f7Kv7vi0LX4hdgAEnbbIrHR9kwpxIpyPPJ7d5wqN3JAvyzOk6UEJ3jvJbXT535ovVrRAZF2aEPn92)var0)
            .Button(var2, var1, var3);
   }

   private static k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 CustomSpinner(
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var0,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1,
      int var2,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var3
   ) {
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = var0.ColorTextPane(
         var2
      );
      if (BatModClient(var0, var1, var2, var3)) {
         boolean var5 = false;
         if (var4 == null) {
            var0.CustomSpinner(var2, var1);
            var1 = null;
            var5 = true;
         } else if (BatModClient(var4, var1)) {
            int var6 = var1.Button()
               - var4.Button;
            int var7 = Math.min(var1.Button, var6);
            var1.Button -= var7;
            var4.Button += var7;
            var5 = var7 > 0;
         }

         if (var5) {
            if (var0 instanceof xqRiyOIWsUmsWjq7UPkR5q3fOPsw20Wn2a0zPc2X0Y79aGUgzAvMwEuok8NBVDelRkBJD7VkP2WaFr7IfFgWAr2g9F8KTeiCFCcD) {
               xqRiyOIWsUmsWjq7UPkR5q3fOPsw20Wn2a0zPc2X0Y79aGUgzAvMwEuok8NBVDelRkBJD7VkP2WaFr7IfFgWAr2g9F8KTeiCFCcD var8 = (xqRiyOIWsUmsWjq7UPkR5q3fOPsw20Wn2a0zPc2X0Y79aGUgzAvMwEuok8NBVDelRkBJD7VkP2WaFr7IfFgWAr2g9F8KTeiCFCcD)var0;
               if (var8.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY()) {
                  var8.Button(8);
               }

               var0.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
            }

            var0.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
         }
      }

      return var1;
   }

   private r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr() {
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var1 = AiqKTk3Bj1wAV1kI2a6brmiDcJjCbgawsTK4VZ7itNV30pxfAzeuxtvYk1nqtidio8Wh68dYlV0KqdznWnPzWFee0pe70qfBCHvz.Spinner(
         this.IntegerSpinner()
      );
      return Button(
         this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL(),
         this.Button
               .BatModProgressBar()
            + var1.BatModProgressBar(),
         this.Button
               .ColorChooser()
            + var1.ColorChooser(),
         this.Button
               .IntegerSpinner()
            + var1.IntegerSpinner()
      );
   }

   public static r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr Button(
      kOHLLyZW0SXfmpR9th94xpQnMuDKboaWH9iSYne5Ui3EpsRdOGVBYpuBDKGbNXnbRRU1rpwebKh1ORqPJr2adHMycQbBAElXqPhN var0
   ) {
      return Button(
         var0.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL(),
         var0.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj(),
         var0.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF() + 1.0,
         var0.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
      );
   }

   public static List BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var0, double var1, double var3, double var5
   ) {
      return var0.BatModClient(
         fKeG9s4EK64XIpPCFZENGxw3ZF8SFNgfFfhniJ9IRYvo1Wk5O6eryh1flMvCsQ8bR5vugDjKNeTVqbUhZjJYm6qBEc7FngiKKYLm.class,
         new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(
            var1 - 0.5, var3 - 0.5, var5 - 0.5, var1 + 0.5, var3 + 0.5, var5 + 0.5
         ),
         K2KPA4pfEqQGUxwgH4FOKySEldvUe4B7eFvOoEyLMDOD1bg7M9Ex8MKacJ4N4GMwLh5jsdUOa03oyeEeXmZI78vbWMhvYjiea49W.BatModClient
      );
   }

   public static r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr Button(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var0, double var1, double var3, double var5
   ) {
      r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var7 = null;
      int var8 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var1
      );
      int var9 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var3
      );
      int var10 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var5
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var11 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         var8, var9, var10
      );
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var12 = var0.Button(
            var11
         )
         .CustomSpinner();
      if (var12.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()) {
         gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var13 = var0.BatModClient(
            var11
         );
         if (var13 instanceof r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr) {
            var7 = (r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr)var13;
            if (var7 instanceof TlrXLJ3oNoTYiIUsNmzBRN3d4JvpelDrebTR42InvZArJlPETNc2dFuodNa3cbgUIssXmaJUgxcE7HbLOjpWNg2sPcUw25ecle16
               && var12 instanceof tT1i9IilgIOKWllzPDqTytNsRTEXURyNxDbx2tbANhZGmlhvmkvMVBUbRFKvy04eqRDhgAHv3e8AHZyRNoIiCMLBenyGA1W1D4v2) {
               var7 = ((tT1i9IilgIOKWllzPDqTytNsRTEXURyNxDbx2tbANhZGmlhvmkvMVBUbRFKvy04eqRDhgAHv3e8AHZyRNoIiCMLBenyGA1W1D4v2)var12)
                  .ColorChooser(var0, var11);
            }
         }
      }

      if (var7 == null) {
         List var14 = var0.BatModClient(
            (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)null,
            new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(
               var1 - 0.5, var3 - 0.5, var5 - 0.5, var1 + 0.5, var3 + 0.5, var5 + 0.5
            ),
            K2KPA4pfEqQGUxwgH4FOKySEldvUe4B7eFvOoEyLMDOD1bg7M9Ex8MKacJ4N4GMwLh5jsdUOa03oyeEeXmZI78vbWMhvYjiea49W.CustomSpinner
         );
         if (var14.size() > 0) {
            var7 = (r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr)var14.get(
               var0.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN.nextInt(var14.size())
            );
         }
      }

      return var7;
   }

   private static boolean BatModClient(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var0,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1
   ) {
      return var0.BatModClient()
            != var1.BatModClient()
         ? false
         : (
            var0.BatModProgressBar()
                  != var1.BatModProgressBar()
               ? false
               : (
                  var0.Button
                        > var0.Button()
                     ? false
                     : k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65.BatModClient(
                        var0, var1
                     )
               )
         );
   }

   @Override
   public double GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj() {
      return this.Button
            .BatModProgressBar()
         + 0.5;
   }

   @Override
   public double OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF() {
      return this.Button
            .ColorChooser()
         + 0.5;
   }

   @Override
   public double wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68() {
      return this.Button
            .IntegerSpinner()
         + 0.5;
   }

   public void Button(int var1) {
      this.ProgressBar = var1;
   }

   public boolean RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM() {
      return this.ProgressBar > 0;
   }

   public boolean K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY() {
      return this.ProgressBar <= 1;
   }

   @Override
   public String z_() {
      return "minecraft:hopper";
   }

   @Override
   public Aj7XcOq39OSNFQ9XdHMZK983N1FTgww66fEcYW7FZpHTf8YZVRDpMUrV6homDZeu06ifByDzcDCkLuiKMOfUndmcWdqxmSEB7obV BatModClient(
      AX6LnVIQq0DIHSLHkVry03WrFIiPlffzgpJngh8yakfqh4G2TBZOBJe4WEQAuWdfe6urNxqbVbKLQTAhyjxeidJTgUHMMMvTj9Sa var1,
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var2
   ) {
      return new F0YOYBwOIbGTcp6PSRfgPuNJZqbzKmZeYSi5Xul0ZwiMdHbUvhu2dXqDqulQyT6TsJfX4Skx3GuaFYHeHvbmFbLOrun83rIxYHY6(var1, this, var2);
   }

   @Override
   public int BatModClient(int var1) {
      return 0;
   }

   @Override
   public void BatModClient(int var1, int var2) {
   }

   @Override
   public int Spinner() {
      return 0;
   }

   @Override
   public void xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa() {
      for (int var1 = 0; var1 < this.Spinner.length; var1++) {
         this.Spinner[var1] = null;
      }
   }
}
