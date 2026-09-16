package io.sentry;

import java.time.Instant;
import org.jetbrains.annotations.NotNull;

public final class SentryInstantDate extends SentryDate {
   @NotNull
   private final Instant date;

   public SentryInstantDate() {
      this(Instant.now());
   }

   public SentryInstantDate(@NotNull Instant var1) {
      this.date = var1;
   }

   @Override
   public long nanoTimestamp() {
      return DateUtils.secondsToNanos(this.date.getEpochSecond()) + this.date.getNano();
   }
}
