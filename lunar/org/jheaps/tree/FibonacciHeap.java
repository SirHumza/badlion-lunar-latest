package org.jheaps.tree;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class FibonacciHeap<K, V> implements Serializable, MergeableAddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private static final int AUX_CONSOLIDATE_ARRAY_SIZE = 91;
   private final Comparator<? super K> comparator;
   private FibonacciHeap.Node<K, V> minRoot = null;
   private int roots = 0;
   private long size;
   private FibonacciHeap.Node<K, V>[] aux;
   protected FibonacciHeap<K, V> other;

   @ConstantTime
   public FibonacciHeap() {
      this(null);
   }

   @ConstantTime
   public FibonacciHeap(Comparator<? super K> var1) {
      this.comparator = var1;
      this.size = 0L;
      this.aux = (FibonacciHeap.Node<K, V>[])Array.newInstance(FibonacciHeap.Node.class, 91);
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

      FibonacciHeap.Node var3 = new FibonacciHeap.Node<>(this, (K)var1, (V)var2);
      this.addToRootList(var3);
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
         return this.minRoot;
      }
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      FibonacciHeap.Node var1 = this.minRoot;
      FibonacciHeap.Node var2 = var1.child;

      while (var2 != null) {
         FibonacciHeap.Node var3 = var2.next == var2 ? null : var2.next;
         var2.parent = null;
         var2.prev.next = var2.next;
         var2.next.prev = var2.prev;
         var2.next = this.minRoot.next;
         var2.prev = this.minRoot;
         this.minRoot.next = var2;
         var2.next.prev = var2;
         this.roots++;
         var2 = var3;
      }

      var1.degree = 0;
      var1.child = null;
      var1.prev.next = var1.next;
      var1.next.prev = var1.prev;
      this.roots--;
      this.size--;
      if (var1 == var1.next) {
         this.minRoot = null;
      } else {
         this.minRoot = var1.next;
         this.consolidate();
      }

      var1.next = null;
      var1.prev = null;
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

   @ConstantTime
   @Override
   public void clear() {
      this.minRoot = null;
      this.roots = 0;
      this.size = 0L;
   }

   @ConstantTime(amortized = true)
   @Override
   public void meld(MergeableAddressableHeap<K, V> var1) {
      FibonacciHeap var2 = (FibonacciHeap)var1;
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

      if (this.size == 0L) {
         this.minRoot = var2.minRoot;
      } else if (var2.size != 0L) {
         FibonacciHeap.Node var3 = this.minRoot;
         FibonacciHeap.Node var4 = var3.next;
         FibonacciHeap.Node var5 = var2.minRoot;
         FibonacciHeap.Node var6 = var5.next;
         var3.next = var6;
         var6.prev = var3;
         var5.next = var4;
         var4.prev = var5;
         if (this.comparator == null && ((Comparable)var2.minRoot.key).compareTo(this.minRoot.key) < 0
            || this.comparator != null && this.comparator.compare(var2.minRoot.key, this.minRoot.key) < 0) {
            this.minRoot = var2.minRoot;
         }
      }

      this.roots = this.roots + var2.roots;
      this.size = this.size + var2.size;
      var2.size = 0L;
      var2.minRoot = null;
      var2.roots = 0;
      var2.other = this;
   }

   private void decreaseKey(FibonacciHeap.Node<K, V> var1, K var2) {
      int var3 = ((Comparable)var2).compareTo(var1.key);
      if (var3 > 0) {
         throw new IllegalArgumentException("Keys can only be decreased!");
      }

      var1.key = (K)var2;
      if (var3 != 0) {
         if (var1.next == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         FibonacciHeap.Node var4 = var1.parent;
         if (var4 != null && ((Comparable)var1.key).compareTo(var4.key) < 0) {
            this.cut(var1, var4);
            this.cascadingCut(var4);
         }

         if (((Comparable)var1.key).compareTo(this.minRoot.key) < 0) {
            this.minRoot = var1;
         }
      }
   }

   private void decreaseKeyWithComparator(FibonacciHeap.Node<K, V> var1, K var2) {
      int var3 = this.comparator.compare((K)var2, var1.key);
      if (var3 > 0) {
         throw new IllegalArgumentException("Keys can only be decreased!");
      }

      var1.key = (K)var2;
      if (var3 != 0) {
         if (var1.next == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         FibonacciHeap.Node var4 = var1.parent;
         if (var4 != null && this.comparator.compare(var1.key, var4.key) < 0) {
            this.cut(var1, var4);
            this.cascadingCut(var4);
         }

         if (this.comparator.compare(var1.key, this.minRoot.key) < 0) {
            this.minRoot = var1;
         }
      }
   }

   private void forceDecreaseKeyToMinimum(FibonacciHeap.Node<K, V> var1) {
      FibonacciHeap.Node var2 = var1.parent;
      if (var2 != null) {
         this.cut(var1, var2);
         this.cascadingCut(var2);
      }

      this.minRoot = var1;
   }

   private void consolidate() {
      int var1 = -1;
      int var2 = this.roots;
      FibonacciHeap.Node var3 = this.minRoot;

      while (var2 > 0) {
         FibonacciHeap.Node var4 = var3.next;
         int var5 = var3.degree;

         while (true) {
            FibonacciHeap.Node var6 = this.aux[var5];
            if (var6 == null) {
               this.aux[var5] = var3;
               if (var5 > var1) {
                  var1 = var5;
               }

               var3 = var4;
               var2--;
               break;
            }

            int var7;
            if (this.comparator == null) {
               var7 = ((Comparable)var6.key).compareTo(var3.key);
            } else {
               var7 = this.comparator.compare(var6.key, var3.key);
            }

            if (var7 < 0) {
               FibonacciHeap.Node var8 = var3;
               var3 = var6;
               var6 = var8;
            }

            this.link(var6, var3);
            this.aux[var5] = null;
            var5++;
         }
      }

      this.minRoot = null;
      this.roots = 0;

      for (int var9 = 0; var9 <= var1; var9++) {
         if (this.aux[var9] != null) {
            this.addToRootList(this.aux[var9]);
            this.aux[var9] = null;
         }
      }
   }

   private void link(FibonacciHeap.Node<K, V> var1, FibonacciHeap.Node<K, V> var2) {
      var1.prev.next = var1.next;
      var1.next.prev = var1.prev;
      this.roots--;
      var1.mark = false;
      var2.degree++;
      var1.parent = var2;
      FibonacciHeap.Node var3 = var2.child;
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
   }

   private void cut(FibonacciHeap.Node<K, V> var1, FibonacciHeap.Node<K, V> var2) {
      var1.prev.next = var1.next;
      var1.next.prev = var1.prev;
      var2.degree--;
      if (var2.degree == 0) {
         var2.child = null;
      } else if (var2.child == var1) {
         var2.child = var1.next;
      }

      var1.parent = null;
      this.addToRootList(var1);
      var1.mark = false;
   }

   private void cascadingCut(FibonacciHeap.Node<K, V> var1) {
      while (true) {
         FibonacciHeap.Node var2 = var1.parent;
         if (var1.parent != null) {
            if (var1.mark) {
               this.cut(var1, var2);
               var1 = var2;
               continue;
            }

            var1.mark = true;
         }

         return;
      }
   }

   private void addToRootList(FibonacciHeap.Node<K, V> var1) {
      if (this.minRoot == null) {
         var1.next = var1;
         var1.prev = var1;
         this.minRoot = var1;
         this.roots = 1;
      } else {
         var1.next = this.minRoot.next;
         var1.prev = this.minRoot;
         this.minRoot.next.prev = var1;
         this.minRoot.next = var1;
         int var2;
         if (this.comparator == null) {
            var2 = ((Comparable)var1.key).compareTo(this.minRoot.key);
         } else {
            var2 = this.comparator.compare(var1.key, this.minRoot.key);
         }

         if (var2 < 0) {
            this.minRoot = var1;
         }

         this.roots++;
      }
   }

   static class Node<K, V> implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      FibonacciHeap<K, V> heap;
      K key;
      V value;
      FibonacciHeap.Node<K, V> parent;
      FibonacciHeap.Node<K, V> child;
      FibonacciHeap.Node<K, V> next;
      FibonacciHeap.Node<K, V> prev;
      int degree;
      boolean mark;

      Node(FibonacciHeap<K, V> var1, K var2, V var3) {
         this.heap = var1;
         this.key = (K)var2;
         this.value = (V)var3;
         this.parent = null;
         this.child = null;
         this.next = null;
         this.prev = null;
         this.degree = 0;
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
         FibonacciHeap var2 = this.getOwner();
         if (var2.comparator == null) {
            var2.decreaseKey(this, (K)var1);
         } else {
            var2.decreaseKeyWithComparator(this, (K)var1);
         }
      }

      @LogarithmicTime(amortized = true)
      @Override
      public void delete() {
         if (this.next == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         FibonacciHeap var1 = this.getOwner();
         var1.forceDecreaseKeyToMinimum(this);
         var1.deleteMin();
      }

      FibonacciHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            FibonacciHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            FibonacciHeap var2 = this.heap;

            while (var2.other != var1) {
               FibonacciHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }
}
