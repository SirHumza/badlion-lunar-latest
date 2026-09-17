public class yhuRiJpeAbiNahuEDhou8lhXwLlL2VMeqFAs6tyhZULZOANNJUANEDM2578IZYsAFJ4fzYKOawlB42B9yO9xNE0nPu7ddWBZwQx4 {
   private int BatModClient = 18;
   private int Button = 128;
   private int CustomSpinner = 18;
   private int ButtonAction = 0;
   private int Spinner = 0;
   private int Checkbox = 0;
   private int[][][] ProgressBar = (int[][][])null;
   private int[] BatModProgressBar = null;
   private int ColorChooser = 0;

   public yhuRiJpeAbiNahuEDhou8lhXwLlL2VMeqFAs6tyhZULZOANNJUANEDM2578IZYsAFJ4fzYKOawlB42B9yO9xNE0nPu7ddWBZwQx4(int var1, int var2, int var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ProgressBar = new int[var1][var2][var3];
      this.BatModClient();
   }

   public void BatModClient() {
      for (int var1 = 0; var1 < this.BatModClient; var1++) {
         int[][] var2 = this.ProgressBar[var1];

         for (int var3 = 0; var3 < this.Button; var3++) {
            int[] var4 = var2[var3];

            for (int var5 = 0; var5 < this.CustomSpinner; var5++) {
               var4[var5] = -1;
            }
         }
      }
   }

   public void BatModClient(int var1, int var2, int var3) {
      this.ButtonAction = var1;
      this.Spinner = var2;
      this.Checkbox = var3;
      this.BatModClient();
   }

   public int Button(int var1, int var2, int var3) {
      try {
         this.BatModProgressBar = this.ProgressBar[var1
            - this.ButtonAction][var2
            - this.Spinner];
         this.ColorChooser = var3
            - this.Checkbox;
         return this.BatModProgressBar[this.ColorChooser];
      } catch (ArrayIndexOutOfBoundsException var5) {
         var5.printStackTrace();
         return -1;
      }
   }

   public void BatModClient(int var1) {
      try {
         this.BatModProgressBar[this.ColorChooser] = var1;
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
