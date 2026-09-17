package shadersmod.client;

import java.util.ArrayList;

class BatModInstallerMain
   extends Qi9hWV9TCxq36R4JTsz1L7BgqcRYlpPO1zL6H0U7QVvBE2r7zP7i3shYd2HYzjtncrGh0XWvDyb42THhcX7Vo5zp9K48s9TTDzZm {
   private ArrayList Button;
   private int CustomSpinner;
   private long ButtonAction = 0L;
   final shadersmod.client.TextField BatModClient;

   public BatModInstallerMain(
      shadersmod.client.TextField var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6
   ) {
      super(var1.ProgressBar(), var2, var3, var4, var5, var6);
      this.BatModClient = var1;
      this.Spinner();
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = 0.0F;
      int var7 = this.CustomSpinner * var6;
      int var8 = (var5 - var4) / 2;
      if (var7 > var8) {
         this.BatModClient(var7 - var8);
      }
   }

   @Override
   public int ButtonAction() {
      return this.IntegerSpinner - 20;
   }

   public void Spinner() {
      this.Button = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Checkbox();
      this.CustomSpinner = 0;
      int var1 = 0;

      for (int var2 = this.Button.size(); var1 < var2; var1++) {
         if (((String)this.Button.get(var1))
            .equals(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FDG6xfJRzvnFQto5vR3cdq8rv85PkXPtvXOQ1ydGlhQI0PyZDD7AqQixqOGjLa7bQIHp78ZvQwoptU4uaAfVMk5MghPUfcP4khOt
            )) {
            this.CustomSpinner = var1;
            break;
         }
      }
   }

   @Override
   protected int BatModClient() {
      return this.Button.size();
   }

   @Override
   protected void BatModClient(
      int var1, boolean var2, int var3, int var4
   ) {
      if (var1 != this.CustomSpinner
         || this.ExitCode
            != this.ButtonAction) {
         this.CustomSpinner = var1;
         this.ButtonAction = this.ExitCode;
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
            (String)this.Button.get(var1)
         );
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Downloader();
         this.BatModClient
            .Checkbox();
      }
   }

   @Override
   protected boolean CustomSpinner(int var1) {
      return var1 == this.CustomSpinner;
   }

   @Override
   protected int CustomSpinner() {
      return this.IntegerSpinner - 6;
   }

   @Override
   protected int ProgressBar() {
      return this.BatModClient() * 18;
   }

   @Override
   protected void d_() {
   }

   @Override
   protected void BatModClient(
      int var1, int var2, int var3, int var4, int var5, int var6
   ) {
      String var7 = (String)this.Button.get(var1);
      if (var7.equals(
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.rh7QDOSFg05fyydW5Gz5bwQnsrzM4KKmWUYAblghq24rfoLdGbX36bDfT2c90YOYYsaUm5iZJUPvplKrZ9BWqLfVdpJy4eWDaPHB
      )) {
         var7 = FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
            "of.options.shaders.packNone"
         );
      } else if (var7.equals(
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.MGiDSVaeH4GPb4qiCrN1A52u5wyzheXMB2beChdrygTiuZieuh6x2HXGMkydUWXOnLnrapkUzprmnmLgpm8DTGRF1CbRv5VuRIaK
      )) {
         var7 = FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
            "of.options.shaders.packDefault"
         );
      }

      this.BatModClient
         .BatModClient(
            var7, this.IntegerSpinner / 2, var3 + 1, 16777215
         );
   }

   public int BatModProgressBar() {
      return this.CustomSpinner;
   }
}
