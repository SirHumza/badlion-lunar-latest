package io.sentry;

import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class SentryTracer implements ITransaction {
   @NotNull
   private final SentryId eventId = new SentryId();
   @NotNull
   private final Span root;
   @NotNull
   private final List<Span> children = new CopyOnWriteArrayList<>();
   @NotNull
   private final IHub hub;
   @NotNull
   private String name;
   @NotNull
   private SentryTracer.FinishStatus finishStatus = SentryTracer.FinishStatus.NOT_FINISHED;
   @Nullable
   private volatile TimerTask idleTimeoutTask;
   @Nullable
   private volatile TimerTask deadlineTimeoutTask;
   @Nullable
   private volatile Timer timer = null;
   @NotNull
   private final Object timerLock = new Object();
   @NotNull
   private final AtomicBoolean isIdleFinishTimerRunning = new AtomicBoolean(false);
   @NotNull
   private final AtomicBoolean isDeadlineTimerRunning = new AtomicBoolean(false);
   @NotNull
   private final Baggage baggage;
   @NotNull
   private TransactionNameSource transactionNameSource;
   @NotNull
   private final Instrumenter instrumenter;
   @NotNull
   private final Contexts contexts = new Contexts();
   @Nullable
   private final TransactionPerformanceCollector transactionPerformanceCollector;
   @NotNull
   private final TransactionOptions transactionOptions;

   public SentryTracer(@NotNull TransactionContext var1, @NotNull IHub var2) {
      this(var1, var2, new TransactionOptions(), null);
   }

   public SentryTracer(@NotNull TransactionContext var1, @NotNull IHub var2, @NotNull TransactionOptions var3) {
      this(var1, var2, var3, null);
   }

   SentryTracer(@NotNull TransactionContext var1, @NotNull IHub var2, @NotNull TransactionOptions var3, @Nullable TransactionPerformanceCollector var4) {
      Objects.requireNonNull(var1, "context is required");
      Objects.requireNonNull(var2, "hub is required");
      this.root = new Span(var1, this, var2, var3.getStartTimestamp(), var3);
      this.name = var1.getName();
      this.instrumenter = var1.getInstrumenter();
      this.hub = var2;
      this.transactionPerformanceCollector = var4;
      this.transactionNameSource = var1.getTransactionNameSource();
      this.transactionOptions = var3;
      if (var1.getBaggage() != null) {
         this.baggage = var1.getBaggage();
      } else {
         this.baggage = new Baggage(var2.getOptions().getLogger());
      }

      if (var4 != null) {
         var4.start(this);
      }

      if (var3.getIdleTimeout() != null || var3.getDeadlineTimeout() != null) {
         this.timer = new Timer(true);
         this.scheduleDeadlineTimeout();
         this.scheduleFinish();
      }
   }

   @Override
   public void scheduleFinish() {
      synchronized (this.timerLock) {
         if (this.timer != null) {
            Long var2 = this.transactionOptions.getIdleTimeout();
            if (var2 != null) {
               this.cancelIdleTimer();
               this.isIdleFinishTimerRunning.set(true);
               this.idleTimeoutTask = new TimerTask() {
                  @Override
                  public void run() {
                     SentryTracer.this.onIdleTimeoutReached();
                  }
               };

               try {
                  this.timer.schedule(this.idleTimeoutTask, var2);
               } catch (Throwable var5) {
                  this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Failed to schedule finish timer", var5);
                  this.onIdleTimeoutReached();
               }
            }
         }
      }
   }

   private void onIdleTimeoutReached() {
      SpanStatus var1 = this.getStatus();
      this.finish(var1 != null ? var1 : SpanStatus.OK);
      this.isIdleFinishTimerRunning.set(false);
   }

   private void onDeadlineTimeoutReached() {
      SpanStatus var1 = this.getStatus();
      this.forceFinish(var1 != null ? var1 : SpanStatus.DEADLINE_EXCEEDED, this.transactionOptions.getIdleTimeout() != null, null);
      this.isDeadlineTimerRunning.set(false);
   }

   @NotNull
   @Override
   public void forceFinish(@NotNull SpanStatus var1, boolean var2, @Nullable Hint var3) {
      if (!this.isFinished()) {
         SentryDate var4 = this.hub.getOptions().getDateProvider().now();
         ListIterator var5 = this.children.listIterator(this.children.size());

         while (var5.hasPrevious()) {
            Span var6 = (Span)var5.previous();
            var6.setSpanFinishedCallback(null);
            var6.finish(var1, var4);
         }

         this.finish(var1, var4, var2, var3);
      }
   }

   @Override
   public void finish(@Nullable SpanStatus var1, @Nullable SentryDate var2, boolean var3, @Nullable Hint var4) {
      SentryDate var5 = this.root.getFinishDate();
      if (var2 != null) {
         var5 = var2;
      }

      if (var5 == null) {
         var5 = this.hub.getOptions().getDateProvider().now();
      }

      for (Span var7 : this.children) {
         if (var7.getOptions().isIdle()) {
            var7.finish(var1 != null ? var1 : this.getSpanContext().status, var5);
         }
      }

      this.finishStatus = SentryTracer.FinishStatus.finishing(var1);
      if (!this.root.isFinished() && (!this.transactionOptions.isWaitForChildren() || this.hasAllChildrenFinished())) {
         AtomicReference var13 = new AtomicReference();
         SpanFinishedCallback var14 = this.root.getSpanFinishedCallback();
         this.root.setSpanFinishedCallback(var3x -> {
            if (var14 != null) {
               var14.execute(var3x);
            }

            TransactionFinishedCallback var4x = this.transactionOptions.getTransactionFinishedCallback();
            if (var4x != null) {
               var4x.execute(this);
            }

            if (this.transactionPerformanceCollector != null) {
               var13.set(this.transactionPerformanceCollector.stop(this));
            }
         });
         this.root.finish(this.finishStatus.spanStatus, var5);
         ProfilingTraceData var8 = null;
         if (Boolean.TRUE.equals(this.isSampled()) && Boolean.TRUE.equals(this.isProfileSampled())) {
            var8 = this.hub
               .getOptions()
               .getTransactionProfiler()
               .onTransactionFinish(this, (List<PerformanceCollectionData>)var13.get(), this.hub.getOptions());
         }

         if (var13.get() != null) {
            ((List)var13.get()).clear();
         }

         this.hub.configureScope(var1x -> var1x.withTransaction(var2x -> {
            if (var2x == this) {
               var1x.clearTransaction();
            }
         }));
         SentryTransaction var9 = new SentryTransaction(this);
         if (this.timer != null) {
            synchronized (this.timerLock) {
               if (this.timer != null) {
                  this.cancelIdleTimer();
                  this.cancelDeadlineTimer();
                  this.timer.cancel();
                  this.timer = null;
               }
            }
         }

         if (var3 && this.children.isEmpty() && this.transactionOptions.getIdleTimeout() != null) {
            this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "Dropping idle transaction %s because it has no child spans", this.name);
            return;
         }

         var9.getMeasurements().putAll(this.root.getMeasurements());
         this.hub.captureTransaction(var9, this.traceContext(), var4, var8);
      }
   }

   private void cancelIdleTimer() {
      synchronized (this.timerLock) {
         if (this.idleTimeoutTask != null) {
            this.idleTimeoutTask.cancel();
            this.isIdleFinishTimerRunning.set(false);
            this.idleTimeoutTask = null;
         }
      }
   }

   private void scheduleDeadlineTimeout() {
      Long var1 = this.transactionOptions.getDeadlineTimeout();
      if (var1 != null) {
         synchronized (this.timerLock) {
            if (this.timer != null) {
               this.cancelDeadlineTimer();
               this.isDeadlineTimerRunning.set(true);
               this.deadlineTimeoutTask = new TimerTask() {
                  @Override
                  public void run() {
                     SentryTracer.this.onDeadlineTimeoutReached();
                  }
               };

               try {
                  this.timer.schedule(this.deadlineTimeoutTask, var1);
               } catch (Throwable var5) {
                  this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Failed to schedule finish timer", var5);
                  this.onDeadlineTimeoutReached();
               }
            }
         }
      }
   }

   private void cancelDeadlineTimer() {
      synchronized (this.timerLock) {
         if (this.deadlineTimeoutTask != null) {
            this.deadlineTimeoutTask.cancel();
            this.isDeadlineTimerRunning.set(false);
            this.deadlineTimeoutTask = null;
         }
      }
   }

   @NotNull
   public List<Span> getChildren() {
      return this.children;
   }

   @NotNull
   @Override
   public SentryDate getStartDate() {
      return this.root.getStartDate();
   }

   @Nullable
   @Override
   public SentryDate getFinishDate() {
      return this.root.getFinishDate();
   }

   @NotNull
   ISpan startChild(@NotNull SpanId var1, @NotNull String var2, @Nullable String var3) {
      return this.startChild(var1, var2, var3, new SpanOptions());
   }

   @NotNull
   ISpan startChild(@NotNull SpanId var1, @NotNull String var2, @Nullable String var3, @NotNull SpanOptions var4) {
      return this.createChild(var1, var2, var3, var4);
   }

   @NotNull
   ISpan startChild(@NotNull SpanId var1, @NotNull String var2, @Nullable String var3, @Nullable SentryDate var4, @NotNull Instrumenter var5) {
      return this.createChild(var1, var2, var3, var4, var5, new SpanOptions());
   }

   @NotNull
   ISpan startChild(
      @NotNull SpanId var1, @NotNull String var2, @Nullable String var3, @Nullable SentryDate var4, @NotNull Instrumenter var5, @NotNull SpanOptions var6
   ) {
      return this.createChild(var1, var2, var3, var4, var5, var6);
   }

   @NotNull
   private ISpan createChild(@NotNull SpanId var1, @NotNull String var2, @Nullable String var3, @NotNull SpanOptions var4) {
      return this.createChild(var1, var2, var3, null, Instrumenter.SENTRY, var4);
   }

   @NotNull
   private ISpan createChild(
      @NotNull SpanId var1, @NotNull String var2, @Nullable String var3, @Nullable SentryDate var4, @NotNull Instrumenter var5, @NotNull SpanOptions var6
   ) {
      if (this.root.isFinished()) {
         return NoOpSpan.getInstance();
      }

      if (!this.instrumenter.equals(var5)) {
         return NoOpSpan.getInstance();
      }

      if (this.children.size() < this.hub.getOptions().getMaxSpans()) {
         Objects.requireNonNull(var1, "parentSpanId is required");
         Objects.requireNonNull(var2, "operation is required");
         this.cancelIdleTimer();
         Span var7 = new Span(this.root.getTraceId(), var1, this, var2, this.hub, var4, var6, var1x -> {
            if (this.transactionPerformanceCollector != null) {
               this.transactionPerformanceCollector.onSpanFinished(var1x);
            }

            SentryTracer.FinishStatus var2x = this.finishStatus;
            if (this.transactionOptions.getIdleTimeout() != null) {
               if (!this.transactionOptions.isWaitForChildren() || this.hasAllChildrenFinished()) {
                  this.scheduleFinish();
               }
            } else if (var2x.isFinishing) {
               this.finish(var2x.spanStatus);
            }
         });
         var7.setDescription(var3);
         var7.setData("thread.id", String.valueOf(Thread.currentThread().getId()));
         var7.setData("thread.name", this.hub.getOptions().getMainThreadChecker().isMainThread() ? "main" : Thread.currentThread().getName());
         this.children.add(var7);
         if (this.transactionPerformanceCollector != null) {
            this.transactionPerformanceCollector.onSpanStarted(var7);
         }

         return var7;
      } else {
         this.hub
            .getOptions()
            .getLogger()
            .log(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", var2, var3);
         return NoOpSpan.getInstance();
      }
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1) {
      return this.startChild(var1, (String)null);
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4) {
      return this.startChild(var1, var2, var3, var4, new SpanOptions());
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4, @NotNull SpanOptions var5) {
      return this.createChild(var1, var2, var3, var4, var5);
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3) {
      return this.createChild(var1, var2, var3, Instrumenter.SENTRY, new SpanOptions());
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2) {
      return this.startChild(var1, var2, null, Instrumenter.SENTRY, new SpanOptions());
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @NotNull SpanOptions var3) {
      return this.createChild(var1, var2, null, Instrumenter.SENTRY, var3);
   }

   @NotNull
   private ISpan createChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4, @NotNull SpanOptions var5) {
      if (this.root.isFinished()) {
         return NoOpSpan.getInstance();
      }

      if (!this.instrumenter.equals(var4)) {
         return NoOpSpan.getInstance();
      }

      if (this.children.size() < this.hub.getOptions().getMaxSpans()) {
         return this.root.startChild(var1, var2, var3, var4, var5);
      }

      this.hub
         .getOptions()
         .getLogger()
         .log(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", var1, var2);
      return NoOpSpan.getInstance();
   }

   @NotNull
   @Override
   public SentryTraceHeader toSentryTrace() {
      return this.root.toSentryTrace();
   }

   @Override
   public void finish() {
      this.finish(this.getStatus());
   }

   @Override
   public void finish(@Nullable SpanStatus var1) {
      this.finish(var1, null);
   }

   @ApiStatus.Internal
   @Override
   public void finish(@Nullable SpanStatus var1, @Nullable SentryDate var2) {
      this.finish(var1, var2, true, null);
   }

   @Nullable
   @Override
   public TraceContext traceContext() {
      if (this.hub.getOptions().isTraceSampling()) {
         this.updateBaggageValues();
         return this.baggage.toTraceContext();
      } else {
         return null;
      }
   }

   private void updateBaggageValues() {
      synchronized (this) {
         if (this.baggage.isMutable()) {
            AtomicReference var2 = new AtomicReference();
            AtomicReference var3 = new AtomicReference();
            this.hub.configureScope(var2x -> {
               var2.set(var2x.getUser());
               var3.set(var2x.getReplayId());
            });
            this.baggage.setValuesFromTransaction(this, (User)var2.get(), (SentryId)var3.get(), this.hub.getOptions(), this.getSamplingDecision());
            this.baggage.freeze();
         }
      }
   }

   @Nullable
   @Override
   public BaggageHeader toBaggageHeader(@Nullable List<String> var1) {
      if (this.hub.getOptions().isTraceSampling()) {
         this.updateBaggageValues();
         return BaggageHeader.fromBaggageAndOutgoingHeader(this.baggage, var1);
      } else {
         return null;
      }
   }

   private boolean hasAllChildrenFinished() {
      ArrayList var1 = new ArrayList<>(this.children);
      if (!var1.isEmpty()) {
         for (Span var3 : var1) {
            if (!var3.isFinished() && var3.getFinishDate() == null) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public void setOperation(@NotNull String var1) {
      if (this.root.isFinished()) {
         this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Operation %s cannot be set", var1);
      } else {
         this.root.setOperation(var1);
      }
   }

   @NotNull
   @Override
   public String getOperation() {
      return this.root.getOperation();
   }

   @Override
   public void setDescription(@Nullable String var1) {
      if (this.root.isFinished()) {
         this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Description %s cannot be set", var1);
      } else {
         this.root.setDescription(var1);
      }
   }

   @Nullable
   @Override
   public String getDescription() {
      return this.root.getDescription();
   }

   @Override
   public void setStatus(@Nullable SpanStatus var1) {
      if (this.root.isFinished()) {
         this.hub
            .getOptions()
            .getLogger()
            .log(SentryLevel.DEBUG, "The transaction is already finished. Status %s cannot be set", var1 == null ? "null" : var1.name());
      } else {
         this.root.setStatus(var1);
      }
   }

   @Nullable
   @Override
   public SpanStatus getStatus() {
      return this.root.getStatus();
   }

   @Override
   public void setThrowable(@Nullable Throwable var1) {
      if (this.root.isFinished()) {
         this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Throwable cannot be set");
      } else {
         this.root.setThrowable(var1);
      }
   }

   @Nullable
   @Override
   public Throwable getThrowable() {
      return this.root.getThrowable();
   }

   @NotNull
   @Override
   public SpanContext getSpanContext() {
      return this.root.getSpanContext();
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
      if (this.root.isFinished()) {
         this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Tag %s cannot be set", var1);
      } else {
         this.root.setTag(var1, var2);
      }
   }

   @Nullable
   @Override
   public String getTag(@NotNull String var1) {
      return this.root.getTag(var1);
   }

   @Override
   public boolean isFinished() {
      return this.root.isFinished();
   }

   @Override
   public void setData(@NotNull String var1, @NotNull Object var2) {
      if (this.root.isFinished()) {
         this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Data %s cannot be set", var1);
      } else {
         this.root.setData(var1, var2);
      }
   }

   @Nullable
   @Override
   public Object getData(@NotNull String var1) {
      return this.root.getData(var1);
   }

   @ApiStatus.Internal
   public void setMeasurementFromChild(@NotNull String var1, @NotNull Number var2) {
      if (!this.root.getMeasurements().containsKey(var1)) {
         this.setMeasurement(var1, var2);
      }
   }

   @ApiStatus.Internal
   public void setMeasurementFromChild(@NotNull String var1, @NotNull Number var2, @NotNull MeasurementUnit var3) {
      if (!this.root.getMeasurements().containsKey(var1)) {
         this.setMeasurement(var1, var2, var3);
      }
   }

   @Override
   public void setMeasurement(@NotNull String var1, @NotNull Number var2) {
      this.root.setMeasurement(var1, var2);
   }

   @Override
   public void setMeasurement(@NotNull String var1, @NotNull Number var2, @NotNull MeasurementUnit var3) {
      this.root.setMeasurement(var1, var2, var3);
   }

   @Nullable
   public Map<String, Object> getData() {
      return this.root.getData();
   }

   @Nullable
   @Override
   public Boolean isSampled() {
      return this.root.isSampled();
   }

   @Nullable
   @Override
   public Boolean isProfileSampled() {
      return this.root.isProfileSampled();
   }

   @Nullable
   @Override
   public TracesSamplingDecision getSamplingDecision() {
      return this.root.getSamplingDecision();
   }

   @Override
   public void setName(@NotNull String var1) {
      this.setName(var1, TransactionNameSource.CUSTOM);
   }

   @ApiStatus.Internal
   @Override
   public void setName(@NotNull String var1, @NotNull TransactionNameSource var2) {
      if (this.root.isFinished()) {
         this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Name %s cannot be set", var1);
      } else {
         this.name = var1;
         this.transactionNameSource = var2;
      }
   }

   @NotNull
   @Override
   public String getName() {
      return this.name;
   }

   @NotNull
   @Override
   public TransactionNameSource getTransactionNameSource() {
      return this.transactionNameSource;
   }

   @NotNull
   @Override
   public List<Span> getSpans() {
      return this.children;
   }

   @Nullable
   @Override
   public Span getLatestActiveSpan() {
      ArrayList var1 = new ArrayList<>(this.children);
      if (!var1.isEmpty()) {
         for (int var2 = var1.size() - 1; var2 >= 0; var2--) {
            if (!((Span)var1.get(var2)).isFinished()) {
               return (Span)var1.get(var2);
            }
         }
      }

      return null;
   }

   @NotNull
   @Override
   public SentryId getEventId() {
      return this.eventId;
   }

   @NotNull
   Span getRoot() {
      return this.root;
   }

   @TestOnly
   @Nullable
   TimerTask getIdleTimeoutTask() {
      return this.idleTimeoutTask;
   }

   @TestOnly
   @Nullable
   TimerTask getDeadlineTimeoutTask() {
      return this.deadlineTimeoutTask;
   }

   @TestOnly
   @Nullable
   Timer getTimer() {
      return this.timer;
   }

   @TestOnly
   @NotNull
   AtomicBoolean isFinishTimerRunning() {
      return this.isIdleFinishTimerRunning;
   }

   @TestOnly
   @NotNull
   AtomicBoolean isDeadlineTimerRunning() {
      return this.isDeadlineTimerRunning;
   }

   @ApiStatus.Internal
   @Override
   public void setContext(@NotNull String var1, @NotNull Object var2) {
      this.contexts.put(var1, var2);
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public Contexts getContexts() {
      return this.contexts;
   }

   @Override
   public boolean updateEndDate(@NotNull SentryDate var1) {
      return this.root.updateEndDate(var1);
   }

   @Override
   public boolean isNoOp() {
      return false;
   }

   @Nullable
   @Override
   public LocalMetricsAggregator getLocalMetricsAggregator() {
      return this.root.getLocalMetricsAggregator();
   }

   private static final class FinishStatus {
      static final SentryTracer.FinishStatus NOT_FINISHED = notFinished();
      private final boolean isFinishing;
      @Nullable
      private final SpanStatus spanStatus;

      @NotNull
      static SentryTracer.FinishStatus finishing(@Nullable SpanStatus var0) {
         return new SentryTracer.FinishStatus(true, var0);
      }

      @NotNull
      private static SentryTracer.FinishStatus notFinished() {
         return new SentryTracer.FinishStatus(false, null);
      }

      private FinishStatus(boolean var1, @Nullable SpanStatus var2) {
         this.isFinishing = var1;
         this.spanStatus = var2;
      }
   }
}
