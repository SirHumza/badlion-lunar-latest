public enum atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15 {
   BatModClient("bm.movement", 60, 40),
   Button("key.attack", 30, 15),
   CustomSpinner("key.use", 30, 15),
   ButtonAction("key.jump", 60, 15),
   Spinner("key.sneak", 30, 15),
   Checkbox("key.sprint", 30, 15);

   private String ProgressBar;
   private int BatModProgressBar;
   private int ColorChooser;

   atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15(String var3, int var4, int var5) {
      this.ProgressBar = var3;
      this.BatModProgressBar = var4;
      this.ColorChooser = var5;
   }

   public String BatModClient() {
      return this.ProgressBar;
   }

   public int Button() {
      return this.BatModProgressBar;
   }

   public int CustomSpinner() {
      return this.ColorChooser;
   }
}
