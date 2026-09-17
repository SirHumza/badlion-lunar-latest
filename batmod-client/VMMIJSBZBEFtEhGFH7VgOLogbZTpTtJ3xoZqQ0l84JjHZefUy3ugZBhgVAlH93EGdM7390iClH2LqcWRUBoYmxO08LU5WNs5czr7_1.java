public class fD0u36wxObn1shiQs9X1htuMbPJGC9T1m0rU7kmkX6GbeRwro00xC2tsx9OmgrjxmXkQskrQAFvxl7Mj2JOYaW3DnsUblHoaDN2
   extends VMMIJSBZBEFtEhGFH7VgOLogbZTpTtJ3xoZqQ0l84JjHZefUy3ugZBhgVAlH93EGdM7390iClH2LqcWRUBoYmxO08LU5WNs5czr7 {
   private c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G BatModProgressBar;
   private c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G ColorChooser;

   public fD0u36wxObn1shiQs9X1htuMbPJGC9T1m0rU7kmkX6GbeRwro00xC2tsx9OmgrjxmXkQskrQAFvxl7Mj2JOYaW3DnsUblHoaDN2(
      int var1,
      float var2,
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var3,
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var4
   ) {
      super(var1, var2, false);
      this.BatModProgressBar = var3;
      this.ColorChooser = var4;
   }

   @Override
   public boolean BatModClient(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1,
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var2,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var3,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var5,
      float var6,
      float var7,
      float var8
   ) {
      if (var5
         != NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Button
         )
       {
         return false;
      } else if (!var2.BatModClient(
         var4.BatModClient(var5), var5, var1
      )) {
         return false;
      } else if (var3.Button(var4)
               .CustomSpinner()
            == this.ColorChooser
         && var3.ButtonAction(
            var4.BatModClient()
         )) {
         var3.Button(
            var4.BatModClient(),
            this.BatModProgressBar
               .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
         );
         var1.Button--;
         return true;
      } else {
         return false;
      }
   }
}
