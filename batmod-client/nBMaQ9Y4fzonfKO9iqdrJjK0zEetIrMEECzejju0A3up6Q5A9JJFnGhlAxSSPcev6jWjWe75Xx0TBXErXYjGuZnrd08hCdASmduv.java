import java.util.Random;

public class nBMaQ9Y4fzonfKO9iqdrJjK0zEetIrMEECzejju0A3up6Q5A9JJFnGhlAxSSPcev6jWjWe75Xx0TBXErXYjGuZnrd08hCdASmduv {
   private static int[][] Spinner = new int[][]{
      {1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}
   };
   public static final double BatModClient = Math.sqrt(3.0);
   private int[] Checkbox = new int[512];
   public double Button;
   public double CustomSpinner;
   public double ButtonAction;
   private static final double ProgressBar = 0.5
      * (BatModClient - 1.0);
   private static final double BatModProgressBar = (
         3.0 - BatModClient
      )
      / 6.0;

   public nBMaQ9Y4fzonfKO9iqdrJjK0zEetIrMEECzejju0A3up6Q5A9JJFnGhlAxSSPcev6jWjWe75Xx0TBXErXYjGuZnrd08hCdASmduv() {
      this(new Random());
   }

   public nBMaQ9Y4fzonfKO9iqdrJjK0zEetIrMEECzejju0A3up6Q5A9JJFnGhlAxSSPcev6jWjWe75Xx0TBXErXYjGuZnrd08hCdASmduv(Random var1) {
      this.Button = var1.nextDouble() * 256.0;
      this.CustomSpinner = var1.nextDouble() * 256.0;
      this.ButtonAction = var1.nextDouble() * 256.0;
      int var2 = 0;

      while (var2 < 256) {
         this.Checkbox[var2] = var2++;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         int var3 = var1.nextInt(256 - var5) + var5;
         int var4 = this.Checkbox[var5];
         this.Checkbox[var5] = this.Checkbox[var3];
         this.Checkbox[var3] = var4;
         this.Checkbox[var5 + 256] = this.Checkbox[var5];
      }
   }

   private static int BatModClient(double var0) {
      return var0 > 0.0 ? (int)var0 : (int)var0 - 1;
   }

   private static double BatModClient(
      int[] var0, double var1, double var3
   ) {
      return var0[0] * var1 + var0[1] * var3;
   }

   public double BatModClient(double var1, double var3) {
      double var5 = 0.5 * (BatModClient - 1.0);
      double var7 = (var1 + var3) * var5;
      int var9 = BatModClient(var1 + var7);
      int var10 = BatModClient(var3 + var7);
      double var11 = (3.0 - BatModClient) / 6.0;
      double var13 = (var9 + var10) * var11;
      double var15 = var9 - var13;
      double var17 = var10 - var13;
      double var19 = var1 - var15;
      double var21 = var3 - var17;
      byte var23;
      byte var24;
      if (var19 > var21) {
         var23 = 1;
         var24 = 0;
      } else {
         var23 = 0;
         var24 = 1;
      }

      double var25 = var19 - var23 + var11;
      double var27 = var21 - var24 + var11;
      double var29 = var19 - 1.0 + 2.0 * var11;
      double var31 = var21 - 1.0 + 2.0 * var11;
      int var33 = var9 & 0xFF;
      int var34 = var10 & 0xFF;
      int var35 = this.Checkbox[var33
            + this.Checkbox[var34]]
         % 12;
      int var36 = this.Checkbox[var33
            + var23
            + this.Checkbox[var34 + var24]]
         % 12;
      int var37 = this.Checkbox[var33
            + 1
            + this.Checkbox[var34 + 1]]
         % 12;
      double var38 = 0.5 - var19 * var19 - var21 * var21;
      double var40;
      if (var38 < 0.0) {
         var40 = 0.0;
      } else {
         var38 *= var38;
         var40 = var38
            * var38
            * BatModClient(
               Spinner[var35], var19, var21
            );
      }

      double var42 = 0.5 - var25 * var25 - var27 * var27;
      double var44;
      if (var42 < 0.0) {
         var44 = 0.0;
      } else {
         var42 *= var42;
         var44 = var42
            * var42
            * BatModClient(
               Spinner[var36], var25, var27
            );
      }

      double var46 = 0.5 - var29 * var29 - var31 * var31;
      double var48;
      if (var46 < 0.0) {
         var48 = 0.0;
      } else {
         var46 *= var46;
         var48 = var46
            * var46
            * BatModClient(
               Spinner[var37], var29, var31
            );
      }

      return 70.0 * (var40 + var44 + var48);
   }

   public void BatModClient(
      double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12
   ) {
      int var14 = 0;

      for (int var15 = 0; var15 < var7; var15++) {
         double var16 = (var4 + var15) * var10 + this.CustomSpinner;

         for (int var18 = 0; var18 < var6; var18++) {
            double var19 = (var2 + var18) * var8 + this.Button;
            double var21 = (var19 + var16) * ProgressBar;
            int var23 = BatModClient(var19 + var21);
            int var24 = BatModClient(var16 + var21);
            double var25 = (var23 + var24) * BatModProgressBar;
            double var27 = var23 - var25;
            double var29 = var24 - var25;
            double var31 = var19 - var27;
            double var33 = var16 - var29;
            byte var35;
            byte var36;
            if (var31 > var33) {
               var35 = 1;
               var36 = 0;
            } else {
               var35 = 0;
               var36 = 1;
            }

            double var37 = var31 - var35 + BatModProgressBar;
            double var39 = var33 - var36 + BatModProgressBar;
            double var41 = var31 - 1.0 + 2.0 * BatModProgressBar;
            double var43 = var33 - 1.0 + 2.0 * BatModProgressBar;
            int var45 = var23 & 0xFF;
            int var46 = var24 & 0xFF;
            int var47 = this.Checkbox[var45
                  + this.Checkbox[var46]]
               % 12;
            int var48 = this.Checkbox[var45
                  + var35
                  + this.Checkbox[var46 + var36]]
               % 12;
            int var49 = this.Checkbox[var45
                  + 1
                  + this.Checkbox[var46 + 1]]
               % 12;
            double var50 = 0.5 - var31 * var31 - var33 * var33;
            double var52;
            if (var50 < 0.0) {
               var52 = 0.0;
            } else {
               var50 *= var50;
               var52 = var50
                  * var50
                  * BatModClient(
                     Spinner[var47], var31, var33
                  );
            }

            double var54 = 0.5 - var37 * var37 - var39 * var39;
            double var56;
            if (var54 < 0.0) {
               var56 = 0.0;
            } else {
               var54 *= var54;
               var56 = var54
                  * var54
                  * BatModClient(
                     Spinner[var48], var37, var39
                  );
            }

            double var58 = 0.5 - var41 * var41 - var43 * var43;
            double var60;
            if (var58 < 0.0) {
               var60 = 0.0;
            } else {
               var58 *= var58;
               var60 = var58
                  * var58
                  * BatModClient(
                     Spinner[var49], var41, var43
                  );
            }

            int var62 = var14++;
            var1[var62] += 70.0 * (var52 + var56 + var60) * var12;
         }
      }
   }
}
