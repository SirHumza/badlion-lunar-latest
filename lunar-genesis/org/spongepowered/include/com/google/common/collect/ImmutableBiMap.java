package org.spongepowered.include.com.google.common.collect;

import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public abstract class ImmutableBiMap<K, V> extends ImmutableBiMapFauxverideShim<K, V> implements BiMap<K, V> {
   public static <K, V> ImmutableBiMap<K, V> of() {
      return (ImmutableBiMap<K, V>)RegularImmutableBiMap.EMPTY;
   }

   public static <K, V> ImmutableBiMap<K, V> of(K var0, V var1) {
      return new SingletonImmutableBiMap<>((K)var0, (V)var1);
   }

   ImmutableBiMap() {
   }

   public abstract ImmutableBiMap<V, K> inverse();

   public ImmutableSet<V> values() {
      return this.inverse().keySet();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public V forcePut(K var1, V var2) {
      throw new UnsupportedOperationException();
   }
}
