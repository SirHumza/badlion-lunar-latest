import com.google.common.collect.Maps;
import java.util.Map;

public enum kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN {
   BatModClient("always", 0),
   Button("never", 1),
   CustomSpinner("hideForOtherTeams", 2),
   ButtonAction("hideForOwnTeam", 3);

   private static Map ProgressBar = Maps.newHashMap();
   public final String Spinner;
   public final int Checkbox;

   public static String[] BatModClient() {
      return ProgressBar.keySet()
         .toArray(new String[ProgressBar.size()]);
   }

   public static kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN BatModClient(
      String var0
   ) {
      return (kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN)ProgressBar.get(
         var0
      );
   }

   kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN(String var3, int var4) {
      this.Spinner = var3;
      this.Checkbox = var4;
   }

   static {
      for (kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN var3 : values()) {
         ProgressBar.put(
            var3.Spinner, var3
         );
      }
   }
}
