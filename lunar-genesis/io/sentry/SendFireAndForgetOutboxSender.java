package io.sentry;

import io.sentry.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SendFireAndForgetOutboxSender implements SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory {
   @NotNull
   private final SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath sendFireAndForgetDirPath;

   public SendFireAndForgetOutboxSender(@NotNull SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath var1) {
      this.sendFireAndForgetDirPath = Objects.requireNonNull(var1, "SendFireAndForgetDirPath is required");
   }

   @Nullable
   @Override
   public SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget create(@NotNull IHub var1, @NotNull SentryOptions var2) {
      Objects.requireNonNull(var1, "Hub is required");
      Objects.requireNonNull(var2, "SentryOptions is required");
      String var3 = this.sendFireAndForgetDirPath.getDirPath();
      if (var3 != null && this.hasValidPath(var3, var2.getLogger())) {
         OutboxSender var4 = new OutboxSender(
            var1, var2.getEnvelopeReader(), var2.getSerializer(), var2.getLogger(), var2.getFlushTimeoutMillis(), var2.getMaxQueueSize()
         );
         return this.processDir(var4, var3, var2.getLogger());
      } else {
         var2.getLogger().log(SentryLevel.ERROR, "No outbox dir path is defined in options.");
         return null;
      }
   }
}
