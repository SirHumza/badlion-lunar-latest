public class o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL {
   private String BatModClient = null;
   private boolean Button = false;
   private Class CustomSpinner = null;

   public o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL(String var1) {
      this(var1, false);
   }

   public o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL(String var1, boolean var2) {
      this.BatModClient = var1;
      if (!var2) {
         Class var3 = this.BatModClient();
      }
   }

   public o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL(Class var1) {
      this.CustomSpinner = var1;
      this.BatModClient = var1.getName();
      this.Button = true;
   }

   public Class BatModClient() {
      if (this.Button) {
         return this.CustomSpinner;
      }

      this.Button = true;

      try {
         this.CustomSpinner = Class.forName(
            this.BatModClient
         );
      } catch (ClassNotFoundException var2) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ButtonAction(
            "(Reflector) Class not present: " + this.BatModClient
         );
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this.CustomSpinner;
   }

   public boolean Button() {
      return this.BatModClient() != null;
   }

   public String CustomSpinner() {
      return this.BatModClient;
   }

   public boolean BatModClient(Object var1) {
      return this.BatModClient() == null
         ? false
         : this.BatModClient().isInstance(var1);
   }

   public c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF BatModClient(
      String var1
   ) {
      return new c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF(this, var1);
   }

   public ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ Button(
      String var1
   ) {
      return new ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ(this, var1);
   }

   public ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ BatModClient(
      String var1, Class[] var2
   ) {
      return new ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ(this, var1, var2);
   }

   public ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ BatModClient(
      String var1, Class[] var2, boolean var3
   ) {
      return new ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ(this, var1, var2, var3);
   }
}
