package org.spongepowered.include.com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
   protected AbstractListMultimap(Map<K, Collection<V>> var1) {
      super(var1);
   }

   abstract List<V> createCollection();

   List<V> createUnmodifiableEmptyCollection() {
      return ImmutableList.of();
   }

   @Override
   public List<V> get(@Nullable K var1) {
      return (List<V>)super.get((K)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public List<V> removeAll(@Nullable Object var1) {
      return (List<V>)super.removeAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean put(@Nullable K var1, @Nullable V var2) {
      return super.put((K)var1, (V)var2);
   }

   @Override
   public Map<K, Collection<V>> asMap() {
      return super.asMap();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return super.equals(var1);
   }
}
