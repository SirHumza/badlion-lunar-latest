public enum hKxgqI5lzzy9MUJFJlOePrdVzeANRa6mR6SJHX3PX9gukJFnmUPC9YhNQcay5bJXW7J5ah59RzdmSQZwIgmeQmvfExsxEZOsaOOY
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "default", "default"),
   Button(1, "chiseled", "chiseled"),
   CustomSpinner(2, "lines_y", "lines"),
   ButtonAction(3, "lines_x", "lines"),
   Spinner(4, "lines_z", "lines");

   private static final hKxgqI5lzzy9MUJFJlOePrdVzeANRa6mR6SJHX3PX9gukJFnmUPC9YhNQcay5bJXW7J5ah59RzdmSQZwIgmeQmvfExsxEZOsaOOY[] Checkbox = new hKxgqI5lzzy9MUJFJlOePrdVzeANRa6mR6SJHX3PX9gukJFnmUPC9YhNQcay5bJXW7J5ah59RzdmSQZwIgmeQmvfExsxEZOsaOOY[values().length];
   private final int ProgressBar;
   private final String BatModProgressBar;
   private final String ColorChooser;

   hKxgqI5lzzy9MUJFJlOePrdVzeANRa6mR6SJHX3PX9gukJFnmUPC9YhNQcay5bJXW7J5ah59RzdmSQZwIgmeQmvfExsxEZOsaOOY(int var3, String var4, String var5) {
      this.ProgressBar = var3;
      this.BatModProgressBar = var4;
      this.ColorChooser = var5;
   }

   public int Button() {
      return this.ProgressBar;
   }

   @Override
   public String toString() {
      return this.ColorChooser;
   }

   public static hKxgqI5lzzy9MUJFJlOePrdVzeANRa6mR6SJHX3PX9gukJFnmUPC9YhNQcay5bJXW7J5ah59RzdmSQZwIgmeQmvfExsxEZOsaOOY BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= Checkbox.length) {
         var0 = 0;
      }

      return Checkbox[var0];
   }

   @Override
   public String BatModClient() {
      return this.BatModProgressBar;
   }

   static {
      for (hKxgqI5lzzy9MUJFJlOePrdVzeANRa6mR6SJHX3PX9gukJFnmUPC9YhNQcay5bJXW7J5ah59RzdmSQZwIgmeQmvfExsxEZOsaOOY var3 : values()) {
         Checkbox[var3.Button()] = var3;
      }
   }
}
