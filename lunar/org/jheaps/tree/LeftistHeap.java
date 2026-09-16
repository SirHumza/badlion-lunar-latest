package org.jheaps.tree;

import java.util.Comparator;
import java.util.LinkedList;

public class LeftistHeap<K, V> extends SkewHeap<K, V> {
   private static final long serialVersionUID = -5948402731186806608L;

   public LeftistHeap() {
      this(null);
   }

   public LeftistHeap(Comparator<? super K> var1) {
      super(var1);
   }

   @Override
   protected SkewHeap.Node<K, V> createNode(K var1, V var2) {
      return new LeftistHeap.LeftistNode<>(this, (K)var1, (V)var2);
   }

   protected void swapChildren(SkewHeap.Node<K, V> var1) {
      SkewHeap.Node var2 = var1.o_c;
      if (var2 != null) {
         SkewHeap.Node var3 = var2.y_s;
         if (var3 != var1) {
            var1.o_c = var3;
            var3.y_s = var2;
            var2.y_s = var1;
         }
      }
   }

   @Override
   protected SkewHeap.Node<K, V> union(SkewHeap.Node<K, V> var1, SkewHeap.Node<K, V> var2) {
      if (var1 == null) {
         return var2;
      }

      if (var2 == null) {
         return var1;
      }

      LinkedList var4 = new LinkedList();
      int var5 = ((Comparable)var1.key).compareTo(var2.key);
      SkewHeap.Node var3;
      if (var5 <= 0) {
         var3 = var1;
         var1 = this.unlinkRightChild(var1);
      } else {
         var3 = var2;
         var2 = this.unlinkRightChild(var2);
      }

      SkewHeap.Node var6 = var3;
      var4.push((LeftistHeap.LeftistNode)var6);

      while (var1 != null && var2 != null) {
         var5 = ((Comparable)var1.key).compareTo(var2.key);
         if (var5 <= 0) {
            if (var6.o_c == null) {
               var6.o_c = var1;
            } else {
               var6.o_c.y_s = var1;
            }

            var1.y_s = var6;
            var6 = var1;
            var4.push((LeftistHeap.LeftistNode)var6);
            var1 = this.unlinkRightChild(var1);
         } else {
            if (var6.o_c == null) {
               var6.o_c = var2;
            } else {
               var6.o_c.y_s = var2;
            }

            var2.y_s = var6;
            var6 = var2;
            var4.push((LeftistHeap.LeftistNode)var6);
            var2 = this.unlinkRightChild(var2);
         }
      }

      if (var1 != null) {
         if (var6.o_c == null) {
            var6.o_c = var1;
         } else {
            var6.o_c.y_s = var1;
         }

         var1.y_s = var6;
      }

      if (var2 != null) {
         if (var6.o_c == null) {
            var6.o_c = var2;
         } else {
            var6.o_c.y_s = var2;
         }

         var2.y_s = var6;
      }

      while (!var4.isEmpty()) {
         LeftistHeap.LeftistNode var7 = (LeftistHeap.LeftistNode)var4.pop();
         if (var7.o_c != null) {
            LeftistHeap.LeftistNode var8 = (LeftistHeap.LeftistNode)var7.o_c;
            int var9 = var8.npl;
            int var10 = -1;
            if (var8.y_s != var7) {
               LeftistHeap.LeftistNode var11 = (LeftistHeap.LeftistNode)var8.y_s;
               var10 = var11.npl;
            }

            var7.npl = 1 + Math.min(var9, var10);
            if (var9 < var10) {
               this.swapChildren(var7);
            }
         } else {
            var7.npl = 0;
         }
      }

      return var3;
   }

   @Override
   protected SkewHeap.Node<K, V> unionWithComparator(SkewHeap.Node<K, V> var1, SkewHeap.Node<K, V> var2) {
      if (var1 == null) {
         return var2;
      }

      if (var2 == null) {
         return var1;
      }

      LinkedList var4 = new LinkedList();
      int var5 = this.comparator.compare(var1.key, var2.key);
      SkewHeap.Node var3;
      if (var5 <= 0) {
         var3 = var1;
         var1 = this.unlinkRightChild(var1);
      } else {
         var3 = var2;
         var2 = this.unlinkRightChild(var2);
      }

      SkewHeap.Node var6 = var3;
      var4.push((LeftistHeap.LeftistNode)var6);

      while (var1 != null && var2 != null) {
         var5 = this.comparator.compare(var1.key, var2.key);
         if (var5 <= 0) {
            if (var6.o_c == null) {
               var6.o_c = var1;
            } else {
               var6.o_c.y_s = var1;
            }

            var1.y_s = var6;
            var6 = var1;
            var4.push((LeftistHeap.LeftistNode)var6);
            var1 = this.unlinkRightChild(var1);
         } else {
            if (var6.o_c == null) {
               var6.o_c = var2;
            } else {
               var6.o_c.y_s = var2;
            }

            var2.y_s = var6;
            var6 = var2;
            var4.push((LeftistHeap.LeftistNode)var6);
            var2 = this.unlinkRightChild(var2);
         }
      }

      if (var1 != null) {
         if (var6.o_c == null) {
            var6.o_c = var1;
         } else {
            var6.o_c.y_s = var1;
         }

         var1.y_s = var6;
      }

      if (var2 != null) {
         if (var6.o_c == null) {
            var6.o_c = var2;
         } else {
            var6.o_c.y_s = var2;
         }

         var2.y_s = var6;
      }

      while (!var4.isEmpty()) {
         LeftistHeap.LeftistNode var7 = (LeftistHeap.LeftistNode)var4.pop();
         if (var7.o_c != null) {
            LeftistHeap.LeftistNode var8 = (LeftistHeap.LeftistNode)var7.o_c;
            int var9 = var8.npl;
            int var10 = -1;
            if (var8.y_s != var7) {
               LeftistHeap.LeftistNode var11 = (LeftistHeap.LeftistNode)var8.y_s;
               var10 = var11.npl;
            }

            var7.npl = 1 + Math.min(var9, var10);
            if (var9 < var10) {
               this.swapChildren(var7);
            }
         } else {
            var7.npl = 0;
         }
      }

      return var3;
   }

   static class LeftistNode<K, V> extends SkewHeap.Node<K, V> {
      private static final long serialVersionUID = 1L;
      int npl = 0;

      LeftistNode(LeftistHeap<K, V> var1, K var2, V var3) {
         super(var1, (K)var2, (V)var3);
      }
   }
}
