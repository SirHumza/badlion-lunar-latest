package org.jheaps.tree;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.annotations.ConstantTime;

public class BinaryTreeSoftAddressableHeap<K, V> implements Serializable, MergeableAddressableHeap<K, V> {
   private static final long serialVersionUID = 1L;
   private final Comparator<? super K> comparator;
   private static final long[] TARGET_SIZE = new long[]{
      1L,
      2L,
      3L,
      5L,
      8L,
      12L,
      18L,
      27L,
      41L,
      62L,
      93L,
      140L,
      210L,
      315L,
      473L,
      710L,
      1065L,
      1598L,
      2397L,
      3596L,
      5394L,
      8091L,
      12137L,
      18206L,
      27309L,
      40964L,
      61446L,
      92169L,
      138254L,
      207381L,
      311072L,
      466608L,
      699912L,
      1049868L,
      1574802L,
      2362203L,
      3543305L,
      5314958L,
      7972437L,
      11958656L,
      17937984L,
      26906976L,
      40360464L,
      60540696L,
      90811044L,
      136216566L,
      204324849L,
      306487274L,
      459730911L,
      689596367L,
      1034394551L,
      1551591827L,
      2327387741L,
      3491081612L,
      5236622418L,
      7854933627L,
      11782400441L,
      17673600662L,
      26510400993L,
      39765601490L,
      59648402235L,
      89472603353L,
      134208905030L
   };
   private final int rankLimit;
   final BinaryTreeSoftAddressableHeap.RootList<K, V> rootList;
   private long size;
   private BinaryTreeSoftAddressableHeap<K, V> other;

   public BinaryTreeSoftAddressableHeap(double var1) {
      this(var1, null);
   }

   public BinaryTreeSoftAddressableHeap(double var1, Comparator<? super K> var3) {
      if (Double.compare(var1, 0.0) <= 0) {
         throw new IllegalArgumentException("Error rate must be positive");
      }

      if (Double.compare(var1, 1.0) >= 0) {
         throw new IllegalArgumentException("Error rate must be less than one");
      }

      this.rankLimit = (int)Math.ceil(Math.log(1.0 / var1) / Math.log(2.0)) + 5;
      this.rootList = new BinaryTreeSoftAddressableHeap.RootList<>();
      this.comparator = var3;
      this.size = 0L;
      this.other = this;
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
      this.rootList.head = null;
      this.rootList.tail = null;
      this.size = 0L;
   }

   @Override
   public void meld(MergeableAddressableHeap<K, V> var1) {
      BinaryTreeSoftAddressableHeap var2 = (BinaryTreeSoftAddressableHeap)var1;
      if (this.comparator != null) {
         if (var2.comparator == null || !var2.comparator.equals(this.comparator)) {
            throw new IllegalArgumentException("Cannot meld heaps using different comparators!");
         }
      } else if (var2.comparator != null) {
         throw new IllegalArgumentException("Cannot meld heaps using different comparators!");
      }

      if (this.rankLimit != var2.rankLimit) {
         throw new IllegalArgumentException("Cannot meld heaps with different error rates!");
      }

      if (var2.other != var2) {
         throw new IllegalStateException("A heap cannot be used after a meld.");
      }

      this.mergeInto(var2.rootList.head, var2.rootList.tail);
      this.size = this.size + var2.size;
      var2.size = 0L;
      var2.rootList.head = null;
      var2.rootList.tail = null;
      var2.other = this;
   }

   @Override
   public AddressableHeap.Handle<K, V> insert(K var1, V var2) {
      if (this.other != this) {
         throw new IllegalStateException("A heap cannot be used after a meld");
      }

      if (var1 == null) {
         throw new NullPointerException("Null keys not permitted");
      }

      BinaryTreeSoftAddressableHeap.SoftHandle var3 = new BinaryTreeSoftAddressableHeap.SoftHandle<>(this, (K)var1, (V)var2);
      BinaryTreeSoftAddressableHeap.TreeNode var4 = new BinaryTreeSoftAddressableHeap.TreeNode(var3);
      BinaryTreeSoftAddressableHeap.RootListNode var5 = new BinaryTreeSoftAddressableHeap.RootListNode(var4);
      this.mergeInto(var5, var5);
      this.size++;
      return var3;
   }

   @Override
   public AddressableHeap.Handle<K, V> insert(K var1) {
      return this.insert((K)var1, null);
   }

