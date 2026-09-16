package io.sentry;

import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.RateLimiter;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ISentryClient {
   boolean isEnabled();

   @NotNull
   SentryId captureEvent(@NotNull SentryEvent var1, @Nullable IScope var2, @Nullable Hint var3);

   void close();

   void close(boolean var1);

   void flush(long var1);

   @NotNull
   default SentryId captureEvent(@NotNull SentryEvent var1) {
      return this.captureEvent(var1, null, null);
   }

   @NotNull
   default SentryId captureEvent(@NotNull SentryEvent var1, @Nullable IScope var2) {
      return this.captureEvent(var1, var2, null);
   }

   @NotNull
   default SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2) {
      return this.captureEvent(var1, null, var2);
   }

   @NotNull
   default SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2, @Nullable IScope var3) {
      SentryEvent var4 = new SentryEvent();
      Message var5 = new Message();
      var5.setFormatted(var1);
      var4.setMessage(var5);
      var4.setLevel(var2);
      return this.captureEvent(var4, var3);
   }

   @NotNull
   default SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2) {
      return this.captureMessage(var1, var2, null);
   }

   @NotNull
   default SentryId captureException(@NotNull Throwable var1) {
      return this.captureException(var1, null, null);
   }

   @NotNull
   default SentryId captureException(@NotNull Throwable var1, @Nullable IScope var2, @Nullable Hint var3) {
      SentryEvent var4 = new SentryEvent(var1);
      return this.captureEvent(var4, var2, var3);
   }

   @NotNull
   default SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2) {
      return this.captureException(var1, null, var2);
   }

   @NotNull
   default SentryId captureException(@NotNull Throwable var1, @Nullable IScope var2) {
      return this.captureException(var1, var2, null);
   }

   @NotNull
   SentryId captureReplayEvent(@NotNull SentryReplayEvent var1, @Nullable IScope var2, @Nullable Hint var3);

   void captureUserFeedback(@NotNull UserFeedback var1);

   void captureSession(@NotNull Session var1, @Nullable Hint var2);

   default void captureSession(@NotNull Session var1) {
      this.captureSession(var1, null);
   }

   @Nullable
   SentryId captureEnvelope(@NotNull SentryEnvelope var1, @Nullable Hint var2);

   @Nullable
   default SentryId captureEnvelope(@NotNull SentryEnvelope var1) {
      return this.captureEnvelope(var1, null);
   }

   @NotNull
   default SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable IScope var2, @Nullable Hint var3) {
      return this.captureTransaction(var1, null, var2, var3);
   }

   @NotNull
   default SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable IScope var3, @Nullable Hint var4) {
      return this.captureTransaction(var1, var2, var3, var4, null);
   }

   @NotNull
   @ApiStatus.Internal
   SentryId captureTransaction(
      @NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable IScope var3, @Nullable Hint var4, @Nullable ProfilingTraceData var5
   );

   @ApiStatus.Internal
   @NotNull
   default SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable TraceContext var2) {
      return this.captureTransaction(var1, var2, null, null);
   }

   @NotNull
   default SentryId captureTransaction(@NotNull SentryTransaction var1) {
      return this.captureTransaction(var1, null, null, null);
   }

   @NotNull
   @ApiStatus.Experimental
   SentryId captureCheckIn(@NotNull CheckIn var1, @Nullable IScope var2, @Nullable Hint var3);

   @ApiStatus.Internal
   @Nullable
   RateLimiter getRateLimiter();

   @ApiStatus.Internal
   default boolean isHealthy() {
      return true;
   }

   @ApiStatus.Internal
   @NotNull
   IMetricsAggregator getMetricsAggregator();
}
