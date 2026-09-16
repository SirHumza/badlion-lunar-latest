package io.sentry;

import io.sentry.transport.AsyncHttpTransport;
import io.sentry.transport.ITransport;
import io.sentry.transport.RateLimiter;
import io.sentry.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class AsyncHttpTransportFactory implements ITransportFactory {
   @NotNull
   @Override
   public ITransport create(@NotNull SentryOptions var1, @NotNull RequestDetails var2) {
      Objects.requireNonNull(var1, "options is required");
      Objects.requireNonNull(var2, "requestDetails is required");
      return new AsyncHttpTransport(var1, new RateLimiter(var1), var1.getTransportGate(), var2);
   }
}
