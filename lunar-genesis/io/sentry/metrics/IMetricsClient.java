package io.sentry.metrics;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface IMetricsClient {
   @NotNull
   SentryId captureMetrics(@NotNull EncodedMetrics var1);
}
