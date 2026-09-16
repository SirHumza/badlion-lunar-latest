package com.github.benmanes.caffeine.cache;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@FunctionalInterface
public interface Scheduler {
   Future<?> schedule(Executor var1, Runnable var2, long var3, TimeUnit var5);

   static Scheduler disabledScheduler() {
      return DisabledScheduler.INSTANCE;
   }

   static Scheduler systemScheduler() {
      return SystemScheduler.INSTANCE;
   }

   static Scheduler forScheduledExecutorService(ScheduledExecutorService var0) {
      return new ExecutorServiceScheduler(var0);
   }

   static Scheduler guardedScheduler(Scheduler var0) {
      return var0 instanceof GuardedScheduler ? var0 : new GuardedScheduler(var0);
   }
}
