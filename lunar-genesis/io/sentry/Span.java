package io.sentry;

import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class Span implements ISpan {
   @NotNull
   private SentryDate startTimestamp;
   @Nullable
   private SentryDate timestamp;
   @NotNull
   private final SpanContext context;
   @NotNull
   private final SentryTracer transaction;
   @Nullable
   private Throwable throwable;
   @NotNull
   private final IHub hub;
   private boolean finished = false;
   @NotNull
   private final AtomicBoolean isFinishing = new AtomicBoolean(false);
   @NotNull
   private final SpanOptions options;
   @Nullable
   private SpanFinishedCallback spanFinishedCallback;
   @NotNull
   private final Map<String, Object> data = new ConcurrentHashMap<>();
   @NotNull
   private final Map<String, MeasurementValue> measurements = new ConcurrentHashMap<>();
   @NotNull
   private final LazyEvaluator<LocalMetricsAggregator> metricsAggregator = new LazyEvaluator<>(() -> new LocalMetricsAggregator());

   Span(@NotNull SentryId var1, @Nullable SpanId var2, @NotNull SentryTracer var3, @NotNull String var4, @NotNull IHub var5) {
      this(var1, var2, var3, var4, var5, null, new SpanOptions(), null);
   }

   Span(
      @NotNull SentryId var1,
      @Nullable SpanId var2,
      @NotNull SentryTracer var3,
      @NotNull String var4,
      @NotNull IHub var5,
      @Nullable SentryDate var6,
      @NotNull SpanOptions var7,
      @Nullable SpanFinishedCallback var8
   ) {
      this.context = new SpanContext(var1, new SpanId(), var4, var2, var3.getSamplingDecision());
      this.transaction = Objects.requireNonNull(var3, "transaction is required");
      this.hub = Objects.requireNonNull(var5, "hub is required");
      this.options = var7;
      this.spanFinishedCallback = var8;
      if (var6 != null) {
         this.startTimestamp = var6;
      } else {
         this.startTimestamp = var5.getOptions().getDateProvider().now();
      }
   }

   public Span(@NotNull TransactionContext var1, @NotNull SentryTracer var2, @NotNull IHub var3, @Nullable SentryDate var4, @NotNull SpanOptions var5) {
      this.context = Objects.requireNonNull(var1, "context is required");
      this.transaction = Objects.requireNonNull(var2, "sentryTracer is required");
      this.hub = Objects.requireNonNull(var3, "hub is required");
      this.spanFinishedCallback = null;
      if (var4 != null) {
         this.startTimestamp = var4;
      } else {
         this.startTimestamp = var3.getOptions().getDateProvider().now();
      }

      this.options = var5;
   }

   @NotNull
   @Override
   public SentryDate getStartDate() {
      return this.startTimestamp;
   }

   @Nullable
   @Override
   public SentryDate getFinishDate() {
      return this.timestamp;
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1) {
      return this.startChild(var1, (String)null);
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4, @NotNull SpanOptions var5) {
      return this.finished ? NoOpSpan.getInstance() : this.transaction.startChild(this.context.getSpanId(), var1, var2, var3, var4, var5);
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2) {
      return this.finished ? NoOpSpan.getInstance() : this.transaction.startChild(this.context.getSpanId(), var1, var2);
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @NotNull SpanOptions var3) {
      return this.finished ? NoOpSpan.getInstance() : this.transaction.startChild(this.context.getSpanId(), var1, var2, var3);
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4) {
      return this.startChild(var1, var2, var3, var4, new SpanOptions());
   }

   @NotNull
   @Override
   public SentryTraceHeader toSentryTrace() {
      return new SentryTraceHeader(this.context.getTraceId(), this.context.getSpanId(), this.context.getSampled());
   }

   @Nullable
   @Override
   public TraceContext traceContext() {
      return this.transaction.traceContext();
   }

   @Nullable
   @Override
   public BaggageHeader toBaggageHeader(@Nullable List<String> var1) {
      return this.transaction.toBaggageHeader(var1);
   }

   @Override
   public void finish() {
      this.finish(this.context.getStatus());
   }

   @Override
   public void finish(@Nullable SpanStatus var1) {
      this.finish(var1, this.hub.getOptions().getDateProvider().now());
   }

   @Override
   public void finish(@Nullable SpanStatus var1, @Nullable SentryDate var2) {
      if (!this.finished && this.isFinishing.compareAndSet(false, true)) {
         this.context.setStatus(var1);
         this.timestamp = var2 == null ? this.hub.getOptions().getDateProvider().now() : var2;
         if (this.options.isTrimStart() || this.options.isTrimEnd()) {
            SentryDate var3 = null;
            SentryDate var4 = null;

            for (Span var7 : this.transaction.getRoot().getSpanId().equals(this.getSpanId()) ? this.transaction.getChildren() : this.getDirectChildren()) {
               if (var3 == null || var7.getStartDate().isBefore(var3)) {
                  var3 = var7.getStartDate();
               }

               if (var4 == null || var7.getFinishDate() != null && var7.getFinishDate().isAfter(var4)) {
                  var4 = var7.getFinishDate();
               }
            }

            if (this.options.isTrimStart() && var3 != null && this.startTimestamp.isBefore(var3)) {
               this.updateStartDate(var3);
            }

            if (this.options.isTrimEnd() && var4 != null && (this.timestamp == null || this.timestamp.isAfter(var4))) {
               this.updateEndDate(var4);
            }
         }

         if (this.throwable != null) {
            this.hub.setSpanContext(this.throwable, this, this.transaction.getName());
         }

         if (this.spanFinishedCallback != null) {
            this.spanFinishedCallback.execute(this);
         }

         this.finished = true;
      }
   }

   @Override
   public void setOperation(@NotNull String var1) {
      this.context.setOperation(var1);
   }

   @NotNull
   @Override
   public String getOperation() {
      return this.context.getOperation();
   }

   @Override
   public void setDescription(@Nullable String var1) {
      this.context.setDescription(var1);
   }

   @Nullable
   @Override
   public String getDescription() {
      return this.context.getDescription();
   }

   @Override
   public void setStatus(@Nullable SpanStatus var1) {
      this.context.setStatus(var1);
   }

   @Nullable
   @Override
   public SpanStatus getStatus() {
      return this.context.getStatus();
   }

   @NotNull
   @Override
   public SpanContext getSpanContext() {
      return this.context;
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
      this.context.setTag(var1, var2);
   }

   @Nullable
   @Override
   public String getTag(@NotNull String var1) {
      return this.context.getTags().get(var1);
   }

   @Override
   public boolean isFinished() {
      return this.finished;
   }

   @NotNull
   public Map<String, Object> getData() {
      return this.data;
   }

   @Nullable
   public Boolean isSampled() {
      return this.context.getSampled();
   }

   @Nullable
   public Boolean isProfileSampled() {
      return this.context.getProfileSampled();
   }

   @Nullable
   public TracesSamplingDecision getSamplingDecision() {
      return this.context.getSamplingDecision();
   }

   @Override
   public void setThrowable(@Nullable Throwable var1) {
      this.throwable = var1;
   }

   @Nullable
   @Override
   public Throwable getThrowable() {
      return this.throwable;
   }

   @NotNull
   public SentryId getTraceId() {
      return this.context.getTraceId();
   }

   @NotNull
   public SpanId getSpanId() {
      return this.context.getSpanId();
   }

   @Nullable
   public SpanId getParentSpanId() {
      return this.context.getParentSpanId();
   }

   public Map<String, String> getTags() {
      return this.context.getTags();
   }

   @Override
   public void setData(@NotNull String var1, @NotNull Object var2) {
      this.data.put(var1, var2);
   }

   @Nullable
   @Override
   public Object getData(@NotNull String var1) {
      return this.data.get(var1);
   }

   @Override
   public void setMeasurement(@NotNull String var1, @NotNull Number var2) {
      if (this.isFinished()) {
         this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", var1);
      } else {
         this.measurements.put(var1, new MeasurementValue(var2, null));
         if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(var1, var2);
         }
      }
   }

   @Override
   public void setMeasurement(@NotNull String var1, @NotNull Number var2, @NotNull MeasurementUnit var3) {
      if (this.isFinished()) {
         this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", var1);
      } else {
         this.measurements.put(var1, new MeasurementValue(var2, var3.apiName()));
         if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(var1, var2, var3);
         }
      }
   }

   @NotNull
   public Map<String, MeasurementValue> getMeasurements() {
      return this.measurements;
   }

   @Override
   public boolean updateEndDate(@NotNull SentryDate var1) {
      if (this.timestamp != null) {
         this.timestamp = var1;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean isNoOp() {
      return false;
   }

   @NotNull
   @Override
   public LocalMetricsAggregator getLocalMetricsAggregator() {
      return this.metricsAggregator.getValue();
   }

   void setSpanFinishedCallback(@Nullable SpanFinishedCallback var1) {
      this.spanFinishedCallback = var1;
   }

   @Nullable
   SpanFinishedCallback getSpanFinishedCallback() {
      return this.spanFinishedCallback;
   }

   private void updateStartDate(@NotNull SentryDate var1) {
      this.startTimestamp = var1;
   }

   @NotNull
   SpanOptions getOptions() {
      return this.options;
   }

   @NotNull
   private List<Span> getDirectChildren() {
      ArrayList var1 = new ArrayList();

      for (Span var3 : this.transaction.getSpans()) {
         if (var3.getParentSpanId() != null && var3.getParentSpanId().equals(this.getSpanId())) {
            var1.add(var3);
         }
      }

      return var1;
   }
}
