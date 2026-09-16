package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Objects;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.spongepowered.include.com.google.j2objc.annotations.RetainedWith;

public final class HashBiMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> implements Serializable, BiMap<K, V> {
   private transient HashBiMap.BiEntry<K, V>[] hashTableKToV;
   private transient HashBiMap.BiEntry<K, V>[] hashTableVToK;
   private transient HashBiMap.BiEntry<K, V> firstInKeyInsertionOrder;
   private transient HashBiMap.BiEntry<K, V> lastInKeyInsertionOrder;
   private transient int size;
   private transient int mask;
   private transient int modCount;
   @RetainedWith
   private transient BiMap<V, K> inverse;

   public static <K, V> HashBiMap<K, V> create() {
      return create(16);
   }

   public static <K, V> HashBiMap<K, V> create(int var0) {
      return new HashBiMap<>(var0);
   }

   private HashBiMap(int var1) {
      this.init(var1);
   }

   private void init(int var1) {
      CollectPreconditions.checkNonnegative(var1, "expectedSize");
      int var2 = Hashing.closedTableSize(var1, 1.0);
      this.hashTableKToV = this.createTable(var2);
      this.hashTableVToK = this.createTable(var2);
      this.firstInKeyInsertionOrder = null;
      this.lastInKeyInsertionOrder = null;
      this.size = 0;
      this.mask = var2 - 1;
      this.modCount = 0;
   }

   private void delete(HashBiMap.BiEntry<K, V> var1) {
      int var2 = var1.keyHash & this.mask;
      HashBiMap.BiEntry var3 = null;

      for (HashBiMap.BiEntry var4 = this.hashTableKToV[var2]; var4 != var1; var4 = var4.nextInKToVBucket) {
         var3 = var4;
      }

      if (var3 == null) {
         this.hashTableKToV[var2] = var1.nextInKToVBucket;
      } else {
         var3.nextInKToVBucket = var1.nextInKToVBucket;
      }

      int var7 = var1.valueHash & this.mask;
      var3 = null;

      for (HashBiMap.BiEntry var5 = this.hashTableVToK[var7]; var5 != var1; var5 = var5.nextInVToKBucket) {
         var3 = var5;
      }

      if (var3 == null) {
         this.hashTableVToK[var7] = var1.nextInVToKBucket;
      } else {
         var3.nextInVToKBucket = var1.nextInVToKBucket;
      }

      if (var1.prevInKeyInsertionOrder == null) {
         this.firstInKeyInsertionOrder = var1.nextInKeyInsertionOrder;
      } else {
         var1.prevInKeyInsertionOrder.nextInKeyInsertionOrder = var1.nextInKeyInsertionOrder;
      }

      if (var1.nextInKeyInsertionOrder == null) {
         this.lastInKeyInsertionOrder = var1.prevInKeyInsertionOrder;
      } else {
         var1.nextInKeyInsertionOrder.prevInKeyInsertionOrder = var1.prevInKeyInsertionOrder;
      }

      this.size--;
      this.modCount++;
   }

   private void insert(HashBiMap.BiEntry<K, V> var1, @Nullable HashBiMap.BiEntry<K, V> var2) {
      int var3 = var1.keyHash & this.mask;
      var1.nextInKToVBucket = this.hashTableKToV[var3];
      this.hashTableKToV[var3] = var1;
      int var4 = var1.valueHash & this.mask;
      var1.nextInVToKBucket = this.hashTableVToK[var4];
      this.hashTableVToK[var4] = var1;
      if (var2 == null) {
         var1.prevInKeyInsertionOrder = this.lastInKeyInsertionOrder;
         var1.nextInKeyInsertionOrder = null;
         if (this.lastInKeyInsertionOrder == null) {
            this.firstInKeyInsertionOrder = var1;
         } else {
            this.lastInKeyInsertionOrder.nextInKeyInsertionOrder = var1;
         }

         this.lastInKeyInsertionOrder = var1;
      } else {
         var1.prevInKeyInsertionOrder = var2.prevInKeyInsertionOrder;
         if (var1.prevInKeyInsertionOrder == null) {
            this.firstInKeyInsertionOrder = var1;
         } else {
            var1.prevInKeyInsertionOrder.nextInKeyInsertionOrder = var1;
         }

         var1.nextInKeyInsertionOrder = var2.nextInKeyInsertionOrder;
         if (var1.nextInKeyInsertionOrder == null) {
            this.lastInKeyInsertionOrder = var1;
         } else {
            var1.nextInKeyInsertionOrder.prevInKeyInsertionOrder = var1;
         }
      }

      this.size++;
      this.modCount++;
   }

