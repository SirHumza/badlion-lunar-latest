public enum RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "stone"),
   Button(1, "cobblestone", "cobble"),
   CustomSpinner(2, "stone_brick", "brick"),
   ButtonAction(3, "mossy_brick", "mossybrick"),
   Spinner(4, "cracked_brick", "crackedbrick"),
   Checkbox(5, "chiseled_brick", "chiseledbrick");

   private static final RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX[] ProgressBar = new RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX[values().length];
   private final int BatModProgressBar;
   private final String ColorChooser;
   private final String IntegerSpinner;

   RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX(int var3, String var4) {
      this(var3, var4, var4);
   }

   RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX(int var3, String var4, String var5) {
      this.BatModProgressBar = var3;
      this.ColorChooser = var4;
      this.IntegerSpinner = var5;
   }

   public int Button() {
      return this.BatModProgressBar;
   }

   @Override
   public String toString() {
      return this.ColorChooser;
   }

   public static RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= ProgressBar.length) {
         var0 = 0;
      }

      return ProgressBar[var0];
   }

   @Override
   public String BatModClient() {
      return this.ColorChooser;
   }

   public String CustomSpinner() {
      return this.IntegerSpinner;
   }

   public abstract jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS ButtonAction();

   public static RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX BatModClient(
      jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var0
   ) {
      for (RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX var4 : values()) {
         if (var0 == var4.ButtonAction()) {
            return var4;
         }
      }

      return BatModClient;
   }

   static {
      for (RnqSgd5P4UFNmnePftVmbMEBZQaqMWcUjhHfghQAxt7Bb8ye0e0d0cHE6giWsuHBd0bcyKAZ6TJ6YqhdCx5arvHMb1pA1HWnPdJX var3 : values()) {
         ProgressBar[var3.Button()] = var3;
      }
   }
}
