enum YAqw0XSG6lzJzR5XVUmJ6KZNHbGoUDLKanDb14Kp6UYYTGBg528SyaY4mA4qAK9CHBrOmCtDKp7Lf5NyKWPGfm6dq8nP5ruuxI91 {
   BatModClient(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Button,
      0,
      -1
   ),
   Button(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient,
      0,
      1
   ),
   CustomSpinner(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Checkbox,
      -1,
      0
   ),
   ButtonAction(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner,
      1,
      0
   );

   private final NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn Spinner;
   private final int Checkbox;
   private final int ProgressBar;

   YAqw0XSG6lzJzR5XVUmJ6KZNHbGoUDLKanDb14Kp6UYYTGBg528SyaY4mA4qAK9CHBrOmCtDKp7Lf5NyKWPGfm6dq8nP5ruuxI91(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var3, int var4, int var5
   ) {
      this.Spinner = var3;
      this.Checkbox = var4;
      this.ProgressBar = var5;
   }

   public NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn BatModClient() {
      return this.Spinner;
   }

   public int Button() {
      return this.Checkbox;
   }

   public int CustomSpinner() {
      return this.ProgressBar;
   }

   private boolean ButtonAction() {
      return this == Button
         || this == BatModClient;
   }
}
