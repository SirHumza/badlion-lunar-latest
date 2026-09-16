package org.jheaps.array;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.ValueHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class BinaryArrayIntegerValueHeap<V> implements Serializable, ValueHeap<Integer, V> {
   private static final long serialVersionUID = 1L;
   public static final int DEFAULT_HEAP_CAPACITY = 16;
   private static final int SUP_KEY = Integer.MAX_VALUE;
   private static final int INF_KEY = Integer.MIN_VALUE;
   private static final int MAX_HEAP_CAPACITY = 2147483638;
   private static final int MIN_HEAP_CAPACITY = 0;
   private BinaryArrayIntegerValueHeap.Elem<V>[] array;
   private int size;
   private int minCapacity;

   public BinaryArrayIntegerValueHeap() {
      this(16);
   }

   public BinaryArrayIntegerValueHeap(int var1) {
      this.checkCapacity(var1);
      this.minCapacity = Math.max(var1, 16);
      this.array = (BinaryArrayIntegerValueHeap.Elem<V>[])Array.newInstance(BinaryArrayIntegerValueHeap.Elem.class, this.minCapacity + 2);
      this.array[0] = new BinaryArrayIntegerValueHeap.Elem<>(Integer.MIN_VALUE, null);

      for (int var2 = 1; var2 < this.minCapacity + 2; var2++) {
         this.array[var2] = new BinaryArrayIntegerValueHeap.Elem<>(Integer.MAX_VALUE, null);
      }

      this.size = 0;
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

   @ConstantTime
   @Override
   public void clear() {
      this.size = 0;
   }

   @Override
   public Comparator<? super Integer> comparator() {
      return null;
   }

   @ConstantTime
   public Integer findMin() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      } else {
         return this.array[1].key;
      }
   }

   @ConstantTime
   @Override
   public V findMinValue() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      } else {
         return this.array[1].value;
      }
   }

   @LogarithmicTime
   public void insert(Integer var1, V var2) {
      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      if (this.size == this.array.length - 2) {
         if (this.array.length == 2) {
            this.ensureCapacity(1);
         } else {
            this.ensureCapacity(2 * (this.array.length - 2));
         }
      }

      this.size++;
      int var3 = this.size;
      int var4 = var3 >> 1;

      for (BinaryArrayIntegerValueHeap.Elem var5 = this.array[var4]; var5.key > var1; var5 = this.array[var4]) {
         this.array[var3].key = var5.key;
         this.array[var3].value = var5.value;
         var3 = var4;
         var4 >>= 1;
      }

      this.array[var3].key = var1;
      this.array[var3].value = (V)var2;
   }

   @LogarithmicTime
   public void insert(Integer var1) {
      this.insert(var1, null);
   }

   @LogarithmicTime
   public Integer deleteMin() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      }

      Integer var1 = this.array[1].key;
      int var2 = 1;
      int var3 = 2;

      int var4;
      for (var4 = this.size; var3 < var4; var3 <<= 1) {
         int var5 = this.array[var3].key;
         int var6 = this.array[var3 + 1].key;
         if (var5 > var6) {
            var3++;
            this.array[var2].key = var6;
            this.array[var2].value = this.array[var3].value;
         } else {
            this.array[var2].key = var5;
            this.array[var2].value = this.array[var3].value;
         }

         var2 = var3;
      }

      int var8 = this.array[var4].key;

      for (int var9 = var2 >> 1; this.array[var9].key > var8; var9 >>= 1) {
         this.array[var2].key = this.array[var9].key;
         this.array[var2].value = this.array[var9].value;
         var2 = var9;
      }

      this.array[var2].key = var8;
      this.array[var2].value = this.array[var4].value;
      this.array[this.size].key = Integer.MAX_VALUE;
      this.array[this.size].value = null;
      this.size = var4 - 1;
      int var7 = this.array.length - 2;
      if (2 * this.minCapacity <= var7 && 4 * this.size < var7) {
         this.ensureCapacity(var7 / 2);
      }

      return var1;
   }

   private void ensureCapacity(int var1) {
      this.checkCapacity(var1);
      BinaryArrayIntegerValueHeap.Elem[] var2 = (BinaryArrayIntegerValueHeap.Elem[])Array.newInstance(BinaryArrayIntegerValueHeap.Elem.class, var1 + 2);
      if (var2.length >= this.array.length) {
         System.arraycopy(this.array, 0, var2, 0, this.array.length);

         for (int var3 = this.array.length; var3 < var2.length; var3++) {
            var2[var3] = new BinaryArrayIntegerValueHeap.Elem(Integer.MAX_VALUE, null);
         }
      } else {
         System.arraycopy(this.array, 0, var2, 0, var2.length);
      }

      this.array = var2;
   }

   private void checkCapacity(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Heap capacity must be >= 0");
      }

      if (var1 > 2147483638) {
         throw new IllegalArgumentException("Heap capacity too large");
      }
   }

   private static class Elem<V> implements Serializable {
      private static final long serialVersionUID = 1L;
      int key;
      V value;

      public Elem(Integer var1, V var2) {
         this.key = var1;
         this.value = (V)var2;
      }
   }
}
