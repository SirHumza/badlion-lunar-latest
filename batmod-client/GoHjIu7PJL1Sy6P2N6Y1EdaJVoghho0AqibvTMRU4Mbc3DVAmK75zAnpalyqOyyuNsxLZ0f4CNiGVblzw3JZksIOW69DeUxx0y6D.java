public enum GoHjIu7PJL1Sy6P2N6Y1EdaJVoghho0AqibvTMRU4Mbc3DVAmK75zAnpalyqOyyuNsxLZ0f4CNiGVblzw3JZksIOW69DeUxx0y6D
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "cobblestone", "normal"),
   Button(1, "mossy_cobblestone", "mossy");

   private static final GoHjIu7PJL1Sy6P2N6Y1EdaJVoghho0AqibvTMRU4Mbc3DVAmK75zAnpalyqOyyuNsxLZ0f4CNiGVblzw3JZksIOW69DeUxx0y6D[] CustomSpinner = new GoHjIu7PJL1Sy6P2N6Y1EdaJVoghho0AqibvTMRU4Mbc3DVAmK75zAnpalyqOyyuNsxLZ0f4CNiGVblzw3JZksIOW69DeUxx0y6D[values().length];
   private final int ButtonAction;
   private final String Spinner;
   private String Checkbox;

   GoHjIu7PJL1Sy6P2N6Y1EdaJVoghho0AqibvTMRU4Mbc3DVAmK75zAnpalyqOyyuNsxLZ0f4CNiGVblzw3JZksIOW69DeUxx0y6D(int var3, String var4, String var5) {
      this.ButtonAction = var3;
      this.Spinner = var4;
      this.Checkbox = var5;
   }

   public int Button() {
      return this.ButtonAction;
   }

   @Override
   public String toString() {
      return this.Spinner;
   }

   public static GoHjIu7PJL1Sy6P2N6Y1EdaJVoghho0AqibvTMRU4Mbc3DVAmK75zAnpalyqOyyuNsxLZ0f4CNiGVblzw3JZksIOW69DeUxx0y6D BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= CustomSpinner.length) {
         var0 = 0;
      }

      return CustomSpinner[var0];
   }

   @Override
   public String BatModClient() {
      return this.Spinner;
   }

   public String CustomSpinner() {
      return this.Checkbox;
   }

   static {
      for (GoHjIu7PJL1Sy6P2N6Y1EdaJVoghho0AqibvTMRU4Mbc3DVAmK75zAnpalyqOyyuNsxLZ0f4CNiGVblzw3JZksIOW69DeUxx0y6D var3 : values()) {
         CustomSpinner[var3.Button()] = var3;
      }
   }
}
