public enum KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ {
   BatModClient("Quitting"),
   Button("Disconnected"),
   CustomSpinner("Stopping"),
   ButtonAction("Internal server error"),
   Spinner("End of stream"),
   Checkbox("Timed out"),
   ProgressBar("Protocol version mismatch"),
   BatModProgressBar("Connection state unapproved"),
   ColorChooser("Already online"),
   IntegerSpinner("Too many packets"),
   TextField("Unknown host"),
   ColorTextPane("Unable to authenticate with Mojang servers");

   private final String BatModInstallerMain;

   KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ(String var3) {
      this.BatModInstallerMain = var3;
   }

   public String BatModClient() {
      return this.BatModInstallerMain;
   }
}
