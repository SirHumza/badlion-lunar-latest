public enum TlaUAntzzZBavaG8M7XKcyxnjnCO4SZZjTvWYm3oQ1t5EprCCLZaW4j4CepgAZw93Bwfe5Zv3P2GbUZWyZYj6Dp8L6dF0U32bb04
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "dead_bush"),
   Button(1, "tall_grass"),
   CustomSpinner(2, "fern");

   private static final TlaUAntzzZBavaG8M7XKcyxnjnCO4SZZjTvWYm3oQ1t5EprCCLZaW4j4CepgAZw93Bwfe5Zv3P2GbUZWyZYj6Dp8L6dF0U32bb04[] ButtonAction = new TlaUAntzzZBavaG8M7XKcyxnjnCO4SZZjTvWYm3oQ1t5EprCCLZaW4j4CepgAZw93Bwfe5Zv3P2GbUZWyZYj6Dp8L6dF0U32bb04[values().length];
   private final int Spinner;
   private final String Checkbox;

   TlaUAntzzZBavaG8M7XKcyxnjnCO4SZZjTvWYm3oQ1t5EprCCLZaW4j4CepgAZw93Bwfe5Zv3P2GbUZWyZYj6Dp8L6dF0U32bb04(int var3, String var4) {
      this.Spinner = var3;
      this.Checkbox = var4;
   }

   public int Button() {
      return this.Spinner;
   }

   @Override
   public String toString() {
      return this.Checkbox;
   }

   public static TlaUAntzzZBavaG8M7XKcyxnjnCO4SZZjTvWYm3oQ1t5EprCCLZaW4j4CepgAZw93Bwfe5Zv3P2GbUZWyZYj6Dp8L6dF0U32bb04 BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= ButtonAction.length) {
         var0 = 0;
      }

      return ButtonAction[var0];
   }

   @Override
   public String BatModClient() {
      return this.Checkbox;
   }

   static {
      for (TlaUAntzzZBavaG8M7XKcyxnjnCO4SZZjTvWYm3oQ1t5EprCCLZaW4j4CepgAZw93Bwfe5Zv3P2GbUZWyZYj6Dp8L6dF0U32bb04 var3 : values()) {
         ButtonAction[var3.Button()] = var3;
      }
   }
}
