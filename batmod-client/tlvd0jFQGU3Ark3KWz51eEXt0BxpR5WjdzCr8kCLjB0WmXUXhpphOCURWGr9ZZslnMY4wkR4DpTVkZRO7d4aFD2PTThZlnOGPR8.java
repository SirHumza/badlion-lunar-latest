public enum tlvd0jFQGU3Ark3KWz51eEXt0BxpR5WjdzCr8kCLjB0WmXUXhpphOCURWGr9ZZslnMY4wkR4DpTVkZRO7d4aFD2PTThZlnOGPR8
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "red_sandstone", "default"),
   Button(1, "chiseled_red_sandstone", "chiseled"),
   CustomSpinner(2, "smooth_red_sandstone", "smooth");

   private static final tlvd0jFQGU3Ark3KWz51eEXt0BxpR5WjdzCr8kCLjB0WmXUXhpphOCURWGr9ZZslnMY4wkR4DpTVkZRO7d4aFD2PTThZlnOGPR8[] ButtonAction = new tlvd0jFQGU3Ark3KWz51eEXt0BxpR5WjdzCr8kCLjB0WmXUXhpphOCURWGr9ZZslnMY4wkR4DpTVkZRO7d4aFD2PTThZlnOGPR8[values().length];
   private final int Spinner;
   private final String Checkbox;
   private final String ProgressBar;

   tlvd0jFQGU3Ark3KWz51eEXt0BxpR5WjdzCr8kCLjB0WmXUXhpphOCURWGr9ZZslnMY4wkR4DpTVkZRO7d4aFD2PTThZlnOGPR8(int var3, String var4, String var5) {
      this.Spinner = var3;
      this.Checkbox = var4;
      this.ProgressBar = var5;
   }

   public int Button() {
      return this.Spinner;
   }

   @Override
   public String toString() {
      return this.Checkbox;
   }

   public static tlvd0jFQGU3Ark3KWz51eEXt0BxpR5WjdzCr8kCLjB0WmXUXhpphOCURWGr9ZZslnMY4wkR4DpTVkZRO7d4aFD2PTThZlnOGPR8 BatModClient(
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

   public String CustomSpinner() {
      return this.ProgressBar;
   }

   static {
      for (tlvd0jFQGU3Ark3KWz51eEXt0BxpR5WjdzCr8kCLjB0WmXUXhpphOCURWGr9ZZslnMY4wkR4DpTVkZRO7d4aFD2PTThZlnOGPR8 var3 : values()) {
         ButtonAction[var3.Button()] = var3;
      }
   }
}
