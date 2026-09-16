package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class GaugeMetric extends Metric {
   private double last;
   private double min;
   private double max;
   private double sum;
   private int count;

   public GaugeMetric(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5) {
      super(MetricType.Gauge, var1, var4, var5);
      this.last = var2;
      this.min = var2;
      this.max = var2;
      this.sum = var2;
      this.count = 1;
   }

   @Override
   public void add(double var1) {
      this.last = var1;
      this.min = Math.min(this.min, var1);
      this.max = Math.max(this.max, var1);
      this.sum += var1;
      this.count++;
   }

   public double getLast() {
      return this.last;
   }

   public double getMin() {
      return this.min;
   }

   public double getMax() {
      return this.max;
   }

   public double getSum() {
      return this.sum;
   }

   public int getCount() {
      return this.count;
   }

   @Override
   public int getWeight() {
      return 5;
   }

   @NotNull
   @Override
   public Iterable<?> serialize() {
      return Arrays.asList(this.last, this.min, this.max, this.sum, this.count);
   }
}
