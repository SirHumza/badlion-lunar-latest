package org.jheaps.tree;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.AddressableHeapFactory;
import org.jheaps.DoubleEndedAddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.MergeableDoubleEndedAddressableHeap;

public class ReflectedHeap<K, V> implements Serializable, MergeableDoubleEndedAddressableHeap<K, V> {
   private static final long serialVersionUID = -5428954082047233961L;
   private final Comparator<? super K> comparator;
   private final AddressableHeap<K, ReflectedHeap.HandleMap<K, V>> minHeap;
   private final AddressableHeap<K, ReflectedHeap.HandleMap<K, V>> maxHeap;
   private ReflectedHeap.ReflectedHandle<K, V> free;
   private long size;
   private ReflectedHeap<K, V> other;

   public ReflectedHeap(AddressableHeapFactory<K, ?> var1) {
      this(var1, null);
   }

   public ReflectedHeap(AddressableHeapFactory<K, ?> var1, Comparator<? super K> var2) {
      if (var1 == null) {
         throw new NullPointerException("Underlying heap factory cannot be null");
      }

      this.comparator = var2;
      this.minHeap = var1.get(var2);
      this.maxHeap = var1.get(Collections.reverseOrder(var2));
      this.free = null;
      this.size = 0L;
      this.other = this;
   }

   @Override
   public Comparator<? super K> comparator() {
      return this.comparator;
   }

   @Override
   public boolean isEmpty() {
      return this.size == 0L;
   }

   @Override
   public long size() {
      return this.size;
   }

   @Override
   public void clear() {
      this.size = 0L;
      this.free = null;
      this.minHeap.clear();
      this.maxHeap.clear();
   }

