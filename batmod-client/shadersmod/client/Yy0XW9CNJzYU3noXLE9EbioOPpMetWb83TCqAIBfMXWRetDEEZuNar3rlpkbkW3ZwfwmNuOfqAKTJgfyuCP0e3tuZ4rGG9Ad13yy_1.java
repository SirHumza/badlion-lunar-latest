package shadersmod.client;

public class CustomSpinner
   extends Yy0XW9CNJzYU3noXLE9EbioOPpMetWb83TCqAIBfMXWRetDEEZuNar3rlpkbkW3ZwfwmNuOfqAKTJgfyuCP0e3tuZ4rGG9Ad13yy {
   private static shadersmod.client.CustomSpinner IntegerSpinner = new shadersmod.client.CustomSpinner();
   float[] Spinner = new float[6];
   float[][] Checkbox = new float[10][4];
   int ProgressBar;
   float[] BatModProgressBar = new float[16];
   float[] ColorChooser = new float[4];

   @Override
   public boolean BatModClient(
      double var1, double var3, double var5, double var7, double var9, double var11
   ) {
      for (int var13 = 0; var13 < this.ProgressBar; var13++) {
         float[] var14 = this.Checkbox[var13];
         if (this.BatModClient(var14, var1, var3, var5) <= 0.0
            && this.BatModClient(var14, var7, var3, var5) <= 0.0
            && this.BatModClient(var14, var1, var9, var5) <= 0.0
            && this.BatModClient(var14, var7, var9, var5) <= 0.0
            && this.BatModClient(var14, var1, var3, var11) <= 0.0
            && this.BatModClient(var14, var7, var3, var11) <= 0.0
            && this.BatModClient(var14, var1, var9, var11) <= 0.0
            && this.BatModClient(var14, var7, var9, var11) <= 0.0) {
            return false;
         }
      }

      return true;
   }

   private double BatModClient(
      float[] var1, double var2, double var4, double var6
   ) {
      return var1[0] * var2 + var1[1] * var4 + var1[2] * var6 + var1[3];
   }

   private double BatModClient(float[] var1, float[] var2) {
      return (double)var1[0] * var2[0] + (double)var1[1] * var2[1] + (double)var1[2] * var2[2];
   }

   public static Yy0XW9CNJzYU3noXLE9EbioOPpMetWb83TCqAIBfMXWRetDEEZuNar3rlpkbkW3ZwfwmNuOfqAKTJgfyuCP0e3tuZ4rGG9Ad13yy BatModClient() {
      IntegerSpinner.Button();
      return IntegerSpinner;
   }

   private void BatModClient(float[] var1) {
      float var2 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]
      );
      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
      var1[3] /= var2;
   }

   private void Button(float[] var1) {
      float var2 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]
      );
      if (var2 == 0.0F) {
         var2 = 1.0F;
      }

      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
   }

   private void BatModClient(
      float[] var1, float var2, float var3, float var4, float var5
   ) {
      float var6 = (float)Math.sqrt(var2 * var2 + var3 * var3 + var4 * var4);
      var1[0] = var2 / var6;
      var1[1] = var3 / var6;
      var1[2] = var4 / var6;
      var1[3] = var5 / var6;
   }

   private void Button(float[] var1, float[] var2) {
      var1[0] = var2[0];
      var1[1] = var2[1];
      var1[2] = var2[2];
      var1[3] = var2[3];
   }

   private void BatModClient(float[] var1, float[] var2, float[] var3) {
      var1[0] = var2[1] * var3[2] - var2[2] * var3[1];
      var1[1] = var2[2] * var3[0] - var2[0] * var3[2];
      var1[2] = var2[0] * var3[1] - var2[1] * var3[0];
   }

   private void CustomSpinner(float[] var1) {
      this.Button(
         this.Checkbox[this.ProgressBar++],
         var1
      );
   }

   private float BatModClient(float var1, float var2, float var3) {
      return (float)Math.sqrt(var1 * var1 + var2 * var2 + var3 * var3);
   }

   private float BatModClient(
      float var1, float var2, float var3, float var4, float var5, float var6
   ) {
      return this.BatModClient(var1 - var4, var2 - var5, var3 - var6);
   }

   private void BatModClient(
      float[] var1, float[] var2, float[] var3, float[] var4
   ) {
      this.BatModClient(
         this.ColorChooser, var2, var3
      );
      this.BatModClient(
         var1, this.ColorChooser, var4
      );
      this.Button(var1);
      float var5 = (float)this.BatModClient(var2, var3);
      float var6 = (float)this.BatModClient(var1, var3);
      float var7 = this.BatModClient(
         var1[0], var1[1], var1[2], var3[0] * var6, var3[1] * var6, var3[2] * var6
      );
      float var8 = this.BatModClient(
         var2[0], var2[1], var2[2], var3[0] * var5, var3[1] * var5, var3[2] * var5
      );
      float var9 = var7 / var8;
      float var10 = (float)this.BatModClient(var1, var2);
      float var11 = this.BatModClient(
         var1[0], var1[1], var1[2], var2[0] * var10, var2[1] * var10, var2[2] * var10
      );
      float var12 = this.BatModClient(
         var3[0], var3[1], var3[2], var2[0] * var5, var2[1] * var5, var2[2] * var5
      );
      float var13 = var11 / var12;
      var1[3] = var2[3] * var9 + var3[3] * var13;
   }

   public void Button() {
      float[] var1 = this.Button;
      float[] var2 = this.CustomSpinner;
      float[] var3 = this.ButtonAction;
      System.arraycopy(
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.CFH8UUHYzpGKGql1zfSlXXPytyevjNqfPQtXkCK76GCKDwZzUCcrqGrRklKdgSr4kiKoqGOCbP1o0oqQxqbgLMfmfEjMgV3HmwCY,
         0,
         var1,
         0,
         16
      );
      System.arraycopy(
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.NnlCBy2HReJhMxmjvXrpJBUUMNKatefNhCGTZmbdSUyt1iQEiSYkORZK0q3QfBQghk8pXICfUNrkmxDfLlV0bpIEbg90J4sxRnQ0,
         0,
         var2,
         0,
         16
      );
      shadersmod.client.InstallationLogger.BatModClient(
         var3, var2, var1
      );
      this.BatModClient(
         this.BatModClient[0],
         var3[3] - var3[0],
         var3[7] - var3[4],
         var3[11] - var3[8],
         var3[15] - var3[12]
      );
      this.BatModClient(
         this.BatModClient[1],
         var3[3] + var3[0],
         var3[7] + var3[4],
         var3[11] + var3[8],
         var3[15] + var3[12]
      );
      this.BatModClient(
         this.BatModClient[2],
         var3[3] + var3[1],
         var3[7] + var3[5],
         var3[11] + var3[9],
         var3[15] + var3[13]
      );
      this.BatModClient(
         this.BatModClient[3],
         var3[3] - var3[1],
         var3[7] - var3[5],
         var3[11] - var3[9],
         var3[15] - var3[13]
      );
      this.BatModClient(
         this.BatModClient[4],
         var3[3] - var3[2],
         var3[7] - var3[6],
         var3[11] - var3[10],
         var3[15] - var3[14]
      );
      this.BatModClient(
         this.BatModClient[5],
         var3[3] + var3[2],
         var3[7] + var3[6],
         var3[11] + var3[10],
         var3[15] + var3[14]
      );
      float[] var4 = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
      float var5 = (float)this.BatModClient(
         this.BatModClient[0], var4
      );
      float var6 = (float)this.BatModClient(
         this.BatModClient[1], var4
      );
      float var7 = (float)this.BatModClient(
         this.BatModClient[2], var4
      );
      float var8 = (float)this.BatModClient(
         this.BatModClient[3], var4
      );
      float var9 = (float)this.BatModClient(
         this.BatModClient[4], var4
      );
      float var10 = (float)this.BatModClient(
         this.BatModClient[5], var4
      );
      this.ProgressBar = 0;
      if (var5 >= 0.0F) {
         this.Button(
            this.Checkbox[this.ProgressBar++],
            this.BatModClient[0]
         );
         if (var5 > 0.0F) {
            if (var7 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[0],
                  this.BatModClient[2],
                  var4
               );
            }

            if (var8 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[0],
                  this.BatModClient[3],
                  var4
               );
            }

            if (var9 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[0],
                  this.BatModClient[4],
                  var4
               );
            }

            if (var10 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[0],
                  this.BatModClient[5],
                  var4
               );
            }
         }
      }

      if (var6 >= 0.0F) {
         this.Button(
            this.Checkbox[this.ProgressBar++],
            this.BatModClient[1]
         );
         if (var6 > 0.0F) {
            if (var7 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[1],
                  this.BatModClient[2],
                  var4
               );
            }

            if (var8 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[1],
                  this.BatModClient[3],
                  var4
               );
            }

            if (var9 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[1],
                  this.BatModClient[4],
                  var4
               );
            }

            if (var10 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[1],
                  this.BatModClient[5],
                  var4
               );
            }
         }
      }

      if (var7 >= 0.0F) {
         this.Button(
            this.Checkbox[this.ProgressBar++],
            this.BatModClient[2]
         );
         if (var7 > 0.0F) {
            if (var5 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[2],
                  this.BatModClient[0],
                  var4
               );
            }

            if (var6 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[2],
                  this.BatModClient[1],
                  var4
               );
            }

            if (var9 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[2],
                  this.BatModClient[4],
                  var4
               );
            }

            if (var10 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[2],
                  this.BatModClient[5],
                  var4
               );
            }
         }
      }

      if (var8 >= 0.0F) {
         this.Button(
            this.Checkbox[this.ProgressBar++],
            this.BatModClient[3]
         );
         if (var8 > 0.0F) {
            if (var5 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[3],
                  this.BatModClient[0],
                  var4
               );
            }

            if (var6 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[3],
                  this.BatModClient[1],
                  var4
               );
            }

            if (var9 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[3],
                  this.BatModClient[4],
                  var4
               );
            }

            if (var10 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[3],
                  this.BatModClient[5],
                  var4
               );
            }
         }
      }

      if (var9 >= 0.0F) {
         this.Button(
            this.Checkbox[this.ProgressBar++],
            this.BatModClient[4]
         );
         if (var9 > 0.0F) {
            if (var5 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[4],
                  this.BatModClient[0],
                  var4
               );
            }

            if (var6 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[4],
                  this.BatModClient[1],
                  var4
               );
            }

            if (var7 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[4],
                  this.BatModClient[2],
                  var4
               );
            }

            if (var8 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[4],
                  this.BatModClient[3],
                  var4
               );
            }
         }
      }

      if (var10 >= 0.0F) {
         this.Button(
            this.Checkbox[this.ProgressBar++],
            this.BatModClient[5]
         );
         if (var10 > 0.0F) {
            if (var5 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[5],
                  this.BatModClient[0],
                  var4
               );
            }

            if (var6 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[5],
                  this.BatModClient[1],
                  var4
               );
            }

            if (var7 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[5],
                  this.BatModClient[2],
                  var4
               );
            }

            if (var8 < 0.0F) {
               this.BatModClient(
                  this.Checkbox[this.ProgressBar++],
                  this.BatModClient[5],
                  this.BatModClient[3],
                  var4
               );
            }
         }
      }
   }
}
