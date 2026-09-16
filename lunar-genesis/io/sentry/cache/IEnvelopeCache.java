package io.sentry.cache;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import org.jetbrains.annotations.NotNull;

public interface IEnvelopeCache extends Iterable<SentryEnvelope> {
   void store(@NotNull SentryEnvelope var1, @NotNull Hint var2);

   default void store(@NotNull SentryEnvelope var1) {
      this.store(var1, new Hint());
   }

   void discard(@NotNull SentryEnvelope var1);
}
