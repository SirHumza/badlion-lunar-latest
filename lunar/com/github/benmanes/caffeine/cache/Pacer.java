package com.github.benmanes.caffeine.cache;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.Nullable;

final class Pacer {
   static final long TOLERANCE = Caffeine.ceilingPowerOfTwo(TimeUnit.SECONDS.toNanos(1L));
   final Scheduler scheduler;
   long nextFireTime;
   @Nullable Future<?> future;

   Pacer(Scheduler var1) {
      this.scheduler = Objects.requireNonNull(var1);
   }

   public void schedule(Executor var1, Runnable var2, long var3, long var5) {
      long var7 = var3 + var5;
      if (this.future == null) {
         if (this.nextFireTime != 0L) {
            return;
         }
      } else if (this.nextFireTime - var3 > 0L) {
         if (this.maySkip(var7)) {
            return;
         }

         this.future.cancel(false);
      }

      long var9 = this.calculateSchedule(var3, var5, var7);
      this.future = this.scheduler.schedule(var1, var2, var9, TimeUnit.NANOSECONDS);
   }

   public void cancel() {
      if (this.future != null) {
         this.future.cancel(false);
         this.nextFireTime = 0L;
         this.future = null;
      }
   }

   public boolean isScheduled() {
      return this.future != null && !this.future.isDone();
   }

   boolean maySkip(long var1) {
      long var3 = var1 - this.nextFireTime;
      return var3 >= 0L || -var3 <= TOLERANCE;
   }

   long calculateSchedule(long var1, long var3, long var5) {
      if (var3 <= TOLERANCE) {
         this.nextFireTime = var1 + TOLERANCE;
         return TOLERANCE;
      } else {
         this.nextFireTime = var5;
         return var3;
      }
   }
}
