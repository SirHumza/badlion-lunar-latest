package io.sentry;

import io.sentry.metrics.LocalMetricsAggregator;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ISpan {
   @NotNull
   ISpan startChild(@NotNull String var1);

   @ApiStatus.Internal
   @NotNull
   ISpan startChild(@NotNull String var1, @Nullable String var2, @NotNull SpanOptions var3);

   @ApiStatus.Internal
   @NotNull
   ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4);

   @ApiStatus.Internal
   @NotNull
   ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3, @NotNull Instrumenter var4, @NotNull SpanOptions var5);

   @NotNull
   ISpan startChild(@NotNull String var1, @Nullable String var2);

   @NotNull
   SentryTraceHeader toSentryTrace();

   @Nullable
   @ApiStatus.Experimental
   TraceContext traceContext();

   @Nullable
   @ApiStatus.Experimental
   BaggageHeader toBaggageHeader(@Nullable List<String> var1);

   void finish();

   void finish(@Nullable SpanStatus var1);

   void finish(@Nullable SpanStatus var1, @Nullable SentryDate var2);

   void setOperation(@NotNull String var1);

   @NotNull
   String getOperation();

   void setDescription(@Nullable String var1);

   @Nullable
   String getDescription();

   void setStatus(@Nullable SpanStatus var1);

   @Nullable
   SpanStatus getStatus();

   void setThrowable(@Nullable Throwable var1);

   @Nullable
   Throwable getThrowable();

   @NotNull
   SpanContext getSpanContext();

   void setTag(@NotNull String var1, @NotNull String var2);

   @Nullable
   String getTag(@NotNull String var1);

   boolean isFinished();

   void setData(@NotNull String var1, @NotNull Object var2);

   @Nullable
   Object getData(@NotNull String var1);

   void setMeasurement(@NotNull String var1, @NotNull Number var2);

   void setMeasurement(@NotNull String var1, @NotNull Number var2, @NotNull MeasurementUnit var3);

   @ApiStatus.Internal
   boolean updateEndDate(@NotNull SentryDate var1);

   @ApiStatus.Internal
   @NotNull
   SentryDate getStartDate();

   @ApiStatus.Internal
   @Nullable
   SentryDate getFinishDate();

   @ApiStatus.Internal
   boolean isNoOp();

   @Nullable
   LocalMetricsAggregator getLocalMetricsAggregator();
}
