public class c0MFSnCM0zcvsYQAU3VgPOBG9wTbFYVD1I0sBgVfv1ooFZahcWklXTYdK0aM0BWxZ9wS7Xa99OHCTQoTBN65ssplMcHspXVRHyA
   extends yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF {
   public c0MFSnCM0zcvsYQAU3VgPOBG9wTbFYVD1I0sBgVfv1ooFZahcWklXTYdK0aM0BWxZ9wS7Xa99OHCTQoTBN65ssplMcHspXVRHyA(long var1) {
      super(var1);
   }

   @Override
   public int[] BatModClient(int var1, int var2, int var3, int var4) {
      int[] var5 = fmK8A1OVIw5UMnvTqEt388gJoF8bPb05nHiY2cTOrHEUqVJV1HzQOt4S6gOtpCfFUde1X6nnuBzcc6g4oTgpER9ZQckcB1SwceOc.BatModClient(
         var3 * var4
      );

      for (int var6 = 0; var6 < var4; var6++) {
         for (int var7 = 0; var7 < var3; var7++) {
            this.BatModClient((long)(var1 + var7), (long)(var2 + var6));
            var5[var7 + var6 * var3] = this.BatModClient(10) == 0
               ? 1
               : 0;
         }
      }

      if (var1 > -var3 && var1 <= 0 && var2 > -var4 && var2 <= 0) {
         var5[-var1 + -var2 * var3] = 1;
      }

      return var5;
   }
}
