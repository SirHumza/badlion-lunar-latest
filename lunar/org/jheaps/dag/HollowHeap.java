package org.jheaps.dag;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class HollowHeap<K, V> implements Serializable, MergeableAddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private static final int AUX_BUCKET_ARRAY_SIZE = 128;
   private final Comparator<? super K> comparator;
   private HollowHeap.HollowNode<K, V> root = null;
   private long size;
   private long nodes;
   private HollowHeap.HollowNode<K, V>[] aux;
   private HollowHeap<K, V> other;

   @ConstantTime
   public HollowHeap() {
      this(null);
   }

   @ConstantTime
   public HollowHeap(Comparator<? super K> var1) {
      this.comparator = var1;
      this.size = 0L;
      this.nodes = 0L;
      this.aux = (HollowHeap.HollowNode<K, V>[])Array.newInstance(HollowHeap.HollowNode.class, 128);
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

      HollowHeap.Item var3 = new HollowHeap.Item<>(var1, var2);
      HollowHeap.HollowNode var4 = new HollowHeap.HollowNode<>(this, (K)var1);
      var4.item = var3;
      var3.node = var4;
      this.nodes++;
      if (this.root == null) {
         this.root = var4;
      } else {
         this.root = this.link(this.root, var4);
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
         return this.root.item;
      }
   }

   @LogarithmicTime(amortized = true)
   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      HollowHeap.Item var1 = this.root.item;
      var1.delete();
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
      this.nodes = 0L;
   }

   @ConstantTime
   @Override
   public void meld(MergeableAddressableHeap<K, V> var1) {
      HollowHeap var2 = (HollowHeap)var1;
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
         this.root = this.link(this.root, var2.root);
      }

      this.size = this.size + var2.size;
      this.nodes = this.nodes + var2.nodes;
      var2.size = 0L;
      var2.nodes = 0L;
      var2.root = null;
      var2.other = this;
   }

   private void decreaseKey(HollowHeap.Item<K, V> var1, K var2) {
      assert var1.node != null;
      int var3;
      if (this.comparator == null) {
         var3 = ((Comparable)var2).compareTo(var1.getKey());
      } else {
         var3 = this.comparator.compare((K)var2, (K)var1.getKey());
      }

      if (var3 > 0) {
         throw new IllegalArgumentException("Keys can only be decreased!");
      }

      HollowHeap.HollowNode var4 = var1.node;
      if (var3 != 0 && var4 != this.root) {
         HollowHeap.HollowNode var5 = new HollowHeap.HollowNode<>(this, (K)var2);
         this.nodes++;
         var4.item = null;
         var5.item = var1;
         var1.node = var5;
         var1.key = (K)var2;
         if (var4.rank > 2) {
            var5.rank = var4.rank - 2;
         }

         var5.child = var4;
         var4.sp = var5;
         this.root = this.link(this.root, var5);
      } else {
         var1.key = (K)var2;
         var4.key = (K)var2;
      }
   }

   private void delete(HollowHeap.Item<K, V> var1) {
      assert var1.node != null;
      assert var1.node.item == var1;
      var1.node.item = null;
      var1.node = null;
      this.size--;
      if (this.root.item == null) {
         int var2 = -1;

         while (this.root != null) {
            HollowHeap.HollowNode var3 = this.root;
            this.root = this.root.next;
            HollowHeap.HollowNode var4 = var3.child;

            while (var4 != null) {
               HollowHeap.HollowNode var5 = var4;
               var4 = var4.next;
               var5.next = null;
               if (var5.item == null) {
                  if (var5.sp == null) {
                     var5.next = this.root;
                     this.root = var5;
                  } else if (var5.sp == var3) {
                     var5.sp = null;
                  } else {
                     var5.sp = null;
                     var5.next = null;
                  }
               } else {
                  var2 = Math.max(var2, this.doRankedLinks(var5));
               }
            }

            this.nodes--;
            var3.next = null;
            var3.child = null;
            var3.sp = null;
            var3.item = null;
         }

         this.doUnrankedLinks(var2);
      }
   }

   private int doRankedLinks(HollowHeap.HollowNode<K, V> var1) {
      while (this.aux[var1.rank] != null) {
         var1 = this.link(var1, this.aux[var1.rank]);
         this.aux[var1.rank] = null;
         var1.rank++;
      }

      this.aux[var1.rank] = var1;
      return var1.rank;
   }

   private void doUnrankedLinks(int var1) {
      assert this.root == null;

      for (int var2 = 0; var2 <= var1; var2++) {
         HollowHeap.HollowNode var3 = this.aux[var2];
         if (var3 != null) {
            if (this.root == null) {
               this.root = var3;
            } else {
               this.root = this.link(this.root, var3);
            }

            this.aux[var2] = null;
         }
      }
   }

   private HollowHeap.HollowNode<K, V> link(HollowHeap.HollowNode<K, V> var1, HollowHeap.HollowNode<K, V> var2) {
      int var3;
      if (this.comparator == null) {
         var3 = ((Comparable)var1.key).compareTo(var2.key);
      } else {
         var3 = this.comparator.compare(var1.key, var2.key);
      }

      if (var3 > 0) {
         var1.next = var2.child;
         var2.child = var1;
         return var2;
      } else {
         var2.next = var1.child;
         var1.child = var2;
         return var1;
      }
   }

   static class HollowNode<K, V> implements Serializable {
      private static final long serialVersionUID = 1L;
      HollowHeap<K, V> heap;
      K key;
      HollowHeap.HollowNode<K, V> child;
      HollowHeap.HollowNode<K, V> next;
      HollowHeap.HollowNode<K, V> sp;
      int rank;
      HollowHeap.Item<K, V> item;

      HollowNode(HollowHeap<K, V> var1, K var2) {
         this.heap = var1;
         this.key = (K)var2;
         this.item = null;
         this.child = null;
         this.next = null;
         this.sp = null;
         this.rank = 0;
      }

      HollowHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            HollowHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            HollowHeap var2 = this.heap;

            while (var2.other != var1) {
               HollowHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }

   static class Item<K, V> implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      private HollowHeap.HollowNode<K, V> node;
      private K key;
      private V value;

      public Item(K var1, V var2) {
         this.key = (K)var1;
         this.value = (V)var2;
         this.node = null;
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
         this.checkInvalid();
         this.getOwner().decreaseKey(this, (K)var1);
      }

      @Override
      public void delete() {
         this.checkInvalid();
         this.getOwner().delete(this);
      }

      HollowHeap<K, V> getOwner() {
         return this.node.getOwner();
      }

      private void checkInvalid() {
         if (this.node == null) {
            throw new IllegalArgumentException("Invalid handle!");
         }
      }
   }
}
