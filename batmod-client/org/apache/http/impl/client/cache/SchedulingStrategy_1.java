package org.apache.http.impl.client.cache;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.ThreadSafe;

@ThreadSafe
public class ImmediateSchedulingStrategy implements SchedulingStrategy {
   private final ExecutorService executor;

   public ImmediateSchedulingStrategy(CacheConfig cacheConfig) {
      this(
         new ThreadPoolExecutor(
            cacheConfig.getAsynchronousWorkersCore(),
            cacheConfig.getAsynchronousWorkersMax(),
            cacheConfig.getAsynchronousWorkerIdleLifetimeSecs(),
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(cacheConfig.getRevalidationQueueSize())
         )
      );
   }

   ImmediateSchedulingStrategy(ExecutorService executor) {
      this.executor = executor;
   }

   @Override
   public void schedule(AsynchronousValidationRequest revalidationRequest) {
      if (revalidationRequest == null) {
         throw new IllegalArgumentException("AsynchronousValidationRequest may not be null");
      }

      this.executor.execute(revalidationRequest);
   }

   @Override
   public void close() {
      this.executor.shutdown();
   }

   void awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
      this.executor.awaitTermination(timeout, unit);
   }
}
