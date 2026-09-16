package com.github.benmanes.caffeine.cache;

import java.io.Serializable;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class ExecutorServiceScheduler implements Scheduler, Serializable {
   private static final Logger logger = System.getLogger(ExecutorServiceScheduler.class.getName());
   private static final long serialVersionUID = 1L;
   final ScheduledExecutorService scheduledExecutorService;

   ExecutorServiceScheduler(ScheduledExecutorService var1) {
      this.scheduledExecutorService = Objects.requireNonNull(var1);
   }

   @Override
   public Future<?> schedule(Executor var1, Runnable var2, long var3, TimeUnit var5) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      Objects.requireNonNull(var5);
      return this.scheduledExecutorService.isShutdown() ? DisabledFuture.INSTANCE : this.scheduledExecutorService.schedule(() -> {
         try {
            var1.execute(var2);
         } catch (Throwable var3x) {
            logger.log(Level.WARNING, "Exception thrown when submitting scheduled task", var3x);
            throw var3x;
         }
      }, var3, var5);
   }
}
