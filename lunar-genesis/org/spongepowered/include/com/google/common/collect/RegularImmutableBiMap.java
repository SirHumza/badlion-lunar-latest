package org.spongepowered.include.com.google.common.collect;

import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.concurrent.LazyInit;
import org.spongepowered.include.com.google.j2objc.annotations.RetainedWith;

class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
   static final RegularImmutableBiMap<Object, Object> EMPTY = new RegularImmutableBiMap<>(
      null, null, (Entry<Object, Object>[])ImmutableMap.EMPTY_ENTRY_ARRAY, 0, 0
   );
   private final transient ImmutableMapEntry<K, V>[] keyTable;
   private final transient ImmutableMapEntry<K, V>[] valueTable;
   private final transient Entry<K, V>[] entries;
   private final transient int mask;
   private final transient int hashCode;
   @LazyInit
   @RetainedWith
   private transient ImmutableBiMap<V, K> inverse;

   private RegularImmutableBiMap(ImmutableMapEntry<K, V>[] var1, ImmutableMapEntry<K, V>[] var2, Entry<K, V>[] var3, int var4, int var5) {
      this.keyTable = var1;
      this.valueTable = var2;
      this.entries = var3;
      this.mask = var4;
      this.hashCode = var5;
   }

   @Nullable
   @Override
   public V get(@Nullable Object var1) {
      return this.keyTable == null ? null : RegularImmutableMap.get(var1, this.keyTable, this.mask);
   }

   @Override
   ImmutableSet<Entry<K, V>> createEntrySet() {
      return this.isEmpty() ? ImmutableSet.of() : new ImmutableMapEntrySet.RegularEntrySet<>(this, this.entries);
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      Preconditions.checkNotNull(var1);

      for (Entry var5 : this.entries) {
         var1.accept(var5.getKey(), var5.getValue());
      }
   }

   @Override
   boolean isHashCodeFast() {
      return true;
   }

   @Override
   public int hashCode() {
      return this.hashCode;
   }

   @Override
   public int size() {
      return this.entries.length;
   }

   @Override
   public ImmutableBiMap<V, K> inverse() {
      if (this.isEmpty()) {
         return ImmutableBiMap.of();
      }

      ImmutableBiMap var1 = this.inverse;
      return var1 == null ? (this.inverse = new RegularImmutableBiMap.Inverse()) : var1;
   }

   private final class Inverse extends ImmutableBiMap<V, K> {
      private Inverse() {
      }

      @Override
      public int size() {
         return this.inverse().size();
      }

      @Override
      public ImmutableBiMap<K, V> inverse() {
         return RegularImmutableBiMap.this;
      }

      @Override
      public void forEach(BiConsumer<? super V, ? super K> var1) {
         Preconditions.checkNotNull(var1);
         RegularImmutableBiMap.this.forEach((var1x, var2) -> var1.accept(var2, var1x));
      }

      @Override
      public K get(@Nullable Object var1) {
         if (var1 != null && RegularImmutableBiMap.this.valueTable != null) {
            int var2 = Hashing.smear(var1.hashCode()) & RegularImmutableBiMap.this.mask;

            for (ImmutableMapEntry var3 = RegularImmutableBiMap.this.valueTable[var2]; var3 != null; var3 = var3.getNextInValueBucket()) {
               if (var1.equals(var3.getValue())) {
                  return (K)var3.getKey();
               }
            }

            return null;
         } else {
            return null;
         }
      }

      @Override
      ImmutableSet<Entry<V, K>> createEntrySet() {
         return new RegularImmutableBiMap.Inverse.InverseEntrySet();
      }

      final class InverseEntrySet extends ImmutableMapEntrySet<V, K> {
         @Override
         ImmutableMap<V, K> map() {
            return Inverse.this;
         }

         @Override
         boolean isHashCodeFast() {
            return true;
         }

         @Override
         public int hashCode() {
            return RegularImmutableBiMap.this.hashCode;
         }

         @Override
         public UnmodifiableIterator<Entry<V, K>> iterator() {
            return (UnmodifiableIterator<Entry<V, K>>)this.asList().iterator();
         }

         @Override
         public void forEach(Consumer<? super Entry<V, K>> var1) {
            this.asList().forEach(var1);
         }

         @Override
         ImmutableList<Entry<V, K>> createAsList() {
            return new ImmutableAsList<Entry<V, K>>() {
               public Entry<V, K> get(int var1) {
                  Entry var2 = RegularImmutableBiMap.this.entries[var1];
                  return Maps.immutableEntry((V)var2.getValue(), (K)var2.getKey());
               }

               @Override
               ImmutableCollection<Entry<V, K>> delegateCollection() {
                  return InverseEntrySet.this;
               }
            };
         }
      }
   }
}
