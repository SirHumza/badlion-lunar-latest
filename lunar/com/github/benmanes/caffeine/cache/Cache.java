package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.CacheStats;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.PolyNull;

public interface Cache<K, V> {
   @Nullable V getIfPresent(K var1);

   @PolyNull V get(K var1, Function<? super K, ? extends @PolyNull V> var2);

   Map<K, V> getAllPresent(Iterable<? extends K> var1);

   Map<K, V> getAll(Iterable<? extends K> var1, Function<? super Set<? extends K>, ? extends Map<? extends K, ? extends V>> var2);

   void put(K var1, V var2);

   void putAll(Map<? extends K, ? extends V> var1);

   void invalidate(K var1);

   void invalidateAll(Iterable<? extends K> var1);

   void invalidateAll();

   @NonNegative long estimatedSize();

   CacheStats stats();

   ConcurrentMap<K, V> asMap();

   void cleanUp();

   Policy<K, V> policy();
}
