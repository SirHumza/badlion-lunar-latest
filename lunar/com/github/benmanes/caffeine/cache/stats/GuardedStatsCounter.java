package com.github.benmanes.caffeine.cache.stats;

import com.github.benmanes.caffeine.cache.RemovalCause;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Objects;

final class GuardedStatsCounter implements StatsCounter {
   static final Logger logger = System.getLogger(GuardedStatsCounter.class.getName());
   final StatsCounter delegate;

   GuardedStatsCounter(StatsCounter var1) {
      this.delegate = Objects.requireNonNull(var1);
   }

   @Override
   public void recordHits(int var1) {
      try {
         this.delegate.recordHits(var1);
      } catch (Throwable var3) {
         logger.log(Level.WARNING, "Exception thrown by stats counter", var3);
      }
   }

   @Override
   public void recordMisses(int var1) {
      try {
         this.delegate.recordMisses(var1);
      } catch (Throwable var3) {
         logger.log(Level.WARNING, "Exception thrown by stats counter", var3);
      }
   }

   @Override
   public void recordLoadSuccess(long var1) {
      try {
         this.delegate.recordLoadSuccess(var1);
      } catch (Throwable var4) {
         logger.log(Level.WARNING, "Exception thrown by stats counter", var4);
      }
   }

   @Override
   public void recordLoadFailure(long var1) {
      try {
         this.delegate.recordLoadFailure(var1);
      } catch (Throwable var4) {
         logger.log(Level.WARNING, "Exception thrown by stats counter", var4);
      }
   }

   @Override
   public void recordEviction(int var1, RemovalCause var2) {
      Objects.requireNonNull(var2);

      try {
         this.delegate.recordEviction(var1, var2);
      } catch (Throwable var4) {
         logger.log(Level.WARNING, "Exception thrown by stats counter", var4);
      }
   }

   @Override
   public CacheStats snapshot() {
      try {
         return this.delegate.snapshot();
      } catch (Throwable var2) {
         logger.log(Level.WARNING, "Exception thrown by stats counter", var2);
         return CacheStats.empty();
      }
   }

   @Override
   public String toString() {
      return this.delegate.toString();
   }
}
