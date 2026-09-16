package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.ISerializer;
import io.sentry.SentryEnvelope;
import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StdoutTransport implements ITransport {
   @NotNull
   private final ISerializer serializer;

   public StdoutTransport(@NotNull ISerializer var1) {
      this.serializer = Objects.requireNonNull(var1, "Serializer is required");
   }

   @Override
   public void send(@NotNull SentryEnvelope var1, @NotNull Hint var2) {
      Objects.requireNonNull(var1, "SentryEnvelope is required");

      try {
         this.serializer.serialize(var1, System.out);
      } catch (Throwable var4) {
      }
   }

   @Override
   public void flush(long var1) {
      System.out.println("Flushing");
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
