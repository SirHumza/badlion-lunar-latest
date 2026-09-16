package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.CacheStats;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

interface LocalManualCache<K, V> extends Cache<K, V> {
   LocalCache<K, V> cache();

   @Override
   default long estimatedSize() {
      return this.cache().estimatedSize();
   }

   @Override
   default void cleanUp() {
      this.cache().cleanUp();
   }

   @Override
   default @Nullable V getIfPresent(K var1) {
      return this.cache().getIfPresent((K)var1, true);
   }

   @Override
   default @Nullable V get(K var1, Function<? super K, ? extends V> var2) {
      return this.cache().computeIfAbsent((K)var1, var2);
   }

   @Override
   default Map<K, V> getAllPresent(Iterable<? extends K> var1) {
      return this.cache().getAllPresent(var1);
   }

   @Override
   default Map<K, V> getAll(Iterable<? extends K> var1, Function<? super Set<? extends K>, ? extends Map<? extends K, ? extends V>> var2) {
      Objects.requireNonNull(var2);
      Map var3 = this.cache().getAllPresent(var1);
      int var4 = Caffeine.calculateHashMapCapacity(var1);
      LinkedHashMap var5 = new LinkedHashMap(var4);
      LinkedHashSet var6 = new LinkedHashSet(var4);

      for (Object var8 : var1) {
         Object var9 = var3.get(var8);
         if (var9 == null) {
            var6.add(var8);
         }

         var5.put(var8, var9);
      }

      if (var6.isEmpty()) {
         return var3;
      }

      this.bulkLoad(var6, var5, var2);
      return Collections.unmodifiableMap(var5);
   }

   default void bulkLoad(Set<K> var1, Map<K, V> var2, Function<? super Set<? extends K>, ? extends Map<? extends K, ? extends V>> var3) {
      boolean var4 = false;
      long var5 = this.cache().statsTicker().read();

      try {
         Map var7 = (Map)var3.apply(Collections.unmodifiableSet(var1));
         var7.forEach(this.cache()::put);

         for (Object var9 : var1) {
            Object var10 = var7.get(var9);
            if (var10 == null) {
               var2.remove(var9);
            } else {
               var2.put(var9, var10);
            }
         }

         var4 = !var7.isEmpty();
      } finally {
         long var12 = this.cache().statsTicker().read() - var5;
         if (var4) {
            this.cache().statsCounter().recordLoadSuccess(var12);
         } else {
            this.cache().statsCounter().recordLoadFailure(var12);
         }
      }
   }

   @Override
   default void put(K var1, V var2) {
      this.cache().put((K)var1, (V)var2);
   }

   @Override
   default void putAll(Map<? extends K, ? extends V> var1) {
      this.cache().putAll(var1);
   }

   @Override
   default void invalidate(K var1) {
      this.cache().remove(var1);
   }

   @Override
   default void invalidateAll(Iterable<? extends K> var1) {
      this.cache().invalidateAll(var1);
   }

   @Override
   default void invalidateAll() {
      this.cache().clear();
   }

   @Override
   default CacheStats stats() {
      return this.cache().statsCounter().snapshot();
   }

   @Override
   default ConcurrentMap<K, V> asMap() {
      return this.cache();
   }
}
