package com.github.benmanes.caffeine.cache.stats;

import com.github.benmanes.caffeine.cache.RemovalCause;
import org.checkerframework.checker.index.qual.NonNegative;

public interface StatsCounter {
   void recordHits(@NonNegative int var1);

   void recordMisses(@NonNegative int var1);

   void recordLoadSuccess(@NonNegative long var1);

   void recordLoadFailure(@NonNegative long var1);

   void recordEviction(@NonNegative int var1, RemovalCause var2);

   CacheStats snapshot();

   static StatsCounter disabledStatsCounter() {
      return DisabledStatsCounter.INSTANCE;
   }

   static StatsCounter guardedStatsCounter(StatsCounter var0) {
      return var0 instanceof GuardedStatsCounter ? var0 : new GuardedStatsCounter(var0);
   }
}
