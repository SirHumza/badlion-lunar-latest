package com.github.benmanes.caffeine.cache;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface AsyncCache<K, V> {
   @Nullable CompletableFuture<V> getIfPresent(K var1);

   CompletableFuture<V> get(K var1, Function<? super K, ? extends V> var2);

   CompletableFuture<V> get(K var1, BiFunction<? super K, ? super Executor, ? extends CompletableFuture<? extends V>> var2);

   CompletableFuture<Map<K, V>> getAll(Iterable<? extends K> var1, Function<? super Set<? extends K>, ? extends Map<? extends K, ? extends V>> var2);

   CompletableFuture<Map<K, V>> getAll(
      Iterable<? extends K> var1,
      BiFunction<? super Set<? extends K>, ? super Executor, ? extends CompletableFuture<? extends Map<? extends K, ? extends V>>> var2
   );

   void put(K var1, CompletableFuture<? extends V> var2);

   ConcurrentMap<K, CompletableFuture<V>> asMap();

   Cache<K, V> synchronous();
}
