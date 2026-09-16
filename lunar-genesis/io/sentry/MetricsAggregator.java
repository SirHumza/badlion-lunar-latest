package io.sentry;

import io.sentry.metrics.CounterMetric;
import io.sentry.metrics.DistributionMetric;
import io.sentry.metrics.EncodedMetrics;
import io.sentry.metrics.GaugeMetric;
import io.sentry.metrics.IMetricsClient;
import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.metrics.Metric;
import io.sentry.metrics.MetricType;
import io.sentry.metrics.MetricsHelper;
import io.sentry.metrics.SetMetric;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.CRC32;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class MetricsAggregator implements IMetricsAggregator, Closeable, Runnable {
   private static final Charset UTF8 = Charset.forName("UTF-8");
   @NotNull
   private final ILogger logger;
   @NotNull
   private final IMetricsClient client;
   @NotNull
   private final SentryDateProvider dateProvider;
   @Nullable
   private final SentryOptions.BeforeEmitMetricCallback beforeEmitCallback;
   @NotNull
   private volatile ISentryExecutorService executorService;
   private volatile boolean isClosed = false;
   private volatile boolean flushScheduled = false;
   @NotNull
   private final NavigableMap<Long, Map<String, Metric>> buckets = new ConcurrentSkipListMap<>();
   @NotNull
   private final AtomicInteger totalBucketsWeight = new AtomicInteger();
   private final int maxWeight;

   public MetricsAggregator(@NotNull SentryOptions var1, @NotNull IMetricsClient var2) {
      this(var2, var1.getLogger(), var1.getDateProvider(), 100000, var1.getBeforeEmitMetricCallback(), NoOpSentryExecutorService.getInstance());
   }

   @TestOnly
   public MetricsAggregator(
      @NotNull IMetricsClient var1,
      @NotNull ILogger var2,
      @NotNull SentryDateProvider var3,
      int var4,
      @Nullable SentryOptions.BeforeEmitMetricCallback var5,
      @NotNull ISentryExecutorService var6
   ) {
      this.client = var1;
      this.logger = var2;
      this.dateProvider = var3;
      this.maxWeight = var4;
      this.beforeEmitCallback = var5;
      this.executorService = var6;
   }

   @Override
   public void increment(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   ) {
      this.add(MetricType.Counter, var1, var2, var4, var5, var6, var8);
   }

   @Override
   public void gauge(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   ) {
      this.add(MetricType.Gauge, var1, var2, var4, var5, var6, var8);
   }

   @Override
   public void distribution(
      @NotNull String var1, double var2, @Nullable MeasurementUnit var4, @Nullable Map<String, String> var5, long var6, @Nullable LocalMetricsAggregator var8
   ) {
      this.add(MetricType.Distribution, var1, var2, var4, var5, var6, var8);
   }

   @Override
   public void set(
      @NotNull String var1, int var2, @Nullable MeasurementUnit var3, @Nullable Map<String, String> var4, long var5, @Nullable LocalMetricsAggregator var7
   ) {
      this.add(MetricType.Set, var1, var2, var3, var4, var5, var7);
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
      byte[] var8 = var2.getBytes(UTF8);
      CRC32 var9 = new CRC32();
      var9.update(var8, 0, var8.length);
      int var10 = (int)var9.getValue();
      this.add(MetricType.Set, var1, var10, var3, var4, var5, var7);
   }

   private void add(
      @NotNull MetricType var1,
      @NotNull String var2,
      double var3,
      @Nullable MeasurementUnit var5,
      @Nullable Map<String, String> var6,
      long var7,
      @Nullable LocalMetricsAggregator var9
   ) {
      if (!this.isClosed) {
         if (this.beforeEmitCallback != null) {
            try {
               if (!this.beforeEmitCallback.execute(var2, var6)) {
                  return;
               }
            } catch (Throwable var22) {
               this.logger.log(SentryLevel.ERROR, "The beforeEmit callback threw an exception.", var22);
            }
         }

         long var10 = MetricsHelper.getTimeBucketKey(var7);
         Map var12 = this.getOrAddTimeBucket(var10);
         String var13 = MetricsHelper.getMetricBucketKey(var1, var2, var5, var6);
         int var14;
         synchronized (var12) {
            Metric var16 = (Metric)var12.get(var13);
            if (var16 != null) {
               int var17 = var16.getWeight();
               var16.add(var3);
               var14 = var16.getWeight() - var17;
            } else {
               Metric var24;
               switch (var1) {
                  case Counter:
                     var24 = new CounterMetric(var2, var3, var5, var6);
                     break;
                  case Gauge:
                     var24 = new GaugeMetric(var2, var3, var5, var6);
                     break;
                  case Distribution:
                     var24 = new DistributionMetric(var2, var3, var5, var6);
                     break;
                  case Set:
                     var24 = new SetMetric(var2, var5, var6);
                     var24.add((int)var3);
                     break;
                  default:
                     throw new IllegalArgumentException("Unknown MetricType: " + var1.name());
               }

               var14 = var24.getWeight();
               var12.put(var13, var24);
            }

            this.totalBucketsWeight.addAndGet(var14);
         }

         if (var9 != null) {
            double var15 = var1 == MetricType.Set ? var14 : var3;
            var9.add(var13, var1, var2, var15, var5, var6);
         }

         boolean var23 = this.isOverWeight();
         if (!this.isClosed && (var23 || !this.flushScheduled)) {
            synchronized (this) {
               if (!this.isClosed) {
                  if (this.executorService instanceof NoOpSentryExecutorService) {
                     this.executorService = new SentryExecutorService();
                  }

                  this.flushScheduled = true;
                  long var25 = var23 ? 0L : 5000L;
                  this.executorService.schedule(this, var25);
               }
            }
         }
      }
   }

   @Override
   public void flush(boolean var1) {
      if (!var1 && this.isOverWeight()) {
         this.logger.log(SentryLevel.INFO, "Metrics: total weight exceeded, flushing all buckets");
         var1 = true;
      }

      this.flushScheduled = false;
      Set var2 = this.getFlushableBuckets(var1);
      if (var2.isEmpty()) {
         this.logger.log(SentryLevel.DEBUG, "Metrics: nothing to flush");
      } else {
         this.logger.log(SentryLevel.DEBUG, "Metrics: flushing " + var2.size() + " buckets");
         HashMap var3 = new HashMap();
         int var4 = 0;

         for (long var6 : var2) {
            Map var8 = this.buckets.remove(var6);
            if (var8 != null) {
               synchronized (var8) {
                  int var10 = getBucketWeight(var8);
                  this.totalBucketsWeight.addAndGet(-var10);
                  var4 += var8.size();
                  var3.put(var6, var8);
               }
            }
         }

         if (var4 == 0) {
            this.logger.log(SentryLevel.DEBUG, "Metrics: only empty buckets found");
         } else {
            this.logger.log(SentryLevel.DEBUG, "Metrics: capturing metrics");
            this.client.captureMetrics(new EncodedMetrics(var3));
         }
      }
   }

   private boolean isOverWeight() {
      int var1 = this.buckets.size() + this.totalBucketsWeight.get();
      return var1 >= this.maxWeight;
   }

   private static int getBucketWeight(@NotNull Map<String, Metric> var0) {
      int var1 = 0;

      for (Metric var3 : var0.values()) {
         var1 += var3.getWeight();
      }

      return var1;
   }

   @NotNull
   private Set<Long> getFlushableBuckets(boolean var1) {
      if (var1) {
         return this.buckets.keySet();
      }

      long var2 = MetricsHelper.getCutoffTimestampMs(this.nowMillis());
      long var4 = MetricsHelper.getTimeBucketKey(var2);
      return this.buckets.headMap(var4, true).keySet();
   }

   @NotNull
   private Map<String, Metric> getOrAddTimeBucket(long var1) {
      Map var3 = this.buckets.get(var1);
      if (var3 == null) {
         synchronized (this.buckets) {
            var3 = this.buckets.get(var1);
            if (var3 == null) {
               var3 = new HashMap();
               this.buckets.put(var1, var3);
            }
         }
      }

      return var3;
   }

   @Override
   public void close() {
      synchronized (this) {
         this.isClosed = true;
         this.executorService.close(0L);
      }

      this.flush(true);
   }

   @Override
   public void run() {
      this.flush(false);
      synchronized (this) {
         if (!this.isClosed && !this.buckets.isEmpty()) {
            this.executorService.schedule(this, 5000L);
         }
      }
   }

   private long nowMillis() {
      return TimeUnit.NANOSECONDS.toMillis(this.dateProvider.now().nanoTimestamp());
   }
}
