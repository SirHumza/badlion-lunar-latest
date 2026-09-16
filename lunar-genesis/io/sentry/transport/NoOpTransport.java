package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class NoOpTransport implements ITransport {
   private static final NoOpTransport instance = new NoOpTransport();

   @NotNull
   public static NoOpTransport getInstance() {
      return instance;
   }

   private NoOpTransport() {
   }

   @Override
   public void send(@NotNull SentryEnvelope var1, @NotNull Hint var2) {
   }

   @Override
   public void flush(long var1) {
   }

   @Nullable
   @Override
   public RateLimiter getRateLimiter() {
      return null;
   }

   @Override
   public void close() {
   }

   @Override
   public void close(boolean var1) {
   }
}
