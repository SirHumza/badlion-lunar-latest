package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface ISentryExecutorService {
   @NotNull
   Future<?> submit(@NotNull Runnable var1);

   @NotNull
   <T> Future<T> submit(@NotNull Callable<T> var1);

   @NotNull
   Future<?> schedule(@NotNull Runnable var1, long var2);

   void close(long var1);

   boolean isClosed();
}
