package org.jheaps.array;

import java.util.Comparator;
import org.jheaps.annotations.LinearTime;

public class BinaryArrayHeap<K> extends AbstractArrayHeap<K> {
   private static final long serialVersionUID = 1L;
   public static final int DEFAULT_HEAP_CAPACITY = 16;

   public BinaryArrayHeap() {
      super(null, 16);
   }

   public BinaryArrayHeap(int var1) {
      super(null, var1);
   }

   public BinaryArrayHeap(Comparator<? super K> var1) {
      super(var1, 16);
   }

   public BinaryArrayHeap(Comparator<? super K> var1, int var2) {
      super(var1, var2);
   }

   @LinearTime
   public static <K> BinaryArrayHeap<K> heapify(K[] var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var0.length == 0) {
         return new BinaryArrayHeap<>();
      }

      BinaryArrayHeap var1 = new BinaryArrayHeap(var0.length);
      System.arraycopy(var0, 0, var1.array, 1, var0.length);
      var1.size = var0.length;

      for (int var2 = var0.length / 2; var2 > 0; var2--) {
         var1.fixdown(var2);
      }

      return var1;
   }

   @LinearTime
   public static <K> BinaryArrayHeap<K> heapify(K[] var0, Comparator<? super K> var1) {
      if (var0 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var0.length == 0) {
         return new BinaryArrayHeap<>(var1);
      }

      BinaryArrayHeap var2 = new BinaryArrayHeap(var1, var0.length);
      System.arraycopy(var0, 0, var2.array, 1, var0.length);
      var2.size = var0.length;

      for (int var3 = var0.length / 2; var3 > 0; var3--) {
         var2.fixdownWithComparator(var3);
      }

      return var2;
   }

   @Override
   protected void ensureCapacity(int var1) {
      this.checkCapacity(var1);
      Object[] var2 = new Object[var1 + 1];
      System.arraycopy(this.array, 1, var2, 1, this.size);
      this.array = (K[])var2;
   }

   @Override
   protected void fixup(int var1) {
      Object var2;
      for (var2 = this.array[var1]; var1 > 1 && ((Comparable)this.array[var1 >> 1]).compareTo(var2) > 0; var1 >>= 1) {
         this.array[var1] = this.array[var1 >> 1];
      }

      this.array[var1] = (K)var2;
   }

   @Override
   protected void fixupWithComparator(int var1) {
      Object var2;
      for (var2 = this.array[var1]; var1 > 1 && this.comparator.compare(this.array[var1 >> 1], (K)var2) > 0; var1 >>= 1) {
         this.array[var1] = this.array[var1 >> 1];
      }

      this.array[var1] = (K)var2;
   }

   @Override
   protected void fixdown(int var1) {
      Object var2 = this.array[var1];

      while (2 * var1 <= this.size) {
         int var3 = 2 * var1;
         if (var3 < this.size && ((Comparable)this.array[var3]).compareTo(this.array[var3 + 1]) > 0) {
            var3++;
         }

         if (((Comparable)var2).compareTo(this.array[var3]) <= 0) {
            break;
         }

         this.array[var1] = this.array[var3];
         var1 = var3;
      }

      this.array[var1] = (K)var2;
   }

   @Override
   protected void fixdownWithComparator(int var1) {
      Object var2 = this.array[var1];

      while (2 * var1 <= this.size) {
         int var3 = 2 * var1;
         if (var3 < this.size && this.comparator.compare(this.array[var3], this.array[var3 + 1]) > 0) {
            var3++;
         }

         if (this.comparator.compare((K)var2, this.array[var3]) <= 0) {
            break;
         }

         this.array[var1] = this.array[var3];
         var1 = var3;
      }

      this.array[var1] = (K)var2;
   }
}
