package org.jheaps.array;

import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LinearTime;
import org.jheaps.annotations.LogarithmicTime;

public class BinaryArrayBulkInsertWeakHeap<K> extends BinaryArrayWeakHeap<K> implements Serializable {
   private static final long serialVersionUID = 1L;
   protected static final int INSERTION_BUFFER_CAPACITY = 34;
   protected K[] insertionBuffer = (K[])(new Object[34]);
   protected int insertionBufferSize = 0;
   protected int insertionBufferMinPos = 0;

   public BinaryArrayBulkInsertWeakHeap() {
      this(null, 16);
   }

   public BinaryArrayBulkInsertWeakHeap(int var1) {
      this(null, var1);
   }

   public BinaryArrayBulkInsertWeakHeap(Comparator<? super K> var1) {
      this(var1, 16);
   }

   public BinaryArrayBulkInsertWeakHeap(Comparator<? super K> var1, int var2) {
      super(var1, var2);
   }

   @ConstantTime
   @Override
   public boolean isEmpty() {
      return this.size + this.insertionBufferSize == 0;
   }

   @ConstantTime
   @Override
   public long size() {
      return (long)this.size + this.insertionBufferSize;
   }

   @ConstantTime
   @Override
   public void clear() {
      this.size = 0;
      this.insertionBufferSize = 0;
      this.insertionBufferMinPos = 0;
   }

   @ConstantTime
   @Override
   public K findMin() {
      if (this.size + this.insertionBufferSize == 0) {
         throw new NoSuchElementException();
      } else if (this.insertionBufferSize == 0) {
         return this.array[0];
      } else if (this.size == 0) {
         return this.insertionBuffer[this.insertionBufferMinPos];
      } else {
         Object var1 = this.insertionBuffer[this.insertionBufferMinPos];
         if (this.comparator == null) {
            return (K)(((Comparable)this.array[0]).compareTo(var1) <= 0 ? this.array[0] : var1);
         } else {
            return (K)(this.comparator.compare(this.array[0], (K)var1) <= 0 ? this.array[0] : var1);
         }
      }
   }

   @ConstantTime(amortized = true)
   @Override
   public void insert(K var1) {
      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      this.insertionBuffer[this.insertionBufferSize++] = (K)var1;
      if (this.isBulkInsertionBufferFull()) {
         if (this.size + this.insertionBufferSize > this.array.length) {
            if (this.array.length == 0) {
               this.ensureCapacity(1);
            } else {
               this.ensureCapacity(2 * this.array.length);
            }

            this.ensureCapacity(this.size + this.insertionBufferSize);
         }

         if (this.comparator == null) {
            this.bulkInsert();
         } else {
            this.bulkInsertWithComparator();
         }
      } else if (this.insertionBufferSize > 1) {
         Object var2 = this.insertionBuffer[this.insertionBufferMinPos];
         if (this.comparator == null) {
            if (((Comparable)var1).compareTo(var2) < 0) {
               this.insertionBufferMinPos = this.insertionBufferSize - 1;
            }
         } else if (this.comparator.compare((K)var1, (K)var2) < 0) {
            this.insertionBufferMinPos = this.insertionBufferSize - 1;
         }
      }
   }

   @LogarithmicTime(amortized = true)
   @Override
   public K deleteMin() {
      if (this.size + this.insertionBufferSize == 0) {
         throw new NoSuchElementException();
      }

      boolean var1 = false;
      if (this.size == 0) {
         var1 = true;
      } else if (this.insertionBufferSize > 0) {
         Object var2 = this.array[0];
         Object var3 = this.insertionBuffer[this.insertionBufferMinPos];
         if (this.comparator == null) {
            if (((Comparable)var3).compareTo(var2) < 0) {
               var1 = true;
            }
         } else if (this.comparator.compare((K)var3, (K)var2) < 0) {
            var1 = true;
         }
      }

      Object var4;
      if (var1) {
         var4 = this.insertionBuffer[this.insertionBufferMinPos];
         this.insertionBuffer[this.insertionBufferMinPos] = this.insertionBuffer[this.insertionBufferSize - 1];
         this.insertionBuffer[this.insertionBufferSize - 1] = null;
         this.insertionBufferSize--;
         this.insertionBufferMinPos = 0;
         if (this.comparator == null) {
            for (int var5 = 1; var5 < this.insertionBufferSize; var5++) {
               if (((Comparable)this.insertionBuffer[var5]).compareTo(this.insertionBuffer[this.insertionBufferMinPos]) < 0) {
                  this.insertionBufferMinPos = var5;
               }
            }
         } else {
            for (int var6 = 1; var6 < this.insertionBufferSize; var6++) {
               if (this.comparator.compare(this.insertionBuffer[var6], this.insertionBuffer[this.insertionBufferMinPos]) < 0) {
                  this.insertionBufferMinPos = var6;
               }
            }
         }
      } else {
         var4 = this.array[0];
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

         if (this.minCapacity <= this.array.length && 4 * this.size < this.array.length) {
            this.ensureCapacity(this.array.length / 2);
         }
      }

      return (K)var4;
   }

