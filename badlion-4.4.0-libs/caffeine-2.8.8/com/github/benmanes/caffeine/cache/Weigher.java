package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;

@FunctionalInterface
public interface Weigher<K, V> {
   @NonNegative int weigh(@NonNull K var1, @NonNull V var2);

   static <K, V> @NonNull Weigher<K, V> singletonWeigher() {
      return SingletonWeigher.INSTANCE;
   }

   static <K, V> @NonNull Weigher<K, V> boundedWeigher(@NonNull Weigher<K, V> delegate) {
      return new BoundedWeigher<>(delegate);
   }
}
