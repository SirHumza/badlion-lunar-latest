package org.jheaps.tree;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class SimpleFibonacciHeap<K, V> implements Serializable, MergeableAddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private static final int AUX_CONSOLIDATE_ARRAY_SIZE = 91;
   private final Comparator<? super K> comparator;
   private SimpleFibonacciHeap.Node<K, V> root = null;
   private long size;
   private SimpleFibonacciHeap.Node<K, V>[] aux;
   protected SimpleFibonacciHeap<K, V> other;

   @ConstantTime
   public SimpleFibonacciHeap() {
      this(null);
   }

   @ConstantTime
   public SimpleFibonacciHeap(Comparator<? super K> var1) {
      this.comparator = var1;
      this.size = 0L;
      this.aux = (SimpleFibonacciHeap.Node<K, V>[])Array.newInstance(SimpleFibonacciHeap.Node.class, 91);
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

      SimpleFibonacciHeap.Node var3 = new SimpleFibonacciHeap.Node<>(this, (K)var1, (V)var2);
      if (this.root == null) {
         this.root = var3;
      } else if (this.comparator == null) {
         if (((Comparable)var3.key).compareTo(this.root.key) < 0) {
            this.root = this.link(this.root, var3);
         } else {
            this.link(var3, this.root);
         }
      } else if (this.comparator.compare(var3.key, this.root.key) < 0) {
         this.root = this.link(this.root, var3);
      } else {
         this.link(var3, this.root);
      }

      this.size++;
      return var3;
   }

   @ConstantTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
   }

   @ConstantTime(amortized = true)
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
      return this.comparator == null ? this.comparableDeleteMin() : this.comparatorDeleteMin();
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
   }

   @ConstantTime(amortized = true)
   @Override
   public void meld(MergeableAddressableHeap<K, V> var1) {
      SimpleFibonacciHeap var2 = (SimpleFibonacciHeap)var1;
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

      if (this.root == null) {
         this.root = var2.root;
      } else if (var2.root != null) {
         if (this.comparator == null) {
            if (((Comparable)var2.root.key).compareTo(this.root.key) < 0) {
               this.root = this.link(this.root, var2.root);
            } else {
               this.link(var2.root, this.root);
            }
         } else if (this.comparator.compare(var2.root.key, this.root.key) < 0) {
            this.root = this.link(this.root, var2.root);
         } else {
            this.link(var2.root, this.root);
         }
      }

      this.size = this.size + var2.size;
      var2.size = 0L;
      var2.root = null;
      var2.other = this;
   }

   private void comparableDecreaseKey(SimpleFibonacciHeap.Node<K, V> var1, K var2) {
      int var3 = ((Comparable)var2).compareTo(var1.key);
      if (var3 > 0) {
         throw new IllegalArgumentException("Keys can only be decreased!");
      }

      var1.key = (K)var2;
      if (var3 != 0) {
         if (var1.next == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         SimpleFibonacciHeap.Node var4 = var1.parent;
         if (var4 != null && ((Comparable)var1.key).compareTo(var4.key) < 0) {
            this.cut(var1, var4);
            this.root.mark = false;
            this.cascadingRankChange(var4);
            if (((Comparable)var1.key).compareTo(this.root.key) < 0) {
               this.root = this.link(this.root, var1);
            } else {
               this.link(var1, this.root);
            }
         }
      }
   }

   private void comparatorDecreaseKey(SimpleFibonacciHeap.Node<K, V> var1, K var2) {
      int var3 = this.comparator.compare((K)var2, var1.key);
      if (var3 > 0) {
         throw new IllegalArgumentException("Keys can only be decreased!");
      }

      var1.key = (K)var2;
      if (var3 != 0) {
         if (var1.next == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         SimpleFibonacciHeap.Node var4 = var1.parent;
         if (var4 != null && this.comparator.compare(var1.key, var4.key) < 0) {
            this.cut(var1, var4);
            this.root.mark = false;
            this.cascadingRankChange(var4);
            if (this.comparator.compare(var1.key, this.root.key) < 0) {
               this.root = this.link(this.root, var1);
            } else {
               this.link(var1, this.root);
            }
         }
      }
   }

   private void forceDecreaseKeyToMinimum(SimpleFibonacciHeap.Node<K, V> var1) {
      SimpleFibonacciHeap.Node var2 = var1.parent;
      if (var2 != null) {
         this.cut(var1, var2);
         this.root.mark = false;
         this.cascadingRankChange(var2);
         this.root = this.link(this.root, var1);
      }
   }

   private AddressableHeap.Handle<K, V> comparableDeleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      SimpleFibonacciHeap.Node var1 = this.root;
      SimpleFibonacciHeap.Node var2 = this.root.child;
      var1.child = null;
      var1.next = null;
      var1.prev = null;
      if (var2 == null) {
         this.root = null;
         this.size = 0L;
         return var1;
      }

      int var3 = -1;

      while (var2 != null) {
         SimpleFibonacciHeap.Node var4 = var2.next == var2 ? null : var2.next;
         var2.parent = null;
         var2.prev.next = var2.next;
         var2.next.prev = var2.prev;
         var2.next = var2;
         var2.prev = var2;
         int var5 = var2.rank;

         while (true) {
            SimpleFibonacciHeap.Node var6 = this.aux[var5];
            if (var6 == null) {
               this.aux[var5] = var2;
               if (var5 > var3) {
                  var3 = var5;
               }

               var2 = var4;
               break;
            }

            if (((Comparable)var6.key).compareTo(var2.key) < 0) {
               SimpleFibonacciHeap.Node var7 = var2;
               var2 = var6;
               var6 = var7;
            }

            this.link(var6, var2);
            var2.rank++;
            this.aux[var5] = null;
            var5++;
         }
      }

      int var8 = 0;

      while (var8 <= var3 && this.aux[var8] == null) {
         var8++;
      }

      this.root = this.aux[var8];
      this.aux[var8] = null;
      var8++;

      for (; var8 <= var3; var8++) {
         SimpleFibonacciHeap.Node var10 = this.aux[var8];
         if (var10 != null) {
            if (((Comparable)var10.key).compareTo(this.root.key) < 0) {
               this.root = this.link(this.root, var10);
            } else {
               this.link(var10, this.root);
            }

            this.aux[var8] = null;
         }
      }

      this.size--;
      return var1;
   }

   private AddressableHeap.Handle<K, V> comparatorDeleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      SimpleFibonacciHeap.Node var1 = this.root;
      SimpleFibonacciHeap.Node var2 = this.root.child;
      var1.child = null;
      var1.next = null;
      var1.prev = null;
      if (var2 == null) {
         this.root = null;
         this.size = 0L;
         return var1;
      }

      int var3 = -1;

      while (var2 != null) {
         SimpleFibonacciHeap.Node var4 = var2.next == var2 ? null : var2.next;
         var2.parent = null;
         var2.prev.next = var2.next;
         var2.next.prev = var2.prev;
         var2.next = var2;
         var2.prev = var2;
         int var5 = var2.rank;

         while (true) {
            SimpleFibonacciHeap.Node var6 = this.aux[var5];
            if (var6 == null) {
               this.aux[var5] = var2;
               if (var5 > var3) {
                  var3 = var5;
               }

               var2 = var4;
               break;
            }

            if (this.comparator.compare(var6.key, var2.key) < 0) {
               SimpleFibonacciHeap.Node var7 = var2;
               var2 = var6;
               var6 = var7;
            }

            this.link(var6, var2);
            var2.rank++;
            this.aux[var5] = null;
            var5++;
         }
      }

      int var8 = 0;

      while (var8 <= var3 && this.aux[var8] == null) {
         var8++;
      }

      this.root = this.aux[var8];
      this.aux[var8] = null;
      var8++;

      for (; var8 <= var3; var8++) {
         SimpleFibonacciHeap.Node var10 = this.aux[var8];
         if (var10 != null) {
            if (this.comparator.compare(var10.key, this.root.key) < 0) {
               this.root = this.link(this.root, var10);
            } else {
               this.link(var10, this.root);
            }

            this.aux[var8] = null;
         }
      }

      this.size--;
      return var1;
   }

   private SimpleFibonacciHeap.Node<K, V> link(SimpleFibonacciHeap.Node<K, V> var1, SimpleFibonacciHeap.Node<K, V> var2) {
      var1.parent = var2;
      SimpleFibonacciHeap.Node var3 = var2.child;
      if (var3 == null) {
         var2.child = var1;
         var1.next = var1;
         var1.prev = var1;
      } else {
         var1.prev = var3;
         var1.next = var3.next;
         var3.next = var1;
         var1.next.prev = var1;
      }

      return var2;
   }

   private void cut(SimpleFibonacciHeap.Node<K, V> var1, SimpleFibonacciHeap.Node<K, V> var2) {
      var2.child = var1.next;
      if (var2.child == var1) {
         var2.child = null;
      }

      var1.prev.next = var1.next;
      var1.next.prev = var1.prev;
      var1.next = var1;
      var1.prev = var1;
      var1.parent = null;
      var1.mark = false;
   }

   private void cascadingRankChange(SimpleFibonacciHeap.Node<K, V> var1) {
      while (var1.mark) {
         var1.mark = false;
         if (var1.rank > 0) {
            var1.rank--;
         }

         var1 = var1.parent;
      }

      var1.mark = true;
      if (var1.rank > 0) {
         var1.rank--;
      }
   }

   static class Node<K, V> implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      SimpleFibonacciHeap<K, V> heap;
      K key;
      V value;
      SimpleFibonacciHeap.Node<K, V> parent;
      SimpleFibonacciHeap.Node<K, V> child;
      SimpleFibonacciHeap.Node<K, V> next;
      SimpleFibonacciHeap.Node<K, V> prev;
      int rank;
      boolean mark;

      Node(SimpleFibonacciHeap<K, V> var1, K var2, V var3) {
         this.heap = var1;
         this.key = (K)var2;
         this.value = (V)var3;
         this.parent = null;
         this.child = null;
         this.next = this;
         this.prev = this;
         this.rank = 0;
         this.mark = false;
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
         SimpleFibonacciHeap var2 = this.getOwner();
         if (var2.comparator == null) {
            var2.comparableDecreaseKey(this, (K)var1);
         } else {
            var2.comparatorDecreaseKey(this, (K)var1);
         }
      }

      @LogarithmicTime(amortized = true)
      @Override
      public void delete() {
         if (this.next == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         SimpleFibonacciHeap var1 = this.getOwner();
         var1.forceDecreaseKeyToMinimum(this);
         var1.deleteMin();
      }

      SimpleFibonacciHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            SimpleFibonacciHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            SimpleFibonacciHeap var2 = this.heap;

            while (var2.other != var1) {
               SimpleFibonacciHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }
}
