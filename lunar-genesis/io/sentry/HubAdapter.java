package io.sentry;

import io.sentry.metrics.MetricsApi;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class HubAdapter implements IHub {
   private static final HubAdapter INSTANCE = new HubAdapter();

   private HubAdapter() {
   }

   public static HubAdapter getInstance() {
      return INSTANCE;
   }

   @Override
   public boolean isEnabled() {
      return Sentry.isEnabled();
   }

   @NotNull
   @Override
   public SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2) {
      return Sentry.captureEvent(var1, var2);
   }

   @NotNull
   @Override
   public SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2, @NotNull ScopeCallback var3) {
      return Sentry.captureEvent(var1, var2, var3);
   }

   @NotNull
   @Override
   public SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2) {
      return Sentry.captureMessage(var1, var2);
   }

   @NotNull
   @Override
   public SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2, @NotNull ScopeCallback var3) {
      return Sentry.captureMessage(var1, var2, var3);
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public SentryId captureEnvelope(@NotNull SentryEnvelope var1, @Nullable Hint var2) {
      return Sentry.getCurrentHub().captureEnvelope(var1, var2);
   }

   @NotNull
   @Override
   public SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2) {
      return Sentry.captureException(var1, var2);
   }

   @NotNull
   @Override
   public SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2, @NotNull ScopeCallback var3) {
      return Sentry.captureException(var1, var2, var3);
   }

   @Override
   public void captureUserFeedback(@NotNull UserFeedback var1) {
      Sentry.captureUserFeedback(var1);
   }

   @Override
   public void startSession() {
      Sentry.startSession();
   }

   @Override
   public void endSession() {
      Sentry.endSession();
   }

   @Override
   public void close(boolean var1) {
      Sentry.close();
   }

   @Override
   public void close() {
      Sentry.close();
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1, @Nullable Hint var2) {
      Sentry.addBreadcrumb(var1, var2);
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1) {
      this.addBreadcrumb(var1, new Hint());
   }

   @Override
   public void setLevel(@Nullable SentryLevel var1) {
      Sentry.setLevel(var1);
   }

   @Override
   public void setTransaction(@Nullable String var1) {
      Sentry.setTransaction(var1);
   }

   @Override
   public void setUser(@Nullable User var1) {
      Sentry.setUser(var1);
   }

   @Override
   public void setFingerprint(@NotNull List<String> var1) {
      Sentry.setFingerprint(var1);
   }

   @Override
   public void clearBreadcrumbs() {
      Sentry.clearBreadcrumbs();
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
      Sentry.setTag(var1, var2);
   }

   @Override
   public void removeTag(@NotNull String var1) {
      Sentry.removeTag(var1);
   }

   @Override
   public void setExtra(@NotNull String var1, @NotNull String var2) {
      Sentry.setExtra(var1, var2);
   }

   @Override
   public void removeExtra(@NotNull String var1) {
      Sentry.removeExtra(var1);
   }

   @NotNull
   @Override
   public SentryId getLastEventId() {
      return Sentry.getLastEventId();
   }

   @Override
   public void pushScope() {
      Sentry.pushScope();
   }

   @Override
   public void popScope() {
      Sentry.popScope();
   }

   @Override
   public void withScope(@NotNull ScopeCallback var1) {
      Sentry.withScope(var1);
   }

   @Override
   public void configureScope(@NotNull ScopeCallback var1) {
      Sentry.configureScope(var1);
   }

   @Override
   public void bindClient(@NotNull ISentryClient var1) {
      Sentry.bindClient(var1);
   }

   @Override
   public boolean isHealthy() {
      return Sentry.isHealthy();
   }

   @Override
   public void flush(long var1) {
      Sentry.flush(var1);
   }

   @NotNull
   @Override
   public IHub clone() {
      return Sentry.getCurrentHub().clone();
   }

   @NotNull
   @Override
   public SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable Hint var3, @Nullable ProfilingTraceData var4) {
      return Sentry.getCurrentHub().captureTransaction(var1, var2, var3, var4);
   }

   @NotNull
   @Override
   public ITransaction startTransaction(@NotNull TransactionContext var1, @NotNull TransactionOptions var2) {
      return Sentry.startTransaction(var1, var2);
   }

   @Deprecated
   @Nullable
   @Override
   public SentryTraceHeader traceHeaders() {
      return Sentry.traceHeaders();
   }

   @Override
   public void setSpanContext(@NotNull Throwable var1, @NotNull ISpan var2, @NotNull String var3) {
      Sentry.getCurrentHub().setSpanContext(var1, var2, var3);
   }

   @Nullable
   @Override
   public ISpan getSpan() {
      return Sentry.getCurrentHub().getSpan();
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public ITransaction getTransaction() {
      return Sentry.getCurrentHub().getTransaction();
   }

   @NotNull
   @Override
   public SentryOptions getOptions() {
      return Sentry.getCurrentHub().getOptions();
   }

   @Nullable
   @Override
   public Boolean isCrashedLastRun() {
      return Sentry.isCrashedLastRun();
   }

   @Override
   public void reportFullyDisplayed() {
      Sentry.reportFullyDisplayed();
   }

   @Nullable
   @Override
   public TransactionContext continueTrace(@Nullable String var1, @Nullable List<String> var2) {
      return Sentry.continueTrace(var1, var2);
   }

   @Nullable
   @Override
   public SentryTraceHeader getTraceparent() {
      return Sentry.getTraceparent();
   }

   @Nullable
   @Override
   public BaggageHeader getBaggage() {
      return Sentry.getBaggage();
   }

   @ApiStatus.Experimental
   @NotNull
   @Override
   public SentryId captureCheckIn(@NotNull CheckIn var1) {
      return Sentry.captureCheckIn(var1);
   }

   @NotNull
   @Override
   public SentryId captureReplay(@NotNull SentryReplayEvent var1, @Nullable Hint var2) {
      return Sentry.getCurrentHub().captureReplay(var1, var2);
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public RateLimiter getRateLimiter() {
      return Sentry.getCurrentHub().getRateLimiter();
   }

   @NotNull
   @Override
   public MetricsApi metrics() {
      return Sentry.getCurrentHub().metrics();
   }
}
