public enum jARiiWe5uE2cgYvcdYdag8SFUNySNGeXaEihISMfzJz09oVTdEIot90ygAFnjsAZAkQHxOmBu02x3dgB6hMXgDYGEZHzjfcoamuO
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(0, "north_south"),
   Button(1, "east_west"),
   CustomSpinner(2, "ascending_east"),
   ButtonAction(3, "ascending_west"),
   Spinner(4, "ascending_north"),
   Checkbox(5, "ascending_south"),
   ProgressBar(6, "south_east"),
   BatModProgressBar(7, "south_west"),
   ColorChooser(8, "north_west"),
   IntegerSpinner(9, "north_east");

   private static final jARiiWe5uE2cgYvcdYdag8SFUNySNGeXaEihISMfzJz09oVTdEIot90ygAFnjsAZAkQHxOmBu02x3dgB6hMXgDYGEZHzjfcoamuO[] TextField = new jARiiWe5uE2cgYvcdYdag8SFUNySNGeXaEihISMfzJz09oVTdEIot90ygAFnjsAZAkQHxOmBu02x3dgB6hMXgDYGEZHzjfcoamuO[values().length];
   private final int ColorTextPane;
   private final String BatModInstallerMain;

   jARiiWe5uE2cgYvcdYdag8SFUNySNGeXaEihISMfzJz09oVTdEIot90ygAFnjsAZAkQHxOmBu02x3dgB6hMXgDYGEZHzjfcoamuO(int var3, String var4) {
      this.ColorTextPane = var3;
      this.BatModInstallerMain = var4;
   }

   public int Button() {
      return this.ColorTextPane;
   }

   @Override
   public String toString() {
      return this.BatModInstallerMain;
   }

   public boolean CustomSpinner() {
      return this == Spinner
         || this == CustomSpinner
         || this == Checkbox
         || this == ButtonAction;
   }

   public static jARiiWe5uE2cgYvcdYdag8SFUNySNGeXaEihISMfzJz09oVTdEIot90ygAFnjsAZAkQHxOmBu02x3dgB6hMXgDYGEZHzjfcoamuO BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= TextField.length) {
         var0 = 0;
      }

      return TextField[var0];
   }

   @Override
   public String BatModClient() {
      return this.BatModInstallerMain;
   }

   static {
      for (jARiiWe5uE2cgYvcdYdag8SFUNySNGeXaEihISMfzJz09oVTdEIot90ygAFnjsAZAkQHxOmBu02x3dgB6hMXgDYGEZHzjfcoamuO var3 : values()) {
         TextField[var3.Button()] = var3;
      }
   }
}