   private HashBiMap.BiEntry<K, V> seekByKey(@Nullable Object var1, int var2) {
      for (HashBiMap.BiEntry var3 = this.hashTableKToV[var2 & this.mask]; var3 != null; var3 = var3.nextInKToVBucket) {
         if (var2 == var3.keyHash && Objects.equal(var1, var3.key)) {
            return var3;
         }
      }

      return null;
   }

   private HashBiMap.BiEntry<K, V> seekByValue(@Nullable Object var1, int var2) {
      for (HashBiMap.BiEntry var3 = this.hashTableVToK[var2 & this.mask]; var3 != null; var3 = var3.nextInVToKBucket) {
         if (var2 == var3.valueHash && Objects.equal(var1, var3.value)) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.seekByKey(var1, Hashing.smearedHash(var1)) != null;
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return this.seekByValue(var1, Hashing.smearedHash(var1)) != null;
   }

   @Nullable
   @Override
   public V get(@Nullable Object var1) {
      return Maps.valueOrNull(this.seekByKey(var1, Hashing.smearedHash(var1)));
   }

   @CanIgnoreReturnValue
   @Override
   public V put(@Nullable K var1, @Nullable V var2) {
      return this.put((K)var1, (V)var2, false);
   }

   @CanIgnoreReturnValue
   @Override
   public V forcePut(@Nullable K var1, @Nullable V var2) {
      return this.put((K)var1, (V)var2, true);
   }

   private V put(@Nullable K var1, @Nullable V var2, boolean var3) {
      int var4 = Hashing.smearedHash(var1);
      int var5 = Hashing.smearedHash(var2);
      HashBiMap.BiEntry var6 = this.seekByKey(var1, var4);
      if (var6 != null && var5 == var6.valueHash && Objects.equal(var2, var6.value)) {
         return (V)var2;
      }

      HashBiMap.BiEntry var7 = this.seekByValue(var2, var5);
      if (var7 != null) {
         if (!var3) {
            throw new IllegalArgumentException("value already present: " + var2);
         }

         this.delete(var7);
      }

      HashBiMap.BiEntry var8 = new HashBiMap.BiEntry<>(var1, var4, var2, var5);
      if (var6 != null) {
         this.delete(var6);
         this.insert(var8, var6);
         var6.prevInKeyInsertionOrder = null;
         var6.nextInKeyInsertionOrder = null;
         this.rehashIfNecessary();
         return var6.value;
      } else {
         this.insert(var8, null);
         this.rehashIfNecessary();
         return null;
      }
   }

   @Nullable
   private K putInverse(@Nullable V var1, @Nullable K var2, boolean var3) {
      int var4 = Hashing.smearedHash(var1);
      int var5 = Hashing.smearedHash(var2);
      HashBiMap.BiEntry var6 = this.seekByValue(var1, var4);
      if (var6 != null && var5 == var6.keyHash && Objects.equal(var2, var6.key)) {
         return (K)var2;
      }

      HashBiMap.BiEntry var7 = this.seekByKey(var2, var5);
      if (var7 != null) {
         if (!var3) {
            throw new IllegalArgumentException("value already present: " + var2);
         }

         this.delete(var7);
      }

      if (var6 != null) {
         this.delete(var6);
      }

      HashBiMap.BiEntry var8 = new HashBiMap.BiEntry<>(var2, var5, var1, var4);
      this.insert(var8, var7);
      if (var7 != null) {
         var7.prevInKeyInsertionOrder = null;
         var7.nextInKeyInsertionOrder = null;
      }

      this.rehashIfNecessary();
      return Maps.keyOrNull(var6);
   }

   private void rehashIfNecessary() {
      HashBiMap.BiEntry[] var1 = this.hashTableKToV;
      if (Hashing.needsResizing(this.size, var1.length, 1.0)) {
         int var2 = var1.length * 2;
         this.hashTableKToV = this.createTable(var2);
         this.hashTableVToK = this.createTable(var2);
         this.mask = var2 - 1;
         this.size = 0;

         for (HashBiMap.BiEntry var3 = this.firstInKeyInsertionOrder; var3 != null; var3 = var3.nextInKeyInsertionOrder) {
            this.insert(var3, var3);
         }

         this.modCount++;
      }
   }

   private HashBiMap.BiEntry<K, V>[] createTable(int var1) {
      return new HashBiMap.BiEntry[var1];
   }

   @CanIgnoreReturnValue
   @Override
   public V remove(@Nullable Object var1) {
      HashBiMap.BiEntry var2 = this.seekByKey(var1, Hashing.smearedHash(var1));
      if (var2 == null) {
         return null;
      }

      this.delete(var2);
      var2.prevInKeyInsertionOrder = null;
      var2.nextInKeyInsertionOrder = null;
      return var2.value;
   }

   @Override
   public void clear() {
      this.size = 0;
      Arrays.fill(this.hashTableKToV, null);
      Arrays.fill(this.hashTableVToK, null);
      this.firstInKeyInsertionOrder = null;
      this.lastInKeyInsertionOrder = null;
      this.modCount++;
   }

   @Override
   public int size() {
      return this.size;
   }

   @Override
   public Set<K> keySet() {
      return new HashBiMap.KeySet();
   }

   @Override
   public Set<V> values() {
      return this.inverse().keySet();
   }

   @Override
   Iterator<Entry<K, V>> entryIterator() {
      return new HashBiMap.Itr() {
         Entry<K, V> output(HashBiMap.BiEntry<K, V> var1) {
            return new MapEntry(var1);
         }

         class MapEntry extends AbstractMapEntry<K, V> {
            HashBiMap.BiEntry<K, V> delegate;

            MapEntry(HashBiMap.BiEntry<K, V> var2) {
               this.delegate = var2;
            }

            @Override
            public K getKey() {
               return this.delegate.key;
            }

            @Override
            public V getValue() {
               return this.delegate.value;
            }

            @Override
            public V setValue(V var1) {
               Object var2 = this.delegate.value;
               int var3 = Hashing.smearedHash(var1);
               if (var3 == this.delegate.valueHash && Objects.equal(var1, var2)) {
                  return (V)var1;
               }

               Preconditions.checkArgument(HashBiMap.this.seekByValue(var1, var3) == null, "value already present: %s", var1);
               HashBiMap.this.delete(this.delegate);
               HashBiMap.BiEntry var4 = new HashBiMap.BiEntry<>(this.delegate.key, this.delegate.keyHash, var1, var3);
               HashBiMap.this.insert(var4, this.delegate);
               this.delegate.prevInKeyInsertionOrder = null;
               this.delegate.nextInKeyInsertionOrder = null;
               expectedModCount = HashBiMap.this.modCount;
               if (toRemove == this.delegate) {
                  toRemove = var4;
               }

               this.delegate = var4;
               return (V)var2;
            }
         }
      };
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      Preconditions.checkNotNull(var1);

      for (HashBiMap.BiEntry var2 = this.firstInKeyInsertionOrder; var2 != null; var2 = var2.nextInKeyInsertionOrder) {
         var1.accept(var2.key, var2.value);
      }
   }

   @Override
   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
      Preconditions.checkNotNull(var1);
      HashBiMap.BiEntry var2 = this.firstInKeyInsertionOrder;
      this.clear();

      for (HashBiMap.BiEntry var3 = var2; var3 != null; var3 = var3.nextInKeyInsertionOrder) {
         this.put(var3.key, (V)var1.apply(var3.key, var3.value));
      }
   }

