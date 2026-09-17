public enum ProgressBar {
   BatModClient("Mojang"),
   Button("Xbox");

   private String CustomSpinner;

   ProgressBar(String var3) {
      this.CustomSpinner = var3;
   }

   public String BatModClient() {
      return this.CustomSpinner;
   }
}
