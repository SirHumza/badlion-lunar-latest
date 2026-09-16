package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ITransport extends Closeable {
   void send(@NotNull SentryEnvelope var1, @NotNull Hint var2);

   default void send(@NotNull SentryEnvelope var1) {
      this.send(var1, new Hint());
   }

   default boolean isHealthy() {
      return true;
   }

   void flush(long var1);

   @Nullable
   RateLimiter getRateLimiter();

   void close(boolean var1);
}
