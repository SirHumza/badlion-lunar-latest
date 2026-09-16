package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.CacheStats;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.NonNull;
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
   default @Nullable V getIfPresent(Object key) {
      return this.cache().getIfPresent(key, true);
   }

   @Override
   default @Nullable V get(K key, Function<? super K, ? extends V> mappingFunction) {
      return this.cache().computeIfAbsent(key, mappingFunction);
   }

   @Override
   default Map<K, V> getAllPresent(Iterable<?> keys) {
      return this.cache().getAllPresent(keys);
   }

   @Override
   default Map<K, V> getAll(Iterable<? extends K> keys, Function<Iterable<? extends K>, Map<K, V>> mappingFunction) {
      Objects.requireNonNull(mappingFunction);
      Set<K> keysToLoad = new LinkedHashSet<>();
      Map<K, V> found = this.cache().getAllPresent(keys);
      Map<K, V> result = new LinkedHashMap<>(found.size());

      for (K key : keys) {
         V value = found.get(key);
         if (value == null) {
            keysToLoad.add(key);
         }

         result.put(key, value);
      }

      if (keysToLoad.isEmpty()) {
         return found;
      }

      this.bulkLoad(keysToLoad, result, mappingFunction);
      return Collections.unmodifiableMap(result);
   }

   default void bulkLoad(Set<K> keysToLoad, Map<K, V> result, Function<Iterable<? extends @NonNull K>, @NonNull Map<K, V>> mappingFunction) {
      boolean success = false;
      long startTime = this.cache().statsTicker().read();

      try {
         Map<K, V> loaded = mappingFunction.apply(keysToLoad);
         loaded.forEach((keyx, valuex) -> this.cache().put((K)keyx, (V)valuex, false));

         for (K key : keysToLoad) {
            V value = loaded.get(key);
            if (value == null) {
               result.remove(key);
            } else {
               result.put(key, value);
            }
         }

         success = !loaded.isEmpty();
      } catch (RuntimeException e) {
         throw e;
      } catch (Exception e) {
         throw new CompletionException(e);
      } finally {
         long loadTime = this.cache().statsTicker().read() - startTime;
         if (success) {
            this.cache().statsCounter().recordLoadSuccess(loadTime);
         } else {
            this.cache().statsCounter().recordLoadFailure(loadTime);
         }
      }
   }

   @Override
   default void put(K key, V value) {
      this.cache().put(key, value);
   }

   @Override
   default void putAll(Map<? extends K, ? extends V> map) {
      this.cache().putAll(map);
   }

   @Override
   default void invalidate(Object key) {
      this.cache().remove(key);
   }

   @Override
   default void invalidateAll(Iterable<?> keys) {
      this.cache().invalidateAll(keys);
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
