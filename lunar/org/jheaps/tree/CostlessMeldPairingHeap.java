package org.jheaps.tree;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogLogTime;
import org.jheaps.annotations.LogarithmicTime;

public class CostlessMeldPairingHeap<K, V> implements Serializable, MergeableAddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private static final int DEFAULT_DECREASE_POOL_SIZE = 65;
   private final Comparator<? super K> comparator;
   private CostlessMeldPairingHeap.Node<K, V> root;
   private long size;
   private CostlessMeldPairingHeap.Node<K, V>[] decreasePool = (CostlessMeldPairingHeap.Node<K, V>[])Array.newInstance(CostlessMeldPairingHeap.Node.class, 65);
   private byte decreasePoolSize = 0;
   private byte decreasePoolMinPos = 0;
   private transient Comparator<CostlessMeldPairingHeap.Node<K, V>> decreasePoolComparator;
   private CostlessMeldPairingHeap<K, V> other;

   @ConstantTime
   public CostlessMeldPairingHeap() {
      this(null);
   }

   @ConstantTime
   public CostlessMeldPairingHeap(Comparator<? super K> var1) {
      this.comparator = var1;
      this.decreasePoolComparator = null;
      this.other = this;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1, V var2) {
      if (this.other != this) {
         throw new IllegalStateException("A heap cannot be used after a meld");
      }

      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      CostlessMeldPairingHeap.Node var3 = new CostlessMeldPairingHeap.Node<>(this, (K)var1, (V)var2);
      if (this.comparator == null) {
         this.root = this.link(this.root, var3);
      } else {
         this.root = this.linkWithComparator(this.root, var3);
      }

      this.size++;
      return var3;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
   }

   @ConstantTime
   @Override
   public AddressableHeap.Handle<K, V> findMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      if (this.decreasePoolMinPos >= this.decreasePoolSize) {
         return this.root;
      }

      CostlessMeldPairingHeap.Node var1 = this.decreasePool[this.decreasePoolMinPos];
      int var2;
      if (this.comparator == null) {
         var2 = ((Comparable)this.root.key).compareTo(var1.key);
      } else {
         var2 = this.comparator.compare(this.root.key, var1.key);
      }

      return var2 <= 0 ? this.root : var1;
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

   @ConstantTime
   @Override
   public void clear() {
      this.root = null;
      this.size = 0L;
      this.decreasePool = (CostlessMeldPairingHeap.Node<K, V>[])Array.newInstance(CostlessMeldPairingHeap.Node.class, 65);
      this.decreasePoolSize = 0;
      this.decreasePoolMinPos = 0;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      CostlessMeldPairingHeap.Node var1;
      if (this.decreasePoolMinPos >= this.decreasePoolSize) {
         var1 = this.root;
         this.root = this.combine(this.cutChildren(this.root));
      } else {
         CostlessMeldPairingHeap.Node var2 = this.decreasePool[this.decreasePoolMinPos];
         int var3;
         if (this.comparator == null) {
            var3 = ((Comparable)this.root.key).compareTo(var2.key);
         } else {
            var3 = this.comparator.compare(this.root.key, var2.key);
         }

         if (var3 <= 0) {
            var1 = this.root;
            CostlessMeldPairingHeap.Node var4 = this.combine(this.cutChildren(this.root));
            this.root = null;
            if (var4 != null) {
               this.addPool(var4, false);
            }

            this.consolidate();
         } else {
            var1 = var2;
            CostlessMeldPairingHeap.Node var5 = this.combine(this.cutChildren(var2));
            if (var5 != null) {
               this.decreasePool[this.decreasePoolMinPos] = var5;
               var5.poolIndex = this.decreasePoolMinPos;
            } else {
               this.decreasePool[this.decreasePoolMinPos] = this.decreasePool[this.decreasePoolSize - 1];
               this.decreasePool[this.decreasePoolMinPos].poolIndex = this.decreasePoolMinPos;
               this.decreasePool[this.decreasePoolSize - 1] = null;
               this.decreasePoolSize--;
            }

            var2.poolIndex = -1;
            this.consolidate();
         }
      }

      this.size--;
      return var1;
   }

   @ConstantTime(amortized = true)
   @Override
   public void meld(MergeableAddressableHeap<K, V> var1) {
      CostlessMeldPairingHeap var2 = (CostlessMeldPairingHeap)var1;
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

      if (this.size < var2.size) {
         this.consolidate();
         if (this.comparator == null) {
            this.root = this.link(var2.root, this.root);
         } else {
            this.root = this.linkWithComparator(var2.root, this.root);
         }

         this.decreasePoolSize = var2.decreasePoolSize;
         var2.decreasePoolSize = 0;
         this.decreasePoolMinPos = var2.decreasePoolMinPos;
         var2.decreasePoolMinPos = 0;
         CostlessMeldPairingHeap.Node[] var3 = this.decreasePool;
         this.decreasePool = var2.decreasePool;
         var2.decreasePool = var3;
      } else {
         var2.consolidate();
         if (this.comparator == null) {
            this.root = this.link(var2.root, this.root);
         } else {
            this.root = this.linkWithComparator(var2.root, this.root);
         }
      }

      this.size = this.size + var2.size;
      var2.root = null;
      var2.size = 0L;
      var2.other = this;
   }

   private void decreaseKey(CostlessMeldPairingHeap.Node<K, V> var1, K var2) {
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
      if (var3 != 0 && this.root != var1) {
         if (var1.o_s == null && var1.poolIndex == -1) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         if (var1.o_s == null) {
            CostlessMeldPairingHeap.Node var8 = this.decreasePool[this.decreasePoolMinPos];
            if (this.comparator == null) {
               var3 = ((Comparable)var2).compareTo(var8.key);
            } else {
               var3 = this.comparator.compare((K)var2, var8.key);
            }

            if (var3 < 0) {
               this.decreasePoolMinPos = var1.poolIndex;
            }
         } else {
            CostlessMeldPairingHeap.Node var4 = this.cutOldestChild(var1);
            if (var4 != null) {
               this.linkInPlace(var4, var1);
            } else {
               this.cutFromParent(var1);
            }

            this.addPool(var1, true);
            double var5 = this.size;
            if (this.decreasePoolSize >= Math.getExponent(var5) + 1) {
               this.consolidate();
            }
         }
      }
   }

   private void delete(CostlessMeldPairingHeap.Node<K, V> var1) {
      if (var1 != this.root && var1.o_s == null && var1.poolIndex == -1) {
         throw new IllegalArgumentException("Invalid handle!");
      }

      if (var1.o_s != null) {
         CostlessMeldPairingHeap.Node var2 = this.cutOldestChild(var1);
         if (var2 != null) {
            this.linkInPlace(var2, var1);
         } else {
            this.cutFromParent(var1);
         }
      }

      CostlessMeldPairingHeap.Node var6 = this.combine(this.cutChildren(var1));
      boolean var3 = false;
      if (var6 != null) {
         var3 = true;
         this.addPool(var6, true);
      }

      this.size--;
      if (var1 == this.root) {
         this.root = null;
         this.consolidate();
         var3 = false;
      } else if (var1.poolIndex != -1) {
         byte var4 = var1.poolIndex;
         this.decreasePool[var4] = this.decreasePool[this.decreasePoolSize - 1];
         this.decreasePool[var4].poolIndex = var4;
         this.decreasePool[this.decreasePoolSize - 1] = null;
         this.decreasePoolSize--;
         var1.poolIndex = -1;
         if (var4 == this.decreasePoolMinPos) {
            this.consolidate();
            var3 = false;
         } else {
            if (this.decreasePoolMinPos == this.decreasePoolSize) {
               this.decreasePoolMinPos = var4;
            }

            var3 = true;
         }
      }

      if (var3) {
         double var7 = this.size;
         if (this.decreasePoolSize >= Math.getExponent(var7) + 1) {
            this.consolidate();
         }
      }
   }

   private void consolidate() {
      if (this.decreasePoolSize != 0) {
         if (this.decreasePoolComparator == null) {
            if (this.comparator == null) {
               this.decreasePoolComparator = new Comparator<CostlessMeldPairingHeap.Node<K, V>>() {
                  public int compare(CostlessMeldPairingHeap.Node<K, V> var1, CostlessMeldPairingHeap.Node<K, V> var2) {
                     return ((Comparable)var1.key).compareTo(var2.key);
                  }
               };
            } else {
               this.decreasePoolComparator = new Comparator<CostlessMeldPairingHeap.Node<K, V>>() {
                  public int compare(CostlessMeldPairingHeap.Node<K, V> var1, CostlessMeldPairingHeap.Node<K, V> var2) {
                     return CostlessMeldPairingHeap.this.comparator.compare(var1.key, var2.key);
                  }
               };
            }
         }

         Arrays.sort(this.decreasePool, 0, this.decreasePoolSize, this.decreasePoolComparator);
         int var1 = this.decreasePoolSize - 1;
         CostlessMeldPairingHeap.Node var2 = this.decreasePool[var1];

         for (var2.poolIndex = -1; var1 > 0; var1--) {
            CostlessMeldPairingHeap.Node var3 = this.decreasePool[var1 - 1];
            var3.poolIndex = -1;
            this.decreasePool[var1] = null;
            var2.y_s = var3.o_c;
            var2.o_s = var3;
            if (var3.o_c != null) {
               var3.o_c.o_s = var2;
            }

            var3.o_c = var2;
            var2 = var3;
         }

         this.decreasePool[0] = null;
         this.decreasePoolSize = 0;
         this.decreasePoolMinPos = 0;
         if (this.comparator == null) {
            this.root = this.link(this.root, var2);
         } else {
            this.root = this.linkWithComparator(this.root, var2);
         }
      }
   }

   private void addPool(CostlessMeldPairingHeap.Node<K, V> var1, boolean var2) {
      this.decreasePool[this.decreasePoolSize] = var1;
      var1.poolIndex = this.decreasePoolSize++;
      if (var2 && this.decreasePoolSize > 1) {
         CostlessMeldPairingHeap.Node var3 = this.decreasePool[this.decreasePoolMinPos];
         int var4;
         if (this.comparator == null) {
            var4 = ((Comparable)var1.key).compareTo(var3.key);
         } else {
            var4 = this.comparator.compare(var1.key, var3.key);
         }

         if (var4 < 0) {
            this.decreasePoolMinPos = var1.poolIndex;
         }
      }
   }

   private CostlessMeldPairingHeap.Node<K, V> combine(CostlessMeldPairingHeap.Node<K, V> var1) {
      if (var1 == null) {
         return null;
      }

      assert var1.o_s == null;
      CostlessMeldPairingHeap.Node var2 = null;
      CostlessMeldPairingHeap.Node var3 = var1;
      if (this.comparator == null) {
         while (var3 != null) {
            CostlessMeldPairingHeap.Node var9 = var3;
            var3 = var3.y_s;
            if (var3 == null) {
               var9.y_s = var2;
               var9.o_s = null;
               var2 = var9;
            } else {
               CostlessMeldPairingHeap.Node var11 = var3.y_s;
               var9.y_s = null;
               var9.o_s = null;
               var3.y_s = null;
               var3.o_s = null;
               var9 = this.link(var9, var3);
               var9.y_s = var2;
               var2 = var9;
               var3 = var11;
            }
         }
      } else {
         while (var3 != null) {
            CostlessMeldPairingHeap.Node var4 = var3;
            var3 = var3.y_s;
            if (var3 == null) {
               var4.y_s = var2;
               var4.o_s = null;
               var2 = var4;
            } else {
               CostlessMeldPairingHeap.Node var5 = var3.y_s;
               var4.y_s = null;
               var4.o_s = null;
               var3.y_s = null;
               var3.o_s = null;
               var4 = this.linkWithComparator(var4, var3);
               var4.y_s = var2;
               var2 = var4;
               var3 = var5;
            }
         }
      }

      var3 = var2;
      CostlessMeldPairingHeap.Node var12 = null;
      if (this.comparator == null) {
         while (var3 != null) {
            CostlessMeldPairingHeap.Node var13 = var3.y_s;
            var3.y_s = null;
            var12 = this.link(var12, var3);
            var3 = var13;
         }
      } else {
         while (var3 != null) {
            CostlessMeldPairingHeap.Node var6 = var3.y_s;
            var3.y_s = null;
            var12 = this.linkWithComparator(var12, var3);
            var3 = var6;
         }
      }

      return var12;
   }

   private CostlessMeldPairingHeap.Node<K, V> cutChildren(CostlessMeldPairingHeap.Node<K, V> var1) {
      CostlessMeldPairingHeap.Node var2 = var1.o_c;
      var1.o_c = null;
      if (var2 != null) {
         var2.o_s = null;
      }

      return var2;
   }

   private CostlessMeldPairingHeap.Node<K, V> cutOldestChild(CostlessMeldPairingHeap.Node<K, V> var1) {
      CostlessMeldPairingHeap.Node var2 = var1.o_c;
      if (var2 != null) {
         if (var2.y_s != null) {
            var2.y_s.o_s = var1;
         }

         var1.o_c = var2.y_s;
         var2.y_s = null;
         var2.o_s = null;
      }

      return var2;
   }

   private void cutFromParent(CostlessMeldPairingHeap.Node<K, V> var1) {
      if (var1.o_s != null) {
         if (var1.y_s != null) {
            var1.y_s.o_s = var1.o_s;
         }

         if (var1.o_s.o_c == var1) {
            var1.o_s.o_c = var1.y_s;
         } else {
            var1.o_s.y_s = var1.y_s;
         }

         var1.y_s = null;
         var1.o_s = null;
      }
   }

   private void linkInPlace(CostlessMeldPairingHeap.Node<K, V> var1, CostlessMeldPairingHeap.Node<K, V> var2) {
      var1.y_s = var2.y_s;
      if (var2.y_s != null) {
         var2.y_s.o_s = var1;
      }

      var1.o_s = var2.o_s;
      if (var2.o_s != null) {
         if (var2.o_s.o_c == var2) {
            var2.o_s.o_c = var1;
         } else {
            var2.o_s.y_s = var1;
         }
      }

      var2.o_s = null;
      var2.y_s = null;
   }

   private CostlessMeldPairingHeap.Node<K, V> link(CostlessMeldPairingHeap.Node<K, V> var1, CostlessMeldPairingHeap.Node<K, V> var2) {
      if (var2 == null) {
         return var1;
      }

      if (var1 == null) {
         return var2;
      }

      if (((Comparable)var1.key).compareTo(var2.key) <= 0) {
         var2.y_s = var1.o_c;
         var2.o_s = var1;
         if (var1.o_c != null) {
            var1.o_c.o_s = var2;
         }

         var1.o_c = var2;
         return var1;
      } else {
         return this.link(var2, var1);
      }
   }

   private CostlessMeldPairingHeap.Node<K, V> linkWithComparator(CostlessMeldPairingHeap.Node<K, V> var1, CostlessMeldPairingHeap.Node<K, V> var2) {
      if (var2 == null) {
         return var1;
      }

      if (var1 == null) {
         return var2;
      }

      if (this.comparator.compare(var1.key, var2.key) <= 0) {
         var2.y_s = var1.o_c;
         var2.o_s = var1;
         if (var1.o_c != null) {
            var1.o_c.o_s = var2;
         }

         var1.o_c = var2;
         return var1;
      } else {
         return this.linkWithComparator(var2, var1);
      }
   }

   static class Node<K, V> implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      static final byte NO_INDEX = -1;
      CostlessMeldPairingHeap<K, V> heap;
      K key;
      V value;
      CostlessMeldPairingHeap.Node<K, V> o_c;
      CostlessMeldPairingHeap.Node<K, V> y_s;
      CostlessMeldPairingHeap.Node<K, V> o_s;
      byte poolIndex;

      Node(CostlessMeldPairingHeap<K, V> var1, K var2, V var3) {
         this.heap = var1;
         this.key = (K)var2;
         this.value = (V)var3;
         this.o_c = null;
         this.y_s = null;
         this.o_s = null;
         this.poolIndex = -1;
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

      @LogLogTime(amortized = true)
      @Override
      public void delete() {
         this.getOwner().delete(this);
      }

      @LogLogTime(amortized = true)
      @Override
      public void decreaseKey(K var1) {
         this.getOwner().decreaseKey(this, (K)var1);
      }

      CostlessMeldPairingHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            CostlessMeldPairingHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            CostlessMeldPairingHeap var2 = this.heap;

            while (var2.other != var1) {
               CostlessMeldPairingHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }
}
