package org.jheaps.array;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

abstract class AbstractArrayAddressableHeap<K, V> implements Serializable, AddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   protected static final int NO_INDEX = -1;
   protected static final int MAX_HEAP_CAPACITY = 2147483638;
   protected static final int MIN_HEAP_CAPACITY = 0;
   protected static final int DOWNSIZING_MIN_HEAP_CAPACITY = 16;
   protected Comparator<? super K> comparator;
   protected AbstractArrayAddressableHeap<K, V>.ArrayHandle[] array;
   protected int size;
   protected final int minCapacity;

   public AbstractArrayAddressableHeap(Comparator<? super K> var1, int var2) {
      this.checkCapacity(var2);
      this.size = 0;
      this.comparator = var1;
      this.minCapacity = Math.max(var2, 16);
      this.array = (AbstractArrayAddressableHeap.ArrayHandle[])Array.newInstance(AbstractArrayAddressableHeap.ArrayHandle.class, this.minCapacity + 1);
   }

   @ConstantTime
   @Override
   public AddressableHeap.Handle<K, V> findMin() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      } else {
         return this.array[1];
      }
   }

   @ConstantTime
   @Override
   public boolean isEmpty() {
      return this.size == 0;
   }

   @ConstantTime
   @Override
   public long size() {
      return this.size;
   }

   @Override
   public Comparator<? super K> comparator() {
      return this.comparator;
   }

   @ConstantTime
   @Override
   public void clear() {
      this.size = 0;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1, V var2) {
      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      if (this.size == this.array.length - 1) {
         if (this.array.length == 1) {
            this.ensureCapacity(1);
         } else {
            this.ensureCapacity(2 * (this.array.length - 1));
         }
      }

      AbstractArrayAddressableHeap.ArrayHandle var3 = new AbstractArrayAddressableHeap.ArrayHandle(var1, var2);
      this.size++;
      this.array[this.size] = var3;
      var3.index = this.size;
      if (this.comparator == null) {
         this.fixup(this.size);
      } else {
         this.fixupWithComparator(this.size);
      }

      return var3;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      }

      AbstractArrayAddressableHeap.ArrayHandle var1 = this.array[1];
      var1.index = -1;
      if (this.size == 1) {
         this.array[1] = null;
         this.size = 0;
      } else {
         this.array[1] = this.array[this.size--];
         if (this.comparator == null) {
            this.fixdown(1);
         } else {
            this.fixdownWithComparator(1);
         }
      }

      if (2 * this.minCapacity < this.array.length - 1 && 4 * this.size < this.array.length - 1) {
         this.ensureCapacity((this.array.length - 1) / 2);
      }

      return var1;
   }

   protected final void checkCapacity(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Heap capacity must be >= 0");
      }

      if (var1 > 2147483638) {
         throw new IllegalArgumentException("Heap capacity too large");
      }
   }

   protected abstract void ensureCapacity(int var1);

   protected abstract void forceFixup(int var1);

   protected abstract void fixup(int var1);

   protected abstract void fixupWithComparator(int var1);

   protected abstract void fixdown(int var1);

   protected abstract void fixdownWithComparator(int var1);

   protected class ArrayHandle implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      Object key;
      Object value;
      int index;

      ArrayHandle(K var2, V var3) {
         this.key = var2;
         this.value = var3;
         this.index = -1;
      }

      @Override
      public K getKey() {
         return (K)this.key;
      }

      @Override
      public V getValue() {
         return (V)this.value;
      }

      @Override
      public void setValue(V var1) {
         this.value = var1;
      }

      @LogarithmicTime
      @Override
      public void decreaseKey(K var1) {
         if (this.index == -1) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         int var2;
         if (AbstractArrayAddressableHeap.this.comparator == null) {
            var2 = ((Comparable)var1).compareTo(this.key);
         } else {
            var2 = AbstractArrayAddressableHeap.this.comparator.compare((K)var1, (K)this.key);
         }

         if (var2 > 0) {
            throw new IllegalArgumentException("Keys can only be decreased!");
         }

         this.key = var1;
         if (var2 != 0 && this.index != 1) {
            if (AbstractArrayAddressableHeap.this.comparator == null) {
               AbstractArrayAddressableHeap.this.fixup(this.index);
            } else {
               AbstractArrayAddressableHeap.this.fixupWithComparator(this.index);
            }
         }
      }

      @Override
      public void delete() {
         if (this.index == -1) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         if (this.index == 1) {
            AbstractArrayAddressableHeap.this.deleteMin();
         } else {
            AbstractArrayAddressableHeap.this.forceFixup(this.index);
            AbstractArrayAddressableHeap.this.deleteMin();
         }
      }
   }
}
