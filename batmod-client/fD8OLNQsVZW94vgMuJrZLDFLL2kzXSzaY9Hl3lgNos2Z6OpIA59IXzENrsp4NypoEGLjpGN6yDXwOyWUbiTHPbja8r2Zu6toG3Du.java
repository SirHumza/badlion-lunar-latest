class fD8OLNQsVZW94vgMuJrZLDFLL2kzXSzaY9Hl3lgNos2Z6OpIA59IXzENrsp4NypoEGLjpGN6yDXwOyWUbiTHPbja8r2Zu6toG3Du {
   public Class BatModClient;
   public final int Button;
   public int CustomSpinner;
   public int ButtonAction;
   public boolean Spinner;

   public fD8OLNQsVZW94vgMuJrZLDFLL2kzXSzaY9Hl3lgNos2Z6OpIA59IXzENrsp4NypoEGLjpGN6yDXwOyWUbiTHPbja8r2Zu6toG3Du(Class var1, int var2, int var3, boolean var4) {
      this.BatModClient = var1;
      this.Button = var2;
      this.ButtonAction = var3;
      this.Spinner = var4;
   }

   public fD8OLNQsVZW94vgMuJrZLDFLL2kzXSzaY9Hl3lgNos2Z6OpIA59IXzENrsp4NypoEGLjpGN6yDXwOyWUbiTHPbja8r2Zu6toG3Du(Class var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   public boolean BatModClient(int var1) {
      return this.ButtonAction == 0
         || this.CustomSpinner
            < this.ButtonAction;
   }

   public boolean BatModClient() {
      return this.ButtonAction == 0
         || this.CustomSpinner
            < this.ButtonAction;
   }
}