   public BinaryTreeSoftAddressableHeap.SoftHandle<K, V> findMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      } else {
         return this.rootList.head.suffixMin.root.cHead;
      }
   }

   @Override
   public AddressableHeap.Handle<K, V> deleteMin() {
      if (this.size == 0L) {
         throw new NoSuchElementException();
      }

      BinaryTreeSoftAddressableHeap.RootListNode var1 = this.rootList.head.suffixMin;
      BinaryTreeSoftAddressableHeap.TreeNode var2 = var1.root;
      BinaryTreeSoftAddressableHeap.SoftHandle var3 = var2.cHead;
      if (var3.next != null) {
         var3.next.prev = null;
         var3.next.tree = var2;
      }

      var2.cHead = var3.next;
      var2.cSize--;
      if (var2.cHead == null || var2.cSize <= this.targetSize(var2.rank) / 2L) {
         if (var2.left != null || var2.right != null) {
            this.sift(var2);
            this.updateSuffixMin(var1);
         } else if (var2.cHead == null) {
            BinaryTreeSoftAddressableHeap.RootListNode var4 = var1.prev;
            this.delete(var1);
            this.updateSuffixMin(var4);
         }
      }

      var3.next = null;
      var3.prev = null;
      var3.tree = null;
      this.size--;
      return var3;
   }

   private long targetSize(int var1) {
      return var1 <= this.rankLimit ? 1L : TARGET_SIZE[var1 - this.rankLimit];
   }

   private void sift(BinaryTreeSoftAddressableHeap.TreeNode<K, V> var1) {
      ArrayDeque var2 = new ArrayDeque();
      var2.push(var1);

      while (!var2.isEmpty()) {
         var1 = (BinaryTreeSoftAddressableHeap.TreeNode)var2.peek();
         BinaryTreeSoftAddressableHeap.TreeNode var3 = var1.left;
         BinaryTreeSoftAddressableHeap.TreeNode var4 = var1.right;
         if ((var3 != null || var4 != null) && (var1.cHead == null || var1.cSize < this.targetSize(var1.rank))) {
            if (var3 == null
               || var4 != null
                  && (
                     this.comparator == null && ((Comparable)var3.cKey).compareTo(var4.cKey) > 0
                        || this.comparator != null && this.comparator.compare(var3.cKey, var4.cKey) > 0
                  )) {
               var1.left = var4;
               var1.right = var3;
               var3 = var1.left;
            }

            var3.cTail.next = var1.cHead;
            if (var1.cHead != null) {
               var1.cHead.prev = var3.cTail;
            }

            var1.cHead = var3.cHead;
            if (var1.cTail == null) {
               var1.cTail = var3.cTail;
            }

            var1.cHead.tree = var1;
            var1.cSize = var1.cSize + var3.cSize;
            var1.cKey = var3.cKey;
            var3.cKey = null;
            var3.cHead = null;
            var3.cTail = null;
            var3.cSize = 0L;
            if (var3.left == null && var3.right == null) {
               var1.left = null;
            } else {
               var2.push(var3);
            }
         } else {
            var2.pop();
         }
      }
   }

   private BinaryTreeSoftAddressableHeap.TreeNode<K, V> combine(
      BinaryTreeSoftAddressableHeap.TreeNode<K, V> var1, BinaryTreeSoftAddressableHeap.TreeNode<K, V> var2
   ) {
      BinaryTreeSoftAddressableHeap.TreeNode var3 = new BinaryTreeSoftAddressableHeap.TreeNode();
      var3.left = var1;
      var1.parent = var3;
      var3.right = var2;
      var2.parent = var3;
      var3.rank = var1.rank + 1;
      this.sift(var3);
      return var3;
   }

   private void updateSuffixMin(BinaryTreeSoftAddressableHeap.RootListNode<K, V> var1) {
      if (this.comparator == null) {
         while (var1 != null) {
            if (var1.next == null) {
               var1.suffixMin = var1;
            } else {
               BinaryTreeSoftAddressableHeap.RootListNode var3 = var1.next.suffixMin;
               if (((Comparable)var1.root.cKey).compareTo(var3.root.cKey) <= 0) {
                  var1.suffixMin = var1;
               } else {
                  var1.suffixMin = var3;
               }
            }

            var1 = var1.prev;
         }
      } else {
         while (var1 != null) {
            if (var1.next == null) {
               var1.suffixMin = var1;
            } else {
               BinaryTreeSoftAddressableHeap.RootListNode var2 = var1.next.suffixMin;
               if (this.comparator.compare(var1.root.cKey, var2.root.cKey) <= 0) {
                  var1.suffixMin = var1;
               } else {
                  var1.suffixMin = var2;
               }
            }

            var1 = var1.prev;
         }
      }
   }

   private void mergeInto(BinaryTreeSoftAddressableHeap.RootListNode<K, V> var1, BinaryTreeSoftAddressableHeap.RootListNode<K, V> var2) {
      if (this.rootList.head == null) {
         this.rootList.head = var1;
         this.rootList.tail = var2;
      } else {
         BinaryTreeSoftAddressableHeap.RootListNode var5 = null;
         BinaryTreeSoftAddressableHeap.RootListNode var6 = this.rootList.head;
         BinaryTreeSoftAddressableHeap.RootListNode var7 = var1;
         BinaryTreeSoftAddressableHeap.RootListNode var3;
         BinaryTreeSoftAddressableHeap.RootListNode var4;
         if (var6.root.rank <= var7.root.rank) {
            var3 = var6;
            var4 = var6;
            BinaryTreeSoftAddressableHeap.RootListNode var8 = var6.next;
            var6.next = null;
            var6 = var8;
            if (var8 != null) {
               var8.prev = null;
            }
         } else {
            var3 = var7;
            var4 = var7;
            BinaryTreeSoftAddressableHeap.RootListNode var12 = var7.next;
            var7.next = null;
            var7 = var12;
            if (var12 != null) {
               var12.prev = null;
            }
         }

         while (true) {
            int var10 = var4.root.rank;
            int var13;
            if (var6 != null) {
               var13 = var6.root.rank;
            } else {
               if (var7 == null || var7.root.rank > var10) {
                  break;
               }

               var13 = Integer.MAX_VALUE;
            }

            int var9;
            if (var7 != null) {
               var9 = var7.root.rank;
            } else {
               if (var6 == null || var6.root.rank > var10) {
                  break;
               }

               var9 = Integer.MAX_VALUE;
            }

            if (var13 <= var9) {
               switch (Integer.compare(var13, var10)) {
                  case -1:
                     BinaryTreeSoftAddressableHeap.RootListNode var15 = var6.next;
                     var6.next = var4;
                     var4.prev = var6;
                     var6.prev = var5;
                     if (var5 != null) {
                        var5.next = var6;
                     } else {
                        var3 = var6;
                     }

                     var5 = var6;
                     if (var15 != null) {
                        var15.prev = null;
                     }

                     var6 = var15;
                     break;
                  case 0:
                     var4.root = this.combine(var6.root, var4.root);
                     var4.root.parent = var4;
                     BinaryTreeSoftAddressableHeap.RootListNode var11 = var6.next;
                     var6.next = null;
                     if (var11 != null) {
                        var11.prev = null;
                     }

                     var6 = var11;
                     break;
                  case 1:
                     var4.next = var6;
                     var6.prev = var4;
                     var5 = var4;
                     var4 = var6;
                     var6 = var6.next;
                     var4.next = null;
                     if (var6 != null) {
                        var6.prev = null;
                     }
               }
            } else {
               switch (Integer.compare(var9, var10)) {
                  case -1:
                     BinaryTreeSoftAddressableHeap.RootListNode var17 = var7.next;
                     var7.next = var4;
                     var4.prev = var7;
                     var7.prev = var5;
                     if (var5 != null) {
                        var5.next = var7;
                     } else {
                        var3 = var7;
                     }

                     var5 = var7;
                     if (var17 != null) {
                        var17.prev = null;
                     }

                     var7 = var17;
                     break;
                  case 0:
                     var4.root = this.combine(var7.root, var4.root);
                     var4.root.parent = var4;
                     BinaryTreeSoftAddressableHeap.RootListNode var16 = var7.next;
                     var7.next = null;
                     if (var16 != null) {
                        var16.prev = null;
                     }

                     var7 = var16;
                     break;
                  case 1:
                     var4.next = var7;
                     var7.prev = var4;
                     var5 = var4;
                     var4 = var7;
                     var7 = var7.next;
                     var4.next = null;
                     if (var7 != null) {
                        var7.prev = null;
                     }
               }
            }
         }

         BinaryTreeSoftAddressableHeap.RootListNode var14 = var4;
         if (var6 != null) {
            var6.prev = var4;
            var4.next = var6;
            var4 = this.rootList.tail;
         }

         if (var7 != null) {
            var7.prev = var4;
            var4.next = var7;
            var4 = var2;
         }

         this.updateSuffixMin(var14);
         this.rootList.head = var3;
         this.rootList.tail = var4;
      }
   }

   private void delete(BinaryTreeSoftAddressableHeap.RootListNode<K, V> var1) {
      BinaryTreeSoftAddressableHeap.RootListNode var2 = var1.prev;
      if (var2 != null) {
         var2.next = var1.next;
      } else {
         this.rootList.head = var1.next;
      }

      if (var1.next != null) {
         var1.next.prev = var2;
      } else {
         this.rootList.tail = var2;
      }

      var1.prev = null;
      var1.next = null;
   }

   private void delete(BinaryTreeSoftAddressableHeap.SoftHandle<K, V> var1) {
      if (var1.tree == null) {
         throw new IllegalArgumentException("Invalid handle!");
      }

      BinaryTreeSoftAddressableHeap.TreeNode var2 = var1.tree;
      if (var2.cHead != var1) {
         if (var1.next != null) {
            var1.next.prev = var1.prev;
         }

         var1.prev.next = var1.next;
      } else {
         BinaryTreeSoftAddressableHeap.SoftHandle var3 = var1.next;
         var2.cHead = var3;
         if (var3 != null) {
            var3.prev = null;
            var3.tree = var2;
         } else {
            this.sift(var2);
            if (var2.cHead == null) {
               if (var2.parent instanceof BinaryTreeSoftAddressableHeap.TreeNode) {
                  BinaryTreeSoftAddressableHeap.TreeNode var4 = (BinaryTreeSoftAddressableHeap.TreeNode)var2.parent;
                  if (var4.left == var2) {
                     var4.left = null;
                  } else {
                     var4.right = null;
                  }
               } else {
                  this.delete((BinaryTreeSoftAddressableHeap.RootListNode<K, V>)var2.parent);
               }
            }
         }
      }

      var1.tree = null;
      var1.prev = null;
      var1.next = null;
      this.size--;
   }

   static class RootList<K, V> implements Serializable {
      private static final long serialVersionUID = 1L;
      BinaryTreeSoftAddressableHeap.RootListNode<K, V> head = null;
      BinaryTreeSoftAddressableHeap.RootListNode<K, V> tail = null;
   }

   static class RootListNode<K, V> implements Serializable {
      private static final long serialVersionUID = 1L;
      BinaryTreeSoftAddressableHeap.RootListNode<K, V> next;
      BinaryTreeSoftAddressableHeap.RootListNode<K, V> prev;
      BinaryTreeSoftAddressableHeap.RootListNode<K, V> suffixMin;
      BinaryTreeSoftAddressableHeap.TreeNode<K, V> root;

      RootListNode(BinaryTreeSoftAddressableHeap.TreeNode<K, V> var1) {
         this.root = var1;
         var1.parent = this;
         this.suffixMin = this;
         this.next = null;
         this.prev = null;
      }
   }

   static class SoftHandle<K, V> implements Serializable, AddressableHeap.Handle<K, V> {
      private static final long serialVersionUID = 1L;
      BinaryTreeSoftAddressableHeap<K, V> heap;
      K key;
      V value;
      BinaryTreeSoftAddressableHeap.SoftHandle<K, V> next;
      BinaryTreeSoftAddressableHeap.SoftHandle<K, V> prev;
      BinaryTreeSoftAddressableHeap.TreeNode<K, V> tree;

      SoftHandle(BinaryTreeSoftAddressableHeap<K, V> var1, K var2, V var3) {
         this.heap = var1;
         this.key = (K)var2;
         this.value = (V)var3;
         this.next = null;
         this.prev = null;
         this.tree = null;
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
         throw new UnsupportedOperationException("Not supported in a soft heap");
      }

      @Override
      public void delete() {
         this.getOwner().delete(this);
      }

      BinaryTreeSoftAddressableHeap<K, V> getOwner() {
         if (this.heap.other != this.heap) {
            BinaryTreeSoftAddressableHeap var1 = this.heap;

            while (var1 != var1.other) {
               var1 = var1.other;
            }

            BinaryTreeSoftAddressableHeap var2 = this.heap;

            while (var2.other != var1) {
               BinaryTreeSoftAddressableHeap var3 = var2.other;
               var2.other = var1;
               var2 = var3;
            }

            this.heap = var1;
         }

         return this.heap;
      }
   }

   static class TreeNode<K, V> implements Serializable {
      private static final long serialVersionUID = 1L;
      int rank = 0;
      Object parent = null;
      BinaryTreeSoftAddressableHeap.TreeNode<K, V> left = null;
      BinaryTreeSoftAddressableHeap.TreeNode<K, V> right = null;
      BinaryTreeSoftAddressableHeap.SoftHandle<K, V> cHead;
      BinaryTreeSoftAddressableHeap.SoftHandle<K, V> cTail;
      long cSize;
      K cKey;

      TreeNode() {
         this(null);
      }

      TreeNode(BinaryTreeSoftAddressableHeap.SoftHandle<K, V> var1) {
         this.cHead = var1;
         this.cTail = var1;
         if (var1 != null) {
            this.cSize = 1L;
            this.cKey = var1.key;
            var1.tree = this;
         } else {
            this.cSize = 0L;
            this.cKey = null;
         }
      }
   }
}
