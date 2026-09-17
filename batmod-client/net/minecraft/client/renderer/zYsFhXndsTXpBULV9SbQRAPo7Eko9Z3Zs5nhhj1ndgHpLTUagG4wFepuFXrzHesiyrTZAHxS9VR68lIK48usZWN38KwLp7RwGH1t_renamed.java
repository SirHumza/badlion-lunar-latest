package net.minecraft.client.renderer;

public class InstallationLogger {
   private final int BatModClient;
   private final q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Button;
   private int CustomSpinner;
   private int ButtonAction;

   public InstallationLogger(
      int var1, q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient() {
      return this.Button;
   }

   public void BatModClient(int var1) {
      if (var1 > 10) {
         var1 = 10;
      }

      this.CustomSpinner = var1;
   }

   public int Button() {
      return this.CustomSpinner;
   }

   public void Button(int var1) {
      this.ButtonAction = var1;
   }

   public int CustomSpinner() {
      return this.ButtonAction;
   }
}
