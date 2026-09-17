import java.lang.reflect.Field;

public class SusLJuOiaMqW4UUxuyFniErIPrXBVqn4HI2oprRLrdNFj4oRy4iFyNNsUmFVwlDKoaURyQigXhswz9nTVzrWVP9s21QWPvzL7H6Y
   implements jYJdYpK6CVfq9XDUpjPUhNmqGzu0C9yGRcfjPLnlZm4An8IWGX6E9SjbuM1BCRtez1Zt9JxDGo5YuinJZkbcogVhvRIU3BvuBo7 {
   private o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL BatModClient = null;
   private String Button = null;

   public SusLJuOiaMqW4UUxuyFniErIPrXBVqn4HI2oprRLrdNFj4oRy4iFyNNsUmFVwlDKoaURyQigXhswz9nTVzrWVP9s21QWPvzL7H6Y(
      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var1, String var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   @Override
   public Field BatModClient() {
      Class var1 = this.BatModClient
         .BatModClient();
      if (var1 == null) {
         return null;
      }

      try {
         Field var2 = var1.getDeclaredField(this.Button);
         var2.setAccessible(true);
         return var2;
      } catch (NoSuchFieldException var3) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ButtonAction(
            "(Reflector) Field not present: "
               + var1.getName()
               + "."
               + this.Button
         );
         return null;
      } catch (SecurityException var4) {
         var4.printStackTrace();
         return null;
      } catch (Throwable var5) {
         var5.printStackTrace();
         return null;
      }
   }
}
