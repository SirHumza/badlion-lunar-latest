package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class DistributionMetric extends Metric {
   private final List<Double> values = new ArrayList<>();

   public DistributionMetric(@NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5) {
      super(MetricType.Distribution, var1, var4, var5);
      this.values.add(var2);
   }

   @Override
   public void add(double var1) {
      this.values.add(var1);
   }

   @Override
   public int getWeight() {
      return this.values.size();
   }

   @NotNull
   @Override
   public Iterable<?> serialize() {
      return this.values;
   }
}
