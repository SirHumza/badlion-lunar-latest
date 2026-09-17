public class XwgXXSoM8Eidt8gAKnjfxObsLbJEKr1HB50A2osifMVLauzgBBlewdqPQ3BG0MKYhbeobIFhPil7WD27dkxXByqhl5229jPdFjiO {
   private XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA[] BatModClient = new XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA[1024];
   private int Button;

   public XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA BatModClient(
      XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var1
   ) {
      if (var1.ButtonAction >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      }

      if (this.Button
         == this.BatModClient.length) {
         XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA[] var2 = new XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA[this.Button
            << 1];
         System.arraycopy(
            this.BatModClient,
            0,
            var2,
            0,
            this.Button
         );
         this.BatModClient = var2;
      }

      this.BatModClient[this.Button] = var1;
      var1.ButtonAction = this.Button;
      this.BatModClient(
         this.Button++
      );
      return var1;
   }

   public void BatModClient() {
      this.Button = 0;
   }

   public XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA Button() {
      XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var1 = this.BatModClient[0];
      this.BatModClient[0] = this.BatModClient[--this.Button];
      this.BatModClient[this.Button] = null;
      if (this.Button > 0) {
         this.Button(0);
      }

      var1.ButtonAction = -1;
      return var1;
   }

   public void BatModClient(
      XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var1, float var2
   ) {
      float var3 = var1.ProgressBar;
      var1.ProgressBar = var2;
      if (var2 < var3) {
         this.BatModClient(
            var1.ButtonAction
         );
      } else {
         this.Button(
            var1.ButtonAction
         );
      }
   }

   private void BatModClient(int var1) {
      XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var2 = this.BatModClient[var1];
      float var4 = var2.ProgressBar;

      while (var1 > 0) {
         int var3 = var1 - 1 >> 1;
         XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var5 = this.BatModClient[var3];
         if (var4 >= var5.ProgressBar) {
            break;
         }

         this.BatModClient[var1] = var5;
         var5.ButtonAction = var1;
         var1 = var3;
      }

      this.BatModClient[var1] = var2;
      var2.ButtonAction = var1;
   }

   private void Button(int var1) {
      XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var2 = this.BatModClient[var1];
      float var3 = var2.ProgressBar;

      while (true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if (var4 >= this.Button) {
            break;
         }

         XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var6 = this.BatModClient[var4];
         float var7 = var6.ProgressBar;
         XYk5yjzTqp6zpKMcPm4AnRTV5VogQGfmSD1oeYonXRHto4iXqh4aiSkn5geMIZymB5b9G21dL5prQnDIp00Th4ZLxoXEsSsXdpZA var8;
         float var9;
         if (var5 >= this.Button) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.BatModClient[var5];
            var9 = var8.ProgressBar;
         }

         if (var7 < var9) {
            if (var7 >= var3) {
               break;
            }

            this.BatModClient[var1] = var6;
            var6.ButtonAction = var1;
            var1 = var4;
         } else {
            if (var9 >= var3) {
               break;
            }

            this.BatModClient[var1] = var8;
            var8.ButtonAction = var1;
            var1 = var5;
         }
      }

      this.BatModClient[var1] = var2;
      var2.ButtonAction = var1;
   }

   public boolean CustomSpinner() {
      return this.Button == 0;
   }
}
