package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class SentryExecutorService implements ISentryExecutorService {
   @NotNull
   private final ScheduledExecutorService executorService;

   @TestOnly
   SentryExecutorService(@NotNull ScheduledExecutorService var1) {
      this.executorService = var1;
   }

   public SentryExecutorService() {
      this(Executors.newSingleThreadScheduledExecutor(new SentryExecutorService.SentryExecutorServiceThreadFactory()));
   }

   @NotNull
   @Override
   public Future<?> submit(@NotNull Runnable var1) {
      return this.executorService.submit(var1);
   }

   @NotNull
   @Override
   public <T> Future<T> submit(@NotNull Callable<T> var1) {
      return this.executorService.submit(var1);
   }

   @NotNull
   @Override
   public Future<?> schedule(@NotNull Runnable var1, long var2) {
      return this.executorService.schedule(var1, var2, TimeUnit.MILLISECONDS);
   }

   @Override
   public void close(long var1) {
      synchronized (this.executorService) {
         if (!this.executorService.isShutdown()) {
            this.executorService.shutdown();

            try {
               if (!this.executorService.awaitTermination(var1, TimeUnit.MILLISECONDS)) {
                  this.executorService.shutdownNow();
               }
            } catch (InterruptedException var6) {
               this.executorService.shutdownNow();
               Thread.currentThread().interrupt();
            }
         }
      }
   }

   @Override
   public boolean isClosed() {
      synchronized (this.executorService) {
         return this.executorService.isShutdown();
      }
   }

   private static final class SentryExecutorServiceThreadFactory implements ThreadFactory {
      private int cnt;

      private SentryExecutorServiceThreadFactory() {
      }

      @NotNull
      @Override
      public Thread newThread(@NotNull Runnable var1) {
         Thread var2 = new Thread(var1, "SentryExecutorServiceThreadFactory-" + this.cnt++);
         var2.setDaemon(true);
         return var2;
      }
   }
}