   @Override
   public BiMap<V, K> inverse() {
      return this.inverse == null ? (this.inverse = new HashBiMap.Inverse()) : this.inverse;
   }

   private static final class BiEntry<K, V> extends ImmutableEntry<K, V> {
      final int keyHash;
      final int valueHash;
      @Nullable
      HashBiMap.BiEntry<K, V> nextInKToVBucket;
      @Nullable
      HashBiMap.BiEntry<K, V> nextInVToKBucket;
      @Nullable
      HashBiMap.BiEntry<K, V> nextInKeyInsertionOrder;
      @Nullable
      HashBiMap.BiEntry<K, V> prevInKeyInsertionOrder;

      BiEntry(K var1, int var2, V var3, int var4) {
         super((K)var1, (V)var3);
         this.keyHash = var2;
         this.valueHash = var4;
      }
   }

   private final class Inverse extends Maps.IteratorBasedAbstractMap<V, K> implements Serializable, BiMap<V, K> {
      private Inverse() {
      }

      BiMap<K, V> forward() {
         return HashBiMap.this;
      }

      @Override
      public int size() {
         return HashBiMap.this.size;
      }

      @Override
      public void clear() {
         this.forward().clear();
      }

      @Override
      public boolean containsKey(@Nullable Object var1) {
         return this.forward().containsValue(var1);
      }

      @Override
      public K get(@Nullable Object var1) {
         return Maps.keyOrNull(HashBiMap.this.seekByValue(var1, Hashing.smearedHash(var1)));
      }

      @CanIgnoreReturnValue
      @Override
      public K put(@Nullable V var1, @Nullable K var2) {
         return HashBiMap.this.putInverse((V)var1, (K)var2, false);
      }

      @Override
      public K forcePut(@Nullable V var1, @Nullable K var2) {
         return HashBiMap.this.putInverse((V)var1, (K)var2, true);
      }

      @Override
      public K remove(@Nullable Object var1) {
         HashBiMap.BiEntry var2 = HashBiMap.this.seekByValue(var1, Hashing.smearedHash(var1));
         if (var2 == null) {
            return null;
         }

         HashBiMap.this.delete(var2);
         var2.prevInKeyInsertionOrder = null;
         var2.nextInKeyInsertionOrder = null;
         return var2.key;
      }

