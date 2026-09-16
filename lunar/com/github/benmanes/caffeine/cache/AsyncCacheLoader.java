package com.github.benmanes.caffeine.cache;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
public interface AsyncCacheLoader<K, V> {
   CompletableFuture<? extends V> asyncLoad(K var1, Executor var2);

   default CompletableFuture<? extends Map<? extends K, ? extends V>> asyncLoadAll(Set<? extends K> var1, Executor var2) {
      throw new UnsupportedOperationException();
   }

   default CompletableFuture<? extends V> asyncReload(K var1, V var2, Executor var3) {
      return this.asyncLoad((K)var1, var3);
   }

   static <K, V> AsyncCacheLoader<K, V> bulk(Function<? super Set<? extends K>, ? extends Map<? extends K, ? extends V>> var0) {
      return CacheLoader.bulk(var0);
   }

   static <K, V> AsyncCacheLoader<K, V> bulk(
      final BiFunction<? super Set<? extends K>, ? super Executor, ? extends CompletableFuture<? extends Map<? extends K, ? extends V>>> var0
   ) {
      return new AsyncCacheLoader<K, V>() {
         @Override
         public CompletableFuture<V> asyncLoad(K var1, Executor var2) {
            return this.asyncLoadAll(Set.of((K)var1), var2).thenApply(var1x -> (V)var1x.get(var1));
         }

         @Override
         public CompletableFuture<Map<K, V>> asyncLoadAll(Set<? extends K> var1, Executor var2) {
            Objects.requireNonNull(var1);
            Objects.requireNonNull(var2);
            return (CompletableFuture<Map<K, V>>)var0.apply(var1, var2);
         }
      };
   }
}
