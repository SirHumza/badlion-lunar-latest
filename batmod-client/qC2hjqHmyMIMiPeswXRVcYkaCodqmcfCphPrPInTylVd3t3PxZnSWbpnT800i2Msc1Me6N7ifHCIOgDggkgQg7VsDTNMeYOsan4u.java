enum qC2hjqHmyMIMiPeswXRVcYkaCodqmcfCphPrPInTylVd3t3PxZnSWbpnT800i2Msc1Me6N7ifHCIOgDggkgQg7VsDTNMeYOsan4u {
   BatModClient(0.0F, 0.0F, 30, 1),
   Button(0.8F, 0.2F, 20, 10),
   CustomSpinner(1.0F, 0.45F, 14, 14),
   ButtonAction(1.75F, 0.4F, 1, 8),
   Spinner(2.0F, 0.7F, 7, 8);

   private final float Checkbox;
   private final float ProgressBar;
   private final int BatModProgressBar;
   private final int ColorChooser;

   qC2hjqHmyMIMiPeswXRVcYkaCodqmcfCphPrPInTylVd3t3PxZnSWbpnT800i2Msc1Me6N7ifHCIOgDggkgQg7VsDTNMeYOsan4u(float var3, float var4, int var5, int var6) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
      this.BatModProgressBar = var5;
      this.ColorChooser = var6;
   }

   public float BatModClient() {
      return this.Checkbox;
   }

   public float Button() {
      return this.ProgressBar;
   }

   public int CustomSpinner() {
      return this.BatModProgressBar;
   }

   public int ButtonAction() {
      return this.ColorChooser;
   }
}
