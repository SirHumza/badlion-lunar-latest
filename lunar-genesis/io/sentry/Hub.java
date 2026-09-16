package io.sentry;

import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.SessionEndHint;
import io.sentry.hints.SessionStartHint;
import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.metrics.MetricsApi;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import io.sentry.util.ExceptionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import io.sentry.util.Pair;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Hub implements IHub, MetricsApi.IMetricsInterface {
   @NotNull
   private volatile SentryId lastEventId;
   @NotNull
   private final SentryOptions options;
   private volatile boolean isEnabled;
   @NotNull
   private final Stack stack;
   @NotNull
   private final TracesSampler tracesSampler;
   @NotNull
   private final Map<Throwable, Pair<WeakReference<ISpan>, String>> throwableToSpan = Collections.synchronizedMap(new WeakHashMap<>());
   @NotNull
   private final TransactionPerformanceCollector transactionPerformanceCollector;
   @NotNull
   private final MetricsApi metricsApi;

   public Hub(@NotNull SentryOptions var1) {
      this(var1, createRootStackItem(var1));
   }

   private Hub(@NotNull SentryOptions var1, @NotNull Stack var2) {
      validateOptions(var1);
      this.options = var1;
      this.tracesSampler = new TracesSampler(var1);
      this.stack = var2;
      this.lastEventId = SentryId.EMPTY_ID;
      this.transactionPerformanceCollector = var1.getTransactionPerformanceCollector();
      this.isEnabled = true;
      this.metricsApi = new MetricsApi(this);
   }

   private Hub(@NotNull SentryOptions var1, @NotNull Stack.StackItem var2) {
      this(var1, new Stack(var1.getLogger(), var2));
   }

   private static void validateOptions(@NotNull SentryOptions var0) {
      Objects.requireNonNull(var0, "SentryOptions is required.");
      if (var0.getDsn() == null || var0.getDsn().isEmpty()) {
         throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
      }
   }

   private static Stack.StackItem createRootStackItem(@NotNull SentryOptions var0) {
      validateOptions(var0);
      Scope var1 = new Scope(var0);
      SentryClient var2 = new SentryClient(var0);
      return new Stack.StackItem(var0, var2, var1);
   }

   @Override
   public boolean isEnabled() {
      return this.isEnabled;
   }

   @NotNull
   @Override
   public SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2) {
      return this.captureEventInternal(var1, var2, null);
   }

   @NotNull
   @Override
   public SentryId captureEvent(@NotNull SentryEvent var1, @Nullable Hint var2, @NotNull ScopeCallback var3) {
      return this.captureEventInternal(var1, var2, var3);
   }

   @NotNull
   private SentryId captureEventInternal(@NotNull SentryEvent var1, @Nullable Hint var2, @Nullable ScopeCallback var3) {
      SentryId var4 = SentryId.EMPTY_ID;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.");
      } else if (var1 == null) {
         this.options.getLogger().log(SentryLevel.WARNING, "captureEvent called with null parameter.");
      } else {
         try {
            this.assignTraceContext(var1);
            Stack.StackItem var5 = this.stack.peek();
            IScope var6 = this.buildLocalScope(var5.getScope(), var3);
            var4 = var5.getClient().captureEvent(var1, var6, var2);
            this.lastEventId = var4;
         } catch (Throwable var7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing event with id: " + var1.getEventId(), var7);
         }
      }

      return var4;
   }

   @NotNull
   @Override
   public SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2) {
      return this.captureMessageInternal(var1, var2, null);
   }

   @NotNull
   @Override
   public SentryId captureMessage(@NotNull String var1, @NotNull SentryLevel var2, @NotNull ScopeCallback var3) {
      return this.captureMessageInternal(var1, var2, var3);
   }

   @NotNull
   private SentryId captureMessageInternal(@NotNull String var1, @NotNull SentryLevel var2, @Nullable ScopeCallback var3) {
      SentryId var4 = SentryId.EMPTY_ID;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.");
      } else if (var1 == null) {
         this.options.getLogger().log(SentryLevel.WARNING, "captureMessage called with null parameter.");
      } else {
         try {
            Stack.StackItem var5 = this.stack.peek();
            IScope var6 = this.buildLocalScope(var5.getScope(), var3);
            var4 = var5.getClient().captureMessage(var1, var2, var6);
         } catch (Throwable var7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing message: " + var1, var7);
         }
      }

      this.lastEventId = var4;
      return var4;
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public SentryId captureEnvelope(@NotNull SentryEnvelope var1, @Nullable Hint var2) {
      Objects.requireNonNull(var1, "SentryEnvelope is required.");
      SentryId var3 = SentryId.EMPTY_ID;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.");
      } else {
         try {
            SentryId var4 = this.stack.peek().getClient().captureEnvelope(var1, var2);
            if (var4 != null) {
               var3 = var4;
            }
         } catch (Throwable var5) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing envelope.", var5);
         }
      }

      return var3;
   }

   @NotNull
   @Override
   public SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2) {
      return this.captureExceptionInternal(var1, var2, null);
   }

   @NotNull
   @Override
   public SentryId captureException(@NotNull Throwable var1, @Nullable Hint var2, @NotNull ScopeCallback var3) {
      return this.captureExceptionInternal(var1, var2, var3);
   }

   @NotNull
   private SentryId captureExceptionInternal(@NotNull Throwable var1, @Nullable Hint var2, @Nullable ScopeCallback var3) {
      SentryId var4 = SentryId.EMPTY_ID;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.");
      } else if (var1 == null) {
         this.options.getLogger().log(SentryLevel.WARNING, "captureException called with null parameter.");
      } else {
         try {
            Stack.StackItem var5 = this.stack.peek();
            SentryEvent var6 = new SentryEvent(var1);
            this.assignTraceContext(var6);
            IScope var7 = this.buildLocalScope(var5.getScope(), var3);
            var4 = var5.getClient().captureEvent(var6, var7, var2);
         } catch (Throwable var8) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing exception: " + var1.getMessage(), var8);
         }
      }

      this.lastEventId = var4;
      return var4;
   }

   private void assignTraceContext(@NotNull SentryEvent var1) {
      if (this.options.isTracingEnabled() && var1.getThrowable() != null) {
         Pair var2 = this.throwableToSpan.get(ExceptionUtils.findRootCause(var1.getThrowable()));
         if (var2 != null) {
            WeakReference var3 = (WeakReference)var2.getFirst();
            if (var1.getContexts().getTrace() == null && var3 != null) {
               ISpan var4 = (ISpan)var3.get();
               if (var4 != null) {
                  var1.getContexts().setTrace(var4.getSpanContext());
               }
            }

            String var5 = (String)var2.getSecond();
            if (var1.getTransaction() == null && var5 != null) {
               var1.setTransaction(var5);
            }
         }
      }
   }

   @Override
   public void captureUserFeedback(@NotNull UserFeedback var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureUserFeedback' call is a no-op.");
      } else {
         try {
            Stack.StackItem var2 = this.stack.peek();
            var2.getClient().captureUserFeedback(var1);
         } catch (Throwable var3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing captureUserFeedback: " + var1.toString(), var3);
         }
      }
   }

   @Override
   public void startSession() {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.");
      } else {
         Stack.StackItem var1 = this.stack.peek();
         Scope.SessionPair var2 = var1.getScope().startSession();
         if (var2 != null) {
            if (var2.getPrevious() != null) {
               Hint var3 = HintUtils.createWithTypeCheckHint(new SessionEndHint());
               var1.getClient().captureSession(var2.getPrevious(), var3);
            }

            Hint var4 = HintUtils.createWithTypeCheckHint(new SessionStartHint());
            var1.getClient().captureSession(var2.getCurrent(), var4);
         } else {
            this.options.getLogger().log(SentryLevel.WARNING, "Session could not be started.");
         }
      }
   }

   @Override
   public void endSession() {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.");
      } else {
         Stack.StackItem var1 = this.stack.peek();
         Session var2 = var1.getScope().endSession();
         if (var2 != null) {
            Hint var3 = HintUtils.createWithTypeCheckHint(new SessionEndHint());
            var1.getClient().captureSession(var2, var3);
         }
      }
   }

   @Override
   public void close() {
      this.close(false);
   }

   @Override
   public void close(boolean var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.");
      } else {
         try {
            for (Integration var3 : this.options.getIntegrations()) {
               if (var3 instanceof Closeable) {
                  try {
                     ((Closeable)var3).close();
                  } catch (IOException var5) {
                     this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the integration {}.", var3, var5);
                  }
               }
            }

            this.configureScope(var0 -> var0.clear());
            this.options.getTransactionProfiler().close();
            this.options.getTransactionPerformanceCollector().close();
            ISentryExecutorService var7 = this.options.getExecutorService();
            if (var1) {
               var7.submit(() -> var7.close(this.options.getShutdownTimeoutMillis()));
            } else {
               var7.close(this.options.getShutdownTimeoutMillis());
            }

            Stack.StackItem var8 = this.stack.peek();
            var8.getClient().close(var1);
         } catch (Throwable var6) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while closing the Hub.", var6);
         }

         this.isEnabled = false;
      }
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1, @Nullable Hint var2) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.");
      } else if (var1 == null) {
         this.options.getLogger().log(SentryLevel.WARNING, "addBreadcrumb called with null parameter.");
      } else {
         this.stack.peek().getScope().addBreadcrumb(var1, var2);
      }
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1) {
      this.addBreadcrumb(var1, new Hint());
   }

   @Override
   public void setLevel(@Nullable SentryLevel var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setLevel' call is a no-op.");
      } else {
         this.stack.peek().getScope().setLevel(var1);
      }
   }

   @Override
   public void setTransaction(@Nullable String var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTransaction' call is a no-op.");
      } else if (var1 != null) {
         this.stack.peek().getScope().setTransaction(var1);
      } else {
         this.options.getLogger().log(SentryLevel.WARNING, "Transaction cannot be null");
      }
   }

   @Override
   public void setUser(@Nullable User var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setUser' call is a no-op.");
      } else {
         this.stack.peek().getScope().setUser(var1);
      }
   }

   @Override
   public void setFingerprint(@NotNull List<String> var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setFingerprint' call is a no-op.");
      } else if (var1 == null) {
         this.options.getLogger().log(SentryLevel.WARNING, "setFingerprint called with null parameter.");
      } else {
         this.stack.peek().getScope().setFingerprint(var1);
      }
   }

   @Override
   public void clearBreadcrumbs() {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'clearBreadcrumbs' call is a no-op.");
      } else {
         this.stack.peek().getScope().clearBreadcrumbs();
      }
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTag' call is a no-op.");
      } else if (var1 != null && var2 != null) {
         this.stack.peek().getScope().setTag(var1, var2);
      } else {
         this.options.getLogger().log(SentryLevel.WARNING, "setTag called with null parameter.");
      }
   }

   @Override
   public void removeTag(@NotNull String var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.");
      } else if (var1 == null) {
         this.options.getLogger().log(SentryLevel.WARNING, "removeTag called with null parameter.");
      } else {
         this.stack.peek().getScope().removeTag(var1);
      }
   }

   @Override
   public void setExtra(@NotNull String var1, @NotNull String var2) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setExtra' call is a no-op.");
      } else if (var1 != null && var2 != null) {
         this.stack.peek().getScope().setExtra(var1, var2);
      } else {
         this.options.getLogger().log(SentryLevel.WARNING, "setExtra called with null parameter.");
      }
   }

   @Override
   public void removeExtra(@NotNull String var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeExtra' call is a no-op.");
      } else if (var1 == null) {
         this.options.getLogger().log(SentryLevel.WARNING, "removeExtra called with null parameter.");
      } else {
         this.stack.peek().getScope().removeExtra(var1);
      }
   }

   @NotNull
   @Override
   public SentryId getLastEventId() {
      return this.lastEventId;
   }

   @Override
   public void pushScope() {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.");
      } else {
         Stack.StackItem var1 = this.stack.peek();
         Stack.StackItem var2 = new Stack.StackItem(this.options, var1.getClient(), var1.getScope().clone());
         this.stack.push(var2);
      }
   }

   @NotNull
   @Override
   public SentryOptions getOptions() {
      return this.stack.peek().getOptions();
   }

   @Nullable
   @Override
   public Boolean isCrashedLastRun() {
      return SentryCrashLastRunState.getInstance().isCrashedLastRun(this.options.getCacheDirPath(), !this.options.isEnableAutoSessionTracking());
   }

   @Override
   public void reportFullyDisplayed() {
      if (this.options.isEnableTimeToFullDisplayTracing()) {
         this.options.getFullyDisplayedReporter().reportFullyDrawn();
      }
   }

   @Override
   public void popScope() {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'popScope' call is a no-op.");
      } else {
         this.stack.pop();
      }
   }

   @Override
   public void withScope(@NotNull ScopeCallback var1) {
      if (!this.isEnabled()) {
         try {
            var1.run(NoOpScope.getInstance());
         } catch (Throwable var4) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", var4);
         }
      } else {
         this.pushScope();

         try {
            var1.run(this.stack.peek().getScope());
         } catch (Throwable var3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", var3);
         }

         this.popScope();
      }
   }

   @Override
   public void configureScope(@NotNull ScopeCallback var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.");
      } else {
         try {
            var1.run(this.stack.peek().getScope());
         } catch (Throwable var3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'configureScope' callback.", var3);
         }
      }
   }

   @Override
   public void bindClient(@NotNull ISentryClient var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'bindClient' call is a no-op.");
      } else {
         Stack.StackItem var2 = this.stack.peek();
         if (var1 != null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "New client bound to scope.");
            var2.setClient(var1);
         } else {
            this.options.getLogger().log(SentryLevel.DEBUG, "NoOp client bound to scope.");
            var2.setClient(NoOpSentryClient.getInstance());
         }
      }
   }

   @Override
   public boolean isHealthy() {
      return this.stack.peek().getClient().isHealthy();
   }

   @Override
   public void flush(long var1) {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.");
      } else {
         try {
            this.stack.peek().getClient().flush(var1);
         } catch (Throwable var4) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'client.flush'.", var4);
         }
      }
   }

   @NotNull
   @Override
   public IHub clone() {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Disabled Hub cloned.");
      }

      return new Hub(this.options, new Stack(this.stack));
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public SentryId captureTransaction(@NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable Hint var3, @Nullable ProfilingTraceData var4) {
      Objects.requireNonNull(var1, "transaction is required");
      SentryId var5 = SentryId.EMPTY_ID;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.");
      } else if (!var1.isFinished()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", var1.getEventId());
      } else if (!Boolean.TRUE.equals(var1.isSampled())) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", var1.getEventId());
         if (this.options.getBackpressureMonitor().getDownsampleFactor() > 0) {
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BACKPRESSURE, DataCategory.Transaction);
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BACKPRESSURE, DataCategory.Span, var1.getSpans().size() + 1);
         } else {
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.SAMPLE_RATE, DataCategory.Transaction);
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.SAMPLE_RATE, DataCategory.Span, var1.getSpans().size() + 1);
         }
      } else {
         Stack.StackItem var6 = null;

         try {
            var6 = this.stack.peek();
            var5 = var6.getClient().captureTransaction(var1, var2, var6.getScope(), var3, var4);
         } catch (Throwable var8) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing transaction with id: " + var1.getEventId(), var8);
         }
      }

      return var5;
   }

   @NotNull
   @Override
   public ITransaction startTransaction(@NotNull TransactionContext var1, @NotNull TransactionOptions var2) {
      return this.createTransaction(var1, var2);
   }

   @NotNull
   private ITransaction createTransaction(@NotNull TransactionContext var1, @NotNull TransactionOptions var2) {
      Objects.requireNonNull(var1, "transactionContext is required");
      ITransaction var3;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.");
         var3 = NoOpTransaction.getInstance();
      } else if (!this.options.getInstrumenter().equals(var1.getInstrumenter())) {
         this.options
            .getLogger()
            .log(
               SentryLevel.DEBUG,
               "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s",
               var1.getInstrumenter(),
               this.options.getInstrumenter()
            );
         var3 = NoOpTransaction.getInstance();
      } else if (!this.options.isTracingEnabled()) {
         this.options.getLogger().log(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.");
         var3 = NoOpTransaction.getInstance();
      } else {
         SamplingContext var4 = new SamplingContext(var1, var2.getCustomSamplingContext());
         TracesSamplingDecision var5 = this.tracesSampler.sample(var4);
         var1.setSamplingDecision(var5);
         var3 = new SentryTracer(var1, this, var2, this.transactionPerformanceCollector);
         if (var5.getSampled() && var5.getProfileSampled()) {
            ITransactionProfiler var6 = this.options.getTransactionProfiler();
            if (!var6.isRunning()) {
               var6.start();
               var6.bindTransaction(var3);
            } else if (var2.isAppStartTransaction()) {
               var6.bindTransaction(var3);
            }
         }
      }

      if (var2.isBindToScope()) {
         this.configureScope(var1x -> var1x.setTransaction(var3));
      }

      return var3;
   }

   @Deprecated
   @Nullable
   @Override
   public SentryTraceHeader traceHeaders() {
      return this.getTraceparent();
   }

   @Nullable
   @Override
   public ISpan getSpan() {
      ISpan var1 = null;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.");
      } else {
         var1 = this.stack.peek().getScope().getSpan();
      }

      return var1;
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public ITransaction getTransaction() {
      ITransaction var1 = null;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.");
      } else {
         var1 = this.stack.peek().getScope().getTransaction();
      }

      return var1;
   }

   @ApiStatus.Internal
   @Override
   public void setSpanContext(@NotNull Throwable var1, @NotNull ISpan var2, @NotNull String var3) {
      Objects.requireNonNull(var1, "throwable is required");
      Objects.requireNonNull(var2, "span is required");
      Objects.requireNonNull(var3, "transactionName is required");
      Throwable var4 = ExceptionUtils.findRootCause(var1);
      if (!this.throwableToSpan.containsKey(var4)) {
         this.throwableToSpan.put(var4, new Pair<>(new WeakReference<>(var2), var3));
      }
   }

   @Nullable
   SpanContext getSpanContext(@NotNull Throwable var1) {
      Objects.requireNonNull(var1, "throwable is required");
      Throwable var2 = ExceptionUtils.findRootCause(var1);
      Pair var3 = this.throwableToSpan.get(var2);
      if (var3 != null) {
         WeakReference var4 = (WeakReference)var3.getFirst();
         if (var4 != null) {
            ISpan var5 = (ISpan)var4.get();
            if (var5 != null) {
               return var5.getSpanContext();
            }
         }
      }

      return null;
   }

   private IScope buildLocalScope(@NotNull IScope var1, @Nullable ScopeCallback var2) {
      if (var2 != null) {
         try {
            IScope var3 = var1.clone();
            var2.run(var3);
            return var3;
         } catch (Throwable var4) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'ScopeCallback' callback.", var4);
         }
      }

      return var1;
   }

   @Nullable
   @Override
   public TransactionContext continueTrace(@Nullable String var1, @Nullable List<String> var2) {
      PropagationContext var3 = PropagationContext.fromHeaders(this.getOptions().getLogger(), var1, var2);
      this.configureScope(var1x -> var1x.setPropagationContext(var3));
      return this.options.isTracingEnabled() ? TransactionContext.fromPropagationContext(var3) : null;
   }

   @Nullable
   @Override
   public SentryTraceHeader getTraceparent() {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getTraceparent' call is a no-op.");
      } else {
         TracingUtils.TracingHeaders var1 = TracingUtils.trace(this, null, this.getSpan());
         if (var1 != null) {
            return var1.getSentryTraceHeader();
         }
      }

      return null;
   }

   @Nullable
   @Override
   public BaggageHeader getBaggage() {
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getBaggage' call is a no-op.");
      } else {
         TracingUtils.TracingHeaders var1 = TracingUtils.trace(this, null, this.getSpan());
         if (var1 != null) {
            return var1.getBaggageHeader();
         }
      }

      return null;
   }

   @ApiStatus.Experimental
   @NotNull
   @Override
   public SentryId captureCheckIn(@NotNull CheckIn var1) {
      SentryId var2 = SentryId.EMPTY_ID;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureCheckIn' call is a no-op.");
      } else {
         try {
            Stack.StackItem var3 = this.stack.peek();
            var2 = var3.getClient().captureCheckIn(var1, var3.getScope(), null);
         } catch (Throwable var4) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing check-in for slug", var4);
         }
      }

      this.lastEventId = var2;
      return var2;
   }

   @NotNull
   @Override
   public SentryId captureReplay(@NotNull SentryReplayEvent var1, @Nullable Hint var2) {
      SentryId var3 = SentryId.EMPTY_ID;
      if (!this.isEnabled()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.");
      } else {
         try {
            Stack.StackItem var4 = this.stack.peek();
            var3 = var4.getClient().captureReplayEvent(var1, var4.getScope(), var2);
         } catch (Throwable var5) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing replay", var5);
         }
      }

      return var3;
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public RateLimiter getRateLimiter() {
      Stack.StackItem var1 = this.stack.peek();
      return var1.getClient().getRateLimiter();
   }

   @NotNull
   @Override
   public MetricsApi metrics() {
      return this.metricsApi;
   }

   @NotNull
   @Override
   public IMetricsAggregator getMetricsAggregator() {
      return this.stack.peek().getClient().getMetricsAggregator();
   }

   @NotNull
   @Override
   public Map<String, String> getDefaultTagsForMetrics() {
      if (!this.options.isEnableDefaultTagsForMetrics()) {
         return Collections.emptyMap();
      }

      HashMap var1 = new HashMap();
      String var2 = this.options.getRelease();
      if (var2 != null) {
         var1.put("release", var2);
      }

      String var3 = this.options.getEnvironment();
      if (var3 != null) {
         var1.put("environment", var3);
      }

      String var4 = this.stack.peek().getScope().getTransactionName();
      if (var4 != null) {
         var1.put("transaction", var4);
      }

      return Collections.unmodifiableMap(var1);
   }

   @Nullable
   @Override
   public ISpan startSpanForMetric(@NotNull String var1, @NotNull String var2) {
      ISpan var3 = this.getSpan();
      return var3 != null ? var3.startChild(var1, var2) : null;
   }

   @Nullable
   @Override
   public LocalMetricsAggregator getLocalMetricsAggregator() {
      if (!this.options.isEnableSpanLocalMetricAggregation()) {
         return null;
      }

      ISpan var1 = this.getSpan();
      return var1 != null ? var1.getLocalMetricsAggregator() : null;
   }
}
