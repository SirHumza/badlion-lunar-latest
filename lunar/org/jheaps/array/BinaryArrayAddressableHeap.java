package org.jheaps.array;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.annotations.LinearTime;

public class BinaryArrayAddressableHeap<K, V> extends AbstractArrayAddressableHeap<K, V> implements Serializable {
   private static final long serialVersionUID = 1L;
   public static final int DEFAULT_HEAP_CAPACITY = 16;

   public BinaryArrayAddressableHeap() {
      this(null, 16);
   }

   public BinaryArrayAddressableHeap(int var1) {
      this(null, var1);
   }

   public BinaryArrayAddressableHeap(Comparator<? super K> var1) {
      this(var1, 16);
   }

   public BinaryArrayAddressableHeap(Comparator<? super K> var1, int var2) {
      super(var1, var2);
   }

   @LinearTime
   public static <K, V> BinaryArrayAddressableHeap<K, V> heapify(K[] var0, V[] var1) {
      if (var0 == null) {
         throw new IllegalArgumentException("Key array cannot be null");
      }

      if (var1 != null && var0.length != var1.length) {
         throw new IllegalArgumentException("Values array must have the same length as the keys array");
      }

      if (var0.length == 0) {
         return new BinaryArrayAddressableHeap<>();
      }

      BinaryArrayAddressableHeap var2 = new BinaryArrayAddressableHeap(var0.length);

      for (int var3 = 0; var3 < var0.length; var3++) {
         Object var4 = var0[var3];
         Object var5 = var1 == null ? null : var1[var3];
         AbstractArrayAddressableHeap.ArrayHandle var6 = var2.new ArrayHandle(var4, var5);
         var6.index = var3 + 1;
         var2.array[var3 + 1] = var6;
      }

      var2.size = var0.length;

      for (int var7 = var0.length / 2; var7 > 0; var7--) {
         var2.fixdown(var7);
      }

      return var2;
   }

   @LinearTime
   public static <K, V> BinaryArrayAddressableHeap<K, V> heapify(K[] var0, V[] var1, Comparator<? super K> var2) {
      if (var0 == null) {
         throw new IllegalArgumentException("Keys array cannot be null");
      }

      if (var1 != null && var0.length != var1.length) {
         throw new IllegalArgumentException("Values array must have the same length as the keys array");
      }

      if (var0.length == 0) {
         return new BinaryArrayAddressableHeap<>(var2);
      }

      BinaryArrayAddressableHeap var3 = new BinaryArrayAddressableHeap(var2, var0.length);

      for (int var4 = 0; var4 < var0.length; var4++) {
         Object var5 = var0[var4];
         Object var6 = var1 == null ? null : var1[var4];
         AbstractArrayAddressableHeap.ArrayHandle var7 = var3.new ArrayHandle(var5, var6);
         var7.index = var4 + 1;
         var3.array[var4 + 1] = var7;
      }

      var3.size = var0.length;

      for (int var8 = var0.length / 2; var8 > 0; var8--) {
         var3.fixdownWithComparator(var8);
      }

      return var3;
   }

   public Iterator<AddressableHeap.Handle<K, V>> handlesIterator() {
      return new Iterator<AddressableHeap.Handle<K, V>>() {
         private int pos = 1;

         @Override
         public boolean hasNext() {
            return this.pos <= BinaryArrayAddressableHeap.this.size;
         }

         public AddressableHeap.Handle<K, V> next() {
            if (this.pos > BinaryArrayAddressableHeap.this.size) {
               throw new NoSuchElementException();
            } else {
               return BinaryArrayAddressableHeap.this.array[this.pos++];
            }
         }

         @Override
         public void remove() {
            throw new UnsupportedOperationException();
         }
      };
   }

   @Override
   protected void ensureCapacity(int var1) {
      this.checkCapacity(var1);
      AbstractArrayAddressableHeap.ArrayHandle[] var2 = (AbstractArrayAddressableHeap.ArrayHandle[])Array.newInstance(
         AbstractArrayAddressableHeap.ArrayHandle.class, var1 + 1
      );
      System.arraycopy(this.array, 1, var2, 1, this.size);
      this.array = var2;
   }

   @Override
   protected void forceFixup(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var2 = this.array[var1];

      while (var1 > 1) {
         this.array[var1] = this.array[var1 / 2];
         this.array[var1].index = var1;
         var1 /= 2;
      }

      this.array[var1] = var2;
      var2.index = var1;
   }

   @Override
   protected void fixup(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var2;
      for (var2 = this.array[var1]; var1 > 1 && ((Comparable)this.array[var1 / 2].getKey()).compareTo(var2.getKey()) > 0; var1 /= 2) {
         this.array[var1] = this.array[var1 / 2];
         this.array[var1].index = var1;
      }

      this.array[var1] = var2;
      var2.index = var1;
   }

   @Override
   protected void fixupWithComparator(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var2;
      for (var2 = this.array[var1]; var1 > 1 && this.comparator.compare(this.array[var1 / 2].getKey(), (K)var2.getKey()) > 0; var1 /= 2) {
         this.array[var1] = this.array[var1 / 2];
         this.array[var1].index = var1;
      }

      this.array[var1] = var2;
      var2.index = var1;
   }

   @Override
   protected void fixdown(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var2 = this.array[var1];

      while (2 * var1 <= this.size) {
         int var3 = 2 * var1;
         if (var3 < this.size && ((Comparable)this.array[var3].getKey()).compareTo(this.array[var3 + 1].getKey()) > 0) {
            var3++;
         }

         if (((Comparable)var2.getKey()).compareTo(this.array[var3].getKey()) <= 0) {
            break;
         }

         this.array[var1] = this.array[var3];
         this.array[var1].index = var1;
         var1 = var3;
      }

      this.array[var1] = var2;
      var2.index = var1;
   }

   @Override
   protected void fixdownWithComparator(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var2 = this.array[var1];

      while (2 * var1 <= this.size) {
         int var3 = 2 * var1;
         if (var3 < this.size && this.comparator.compare(this.array[var3].getKey(), this.array[var3 + 1].getKey()) > 0) {
            var3++;
         }

         if (this.comparator.compare((K)var2.getKey(), this.array[var3].getKey()) <= 0) {
            break;
         }

         this.array[var1] = this.array[var3];
         this.array[var1].index = var1;
         var1 = var3;
      }

      this.array[var1] = var2;
      var2.index = var1;
   }
}
