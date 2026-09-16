package io.sentry;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryNanotimeDate extends SentryDate {
   @NotNull
   private final Date date;
   private final long nanos;

   public SentryNanotimeDate() {
      this(DateUtils.getCurrentDateTime(), System.nanoTime());
   }

   public SentryNanotimeDate(@NotNull Date var1, long var2) {
      this.date = var1;
      this.nanos = var2;
   }

   @Override
   public long diff(@NotNull SentryDate var1) {
      if (var1 instanceof SentryNanotimeDate) {
         SentryNanotimeDate var2 = (SentryNanotimeDate)var1;
         return this.nanos - var2.nanos;
      } else {
         return super.diff(var1);
      }
   }

   @Override
   public long nanoTimestamp() {
      return DateUtils.dateToNanos(this.date);
   }

   @Override
   public long laterDateNanosTimestampByDiff(@Nullable SentryDate var1) {
      if (var1 != null && var1 instanceof SentryNanotimeDate) {
         SentryNanotimeDate var2 = (SentryNanotimeDate)var1;
         return this.compareTo(var1) < 0 ? this.nanotimeDiff(this, var2) : this.nanotimeDiff(var2, this);
      } else {
         return super.laterDateNanosTimestampByDiff(var1);
      }
   }

   @Override
   public int compareTo(@NotNull SentryDate var1) {
      if (var1 instanceof SentryNanotimeDate) {
         SentryNanotimeDate var2 = (SentryNanotimeDate)var1;
         long var3 = this.date.getTime();
         long var5 = var2.date.getTime();
         return var3 == var5 ? Long.valueOf(this.nanos).compareTo(var2.nanos) : Long.valueOf(var3).compareTo(var5);
      } else {
         return super.compareTo(var1);
      }
   }

   private long nanotimeDiff(@NotNull SentryNanotimeDate var1, @NotNull SentryNanotimeDate var2) {
      long var3 = var2.nanos - var1.nanos;
      return var1.nanoTimestamp() + var3;
   }
}
