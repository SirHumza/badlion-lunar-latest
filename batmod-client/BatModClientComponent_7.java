public class CT1Q9j51CuD1lQEXlPoCxyJvzVkc2YD59R5CGpj7AgNDfz8SU1k4heSCFWkg2gfUgLZ05SuLFp9FsUhVje5HRJuG7FB2sopEAnMx
   extends yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF {
   public CT1Q9j51CuD1lQEXlPoCxyJvzVkc2YD59R5CGpj7AgNDfz8SU1k4heSCFWkg2gfUgLZ05SuLFp9FsUhVje5HRJuG7FB2sopEAnMx(
      long var1, yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF var3
   ) {
      super(var1);
      this.BatModClient = var3;
   }

   @Override
   public int[] BatModClient(int var1, int var2, int var3, int var4) {
      int var5 = var1 - 1;
      int var6 = var2 - 1;
      int var7 = var3 + 2;
      int var8 = var4 + 2;
      int[] var9 = this.BatModClient
         .BatModClient(var5, var6, var7, var8);
      int[] var10 = fmK8A1OVIw5UMnvTqEt388gJoF8bPb05nHiY2cTOrHEUqVJV1HzQOt4S6gOtpCfFUde1X6nnuBzcc6g4oTgpER9ZQckcB1SwceOc.BatModClient(
         var3 * var4
      );

      for (int var11 = 0; var11 < var4; var11++) {
         for (int var12 = 0; var12 < var3; var12++) {
            int var13 = var9[var12 + 1 + (var11 + 1) * var7];
            this.BatModClient(
               (long)(var12 + var1), (long)(var11 + var2)
            );
            if (var13 == 0) {
               var10[var12 + var11 * var3] = 0;
            } else {
               int var14 = this.BatModClient(6);
               byte var15;
               if (var14 == 0) {
                  var15 = 4;
               } else if (var14 <= 1) {
                  var15 = 3;
               } else {
                  var15 = 1;
               }

               var10[var12 + var11 * var3] = var15;
            }
         }
      }

      return var10;
   }
}
