package io.sentry;

import io.sentry.transport.RateLimiter;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SendCachedEnvelopeFireAndForgetIntegration implements IConnectionStatusProvider.IConnectionStatusObserver, Integration, Closeable {
   @NotNull
   private final SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory factory;
   @Nullable
   private IConnectionStatusProvider connectionStatusProvider;
   @Nullable
   private IHub hub;
   @Nullable
   private SentryOptions options;
   @Nullable
   private SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget sender;
   private final AtomicBoolean isInitialized = new AtomicBoolean(false);
   private final AtomicBoolean isClosed = new AtomicBoolean(false);

   public SendCachedEnvelopeFireAndForgetIntegration(@NotNull SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory var1) {
      this.factory = Objects.requireNonNull(var1, "SendFireAndForgetFactory is required");
   }

   @Override
   public void register(@NotNull IHub var1, @NotNull SentryOptions var2) {
      this.hub = Objects.requireNonNull(var1, "Hub is required");
      this.options = Objects.requireNonNull(var2, "SentryOptions is required");
      String var3 = var2.getCacheDirPath();
      if (!this.factory.hasValidPath(var3, var2.getLogger())) {
         var2.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.");
      } else {
         var2.getLogger().log(SentryLevel.DEBUG, "SendCachedEventFireAndForgetIntegration installed.");
         IntegrationUtils.addIntegrationToSdkVersion("SendCachedEnvelopeFireAndForget");
         this.sendCachedEnvelopes(var1, var2);
      }
   }

   @Override
   public void close() {
      this.isClosed.set(true);
      if (this.connectionStatusProvider != null) {
         this.connectionStatusProvider.removeConnectionStatusObserver(this);
      }
   }

   @Override
   public void onConnectionStatusChanged(@NotNull IConnectionStatusProvider.ConnectionStatus var1) {
      if (this.hub != null && this.options != null) {
         this.sendCachedEnvelopes(this.hub, this.options);
      }
   }

   private synchronized void sendCachedEnvelopes(@NotNull IHub var1, @NotNull SentryOptions var2) {
      try {
         var2.getExecutorService()
            .submit(
               () -> {
                  try {
                     if (this.isClosed.get()) {
                        var2.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, not trying to send after closing.");
                        return;
                     }

                     if (!this.isInitialized.getAndSet(true)) {
                        this.connectionStatusProvider = var2.getConnectionStatusProvider();
                        this.connectionStatusProvider.addConnectionStatusObserver(this);
                        this.sender = this.factory.create(var1, var2);
                     }

                     if (this.connectionStatusProvider != null
                        && this.connectionStatusProvider.getConnectionStatus() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                        var2.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, no connection.");
                        return;
                     }

                     RateLimiter var3 = var1.getRateLimiter();
                     if (var3 != null && var3.isActiveForCategory(DataCategory.All)) {
                        var2.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, rate limiting active.");
                        return;
                     }

                     if (this.sender == null) {
                        var2.getLogger().log(SentryLevel.ERROR, "SendFireAndForget factory is null.");
                        return;
                     }

                     this.sender.send();
                  } catch (Throwable var4x) {
                     var2.getLogger().log(SentryLevel.ERROR, "Failed trying to send cached events.", var4x);
                  }
               }
            );
      } catch (RejectedExecutionException var4) {
         var2.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", var4);
      } catch (Throwable var5) {
         var2.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", var5);
      }
   }

   public interface SendFireAndForget {
      void send();
   }

   public interface SendFireAndForgetDirPath {
      @Nullable
      String getDirPath();
   }

   public interface SendFireAndForgetFactory {
      @Nullable
      SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget create(@NotNull IHub var1, @NotNull SentryOptions var2);

      default boolean hasValidPath(@Nullable String var1, @NotNull ILogger var2) {
         if (var1 != null && !var1.isEmpty()) {
            return true;
         }

         var2.log(SentryLevel.INFO, "No cached dir path is defined in options.");
         return false;
      }

      @NotNull
      default SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget processDir(
         @NotNull DirectoryProcessor var1, @NotNull String var2, @NotNull ILogger var3
      ) {
         File var4 = new File(var2);
         return () -> {
            var3.log(SentryLevel.DEBUG, "Started processing cached files from %s", var2);
            var1.processDirectory(var4);
            var3.log(SentryLevel.DEBUG, "Finished processing cached files from %s", var2);
         };
      }
   }
}
