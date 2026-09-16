package org.jheaps.monotone;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import org.jheaps.Heap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

abstract class AbstractRadixHeap<K> implements Serializable, Heap<K> {
   private static final long serialVersionUID = 1L;
   protected static final int EMPTY = -1;
   protected List<K>[] buckets;
   protected long size;
   protected K lastDeletedKey;
   protected K currentMin;
   protected int currentMinBucket;
   protected int currentMinPos;
   protected K minKey;
   protected K maxKey;

   @ConstantTime
   @Override
   public K findMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      } else {
         return this.currentMin;
      }
   }

   @ConstantTime(amortized = true)
   @Override
   public void insert(K var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Null keys not permitted");
      }

      if (this.compare((K)var1, this.maxKey) > 0) {
         throw new IllegalArgumentException("Key is more than the maximum allowed key");
      }

      if (this.compare((K)var1, this.lastDeletedKey) < 0) {
         throw new IllegalArgumentException("Invalid key. Monotone heap.");
      }

      int var2 = this.computeBucket((K)var1, this.lastDeletedKey);
      this.buckets[var2].add((K)var1);
      if (this.currentMin == null || this.compare((K)var1, this.currentMin) < 0) {
         this.currentMin = (K)var1;
         this.currentMinBucket = var2;
         this.currentMinPos = this.buckets[var2].size() - 1;
      }

      this.size++;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public K deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      this.lastDeletedKey = this.currentMin;
      if (this.currentMinBucket == 0) {
         this.buckets[this.currentMinBucket].remove(this.currentMinPos);
         this.currentMin = null;
         this.currentMinBucket = -1;
         this.currentMinPos = -1;
         if (--this.size > 0L) {
            this.findAndCacheMinimum(0);
         }
      } else {
         Object var1 = null;
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for (Object var6 : this.buckets[this.currentMinBucket]) {
            if (var4 != this.currentMinPos) {
               int var7 = this.computeBucket((K)var6, this.lastDeletedKey);
               assert var7 < this.currentMinBucket;
               this.buckets[var7].add((K)var6);
               if (var1 == null || this.compare((K)var6, (K)var1) < 0) {
                  var1 = var6;
                  var2 = var7;
                  var3 = this.buckets[var7].size() - 1;
               }
            }

            var4++;
         }

         this.buckets[this.currentMinBucket].clear();
         this.currentMin = (K)var1;
         this.currentMinBucket = var2;
         this.currentMinPos = var3;
         if (--this.size > 0L) {
            this.findAndCacheMinimum(this.currentMinBucket + 1);
         }
      }

      return this.lastDeletedKey;
   }

   @ConstantTime
   @Override
   public boolean isEmpty() {
      return this.size == 0L;
   }

   @ConstantTime
   @Override
   public long size() {
      return this.size;
   }

   @Override
   public void clear() {
      for (List var4 : this.buckets) {
         var4.clear();
      }

      this.size = 0L;
      this.lastDeletedKey = this.minKey;
      this.currentMin = null;
      this.currentMinBucket = -1;
      this.currentMinPos = -1;
   }

   @Override
   public Comparator<? super K> comparator() {
      return null;
   }

   protected abstract int compare(K var1, K var2);

   protected int computeBucket(K var1, K var2) {
      return 1 + Math.min(this.msd((K)var1, (K)var2), this.buckets.length - 2);
   }

   protected abstract int msd(K var1, K var2);

   private void findAndCacheMinimum(int var1) {
      if (this.currentMin == null) {
         this.currentMinBucket = -1;

         for (int var2 = var1; var2 < this.buckets.length; var2++) {
            if (!this.buckets[var2].isEmpty()) {
               this.currentMinBucket = var2;
               break;
            }
         }

         this.currentMinPos = -1;
         if (this.currentMinBucket >= 0) {
            int var5 = 0;

            for (Object var4 : this.buckets[this.currentMinBucket]) {
               if (this.currentMin == null || this.compare((K)var4, this.currentMin) < 0) {
                  this.currentMin = (K)var4;
                  this.currentMinPos = var5;
               }

               var5++;
            }
         }
      }
   }
}