      @Override
      public BiMap<K, V> inverse() {
         return this.forward();
      }

      @Override
      public Set<V> keySet() {
         return new HashBiMap.Inverse.InverseKeySet();
      }

      @Override
      public Set<K> values() {
         return this.forward().keySet();
      }

      @Override
      Iterator<Entry<V, K>> entryIterator() {
         return new HashBiMap.Itr() {
            Entry<V, K> output(HashBiMap.BiEntry<K, V> var1) {
               return new InverseEntry(var1);
            }

            class InverseEntry extends AbstractMapEntry<V, K> {
               HashBiMap.BiEntry<K, V> delegate;

               InverseEntry(HashBiMap.BiEntry<K, V> var2) {
                  this.delegate = var2;
               }

               @Override
               public V getKey() {
                  return this.delegate.value;
               }

               @Override
               public K getValue() {
                  return this.delegate.key;
               }

               @Override
               public K setValue(K var1) {
                  Object var2 = this.delegate.key;
                  int var3 = Hashing.smearedHash(var1);
                  if (var3 == this.delegate.keyHash && Objects.equal(var1, var2)) {
                     return (K)var1;
                  }

                  Preconditions.checkArgument(HashBiMap.this.seekByKey(var1, var3) == null, "value already present: %s", var1);
                  HashBiMap.this.delete(this.delegate);
                  HashBiMap.BiEntry var4 = new HashBiMap.BiEntry<>(var1, var3, this.delegate.value, this.delegate.valueHash);
                  this.delegate = var4;
                  HashBiMap.this.insert(var4, null);
                  expectedModCount = HashBiMap.this.modCount;
                  return (K)var2;
               }
            }
         };
      }

      @Override
      public void forEach(BiConsumer<? super V, ? super K> var1) {
         Preconditions.checkNotNull(var1);
         HashBiMap.this.forEach((var1x, var2) -> var1.accept(var2, var1x));
      }

      @Override
      public void replaceAll(BiFunction<? super V, ? super K, ? extends K> var1) {
         Preconditions.checkNotNull(var1);
         HashBiMap.BiEntry var2 = HashBiMap.this.firstInKeyInsertionOrder;
         this.clear();

         for (HashBiMap.BiEntry var3 = var2; var3 != null; var3 = var3.nextInKeyInsertionOrder) {
            this.put(var3.value, (K)var1.apply(var3.value, var3.key));
         }
      }

      private final class InverseKeySet extends Maps.KeySet<V, K> {
         InverseKeySet() {
            super(Inverse.this);
         }

         @Override
         public boolean remove(@Nullable Object var1) {
            HashBiMap.BiEntry var2 = HashBiMap.this.seekByValue(var1, Hashing.smearedHash(var1));
            if (var2 == null) {
               return false;
            }

            HashBiMap.this.delete(var2);
            return true;
         }

         @Override
         public Iterator<V> iterator() {
            return new HashBiMap.Itr() {
               @Override
               V output(HashBiMap.BiEntry<K, V> var1) {
                  return var1.value;
               }
            };
         }
      }
   }

   abstract class Itr<T> implements Iterator<T> {
      HashBiMap.BiEntry<K, V> next = HashBiMap.this.firstInKeyInsertionOrder;
      HashBiMap.BiEntry<K, V> toRemove = null;
      int expectedModCount = HashBiMap.this.modCount;

      @Override
      public boolean hasNext() {
         if (HashBiMap.this.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
         } else {
            return this.next != null;
         }
      }

      @Override
      public T next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         HashBiMap.BiEntry var1 = this.next;
         this.next = var1.nextInKeyInsertionOrder;
         this.toRemove = var1;
         return this.output(var1);
      }

      @Override
      public void remove() {
         if (HashBiMap.this.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
         }

         CollectPreconditions.checkRemove(this.toRemove != null);
         HashBiMap.this.delete(this.toRemove);
         this.expectedModCount = HashBiMap.this.modCount;
         this.toRemove = null;
      }

      abstract T output(HashBiMap.BiEntry<K, V> var1);
   }

   private final class KeySet extends Maps.KeySet<K, V> {
      KeySet() {
         super(HashBiMap.this);
      }

      @Override
      public Iterator<K> iterator() {
         return new HashBiMap.Itr() {
            @Override
            K output(HashBiMap.BiEntry<K, V> var1) {
               return var1.key;
            }
         };
      }

      @Override
      public boolean remove(@Nullable Object var1) {
         HashBiMap.BiEntry var2 = HashBiMap.this.seekByKey(var1, Hashing.smearedHash(var1));
         if (var2 == null) {
            return false;
         }

         HashBiMap.this.delete(var2);
         var2.prevInKeyInsertionOrder = null;
         var2.nextInKeyInsertionOrder = null;
         return true;
      }
   }
}
