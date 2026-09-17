public abstract class tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5 {
   protected final float BatModClient;
   protected final float Button;
   protected final float CustomSpinner;
   protected float ButtonAction;
   protected long Spinner;

   public tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5(float var1, float var2, float var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction();
   }

   public void BatModClient(boolean var1) {
      if (var1) {
         if (this.ButtonAction
            < this.Button) {
            this.ButtonAction = this.ButtonAction
               + (float)(System.currentTimeMillis() - this.Spinner)
                  * this.CustomSpinner;
            if (this.ButtonAction
               > this.Button) {
               this.ButtonAction = this.Button;
            }
         }
      } else if (this.ButtonAction
         > this.BatModClient) {
         this.ButtonAction = this.ButtonAction
            - (float)(System.currentTimeMillis() - this.Spinner)
               * this.CustomSpinner;
         if (this.ButtonAction
            < this.BatModClient) {
            this.ButtonAction = this.BatModClient;
         }
      }

      this.Spinner = System.currentTimeMillis();
   }

   public void BatModClient(float var1) {
      this.ButtonAction = var1;
   }

   public float CustomSpinner() {
      return this.ButtonAction;
   }

   public void ButtonAction() {
      this.ButtonAction = 0.0F;
      this.Spinner = System.currentTimeMillis();
   }

   public long Spinner() {
      return this.Spinner;
   }

   public boolean Checkbox() {
      return this.ButtonAction
            == this.BatModClient
         || this.ButtonAction
            == this.Button;
   }
}
