package com.github.benmanes.caffeine.cache;

import java.util.Objects;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.ConcurrentMap;

final class WriteThroughEntry<K, V> extends SimpleEntry<K, V> {
   private static final long serialVersionUID = 1L;
   private final ConcurrentMap<K, V> map;

   WriteThroughEntry(ConcurrentMap<K, V> var1, K var2, V var3) {
      super((K)var2, (V)var3);
      this.map = Objects.requireNonNull(var1);
   }

   @Override
   public V setValue(V var1) {
      this.map.put(this.getKey(), (V)var1);
      return super.setValue((V)var1);
   }

   Object writeReplace() {
      return new SimpleEntry<>(this);
   }
}
