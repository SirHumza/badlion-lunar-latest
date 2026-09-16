package io.sentry;

import io.sentry.metrics.MetricsApi;
import io.sentry.metrics.NoopMetricsAggregator;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoOpHub implements IHub {
   private static final NoOpHub instance = new NoOpHub();
   @NotNull
   private final SentryOptions emptyOptions = SentryOptions.empty();
   @NotNull
   private final MetricsApi metricsApi = new MetricsApi(NoopMetricsAggregator.getInstance());

   private NoOpHub() {
   }

   public static NoOpHub getInstance() {
      return instance;
   }

   @Override
   public boolean isEnabled() {
      return false;
   }

   @NotNull
   @Override
   public SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2, @NotNull ScopeCallback var3) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2, @NotNull ScopeCallback var3) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureEnvelope(@NotNull SentryEnvelope var1, @Nullable Hint var2) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2, @NotNull ScopeCallback var3) {
      return SentryId.EMPTY_ID;
   }

   @Override
   public void captureUserFeedback(@NotNull UserFeedback var1) {
   }

   @Override
   public void startSession() {
   }

   @Override
   public void endSession() {
   }

   @Override
   public void close() {
   }

   @Override
   public void close(boolean var1) {
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1, @Nullable Hint var2) {
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1) {
   }

   @Override
   public void setLevel(@Nullable SentryLevel var1) {
   }

   @Override
   public void setTransaction(@Nullable String var1) {
   }

   @Override
   public void setUser(@Nullable User var1) {
   }

   @Override
   public void setFingerprint(@NotNull List<String> var1) {
   }

   @Override
   public void clearBreadcrumbs() {
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
   }

   @Override
   public void removeTag(@NotNull String var1) {
   }

   @Override
   public void setExtra(@NotNull String var1, @NotNull String var2) {
   }

   @Override
   public void removeExtra(@NotNull String var1) {
   }

   @NotNull
   @Override
   public SentryId getLastEventId() {
      return SentryId.EMPTY_ID;
   }

   @Override
   public void pushScope() {
   }

   @Override
   public void popScope() {
   }

   @Override
   public void withScope(@NotNull ScopeCallback var1) {
      var1.run(NoOpScope.getInstance());
   }

   @Override
   public void configureScope(@NotNull ScopeCallback var1) {
   }

   @Override
   public void bindClient(@NotNull ISentryClient var1) {
   }

   @Override
   public boolean isHealthy() {
      return true;
   }

   @Override
   public void flush(long var1) {
   }

   @NotNull
   @Override
   public IHub clone() {
      return instance;
   }

   @NotNull
   @Override
   public SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable Hint var3, @Nullable ProfilingTraceData var4) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public ITransaction startTransaction(@NotNull TransactionContext var1, @NotNull TransactionOptions var2) {
      return NoOpTransaction.getInstance();
   }

   @Deprecated
   @NotNull
   @Override
   public SentryTraceHeader traceHeaders() {
      return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, true);
   }

   @Override
   public void setSpanContext(@NotNull Throwable var1, @NotNull ISpan var2, @NotNull String var3) {
   }

   @Nullable
   @Override
   public ISpan getSpan() {
      return null;
   }

   @Nullable
   @Override
   public ITransaction getTransaction() {
      return null;
   }

   @NotNull
   @Override
   public SentryOptions getOptions() {
      return this.emptyOptions;
   }

   @Nullable
   @Override
   public Boolean isCrashedLastRun() {
      return null;
   }

   @Override
   public void reportFullyDisplayed() {
   }

   @Nullable
   @Override
   public TransactionContext continueTrace(@Nullable String var1, @Nullable List<String> var2) {
      return null;
   }

   @Nullable
   @Override
   public SentryTraceHeader getTraceparent() {
      return null;
   }

   @Nullable
   @Override
   public BaggageHeader getBaggage() {
      return null;
   }

   @ApiStatus.Experimental
   @NotNull
   @Override
   public SentryId captureCheckIn(@NotNull CheckIn var1) {
      return SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureReplay(@NotNull SentryReplayEvent var1, @Nullable Hint var2) {
      return SentryId.EMPTY_ID;
   }

   @Nullable
   @Override
   public RateLimiter getRateLimiter() {
      return null;
   }

   @NotNull
   @Override
   public MetricsApi metrics() {
      return this.metricsApi;
   }
}
