package com.github.benmanes.caffeine.cache;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.NonNull;

@FunctionalInterface
public interface AsyncCacheLoader<K, V> {
   @NonNull CompletableFuture<V> asyncLoad(@NonNull K var1, @NonNull Executor var2);

   default @NonNull CompletableFuture<Map<@NonNull K, @NonNull V>> asyncLoadAll(@NonNull Iterable<? extends @NonNull K> keys, @NonNull Executor executor) {
      throw new UnsupportedOperationException();
   }

   default @NonNull CompletableFuture<V> asyncReload(@NonNull K key, @NonNull V oldValue, @NonNull Executor executor) {
      return this.asyncLoad(key, executor);
   }
}
