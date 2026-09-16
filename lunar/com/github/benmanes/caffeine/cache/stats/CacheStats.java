package com.github.benmanes.caffeine.cache.stats;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.Nullable;

@Immutable
public final class CacheStats {
   private static final CacheStats EMPTY_STATS = of(0L, 0L, 0L, 0L, 0L, 0L, 0L);
   private final long hitCount;
   private final long missCount;
   private final long loadSuccessCount;
   private final long loadFailureCount;
   private final long totalLoadTime;
   private final long evictionCount;
   private final long evictionWeight;

   private CacheStats(
      @NonNegative long var1,
      @NonNegative long var3,
      @NonNegative long var5,
      @NonNegative long var7,
      @NonNegative long var9,
      @NonNegative long var11,
      @NonNegative long var13
   ) {
      if (var1 >= 0L && var3 >= 0L && var5 >= 0L && var7 >= 0L && var9 >= 0L && var11 >= 0L && var13 >= 0L) {
         this.hitCount = var1;
         this.missCount = var3;
         this.loadSuccessCount = var5;
         this.loadFailureCount = var7;
         this.totalLoadTime = var9;
         this.evictionCount = var11;
         this.evictionWeight = var13;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static CacheStats of(
      @NonNegative long var0,
      @NonNegative long var2,
      @NonNegative long var4,
      @NonNegative long var6,
      @NonNegative long var8,
      @NonNegative long var10,
      @NonNegative long var12
   ) {
      return new CacheStats(var0, var2, var4, var6, var8, var10, var12);
   }

   public static CacheStats empty() {
      return EMPTY_STATS;
   }

   public @NonNegative long requestCount() {
      return saturatedAdd(this.hitCount, this.missCount);
   }

   public @NonNegative long hitCount() {
      return this.hitCount;
   }

   public @NonNegative double hitRate() {
      long var1 = this.requestCount();
      return var1 == 0L ? 1.0 : (double)this.hitCount / var1;
   }

   public @NonNegative long missCount() {
      return this.missCount;
   }

   public @NonNegative double missRate() {
      long var1 = this.requestCount();
      return var1 == 0L ? 0.0 : (double)this.missCount / var1;
   }

   public @NonNegative long loadCount() {
      return saturatedAdd(this.loadSuccessCount, this.loadFailureCount);
   }

   public @NonNegative long loadSuccessCount() {
      return this.loadSuccessCount;
   }

   public @NonNegative long loadFailureCount() {
      return this.loadFailureCount;
   }

   public @NonNegative double loadFailureRate() {
      long var1 = saturatedAdd(this.loadSuccessCount, this.loadFailureCount);
      return var1 == 0L ? 0.0 : (double)this.loadFailureCount / var1;
   }

   public @NonNegative long totalLoadTime() {
      return this.totalLoadTime;
   }

   public @NonNegative double averageLoadPenalty() {
      long var1 = saturatedAdd(this.loadSuccessCount, this.loadFailureCount);
      return var1 == 0L ? 0.0 : (double)this.totalLoadTime / var1;
   }

   public @NonNegative long evictionCount() {
      return this.evictionCount;
   }

   public @NonNegative long evictionWeight() {
      return this.evictionWeight;
   }

   public CacheStats minus(CacheStats var1) {
      return of(
         Math.max(0L, this.hitCount - var1.hitCount),
         Math.max(0L, this.missCount - var1.missCount),
         Math.max(0L, this.loadSuccessCount - var1.loadSuccessCount),
         Math.max(0L, this.loadFailureCount - var1.loadFailureCount),
         Math.max(0L, this.totalLoadTime - var1.totalLoadTime),
         Math.max(0L, this.evictionCount - var1.evictionCount),
         Math.max(0L, this.evictionWeight - var1.evictionWeight)
      );
   }

   public CacheStats plus(CacheStats var1) {
      return of(
         saturatedAdd(this.hitCount, var1.hitCount),
         saturatedAdd(this.missCount, var1.missCount),
         saturatedAdd(this.loadSuccessCount, var1.loadSuccessCount),
         saturatedAdd(this.loadFailureCount, var1.loadFailureCount),
         saturatedAdd(this.totalLoadTime, var1.totalLoadTime),
         saturatedAdd(this.evictionCount, var1.evictionCount),
         saturatedAdd(this.evictionWeight, var1.evictionWeight)
      );
   }

   private static long saturatedAdd(long var0, long var2) {
      long var4 = var0 + var2;
      return (var0 ^ var2) < 0L | (var0 ^ var4) >= 0L ? var4 : Long.MAX_VALUE + (var4 >>> 63 ^ 1L);
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.hitCount, this.missCount, this.loadSuccessCount, this.loadFailureCount, this.totalLoadTime, this.evictionCount, this.evictionWeight
      );
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof CacheStats)) {
         return false;
      }

      CacheStats var2 = (CacheStats)var1;
      return this.hitCount == var2.hitCount
         && this.missCount == var2.missCount
         && this.loadSuccessCount == var2.loadSuccessCount
         && this.loadFailureCount == var2.loadFailureCount
         && this.totalLoadTime == var2.totalLoadTime
         && this.evictionCount == var2.evictionCount
         && this.evictionWeight == var2.evictionWeight;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + "{hitCount="
         + this.hitCount
         + ", missCount="
         + this.missCount
         + ", loadSuccessCount="
         + this.loadSuccessCount
         + ", loadFailureCount="
         + this.loadFailureCount
         + ", totalLoadTime="
         + this.totalLoadTime
         + ", evictionCount="
         + this.evictionCount
         + ", evictionWeight="
         + this.evictionWeight
         + "}";
   }
}
