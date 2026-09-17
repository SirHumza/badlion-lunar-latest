class g50oYV5osyDIBv1neilWvX2AgeiqFxq0Zblr2Dj3vehLLCZeAvx6YsdrhrR9WwckniT8NMp8JFJeRBTCMgKBurBEGSqxNkn93yrN
   extends knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 {
   private final boolean ColorChooser;

   public g50oYV5osyDIBv1neilWvX2AgeiqFxq0Zblr2Dj3vehLLCZeAvx6YsdrhrR9WwckniT8NMp8JFJeRBTCMgKBurBEGSqxNkn93yrN(int var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3, 23, 13, "");
      this.ColorChooser = var4;
   }

   @Override
   public void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.ProgressBar) {
         boolean var4 = var2 >= this.Button
            && var3 >= this.CustomSpinner
            && var2 < this.Button + this.width
            && var3 < this.CustomSpinner + this.height;
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            .BatModClient(
               gcTz4AxHVPtHlTnwxbiJ3GPhhTg8wqnfmnn5Pr4JKEwDxlpZWFfHQb3n5dcrWkS9YUx1l3CmxJLHEDRTtBwAqZcxbcMAglKvl9UD.Checkbox()
            );
         byte var5 = 0;
         short var6 = 192;
         if (var4) {
            var5 += 23;
         }

         if (!this.ColorChooser) {
            var6 += 13;
         }

         this.Button(
            this.Button,
            this.CustomSpinner,
            var5,
            var6,
            23,
            13
         );
      }
   }
}
