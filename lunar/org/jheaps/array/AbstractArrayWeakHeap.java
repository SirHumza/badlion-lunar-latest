package org.jheaps.array;

import java.io.Serializable;
import java.util.Comparator;
import org.jheaps.Heap;
import org.jheaps.annotations.ConstantTime;

abstract class AbstractArrayWeakHeap<K> implements Serializable, Heap<K> {
   private static final long serialVersionUID = 1L;
   protected static final int MAX_HEAP_CAPACITY = 2147483638;
   protected static final int MIN_HEAP_CAPACITY = 0;
   protected static final int DOWNSIZING_MIN_HEAP_CAPACITY = 16;
   protected final Comparator<? super K> comparator;
   protected K[] array;
   protected int size;
   protected final int minCapacity;

   public AbstractArrayWeakHeap(Comparator<? super K> var1, int var2) {
      this.checkCapacity(var2);
      this.size = 0;
      this.comparator = var1;
      this.minCapacity = Math.max(var2, 16);
      this.initCapacity(this.minCapacity);
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

   protected final void checkCapacity(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Heap capacity must be >= 0");
      }

      if (var1 > 2147483638) {
         throw new IllegalArgumentException("Heap capacity too large");
      }
   }

   protected abstract void initCapacity(int var1);

   protected abstract void ensureCapacity(int var1);

   protected abstract void fixup(int var1);

   protected abstract void fixupWithComparator(int var1);

   protected abstract void fixdown(int var1);

   protected abstract void fixdownWithComparator(int var1);
}
