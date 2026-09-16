package org.jheaps.array;

import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

abstract class AbstractArrayHeap<K> extends AbstractArrayWeakHeap<K> {
   private static final long serialVersionUID = 1L;

   public AbstractArrayHeap(Comparator<? super K> var1, int var2) {
      super(var1, var2);
   }

   @Override
   protected void initCapacity(int var1) {
      this.array = (K[])(new Object[var1 + 1]);
   }

   @ConstantTime
   @Override
   public K findMin() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      } else {
         return this.array[1];
      }
   }

   @LogarithmicTime(amortized = true)
   @Override
   public void insert(K var1) {
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

      this.array[++this.size] = (K)var1;
      if (this.comparator == null) {
         this.fixup(this.size);
      } else {
         this.fixupWithComparator(this.size);
      }
   }

   @LogarithmicTime(amortized = true)
   @Override
   public K deleteMin() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      }

      Object var1 = this.array[1];
      if (this.size == 1) {
         this.array[1] = null;
         this.size = 0;
      } else {
         this.array[1] = this.array[this.size];
         this.array[this.size] = null;
         this.size--;
         if (this.comparator == null) {
            this.fixdown(1);
         } else {
            this.fixdownWithComparator(1);
         }
      }

      int var2 = this.array.length - 1;
      if (2 * this.minCapacity <= var2 && 4 * this.size < var2) {
         this.ensureCapacity(var2 / 2);
      }

      return (K)var1;
   }
}
