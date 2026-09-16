package com.github.benmanes.caffeine.cache.stats;

import com.github.benmanes.caffeine.cache.RemovalCause;
import java.util.Objects;
import java.util.concurrent.atomic.LongAdder;

public final class ConcurrentStatsCounter implements StatsCounter {
   private final LongAdder hitCount = new LongAdder();
   private final LongAdder missCount = new LongAdder();
   private final LongAdder loadSuccessCount = new LongAdder();
   private final LongAdder loadFailureCount = new LongAdder();
   private final LongAdder totalLoadTime = new LongAdder();
   private final LongAdder evictionCount = new LongAdder();
   private final LongAdder evictionWeight = new LongAdder();

   @Override
   public void recordHits(int var1) {
      this.hitCount.add(var1);
   }

   @Override
   public void recordMisses(int var1) {
      this.missCount.add(var1);
   }

   @Override
   public void recordLoadSuccess(long var1) {
      this.loadSuccessCount.increment();
      this.totalLoadTime.add(var1);
   }

   @Override
   public void recordLoadFailure(long var1) {
      this.loadFailureCount.increment();
      this.totalLoadTime.add(var1);
   }

   @Override
   public void recordEviction(int var1, RemovalCause var2) {
      Objects.requireNonNull(var2);
      this.evictionCount.increment();
      this.evictionWeight.add(var1);
   }

   @Override
   public CacheStats snapshot() {
      return CacheStats.of(
         negativeToMaxValue(this.hitCount.sum()),
         negativeToMaxValue(this.missCount.sum()),
         negativeToMaxValue(this.loadSuccessCount.sum()),
         negativeToMaxValue(this.loadFailureCount.sum()),
         negativeToMaxValue(this.totalLoadTime.sum()),
         negativeToMaxValue(this.evictionCount.sum()),
         negativeToMaxValue(this.evictionWeight.sum())
      );
   }

   private static long negativeToMaxValue(long var0) {
      return var0 >= 0L ? var0 : Long.MAX_VALUE;
   }

   public void incrementBy(StatsCounter var1) {
      CacheStats var2 = var1.snapshot();
      this.hitCount.add(var2.hitCount());
      this.missCount.add(var2.missCount());
      this.loadSuccessCount.add(var2.loadSuccessCount());
      this.loadFailureCount.add(var2.loadFailureCount());
      this.totalLoadTime.add(var2.totalLoadTime());
      this.evictionCount.add(var2.evictionCount());
      this.evictionWeight.add(var2.evictionWeight());
   }

   @Override
   public String toString() {
      return this.snapshot().toString();
   }
}
