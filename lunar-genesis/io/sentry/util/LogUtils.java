package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class LogUtils {
   public static void logNotInstanceOf(@NotNull Class<?> var0, @Nullable Object var1, @NotNull ILogger var2) {
      var2.log(SentryLevel.DEBUG, "%s is not %s", var1 != null ? var1.getClass().getCanonicalName() : "Hint", var0.getCanonicalName());
   }
}
