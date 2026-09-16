package io.sentry;

import java.net.URI;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class DsnUtil {
   public static boolean urlContainsDsnHost(@Nullable SentryOptions var0, @Nullable String var1) {
      if (var0 == null) {
         return false;
      }

      if (var1 == null) {
         return false;
      }

      String var2 = var0.getDsn();
      if (var2 == null) {
         return false;
      }

      Dsn var3 = var0.retrieveParsedDsn();
      URI var4 = var3.getSentryUri();
      String var5 = var4.getHost();
      return var5 == null ? false : var1.toLowerCase(Locale.ROOT).contains(var5.toLowerCase(Locale.ROOT));
   }
}
