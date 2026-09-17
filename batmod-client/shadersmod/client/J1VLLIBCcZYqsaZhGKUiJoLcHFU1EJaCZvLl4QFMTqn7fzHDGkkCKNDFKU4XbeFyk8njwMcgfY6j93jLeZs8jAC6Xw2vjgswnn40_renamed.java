package shadersmod.client;

public class Downloader
   extends shadersmod.client.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ {
   public static final String[] BatModClient = new String[]{
      "default", "true", "false"
   };
   public static final String[] Button = new String[]{
      "Default", "ON", "OFF"
   };

   public Downloader(String var1, String var2, int var3) {
      super(
         var1,
         BatModClient,
         var2,
         Button,
         var3
      );
   }

   @Override
   public String CustomSpinner() {
      return this.BatModProgressBar()
         ? FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox()
         : (
            this.ColorChooser()
               ? FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
               : (
                  this.IntegerSpinner()
                     ? FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner()
                     : super.CustomSpinner()
               )
         );
   }

   public boolean BatModProgressBar() {
      return this.Button() == 0;
   }

   public boolean ColorChooser() {
      return this.Button() == 1;
   }

   public boolean IntegerSpinner() {
      return this.Button() == 2;
   }
}
