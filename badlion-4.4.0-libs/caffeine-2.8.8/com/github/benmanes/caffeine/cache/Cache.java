package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.CacheStats;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface Cache<K, V> {
   @Nullable V getIfPresent(@CompatibleWith("K") @NonNull Object var1);

   @Nullable V get(@NonNull K var1, @NonNull Function<? super K, ? extends V> var2);

   @NonNull Map<@NonNull K, @NonNull V> getAllPresent(@NonNull Iterable<@NonNull ?> var1);

   default @NonNull Map<K, V> getAll(
      @NonNull Iterable<? extends @NonNull K> keys, @NonNull Function<Iterable<? extends @NonNull K>, @NonNull Map<K, V>> mappingFunction
   ) {
      throw new UnsupportedOperationException();
   }

   void put(@NonNull K var1, @NonNull V var2);

   void putAll(@NonNull Map<? extends @NonNull K, ? extends @NonNull V> var1);

   void invalidate(@CompatibleWith("K") @NonNull Object var1);

   void invalidateAll(@NonNull Iterable<@NonNull ?> var1);

   void invalidateAll();

   @NonNegative long estimatedSize();

   @NonNull CacheStats stats();

   @NonNull ConcurrentMap<@NonNull K, @NonNull V> asMap();

   void cleanUp();

   @NonNull Policy<K, V> policy();
}
