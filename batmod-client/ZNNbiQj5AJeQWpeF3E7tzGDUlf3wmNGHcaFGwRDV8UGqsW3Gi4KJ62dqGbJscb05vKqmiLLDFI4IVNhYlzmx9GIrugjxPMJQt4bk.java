public enum ZNNbiQj5AJeQWpeF3E7tzGDUlf3wmNGHcaFGwRDV8UGqsW3Gi4KJ62dqGbJscb05vKqmiLLDFI4IVNhYlzmx9GIrugjxPMJQt4bk
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "prismarine", "rough"),
   Button(1, "prismarine_bricks", "bricks"),
   CustomSpinner(2, "dark_prismarine", "dark");

   private static final ZNNbiQj5AJeQWpeF3E7tzGDUlf3wmNGHcaFGwRDV8UGqsW3Gi4KJ62dqGbJscb05vKqmiLLDFI4IVNhYlzmx9GIrugjxPMJQt4bk[] ButtonAction = new ZNNbiQj5AJeQWpeF3E7tzGDUlf3wmNGHcaFGwRDV8UGqsW3Gi4KJ62dqGbJscb05vKqmiLLDFI4IVNhYlzmx9GIrugjxPMJQt4bk[values().length];
   private final int Spinner;
   private final String Checkbox;
   private final String ProgressBar;

   ZNNbiQj5AJeQWpeF3E7tzGDUlf3wmNGHcaFGwRDV8UGqsW3Gi4KJ62dqGbJscb05vKqmiLLDFI4IVNhYlzmx9GIrugjxPMJQt4bk(int var3, String var4, String var5) {
      this.Spinner = var3;
      this.Checkbox = var4;
      this.ProgressBar = var5;
   }

   public int Button() {
      return this.Spinner;
   }

   @Override
   public String toString() {
      return this.Checkbox;
   }

   public static ZNNbiQj5AJeQWpeF3E7tzGDUlf3wmNGHcaFGwRDV8UGqsW3Gi4KJ62dqGbJscb05vKqmiLLDFI4IVNhYlzmx9GIrugjxPMJQt4bk BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= ButtonAction.length) {
         var0 = 0;
      }

      return ButtonAction[var0];
   }

   @Override
   public String BatModClient() {
      return this.Checkbox;
   }

   public String CustomSpinner() {
      return this.ProgressBar;
   }

   static {
      for (ZNNbiQj5AJeQWpeF3E7tzGDUlf3wmNGHcaFGwRDV8UGqsW3Gi4KJ62dqGbJscb05vKqmiLLDFI4IVNhYlzmx9GIrugjxPMJQt4bk var3 : values()) {
         ButtonAction[var3.Button()] = var3;
      }
   }
}
