package com.github.benmanes.caffeine.cache;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface AsyncLoadingCache<K, V> extends AsyncCache<K, V> {
   CompletableFuture<V> get(K var1);

   CompletableFuture<Map<K, V>> getAll(Iterable<? extends K> var1);

   LoadingCache<K, V> synchronous();
}
