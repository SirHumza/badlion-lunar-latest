package org.jheaps.monotone;

import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

abstract class AbstractRadixAddressableHeap<K, V> implements Serializable, AddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   protected static final int EMPTY = -1;
   protected AbstractRadixAddressableHeap<K, V>.Node[] buckets;
   protected long size;
   protected K lastDeletedKey;
   protected AbstractRadixAddressableHeap<K, V>.Node currentMin;
   protected K minKey;
   protected K maxKey;

   @ConstantTime
   @Override
   public AddressableHeap.Handle<K, V> findMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      } else {
         return this.currentMin;
      }
   }

   @ConstantTime
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
   }

   @ConstantTime
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1, V var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("Null keys not permitted");
      }

      if (this.compare((K)var1, this.maxKey) > 0) {
         throw new IllegalArgumentException("Key is more than the maximum allowed key");
      }

      if (this.compare((K)var1, this.lastDeletedKey) < 0) {
         throw new IllegalArgumentException("Invalid key. Monotone heap.");
      }

      AbstractRadixAddressableHeap.Node var3 = new AbstractRadixAddressableHeap.Node(var1, var2);
      int var4 = this.computeBucket((K)var1, this.lastDeletedKey);
      var3.bucket = var4;
      if (this.buckets[var4] == null) {
         this.buckets[var4] = var3;
      } else {
         this.buckets[var4].prev = var3;
         var3.next = this.buckets[var4];
         this.buckets[var4] = var3;
      }

      if (this.currentMin == null || this.compare((K)var1, (K)this.currentMin.key) < 0) {
         this.currentMin = var3;
      }

      this.size++;
      return var3;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      AbstractRadixAddressableHeap.Node var1 = this.currentMin;
      this.lastDeletedKey = (K)this.currentMin.key;
      if (this.currentMin.bucket == 0) {
         AbstractRadixAddressableHeap.Node var2 = this.buckets[this.currentMin.bucket];
         if (this.currentMin.next != null) {
            this.currentMin.next.prev = this.currentMin.prev;
         }

         if (this.currentMin.prev != null) {
            this.currentMin.prev.next = this.currentMin.next;
         }

         if (var2 == this.currentMin) {
            this.currentMin.prev = null;
            this.buckets[this.currentMin.bucket] = this.currentMin.next;
         }

         this.currentMin.next = null;
         this.currentMin.prev = null;
         this.currentMin.bucket = -1;
         this.currentMin = this.buckets[0];
         if (--this.size > 0L) {
            this.findAndCacheMinimum(0);
         }
      } else {
         AbstractRadixAddressableHeap.Node var6 = null;
         int var3 = this.currentMin.bucket;

         for (AbstractRadixAddressableHeap.Node var4 = this.buckets[var3]; var4 != null; var4 = this.buckets[var3]) {
            this.buckets[var3] = var4.next;
            if (this.buckets[var3] != null) {
               this.buckets[var3].prev = null;
            }

            var4.next = null;
            var4.prev = null;
            var4.bucket = -1;
            if (var4 != this.currentMin) {
               int var5 = this.computeBucket((K)var4.key, this.lastDeletedKey);
               assert var5 < var3;
               var4.next = this.buckets[var5];
               if (this.buckets[var5] != null) {
                  this.buckets[var5].prev = var4;
               }

               this.buckets[var5] = var4;
               var4.bucket = var5;
               if (var6 == null || this.compare((K)var4.key, (K)var6.key) < 0) {
                  var6 = var4;
               }
            }
         }

         this.currentMin = var6;
         if (--this.size > 0L) {
            this.findAndCacheMinimum(var3 + 1);
         }
      }

      return var1;
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
      for (int var1 = 0; var1 < this.buckets.length; var1++) {
         this.buckets[var1] = null;
      }

      this.size = 0L;
      this.lastDeletedKey = this.minKey;
      this.currentMin = null;
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
         int var2 = -1;

         for (int var3 = var1; var3 < this.buckets.length; var3++) {
            if (this.buckets[var3] != null) {
               var2 = var3;
               break;
            }
         }

         if (var2 >= 0) {
            for (AbstractRadixAddressableHeap.Node var4 = this.buckets[var2]; var4 != null; var4 = var4.next) {
               if (this.currentMin == null || this.compare((K)var4.key, (K)this.currentMin.key) < 0) {
                  this.currentMin = var4;
               }
            }
         }
      }
   }

   protected class Node implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      Object key;
      Object value;
      AbstractRadixAddressableHeap<K, V>.Node next;
      AbstractRadixAddressableHeap<K, V>.Node prev;
      int bucket;

      public Node(K var2, V var3) {
         this.key = var2;
         this.value = var3;
         this.next = null;
         this.prev = null;
         this.bucket = -1;
      }

      @Override
      public K getKey() {
         return (K)this.key;
      }

      @Override
      public V getValue() {
         return (V)this.value;
      }

      @Override
      public void setValue(V var1) {
         this.value = var1;
      }

      @Override
      public void decreaseKey(K var1) {
         if (AbstractRadixAddressableHeap.this.size == 0L) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         if (this.bucket == -1) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         if (AbstractRadixAddressableHeap.this.compare((K)var1, AbstractRadixAddressableHeap.this.lastDeletedKey) < 0) {
            throw new IllegalArgumentException("Invalid key. Monotone heap.");
         }

         int var2 = AbstractRadixAddressableHeap.this.compare((K)var1, (K)this.key);
         if (var2 > 0) {
            throw new IllegalArgumentException("Keys can only be decreased!");
         }

         this.key = var1;
         if (var2 != 0) {
            if (this == AbstractRadixAddressableHeap.this.currentMin
               || AbstractRadixAddressableHeap.this.compare((K)this.key, (K)AbstractRadixAddressableHeap.this.currentMin.key) < 0) {
               AbstractRadixAddressableHeap.this.currentMin = this;
            }

            int var3 = AbstractRadixAddressableHeap.this.computeBucket((K)this.key, AbstractRadixAddressableHeap.this.lastDeletedKey);
            if (var3 != this.bucket) {
               AbstractRadixAddressableHeap.Node var4 = AbstractRadixAddressableHeap.this.buckets[this.bucket];
               if (this.next != null) {
                  this.next.prev = this.prev;
               }

               if (this.prev != null) {
                  this.prev.next = this.next;
               }

               if (var4 == this) {
                  this.prev = null;
                  AbstractRadixAddressableHeap.this.buckets[this.bucket] = this.next;
               }

               if (AbstractRadixAddressableHeap.this.buckets[var3] == null) {
                  AbstractRadixAddressableHeap.this.buckets[var3] = this;
                  this.next = null;
               } else {
                  AbstractRadixAddressableHeap.this.buckets[var3].prev = this;
                  this.next = AbstractRadixAddressableHeap.this.buckets[var3];
                  AbstractRadixAddressableHeap.this.buckets[var3] = this;
               }

               this.prev = null;
               this.bucket = var3;
            }
         }
      }

      @Override
      public void delete() {
         if (AbstractRadixAddressableHeap.this.size == 0L || this.bucket == -1) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         if (this == AbstractRadixAddressableHeap.this.currentMin) {
            AbstractRadixAddressableHeap.this.deleteMin();
         } else {
            AbstractRadixAddressableHeap.Node var1 = AbstractRadixAddressableHeap.this.buckets[this.bucket];
            if (this.next != null) {
               this.next.prev = this.prev;
            }

            if (this.prev != null) {
               this.prev.next = this.next;
            }

            if (var1 == this) {
               AbstractRadixAddressableHeap.this.buckets[this.bucket] = this.next;
            }

            this.prev = null;
            this.next = null;
            this.bucket = -1;
            AbstractRadixAddressableHeap.this.size--;
         }
      }
   }
}
