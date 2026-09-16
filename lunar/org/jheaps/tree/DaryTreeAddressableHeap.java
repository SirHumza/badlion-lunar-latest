package org.jheaps.tree;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.annotations.ConstantTime;
import org.jheaps.annotations.LogarithmicTime;

public class DaryTreeAddressableHeap<K, V> implements Serializable, AddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private final Comparator<? super K> comparator;
   private long size;
   private DaryTreeAddressableHeap<K, V>.Node root;
   private final int d;
   private final int log2d;
   private DaryTreeAddressableHeap<K, V>.Node[] aux;

   public DaryTreeAddressableHeap(int var1) {
      this(var1, null);
   }

   public DaryTreeAddressableHeap(int var1, Comparator<? super K> var2) {
      this.comparator = var2;
      this.size = 0L;
      this.root = null;
      if (var1 >= 2 && (var1 & var1 - 1) == 0) {
         this.d = var1;
         this.log2d = this.log2(var1);
         this.aux = (DaryTreeAddressableHeap.Node[])Array.newInstance(DaryTreeAddressableHeap.Node.class, var1);
      } else {
         throw new IllegalArgumentException("Branching factor d should be a power of 2.");
      }
   }

   @LogarithmicTime
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1, V var2) {
      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      DaryTreeAddressableHeap.Node var3 = new DaryTreeAddressableHeap.Node(var1, var2, this.d);
      if (this.size == 0L) {
         this.root = var3;
         this.size = 1L;
         return var3;
      }

      DaryTreeAddressableHeap.Node var4 = this.findNode(this.size);

      for (int var5 = 0; var5 < this.d; var5++) {
         if (var4.children[var5] == null) {
            var4.children[var5] = var3;
            break;
         }
      }

      var3.parent = var4;
      this.size++;
      this.fixup(var3);
      return var3;
   }

   @LogarithmicTime
   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
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

      DaryTreeAddressableHeap.Node var1 = this.root;
      if (this.size == 1L) {
         this.root = null;
         this.size = 0L;
      } else {
         this.root.delete();
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

   @ConstantTime
   @Override
   public void clear() {
      this.size = 0L;
      this.root = null;
   }

   @Override
   public Comparator<? super K> comparator() {
      return this.comparator;
   }

   private DaryTreeAddressableHeap<K, V>.Node findNode(long var1) {
      if (var1 == 0L) {
         return this.root;
      }

      long var3 = this.d - 1L;
      long var5 = var1 - 1L;
      int var7 = this.log2(var1 - 1L) / this.log2d;
      DaryTreeAddressableHeap.Node var8 = this.root;

      for (int var9 = var7; var9 >= 0; var9--) {
         int var10 = var9 * this.log2d;
         int var11 = (int)((var5 & var3 << var10) >>> var10);
         DaryTreeAddressableHeap.Node var12 = var8.children[var11];
         if (var12 == null) {
            break;
         }

         var8 = var12;
      }

      return var8;
   }

   private int log2(long var1) {
      long var3 = 0L;
      if ((var1 & -4294967296L) != 0L) {
         var1 >>>= 32;
         var3 = 32L;
      }

      if ((var1 & -65536L) != 0L) {
         var1 >>>= 16;
         var3 += 16L;
      }

      if (var1 >= 256L) {
         var1 >>>= 8;
         var3 += 8L;
      }

      if (var1 >= 16L) {
         var1 >>>= 4;
         var3 += 4L;
      }

      if (var1 >= 4L) {
         var1 >>>= 2;
         var3 += 2L;
      }

      return (int)(var3 + (var1 >>> 1));
   }

   private void fixup(DaryTreeAddressableHeap<K, V>.Node var1) {
      if (this.comparator == null) {
         DaryTreeAddressableHeap.Node var2 = var1.parent;

         while (var2 != null && ((Comparable)var1.key).compareTo(var2.key) < 0) {
            DaryTreeAddressableHeap.Node var3 = var2.parent;
            this.swap(var1, var2);
            var2 = var3;
         }
      } else {
         DaryTreeAddressableHeap.Node var4 = var1.parent;

         while (var4 != null && this.comparator.compare((K)var1.key, (K)var4.key) < 0) {
            DaryTreeAddressableHeap.Node var5 = var4.parent;
            this.swap(var1, var4);
            var4 = var5;
         }
      }
   }

   private void fixdown(DaryTreeAddressableHeap<K, V>.Node var1) {
      if (this.comparator == null) {
         while (var1.children[0] != null) {
            byte var6 = 0;
            DaryTreeAddressableHeap.Node var7 = var1.children[var6];

            for (int var8 = 1; var8 < this.d; var8++) {
               DaryTreeAddressableHeap.Node var9 = var1.children[var8];
               if (var9 != null && ((Comparable)var9.key).compareTo(var7.key) < 0) {
                  var7 = var9;
               }
            }

            if (((Comparable)var1.key).compareTo(var7.key) <= 0) {
               break;
            }

            this.swap(var7, var1);
         }
      } else {
         while (var1.children[0] != null) {
            byte var2 = 0;
            DaryTreeAddressableHeap.Node var3 = var1.children[var2];

            for (int var4 = 1; var4 < this.d; var4++) {
               DaryTreeAddressableHeap.Node var5 = var1.children[var4];
               if (var5 != null && this.comparator.compare((K)var5.key, (K)var3.key) < 0) {
                  var3 = var5;
               }
            }

            if (this.comparator.compare((K)var1.key, (K)var3.key) <= 0) {
               break;
            }

            this.swap(var3, var1);
         }
      }
   }

   private void swap(DaryTreeAddressableHeap<K, V>.Node var1, DaryTreeAddressableHeap<K, V>.Node var2) {
      if (var1 != null && var2 != null && var1 != var2) {
         if (var1.parent == var2) {
            DaryTreeAddressableHeap.Node var3 = var1;
            var1 = var2;
            var2 = var3;
         }

         DaryTreeAddressableHeap.Node var8 = var1.parent;
         if (var2.parent == var1) {
            int var4 = -1;

            for (int var5 = 0; var5 < this.d; var5++) {
               this.aux[var5] = var2.children[var5];
               if (var2 == var1.children[var5]) {
                  var2.children[var5] = var1;
                  var1.parent = var2;
               } else {
                  var2.children[var5] = var1.children[var5];
                  if (var2.children[var5] != null) {
                     var2.children[var5].parent = var2;
                  }
               }

               if (var8 != null && var8.children[var5] == var1) {
                  var4 = var5;
               }
            }

            var2.parent = var8;
            if (var8 != null) {
               var8.children[var4] = var2;
            }

            for (int var10 = 0; var10 < this.d; var10++) {
               var1.children[var10] = this.aux[var10];
               if (var1.children[var10] != null) {
                  var1.children[var10].parent = var1;
               }

               this.aux[var10] = null;
            }
         } else {
            DaryTreeAddressableHeap.Node var9 = var2.parent;

            for (int var11 = 0; var11 < this.d; var11++) {
               this.aux[var11] = var2.children[var11];
               var2.children[var11] = var1.children[var11];
               if (var2.children[var11] != null) {
                  var2.children[var11].parent = var2;
               }
            }

            for (int var12 = 0; var12 < this.d; var12++) {
               var1.children[var12] = this.aux[var12];
               if (var1.children[var12] != null) {
                  var1.children[var12].parent = var1;
               }

               this.aux[var12] = null;
            }

            int var13 = -1;
            if (var8 != null) {
               for (int var6 = 0; var6 < this.d; var6++) {
                  if (var8.children[var6] == var1) {
                     var13 = var6;
                  }
               }
            } else {
               var2.parent = null;
            }

            int var14 = -1;
            if (var9 != null) {
               for (int var7 = 0; var7 < this.d; var7++) {
                  if (var9.children[var7] == var2) {
                     var14 = var7;
                  }
               }
            } else {
               var1.parent = null;
            }

            if (var13 >= 0) {
               var8.children[var13] = var2;
               var2.parent = var8;
            }

            if (var14 >= 0) {
               var9.children[var14] = var1;
               var1.parent = var9;
            }
         }

         if (this.root == var1) {
            this.root = var2;
         } else if (this.root == var2) {
            this.root = var1;
         }
      }
   }

   private class Node implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      Object key;
      Object value;
      DaryTreeAddressableHeap<K, V>.Node parent;
      DaryTreeAddressableHeap<K, V>.Node[] children;

      Node(K var2, V var3, int var4) {
         this.key = var2;
         this.value = var3;
         this.parent = null;
         this.children = (DaryTreeAddressableHeap.Node[])Array.newInstance(DaryTreeAddressableHeap.Node.class, var4);
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
         if (this.parent == null && DaryTreeAddressableHeap.this.root != this) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         int var2;
         if (DaryTreeAddressableHeap.this.comparator == null) {
            var2 = ((Comparable)var1).compareTo(this.key);
         } else {
            var2 = DaryTreeAddressableHeap.this.comparator.compare((K)var1, (K)this.key);
         }

         if (var2 > 0) {
            throw new IllegalArgumentException("Keys can only be decreased!");
         }

         this.key = var1;
         if (var2 != 0 && DaryTreeAddressableHeap.this.root != this) {
            DaryTreeAddressableHeap.this.fixup(this);
         }
      }

      @LogarithmicTime
      @Override
      public void delete() {
         if (this.parent == null && DaryTreeAddressableHeap.this.root != this) {
            throw new IllegalArgumentException("Invalid handle!");
         }

         if (DaryTreeAddressableHeap.this.size == 0L) {
            throw new NoSuchElementException();
         }

         DaryTreeAddressableHeap.Node var1 = DaryTreeAddressableHeap.this.findNode(DaryTreeAddressableHeap.this.size - 1L);
         DaryTreeAddressableHeap.this.swap(this, var1);
         if (this.parent != null) {
            for (int var2 = 0; var2 < DaryTreeAddressableHeap.this.d; var2++) {
               if (this.parent.children[var2] == this) {
                  this.parent.children[var2] = null;
               }
            }

            this.parent = null;
         }

         DaryTreeAddressableHeap.this.size--;
         if (DaryTreeAddressableHeap.this.size == 0L) {
            DaryTreeAddressableHeap.this.root = null;
         } else if (this != var1) {
            DaryTreeAddressableHeap.this.fixdown(var1);
         }
      }
   }
}
