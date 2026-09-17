public class RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev {
   public final EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u BatModClient;
   private boolean ButtonAction;
   private int Spinner;
   private int Checkbox;
   private int ProgressBar;
   private int BatModProgressBar;
   private int ColorChooser;
   public int Button;

   public RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev(
      qlXEh8o8keRZEoFh2GZMTzmRXMEiLntx7zyJRpyX6ZeHl30RzVChFVgdOvKc8rzxqLm4JBkj8ijCohKOJNymRp0bajwInQi7DmZp var1,
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var2
   ) {
      this.CustomSpinner = var1;
      this.ButtonAction = true;
      this.Spinner = 0;
      this.Checkbox = 0;
      this.ProgressBar = 127;
      this.BatModProgressBar = 127;
      this.BatModClient = var2;
   }

   public fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM BatModClient(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1
   ) {
      if (this.ButtonAction) {
         this.ButtonAction = false;
         return new uGuH9yAGWzFqpjIDbdEjYvO8qCB9RxzzTY6ZXvWE7aC978gKF42ux84zJRhsZSWaGrAHeuypPKti5taOSkTFDt9EJz92NVLiKdE(
            var1.BatModProgressBar(),
            this.CustomSpinner.Spinner,
            this.CustomSpinner
               .BatModProgressBar
               .values(),
            this.CustomSpinner.Checkbox,
            this.Spinner,
            this.Checkbox,
            this.ProgressBar
               + 1
               - this.Spinner,
            this.BatModProgressBar
               + 1
               - this.Checkbox
         );
      } else {
         return this.ColorChooser++ % 5 == 0
            ? new uGuH9yAGWzFqpjIDbdEjYvO8qCB9RxzzTY6ZXvWE7aC978gKF42ux84zJRhsZSWaGrAHeuypPKti5taOSkTFDt9EJz92NVLiKdE(
               var1.BatModProgressBar(),
               this.CustomSpinner.Spinner,
               this.CustomSpinner
                  .BatModProgressBar
                  .values(),
               this.CustomSpinner.Checkbox,
               0,
               0,
               0,
               0
            )
            : null;
      }
   }

   public void BatModClient(int var1, int var2) {
      if (this.ButtonAction) {
         this.Spinner = Math.min(
            this.Spinner, var1
         );
         this.Checkbox = Math.min(
            this.Checkbox, var2
         );
         this.ProgressBar = Math.max(
            this.ProgressBar, var1
         );
         this.BatModProgressBar = Math.max(
            this.BatModProgressBar, var2
         );
      } else {
         this.ButtonAction = true;
         this.Spinner = var1;
         this.Checkbox = var2;
         this.ProgressBar = var1;
         this.BatModProgressBar = var2;
      }
   }
}
