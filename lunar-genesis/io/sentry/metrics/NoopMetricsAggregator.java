package io.sentry.metrics;

import io.sentry.IMetricsAggregator;
import io.sentry.ISpan;
import io.sentry.MeasurementUnit;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class NoopMetricsAggregator implements IMetricsAggregator, MetricsApi.IMetricsInterface {
   private static final NoopMetricsAggregator instance = new NoopMetricsAggregator();

   public static NoopMetricsAggregator getInstance() {
      return instance;
   }

   @Override
   public void increment(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   ) {
   }

   @Override
   public void gauge(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   ) {
   }

   @Override
   public void distribution(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   ) {
   }

   @Override
   public void set(
      @NotNull String var1, int var2, @Nullable MeasurementUnit var3, @Nullable Map<String, String> var4, long var5, @Nullable LocalMetricsAggregator var7
   ) {
   }

   @Override
   public void set(
      @NotNull String var1,
      @NotNull String var2,
      @Nullable MeasurementUnit var3,
      @Nullable Map<String, String> var4,
      long var5,
      @Nullable LocalMetricsAggregator var7
   ) {
   }

   @Override
   public void flush(boolean var1) {
   }

   @Override
   public void close() {
   }

   @NotNull
   @Override
   public IMetricsAggregator getMetricsAggregator() {
      return this;
   }

   @Nullable
   @Override
   public LocalMetricsAggregator getLocalMetricsAggregator() {
      return null;
   }

   @NotNull
   @Override
   public Map<String, String> getDefaultTagsForMetrics() {
      return Collections.emptyMap();
   }

   @Nullable
   @Override
   public ISpan startSpanForMetric(@NotNull String var1, @NotNull String var2) {
      return null;
   }
}
