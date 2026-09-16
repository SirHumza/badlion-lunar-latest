public class x3gb7UgDeokBLySzS8XpFD1LQxd2uoTIyRNj1cTGV2QvMf9UELeiH3Hma0teQub2XfAZJadnEctb9LtBk77a1Gw7dHNVooq6Ilco
   extends yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF {
   public x3gb7UgDeokBLySzS8XpFD1LQxd2uoTIyRNj1cTGV2QvMf9UELeiH3Hma0teQub2XfAZJadnEctb9LtBk77a1Gw7dHNVooq6Ilco(
      long var1, yX1MwGTwG3GAnYDfRXfncoMYV0DXSQqM529d4i1QI810FiR1Q1bccyWZsgVv6SyP0ggnF4uD4FrMSIVO06H1Z1ksoirKWcsyfQLF var3
   ) {
      super(var1);
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var3;
   }

   @Override
   public int[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(int var1, int var2, int var3, int var4) {
      int var5 = var1 - 1;
      int var6 = var2 - 1;
      int var7 = var3 + 2;
      int var8 = var4 + 2;
      int[] var9 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var5, var6, var7, var8);
      int[] var10 = fmK8A1OVIw5UMnvTqEt388gJoF8bPb05nHiY2cTOrHEUqVJV1HzQOt4S6gOtpCfFUde1X6nnuBzcc6g4oTgpER9ZQckcB1SwceOc.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var3 * var4
      );

      for (int var11 = 0; var11 < var4; var11++) {
         for (int var12 = 0; var12 < var3; var12++) {
            int var13 = var9[var12 + 1 + (var11 + 1 - 1) * (var3 + 2)];
            int var14 = var9[var12 + 1 + 1 + (var11 + 1) * (var3 + 2)];
            int var15 = var9[var12 + 1 - 1 + (var11 + 1) * (var3 + 2)];
            int var16 = var9[var12 + 1 + (var11 + 1 + 1) * (var3 + 2)];
            int var17 = var9[var12 + 1 + (var11 + 1) * var7];
            var10[var12 + var11 * var3] = var17;
            this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               (long)(var12 + var1), (long)(var11 + var2)
            );
            if (var17 == 0
               && var13 == 0
               && var14 == 0
               && var15 == 0
               && var16 == 0
               && this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(2) == 0) {
               var10[var12 + var11 * var3] = 1;
            }
         }
      }

      return var10;
   }
}
