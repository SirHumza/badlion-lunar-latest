public enum p0izfILj9LaZJpoKoIp1TOfLyQjUP6fBh7kJQgW86eWQH7AKQhPcZpRx6Z4UmGUyQKHdbi988WRx90aowjQLdAHcHjKDeMcrP5mk
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "sandstone", "default"),
   Button(1, "chiseled_sandstone", "chiseled"),
   CustomSpinner(2, "smooth_sandstone", "smooth");

   private static final p0izfILj9LaZJpoKoIp1TOfLyQjUP6fBh7kJQgW86eWQH7AKQhPcZpRx6Z4UmGUyQKHdbi988WRx90aowjQLdAHcHjKDeMcrP5mk[] ButtonAction = new p0izfILj9LaZJpoKoIp1TOfLyQjUP6fBh7kJQgW86eWQH7AKQhPcZpRx6Z4UmGUyQKHdbi988WRx90aowjQLdAHcHjKDeMcrP5mk[values().length];
   private final int Spinner;
   private final String Checkbox;
   private final String ProgressBar;

   p0izfILj9LaZJpoKoIp1TOfLyQjUP6fBh7kJQgW86eWQH7AKQhPcZpRx6Z4UmGUyQKHdbi988WRx90aowjQLdAHcHjKDeMcrP5mk(int var3, String var4, String var5) {
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

   public static p0izfILj9LaZJpoKoIp1TOfLyQjUP6fBh7kJQgW86eWQH7AKQhPcZpRx6Z4UmGUyQKHdbi988WRx90aowjQLdAHcHjKDeMcrP5mk BatModClient(
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
      for (p0izfILj9LaZJpoKoIp1TOfLyQjUP6fBh7kJQgW86eWQH7AKQhPcZpRx6Z4UmGUyQKHdbi988WRx90aowjQLdAHcHjKDeMcrP5mk var3 : values()) {
         ButtonAction[var3.Button()] = var3;
      }
   }
}
