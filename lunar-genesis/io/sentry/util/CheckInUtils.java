package io.sentry.util;

import io.sentry.CheckIn;
import io.sentry.CheckInStatus;
import io.sentry.DateUtils;
import io.sentry.IHub;
import io.sentry.MonitorConfig;
import io.sentry.Sentry;
import io.sentry.protocol.SentryId;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class CheckInUtils {
   public static <U> U withCheckIn(@NotNull String var0, @Nullable MonitorConfig var1, @NotNull Callable<U> var2) {
      IHub var3 = Sentry.getCurrentHub();
      long var4 = System.currentTimeMillis();
      boolean var6 = false;
      var3.pushScope();
      TracingUtils.startNewTrace(var3);
      CheckIn var7 = new CheckIn(var0, CheckInStatus.IN_PROGRESS);
      if (var1 != null) {
         var7.setMonitorConfig(var1);
      }

      SentryId var8 = var3.captureCheckIn(var7);

      try {
         return (U)var2.call();
      } catch (Throwable var17) {
         var6 = true;
         throw var17;
      } finally {
         CheckInStatus var13 = var6 ? CheckInStatus.ERROR : CheckInStatus.OK;
         CheckIn var14 = new CheckIn(var8, var0, var13);
         var14.setDuration(DateUtils.millisToSeconds(System.currentTimeMillis() - var4));
         var3.captureCheckIn(var14);
         var3.popScope();
      }
   }

   public static <U> U withCheckIn(@NotNull String var0, @NotNull Callable<U> var1) {
      return withCheckIn(var0, null, var1);
   }

   @ApiStatus.Internal
   public static boolean isIgnored(@Nullable List<String> var0, @NotNull String var1) {
      if (var0 != null && !var0.isEmpty()) {
         for (String var3 : var0) {
            if (var3.equalsIgnoreCase(var1)) {
               return true;
            }

            try {
               if (var1.matches(var3)) {
                  return true;
               }
            } catch (Throwable var5) {
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
