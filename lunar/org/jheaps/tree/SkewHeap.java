package org.jheaps.tree;

import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class SkewHeap<K, V> implements Serializable, MergeableAddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   protected final Comparator<? super K> comparator;
   protected long size;
   protected SkewHeap.Node<K, V> root;
   protected SkewHeap<K, V> other;

   public SkewHeap() {
      this(null);
   }

   public SkewHeap(Comparator<? super K> var1) {
      this.comparator = var1;
      this.size = 0L;
      this.root = null;
      this.other = this;
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
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

      SkewHeap.Node var3 = this.createNode((K)var1, (V)var2);
      if (this.size == 0L) {
         this.root = var3;
         this.size = 1L;
         return var3;
      }

      if (this.size == 1L) {
         int var4;
         if (this.comparator == null) {
            var4 = ((Comparable)var1).compareTo(this.root.key);
         } else {
            var4 = this.comparator.compare((K)var1, this.root.key);
         }

         if (var4 <= 0) {
            var3.o_c = this.root;
            this.root.y_s = var3;
            this.root = var3;
         } else {
            this.root.o_c = var3;
            var3.y_s = this.root;
         }

         this.size = 2L;
         return var3;
      } else {
         if (this.comparator == null) {
            this.root = this.union(this.root, var3);
         } else {
            this.root = this.unionWithComparator(this.root, var3);
         }

         this.size++;
         return var3;
      }
   }

   @ConstantTime
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
      } else {
         SkewHeap.Node var1 = this.root;
         if (this.size == 1L) {
            this.root = null;
            this.size = 0L;
            return var1;
         } else if (this.size == 2L) {
            this.root = this.root.o_c;
            this.root.o_c = null;
            this.root.y_s = null;
            this.size = 1L;
            var1.o_c = null;
            return var1;
         } else {
            this.root = this.unlinkAndUnionChildren(this.root);
            this.size--;
            return var1;
         }
      }
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

   @Override
   public void meld(MergeableAddressableHeap<K, V> var1) {
      SkewHeap var2 = (SkewHeap)var1;
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
         this.root = this.union(this.root, var2.root);
      } else {
         this.root = this.unionWithComparator(this.root, var2.root);
      }

      var2.size = 0L;
      var2.root = null;
      var2.other = this;
   }

   private void decreaseKey(SkewHeap.Node<K, V> var1, K var2) {
      int var3;
      if (this.comparator == null) {
         var3 = ((Comparable)var2).compareTo(var1.key);
      } else {
         var3 = this.comparator.compare((K)var2, var1.key);
      }

      if (var3 > 0) {
         throw new IllegalArgumentException("Keys can only be decreased!");
      }

      if (var3 != 0 && this.root != var1) {
         this.delete(var1);
         var1.key = (K)var2;
         if (this.comparator == null) {
            this.root = this.union(this.root, var1);
         } else {
            this.root = this.unionWithComparator(this.root, var1);
         }

         this.size++;
      } else {
         var1.key = (K)var2;
      }
   }

   protected SkewHeap.Node<K, V> createNode(K var1, V var2) {
      return new SkewHeap.Node<>(this, (K)var1, (V)var2);
   }

   protected void delete(SkewHeap.Node<K, V> var1) {
      if (var1 == this.root) {
         this.deleteMin();
      } else {
         if (var1.y_s == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         SkewHeap.Node var2 = this.unlinkAndUnionChildren(var1);
         SkewHeap.Node var3 = this.getParent(var1);
         if (var2 == null) {
            if (var3.o_c == var1) {
               if (var1.y_s == var3) {
                  var3.o_c = null;
               } else {
                  var3.o_c = var1.y_s;
               }
            } else {
               var3.o_c.y_s = var3;
            }
         } else if (var3.o_c == var1) {
            var2.y_s = var1.y_s;
            var3.o_c = var2;
         } else {
            var3.o_c.y_s = var2;
            var2.y_s = var3;
         }

         this.size--;
         var1.o_c = null;
         var1.y_s = null;
      }
   }

   protected SkewHeap.Node<K, V> unlinkAndUnionChildren(SkewHeap.Node<K, V> var1) {
      SkewHeap.Node var2 = var1.o_c;
      if (var2 == null) {
         return null;
      }

      var1.o_c = null;
      SkewHeap.Node var3 = var2.y_s;
      if (var3 == var1) {
         var3 = null;
      } else {
         var3.y_s = null;
      }

      var2.y_s = null;
      return this.comparator == null ? this.union(var2, var3) : this.unionWithComparator(var2, var3);
   }

   protected SkewHeap.Node<K, V> getParent(SkewHeap.Node<K, V> var1) {
      if (var1.y_s == null) {
         return null;
      }

      SkewHeap.Node var2 = var1.y_s;
      if (var2.o_c == var1) {
         return var2;
      }

      SkewHeap.Node var3 = var2.y_s;
      return var3 != null && var3.o_c == var1 ? var3 : var2;
   }

   protected SkewHeap.Node<K, V> unlinkRightChild(SkewHeap.Node<K, V> var1) {
      SkewHeap.Node var2 = var1.o_c;
      if (var2 != null && var2.y_s != var1) {
         SkewHeap.Node var3 = var2.y_s;
         var2.y_s = var1;
         var3.y_s = null;
         return var3;
      } else {
         return null;
      }
   }

   protected SkewHeap.Node<K, V> union(SkewHeap.Node<K, V> var1, SkewHeap.Node<K, V> var2) {
      if (var1 == null) {
         return var2;
      }

      if (var2 == null) {
         return var1;
      }

      int var5 = ((Comparable)var1.key).compareTo(var2.key);
      SkewHeap.Node var3;
      if (var5 <= 0) {
         var3 = var1;
         var1 = this.unlinkRightChild(var1);
      } else {
         var3 = var2;
         var2 = this.unlinkRightChild(var2);
      }

      SkewHeap.Node var4 = var3;

      while (var1 != null && var2 != null) {
         var5 = ((Comparable)var1.key).compareTo(var2.key);
         if (var5 <= 0) {
            if (var4.o_c == null) {
               var1.y_s = var4;
            } else {
               var1.y_s = var4.o_c;
            }

            var4.o_c = var1;
            var4 = var1;
            var1 = this.unlinkRightChild(var1);
         } else {
            if (var4.o_c == null) {
               var2.y_s = var4;
            } else {
               var2.y_s = var4.o_c;
            }

            var4.o_c = var2;
            var4 = var2;
            var2 = this.unlinkRightChild(var2);
         }
      }

      while (var1 != null) {
         if (var4.o_c == null) {
            var1.y_s = var4;
         } else {
            var1.y_s = var4.o_c;
         }

         var4.o_c = var1;
         var4 = var1;
         var1 = this.unlinkRightChild(var1);
      }

      while (var2 != null) {
         if (var4.o_c == null) {
            var2.y_s = var4;
         } else {
            var2.y_s = var4.o_c;
         }

         var4.o_c = var2;
         var4 = var2;
         var2 = this.unlinkRightChild(var2);
      }

      return var3;
   }

   protected SkewHeap.Node<K, V> unionWithComparator(SkewHeap.Node<K, V> var1, SkewHeap.Node<K, V> var2) {
      if (var1 == null) {
         return var2;
      }

      if (var2 == null) {
         return var1;
      }

      int var5 = this.comparator.compare(var1.key, var2.key);
      SkewHeap.Node var3;
      if (var5 <= 0) {
         var3 = var1;
         var1 = this.unlinkRightChild(var1);
      } else {
         var3 = var2;
         var2 = this.unlinkRightChild(var2);
      }

      SkewHeap.Node var4 = var3;

      while (var1 != null && var2 != null) {
         var5 = this.comparator.compare(var1.key, var2.key);
         if (var5 <= 0) {
            if (var4.o_c == null) {
               var1.y_s = var4;
            } else {
               var1.y_s = var4.o_c;
            }

            var4.o_c = var1;
            var4 = var1;
            var1 = this.unlinkRightChild(var1);
         } else {
            if (var4.o_c == null) {
               var2.y_s = var4;
            } else {
               var2.y_s = var4.o_c;
            }

            var4.o_c = var2;
            var4 = var2;
            var2 = this.unlinkRightChild(var2);
         }
      }

      while (var1 != null) {
         if (var4.o_c == null) {
            var1.y_s = var4;
         } else {
            var1.y_s = var4.o_c;
         }

         var4.o_c = var1;
         var4 = var1;
         var1 = this.unlinkRightChild(var1);
      }

      while (var2 != null) {
         if (var4.o_c == null) {
            var2.y_s = var4;
         } else {
            var2.y_s = var4.o_c;
         }

         var4.o_c = var2;
         var4 = var2;
         var2 = this.unlinkRightChild(var2);
      }

      return var3;
   }

   static class Node<K, V> implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      SkewHeap<K, V> heap;
      K key;
      V value;
      SkewHeap.Node<K, V> o_c;
      SkewHeap.Node<K, V> y_s;

      Node(SkewHeap<K, V> var1, K var2, V var3) {
         this.heap = var1;
         this.key = (K)var2;
         this.value = (V)var3;
         this.o_c = null;
         this.y_s = null;
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

      @Override
      public void decreaseKey(K var1) {
         this.getOwner().decreaseKey(this, (K)var1);
      }

      @Override
      public void delete() {
         this.getOwner().delete(this);
      }

      SkewHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            SkewHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            SkewHeap var2 = this.heap;

            while (var2.other != var1) {
               SkewHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }
}
