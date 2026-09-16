package org.spongepowered.include.com.google.common.collect;

import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Objects;

abstract class AbstractMapEntry<K, V> implements Entry<K, V> {
   @Override
   public abstract K getKey();

   @Override
   public abstract V getValue();

   @Override
   public V setValue(V var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (!(var1 instanceof Entry)) {
         return false;
      }

      Entry var2 = (Entry)var1;
      return Objects.equal(this.getKey(), var2.getKey()) && Objects.equal(this.getValue(), var2.getValue());
   }

   @Override
   public int hashCode() {
      Object var1 = this.getKey();
      Object var2 = this.getValue();
      return (var1 == null ? 0 : var1.hashCode()) ^ (var2 == null ? 0 : var2.hashCode());
   }

   @Override
   public String toString() {
      return this.getKey() + "=" + this.getValue();
   }
}
