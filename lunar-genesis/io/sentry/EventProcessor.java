package io.sentry;

import io.sentry.protocol.SentryTransaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface EventProcessor {
   @Nullable
   default SentryEvent process(@NotNull SentryEvent var1, @NotNull Hint var2) {
      return var1;
   }

   @Nullable
   default SentryTransaction process(@NotNull SentryTransaction var1, @NotNull Hint var2) {
      return var1;
   }

   @Nullable
   default SentryReplayEvent process(@NotNull SentryReplayEvent var1, @NotNull Hint var2) {
      return var1;
   }
}
