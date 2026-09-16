package io.sentry.transport;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.SentryDate;
import io.sentry.SentryDateProvider;
import io.sentry.SentryLevel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class QueuedThreadPoolExecutor extends ThreadPoolExecutor {
   private final int maxQueueSize;
   @Nullable
   private SentryDate lastRejectTimestamp = null;
   @NotNull
   private final ILogger logger;
   @NotNull
   private final SentryDateProvider dateProvider;
   @NotNull
   private final ReusableCountLatch unfinishedTasksCount = new ReusableCountLatch();
   private static final long RECENT_THRESHOLD = DateUtils.millisToNanos(2000L);

   public QueuedThreadPoolExecutor(
      int var1, int var2, @NotNull ThreadFactory var3, @NotNull RejectedExecutionHandler var4, @NotNull ILogger var5, @NotNull SentryDateProvider var6
   ) {
      super(var1, var1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), var3, var4);
      this.maxQueueSize = var2;
      this.logger = var5;
      this.dateProvider = var6;
   }

   @Override
   public Future<?> submit(@NotNull Runnable var1) {
      if (this.isSchedulingAllowed()) {
         this.unfinishedTasksCount.increment();
         return super.submit(var1);
      } else {
         this.lastRejectTimestamp = this.dateProvider.now();
         this.logger.log(SentryLevel.WARNING, "Submit cancelled");
         return new QueuedThreadPoolExecutor.CancelledFuture();
      }
   }

   @Override
   protected void afterExecute(@NotNull Runnable var1, @Nullable Throwable var2) {
      try {
         super.afterExecute(var1, var2);
      } finally {
         this.unfinishedTasksCount.decrement();
      }
   }

   void waitTillIdle(long var1) {
      try {
         this.unfinishedTasksCount.waitTillZero(var1, TimeUnit.MILLISECONDS);
      } catch (InterruptedException var4) {
         this.logger.log(SentryLevel.ERROR, "Failed to wait till idle", var4);
         Thread.currentThread().interrupt();
      }
   }

   public boolean isSchedulingAllowed() {
      return this.unfinishedTasksCount.getCount() < this.maxQueueSize;
   }

   public boolean didRejectRecently() {
      SentryDate var1 = this.lastRejectTimestamp;
      if (var1 == null) {
         return false;
      }

      long var2 = this.dateProvider.now().diff(var1);
      return var2 < RECENT_THRESHOLD;
   }

   static final class CancelledFuture<T> implements Future<T> {
      @Override
      public boolean cancel(boolean var1) {
         return true;
      }

      @Override
      public boolean isCancelled() {
         return true;
      }

      @Override
      public boolean isDone() {
         return true;
      }

      @Override
      public T get() {
         throw new CancellationException();
      }

      @Override
      public T get(long var1, @NotNull TimeUnit var3) {
         throw new CancellationException();
      }
   }
}
