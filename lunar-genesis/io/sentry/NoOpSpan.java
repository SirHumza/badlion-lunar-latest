package io.sentry;

import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.protocol.SentryId;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoOpSpan implements ISpan {
   private static final NoOpSpan instance = new NoOpSpan();

   private NoOpSpan() {
   }

   public static NoOpSpan getInstance() {
      return instance;
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1) {
      return getInstance();
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @NotNull SpanOptions var3) {
      return getInstance();
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4) {
      return getInstance();
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4, @NotNull SpanOptions var5) {
      return getInstance();
   }

   @NotNull
   @Override
   public ISpan startChild(@NotNull String var1, @Nullable String var2) {
      return getInstance();
   }

   @NotNull
   @Override
   public SentryTraceHeader toSentryTrace() {
      return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, false);
   }

   @NotNull
   @Override
   public TraceContext traceContext() {
      return new TraceContext(SentryId.EMPTY_ID, "");
   }

   @Nullable
   @Override
   public BaggageHeader toBaggageHeader(@Nullable List<String> var1) {
      return null;
   }

   @Override
   public void finish() {
   }

   @Override
   public void finish(@Nullable SpanStatus var1) {
   }

   @Override
   public void finish(@Nullable SpanStatus var1, @Nullable SentryDate var2) {
   }

   @Override
   public void setOperation(@NotNull String var1) {
   }

   @NotNull
   @Override
   public String getOperation() {
      return "";
   }

   @Override
   public void setDescription(@Nullable String var1) {
   }

   @Nullable
   @Override
   public String getDescription() {
      return null;
   }

   @Override
   public void setStatus(@Nullable SpanStatus var1) {
   }

   @Nullable
   @Override
   public SpanStatus getStatus() {
      return null;
   }

   @Override
   public void setThrowable(@Nullable Throwable var1) {
   }

   @Nullable
   @Override
   public Throwable getThrowable() {
      return null;
   }

   @NotNull
   @Override
   public SpanContext getSpanContext() {
      return new SpanContext(SentryId.EMPTY_ID, SpanId.EMPTY_ID, "op", null, null);
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
   }

   @Nullable
   @Override
   public String getTag(@NotNull String var1) {
      return null;
   }

   @Override
   public boolean isFinished() {
      return false;
   }

   @Override
   public void setData(@NotNull String var1, @NotNull Object var2) {
   }

   @Nullable
   @Override
   public Object getData(@NotNull String var1) {
      return null;
   }

   @Override
   public void setMeasurement(@NotNull String var1, @NotNull Number var2) {
   }

   @Override
   public void setMeasurement(@NotNull String var1, @NotNull Number var2, @NotNull MeasurementUnit var3) {
   }

   @Override
   public boolean updateEndDate(@NotNull SentryDate var1) {
      return false;
   }

   @NotNull
   @Override
   public SentryDate getStartDate() {
      return new SentryNanotimeDate();
   }

   @NotNull
   @Override
   public SentryDate getFinishDate() {
      return new SentryNanotimeDate();
   }

   @Override
   public boolean isNoOp() {
      return true;
   }

   @Nullable
   @Override
   public LocalMetricsAggregator getLocalMetricsAggregator() {
      return null;
   }
}
