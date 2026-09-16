package org.jheaps.tree;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class BinaryTreeAddressableHeap<K, V> implements Serializable, AddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private final Comparator<? super K> comparator;
   private long size;
   private BinaryTreeAddressableHeap<K, V>.Node root;

   public BinaryTreeAddressableHeap() {
      this(null);
   }

   public BinaryTreeAddressableHeap(Comparator<? super K> var1) {
      this.comparator = var1;
      this.size = 0L;
      this.root = null;
   }

   @LogarithmicTime
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
   }

   @LogarithmicTime
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1, V var2) {
      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      BinaryTreeAddressableHeap.Node var3 = new BinaryTreeAddressableHeap.Node(var1, var2);
      if (this.size == 0L) {
         this.root = var3;
         this.size = 1L;
         return var3;
      }

      if (this.size == 1L) {
         int var5;
         if (this.comparator == null) {
            var5 = ((Comparable)var1).compareTo(this.root.key);
         } else {
            var5 = this.comparator.compare((K)var1, (K)this.root.key);
         }

         if (var5 < 0) {
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
         BinaryTreeAddressableHeap.Node var4 = this.findParentNode(this.size + 1L);
         if (var4.o_c == null) {
            var4.o_c = var3;
         } else {
            var4.o_c.y_s = var3;
         }

         var3.y_s = var4;
         this.size++;
         this.fixup(var3);
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

   @LogarithmicTime
   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      BinaryTreeAddressableHeap.Node var1 = this.root;
      if (this.size == 1L) {
         this.root = null;
         this.size = 0L;
         return var1;
      }

      if (this.size == 2L) {
         this.root = this.root.o_c;
         this.root.o_c = null;
         this.root.y_s = null;
         this.size = 1L;
         var1.o_c = null;
         return var1;
      }

      BinaryTreeAddressableHeap.Node var2 = this.findParentNode(this.size);
      BinaryTreeAddressableHeap.Node var3 = var2.o_c;
      if (var3.y_s != var2) {
         BinaryTreeAddressableHeap.Node var4 = var3;
         var3 = var4.y_s;
         var4.y_s = var2;
      } else {
         var2.o_c = null;
      }

      var3.y_s = null;
      this.size--;
      if (this.root.o_c.y_s == this.root) {
         this.root.o_c.y_s = var3;
      } else {
         this.root.o_c.y_s.y_s = var3;
      }

      var3.o_c = this.root.o_c;
      this.root = var3;
      this.fixdown(this.root);
      var1.o_c = null;
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
      this.root = null;
      this.size = 0L;
   }

   private void fixup(BinaryTreeAddressableHeap<K, V>.Node var1) {
      if (this.comparator == null) {
         BinaryTreeAddressableHeap.Node var2 = this.getParent(var1);

         while (var2 != null && ((Comparable)var1.key).compareTo(var2.key) < 0) {
            BinaryTreeAddressableHeap.Node var3 = this.getParent(var2);
            this.swap(var1, var2, var3);
            var2 = var3;
         }
      } else {
         BinaryTreeAddressableHeap.Node var4 = this.getParent(var1);

         while (var4 != null && this.comparator.compare((K)var1.key, (K)var4.key) < 0) {
            BinaryTreeAddressableHeap.Node var5 = this.getParent(var4);
            this.swap(var1, var4, var5);
            var4 = var5;
         }
      }
   }

   private void fixdown(BinaryTreeAddressableHeap<K, V>.Node var1) {
      if (this.comparator == null) {
         BinaryTreeAddressableHeap.Node var2 = this.getParent(var1);

         while (var1.o_c != null) {
            BinaryTreeAddressableHeap.Node var3 = var1.o_c;
            if (var3.y_s != var1 && ((Comparable)var3.y_s.key).compareTo(var3.key) < 0) {
               var3 = var3.y_s;
            }

            if (((Comparable)var1.key).compareTo(var3.key) <= 0) {
               break;
            }

            this.swap(var3, var1, var2);
            var2 = var3;
         }
      } else {
         BinaryTreeAddressableHeap.Node var4 = this.getParent(var1);

         while (var1.o_c != null) {
            BinaryTreeAddressableHeap.Node var5 = var1.o_c;
            if (var5.y_s != var1 && this.comparator.compare((K)var5.y_s.key, (K)var5.key) < 0) {
               var5 = var5.y_s;
            }

            if (this.comparator.compare((K)var1.key, (K)var5.key) <= 0) {
               break;
            }

            this.swap(var5, var1, var4);
            var4 = var5;
         }
      }
   }

   private BinaryTreeAddressableHeap<K, V>.Node getParent(BinaryTreeAddressableHeap<K, V>.Node var1) {
      if (var1.y_s == null) {
         return null;
      }

      BinaryTreeAddressableHeap.Node var2 = var1.y_s;
      if (var2.o_c == var1) {
         return var2;
      }

      BinaryTreeAddressableHeap.Node var3 = var2.y_s;
      return var3 != null && var3.o_c == var1 ? var3 : var2;
   }

   private BinaryTreeAddressableHeap<K, V>.Node findParentNode(long var1) {
      long[] var3 = new long[]{var1};
      BitSet var4 = BitSet.valueOf(var3);
      BinaryTreeAddressableHeap.Node var5 = this.root;

      for (int var6 = var4.length() - 2; var6 > 0; var6--) {
         if (var4.get(var6)) {
            var5 = var5.o_c.y_s;
         } else {
            var5 = var5.o_c;
         }
      }

      return var5;
   }

   private void swap(BinaryTreeAddressableHeap<K, V>.Node var1, BinaryTreeAddressableHeap<K, V>.Node var2) {
      BinaryTreeAddressableHeap.Node var3 = var1.o_c;
      if (var2.o_c == var1) {
         if (var1.y_s == var2) {
            var1.o_c = var2;
            var2.y_s = var1;
         } else {
            var2.y_s = var1.y_s;
            var2.y_s.y_s = var1;
            var1.o_c = var2;
         }
      } else {
         var2.o_c.y_s = var2;
         var1.o_c = var2.o_c;
         var2.y_s = var1;
      }

      var1.y_s = null;
      var2.o_c = var3;
      if (var3 != null) {
         if (var3.y_s == var1) {
            var3.y_s = var2;
         } else {
            var3.y_s.y_s = var2;
         }
      }

      this.root = var1;
   }

   private void swap(BinaryTreeAddressableHeap<K, V>.Node var1, BinaryTreeAddressableHeap<K, V>.Node var2, BinaryTreeAddressableHeap<K, V>.Node var3) {
      if (var3 == null) {
         this.swap(var1, var2);
      } else {
         BinaryTreeAddressableHeap.Node var4 = var1.o_c;
         if (var3.o_c == var2) {
            if (var2.o_c == var1) {
               if (var1.y_s == var2) {
                  var3.o_c = var1;
                  var1.y_s = var2.y_s;
                  var1.o_c = var2;
                  var2.y_s = var1;
               } else {
                  var1.y_s.y_s = var1;
                  BinaryTreeAddressableHeap.Node var5 = var1.y_s;
                  var1.y_s = var2.y_s;
                  var2.y_s = var5;
                  var3.o_c = var1;
                  var1.o_c = var2;
               }
            } else {
               BinaryTreeAddressableHeap.Node var6 = var2.o_c;
               var1.y_s = var2.y_s;
               var3.o_c = var1;
               var1.o_c = var6;
               var6.y_s = var2;
               var2.y_s = var1;
            }
         } else if (var2.o_c == var1) {
            if (var1.y_s == var2) {
               var1.y_s = var3;
               var3.o_c.y_s = var1;
               var1.o_c = var2;
               var2.y_s = var1;
            } else {
               var3.o_c.y_s = var1;
               var2.y_s = var1.y_s;
               var1.y_s = var3;
               var1.o_c = var2;
               var2.y_s.y_s = var1;
            }
         } else {
            var3.o_c.y_s = var1;
            var1.y_s = var3;
            var1.o_c = var2.o_c;
            var1.o_c.y_s = var2;
            var2.y_s = var1;
         }

         var2.o_c = var4;
         if (var4 != null) {
            if (var4.y_s == var1) {
               var4.y_s = var2;
            } else {
               var4.y_s.y_s = var2;
            }
         }
      }
   }

   private class Node implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      Object key;
      Object value;
      BinaryTreeAddressableHeap<K, V>.Node o_c;
      BinaryTreeAddressableHeap<K, V>.Node y_s;

      Node(K var2, V var3) {
         this.key = var2;
         this.value = var3;
         this.o_c = null;
         this.y_s = null;
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

      @LogarithmicTime
      @Override
      public void decreaseKey(K var1) {
         if (this != BinaryTreeAddressableHeap.this.root && this.y_s == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         int var2;
         if (BinaryTreeAddressableHeap.this.comparator == null) {
            var2 = ((Comparable)var1).compareTo(this.key);
         } else {
            var2 = BinaryTreeAddressableHeap.this.comparator.compare((K)var1, (K)this.key);
         }

         if (var2 > 0) {
            throw new IllegalArgumentException("Keys can only be decreased!");
         }

         this.key = var1;
         if (var2 != 0 && BinaryTreeAddressableHeap.this.root != this) {
            BinaryTreeAddressableHeap.this.fixup(this);
         }
      }

      @LogarithmicTime
      @Override
      public void delete() {
         if (this != BinaryTreeAddressableHeap.this.root && this.y_s == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         BinaryTreeAddressableHeap.Node var1 = BinaryTreeAddressableHeap.this.getParent(this);

         while (var1 != null) {
            BinaryTreeAddressableHeap.Node var2 = BinaryTreeAddressableHeap.this.getParent(var1);
            BinaryTreeAddressableHeap.this.swap(this, var1, var2);
            var1 = var2;
         }

         BinaryTreeAddressableHeap.this.deleteMin();
         this.o_c = null;
         this.y_s = null;
      }
   }
}
