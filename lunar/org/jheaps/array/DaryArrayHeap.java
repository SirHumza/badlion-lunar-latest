package org.jheaps.array;

import java.util.Comparator;
import org.jheaps.annotations.LinearTime;

public class DaryArrayHeap<K> extends AbstractArrayHeap<K> {
   private static final long serialVersionUID = 1L;
   public static final int DEFAULT_HEAP_CAPACITY = 16;
   protected int d;

   public DaryArrayHeap(int var1) {
      this(var1, null, 16);
   }

   public DaryArrayHeap(int var1, int var2) {
      this(var1, null, var2);
   }

   public DaryArrayHeap(int var1, Comparator<? super K> var2) {
      this(var1, var2, 16);
   }

   public DaryArrayHeap(int var1, Comparator<? super K> var2, int var3) {
      super(var2, var3);
      if (var1 < 2) {
         throw new IllegalArgumentException("D-ary heaps must have at least 2 children per node");
      }

      this.d = var1;
   }

   @LinearTime
   public static <K> DaryArrayHeap<K> heapify(int var0, K[] var1) {
      if (var0 < 2) {
         throw new IllegalArgumentException("D-ary heaps must have at least 2 children per node");
      }

      if (var1 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var1.length == 0) {
         return new DaryArrayHeap<>(var0);
      }

      DaryArrayHeap var2 = new DaryArrayHeap(var0, var1.length);
      System.arraycopy(var1, 0, var2.array, 1, var1.length);
      var2.size = var1.length;

      for (int var3 = var1.length / var0; var3 > 0; var3--) {
         var2.fixdown(var3);
      }

      return var2;
   }

   @LinearTime
   public static <K> DaryArrayHeap<K> heapify(int var0, K[] var1, Comparator<? super K> var2) {
      if (var0 < 2) {
         throw new IllegalArgumentException("D-ary heaps must have at least 2 children per node");
      }

      if (var1 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var1.length == 0) {
         return new DaryArrayHeap<>(var0, var2);
      }

      DaryArrayHeap var3 = new DaryArrayHeap(var0, var2, var1.length);
      System.arraycopy(var1, 0, var3.array, 1, var1.length);
      var3.size = var1.length;

      for (int var4 = var1.length / var0; var4 > 0; var4--) {
         var3.fixdownWithComparator(var4);
      }

      return var3;
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
      Object var2 = this.array[var1];

      while (var1 > 1) {
         int var3 = (var1 - 2) / this.d + 1;
         if (((Comparable)this.array[var3]).compareTo(var2) <= 0) {
            break;
         }

         this.array[var1] = this.array[var3];
         var1 = var3;
      }

      this.array[var1] = (K)var2;
   }

   @Override
   protected void fixupWithComparator(int var1) {
      Object var2 = this.array[var1];

      while (var1 > 1) {
         int var3 = (var1 - 2) / this.d + 1;
         if (this.comparator.compare(this.array[var3], (K)var2) <= 0) {
            break;
         }

         this.array[var1] = this.array[var3];
         var1 = var3;
      }

      this.array[var1] = (K)var2;
   }

   @Override
   protected void fixdown(int var1) {
      Object var3 = this.array[var1];

      int var2;
      while ((var2 = this.d * (var1 - 1) + 2) <= this.size) {
         int var4 = var2;

         for (int var5 = 1; var5 < this.d; var5++) {
            if (var2 + var5 <= this.size && ((Comparable)this.array[var4]).compareTo(this.array[var2 + var5]) > 0) {
               var4 = var2 + var5;
            }
         }

         if (((Comparable)var3).compareTo(this.array[var4]) <= 0) {
            break;
         }

         this.array[var1] = this.array[var4];
         var1 = var4;
      }

      this.array[var1] = (K)var3;
   }

   @Override
   protected void fixdownWithComparator(int var1) {
      Object var3 = this.array[var1];

      int var2;
      while ((var2 = this.d * (var1 - 1) + 2) <= this.size) {
         int var4 = var2;

         for (int var5 = 1; var5 < this.d; var5++) {
            if (var2 + var5 <= this.size && this.comparator.compare(this.array[var4], this.array[var2 + var5]) > 0) {
               var4 = var2 + var5;
            }
         }

         if (this.comparator.compare((K)var3, this.array[var4]) <= 0) {
            break;
         }

         this.array[var1] = this.array[var4];
         var1 = var4;
      }

      this.array[var1] = (K)var3;
   }
}
