package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;

final class NoOpSentryExecutorService implements ISentryExecutorService {
   private static final NoOpSentryExecutorService instance = new NoOpSentryExecutorService();

   private NoOpSentryExecutorService() {
   }

   @NotNull
   public static ISentryExecutorService getInstance() {
      return instance;
   }

   @NotNull
   @Override
   public Future<?> submit(@NotNull Runnable var1) {
      return new FutureTask(() -> null);
   }

   @NotNull
   @Override
   public <T> Future<T> submit(@NotNull Callable<T> var1) {
      return new FutureTask<>(() -> null);
   }

   @NotNull
   @Override
   public Future<?> schedule(@NotNull Runnable var1, long var2) {
      return new FutureTask(() -> null);
   }

   @Override
   public void close(long var1) {
   }

   @Override
   public boolean isClosed() {
      return false;
   }
}
