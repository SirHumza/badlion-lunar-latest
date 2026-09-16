package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Spliterator;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.spongepowered.include.com.google.errorprone.annotations.concurrent.LazyInit;

public abstract class ImmutableMap<K, V> implements Serializable, Map<K, V> {
   static final Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Entry[0];
   @LazyInit
   private transient ImmutableSet<Entry<K, V>> entrySet;
   @LazyInit
   private transient ImmutableSet<K> keySet;
   @LazyInit
   private transient ImmutableCollection<V> values;

   public static <K, V> ImmutableMap<K, V> of() {
      return ImmutableBiMap.of();
   }

   public static <K, V> ImmutableMap<K, V> of(K var0, V var1) {
      return ImmutableBiMap.of((K)var0, (V)var1);
   }

   static <K, V> ImmutableMapEntry<K, V> entryOf(K var0, V var1) {
      return new ImmutableMapEntry<>((K)var0, (V)var1);
   }

   public static <K, V> ImmutableMap.Builder<K, V> builder() {
      return new ImmutableMap.Builder<>();
   }

   static void checkNoConflict(boolean var0, String var1, Entry<?, ?> var2, Entry<?, ?> var3) {
      if (!var0) {
         throw new IllegalArgumentException("Multiple entries with same " + var1 + ": " + var2 + " and " + var3);
      }
   }

   ImmutableMap() {
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final V put(K var1, V var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final V putIfAbsent(K var1, V var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final boolean replace(K var1, V var2, V var3) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V replace(K var1, V var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V computeIfAbsent(K var1, Function<? super K, ? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V computeIfPresent(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V merge(K var1, V var2, BiFunction<? super V, ? super V, ? extends V> var3) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void putAll(Map<? extends K, ? extends V> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final boolean remove(Object var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.get(var1) != null;
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return this.values().contains(var1);
   }

   @Override
   public abstract V get(@Nullable Object var1);

   @Override
   public final V getOrDefault(@Nullable Object var1, @Nullable V var2) {
      Object var3 = this.get(var1);
      return (V)(var3 != null ? var3 : var2);
   }

   public ImmutableSet<Entry<K, V>> entrySet() {
      ImmutableSet var1 = this.entrySet;
      return var1 == null ? (this.entrySet = this.createEntrySet()) : var1;
   }

   abstract ImmutableSet<Entry<K, V>> createEntrySet();

   public ImmutableSet<K> keySet() {
      ImmutableSet var1 = this.keySet;
      return var1 == null ? (this.keySet = this.createKeySet()) : var1;
   }

   ImmutableSet<K> createKeySet() {
      return this.isEmpty() ? ImmutableSet.of() : new ImmutableMapKeySet<>(this);
   }

   UnmodifiableIterator<K> keyIterator() {
      final UnmodifiableIterator var1 = this.entrySet().iterator();
      return new UnmodifiableIterator<K>() {
         @Override
         public boolean hasNext() {
            return var1.hasNext();
         }

         @Override
         public K next() {
            return (K)((Entry)var1.next()).getKey();
         }
      };
   }

   Spliterator<K> keySpliterator() {
      return CollectSpliterators.map(this.entrySet().spliterator(), Entry::getKey);
   }

   public ImmutableCollection<V> values() {
      ImmutableCollection var1 = this.values;
      return var1 == null ? (this.values = this.createValues()) : var1;
   }

   ImmutableCollection<V> createValues() {
      return new ImmutableMapValues<>(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return Maps.equalsImpl(this, var1);
   }

   @Override
   public int hashCode() {
      return Sets.hashCodeImpl(this.entrySet());
   }

   boolean isHashCodeFast() {
      return false;
   }

   @Override
   public String toString() {
      return Maps.toStringImpl(this);
   }

   public static class Builder<K, V> {
      Comparator<? super V> valueComparator;
      ImmutableMapEntry<K, V>[] entries;
      int size;
      boolean entriesUsed;

      public Builder() {
         this(4);
      }

      Builder(int var1) {
         this.entries = new ImmutableMapEntry[var1];
         this.size = 0;
         this.entriesUsed = false;
      }

      private void ensureCapacity(int var1) {
         if (var1 > this.entries.length) {
            this.entries = Arrays.copyOf(this.entries, ImmutableCollection.Builder.expandedCapacity(this.entries.length, var1));
            this.entriesUsed = false;
         }
      }

      @CanIgnoreReturnValue
      public ImmutableMap.Builder<K, V> put(K var1, V var2) {
         this.ensureCapacity(this.size + 1);
         ImmutableMapEntry var3 = ImmutableMap.entryOf(var1, var2);
         this.entries[this.size++] = var3;
         return this;
      }

      public ImmutableMap<K, V> build() {
         switch (this.size) {
            case 0:
               return ImmutableMap.of();
            case 1:
               return ImmutableMap.of(this.entries[0].getKey(), this.entries[0].getValue());
            default:
               if (this.valueComparator != null) {
                  if (this.entriesUsed) {
                     this.entries = Arrays.copyOf(this.entries, this.size);
                  }

                  Arrays.sort(this.entries, 0, this.size, Ordering.from(this.valueComparator).onResultOf(Maps.valueFunction()));
               }

               this.entriesUsed = this.size == this.entries.length;
               return RegularImmutableMap.fromEntryArray(this.size, this.entries);
         }
      }
   }
}
