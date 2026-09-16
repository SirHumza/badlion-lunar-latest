package io.sentry.backpressure;

import io.sentry.IHub;
import io.sentry.ISentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import org.jetbrains.annotations.NotNull;

public final class BackpressureMonitor implements IBackpressureMonitor, Runnable {
   static final int MAX_DOWNSAMPLE_FACTOR = 10;
   private static final int INITIAL_CHECK_DELAY_IN_MS = 500;
   private static final int CHECK_INTERVAL_IN_MS = 10000;
   @NotNull
   private final SentryOptions sentryOptions;
   @NotNull
   private final IHub hub;
   private int downsampleFactor = 0;

   public BackpressureMonitor(@NotNull SentryOptions var1, @NotNull IHub var2) {
      this.sentryOptions = var1;
      this.hub = var2;
   }

   @Override
   public void start() {
      this.reschedule(500);
   }

   @Override
   public void run() {
      this.checkHealth();
      this.reschedule(10000);
   }

   @Override
   public int getDownsampleFactor() {
      return this.downsampleFactor;
   }

   void checkHealth() {
      if (this.isHealthy()) {
         if (this.downsampleFactor > 0) {
            this.sentryOptions.getLogger().log(SentryLevel.DEBUG, "Health check positive, reverting to normal sampling.");
         }

         this.downsampleFactor = 0;
      } else if (this.downsampleFactor < 10) {
         this.downsampleFactor++;
         this.sentryOptions.getLogger().log(SentryLevel.DEBUG, "Health check negative, downsampling with a factor of %d", this.downsampleFactor);
      }
   }

   private void reschedule(int var1) {
      ISentryExecutorService var2 = this.sentryOptions.getExecutorService();
      if (!var2.isClosed()) {
         var2.schedule(this, var1);
      }
   }

   private boolean isHealthy() {
      return this.hub.isHealthy();
   }
}
