public class MEr6xlCpAu2hs72ABbLjma9IOR6HVF0WSzlfM1IdqEIqCmwilrlczWxRjJEvmKDg88dYw84PxT0QALrD3brl3Sdtrgb4xzOjxOEW {
   private o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL BatModClient;
   private Class Button;
   private int CustomSpinner;
   private c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF[] ButtonAction;

   public MEr6xlCpAu2hs72ABbLjma9IOR6HVF0WSzlfM1IdqEIqCmwilrlczWxRjJEvmKDg88dYw84PxT0QALrD3brl3Sdtrgb4xzOjxOEW(
      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var1, Class var2, int var3
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      if (var1.Button() && var2 != null) {
         this.ButtonAction = new c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF[var3];

         for (int var4 = 0; var4 < this.ButtonAction.length; var4++) {
            this.ButtonAction[var4] = new c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF(
               var1, var2, var4
            );
         }
      }
   }

   public o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL BatModClient() {
      return this.BatModClient;
   }

   public Class Button() {
      return this.Button;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }

   public c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF BatModClient(
      int var1
   ) {
      return var1 >= 0 && var1 < this.ButtonAction.length
         ? this.ButtonAction[var1]
         : null;
   }
}
