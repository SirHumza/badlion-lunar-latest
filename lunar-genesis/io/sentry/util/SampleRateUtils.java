package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SampleRateUtils {
   public static boolean isValidSampleRate(@Nullable Double var0) {
      return isValidRate(var0, true);
   }

   public static boolean isValidTracesSampleRate(@Nullable Double var0) {
      return isValidTracesSampleRate(var0, true);
   }

   public static boolean isValidTracesSampleRate(@Nullable Double var0, boolean var1) {
      return isValidRate(var0, var1);
   }

   public static boolean isValidProfilesSampleRate(@Nullable Double var0) {
      return isValidRate(var0, true);
   }

   private static boolean isValidRate(@Nullable Double var0, boolean var1) {
      return var0 == null ? var1 : !var0.isNaN() && var0 >= 0.0 && var0 <= 1.0;
   }
}
