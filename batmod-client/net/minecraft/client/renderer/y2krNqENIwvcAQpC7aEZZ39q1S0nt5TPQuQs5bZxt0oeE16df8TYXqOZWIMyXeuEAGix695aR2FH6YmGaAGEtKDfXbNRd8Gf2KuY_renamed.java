package net.minecraft.client.renderer;

enum BatModProgressBar {
   BatModClient("DOWN", 0, 0, 1, 2, 3),
   Button("UP", 1, 2, 3, 0, 1),
   CustomSpinner("NORTH", 2, 3, 0, 1, 2),
   ButtonAction("SOUTH", 3, 0, 1, 2, 3),
   Spinner("WEST", 4, 3, 0, 1, 2),
   Checkbox("EAST", 5, 1, 2, 3, 0);

   private final int ProgressBar;
   private final int BatModProgressBar;
   private final int ColorChooser;
   private final int IntegerSpinner;
   private static final net.minecraft.client.renderer.BatModProgressBar[] TextField = new net.minecraft.client.renderer.BatModProgressBar[6];
   private static final net.minecraft.client.renderer.BatModProgressBar[] ColorTextPane = new net.minecraft.client.renderer.BatModProgressBar[]{
      BatModClient,
      Button,
      CustomSpinner,
      ButtonAction,
      Spinner,
      Checkbox
   };
   private static final String BatModInstallerMain = "CL_00002514";

   BatModProgressBar(
      String var3, int var4, int var5, int var6, int var7, int var8
   ) {
      this.ProgressBar = var5;
      this.BatModProgressBar = var6;
      this.ColorChooser = var7;
      this.IntegerSpinner = var8;
   }

   public static net.minecraft.client.renderer.BatModProgressBar BatModClient(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var0
   ) {
      return TextField[var0.Button()];
   }

   static {
      TextField[NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient
         .Button()] = BatModClient;
      TextField[NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Button
         .Button()] = Button;
      TextField[NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.CustomSpinner
         .Button()] = CustomSpinner;
      TextField[NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ButtonAction
         .Button()] = ButtonAction;
      TextField[NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner
         .Button()] = Spinner;
      TextField[NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Checkbox
         .Button()] = Checkbox;
   }
}
