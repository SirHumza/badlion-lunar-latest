public enum igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz {
   BatModClient(
      "Couldn't find api.imgur.com, are you connected to the internet?", 1
   ),
   Button("The action was successful!", 200),
   CustomSpinner("Upload interupted or corrupted.", 400),
   ButtonAction("Action requires Auth. Credentials are invalid.", 401),
   Spinner(
      "You don't have access.  Possible lack of API credits.", 403
   ),
   Checkbox("The requested image or album does not exist.", 404),
   ProgressBar("The file that you tried to upload was too big!", 413),
   BatModProgressBar(
      "You are uploading to quickly! You've been rate limited.", 429
   ),
   ColorChooser(
      "Imgur unexpected internal server error. Not our fault.", 500
   ),
   IntegerSpinner(
      "Imgur is unavailable currently.  Most likely over capacity.", 502
   ),
   TextField(
      "An error occured, but we don't know what kind. Sorry!", -1
   );

   private String ColorTextPane;
   private int BatModInstallerMain;

   igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz(String var3, int var4) {
      this.ColorTextPane = var3;
      this.BatModInstallerMain = var4;
   }

   public static igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz BatModClient(
      int var0
   ) {
      switch (var0) {
         case 1:
            return BatModClient;
         case 200:
            return Button;
         case 400:
            return CustomSpinner;
         case 401:
            return ButtonAction;
         case 403:
            return Spinner;
         case 404:
            return Checkbox;
         case 413:
            return ProgressBar;
         case 429:
            return BatModProgressBar;
         case 500:
            return ColorChooser;
         case 502:
            return IntegerSpinner;
         default:
            return TextField;
      }
   }

   public String BatModClient() {
      return this.ColorTextPane;
   }

   public int Button() {
      return this.BatModInstallerMain;
   }

   @Override
   public String toString() {
      return String.format(
         "StatusCode - %s: %s - %s: %d - %s: %s",
         "Name",
         super.toString(),
         "HttpCode",
         this.Button(),
         "Description",
         this.BatModClient()
      );
   }
}
