package org.jheaps.tree;

import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class PairingHeap<K, V> implements Serializable, MergeableAddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private final Comparator<? super K> comparator;
   private PairingHeap.Node<K, V> root = null;
   private long size;
   private PairingHeap<K, V> other;

   @ConstantTime
   public PairingHeap() {
      this(null);
   }

   @ConstantTime
   public PairingHeap(Comparator<? super K> var1) {
      this.comparator = var1;
      this.size = 0L;
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

      PairingHeap.Node var3 = new PairingHeap.Node<>(this, (K)var1, (V)var2);
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

   @ConstantTime(amortized = false)
   @Override
   public AddressableHeap.Handle<K, V> findMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      } else {
         return this.root;
      }
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      PairingHeap.Node var1 = this.root;
      this.root = this.combine(this.cutChildren(this.root));
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
      this.root = null;
      this.size = 0L;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public void meld(MergeableAddressableHeap<K, V> var1) {
      PairingHeap var2 = (PairingHeap)var1;
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

      this.size = this.size + var2.size;
      if (this.comparator == null) {
         this.root = this.link(this.root, var2.root);
      } else {
         this.root = this.linkWithComparator(this.root, var2.root);
      }

      var2.size = 0L;
      var2.root = null;
      var2.other = this;
   }

   private void decreaseKey(PairingHeap.Node<K, V> var1, K var2) {
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
         if (var1.o_s == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

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
         if (this.comparator == null) {
            this.root = this.link(this.root, var1);
         } else {
            this.root = this.linkWithComparator(this.root, var1);
         }
      }
   }

   private void delete(PairingHeap.Node<K, V> var1) {
      if (this.root == var1) {
         this.deleteMin();
         var1.o_c = null;
         var1.y_s = null;
         var1.o_s = null;
      } else {
         if (var1.o_s == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

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
         PairingHeap.Node var2 = this.combine(this.cutChildren(var1));
         if (this.comparator == null) {
            this.root = this.link(this.root, var2);
         } else {
            this.root = this.linkWithComparator(this.root, var2);
         }

         this.size--;
      }
   }

   private PairingHeap.Node<K, V> combine(PairingHeap.Node<K, V> var1) {
      if (var1 == null) {
         return null;
      }

      assert var1.o_s == null;
      PairingHeap.Node var2 = null;
      PairingHeap.Node var3 = var1;
      if (this.comparator == null) {
         while (var3 != null) {
            PairingHeap.Node var9 = var3;
            var3 = var3.y_s;
            if (var3 == null) {
               var9.y_s = var2;
               var9.o_s = null;
               var2 = var9;
            } else {
               PairingHeap.Node var11 = var3.y_s;
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
            PairingHeap.Node var4 = var3;
            var3 = var3.y_s;
            if (var3 == null) {
               var4.y_s = var2;
               var4.o_s = null;
               var2 = var4;
            } else {
               PairingHeap.Node var5 = var3.y_s;
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
      PairingHeap.Node var12 = null;
      if (this.comparator == null) {
         while (var3 != null) {
            PairingHeap.Node var13 = var3.y_s;
            var3.y_s = null;
            var12 = this.link(var12, var3);
            var3 = var13;
         }
      } else {
         while (var3 != null) {
            PairingHeap.Node var6 = var3.y_s;
            var3.y_s = null;
            var12 = this.linkWithComparator(var12, var3);
            var3 = var6;
         }
      }

      return var12;
   }

   private PairingHeap.Node<K, V> cutChildren(PairingHeap.Node<K, V> var1) {
      PairingHeap.Node var2 = var1.o_c;
      var1.o_c = null;
      if (var2 != null) {
         var2.o_s = null;
      }

      return var2;
   }

   private PairingHeap.Node<K, V> link(PairingHeap.Node<K, V> var1, PairingHeap.Node<K, V> var2) {
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

   private PairingHeap.Node<K, V> linkWithComparator(PairingHeap.Node<K, V> var1, PairingHeap.Node<K, V> var2) {
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
      PairingHeap<K, V> heap;
      K key;
      V value;
      PairingHeap.Node<K, V> o_c;
      PairingHeap.Node<K, V> y_s;
      PairingHeap.Node<K, V> o_s;

      Node(PairingHeap<K, V> var1, K var2, V var3) {
         this.heap = var1;
         this.key = (K)var2;
         this.value = (V)var3;
         this.o_c = null;
         this.y_s = null;
         this.o_s = null;
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

      @LogarithmicTime(amortized = true)
      @Override
      public void decreaseKey(K var1) {
         this.getOwner().decreaseKey(this, (K)var1);
      }

      @LogarithmicTime(amortized = true)
      @Override
      public void delete() {
         this.getOwner().delete(this);
      }

      PairingHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            PairingHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            PairingHeap var2 = this.heap;

            while (var2.other != var1) {
               PairingHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }
}