   @Override
   public DoubleEndedAddressableHeap.Handle<K, V> insert(K var1, V var2) {
      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      } else if (this.other != this) {
         throw new IllegalStateException("A heap cannot be used after a meld");
      } else if (this.size % 2L == 0L) {
         this.free = new ReflectedHeap.ReflectedHandle<>(this, (K)var1, (V)var2);
         this.size++;
         return this.free;
      } else {
         ReflectedHeap.ReflectedHandle var3 = new ReflectedHeap.ReflectedHandle<>(this, (K)var1, (V)var2);
         this.insertPair(var3, this.free);
         this.free = null;
         this.size++;
         return var3;
      }
   }

   @Override
   public DoubleEndedAddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
   }

   @Override
   public DoubleEndedAddressableHeap.Handle<K, V> findMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      if (this.size == 1L) {
         return this.free;
      }

      if (this.size % 2L == 0L) {
         return this.minHeap.findMin().getValue().outer;
      }

      AddressableHeap.Handle var1 = this.minHeap.findMin();
      int var2;
      if (this.comparator == null) {
         var2 = ((Comparable)var1.getKey()).compareTo(this.free.key);
      } else {
         var2 = this.comparator.compare((K)var1.getKey(), this.free.key);
      }

      return var2 < 0 ? ((ReflectedHeap.HandleMap)var1.getValue()).outer : this.free;
   }

   @Override
   public DoubleEndedAddressableHeap.Handle<K, V> findMax() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      if (this.size == 1L) {
         return this.free;
      }

      if (this.size % 2L == 0L) {
         return this.maxHeap.findMin().getValue().outer;
      }

      AddressableHeap.Handle var1 = this.maxHeap.findMin();
      int var2;
      if (this.comparator == null) {
         var2 = ((Comparable)var1.getKey()).compareTo(this.free.key);
      } else {
         var2 = this.comparator.compare((K)var1.getKey(), this.free.key);
      }

      return var2 > 0 ? ((ReflectedHeap.HandleMap)var1.getValue()).outer : this.free;
   }

   @Override
   public DoubleEndedAddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      if (this.size == 1L) {
         ReflectedHeap.ReflectedHandle var7 = this.free;
         this.free = null;
         this.size--;
         return var7;
      }

      if (this.size % 2L == 0L) {
         AddressableHeap.Handle var6 = this.minHeap.deleteMin();
         ReflectedHeap.ReflectedHandle var8 = ((ReflectedHeap.HandleMap)var6.getValue()).outer;
         var8.inner = null;
         var8.minNotMax = false;
         AddressableHeap.Handle var10 = ((ReflectedHeap.HandleMap)var6.getValue()).otherInner;
         ReflectedHeap.ReflectedHandle var11 = ((ReflectedHeap.HandleMap)var10.getValue()).outer;
         var10.delete();
         var11.inner = null;
         var11.minNotMax = false;
         this.free = var11;
         this.size--;
         return var8;
      }

      AddressableHeap.Handle var1 = this.minHeap.findMin();
      int var2;
      if (this.comparator == null) {
         var2 = ((Comparable)var1.getKey()).compareTo(this.free.key);
      } else {
         var2 = this.comparator.compare((K)var1.getKey(), this.free.key);
      }

      if (var2 >= 0) {
         ReflectedHeap.ReflectedHandle var9 = this.free;
         this.free = null;
         this.size--;
         return var9;
      } else {
         var1.delete();
         ReflectedHeap.ReflectedHandle var3 = ((ReflectedHeap.HandleMap)var1.getValue()).outer;
         var3.inner = null;
         var3.minNotMax = false;
         AddressableHeap.Handle var4 = ((ReflectedHeap.HandleMap)var1.getValue()).otherInner;
         ReflectedHeap.ReflectedHandle var5 = ((ReflectedHeap.HandleMap)var4.getValue()).outer;
         var4.delete();
         var5.inner = null;
         var5.minNotMax = false;
         this.insertPair(var5, this.free);
         this.free = null;
         this.size--;
         return var3;
      }
   }

   @Override
   public DoubleEndedAddressableHeap.Handle<K, V> deleteMax() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      if (this.size == 1L) {
         ReflectedHeap.ReflectedHandle var7 = this.free;
         this.free = null;
         this.size--;
         return var7;
      }

      if (this.size % 2L == 0L) {
         AddressableHeap.Handle var6 = this.maxHeap.deleteMin();
         ReflectedHeap.ReflectedHandle var8 = ((ReflectedHeap.HandleMap)var6.getValue()).outer;
         var8.inner = null;
         var8.minNotMax = false;
         AddressableHeap.Handle var10 = ((ReflectedHeap.HandleMap)var6.getValue()).otherInner;
         ReflectedHeap.ReflectedHandle var11 = ((ReflectedHeap.HandleMap)var10.getValue()).outer;
         var10.delete();
         var11.inner = null;
         var11.minNotMax = false;
         this.free = var11;
         this.size--;
         return var8;
      }

      AddressableHeap.Handle var1 = this.maxHeap.findMin();
      int var2;
      if (this.comparator == null) {
         var2 = ((Comparable)var1.getKey()).compareTo(this.free.key);
      } else {
         var2 = this.comparator.compare((K)var1.getKey(), this.free.key);
      }

      if (var2 < 0) {
         ReflectedHeap.ReflectedHandle var9 = this.free;
         this.free = null;
         this.size--;
         return var9;
      } else {
         var1.delete();
         ReflectedHeap.ReflectedHandle var3 = ((ReflectedHeap.HandleMap)var1.getValue()).outer;
         var3.inner = null;
         var3.minNotMax = false;
         AddressableHeap.Handle var4 = ((ReflectedHeap.HandleMap)var1.getValue()).otherInner;
         ReflectedHeap.ReflectedHandle var5 = ((ReflectedHeap.HandleMap)var4.getValue()).outer;
         var4.delete();
         var5.inner = null;
         var5.minNotMax = false;
         this.insertPair(var5, this.free);
         this.free = null;
         this.size--;
         return var3;
      }
   }

   @Override
   public void meld(MergeableDoubleEndedAddressableHeap<K, V> var1) {
      ReflectedHeap var2 = (ReflectedHeap)var1;
      if (this.comparator != null) {
         if (var2.comparator == null || !var2.comparator.equals(this.comparator)) {
            throw new IllegalArgumentException("Cannot meld heaps using different comparators!");
         }
      } else if (var2.comparator != null) {
         throw new IllegalArgumentException("Cannot meld heaps using different comparators!");
      }

      if (var2.other != var2) {
         throw new IllegalStateException("A heap cannot be used after a meld.");
      }

      if (!(this.minHeap instanceof MergeableAddressableHeap)) {
         throw new IllegalArgumentException("Underlying heaps are not meldable.");
      }

      MergeableAddressableHeap var3 = (MergeableAddressableHeap)this.minHeap;
      MergeableAddressableHeap var4 = (MergeableAddressableHeap)var2.minHeap;
      var3.meld(var4);
      MergeableAddressableHeap var5 = (MergeableAddressableHeap)this.maxHeap;
      MergeableAddressableHeap var6 = (MergeableAddressableHeap)var2.maxHeap;
      var5.meld(var6);
      if (this.free == null) {
         if (var2.free != null) {
            this.free = var2.free;
            var2.free = null;
         }
      } else if (var2.free != null) {
         this.insertPair(this.free, var2.free);
         var2.free = null;
         this.free = null;
      }

      this.size = this.size + var2.size;
      var2.size = 0L;
      var2.other = this;
   }

   private void insertPair(ReflectedHeap.ReflectedHandle<K, V> var1, ReflectedHeap.ReflectedHandle<K, V> var2) {
      int var3;
      if (this.comparator == null) {
         var3 = ((Comparable)var1.key).compareTo(var2.key);
      } else {
         var3 = this.comparator.compare(var1.key, var2.key);
      }

      AddressableHeap.Handle var4;
      AddressableHeap.Handle var5;
      if (var3 <= 0) {
         var4 = this.minHeap.insert(var1.key);
         var1.minNotMax = true;
         var5 = this.maxHeap.insert(var2.key);
         var2.minNotMax = false;
      } else {
         var4 = this.maxHeap.insert(var1.key);
         var1.minNotMax = false;
         var5 = this.minHeap.insert(var2.key);
         var2.minNotMax = true;
      }

      var1.inner = var4;
      var2.inner = var5;
      var4.setValue(new ReflectedHeap.HandleMap(var1, var5));
      var5.setValue(new ReflectedHeap.HandleMap(var2, var4));
   }

   private void delete(ReflectedHeap.ReflectedHandle<K, V> var1) {
      if (var1.inner == null && this.free != var1) {
         throw new IllegalArgumentException("Invalid handle!");
      }

      if (this.free == var1) {
         this.free = null;
      } else {
         AddressableHeap.Handle var2 = var1.inner;
         ReflectedHeap.ReflectedHandle var3 = ((ReflectedHeap.HandleMap)var2.getValue()).outer;
         var2.delete();
         var3.inner = null;
         var3.minNotMax = false;
         AddressableHeap.Handle var4 = ((ReflectedHeap.HandleMap)var2.getValue()).otherInner;
         ReflectedHeap.ReflectedHandle var5 = ((ReflectedHeap.HandleMap)var4.getValue()).outer;
         var4.delete();
         var5.inner = null;
         var5.minNotMax = false;
         if (this.free == null) {
            this.free = var5;
         } else {
            this.insertPair(var5, this.free);
            this.free = null;
         }
      }

      this.size--;
   }

   private void decreaseKey(ReflectedHeap.ReflectedHandle<K, V> var1, K var2) {
      if (var1.inner == null && this.free != var1) {
         throw new IllegalArgumentException("Invalid handle!");
      }

      int var3;
      if (this.comparator == null) {
         var3 = ((Comparable)var2).compareTo(var1.key);
      } else {
         var3 = this.comparator.compare((K)var2, var1.key);
      }

      if (var3 > 0) {
         throw new IllegalArgumentException("Keys can only be decreased!");
      }

      var1.key = (K)var2;
      if (var3 != 0 && this.free != var1) {
         AddressableHeap.Handle var4 = var1.inner;
         if (var1.minNotMax) {
            var1.inner.decreaseKey((K)var2);
         } else {
            var4.delete();
            ReflectedHeap.ReflectedHandle var5 = ((ReflectedHeap.HandleMap)var4.getValue()).outer;
            var5.inner = null;
            var5.minNotMax = false;
            AddressableHeap.Handle var6 = ((ReflectedHeap.HandleMap)var4.getValue()).otherInner;
            ReflectedHeap.ReflectedHandle var7 = ((ReflectedHeap.HandleMap)var6.getValue()).outer;
            var6.delete();
            var7.inner = null;
            var7.minNotMax = false;
            var5.key = (K)var2;
            this.insertPair(var5, var7);
         }
      }
   }

   private void increaseKey(ReflectedHeap.ReflectedHandle<K, V> var1, K var2) {
      if (var1.inner == null && this.free != var1) {
         throw new IllegalArgumentException("Invalid handle!");
      }

      int var3;
      if (this.comparator == null) {
         var3 = ((Comparable)var2).compareTo(var1.key);
      } else {
         var3 = this.comparator.compare((K)var2, var1.key);
      }

      if (var3 < 0) {
         throw new IllegalArgumentException("Keys can only be increased!");
      }

      var1.key = (K)var2;
      if (var3 != 0 && this.free != var1) {
         AddressableHeap.Handle var4 = var1.inner;
         if (!var1.minNotMax) {
            var1.inner.decreaseKey((K)var2);
         } else {
            var4.delete();
            ReflectedHeap.ReflectedHandle var5 = ((ReflectedHeap.HandleMap)var4.getValue()).outer;
            var5.inner = null;
            var5.minNotMax = false;
            AddressableHeap.Handle var6 = ((ReflectedHeap.HandleMap)var4.getValue()).otherInner;
            ReflectedHeap.ReflectedHandle var7 = ((ReflectedHeap.HandleMap)var6.getValue()).outer;
            var6.delete();
            var7.inner = null;
            var7.minNotMax = false;
            var5.key = (K)var2;
            this.insertPair(var5, var7);
         }
      }
   }

   private static class HandleMap<K, V> implements Serializable {
      private static final long serialVersionUID = 1L;
      ReflectedHeap.ReflectedHandle<K, V> outer;
      AddressableHeap.Handle<K, ReflectedHeap.HandleMap<K, V>> otherInner;

      public HandleMap(ReflectedHeap.ReflectedHandle<K, V> var1, AddressableHeap.Handle<K, ReflectedHeap.HandleMap<K, V>> var2) {
         this.outer = var1;
         this.otherInner = var2;
      }
   }

   private static class ReflectedHandle<K, V> implements Serializable, DoubleEndedAddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 3179286196684064903L;
      ReflectedHeap<K, V> heap;
      K key;
      V value;
      boolean minNotMax;
      AddressableHeap.Handle<K, ReflectedHeap.HandleMap<K, V>> inner;

      public ReflectedHandle(ReflectedHeap<K, V> var1, K var2, V var3) {
         this.heap = var1;
         this.key = (K)var2;
         this.value = (V)var3;
      }

      @Override
      public K getKey() {
         return this.key;
      }

      @Override
      public V getValue() {
         return this.value;
      }

      @Override
      public void setValue(V var1) {
         this.value = (V)var1;
      }

      @Override
      public void decreaseKey(K var1) {
         this.getOwner().decreaseKey(this, (K)var1);
      }

      @Override
      public void delete() {
         this.getOwner().delete(this);
      }

      @Override
      public void increaseKey(K var1) {
         this.getOwner().increaseKey(this, (K)var1);
      }

      ReflectedHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            ReflectedHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            ReflectedHeap var2 = this.heap;

            while (var2.other != var1) {
               ReflectedHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }
}
