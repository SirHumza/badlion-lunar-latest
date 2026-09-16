package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.index.qual.NonNegative;

@FunctionalInterface
public interface Weigher<K, V> {
   @NonNegative int weigh(K var1, V var2);

   static <K, V> Weigher<K, V> singletonWeigher() {
      return SingletonWeigher.INSTANCE;
   }

   static <K, V> Weigher<K, V> boundedWeigher(Weigher<K, V> var0) {
      return new BoundedWeigher<>(var0);
   }
}
