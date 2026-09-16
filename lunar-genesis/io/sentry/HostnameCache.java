package io.sentry;

import io.sentry.util.Objects;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class HostnameCache {
   private static final long HOSTNAME_CACHE_DURATION = TimeUnit.HOURS.toMillis(5L);
   private static final long GET_HOSTNAME_TIMEOUT = TimeUnit.SECONDS.toMillis(1L);
   @Nullable
   private static HostnameCache INSTANCE;
   private final long cacheDuration;
   @Nullable
   private volatile String hostname;
   private volatile long expirationTimestamp;
   @NotNull
   private final AtomicBoolean updateRunning = new AtomicBoolean(false);
   @NotNull
   private final Callable<InetAddress> getLocalhost;
   @NotNull
   private final ExecutorService executorService = Executors.newSingleThreadExecutor(new HostnameCache.HostnameCacheThreadFactory());

   @NotNull
   static HostnameCache getInstance() {
      if (INSTANCE == null) {
         INSTANCE = new HostnameCache();
      }

      return INSTANCE;
   }

   private HostnameCache() {
      this(HOSTNAME_CACHE_DURATION);
   }

   HostnameCache(long var1) {
      this(var1, () -> InetAddress.getLocalHost());
   }

   HostnameCache(long var1, @NotNull Callable<InetAddress> var3) {
      this.cacheDuration = var1;
      this.getLocalhost = Objects.requireNonNull(var3, "getLocalhost is required");
      this.updateCache();
   }

   void close() {
      this.executorService.shutdown();
   }

   boolean isClosed() {
      return this.executorService.isShutdown();
   }

   @Nullable
   String getHostname() {
      if (this.expirationTimestamp < System.currentTimeMillis() && this.updateRunning.compareAndSet(false, true)) {
         this.updateCache();
      }

      return this.hostname;
   }

   private void updateCache() {
      Callable var1 = () -> {
         try {
            this.hostname = this.getLocalhost.call().getCanonicalHostName();
            this.expirationTimestamp = System.currentTimeMillis() + this.cacheDuration;
         } finally {
            this.updateRunning.set(false);
         }

         return null;
      };

      try {
         Future var2 = this.executorService.submit(var1);
         var2.get(GET_HOSTNAME_TIMEOUT, TimeUnit.MILLISECONDS);
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
         this.handleCacheUpdateFailure();
      } catch (ExecutionException | TimeoutException | RuntimeException var4) {
         this.handleCacheUpdateFailure();
      }
   }

   private void handleCacheUpdateFailure() {
      this.expirationTimestamp = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
   }

   private static final class HostnameCacheThreadFactory implements ThreadFactory {
      private int cnt;

      private HostnameCacheThreadFactory() {
      }

      @NotNull
      @Override
      public Thread newThread(@NotNull Runnable var1) {
         Thread var2 = new Thread(var1, "SentryHostnameCache-" + this.cnt++);
         var2.setDaemon(true);
         return var2;
      }
   }
}
