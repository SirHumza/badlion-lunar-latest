package org.jheaps.tree;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class RankPairingHeap<K, V> implements Serializable, MergeableAddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private static final int AUX_BUCKET_ARRAY_SIZE = 65;
   private final Comparator<? super K> comparator;
   private RankPairingHeap.Node<K, V> minRoot = null;
   private long size;
   private RankPairingHeap.Node<K, V>[] aux;
   private RankPairingHeap<K, V> other;

   @ConstantTime
   public RankPairingHeap() {
      this(null);
   }

   @ConstantTime
   public RankPairingHeap(Comparator<? super K> var1) {
      this.comparator = var1;
      this.size = 0L;
      this.aux = (RankPairingHeap.Node<K, V>[])Array.newInstance(RankPairingHeap.Node.class, 65);
      this.other = this;
   }

   @ConstantTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1, V var2) {
      if (this.other != this) {
         throw new IllegalStateException("A heap cannot be used after a meld");
      }

      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      RankPairingHeap.Node var3 = new RankPairingHeap.Node<>(this, (K)var1, (V)var2);
      if (this.minRoot == null) {
         var3.r = var3;
         this.minRoot = var3;
      } else {
         var3.r = this.minRoot.r;
         this.minRoot.r = var3;
         if (this.less(var3, this.minRoot)) {
            this.minRoot = var3;
         }
      }

      this.size++;
      return var3;
   }

   @ConstantTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
   }

   @ConstantTime(amortized = false)
   @Override
   public AddressableHeap.Handle<K, V> findMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      } else {
         return this.minRoot;
      }
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      RankPairingHeap.Node var1 = this.minRoot;
      RankPairingHeap.Node var2 = null;
      if (this.minRoot.l != null) {
         var2 = this.severSpine(this.minRoot.l);
         this.minRoot.l = null;
      }

      int var3 = -1;
      RankPairingHeap.Node var4 = null;

      while (var2 != null) {
         RankPairingHeap.Node var5;
         if (var2.r == var2) {
            var5 = var2;
            var2 = null;
         } else {
            var5 = var2.r;
            var2.r = var5.r;
         }

         var5.r = null;
         int var6 = var5.rank;
         RankPairingHeap.Node var7 = this.aux[var6];
         if (var7 == null) {
            this.aux[var6] = var5;
            if (var6 > var3) {
               var3 = var6;
            }
         } else {
            this.aux[var6] = null;
            var5 = this.link(var5, var7);
            if (var4 == null) {
               var5.r = var5;
               var4 = var5;
            } else {
               var5.r = var4.r;
               var4.r = var5;
               if (this.less(var5, var4)) {
                  var4 = var5;
               }
            }
         }
      }

      while (this.minRoot != null) {
         RankPairingHeap.Node var9;
         if (this.minRoot.r == this.minRoot) {
            var9 = this.minRoot;
            this.minRoot = null;
         } else {
            var9 = this.minRoot.r;
            this.minRoot.r = var9.r;
         }

         var9.r = null;
         if (var9 != var1) {
            int var12 = var9.rank;
            RankPairingHeap.Node var14 = this.aux[var12];
            if (var14 == null) {
               this.aux[var12] = var9;
               if (var12 > var3) {
                  var3 = var12;
               }
            } else {
               this.aux[var12] = null;
               var9 = this.link(var9, var14);
               if (var4 == null) {
                  var9.r = var9;
                  var4 = var9;
               } else {
                  var9.r = var4.r;
                  var4.r = var9;
                  if (this.less(var9, var4)) {
                     var4 = var9;
                  }
               }
            }
         }
      }

      for (int var11 = 0; var11 <= var3; var11++) {
         RankPairingHeap.Node var13 = this.aux[var11];
         if (var13 != null) {
            this.aux[var11] = null;
            if (var4 == null) {
               var13.r = var13;
               var4 = var13;
            } else {
               var13.r = var4.r;
               var4.r = var13;
               if (this.less(var13, var4)) {
                  var4 = var13;
               }
            }
         }
      }

      this.minRoot = var4;
      this.size--;
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
   public Comparator<? super K> comparator() {
      return this.comparator;
   }

   @ConstantTime(amortized = false)
   @Override
   public void clear() {
      this.minRoot = null;
      this.size = 0L;
   }

   @ConstantTime
   @Override
   public void meld(MergeableAddressableHeap<K, V> var1) {
      RankPairingHeap var2 = (RankPairingHeap)var1;
      if (this.comparator != null) {
         if (var2.comparator == null || !var2.comparator.equals(this.comparator)) {
            throw new IllegalArgumentException("Cannot meld heaps using different comparators!");
         }
      } else if (var2.comparator != null) {
         throw new IllegalArgumentException("Cannot meld heaps using different comparators!");
      }

      if (var2.other != var2) {
         throw new IllegalStateException("A heap cannot be used after a meld.");
      }

      if (this.minRoot == null) {
         this.minRoot = var2.minRoot;
      } else if (var2.minRoot != null) {
         RankPairingHeap.Node var3 = this.minRoot.r;
         RankPairingHeap.Node var4 = var2.minRoot.r;
         this.minRoot.r = var4;
         var2.minRoot.r = var3;
         if (this.less(var2.minRoot, this.minRoot)) {
            this.minRoot = var2.minRoot;
         }
      }

      this.size = this.size + var2.size;
      var2.size = 0L;
      var2.minRoot = null;
      var2.other = this;
   }

   private void forceDecreaseKeyToMinimum(RankPairingHeap.Node<K, V> var1) {
      if (var1.p == null) {
         this.minRoot = var1;
      } else {
         RankPairingHeap.Node var2 = var1.p;
         this.cut(var1);
         if (this.minRoot == null) {
            var1.r = var1;
         } else {
            var1.r = this.minRoot.r;
            this.minRoot.r = var1;
         }

         this.minRoot = var1;
         var1.rank = var1.l == null ? 0 : var1.l.rank + 1;
         this.restoreType1Ranks(var2);
      }
   }

   private void decreaseKey(RankPairingHeap.Node<K, V> var1, K var2) {
      int var3;
      if (this.comparator == null) {
         var3 = ((Comparable)var2).compareTo(var1.key);
      } else {
         var3 = this.comparator.compare((K)var2, var1.key);
      }

      if (var3 > 0) {
         throw new IllegalArgumentException("Keys can only be decreased!");
      }

      var1.key = (K)var2;
      if (var3 != 0) {
         if (var1.p == null && var1.r == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         if (var1.p == null) {
            if (this.less(var1, this.minRoot)) {
               this.minRoot = var1;
            }
         } else {
            RankPairingHeap.Node var4 = var1.p;
            this.cut(var1);
            if (this.minRoot == null) {
               var1.r = var1;
               this.minRoot = var1;
            } else {
               var1.r = this.minRoot.r;
               this.minRoot.r = var1;
               if (this.less(var1, this.minRoot)) {
                  this.minRoot = var1;
               }
            }

            var1.rank = var1.l == null ? 0 : var1.l.rank + 1;
            this.restoreType1Ranks(var4);
         }
      }
   }

   private boolean less(RankPairingHeap.Node<K, V> var1, RankPairingHeap.Node<K, V> var2) {
      return this.comparator == null ? ((Comparable)var1.key).compareTo(var2.key) < 0 : this.comparator.compare(var1.key, var2.key) < 0;
   }

   private RankPairingHeap.Node<K, V> severSpine(RankPairingHeap.Node<K, V> var1) {
      RankPairingHeap.Node var2;
      for (var2 = var1; var2.r != null; var2 = var2.r) {
         var2.p = null;
         if (var2.l == null) {
            var2.rank = 0;
         } else {
            var2.rank = var2.l.rank + 1;
         }
      }

      var2.p = null;
      if (var2.l == null) {
         var2.rank = 0;
      } else {
         var2.rank = var2.l.rank + 1;
      }

      var2.r = var1;
      return var1;
   }

   private RankPairingHeap.Node<K, V> link(RankPairingHeap.Node<K, V> var1, RankPairingHeap.Node<K, V> var2) {
      assert var1.rank == var2.rank;
      int var3;
      if (this.comparator == null) {
         var3 = ((Comparable)var1.key).compareTo(var2.key);
      } else {
         var3 = this.comparator.compare(var1.key, var2.key);
      }

      if (var3 <= 0) {
         var2.r = var1.l;
         if (var1.l != null) {
            var1.l.p = var2;
         }

         var1.l = var2;
         var2.p = var1;
         var1.rank++;
         return var1;
      } else {
         var1.r = var2.l;
         if (var2.l != null) {
            var2.l.p = var1;
         }

         var2.l = var1;
         var1.p = var2;
         var2.rank++;
         return var2;
      }
   }

   private void cut(RankPairingHeap.Node<K, V> var1) {
      RankPairingHeap.Node var2 = var1.p;
      assert var2 != null;
      RankPairingHeap.Node var3 = var1.r;
      if (var2.l == var1) {
         var2.l = var3;
      } else {
         var2.r = var3;
      }

      if (var3 != null) {
         var3.p = var2;
      }

      var1.p = null;
      var1.r = var1;
   }

   private void restoreType1Ranks(RankPairingHeap.Node<K, V> var1) {
      while (var1 != null) {
         int var2 = var1.l == null ? -1 : var1.l.rank;
         if (var1.p == null) {
            var1.rank = var2 + 1;
         } else {
            int var3 = var1.r == null ? -1 : var1.r.rank;
            int var4 = var2 == var3 ? var2 + 1 : Math.max(var2, var3);
            if (var4 < var1.rank) {
               var1.rank = var4;
               var1 = var1.p;
               continue;
            }
         }
         break;
      }
   }

   static class Node<K, V> implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      RankPairingHeap<K, V> heap;
      K key;
      V value;
      RankPairingHeap.Node<K, V> p;
      RankPairingHeap.Node<K, V> l;
      RankPairingHeap.Node<K, V> r;
      int rank;

      Node(RankPairingHeap<K, V> var1, K var2, V var3) {
         this.heap = var1;
         this.key = (K)var2;
         this.value = (V)var3;
         this.p = null;
         this.l = null;
         this.r = null;
         this.rank = 0;
      }

      @Override
      public K getKey() {
         return this.key;
      }

      @Override
      public V getValue() {
         return this.value;
      }

      @Override
      public void setValue(V var1) {
         this.value = (V)var1;
      }

      @ConstantTime(amortized = true)
      @Override
      public void decreaseKey(K var1) {
         this.getOwner().decreaseKey(this, (K)var1);
      }

      @LogarithmicTime(amortized = true)
      @Override
      public void delete() {
         if (this.p == null && this.r == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         RankPairingHeap var1 = this.getOwner();
         var1.forceDecreaseKeyToMinimum(this);
         var1.deleteMin();
      }

      RankPairingHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            RankPairingHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            RankPairingHeap var2 = this.heap;

            while (var2.other != var1) {
               RankPairingHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }
}
