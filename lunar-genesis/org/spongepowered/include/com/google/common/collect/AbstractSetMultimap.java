package org.spongepowered.include.com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
   protected AbstractSetMultimap(Map<K, Collection<V>> var1) {
      super(var1);
   }

   abstract Set<V> createCollection();

   Set<V> createUnmodifiableEmptyCollection() {
      return ImmutableSet.of();
   }

   @Override
   public Set<V> get(@Nullable K var1) {
      return (Set<V>)super.get((K)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public Set<V> removeAll(@Nullable Object var1) {
      return (Set<V>)super.removeAll(var1);
   }

   @Override
   public Map<K, Collection<V>> asMap() {
      return super.asMap();
   }

   @CanIgnoreReturnValue
   @Override
   public boolean put(@Nullable K var1, @Nullable V var2) {
      return super.put((K)var1, (V)var2);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return super.equals(var1);
   }
}
