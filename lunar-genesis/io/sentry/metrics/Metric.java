package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public abstract class Metric {
   @NotNull
   private final MetricType type;
   @NotNull
   private final String key;
   @Nullable
   private final MeasurementUnit unit;
   @Nullable
   private final Map<String, String> tags;

   public Metric(@NotNull MetricType var1, @NotNull String var2, @Nullable MeasurementUnit var3, @Nullable Map<String, String> var4) {
      this.type = var1;
      this.key = var2;
      this.unit = var3;
      this.tags = var4;
   }

   public abstract void add(double var1);

   @NotNull
   public MetricType getType() {
      return this.type;
   }

   public abstract int getWeight();

   @NotNull
   public String getKey() {
      return this.key;
   }

   @Nullable
   public MeasurementUnit getUnit() {
      return this.unit;
   }

   @Nullable
   public Map<String, String> getTags() {
      return this.tags;
   }

   @NotNull
   public abstract Iterable<?> serialize();
}
