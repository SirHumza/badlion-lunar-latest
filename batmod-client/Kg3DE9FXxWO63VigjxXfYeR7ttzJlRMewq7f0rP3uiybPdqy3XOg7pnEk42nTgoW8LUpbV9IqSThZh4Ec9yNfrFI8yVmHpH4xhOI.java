public enum Kg3DE9FXxWO63VigjxXfYeR7ttzJlRMewq7f0rP3uiybPdqy3XOg7pnEk42nTgoW8LUpbV9IqSThZh4Ec9yNfrFI8yVmHpH4xhOI
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(
      0,
      "down_x",
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient
   ),
   Button(
      1,
      "east",
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Checkbox
   ),
   CustomSpinner(
      2,
      "west",
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner
   ),
   ButtonAction(
      3,
      "south",
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ButtonAction
   ),
   Spinner(
      4,
      "north",
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.CustomSpinner
   ),
   Checkbox(
      5,
      "up_z",
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Button
   ),
   ProgressBar(
      6,
      "up_x",
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Button
   ),
   BatModProgressBar(
      7,
      "down_z",
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient
   );

   private static final Kg3DE9FXxWO63VigjxXfYeR7ttzJlRMewq7f0rP3uiybPdqy3XOg7pnEk42nTgoW8LUpbV9IqSThZh4Ec9yNfrFI8yVmHpH4xhOI[] ColorChooser = new Kg3DE9FXxWO63VigjxXfYeR7ttzJlRMewq7f0rP3uiybPdqy3XOg7pnEk42nTgoW8LUpbV9IqSThZh4Ec9yNfrFI8yVmHpH4xhOI[values().length];
   private final int IntegerSpinner;
   private final String TextField;
   private final NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn ColorTextPane;

   Kg3DE9FXxWO63VigjxXfYeR7ttzJlRMewq7f0rP3uiybPdqy3XOg7pnEk42nTgoW8LUpbV9IqSThZh4Ec9yNfrFI8yVmHpH4xhOI(
      int var3, String var4, NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var5
   ) {
      this.IntegerSpinner = var3;
      this.TextField = var4;
      this.ColorTextPane = var5;
   }

   public int Button() {
      return this.IntegerSpinner;
   }

   public NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn CustomSpinner() {
      return this.ColorTextPane;
   }

   @Override
   public String toString() {
      return this.TextField;
   }

   public static Kg3DE9FXxWO63VigjxXfYeR7ttzJlRMewq7f0rP3uiybPdqy3XOg7pnEk42nTgoW8LUpbV9IqSThZh4Ec9yNfrFI8yVmHpH4xhOI BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= ColorChooser.length) {
         var0 = 0;
      }

      return ColorChooser[var0];
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Kg3DE9FXxWO63VigjxXfYeR7ttzJlRMewq7f0rP3uiybPdqy3XOg7pnEk42nTgoW8LUpbV9IqSThZh4Ec9yNfrFI8yVmHpH4xhOI BatModClient(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var0,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var1
   ) {
      switch (var0) {
         case BatModClient:
            switch (q6tivhyrA6sIN0iAJORWPQiQBqC6qk1hKcmNODsmgdku328e4apr6yaCtAKX0VrIQXAvjIXCN5cqmUL2QEnTCgY2mIAmKzgb12yt.CustomSpinner[var1.ColorTextPane()
               .ordinal()]) {
               case 1:
                  return BatModClient;
               case 2:
                  return BatModProgressBar;
               default:
                  throw new IllegalArgumentException("Invalid entityFacing " + var1 + " for facing " + var0);
            }
         case Button:
            switch (q6tivhyrA6sIN0iAJORWPQiQBqC6qk1hKcmNODsmgdku328e4apr6yaCtAKX0VrIQXAvjIXCN5cqmUL2QEnTCgY2mIAmKzgb12yt.CustomSpinner[var1.ColorTextPane()
               .ordinal()]) {
               case 1:
                  return ProgressBar;
               case 2:
                  return Checkbox;
               default:
                  throw new IllegalArgumentException("Invalid entityFacing " + var1 + " for facing " + var0);
            }
         case CustomSpinner:
            return Spinner;
         case ButtonAction:
            return ButtonAction;
         case Spinner:
            return CustomSpinner;
         case Checkbox:
            return Button;
         default:
            throw new IllegalArgumentException("Invalid facing: " + var0);
      }
   }

   @Override
   public String BatModClient() {
      return this.TextField;
   }

   static {
      for (Kg3DE9FXxWO63VigjxXfYeR7ttzJlRMewq7f0rP3uiybPdqy3XOg7pnEk42nTgoW8LUpbV9IqSThZh4Ec9yNfrFI8yVmHpH4xhOI var3 : values()) {
         ColorChooser[var3.Button()] = var3;
      }
   }
}
