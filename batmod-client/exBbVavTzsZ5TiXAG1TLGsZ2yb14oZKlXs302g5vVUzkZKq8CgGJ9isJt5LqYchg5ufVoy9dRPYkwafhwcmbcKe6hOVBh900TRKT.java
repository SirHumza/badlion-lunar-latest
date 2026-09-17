import java.util.Random;

public class exBbVavTzsZ5TiXAG1TLGsZ2yb14oZKlXs302g5vVUzkZKq8CgGJ9isJt5LqYchg5ufVoy9dRPYkwafhwcmbcKe6hOVBh900TRKT
   extends xRzB8X9FQKjGyJwG6CR4c7uX9B312UsKWK8OWdGciBCpBPZKCjrkvU0yHPx88fGYnItzCOm6oeDtehM3NAwARCKHrN7KIB1jCp06 {
   private MWLTCoyZBD505FgH2EnRkKgyayzW3bWkApMWwK6DMvQ8poDEuZrILywM1iN9tqj0cSJT5e7eCvUJXZMnLrsj1c7AMpCOyUXdpW7L[] BatModClient;
   private int Button;

   public exBbVavTzsZ5TiXAG1TLGsZ2yb14oZKlXs302g5vVUzkZKq8CgGJ9isJt5LqYchg5ufVoy9dRPYkwafhwcmbcKe6hOVBh900TRKT(Random var1, int var2) {
      this.Button = var2;
      this.BatModClient = new MWLTCoyZBD505FgH2EnRkKgyayzW3bWkApMWwK6DMvQ8poDEuZrILywM1iN9tqj0cSJT5e7eCvUJXZMnLrsj1c7AMpCOyUXdpW7L[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.BatModClient[var3] = new MWLTCoyZBD505FgH2EnRkKgyayzW3bWkApMWwK6DMvQ8poDEuZrILywM1iN9tqj0cSJT5e7eCvUJXZMnLrsj1c7AMpCOyUXdpW7L(
            var1
         );
      }
   }

   public double[] BatModClient(
      double[] var1, int var2, int var3, int var4, int var5, int var6, int var7, double var8, double var10, double var12
   ) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      } else {
         for (int var14 = 0; var14 < var1.length; var14++) {
            var1[var14] = 0.0;
         }
      }

      double var27 = 1.0;

      for (int var16 = 0; var16 < this.Button; var16++) {
         double var17 = var2 * var27 * var8;
         double var19 = var3 * var27 * var10;
         double var21 = var4 * var27 * var12;
         long var23 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ButtonAction(
            var17
         );
         long var25 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ButtonAction(
            var21
         );
         var17 -= var23;
         var21 -= var25;
         var23 %= 16777216L;
         var25 %= 16777216L;
         var17 += var23;
         var21 += var25;
         this.BatModClient[var16]
            .BatModClient(
               var1, var17, var19, var21, var5, var6, var7, var8 * var27, var10 * var27, var12 * var27, var27
            );
         var27 /= 2.0;
      }

      return var1;
   }

   public double[] BatModClient(
      double[] var1, int var2, int var3, int var4, int var5, double var6, double var8, double var10
   ) {
      return this.BatModClient(
         var1, var2, 10, var3, var4, 1, var5, var6, 1.0, var8
      );
   }
}
