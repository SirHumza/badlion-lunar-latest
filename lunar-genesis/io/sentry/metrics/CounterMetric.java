package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class CounterMetric extends Metric {
   private double value;

   public CounterMetric(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5) {
      super(MetricType.Counter, var1, var4, var5);
      this.value = var2;
   }

   public double getValue() {
      return this.value;
   }

   @Override
   public void add(double var1) {
      this.value += var1;
   }

   @Override
   public int getWeight() {
      return 1;
   }

   @NotNull
   @Override
   public Iterable<?> serialize() {
      return Collections.singletonList(this.value);
   }
}
