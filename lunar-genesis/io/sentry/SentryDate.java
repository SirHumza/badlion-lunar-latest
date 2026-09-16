package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class SentryDate implements Comparable<SentryDate> {
   public abstract long nanoTimestamp();

   public long laterDateNanosTimestampByDiff(@Nullable SentryDate var1) {
      return var1 != null && this.compareTo(var1) < 0 ? var1.nanoTimestamp() : this.nanoTimestamp();
   }

   public long diff(@NotNull SentryDate var1) {
      return this.nanoTimestamp() - var1.nanoTimestamp();
   }

   public final boolean isBefore(@NotNull SentryDate var1) {
      return this.diff(var1) < 0L;
   }

   public final boolean isAfter(@NotNull SentryDate var1) {
      return this.diff(var1) > 0L;
   }

   public int compareTo(@NotNull SentryDate var1) {
      return Long.valueOf(this.nanoTimestamp()).compareTo(var1.nanoTimestamp());
   }
}
