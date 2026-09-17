import java.lang.reflect.Field;

public class Rz1lIIL6STWOQ5F7Y3dYgv0m4KLO61zxhpsDLxPgdUtkLEGpyuAYxFKLmdnsTyGOplwbfBZVqdcxKM8nXX1w0iI8DGn9ZvUn8xM9
   implements jYJdYpK6CVfq9XDUpjPUhNmqGzu0C9yGRcfjPLnlZm4An8IWGX6E9SjbuM1BCRtez1Zt9JxDGo5YuinJZkbcogVhvRIU3BvuBo7 {
   private o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL BatModClient = null;
   private Class Button = null;
   private int CustomSpinner;

   public Rz1lIIL6STWOQ5F7Y3dYgv0m4KLO61zxhpsDLxPgdUtkLEGpyuAYxFKLmdnsTyGOplwbfBZVqdcxKM8nXX1w0iI8DGn9ZvUn8xM9(
      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var1, Class var2
   ) {
      this(var1, var2, 0);
   }

   public Rz1lIIL6STWOQ5F7Y3dYgv0m4KLO61zxhpsDLxPgdUtkLEGpyuAYxFKLmdnsTyGOplwbfBZVqdcxKM8nXX1w0iI8DGn9ZvUn8xM9(
      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var1, Class var2, int var3
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   @Override
   public Field BatModClient() {
      Class var1 = this.BatModClient
         .BatModClient();
      if (var1 == null) {
         return null;
      }

      try {
         Field[] var2 = var1.getDeclaredFields();
         int var3 = 0;

         for (int var4 = 0; var4 < var2.length; var4++) {
            Field var5 = var2[var4];
            if (var5.getType() == this.Button) {
               if (var3 == this.CustomSpinner) {
                  var5.setAccessible(true);
                  return var5;
               }

               var3++;
            }
         }

         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ButtonAction(
            "(Reflector) Field not present: "
               + var1.getName()
               + ".(type: "
               + this.Button
               + ", index: "
               + this.CustomSpinner
               + ")"
         );
         return null;
      } catch (SecurityException var6) {
         var6.printStackTrace();
         return null;
      } catch (Throwable var7) {
         var7.printStackTrace();
         return null;
      }
   }
}
