package io.sentry;

import io.sentry.metrics.LocalMetricsAggregator;
import java.io.Closeable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IMetricsAggregator extends Closeable {
   void increment(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   );

   void gauge(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   );

   void distribution(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   );

   void set(
      @NotNull String var1, int var2, @Nullable MeasurementUnit var3, @Nullable Map<String, String> var4, long var5, @Nullable LocalMetricsAggregator var7
   );

   void set(
      @NotNull String var1,
      @NotNull String var2,
      @Nullable MeasurementUnit var3,
      @Nullable Map<String, String> var4,
      long var5,
      @Nullable LocalMetricsAggregator var7
   );

   void flush(boolean var1);
}
