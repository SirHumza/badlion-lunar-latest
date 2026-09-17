public class tExlAH8JTVcSK56yRZ7j3es4lkIG9LYmMM7bRbBcV3wrCS4MsiQHMLzBRADRDgcWQQ1KP8nBR8enS5B0NYYsaSuWqvtm3tlnQdYk {
   private final q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient;
   private final q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Button;
   private final NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn CustomSpinner;
   private int ButtonAction;
   private boolean Spinner;
   private int Checkbox;

   public tExlAH8JTVcSK56yRZ7j3es4lkIG9LYmMM7bRbBcV3wrCS4MsiQHMLzBRADRDgcWQQ1KP8nBR8enS5B0NYYsaSuWqvtm3tlnQdYk(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1, int var2, int var3, int var4
   ) {
      this(var1, BatModClient(var2, var3), var4);
   }

   private static NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn BatModClient(
      int var0, int var1
   ) {
      return var0 < 0
         ? NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner
         : (
            var0 > 0
               ? NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Checkbox
               : (
                  var1 < 0
                     ? NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.CustomSpinner
                     : NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ButtonAction
               )
         );
   }

   public tExlAH8JTVcSK56yRZ7j3es4lkIG9LYmMM7bRbBcV3wrCS4MsiQHMLzBRADRDgcWQQ1KP8nBR8enS5B0NYYsaSuWqvtm3tlnQdYk(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2,
      int var3
   ) {
      this.BatModClient = var1;
      this.CustomSpinner = var2;
      this.Button = var1.BatModClient(
         var2, 2
      );
      this.ButtonAction = var3;
   }

   public int BatModClient(int var1, int var2, int var3) {
      return (int)this.BatModClient
         .Button(var1, var2, var3);
   }

   public int BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return (int)var1.Checkbox(
         this.ButtonAction()
      );
   }

   public int Button(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return (int)this.Button
         .Checkbox(var1);
   }

   public boolean CustomSpinner(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      int var2 = var1.BatModProgressBar()
         - this.BatModClient
            .BatModProgressBar();
      int var3 = var1.IntegerSpinner()
         - this.BatModClient
            .ColorChooser();
      return var2
               * this.CustomSpinner
                  .BatModProgressBar()
            + var3
               * this.CustomSpinner
                  .IntegerSpinner()
         >= 0;
   }

   public void BatModClient() {
      this.Checkbox = 0;
   }

   public void Button() {
      this.Checkbox++;
   }

   public int CustomSpinner() {
      return this.Checkbox;
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW ButtonAction() {
      return this.BatModClient;
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Spinner() {
      return this.Button;
   }

   public int Checkbox() {
      return this.CustomSpinner
            .BatModProgressBar()
         * 2;
   }

   public int ProgressBar() {
      return this.CustomSpinner
            .IntegerSpinner()
         * 2;
   }

   public int BatModProgressBar() {
      return this.ButtonAction;
   }

   public void BatModClient(int var1) {
      this.ButtonAction = var1;
   }

   public boolean ColorChooser() {
      return this.Spinner;
   }

   public void BatModClient(boolean var1) {
      this.Spinner = var1;
   }
}
