public class aWZIr1zA9VXddEohOiZGknOZHrqRHIToLAWi2FlRGW7r0DGxCesvzZopXFa0tI5OUVZcwjqlnpRBFQLo6VHbuM5pC9Tasp3De0pi
   extends yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF {
   public aWZIr1zA9VXddEohOiZGknOZHrqRHIToLAWi2FlRGW7r0DGxCesvzZopXFa0tI5OUVZcwjqlnpRBFQLo6VHbuM5pC9Tasp3De0pi(
      long var1, yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF var3
   ) {
      super(var1);
      super.BatModClient = var3;
   }

   @Override
   public int[] BatModClient(int var1, int var2, int var3, int var4) {
      int var5 = var1 >> 1;
      int var6 = var2 >> 1;
      int var7 = (var3 >> 1) + 2;
      int var8 = (var4 >> 1) + 2;
      int[] var9 = this.BatModClient
         .BatModClient(var5, var6, var7, var8);
      int var10 = var7 - 1 << 1;
      int var11 = var8 - 1 << 1;
      int[] var12 = fmK8A1OVIw5UMnvTqEt388gJoF8bPb05nHiY2cTOrHEUqVJV1HzQOt4S6gOtpCfFUde1X6nnuBzcc6g4oTgpER9ZQckcB1SwceOc.BatModClient(
         var10 * var11
      );

      for (int var13 = 0; var13 < var8 - 1; var13++) {
         int var14 = (var13 << 1) * var10;
         int var15 = 0;
         int var16 = var9[var15 + 0 + (var13 + 0) * var7];
         int var17 = var9[var15 + 0 + (var13 + 1) * var7];

         while (var15 < var7 - 1) {
            this.BatModClient(
               (long)(var15 + var5 << 1), (long)(var13 + var6 << 1)
            );
            int var18 = var9[var15 + 1 + (var13 + 0) * var7];
            int var19 = var9[var15 + 1 + (var13 + 1) * var7];
            var12[var14] = var16;
            var12[var14++ + var10] = this.BatModClient(var16, var17);
            var12[var14] = this.BatModClient(var16, var18);
            var12[var14++ + var10] = this.Button(
               var16, var18, var17, var19
            );
            var16 = var18;
            var17 = var19;
            var15++;
         }
      }

      int[] var20 = fmK8A1OVIw5UMnvTqEt388gJoF8bPb05nHiY2cTOrHEUqVJV1HzQOt4S6gOtpCfFUde1X6nnuBzcc6g4oTgpER9ZQckcB1SwceOc.BatModClient(
         var3 * var4
      );

      for (int var22 = 0; var22 < var4; var22++) {
         System.arraycopy(var12, (var22 + (var2 & 1)) * var10 + (var1 & 1), var20, var22 * var3, var3);
      }

      return var20;
   }

   public static yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF BatModClient(
      long var0, yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF var2, int var3
   ) {
      yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF var4 = var2;

      for (int var5 = 0; var5 < var3; var5++) {
         var4 = new aWZIr1zA9VXddEohOiZGknOZHrqRHIToLAWi2FlRGW7r0DGxCesvzZopXFa0tI5OUVZcwjqlnpRBFQLo6VHbuM5pC9Tasp3De0pi(var0 + var5, var4);
      }

      return var4;
   }
}
