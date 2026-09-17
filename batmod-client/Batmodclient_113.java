public class X6rGlwqLTDKiOCwBNeYd02C1E5TJLdlGKRkOs3cKZdF8yStnEyZluhXkJnHetQeIxvPWikFyYhVtAWJDIGI8JtdJ3N60q26kSdxV {
   private int[] BatModClient = null;
   private int Button = 0;
   private int CustomSpinner = 0;

   public X6rGlwqLTDKiOCwBNeYd02C1E5TJLdlGKRkOs3cKZdF8yStnEyZluhXkJnHetQeIxvPWikFyYhVtAWJDIGI8JtdJ3N60q26kSdxV(int var1) {
      this.BatModClient = new int[var1];
   }

   public void BatModClient(int var1) {
      this.BatModClient[this.Button] = var1;
      this.Button++;
      if (this.CustomSpinner
         < this.Button) {
         this.CustomSpinner = this.Button;
      }
   }

   public void BatModClient(int var1, int var2) {
      this.BatModClient[var1] = var2;
      if (this.CustomSpinner < var1) {
         this.CustomSpinner = var1;
      }
   }

   public void Button(int var1) {
      this.Button = var1;
   }

   public void BatModClient(int[] var1) {
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         this.BatModClient[this.Button] = var1[var3];
         this.Button++;
      }

      if (this.CustomSpinner
         < this.Button) {
         this.CustomSpinner = this.Button;
      }
   }

   public int CustomSpinner(int var1) {
      return this.BatModClient[var1];
   }

   public int[] BatModClient() {
      return this.BatModClient;
   }

   public void Button() {
      this.Button = 0;
      this.CustomSpinner = 0;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }

   public int ButtonAction() {
      return this.Button;
   }
}
