package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.StatsCounter;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

interface LocalCache<K, V> extends ConcurrentMap<K, V> {
   boolean isAsync();

   boolean isRecordingStats();

   StatsCounter statsCounter();

   void notifyRemoval(@Nullable K var1, @Nullable V var2, RemovalCause var3);

   Executor executor();

   ConcurrentMap<Object, CompletableFuture<?>> refreshes();

   @Nullable Expiry<K, V> expiry();

   Ticker statsTicker();

   long estimatedSize();

   Object referenceKey(K var1);

   boolean isPendingEviction(K var1);

   @Nullable V getIfPresent(K var1, boolean var2);

   @Nullable V getIfPresentQuietly(K var1);

   Map<K, V> getAllPresent(Iterable<? extends K> var1);

   boolean replace(K var1, V var2, V var3, boolean var4);

   @Override
   default @Nullable V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
      return this.compute((K)var1, var2, this.expiry(), true, true);
   }

   @Nullable V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2, @Nullable Expiry<? super K, ? super V> var3, boolean var4, boolean var5);

   @Override
   default @Nullable V computeIfAbsent(K var1, Function<? super K, ? extends V> var2) {
      return this.computeIfAbsent((K)var1, var2, true, true);
   }

   @Nullable V computeIfAbsent(K var1, Function<? super K, ? extends V> var2, boolean var3, boolean var4);

   default void invalidateAll(Iterable<?> var1) {
      for (Object var3 : var1) {
         this.remove(var3);
      }
   }

   void cleanUp();

   default void notifyOnReplace(K var1, V var2, V var3) {
      if (var2 != null && var2 != var3) {
         if (this.isAsync()) {
            CompletableFuture var4 = (CompletableFuture)var2;
            CompletableFuture var5 = (CompletableFuture)var3;
            var5.whenCompleteAsync((var4x, var5x) -> {
               if (var5x == null) {
                  var4.thenAcceptAsync(var4xx -> {
                     if (var4x != var4xx) {
                        this.notifyRemoval((K)var1, (V)var2, RemovalCause.REPLACED);
                     }
                  }, this.executor());
               } else {
                  this.notifyRemoval((K)var1, (V)var2, RemovalCause.REPLACED);
               }
            }, this.executor());
         } else {
            this.notifyRemoval((K)var1, (V)var2, RemovalCause.REPLACED);
         }
      }
   }

   default <T, R> Function<? super T, ? extends R> statsAware(Function<? super T, ? extends R> var1, boolean var2) {
      return !this.isRecordingStats() ? var1 : var3 -> {
         this.statsCounter().recordMisses(1);
         long var5 = this.statsTicker().read();

         Object var4;
         try {
            var4 = var1.apply((T)var3);
         } catch (RuntimeException | Error var9) {
            this.statsCounter().recordLoadFailure(this.statsTicker().read() - var5);
            throw var9;
         }

         long var7 = this.statsTicker().read() - var5;
         if (var2) {
            if (var4 == null) {
               this.statsCounter().recordLoadFailure(var7);
            } else {
               this.statsCounter().recordLoadSuccess(var7);
            }
         }

         return (R)var4;
      };
   }

   default <T, U, R> BiFunction<? super T, ? super U, ? extends R> statsAware(BiFunction<? super T, ? super U, ? extends R> var1) {
      return this.statsAware(var1, true, true);
   }

   default <T, U, R> BiFunction<? super T, ? super U, ? extends R> statsAware(BiFunction<? super T, ? super U, ? extends R> var1, boolean var2, boolean var3) {
      return !this.isRecordingStats() ? var1 : (var4, var5) -> {
         long var7 = this.statsTicker().read();

         Object var6;
         try {
            var6 = var1.apply((T)var4, (U)var5);
         } catch (RuntimeException | Error var11) {
            if (var3) {
               this.statsCounter().recordLoadFailure(this.statsTicker().read() - var7);
            }

            throw var11;
         }

         long var9 = this.statsTicker().read() - var7;
         if (var2) {
            if (var6 == null) {
               this.statsCounter().recordLoadFailure(var9);
            } else {
               this.statsCounter().recordLoadSuccess(var9);
            }
         }

         return (R)var6;
      };
   }
}
