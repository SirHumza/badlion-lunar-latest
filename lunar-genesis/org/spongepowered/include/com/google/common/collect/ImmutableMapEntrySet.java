package org.spongepowered.include.com.google.common.collect;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.j2objc.annotations.Weak;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Entry<K, V>> {
   abstract ImmutableMap<K, V> map();

   @Override
   public int size() {
      return this.map().size();
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      if (!(var1 instanceof Entry)) {
         return false;
      }

      Entry var2 = (Entry)var1;
      Object var3 = this.map().get(var2.getKey());
      return var3 != null && var3.equals(var2.getValue());
   }

   @Override
   boolean isHashCodeFast() {
      return this.map().isHashCodeFast();
   }

   @Override
   public int hashCode() {
      return this.map().hashCode();
   }

   static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {
      @Weak
      private final transient ImmutableMap<K, V> map;
      private final transient Entry<K, V>[] entries;

      RegularEntrySet(ImmutableMap<K, V> var1, Entry<K, V>[] var2) {
         this.map = var1;
         this.entries = var2;
      }

      @Override
      ImmutableMap<K, V> map() {
         return this.map;
      }

      @Override
      public UnmodifiableIterator<Entry<K, V>> iterator() {
         return Iterators.forArray(this.entries);
      }

      @Override
      public Spliterator<Entry<K, V>> spliterator() {
         return Spliterators.spliterator(this.entries, 1297);
      }

      @Override
      public void forEach(Consumer<? super Entry<K, V>> var1) {
         Preconditions.checkNotNull(var1);

         for (Entry var5 : this.entries) {
            var1.accept(var5);
         }
      }

      @Override
      ImmutableList<Entry<K, V>> createAsList() {
         return new RegularImmutableAsList<>(this, this.entries);
      }
   }
}
