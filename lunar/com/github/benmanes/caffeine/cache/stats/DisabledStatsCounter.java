package com.github.benmanes.caffeine.cache.stats;

import com.github.benmanes.caffeine.cache.RemovalCause;
import java.util.Objects;
import org.checkerframework.checker.index.qual.NonNegative;

enum DisabledStatsCounter implements StatsCounter {
   INSTANCE;

   @Override
   public void recordHits(int var1) {
   }

   @Override
   public void recordMisses(int var1) {
   }

   @Override
   public void recordLoadSuccess(long var1) {
   }

   @Override
   public void recordLoadFailure(long var1) {
   }

   @Override
   public void recordEviction(@NonNegative int var1, RemovalCause var2) {
      Objects.requireNonNull(var2);
   }

   @Override
   public CacheStats snapshot() {
      return CacheStats.empty();
   }

   @Override
   public String toString() {
      return this.snapshot().toString();
   }
}
