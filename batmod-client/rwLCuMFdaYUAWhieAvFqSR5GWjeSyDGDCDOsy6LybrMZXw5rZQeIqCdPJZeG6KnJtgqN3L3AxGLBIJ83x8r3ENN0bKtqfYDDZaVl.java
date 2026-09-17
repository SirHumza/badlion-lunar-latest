class rwLCuMFdaYUAWhieAvFqSR5GWjeSyDGDCDOsy6LybrMZXw5rZQeIqCdPJZeG6KnJtgqN3L3AxGLBIJ83x8r3ENN0bKtqfYDDZaVl
   extends knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 {
   private final boolean ColorChooser;

   public rwLCuMFdaYUAWhieAvFqSR5GWjeSyDGDCDOsy6LybrMZXw5rZQeIqCdPJZeG6KnJtgqN3L3AxGLBIJ83x8r3ENN0bKtqfYDDZaVl(int var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3, 12, 19, "");
      this.ColorChooser = var4;
   }

   @Override
   public void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.ProgressBar) {
         var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            .BatModClient(
               SJ59CqYgXyuTAUD0R7ZF0qrBbw0RHC1QijDmo6MAM590GoAwD4jXEy8hCpPVtoe7WH6kidsXisvjRmliFxFvR80WbEvwvlPRVSAn.ProgressBar()
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         boolean var4 = var2 >= this.Button
            && var3 >= this.CustomSpinner
            && var2 < this.Button + this.width
            && var3 < this.CustomSpinner + this.height;
         int var5 = 0;
         int var6 = 176;
         if (!this.Checkbox) {
            var6 += this.width * 2;
         } else if (var4) {
            var6 += this.width;
         }

         if (!this.ColorChooser) {
            var5 += this.height;
         }

         this.Button(
            this.Button,
            this.CustomSpinner,
            var6,
            var5,
            this.width,
            this.height
         );
      }
   }
}
