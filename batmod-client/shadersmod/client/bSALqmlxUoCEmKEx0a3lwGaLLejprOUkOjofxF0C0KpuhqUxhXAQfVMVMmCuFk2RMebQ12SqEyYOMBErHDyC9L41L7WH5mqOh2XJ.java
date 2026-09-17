package shadersmod.client;

import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ {
   private int[] BatModClient = null;
   private int Button = 0;
   private String CustomSpinner = null;
   private String[] ButtonAction = null;
   private String Spinner = null;
   private String[] Checkbox = null;
   private int ProgressBar = 0;

   public bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ(
      String var1, String[] var2, String var3, String[] var4, int var5
   ) {
      this.CustomSpinner = var1;
      this.ButtonAction = var2;
      this.Spinner = var3;
      this.Checkbox = var4;
      this.Button = var5;
      if (var2.length != var4.length) {
         throw new IllegalArgumentException("Property and user values have different lengths: " + var2.length + " != " + var4.length);
      }

      if (var5 >= 0 && var5 < var2.length) {
         this.ProgressBar = var5;
      } else {
         throw new IllegalArgumentException("Invalid default value: " + var5);
      }
   }

   public boolean BatModClient(String var1) {
      if (var1 == null) {
         this.ProgressBar = this.Button;
         return false;
      }

      this.ProgressBar = ArrayUtils.indexOf(
         this.ButtonAction, var1
      );
      if (this.ProgressBar >= 0
         && this.ProgressBar
            < this.ButtonAction.length) {
         return true;
      }

      this.ProgressBar = this.Button;
      return false;
   }

   public void BatModClient() {
      this.ProgressBar++;
      if (this.ProgressBar < 0
         || this.ProgressBar
            >= this.ButtonAction.length) {
         this.ProgressBar = 0;
      }
   }

   public void BatModClient(int var1) {
      this.ProgressBar = var1;
      if (this.ProgressBar < 0
         || this.ProgressBar
            >= this.ButtonAction.length) {
         this.ProgressBar = this.Button;
      }
   }

   public int Button() {
      return this.ProgressBar;
   }

   public String CustomSpinner() {
      return this.Checkbox[this.ProgressBar];
   }

   public String ButtonAction() {
      return this.ButtonAction[this.ProgressBar];
   }

   public String Spinner() {
      return this.Spinner;
   }

   public String Checkbox() {
      return this.CustomSpinner;
   }

   public void ProgressBar() {
      this.ProgressBar = this.Button;
   }

   public boolean BatModClient(Properties var1) {
      this.ProgressBar();
      if (var1 == null) {
         return false;
      }

      String var2 = var1.getProperty(this.CustomSpinner);
      return var2 == null ? false : this.BatModClient(var2);
   }

   public void Button(Properties var1) {
      if (var1 != null) {
         var1.setProperty(
            this.Checkbox(),
            this.ButtonAction()
         );
      }
   }

   @Override
   public String toString() {
      return ""
         + this.CustomSpinner
         + "="
         + this.ButtonAction()
         + " ["
         + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            this.ButtonAction
         )
         + "], value: "
         + this.ProgressBar;
   }
}
