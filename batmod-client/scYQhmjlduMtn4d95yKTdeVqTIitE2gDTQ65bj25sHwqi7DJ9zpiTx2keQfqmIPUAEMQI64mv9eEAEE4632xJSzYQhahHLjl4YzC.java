public class scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC {
   private final int BatModClient;
   private jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS Button;
   private int CustomSpinner = 1;
   private int ButtonAction;

   public scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC(
      int var1, c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var2
   ) {
      this(3, var1, var2);
   }

   public scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC(
      int var1, int var2, c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var3
   ) {
      this.BatModClient = var1;
      this.CustomSpinner = var2;
      this.Button = var3.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt();
   }

   public scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC(
      int var1, int var2, c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var3, int var4
   ) {
      this(var1, var2, var3);
      this.Button = var3.CustomSpinner(
         var4
      );
   }

   public int BatModClient() {
      return this.CustomSpinner;
   }

   public jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS Button() {
      return this.Button;
   }

   private c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G ButtonAction() {
      return this.Button
         .CustomSpinner();
   }

   private int Spinner() {
      return this.Button
         .CustomSpinner()
         .CustomSpinner(
            this.Button
         );
   }

   public int CustomSpinner() {
      return this.ButtonAction;
   }

   public void BatModClient(int var1) {
      this.ButtonAction = var1;
   }

   @Override
   public String toString() {
      String var1;
      if (this.BatModClient >= 3) {
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2 = (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient
            .Button(
               this.ButtonAction()
            );
         var1 = var2 == null ? "null" : var2.toString();
         if (this.CustomSpinner > 1) {
            var1 = this.CustomSpinner + "*" + var1;
         }
      } else {
         var1 = Integer.toString(
            c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
               this.ButtonAction()
            )
         );
         if (this.CustomSpinner > 1) {
            var1 = this.CustomSpinner + "x" + var1;
         }
      }

      int var3 = this.Spinner();
      if (var3 > 0) {
         var1 = var1 + ":" + var3;
      }

      return var1;
   }
}
