public enum E3m2US9F56PD3ZlmVNv7gXDceU4Nes1aICknJWdjpztCABQvNASpLHhLsp5RLrW9lExrxfRLXdovaEGTTSGrIOWwhzT6XU7OSOIO {
   BatModClient(4, "Float", 5126),
   Button(1, "Unsigned Byte", 5121),
   CustomSpinner(1, "Byte", 5120),
   ButtonAction(2, "Unsigned Short", 5123),
   Spinner(2, "Short", 5122),
   Checkbox(4, "Unsigned Int", 5125),
   ProgressBar(4, "Int", 5124);

   private final int BatModProgressBar;
   private final String ColorChooser;
   private final int IntegerSpinner;

   E3m2US9F56PD3ZlmVNv7gXDceU4Nes1aICknJWdjpztCABQvNASpLHhLsp5RLrW9lExrxfRLXdovaEGTTSGrIOWwhzT6XU7OSOIO(int var3, String var4, int var5) {
      this.BatModProgressBar = var3;
      this.ColorChooser = var4;
      this.IntegerSpinner = var5;
   }

   public int BatModClient() {
      return this.BatModProgressBar;
   }

   public String Button() {
      return this.ColorChooser;
   }

   public int CustomSpinner() {
      return this.IntegerSpinner;
   }
}
