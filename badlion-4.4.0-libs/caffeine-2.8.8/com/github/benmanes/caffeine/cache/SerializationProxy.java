package com.github.benmanes.caffeine.cache;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
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
   @Nullable CacheWriter<?, ?> writer;
   @Nullable AsyncCacheLoader<?, ?> loader;
   @Nullable RemovalListener<?, ?> removalListener;

   Caffeine<Object, Object> recreateCaffeine() {
      Caffeine<Object, Object> builder = Caffeine.newBuilder();
      if (this.ticker != null) {
         builder.ticker(this.ticker);
      }

      if (this.isRecordingStats) {
         builder.recordStats();
      }

      if (this.maximumSize != -1L) {
         builder.maximumSize(this.maximumSize);
      }

      if (this.weigher != null) {
         builder.maximumWeight(this.maximumWeight);
         builder.weigher(this.weigher);
      }

      if (this.expiry != null) {
         builder.expireAfter(this.expiry);
      }

      if (this.expiresAfterWriteNanos > 0L) {
         builder.expireAfterWrite(this.expiresAfterWriteNanos, TimeUnit.NANOSECONDS);
      }

      if (this.expiresAfterAccessNanos > 0L) {
         builder.expireAfterAccess(this.expiresAfterAccessNanos, TimeUnit.NANOSECONDS);
      }

      if (this.refreshAfterWriteNanos > 0L) {
         builder.refreshAfterWrite(this.refreshAfterWriteNanos, TimeUnit.NANOSECONDS);
      }

      if (this.weakKeys) {
         builder.weakKeys();
      }

      if (this.weakValues) {
         builder.weakValues();
      }

      if (this.softValues) {
         builder.softValues();
      }

      if (this.removalListener != null) {
         builder.removalListener(this.removalListener);
      }

      if (this.writer != null && this.writer != CacheWriter.disabledWriter()) {
         builder.writer(this.writer);
      }

      return builder;
   }

   Object readResolve() {
      Caffeine<Object, Object> builder = this.recreateCaffeine();
      if (this.async) {
         if (this.loader == null) {
            return builder.buildAsync();
         }

         AsyncCacheLoader<K, V> cacheLoader = (AsyncCacheLoader<K, V>)this.loader;
         return builder.buildAsync(cacheLoader);
      } else {
         if (this.loader == null) {
            return builder.build();
         }

         CacheLoader<K, V> cacheLoader = (CacheLoader<K, V>)this.loader;
         return builder.build(cacheLoader);
      }
   }
}
