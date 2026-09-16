package com.github.benmanes.caffeine.cache;

import java.io.Serializable;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class GuardedScheduler implements Scheduler, Serializable {
   private static final Logger logger = System.getLogger(GuardedScheduler.class.getName());
   private static final long serialVersionUID = 1L;
   final Scheduler delegate;

   GuardedScheduler(Scheduler var1) {
      this.delegate = Objects.requireNonNull(var1);
   }

   @Override
   public Future<?> schedule(Executor var1, Runnable var2, long var3, TimeUnit var5) {
      try {
         Future var6 = this.delegate.schedule(var1, var2, var3, var5);
         return var6 == null ? DisabledFuture.INSTANCE : var6;
      } catch (Throwable var7) {
         logger.log(Level.WARNING, "Exception thrown by scheduler; discarded task", var7);
         return DisabledFuture.INSTANCE;
      }
   }
}
