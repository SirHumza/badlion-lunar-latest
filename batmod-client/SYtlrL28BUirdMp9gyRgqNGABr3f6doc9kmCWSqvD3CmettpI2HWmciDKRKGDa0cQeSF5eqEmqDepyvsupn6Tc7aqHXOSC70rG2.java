import java.lang.reflect.Constructor;

public class SYtlrL28BUirdMp9gyRgqNGABr3f6doc9kmCWSqvD3CmettpI2HWmciDKRKGDa0cQeSF5eqEmqDepyvsupn6Tc7aqHXOSC70rG2 {
   private o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL BatModClient = null;
   private Class[] Button = null;
   private boolean CustomSpinner = false;
   private Constructor ButtonAction = null;

   public SYtlrL28BUirdMp9gyRgqNGABr3f6doc9kmCWSqvD3CmettpI2HWmciDKRKGDa0cQeSF5eqEmqDepyvsupn6Tc7aqHXOSC70rG2(
      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var1, Class[] var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      Constructor var3 = this.BatModClient();
   }

   public Constructor BatModClient() {
      if (this.CustomSpinner) {
         return this.ButtonAction;
      }

      this.CustomSpinner = true;
      Class var1 = this.BatModClient
         .BatModClient();
      if (var1 == null) {
         return null;
      }

      try {
         this.ButtonAction = BatModClient(
            var1, this.Button
         );
         if (this.ButtonAction == null) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               "(Reflector) Constructor not present: "
                  + var1.getName()
                  + ", params: "
                  + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.Button
                  )
            );
         }

         if (this.ButtonAction != null) {
            this.ButtonAction.setAccessible(true);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this.ButtonAction;
   }

   private static Constructor BatModClient(Class var0, Class[] var1) {
      Constructor[] var2 = var0.getDeclaredConstructors();

      for (int var3 = 0; var3 < var2.length; var3++) {
         Constructor var4 = var2[var3];
         Class[] var5 = var4.getParameterTypes();
         if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BatModClient(
            var1, var5
         )) {
            return var4;
         }
      }

      return null;
   }

   public boolean Button() {
      return this.CustomSpinner
         ? this.ButtonAction != null
         : this.BatModClient() != null;
   }

   public void CustomSpinner() {
      this.CustomSpinner = true;
      this.ButtonAction = null;
   }
}
