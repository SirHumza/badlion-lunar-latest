public class bQAN0rQjI9c2GfaHiAMJd7vdkyXCkwt50O5EUH0QfylBoj2HHwy4YteBIlOCkQwFs6YGUiv3S0cEnmf4Mzspw7Muc2v82RAajUlI {
   private q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient;
   private c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G Button;
   private int CustomSpinner;
   private int ButtonAction;

   public bQAN0rQjI9c2GfaHiAMJd7vdkyXCkwt50O5EUH0QfylBoj2HHwy4YteBIlOCkQwFs6YGUiv3S0cEnmf4Mzspw7Muc2v82RAajUlI(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var2,
      int var3,
      int var4
   ) {
      this.BatModClient = var1;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Button = var2;
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.CustomSpinner;
   }

   public int CustomSpinner() {
      return this.ButtonAction;
   }

   public c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G ButtonAction() {
      return this.Button;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof bQAN0rQjI9c2GfaHiAMJd7vdkyXCkwt50O5EUH0QfylBoj2HHwy4YteBIlOCkQwFs6YGUiv3S0cEnmf4Mzspw7Muc2v82RAajUlI)) {
         return false;
      }

      bQAN0rQjI9c2GfaHiAMJd7vdkyXCkwt50O5EUH0QfylBoj2HHwy4YteBIlOCkQwFs6YGUiv3S0cEnmf4Mzspw7Muc2v82RAajUlI var2 = (bQAN0rQjI9c2GfaHiAMJd7vdkyXCkwt50O5EUH0QfylBoj2HHwy4YteBIlOCkQwFs6YGUiv3S0cEnmf4Mzspw7Muc2v82RAajUlI)var1;
      return this.BatModClient
            .equals(var2.BatModClient)
         && this.CustomSpinner
            == var2.CustomSpinner
         && this.ButtonAction
            == var2.ButtonAction
         && this.Button
            == var2.Button;
   }

   @Override
   public String toString() {
      return "TE("
         + this.BatModClient
         + "),"
         + this.CustomSpinner
         + ","
         + this.ButtonAction
         + ","
         + this.Button;
   }
}
