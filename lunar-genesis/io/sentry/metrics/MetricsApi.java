package io.sentry.metrics;

import io.sentry.IMetricsAggregator;
import io.sentry.ISpan;
import io.sentry.MeasurementUnit;
import io.sentry.SentryDate;
import io.sentry.SentryNanotimeDate;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MetricsApi {
   @NotNull
   private final MetricsApi.IMetricsInterface aggregator;

   public MetricsApi(@NotNull MetricsApi.IMetricsInterface var1) {
      this.aggregator = var1;
   }

   public void increment(@NotNull String var1) {
      this.increment(var1, 1.0, null, null, null);
   }

   public void increment(@NotNull String var1, double var2) {
      this.increment(var1, var2, null, null, null);
   }

   public void increment(@NotNull String var1, double var2, @Nullable MeasurementUnit var4) {
      this.increment(var1, var2, var4, null, null);
   }

   public void increment(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5) {
      this.increment(var1, var2, var4, var5, null);
   }

   public void increment(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, @Nullable Long var6) {
      long var7 = var6 != null ? var6 : System.currentTimeMillis();
      Map var9 = MetricsHelper.mergeTags(var5, this.aggregator.getDefaultTagsForMetrics());
      LocalMetricsAggregator var10 = this.aggregator.getLocalMetricsAggregator();
      this.aggregator.getMetricsAggregator().increment(var1, var2, var4, var9, var7, var10);
   }

   public void gauge(@NotNull String var1, double var2) {
      this.gauge(var1, var2, null, null, null);
   }

   public void gauge(@NotNull String var1, double var2, @Nullable MeasurementUnit var4) {
      this.gauge(var1, var2, var4, null, null);
   }

   public void gauge(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5) {
      this.gauge(var1, var2, var4, var5, null);
   }

   public void gauge(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, @Nullable Long var6) {
      long var7 = var6 != null ? var6 : System.currentTimeMillis();
      Map var9 = MetricsHelper.mergeTags(var5, this.aggregator.getDefaultTagsForMetrics());
      LocalMetricsAggregator var10 = this.aggregator.getLocalMetricsAggregator();
      this.aggregator.getMetricsAggregator().gauge(var1, var2, var4, var9, var7, var10);
   }

   public void distribution(@NotNull String var1, double var2) {
      this.distribution(var1, var2, null, null, null);
   }

   public void distribution(@NotNull String var1, double var2, @Nullable MeasurementUnit var4) {
      this.distribution(var1, var2, var4, null, null);
   }

   public void distribution(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5) {
      this.distribution(var1, var2, var4, var5, null);
   }

   public void distribution(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, @Nullable Long var6) {
      long var7 = var6 != null ? var6 : System.currentTimeMillis();
      Map var9 = MetricsHelper.mergeTags(var5, this.aggregator.getDefaultTagsForMetrics());
      LocalMetricsAggregator var10 = this.aggregator.getLocalMetricsAggregator();
      this.aggregator.getMetricsAggregator().distribution(var1, var2, var4, var9, var7, var10);
   }

   public void set(@NotNull String var1, int var2) {
      this.set(var1, var2, null, null, null);
   }

   public void set(@NotNull String var1, int var2, @Nullable MeasurementUnit var3) {
      this.set(var1, var2, var3, null, null);
   }

   public void set(@NotNull String var1, int var2, @Nullable MeasurementUnit var3, @Nullable Map<String, String> var4) {
      this.set(var1, var2, var3, var4, null);
   }

   public void set(@NotNull String var1, int var2, @Nullable MeasurementUnit var3, @Nullable Map<String, String> var4, @Nullable Long var5) {
      long var6 = var5 != null ? var5 : System.currentTimeMillis();
      Map var8 = MetricsHelper.mergeTags(var4, this.aggregator.getDefaultTagsForMetrics());
      LocalMetricsAggregator var9 = this.aggregator.getLocalMetricsAggregator();
      this.aggregator.getMetricsAggregator().set(var1, var2, var3, var8, var6, var9);
   }

   public void set(@NotNull String var1, @NotNull String var2) {
      this.set(var1, var2, null, null, null);
   }

   public void set(@NotNull String var1, @NotNull String var2, @Nullable MeasurementUnit var3) {
      this.set(var1, var2, var3, null, null);
   }

   public void set(@NotNull String var1, @NotNull String var2, @Nullable MeasurementUnit var3, @Nullable Map<String, String> var4) {
      this.set(var1, var2, var3, var4, null);
   }

   public void set(@NotNull String var1, @NotNull String var2, @Nullable MeasurementUnit var3, @Nullable Map<String, String> var4, @Nullable Long var5) {
      long var6 = var5 != null ? var5 : System.currentTimeMillis();
      Map var8 = MetricsHelper.mergeTags(var4, this.aggregator.getDefaultTagsForMetrics());
      LocalMetricsAggregator var9 = this.aggregator.getLocalMetricsAggregator();
      this.aggregator.getMetricsAggregator().set(var1, var2, var3, var8, var6, var9);
   }

   public void timing(@NotNull String var1, @NotNull Runnable var2) {
      this.timing(var1, var2, null, null);
   }

   public void timing(@NotNull String var1, @NotNull Runnable var2, @NotNull MeasurementUnit.Duration var3) {
      this.timing(var1, var2, var3, null);
   }

   public void timing(@NotNull String var1, @NotNull Runnable var2, @Nullable MeasurementUnit.Duration var3, @Nullable Map<String, String> var4) {
      MeasurementUnit.Duration var5 = var3 != null ? var3 : MeasurementUnit.Duration.SECOND;
      Map var6 = MetricsHelper.mergeTags(var4, this.aggregator.getDefaultTagsForMetrics());
      ISpan var8 = this.aggregator.startSpanForMetric("metric.timing", var1);
      LocalMetricsAggregator var7 = var8 != null ? var8.getLocalMetricsAggregator() : this.aggregator.getLocalMetricsAggregator();
      if (var8 != null && var4 != null) {
         for (Entry var10 : var4.entrySet()) {
            var8.setTag((String)var10.getKey(), (String)var10.getValue());
         }
      }

      long var24 = System.currentTimeMillis();
      long var11 = System.nanoTime();

      try {
         var2.run();
      } finally {
         long var18;
         if (var8 != null) {
            var8.finish();
            SentryDate var20 = var8.getFinishDate() != null ? var8.getFinishDate() : new SentryNanotimeDate();
            var18 = var20.diff(var8.getStartDate());
         } else {
            var18 = System.nanoTime() - var11;
         }

         double var25 = MetricsHelper.convertNanosTo(var5, var18);
         this.aggregator.getMetricsAggregator().distribution(var1, var25, var5, var6, var24, var7);
      }
   }

   @ApiStatus.Internal
   public interface IMetricsInterface {
      @NotNull
      IMetricsAggregator getMetricsAggregator();

      @Nullable
      LocalMetricsAggregator getLocalMetricsAggregator();

      @NotNull
      Map<String, String> getDefaultTagsForMetrics();

      @Nullable
      ISpan startSpanForMetric(@NotNull String var1, @NotNull String var2);
   }
}
