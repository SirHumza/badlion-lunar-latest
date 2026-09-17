package shadersmod.client;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorAxis implements Iterator {
   private double BatModClient;
   private double Button;
   private int CustomSpinner;
   private int ButtonAction;
   private double Spinner;
   private double Checkbox;
   private double ProgressBar;
   private double BatModProgressBar;
   private int ColorChooser;
   private double IntegerSpinner;
   private double TextField;
   private zYbiZxe9wZ1uMXtm6FLpkNfYVmZwD6IJi6Xw9TW3WwraKGLlnG7Fik3nRZpNHt3MXQTO1wFeNZ8w3oEB148uBV61GW9dNHYg4bDP ColorTextPane = new zYbiZxe9wZ1uMXtm6FLpkNfYVmZwD6IJi6Xw9TW3WwraKGLlnG7Fik3nRZpNHt3MXQTO1wFeNZ8w3oEB148uBV61GW9dNHYg4bDP(
      0, 0, 0
   );
   private boolean BatModInstallerMain = false;

   public IteratorAxis(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2,
      double var3,
      double var5
   ) {
      this.BatModClient = var3;
      this.Button = var5;
      this.CustomSpinner = var1.BatModProgressBar();
      this.ButtonAction = var2.BatModProgressBar();
      this.Spinner = var1.ColorChooser();
      this.Checkbox = var2.ColorChooser()
         - 0.5;
      this.ProgressBar = var1.IntegerSpinner();
      this.BatModProgressBar = var2.IntegerSpinner()
         - 0.5;
      this.ColorChooser = this.CustomSpinner;
      this.IntegerSpinner = this.Spinner;
      this.TextField = this.ProgressBar;
      this.BatModInstallerMain = this.ColorChooser
            < this.ButtonAction
         && this.IntegerSpinner
            < this.Checkbox
         && this.TextField
            < this.BatModProgressBar;
   }

   @Override
   public boolean hasNext() {
      return this.BatModInstallerMain;
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient() {
      if (!this.BatModInstallerMain) {
         throw new NoSuchElementException();
      }

      this.ColorTextPane
         .ButtonAction(
            this.ColorChooser,
            this.IntegerSpinner,
            this.TextField
         );
      this.Button();
      this.BatModInstallerMain = this.ColorChooser
            < this.ButtonAction
         && this.IntegerSpinner
            < this.Checkbox
         && this.TextField
            < this.BatModProgressBar;
      return this.ColorTextPane;
   }

   private void Button() {
      this.TextField++;
      if (this.TextField
         >= this.BatModProgressBar) {
         this.TextField = this.ProgressBar;
         this.IntegerSpinner++;
         if (this.IntegerSpinner
            >= this.Checkbox) {
            this.IntegerSpinner = this.Spinner;
            this.Spinner = this.Spinner
               + this.BatModClient;
            this.Checkbox = this.Checkbox
               + this.BatModClient;
            this.IntegerSpinner = this.Spinner;
            this.ProgressBar = this.ProgressBar
               + this.Button;
            this.BatModProgressBar = this.BatModProgressBar
               + this.Button;
            this.TextField = this.ProgressBar;
            this.ColorChooser++;
            if (this.ColorChooser
               >= this.ButtonAction) {
            }
         }
      }
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }

   public static void main(String[] var0) {
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         -2, 10, 20
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         2, 12, 22
      );
      double var3 = -0.5;
      double var5 = 0.5;
      IteratorAxis var7 = new IteratorAxis(var1, var2, var3, var5);
      System.out.println("Start: " + var1 + ", end: " + var2 + ", yDelta: " + var3 + ", zDelta: " + var5);

      while (var7.hasNext()) {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var8 = var7.BatModClient();
         System.out.println("" + var8);
      }
   }
}
