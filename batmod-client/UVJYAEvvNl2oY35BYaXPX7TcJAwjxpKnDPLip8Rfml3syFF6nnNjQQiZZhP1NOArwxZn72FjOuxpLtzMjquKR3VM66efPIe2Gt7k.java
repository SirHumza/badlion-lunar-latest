public enum UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k {
   BatModClient(0, "options.chat.visibility.full"),
   Button(1, "options.chat.visibility.system"),
   CustomSpinner(2, "options.chat.visibility.hidden");

   private static final UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k[] ButtonAction = new UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k[values().length];
   private final int Spinner;
   private final String Checkbox;

   UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k(int var3, String var4) {
      this.Spinner = var3;
      this.Checkbox = var4;
   }

   public int BatModClient() {
      return this.Spinner;
   }

   public static UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k BatModClient(
      int var0
   ) {
      return ButtonAction[var0
         % ButtonAction.length];
   }

   public String Button() {
      return this.Checkbox;
   }

   static {
      for (UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k var3 : values()) {
         ButtonAction[var3.Spinner] = var3;
      }
   }
}
