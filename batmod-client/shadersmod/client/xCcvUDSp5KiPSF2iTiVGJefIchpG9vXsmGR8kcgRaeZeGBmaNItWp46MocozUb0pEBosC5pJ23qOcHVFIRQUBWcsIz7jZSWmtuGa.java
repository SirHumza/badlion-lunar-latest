package shadersmod.client;

import java.util.Arrays;
import java.util.List;

public abstract class xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa {
   private String ButtonAction = null;
   private String Spinner = null;
   private String Checkbox = null;
   private String[] ProgressBar = null;
   private String BatModProgressBar = null;
   private String[] ColorChooser = null;
   private boolean IntegerSpinner = true;
   private boolean TextField = true;
   public static final String BatModClient = "§a";
   public static final String Button = "§c";
   public static final String CustomSpinner = "§9";

   public xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa(
      String var1, String var2, String var3, String[] var4, String var5, String var6
   ) {
      this.ButtonAction = var1;
      this.Spinner = var2;
      this.Checkbox = var3;
      this.ProgressBar = var4;
      this.BatModProgressBar = var5;
      if (var6 != null) {
         this.ColorChooser = new String[]{var6};
      }
   }

   public String BatModClient() {
      return this.ButtonAction;
   }

   public String Button() {
      return this.Spinner;
   }

   public String CustomSpinner() {
      String var1 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ProgressBar(
         this.Spinner
      );
      var1 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
         var1, "//"
      );
      return shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button(
         "option." + this.BatModClient() + ".comment", var1
      );
   }

   public void BatModClient(String var1) {
      this.Spinner = var1;
   }

   public String ButtonAction() {
      return this.Checkbox;
   }

   public boolean Button(String var1) {
      int var2 = BatModClient(
         var1, this.ProgressBar
      );
      if (var2 < 0) {
         return false;
      }

      this.Checkbox = var1;
      return true;
   }

   public String Spinner() {
      return this.BatModProgressBar;
   }

   public void Checkbox() {
      this.Checkbox = this.BatModProgressBar;
   }

   public void ProgressBar() {
      int var1 = BatModClient(
         this.Checkbox,
         this.ProgressBar
      );
      if (var1 >= 0) {
         var1 = (var1 + 1) % this.ProgressBar.length;
         this.Checkbox = this.ProgressBar[var1];
      }
   }

   public void BatModProgressBar() {
      int var1 = BatModClient(
         this.Checkbox,
         this.ProgressBar
      );
      if (var1 >= 0) {
         var1 = (var1 - 1 + this.ProgressBar.length)
            % this.ProgressBar.length;
         this.Checkbox = this.ProgressBar[var1];
      }
   }

   private static int BatModClient(String var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         if (var3.equals(var0)) {
            return var2;
         }
      }

      return -1;
   }

   public String[] ColorChooser() {
      return this.ColorChooser;
   }

   public void BatModClient(String[] var1) {
      List var2 = Arrays.asList(this.ColorChooser);

      for (int var3 = 0; var3 < var1.length; var3++) {
         String var4 = var1[var3];
         if (!var2.contains(var4)) {
            this.ColorChooser = (String[])xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               this.ColorChooser, var4
            );
         }
      }
   }

   public boolean IntegerSpinner() {
      return this.IntegerSpinner;
   }

   public void BatModClient(boolean var1) {
      this.IntegerSpinner = var1;
   }

   public boolean TextField() {
      return !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         (Object)this.Checkbox,
         (Object)this.BatModProgressBar
      );
   }

   public boolean ColorTextPane() {
      return this.TextField;
   }

   public void Button(boolean var1) {
      this.TextField = var1;
   }

   public boolean CustomSpinner(String var1) {
      return BatModClient(
            var1, this.ProgressBar
         )
         >= 0;
   }

   public String BatModInstallerMain() {
      return shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button(
         "option." + this.ButtonAction,
         this.ButtonAction
      );
   }

   public String ButtonAction(String var1) {
      return shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button(
         "value." + this.ButtonAction + "." + var1, var1
      );
   }

   public String Spinner(String var1) {
      return "";
   }

   public boolean Checkbox(String var1) {
      return false;
   }

   public boolean aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA() {
      return false;
   }

   public boolean ProgressBar(String var1) {
      return false;
   }

   public String LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN() {
      return null;
   }

   public String[] G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr() {
      return (String[])this.ProgressBar.clone();
   }

   @Override
   public String toString() {
      return ""
         + this.ButtonAction
         + ", value: "
         + this.Checkbox
         + ", valueDefault: "
         + this.BatModProgressBar
         + ", paths: "
         + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            this.ColorChooser
         );
   }
}
