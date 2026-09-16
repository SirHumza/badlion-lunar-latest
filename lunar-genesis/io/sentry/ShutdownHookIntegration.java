package io.sentry;

import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import org.jetbrains.annotations.VisibleForTesting;

public final class ShutdownHookIntegration implements Integration, Closeable {
   @NotNull
   private final Runtime runtime;
   @Nullable
   private Thread thread;

   @TestOnly
   public ShutdownHookIntegration(@NotNull Runtime var1) {
      this.runtime = Objects.requireNonNull(var1, "Runtime is required");
   }

   public ShutdownHookIntegration() {
      this(Runtime.getRuntime());
   }

   @Override
   public void register(@NotNull IHub var1, @NotNull SentryOptions var2) {
      Objects.requireNonNull(var1, "Hub is required");
      Objects.requireNonNull(var2, "SentryOptions is required");
      if (var2.isEnableShutdownHook()) {
         this.thread = new Thread(() -> var1.flush(var2.getFlushTimeoutMillis()));
         this.handleShutdownInProgress(() -> {
            this.runtime.addShutdownHook(this.thread);
            var2.getLogger().log(SentryLevel.DEBUG, "ShutdownHookIntegration installed.");
            IntegrationUtils.addIntegrationToSdkVersion("ShutdownHook");
         });
      } else {
         var2.getLogger().log(SentryLevel.INFO, "enableShutdownHook is disabled.");
      }
   }

   @Override
   public void close() {
      if (this.thread != null) {
         this.handleShutdownInProgress(() -> this.runtime.removeShutdownHook(this.thread));
      }
   }

   private void handleShutdownInProgress(@NotNull Runnable var1) {
      try {
         var1.run();
      } catch (IllegalStateException var4) {
         String var3 = var4.getMessage();
         if (var3 == null || !var3.equals("Shutdown in progress") && !var3.equals("VM already shutting down")) {
            throw var4;
         }
      }
   }

   @VisibleForTesting
   @Nullable
   Thread getHook() {
      return this.thread;
   }
}
