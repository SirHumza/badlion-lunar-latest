package com.github.benmanes.caffeine.cache;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface LoadingCache<K, V> extends Cache<K, V> {
   V get(K var1);

   Map<K, V> getAll(Iterable<? extends K> var1);

   @CanIgnoreReturnValue
   CompletableFuture<V> refresh(K var1);

   @CanIgnoreReturnValue
   CompletableFuture<Map<K, V>> refreshAll(Iterable<? extends K> var1);
}
