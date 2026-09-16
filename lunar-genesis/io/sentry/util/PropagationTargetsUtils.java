package io.sentry.util;

import java.net.URI;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class PropagationTargetsUtils {
   public static boolean contain(@NotNull List<String> var0, @NotNull String var1) {
      if (var0.isEmpty()) {
         return false;
      }

      for (String var3 : var0) {
         if (var1.contains(var3)) {
            return true;
         }

         try {
            if (var1.matches(var3)) {
               return true;
            }
         } catch (Exception var5) {
         }
      }

      return false;
   }

   public static boolean contain(@NotNull List<String> var0, URI var1) {
      return contain(var0, var1.toString());
   }
}
