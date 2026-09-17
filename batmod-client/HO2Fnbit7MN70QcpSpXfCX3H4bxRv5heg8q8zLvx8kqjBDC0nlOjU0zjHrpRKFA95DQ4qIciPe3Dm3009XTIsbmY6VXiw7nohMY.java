public enum HO2Fnbit7MN70QcpSpXfCX3H4bxRv5heg8q8zLvx8kqjBDC0nlOjU0zjHrpRKFA95DQ4qIciPe3Dm3009XTIsbmY6VXiw7nohMY
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "sunflower"),
   Button(1, "syringa"),
   CustomSpinner(2, "double_grass", "grass"),
   ButtonAction(3, "double_fern", "fern"),
   Spinner(4, "double_rose", "rose"),
   Checkbox(5, "paeonia");

   private static final HO2Fnbit7MN70QcpSpXfCX3H4bxRv5heg8q8zLvx8kqjBDC0nlOjU0zjHrpRKFA95DQ4qIciPe3Dm3009XTIsbmY6VXiw7nohMY[] ProgressBar = new HO2Fnbit7MN70QcpSpXfCX3H4bxRv5heg8q8zLvx8kqjBDC0nlOjU0zjHrpRKFA95DQ4qIciPe3Dm3009XTIsbmY6VXiw7nohMY[values().length];
   private final int BatModProgressBar;
   private final String ColorChooser;
   private final String IntegerSpinner;

   HO2Fnbit7MN70QcpSpXfCX3H4bxRv5heg8q8zLvx8kqjBDC0nlOjU0zjHrpRKFA95DQ4qIciPe3Dm3009XTIsbmY6VXiw7nohMY(int var3, String var4) {
      this(var3, var4, var4);
   }

   HO2Fnbit7MN70QcpSpXfCX3H4bxRv5heg8q8zLvx8kqjBDC0nlOjU0zjHrpRKFA95DQ4qIciPe3Dm3009XTIsbmY6VXiw7nohMY(int var3, String var4, String var5) {
      this.BatModProgressBar = var3;
      this.ColorChooser = var4;
      this.IntegerSpinner = var5;
   }

   public int Button() {
      return this.BatModProgressBar;
   }

   @Override
   public String toString() {
      return this.ColorChooser;
   }

   public static HO2Fnbit7MN70QcpSpXfCX3H4bxRv5heg8q8zLvx8kqjBDC0nlOjU0zjHrpRKFA95DQ4qIciPe3Dm3009XTIsbmY6VXiw7nohMY BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= ProgressBar.length) {
         var0 = 0;
      }

      return ProgressBar[var0];
   }

   @Override
   public String BatModClient() {
      return this.ColorChooser;
   }

   public String CustomSpinner() {
      return this.IntegerSpinner;
   }

   static {
      for (HO2Fnbit7MN70QcpSpXfCX3H4bxRv5heg8q8zLvx8kqjBDC0nlOjU0zjHrpRKFA95DQ4qIciPe3Dm3009XTIsbmY6VXiw7nohMY var3 : values()) {
         ProgressBar[var3.Button()] = var3;
      }
   }
}
