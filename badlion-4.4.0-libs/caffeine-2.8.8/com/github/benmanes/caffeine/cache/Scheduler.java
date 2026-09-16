package com.github.benmanes.caffeine.cache;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.index.qual.Positive;
import org.checkerframework.checker.nullness.qual.NonNull;

@FunctionalInterface
public interface Scheduler {
   @NonNull Future<?> schedule(@NonNull Executor var1, @NonNull Runnable var2, @Positive long var3, @NonNull TimeUnit var5);

   static @NonNull Scheduler disabledScheduler() {
      return DisabledScheduler.INSTANCE;
   }

   static @NonNull Scheduler systemScheduler() {
      return SystemScheduler.isPresent() ? SystemScheduler.INSTANCE : disabledScheduler();
   }

   static @NonNull Scheduler forScheduledExecutorService(@NonNull ScheduledExecutorService scheduledExecutorService) {
      return new ExecutorServiceScheduler(scheduledExecutorService);
   }

   static @NonNull Scheduler guardedScheduler(@NonNull Scheduler scheduler) {
      return scheduler instanceof GuardedScheduler ? scheduler : new GuardedScheduler(scheduler);
   }
}
