package org.spongepowered.include.com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
   private transient Set<K> keySet;
   private transient Map<K, Collection<V>> asMap;

   @CanIgnoreReturnValue
   @Override
   public boolean put(@Nullable K var1, @Nullable V var2) {
      return this.get((K)var1).add((V)var2);
   }

   public Set<K> keySet() {
      Set var1 = this.keySet;
      return var1 == null ? (this.keySet = this.createKeySet()) : var1;
   }

   Set<K> createKeySet() {
      return new Maps.KeySet<>(this.asMap());
   }

   @Override
   public Map<K, Collection<V>> asMap() {
      Map var1 = this.asMap;
      return var1 == null ? (this.asMap = this.createAsMap()) : var1;
   }

   abstract Map<K, Collection<V>> createAsMap();

   @Override
   public boolean equals(@Nullable Object var1) {
      return Multimaps.equalsImpl(this, var1);
   }

   @Override
   public int hashCode() {
      return this.asMap().hashCode();
   }

   @Override
   public String toString() {
      return this.asMap().toString();
   }
}
