package com.github.benmanes.caffeine.cache;

import java.io.Serializable;
import java.time.Duration;
import org.checkerframework.checker.nullness.qual.Nullable;

final class SerializationProxy<K, V> implements Serializable {
   private static final long serialVersionUID = 1L;
   boolean async;
   boolean weakKeys;
   boolean weakValues;
   boolean softValues;
   boolean isRecordingStats;
   long refreshAfterWriteNanos;
   long expiresAfterWriteNanos;
   long expiresAfterAccessNanos;
   long maximumSize = -1L;
   long maximumWeight = -1L;
   @Nullable Ticker ticker;
   @Nullable Expiry<?, ?> expiry;
   @Nullable Weigher<?, ?> weigher;
   @Nullable AsyncCacheLoader<?, ?> cacheLoader;
   @Nullable RemovalListener<?, ?> removalListener;
   @Nullable RemovalListener<?, ?> evictionListener;

   Caffeine<Object, Object> recreateCaffeine() {
      Caffeine var1 = Caffeine.newBuilder();
      if (this.ticker != null) {
         var1.ticker(this.ticker);
      }

      if (this.isRecordingStats) {
         var1.recordStats();
      }

      if (this.maximumSize != -1L) {
         var1.maximumSize(this.maximumSize);
      }

      if (this.weigher != null) {
         Weigher var2 = this.weigher;
         var1.maximumWeight(this.maximumWeight);
         var1.weigher(var2);
      }

      if (this.expiry != null) {
         var1.expireAfter(this.expiry);
      }

      if (this.expiresAfterWriteNanos > 0L) {
         var1.expireAfterWrite(Duration.ofNanos(this.expiresAfterWriteNanos));
      }

      if (this.expiresAfterAccessNanos > 0L) {
         var1.expireAfterAccess(Duration.ofNanos(this.expiresAfterAccessNanos));
      }

      if (this.refreshAfterWriteNanos > 0L) {
         var1.refreshAfterWrite(Duration.ofNanos(this.refreshAfterWriteNanos));
      }

      if (this.weakKeys) {
         var1.weakKeys();
      }

      if (this.weakValues) {
         var1.weakValues();
      }

      if (this.softValues) {
         var1.softValues();
      }

      if (this.removalListener != null) {
         var1.removalListener(this.removalListener);
      }

      if (this.evictionListener != null) {
         var1.evictionListener(this.evictionListener);
      }

      return var1;
   }

   Object readResolve() {
      Caffeine var1 = this.recreateCaffeine();
      if (this.async) {
         if (this.cacheLoader == null) {
            return var1.buildAsync();
         }

         AsyncCacheLoader var3 = this.cacheLoader;
         return var1.buildAsync(var3);
      } else {
         if (this.cacheLoader == null) {
            return var1.build();
         }

         CacheLoader var2 = (CacheLoader)this.cacheLoader;
         return var1.build(var2);
      }
   }
}
