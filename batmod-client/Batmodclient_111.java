public enum NH6Z9w17OZ4tCqdtH18E2MG2pmxLsV38k540qSU7ey57EMgHaEba3BsUtrDQ2hQTfA7Iy3kuIWGBRL3gi27KLghrZMgBsA5XLj {
   BatModClient("BatMod", "batmod/lang", "properties"),
   Button("OptiFine", "optifine/lang", "lang");

   private String CustomSpinner;
   private String ButtonAction;
   private String Spinner;

   NH6Z9w17OZ4tCqdtH18E2MG2pmxLsV38k540qSU7ey57EMgHaEba3BsUtrDQ2hQTfA7Iy3kuIWGBRL3gi27KLghrZMgBsA5XLj(String var3, String var4, String var5) {
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Spinner = var5;
   }

   public String BatModClient() {
      return this.CustomSpinner;
   }

   public String Button() {
      return this.ButtonAction;
   }

   public String CustomSpinner() {
      return this.Spinner;
   }
}
