package io.sentry;

import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class DefaultTransactionPerformanceCollector implements TransactionPerformanceCollector {
   private static final long TRANSACTION_COLLECTION_INTERVAL_MILLIS = 100L;
   private static final long TRANSACTION_COLLECTION_TIMEOUT_MILLIS = 30000L;
   @NotNull
   private final Object timerLock = new Object();
   @Nullable
   private volatile Timer timer = null;
   @NotNull
   private final Map<String, List<PerformanceCollectionData>> performanceDataMap = new ConcurrentHashMap<>();
   @NotNull
   private final List<IPerformanceSnapshotCollector> snapshotCollectors;
   @NotNull
   private final List<IPerformanceContinuousCollector> continuousCollectors;
   private final boolean hasNoCollectors;
   @NotNull
   private final SentryOptions options;
   @NotNull
   private final AtomicBoolean isStarted = new AtomicBoolean(false);
   private long lastCollectionTimestamp = 0L;

   public DefaultTransactionPerformanceCollector(@NotNull SentryOptions var1) {
      this.options = Objects.requireNonNull(var1, "The options object is required.");
      this.snapshotCollectors = new ArrayList<>();
      this.continuousCollectors = new ArrayList<>();

      for (IPerformanceCollector var4 : var1.getPerformanceCollectors()) {
         if (var4 instanceof IPerformanceSnapshotCollector) {
            this.snapshotCollectors.add((IPerformanceSnapshotCollector)var4);
         }

         if (var4 instanceof IPerformanceContinuousCollector) {
            this.continuousCollectors.add((IPerformanceContinuousCollector)var4);
         }
      }

      this.hasNoCollectors = this.snapshotCollectors.isEmpty() && this.continuousCollectors.isEmpty();
   }

   @Override
   public void start(@NotNull ITransaction var1) {
      if (this.hasNoCollectors) {
         this.options.getLogger().log(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.");
      } else {
         for (IPerformanceContinuousCollector var3 : this.continuousCollectors) {
            var3.onSpanStarted(var1);
         }

         if (!this.performanceDataMap.containsKey(var1.getEventId().toString())) {
            this.performanceDataMap.put(var1.getEventId().toString(), new ArrayList<>());

            try {
               this.options.getExecutorService().schedule(() -> this.stop(var1), 30000L);
            } catch (RejectedExecutionException var6) {
               this.options
                  .getLogger()
                  .log(
                     SentryLevel.ERROR,
                     "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?",
                     var6
                  );
            }
         }

         if (!this.isStarted.getAndSet(true)) {
            synchronized (this.timerLock) {
               if (this.timer == null) {
                  this.timer = new Timer(true);
               }

               this.timer.schedule(new TimerTask() {
                  @Override
                  public void run() {
                     for (IPerformanceSnapshotCollector var2 : DefaultTransactionPerformanceCollector.this.snapshotCollectors) {
                        var2.setup();
                     }
                  }
               }, 0L);
               TimerTask var8 = new TimerTask() {
                  @Override
                  public void run() {
                     long var1 = System.currentTimeMillis();
                     if (var1 - DefaultTransactionPerformanceCollector.this.lastCollectionTimestamp >= 10L) {
                        DefaultTransactionPerformanceCollector.this.lastCollectionTimestamp = var1;
                        PerformanceCollectionData var3 = new PerformanceCollectionData();

                        for (IPerformanceSnapshotCollector var5 : DefaultTransactionPerformanceCollector.this.snapshotCollectors) {
                           var5.collect(var3);
                        }

                        for (List var7 : DefaultTransactionPerformanceCollector.this.performanceDataMap.values()) {
                           var7.add(var3);
                        }
                     }
                  }
               };
               this.timer.scheduleAtFixedRate(var8, 100L, 100L);
            }
         }
      }
   }

   @Override
   public void onSpanStarted(@NotNull ISpan var1) {
      for (IPerformanceContinuousCollector var3 : this.continuousCollectors) {
         var3.onSpanStarted(var1);
      }
   }

   @Override
   public void onSpanFinished(@NotNull ISpan var1) {
      for (IPerformanceContinuousCollector var3 : this.continuousCollectors) {
         var3.onSpanFinished(var1);
      }
   }

   @Nullable
   @Override
   public List<PerformanceCollectionData> stop(@NotNull ITransaction var1) {
      this.options
         .getLogger()
         .log(SentryLevel.DEBUG, "stop collecting performance info for transactions %s (%s)", var1.getName(), var1.getSpanContext().getTraceId().toString());
      List var2 = this.performanceDataMap.remove(var1.getEventId().toString());

      for (IPerformanceContinuousCollector var4 : this.continuousCollectors) {
         var4.onSpanFinished(var1);
      }

      if (this.performanceDataMap.isEmpty()) {
         this.close();
      }

      return var2;
   }

   @Override
   public void close() {
      this.options.getLogger().log(SentryLevel.DEBUG, "stop collecting all performance info for transactions");
      this.performanceDataMap.clear();

      for (IPerformanceContinuousCollector var2 : this.continuousCollectors) {
         var2.clear();
      }

      if (this.isStarted.getAndSet(false)) {
         synchronized (this.timerLock) {
            if (this.timer != null) {
               this.timer.cancel();
               this.timer = null;
            }
         }
      }
   }
}
