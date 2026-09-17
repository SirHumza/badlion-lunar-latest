import java.util.Calendar;
import java.util.Date;

public enum XlfqoQAzLjYknwSKBfX9XoMPSjC4Wsvdf74sjDgYzEF5NQUNfAiHlr3ybyz7JF4by4q57yIxFoc3sFWa41LHQ62A91G7YboU1jrT {
   BatModClient,
   Button(12, 1, 12, 31, true);

   private final int CustomSpinner;
   private final int ButtonAction;
   private final int Spinner;
   private final int Checkbox;
   private final boolean ProgressBar;

   XlfqoQAzLjYknwSKBfX9XoMPSjC4Wsvdf74sjDgYzEF5NQUNfAiHlr3ybyz7JF4by4q57yIxFoc3sFWa41LHQ62A91G7YboU1jrT() {
      this(-1, -1, -1, -1);
   }

   XlfqoQAzLjYknwSKBfX9XoMPSjC4Wsvdf74sjDgYzEF5NQUNfAiHlr3ybyz7JF4by4q57yIxFoc3sFWa41LHQ62A91G7YboU1jrT(int var3, int var4, int var5, int var6) {
      this(var3, var4, var5, var6, false);
   }

   XlfqoQAzLjYknwSKBfX9XoMPSjC4Wsvdf74sjDgYzEF5NQUNfAiHlr3ybyz7JF4by4q57yIxFoc3sFWa41LHQ62A91G7YboU1jrT(int var3, int var4, int var5, int var6, boolean var7) {
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Spinner = var5;
      this.Checkbox = var6;
      this.ProgressBar = var7;
   }

   public boolean BatModClient() {
      if (this == BatModClient) {
         return true;
      }

      Calendar var1 = Calendar.getInstance();
      var1.setTime(new Date());
      int var2 = var1.get(2) + 1;
      int var3 = var1.get(5);
      return var2 >= this.ButtonAction
         && var3 >= this.ButtonAction
         && var2 <= this.Spinner
         && var3 <= this.Checkbox;
   }

   public int Button() {
      return this.CustomSpinner;
   }

   public int CustomSpinner() {
      return this.ButtonAction;
   }

   public int ButtonAction() {
      return this.Spinner;
   }

   public int Spinner() {
      return this.Checkbox;
   }

   public boolean Checkbox() {
      return this.ProgressBar;
   }
}
