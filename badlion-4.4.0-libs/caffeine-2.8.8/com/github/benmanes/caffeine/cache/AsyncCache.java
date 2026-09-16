package com.github.benmanes.caffeine.cache;

import com.google.errorprone.annotations.CompatibleWith;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface AsyncCache<K, V> {
   @Nullable CompletableFuture<V> getIfPresent(@CompatibleWith("K") @NonNull Object var1);

   @NonNull CompletableFuture<V> get(@NonNull K var1, @NonNull Function<? super K, ? extends V> var2);

   @NonNull CompletableFuture<V> get(@NonNull K var1, @NonNull BiFunction<? super K, Executor, CompletableFuture<V>> var2);

   default @NonNull CompletableFuture<Map<K, V>> getAll(
      @NonNull Iterable<? extends @NonNull K> keys, @NonNull Function<Iterable<? extends @NonNull K>, @NonNull Map<K, V>> mappingFunction
   ) {
      throw new UnsupportedOperationException();
   }

   default @NonNull CompletableFuture<Map<K, V>> getAll(
      @NonNull Iterable<? extends @NonNull K> keys, @NonNull BiFunction<Iterable<? extends @NonNull K>, Executor, CompletableFuture<Map<K, V>>> mappingFunction
   ) {
      throw new UnsupportedOperationException();
   }

   void put(@NonNull K var1, @NonNull CompletableFuture<V> var2);

   @NonNull ConcurrentMap<@NonNull K, @NonNull CompletableFuture<V>> asMap();

   @NonNull Cache<K, V> synchronous();
}
