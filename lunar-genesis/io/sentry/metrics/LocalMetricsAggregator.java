package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import io.sentry.protocol.MetricSummary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class LocalMetricsAggregator {
   @NotNull
   private final Map<String, Map<String, GaugeMetric>> buckets = new HashMap<>();

   public void add(
      @NotNull String var1, @NotNull MetricType var2, @NotNull String var3, double var4, @Nullable MeasurementUnit var6, @Nullable Map<String, String> var7
   ) {
      String var8 = MetricsHelper.getExportKey(var2, var3, var6);
      synchronized (this.buckets) {
         Map var10 = this.buckets.get(var8);
         if (var10 == null) {
            var10 = new HashMap();
            this.buckets.put(var8, var10);
         }

         GaugeMetric var11 = (GaugeMetric)var10.get(var1);
         if (var11 == null) {
            var11 = new GaugeMetric(var3, var4, var6, var7);
            var10.put(var1, var11);
         } else {
            var11.add(var4);
         }
      }
   }

   @NotNull
   public Map<String, List<MetricSummary>> getSummaries() {
      HashMap var1 = new HashMap();
      synchronized (this.buckets) {
         for (Entry var4 : this.buckets.entrySet()) {
            String var5 = Objects.requireNonNull((String)var4.getKey());
            ArrayList var6 = new ArrayList();

            for (GaugeMetric var8 : ((Map)var4.getValue()).values()) {
               var6.add(new MetricSummary(var8.getMin(), var8.getMax(), var8.getSum(), var8.getCount(), var8.getTags()));
            }

            var1.put(var5, var6);
         }

         return var1;
      }
   }
}
