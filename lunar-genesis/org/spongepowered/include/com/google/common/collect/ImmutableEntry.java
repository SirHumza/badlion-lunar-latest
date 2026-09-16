package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import javax.annotation.Nullable;

class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {
   final K key;
   final V value;

   ImmutableEntry(@Nullable K var1, @Nullable V var2) {
      this.key = (K)var1;
      this.value = (V)var2;
   }

   @Nullable
   @Override
   public final K getKey() {
      return this.key;
   }

   @Nullable
   @Override
   public final V getValue() {
      return this.value;
   }

   @Override
   public final V setValue(V var1) {
      throw new UnsupportedOperationException();
   }
}
