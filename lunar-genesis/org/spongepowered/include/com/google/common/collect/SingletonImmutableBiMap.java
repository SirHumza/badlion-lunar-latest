package org.spongepowered.include.com.google.common.collect;

import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.concurrent.LazyInit;
import org.spongepowered.include.com.google.j2objc.annotations.RetainedWith;

final class SingletonImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
   final transient K singleKey;
   final transient V singleValue;
   @LazyInit
   @RetainedWith
   transient ImmutableBiMap<V, K> inverse;

   SingletonImmutableBiMap(K var1, V var2) {
      CollectPreconditions.checkEntryNotNull(var1, var2);
      this.singleKey = (K)var1;
      this.singleValue = (V)var2;
   }

   private SingletonImmutableBiMap(K var1, V var2, ImmutableBiMap<V, K> var3) {
      this.singleKey = (K)var1;
      this.singleValue = (V)var2;
      this.inverse = var3;
   }

   @Override
   public V get(@Nullable Object var1) {
      return this.singleKey.equals(var1) ? this.singleValue : null;
   }

   @Override
   public int size() {
      return 1;
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      Preconditions.checkNotNull(var1).accept(this.singleKey, this.singleValue);
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.singleKey.equals(var1);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return this.singleValue.equals(var1);
   }

   @Override
   ImmutableSet<Entry<K, V>> createEntrySet() {
      return ImmutableSet.of(Maps.immutableEntry(this.singleKey, this.singleValue));
   }

   @Override
   ImmutableSet<K> createKeySet() {
      return ImmutableSet.of(this.singleKey);
   }

   @Override
   public ImmutableBiMap<V, K> inverse() {
      ImmutableBiMap var1 = this.inverse;
      return var1 == null ? (this.inverse = new SingletonImmutableBiMap<>(this.singleValue, this.singleKey, this)) : var1;
   }
}
