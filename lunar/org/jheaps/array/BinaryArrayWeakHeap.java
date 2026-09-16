package org.jheaps.array;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LinearTime;
import org.jheaps.annotations.LogarithmicTime;

public class BinaryArrayWeakHeap<K> extends AbstractArrayWeakHeap<K> implements Serializable {
   private static final long serialVersionUID = 7721391024028836146L;
   public static final int DEFAULT_HEAP_CAPACITY = 16;
   protected BitSet reverse;

   public BinaryArrayWeakHeap() {
      super(null, 16);
   }

   public BinaryArrayWeakHeap(int var1) {
      super(null, var1);
   }

   public BinaryArrayWeakHeap(Comparator<? super K> var1) {
      super(var1, 16);
   }

   public BinaryArrayWeakHeap(Comparator<? super K> var1, int var2) {
      super(var1, var2);
   }

   @LinearTime
   public static <K> BinaryArrayWeakHeap<K> heapify(K[] var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var0.length == 0) {
         return new BinaryArrayWeakHeap<>();
      }

      BinaryArrayWeakHeap var1 = new BinaryArrayWeakHeap(var0.length);
      System.arraycopy(var0, 0, var1.array, 0, var0.length);
      var1.size = var0.length;

      for (int var2 = var1.size - 1; var2 > 0; var2--) {
         var1.join(var1.dancestor(var2), var2);
      }

      return var1;
   }

   @LinearTime
   public static <K> BinaryArrayWeakHeap<K> heapify(K[] var0, Comparator<? super K> var1) {
      if (var0 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var0.length == 0) {
         return new BinaryArrayWeakHeap<>(var1);
      }

      BinaryArrayWeakHeap var2 = new BinaryArrayWeakHeap(var1, var0.length);
      System.arraycopy(var0, 0, var2.array, 0, var0.length);
      var2.size = var0.length;

      for (int var3 = var2.size - 1; var3 > 0; var3--) {
         var2.joinWithComparator(var2.dancestor(var3), var3);
      }

      return var2;
   }

   @ConstantTime
   @Override
   public K findMin() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      } else {
         return this.array[0];
      }
   }

   @LogarithmicTime(amortized = true)
   @Override
   public void insert(K var1) {
      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      if (this.size == this.array.length) {
         if (this.size == 0) {
            this.ensureCapacity(1);
         } else {
            this.ensureCapacity(2 * this.array.length);
         }
      }

      this.array[this.size] = (K)var1;
      this.reverse.clear(this.size);
      if (this.size % 2 == 0) {
         this.reverse.clear(this.size / 2);
      }

      if (this.comparator == null) {
         this.fixup(this.size);
      } else {
         this.fixupWithComparator(this.size);
      }

      this.size++;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public K deleteMin() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      }

      Object var1 = this.array[0];
      this.size--;
      this.array[0] = this.array[this.size];
      this.array[this.size] = null;
      if (this.size > 1) {
         if (this.comparator == null) {
            this.fixdown(0);
         } else {
            this.fixdownWithComparator(0);
         }
      }

      if (2 * this.minCapacity <= this.array.length && 4 * this.size < this.array.length) {
         this.ensureCapacity(this.array.length / 2);
      }

      return (K)var1;
   }

   @Override
   protected void initCapacity(int var1) {
      this.array = (K[])(new Object[var1]);
      this.reverse = new BitSet(var1);
   }

   @Override
   protected void ensureCapacity(int var1) {
      this.checkCapacity(var1);
      Object[] var2 = new Object[var1];
      System.arraycopy(this.array, 0, var2, 0, this.size);
      this.array = (K[])var2;
      BitSet var3 = new BitSet(var1);
      var3.or(this.reverse);
      this.reverse = var3;
   }

   protected int dancestor(int var1) {
      while (var1 % 2 == 1 == this.reverse.get(var1 / 2)) {
         var1 /= 2;
      }

      return var1 / 2;
   }

   protected boolean join(int var1, int var2) {
      if (((Comparable)this.array[var2]).compareTo(this.array[var1]) < 0) {
         Object var3 = this.array[var1];
         this.array[var1] = this.array[var2];
         this.array[var2] = (K)var3;
         this.reverse.flip(var2);
         return false;
      } else {
         return true;
      }
   }

   protected boolean joinWithComparator(int var1, int var2) {
      if (this.comparator.compare(this.array[var2], this.array[var1]) < 0) {
         Object var3 = this.array[var1];
         this.array[var1] = this.array[var2];
         this.array[var2] = (K)var3;
         this.reverse.flip(var2);
         return false;
      } else {
         return true;
      }
   }

   @Override
   protected void fixup(int var1) {
      while (var1 > 0) {
         int var2 = this.dancestor(var1);
         if (!this.join(var2, var1)) {
            var1 = var2;
            continue;
         }
         break;
      }
   }

   @Override
   protected void fixupWithComparator(int var1) {
      while (var1 > 0) {
         int var2 = this.dancestor(var1);
         if (!this.joinWithComparator(var2, var1)) {
            var1 = var2;
            continue;
         }
         break;
      }
   }

   @Override
   protected void fixdown(int var1) {
      int var2 = 2 * var1 + (this.reverse.get(var1) ? 0 : 1);

      int var3;
      while ((var3 = 2 * var2 + (this.reverse.get(var2) ? 1 : 0)) < this.size) {
         var2 = var3;
      }

      while (var2 != var1) {
         this.join(var1, var2);
         var2 /= 2;
      }
   }

   @Override
   protected void fixdownWithComparator(int var1) {
      int var2 = 2 * var1 + (this.reverse.get(var1) ? 0 : 1);

      int var3;
      while ((var3 = 2 * var2 + (this.reverse.get(var2) ? 1 : 0)) < this.size) {
         var2 = var3;
      }

      while (var2 != var1) {
         this.joinWithComparator(var1, var2);
         var2 /= 2;
      }
   }
}
