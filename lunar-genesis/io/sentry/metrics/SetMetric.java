package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SetMetric extends Metric {
   @NotNull
   private final Set<Integer> values = new HashSet<>();

   public SetMetric(@NotNull String var1, @Nullable MeasurementUnit var2, @Nullable Map<String, String> var3) {
      super(MetricType.Set, var1, var2, var3);
   }

   @Override
   public void add(double var1) {
      this.values.add((int)var1);
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
