public class PEYcDapfqV59XWJguJGvnR4u03uMGuw46fBkmxcfgo42GMh4yh5WeYOiF3afptahGQp7osMckAhdkLAYaEWlnmvrA7hdiDr2ZTaU
   extends yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF {
   public PEYcDapfqV59XWJguJGvnR4u03uMGuw46fBkmxcfgo42GMh4yh5WeYOiF3afptahGQp7osMckAhdkLAYaEWlnmvrA7hdiDr2ZTaU(
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
            int var13 = var9[var12 + 1 + (var11 + 1 - 1) * (var3 + 2)];
            int var14 = var9[var12 + 1 + 1 + (var11 + 1) * (var3 + 2)];
            int var15 = var9[var12 + 1 - 1 + (var11 + 1) * (var3 + 2)];
            int var16 = var9[var12 + 1 + (var11 + 1 + 1) * (var3 + 2)];
            int var17 = var9[var12 + 1 + (var11 + 1) * var7];
            int var18 = 0;
            if (var13 == 0) {
               var18++;
            }

            if (var14 == 0) {
               var18++;
            }

            if (var15 == 0) {
               var18++;
            }

            if (var16 == 0) {
               var18++;
            }

            if (var17 == 0 && var18 > 3) {
               var10[var12 + var11 * var3] = Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
                  .BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv;
            } else {
               var10[var12 + var11 * var3] = var17;
            }
         }
      }

      return var10;
   }
}
