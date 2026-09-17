import java.lang.reflect.Method;
import java.util.ArrayList;

public class ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ {
   private o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL BatModClient = null;
   private String Button = null;
   private Class[] CustomSpinner = null;
   private boolean ButtonAction = false;
   private Method Spinner = null;

   public ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ(
      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var1, String var2
   ) {
      this(var1, var2, (Class[])null, false);
   }

   public ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ(
      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var1, String var2, Class[] var3
   ) {
      this(var1, var2, var3, false);
   }

   public ZVaLCKQpu1kEoW2pTgukqyZkV2IHTetLYQdxECvztGxylyvrxIJA3u9YWDWXfqbBVvzRn35WsS5ROx7l7Nhxz8kWzm8R3QI4Y1LJ(
      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var1, String var2, Class[] var3, boolean var4
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      if (!var4) {
         Method var5 = this.BatModClient();
      }
   }

   public Method BatModClient() {
      if (this.ButtonAction) {
         return this.Spinner;
      }

      this.ButtonAction = true;
      Class var1 = this.BatModClient
         .BatModClient();
      if (var1 == null) {
         return null;
      }

      try {
         if (this.CustomSpinner == null) {
            Method[] var2 = BatModClient(
               var1, this.Button
            );
            if (var2.length <= 0) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ButtonAction(
                  "(Reflector) Method not present: "
                     + var1.getName()
                     + "."
                     + this.Button
               );
               return null;
            }

            if (var2.length > 1) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                  "(Reflector) More than one method found: "
                     + var1.getName()
                     + "."
                     + this.Button
               );

               for (int var3 = 0; var3 < var2.length; var3++) {
                  Method var4 = var2[var3];
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "(Reflector)  - " + var4
                  );
               }

               return null;
            }

            this.Spinner = var2[0];
         } else {
            this.Spinner = BatModClient(
               var1,
               this.Button,
               this.CustomSpinner
            );
         }

         if (this.Spinner == null) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ButtonAction(
               "(Reflector) Method not present: "
                  + var1.getName()
                  + "."
                  + this.Button
            );
            return null;
         } else {
            this.Spinner.setAccessible(true);
            return this.Spinner;
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public boolean Button() {
      return this.ButtonAction
         ? this.Spinner != null
         : this.BatModClient() != null;
   }

   public Class CustomSpinner() {
      Method var1 = this.BatModClient();
      return var1 == null ? null : var1.getReturnType();
   }

   public void ButtonAction() {
      this.ButtonAction = true;
      this.Spinner = null;
   }

   public static Method BatModClient(
      Class var0, String var1, Class[] var2
   ) {
      Method[] var3 = var0.getDeclaredMethods();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Method var5 = var3[var4];
         if (var5.getName().equals(var1)) {
            Class[] var6 = var5.getParameterTypes();
            if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BatModClient(
               var2, var6
            )) {
               return var5;
            }
         }
      }

      return null;
   }

   public static Method[] BatModClient(Class var0, String var1) {
      ArrayList var2 = new ArrayList();
      Method[] var3 = var0.getDeclaredMethods();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Method var5 = var3[var4];
         if (var5.getName().equals(var1)) {
            var2.add(var5);
         }
      }

      return var2.toArray(new Method[var2.size()]);
   }
}
