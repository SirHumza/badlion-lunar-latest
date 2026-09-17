import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class s7aw3BgQtB16AmUgFqDhhy7VB275d1ymeOHxaMA7xFNrhBmt6x4lkiDss6JfxkabFaGgdaKwIUQIrkDmWDPztZyns1OJSnqQAbwR {
   private static final Map BatModClient = Maps.newHashMap();

   public static synchronized wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ BatModClient(
      File var0, int var1, int var2
   ) {
      File var3 = new File(var0, "region");
      File var4 = new File(var3, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mca");
      wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ var5 = (wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ)BatModClient.get(
         var4
      );
      if (var5 != null) {
         return var5;
      }

      if (!var3.exists()) {
         var3.mkdirs();
      }

      if (BatModClient.size() >= 256) {
         BatModClient();
      }

      wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ var6 = new wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ(
         var4
      );
      BatModClient.put(var4, var6);
      return var6;
   }

   public static synchronized void BatModClient() {
      for (wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ var1 : BatModClient.values()) {
         try {
            if (var1 != null) {
               var1.BatModClient();
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      BatModClient.clear();
   }

   public static DataInputStream Button(
      File var0, int var1, int var2
   ) {
      wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ var3 = BatModClient(
         var0, var1, var2
      );
      return var3.BatModClient(var1 & 31, var2 & 31);
   }

   public static DataOutputStream CustomSpinner(
      File var0, int var1, int var2
   ) {
      wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ var3 = BatModClient(
         var0, var1, var2
      );
      return var3.Button(var1 & 31, var2 & 31);
   }
}
