public class FG1zFV4fKGp1SvtF4xOhidChRcWDIamqOKxRZ0EJQzLWmKtuzR7CcT8RzgWaQ8133hz4Zl4zWwk2GwKCsK949OjX5eCoSGkhpsWc
   extends yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF {
   public FG1zFV4fKGp1SvtF4xOhidChRcWDIamqOKxRZ0EJQzLWmKtuzR7CcT8RzgWaQ8133hz4Zl4zWwk2GwKCsK949OjX5eCoSGkhpsWc(
      long var1, yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF var3
   ) {
      super(var1);
      super.BatModClient = var3;
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
            int var13 = this.CustomSpinner(
               var9[var12 + 0 + (var11 + 1) * var7]
            );
            int var14 = this.CustomSpinner(
               var9[var12 + 2 + (var11 + 1) * var7]
            );
            int var15 = this.CustomSpinner(
               var9[var12 + 1 + (var11 + 0) * var7]
            );
            int var16 = this.CustomSpinner(
               var9[var12 + 1 + (var11 + 2) * var7]
            );
            int var17 = this.CustomSpinner(
               var9[var12 + 1 + (var11 + 1) * var7]
            );
            if (var17 == var13 && var17 == var15 && var17 == var14 && var17 == var16) {
               var10[var12 + var11 * var3] = -1;
            } else {
               var10[var12 + var11 * var3] = Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                  .BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv;
            }
         }
      }

      return var10;
   }

   private int CustomSpinner(int var1) {
      return var1 >= 2 ? 2 + (var1 & 1) : var1;
   }
}
