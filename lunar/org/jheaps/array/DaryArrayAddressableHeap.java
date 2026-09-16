package org.jheaps.array;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.annotations.LinearTime;

public class DaryArrayAddressableHeap<K, V> extends AbstractArrayAddressableHeap<K, V> implements Serializable {
   private static final long serialVersionUID = 1L;
   private static final String D_ARY_HEAPS_MUST_HAVE_AT_LEAST_2_CHILDREN_PER_NODE = "D-ary heaps must have at least 2 children per node";
   public static final int DEFAULT_HEAP_CAPACITY = 16;
   protected int d;

   public DaryArrayAddressableHeap(int var1) {
      this(var1, null, 16);
   }

   public DaryArrayAddressableHeap(int var1, int var2) {
      this(var1, null, var2);
   }

   public DaryArrayAddressableHeap(int var1, Comparator<? super K> var2) {
      this(var1, var2, 16);
   }

   public DaryArrayAddressableHeap(int var1, Comparator<? super K> var2, int var3) {
      super(var2, var3);
      if (var1 < 2) {
         throw new IllegalArgumentException("D-ary heaps must have at least 2 children per node");
      }

      this.d = var1;
   }

   @LinearTime
   public static <K, V> DaryArrayAddressableHeap<K, V> heapify(int var0, K[] var1, V[] var2) {
      if (var0 < 2) {
         throw new IllegalArgumentException("D-ary heaps must have at least 2 children per node");
      }

      if (var1 == null) {
         throw new IllegalArgumentException("Key array cannot be null");
      }

      if (var2 != null && var1.length != var2.length) {
         throw new IllegalArgumentException("Values array must have the same length as the keys array");
      }

      if (var1.length == 0) {
         return new DaryArrayAddressableHeap<>(var0);
      }

      DaryArrayAddressableHeap var3 = new DaryArrayAddressableHeap(var0, var1.length);

      for (int var4 = 0; var4 < var1.length; var4++) {
         Object var5 = var1[var4];
         Object var6 = var2 == null ? null : var2[var4];
         AbstractArrayAddressableHeap.ArrayHandle var7 = var3.new ArrayHandle(var5, var6);
         var7.index = var4 + 1;
         var3.array[var4 + 1] = var7;
      }

      var3.size = var1.length;

      for (int var8 = var1.length / var0; var8 > 0; var8--) {
         var3.fixdown(var8);
      }

      return var3;
   }

   @LinearTime
   public static <K, V> DaryArrayAddressableHeap<K, V> heapify(int var0, K[] var1, V[] var2, Comparator<? super K> var3) {
      if (var0 < 2) {
         throw new IllegalArgumentException("D-ary heaps must have at least 2 children per node");
      }

      if (var1 == null) {
         throw new IllegalArgumentException("Keys array cannot be null");
      }

      if (var2 != null && var1.length != var2.length) {
         throw new IllegalArgumentException("Values array must have the same length as the keys array");
      }

      if (var1.length == 0) {
         return new DaryArrayAddressableHeap<>(var0, var3);
      }

      DaryArrayAddressableHeap var4 = new DaryArrayAddressableHeap(var0, var3, var1.length);

      for (int var5 = 0; var5 < var1.length; var5++) {
         Object var6 = var1[var5];
         Object var7 = var2 == null ? null : var2[var5];
         AbstractArrayAddressableHeap.ArrayHandle var8 = var4.new ArrayHandle(var6, var7);
         var8.index = var5 + 1;
         var4.array[var5 + 1] = var8;
      }

      var4.size = var1.length;

      for (int var9 = var1.length / var0; var9 > 0; var9--) {
         var4.fixdownWithComparator(var9);
      }

      return var4;
   }

   public Iterator<AddressableHeap.Handle<K, V>> handlesIterator() {
      return new Iterator<AddressableHeap.Handle<K, V>>() {
         private int pos = 1;

         @Override
         public boolean hasNext() {
            return this.pos <= DaryArrayAddressableHeap.this.size;
         }

         public AddressableHeap.Handle<K, V> next() {
            if (this.pos > DaryArrayAddressableHeap.this.size) {
               throw new NoSuchElementException();
            } else {
               return DaryArrayAddressableHeap.this.array[this.pos++];
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
         int var3 = (var1 - 2) / this.d + 1;
         this.array[var1] = this.array[var3];
         this.array[var1].index = var1;
         var1 = var3;
      }

      this.array[var1] = var2;
      var2.index = var1;
   }

   @Override
   protected void fixup(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var2 = this.array[var1];

      while (var1 > 1) {
         int var3 = (var1 - 2) / this.d + 1;
         if (((Comparable)this.array[var3].getKey()).compareTo(var2.getKey()) <= 0) {
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
   protected void fixupWithComparator(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var2 = this.array[var1];

      while (var1 > 1) {
         int var3 = (var1 - 2) / this.d + 1;
         if (this.comparator.compare(this.array[var3].getKey(), (K)var2.getKey()) <= 0) {
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
   protected void fixdown(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var3 = this.array[var1];

      int var2;
      while ((var2 = this.d * (var1 - 1) + 2) <= this.size) {
         int var4 = var2;

         for (int var5 = 1; var5 < this.d && var2 + var5 <= this.size; var5++) {
            if (((Comparable)this.array[var4].getKey()).compareTo(this.array[var2 + var5].getKey()) > 0) {
               var4 = var2 + var5;
            }
         }

         if (((Comparable)var3.getKey()).compareTo(this.array[var4].getKey()) <= 0) {
            break;
         }

         this.array[var1] = this.array[var4];
         this.array[var1].index = var1;
         var1 = var4;
      }

      this.array[var1] = var3;
      var3.index = var1;
   }

   @Override
   protected void fixdownWithComparator(int var1) {
      AbstractArrayAddressableHeap.ArrayHandle var3 = this.array[var1];

      int var2;
      while ((var2 = this.d * (var1 - 1) + 2) <= this.size) {
         int var4 = var2;

         for (int var5 = 1; var5 < this.d && var2 + var5 <= this.size; var5++) {
            if (this.comparator.compare(this.array[var4].getKey(), this.array[var2 + var5].getKey()) > 0) {
               var4 = var2 + var5;
            }
         }

         if (this.comparator.compare((K)var3.getKey(), this.array[var4].getKey()) <= 0) {
            break;
         }

         this.array[var1] = this.array[var4];
         this.array[var1].index = var1;
         var1 = var4;
      }

      this.array[var1] = var3;
      var3.index = var1;
   }
}
