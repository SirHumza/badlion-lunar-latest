package com.batmod.gui.button;

public class GuiKeyBindingButton extends knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 {
   private final int height = 20;
   private final int width = 75;
   private final String ColorChooser;

   public GuiKeyBindingButton(int var1, String var2) {
      this(var1, 0, 0, var2);
   }

   public GuiKeyBindingButton(int var1, int var2, int var3, String var4) {
      super(
         var1,
         var2,
         var3,
         75,
         20,
         BatModClient.BatModClient()
            .ProgressBar()
            .CustomSpinner(var4)
      );
      this.ColorChooser = var4;
   }

   public void BatModClient(int var1) {
      y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY var2 = BatModClient.BatModClient()
         .ProgressBar();
      var2.BatModClient(
         this.ColorChooser, var1
      );
      var2.Button();
      this.ButtonAction = var2.CustomSpinner(
         this.ColorChooser
      );
   }

   public String BatModClient() {
      return this.ColorChooser;
   }
}