   @LinearTime
   public static <K> BinaryArrayBulkInsertWeakHeap<K> heapify(K[] var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var0.length == 0) {
         return new BinaryArrayBulkInsertWeakHeap<>();
      }

      BinaryArrayBulkInsertWeakHeap var1 = new BinaryArrayBulkInsertWeakHeap(var0.length);
      System.arraycopy(var0, 0, var1.array, 0, var0.length);
      var1.size = var0.length;

      for (int var2 = var1.size - 1; var2 > 0; var2--) {
         var1.join(var1.dancestor(var2), var2);
      }

      return var1;
   }

   @LinearTime
   public static <K> BinaryArrayBulkInsertWeakHeap<K> heapify(K[] var0, Comparator<? super K> var1) {
      if (var0 == null) {
         throw new IllegalArgumentException("Array cannot be null");
      }

      if (var0.length == 0) {
         return new BinaryArrayBulkInsertWeakHeap<>(var1);
      }

      BinaryArrayBulkInsertWeakHeap var2 = new BinaryArrayBulkInsertWeakHeap(var1, var0.length);
      System.arraycopy(var0, 0, var2.array, 0, var0.length);
      var2.size = var0.length;

      for (int var3 = var2.size - 1; var3 > 0; var3--) {
         var2.joinWithComparator(var2.dancestor(var3), var3);
      }

      return var2;
   }

   protected boolean isBulkInsertionBufferFull() {
      if (this.insertionBufferSize >= this.insertionBuffer.length) {
         return true;
      }

      double var1 = (double)this.size + this.insertionBufferSize;
      return Math.getExponent(var1) + 3 >= this.insertionBuffer.length;
   }

   protected void bulkInsert() {
      if (this.insertionBufferSize != 0) {
         int var1 = this.size + this.insertionBufferSize - 2;
         int var2 = Math.max(this.size, var1 / 2);

         while (this.insertionBufferSize > 0) {
            this.insertionBufferSize--;
            this.array[this.size] = this.insertionBuffer[this.insertionBufferSize];
            this.insertionBuffer[this.insertionBufferSize] = null;
            this.reverse.clear(this.size);
            this.size++;
         }

         while (var1 > var2 + 1) {
            var2 /= 2;
            var1 /= 2;

            for (int var3 = var2; var3 <= var1; var3++) {
               this.fixdown(var3);
            }
         }

         if (var2 != 0) {
            int var4 = this.dancestor(var2);
            this.fixdown(var4);
            this.fixup(var4);
         }

         if (var1 != 0) {
            int var5 = this.dancestor(var1);
            this.fixdown(var5);
            this.fixup(var5);
         }

         this.insertionBufferMinPos = 0;
      }
   }

   protected void bulkInsertWithComparator() {
      if (this.insertionBufferSize != 0) {
         int var1 = this.size + this.insertionBufferSize - 2;
         int var2 = Math.max(this.size, var1 / 2);

         while (this.insertionBufferSize > 0) {
            this.insertionBufferSize--;
            this.array[this.size] = this.insertionBuffer[this.insertionBufferSize];
            this.insertionBuffer[this.insertionBufferSize] = null;
            this.reverse.clear(this.size);
            this.size++;
         }

         while (var1 > var2 + 1) {
            var2 /= 2;
            var1 /= 2;

            for (int var3 = var2; var3 <= var1; var3++) {
               this.fixdownWithComparator(var3);
            }
         }

         if (var2 != 0) {
            int var4 = this.dancestor(var2);
            this.fixdownWithComparator(var4);
            this.fixupWithComparator(var4);
         }

         if (var1 != 0) {
            int var5 = this.dancestor(var1);
            this.fixdownWithComparator(var5);
            this.fixupWithComparator(var5);
         }

         this.insertionBufferMinPos = 0;
      }
   }
}
