package org.spongepowered.include.com.google.common.collect;

import java.util.Spliterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.j2objc.annotations.Weak;

final class ImmutableMapKeySet<K, V> extends ImmutableSet.Indexed<K> {
   @Weak
   private final ImmutableMap<K, V> map;

   ImmutableMapKeySet(ImmutableMap<K, V> var1) {
      this.map = var1;
   }

   @Override
   public int size() {
      return this.map.size();
   }

   @Override
   public UnmodifiableIterator<K> iterator() {
      return this.map.keyIterator();
   }

   @Override
   public Spliterator<K> spliterator() {
      return this.map.keySpliterator();
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      return this.map.containsKey(var1);
   }

   @Override
   K get(int var1) {
      return this.map.entrySet().asList().get(var1).getKey();
   }

   @Override
   public void forEach(Consumer<? super K> var1) {
      Preconditions.checkNotNull(var1);
      this.map.forEach((var1x, var2) -> var1.accept(var1x));
   }
}
