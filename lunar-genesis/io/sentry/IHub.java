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

public interface IHub {
   boolean isEnabled();

   @NotNull
   SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2);

   @NotNull
   default SentryId captureEvent(@NotNull SentryEvent var1) {
      return this.captureEvent(var1, new Hint());
   }

   @NotNull
   default SentryId captureEvent(@NotNull SentryEvent var1, @NotNull ScopeCallback var2) {
      return this.captureEvent(var1, new Hint(), var2);
   }

   @NotNull
   SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2, @NotNull ScopeCallback var3);

   @NotNull
   default SentryId captureMessage(@NotNull String var1) {
      return this.captureMessage(var1, SentryLevel.INFO);
   }

   @NotNull
   SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2);

   @NotNull
   SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2, @NotNull ScopeCallback var3);

   @NotNull
   default SentryId captureMessage(@NotNull String var1, @NotNull ScopeCallback var2) {
      return this.captureMessage(var1, SentryLevel.INFO, var2);
   }

   @NotNull
   SentryId captureEnvelope(@NotNull SentryEnvelope var1, @Nullable Hint var2);

   @NotNull
   default SentryId captureEnvelope(@NotNull SentryEnvelope var1) {
      return this.captureEnvelope(var1, new Hint());
   }

   @NotNull
   SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2);

   @NotNull
   default SentryId captureException(@NotNull Throwable var1) {
      return this.captureException(var1, new Hint());
   }

   @NotNull
   default SentryId captureException(@NotNull Throwable var1, @NotNull ScopeCallback var2) {
      return this.captureException(var1, new Hint(), var2);
   }

   @NotNull
   SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2, @NotNull ScopeCallback var3);

   void captureUserFeedback(@NotNull UserFeedback var1);

   void startSession();

   void endSession();

   void close();

   void close(boolean var1);

   void addBreadcrumb(@NotNull Breadcrumb var1, @Nullable Hint var2);

   void addBreadcrumb(@NotNull Breadcrumb var1);

   default void addBreadcrumb(@NotNull String var1) {
      this.addBreadcrumb(new Breadcrumb(var1));
   }

   default void addBreadcrumb(@NotNull String var1, @NotNull String var2) {
      Breadcrumb var3 = new Breadcrumb(var1);
      var3.setCategory(var2);
      this.addBreadcrumb(var3);
   }

   void setLevel(@Nullable SentryLevel var1);

   void setTransaction(@Nullable String var1);

   void setUser(@Nullable User var1);

   void setFingerprint(@NotNull List<String> var1);

   void clearBreadcrumbs();

   void setTag(@NotNull String var1, @NotNull String var2);

   void removeTag(@NotNull String var1);

   void setExtra(@NotNull String var1, @NotNull String var2);

   void removeExtra(@NotNull String var1);

   @NotNull
   SentryId getLastEventId();

   void pushScope();

   void popScope();

   void withScope(@NotNull ScopeCallback var1);

   void configureScope(@NotNull ScopeCallback var1);

   void bindClient(@NotNull ISentryClient var1);

   boolean isHealthy();

   void flush(long var1);

   @NotNull
   IHub clone();

   @ApiStatus.Internal
   @NotNull
   SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable Hint var3, @Nullable ProfilingTraceData var4);

   @ApiStatus.Internal
   @NotNull
   default SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable Hint var3) {
      return this.captureTransaction(var1, var2, var3, null);
   }

   @ApiStatus.Internal
   @NotNull
   default SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable Hint var2) {
      return this.captureTransaction(var1, null, var2);
   }

   @ApiStatus.Internal
   @NotNull
   default SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable TraceContext var2) {
      return this.captureTransaction(var1, var2, null);
   }

   @NotNull
   default ITransaction startTransaction(@NotNull TransactionContext var1) {
      return this.startTransaction(var1, new TransactionOptions());
   }

   @NotNull
   default ITransaction startTransaction(@NotNull String var1, @NotNull String var2) {
      return this.startTransaction(var1, var2, new TransactionOptions());
   }

   @NotNull
   default ITransaction startTransaction(@NotNull String var1, @NotNull String var2, @NotNull TransactionOptions var3) {
      return this.startTransaction(new TransactionContext(var1, var2), var3);
   }

   @NotNull
   ITransaction startTransaction(@NotNull TransactionContext var1, @NotNull TransactionOptions var2);

   @Deprecated
   @Nullable
   SentryTraceHeader traceHeaders();

   @ApiStatus.Internal
   void setSpanContext(@NotNull Throwable var1, @NotNull ISpan var2, @NotNull String var3);

   @Nullable
   ISpan getSpan();

   @ApiStatus.Internal
   @Nullable
   ITransaction getTransaction();

   @NotNull
   SentryOptions getOptions();

   @Nullable
   Boolean isCrashedLastRun();

   void reportFullyDisplayed();

   @Deprecated
   default void reportFullDisplayed() {
      this.reportFullyDisplayed();
   }

   @Nullable
   TransactionContext continueTrace(@Nullable String var1, @Nullable List<String> var2);

   @Nullable
   SentryTraceHeader getTraceparent();

   @Nullable
   BaggageHeader getBaggage();

   @ApiStatus.Experimental
   @NotNull
   SentryId captureCheckIn(@NotNull CheckIn var1);

   @NotNull
   SentryId captureReplay(@NotNull SentryReplayEvent var1, @Nullable Hint var2);

   @ApiStatus.Internal
   @Nullable
   RateLimiter getRateLimiter();

   @ApiStatus.Experimental
   @NotNull
   MetricsApi metrics();
}
