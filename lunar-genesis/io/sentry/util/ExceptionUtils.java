package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class ExceptionUtils {
   @NotNull
   public static Throwable findRootCause(@NotNull Throwable var0) {
      Objects.requireNonNull(var0, "throwable cannot be null");
      Throwable var1 = var0;

      while (var1.getCause() != null && var1.getCause() != var1) {
         var1 = var1.getCause();
      }

      return var1;
   }
}
