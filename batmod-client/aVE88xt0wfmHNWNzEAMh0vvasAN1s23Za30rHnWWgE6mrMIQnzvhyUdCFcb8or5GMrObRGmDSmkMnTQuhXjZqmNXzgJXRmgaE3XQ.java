public enum aVE88xt0wfmHNWNzEAMh0vvasAN1s23Za30rHnWWgE6mrMIQnzvhyUdCFcb8or5GMrObRGmDSmkMnTQuhXjZqmNXzgJXRmgaE3XQ
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "stonebrick", "default"),
   Button(1, "mossy_stonebrick", "mossy"),
   CustomSpinner(2, "cracked_stonebrick", "cracked"),
   ButtonAction(3, "chiseled_stonebrick", "chiseled");

   private static final aVE88xt0wfmHNWNzEAMh0vvasAN1s23Za30rHnWWgE6mrMIQnzvhyUdCFcb8or5GMrObRGmDSmkMnTQuhXjZqmNXzgJXRmgaE3XQ[] Spinner = new aVE88xt0wfmHNWNzEAMh0vvasAN1s23Za30rHnWWgE6mrMIQnzvhyUdCFcb8or5GMrObRGmDSmkMnTQuhXjZqmNXzgJXRmgaE3XQ[values().length];
   private final int Checkbox;
   private final String ProgressBar;
   private final String BatModProgressBar;

   aVE88xt0wfmHNWNzEAMh0vvasAN1s23Za30rHnWWgE6mrMIQnzvhyUdCFcb8or5GMrObRGmDSmkMnTQuhXjZqmNXzgJXRmgaE3XQ(int var3, String var4, String var5) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
      this.BatModProgressBar = var5;
   }

   public int Button() {
      return this.Checkbox;
   }

   @Override
   public String toString() {
      return this.ProgressBar;
   }

   public static aVE88xt0wfmHNWNzEAMh0vvasAN1s23Za30rHnWWgE6mrMIQnzvhyUdCFcb8or5GMrObRGmDSmkMnTQuhXjZqmNXzgJXRmgaE3XQ BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= Spinner.length) {
         var0 = 0;
      }

      return Spinner[var0];
   }

   @Override
   public String BatModClient() {
      return this.ProgressBar;
   }

   public String CustomSpinner() {
      return this.BatModProgressBar;
   }

   static {
      for (aVE88xt0wfmHNWNzEAMh0vvasAN1s23Za30rHnWWgE6mrMIQnzvhyUdCFcb8or5GMrObRGmDSmkMnTQuhXjZqmNXzgJXRmgaE3XQ var3 : values()) {
         Spinner[var3.Button()] = var3;
      }
   }
}
