public class XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA {
   public final int BatModClient;
   public final int Button;
   public final int CustomSpinner;
   private final int IntegerSpinner;
   int ButtonAction = -1;
   float Spinner;
   float Checkbox;
   float ProgressBar;
   XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA BatModProgressBar;
   public boolean ColorChooser;

   public XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA(int var1, int var2, int var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.IntegerSpinner = BatModClient(
         var1, var2, var3
      );
   }

   public static int BatModClient(int var0, int var1, int var2) {
      return var1 & 0xFF | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 < 0 ? Integer.MIN_VALUE : 0) | (var2 < 0 ? 32768 : 0);
   }

   public float BatModClient(
      XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var1
   ) {
      float var2 = var1.BatModClient
         - this.BatModClient;
      float var3 = var1.Button
         - this.Button;
      float var4 = var1.CustomSpinner
         - this.CustomSpinner;
      return u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var2 * var2 + var3 * var3 + var4 * var4
      );
   }

   public float Button(
      XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var1
   ) {
      float var2 = var1.BatModClient
         - this.BatModClient;
      float var3 = var1.Button
         - this.Button;
      float var4 = var1.CustomSpinner
         - this.CustomSpinner;
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA)) {
         return false;
      }

      XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var2 = (XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA)var1;
      return this.IntegerSpinner
            == var2.IntegerSpinner
         && this.BatModClient
            == var2.BatModClient
         && this.Button
            == var2.Button
         && this.CustomSpinner
            == var2.CustomSpinner;
   }

   @Override
   public int hashCode() {
      return this.IntegerSpinner;
   }

   public boolean BatModClient() {
      return this.ButtonAction >= 0;
   }

   @Override
   public String toString() {
      return this.BatModClient
         + ", "
         + this.Button
         + ", "
         + this.CustomSpinner;
   }
}
