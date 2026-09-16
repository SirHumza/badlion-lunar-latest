package io.sentry;

import io.sentry.metrics.NoopMetricsAggregator;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.RateLimiter;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class NoOpSentryClient implements ISentryClient {
   private static final NoOpSentryClient instance = new NoOpSentryClient();

   private NoOpSentryClient() {
   }

   public static NoOpSentryClient getInstance() {
      return instance;
   }

   @Override
   public boolean isEnabled() {
      return false;
   }

   @NotNull
   @Override
   public SentryId captureEvent(@NotNull SentryEvent var1, @Nullable IScope var2, @Nullable Hint var3) {
      return SentryId.EMPTY_ID;
   }

   @Override
   public void close(boolean var1) {
   }

   @Override
   public void close() {
   }

   @Override
   public void flush(long var1) {
   }

   @Override
   public void captureUserFeedback(@NotNull UserFeedback var1) {
   }

   @Override
   public void captureSession(@NotNull Session var1, @Nullable Hint var2) {
   }

   @Override
   public SentryId captureEnvelope(@NotNull SentryEnvelope var1, @Nullable Hint var2) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureTransaction(
      @NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable IScope var3, @Nullable Hint var4, @Nullable ProfilingTraceData var5
   ) {
      return SentryId.EMPTY_ID;
   }

   @ApiStatus.Experimental
   @NotNull
   @Override
   public SentryId captureCheckIn(@NotNull CheckIn var1, @Nullable IScope var2, @Nullable Hint var3) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureReplayEvent(@NotNull SentryReplayEvent var1, @Nullable IScope var2, @Nullable Hint var3) {
      return SentryId.EMPTY_ID;
   }

   @Nullable
   @Override
   public RateLimiter getRateLimiter() {
      return null;
   }

   @NotNull
   @Override
   public IMetricsAggregator getMetricsAggregator() {
      return NoopMetricsAggregator.getInstance();
   }
}
