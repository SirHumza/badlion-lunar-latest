package org.jgrapht.util;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AVLTree<T> implements Iterable<T> {
   private AVLTree.TreeNode<T> virtualRoot = new AVLTree.TreeNode<>(null);
   private int modCount = 0;

   public AVLTree() {
   }

   private AVLTree(AVLTree.TreeNode<T> var1) {
      this.makeRoot(var1);
   }

   public AVLTree.TreeNode<T> addMax(T var1) {
      AVLTree.TreeNode var2 = new AVLTree.TreeNode<>(var1);
      this.addMaxNode(var2);
      return var2;
   }

   public void addMaxNode(AVLTree.TreeNode<T> var1) {
      this.registerModification();
      if (this.isEmpty()) {
         this.virtualRoot.left = var1;
         var1.parent = this.virtualRoot;
      } else {
         AVLTree.TreeNode var2 = this.getMax();
         var2.setRightChild(var1);
         this.balance(var2);
      }
   }

   public AVLTree.TreeNode<T> addMin(T var1) {
      AVLTree.TreeNode var2 = new AVLTree.TreeNode<>(var1);
      this.addMinNode(var2);
      return var2;
   }

   public void addMinNode(AVLTree.TreeNode<T> var1) {
      this.registerModification();
      if (this.isEmpty()) {
         this.virtualRoot.left = var1;
         var1.parent = this.virtualRoot;
      } else {
         AVLTree.TreeNode var2 = this.getMin();
         var2.setLeftChild(var1);
         this.balance(var2);
      }
   }

   public AVLTree<T> splitAfter(AVLTree.TreeNode<T> var1) {
      this.registerModification();
      AVLTree.TreeNode var2 = var1.parent;
      boolean var3 = var1.isLeftChild();
      AVLTree.TreeNode var4 = var1.left;
      AVLTree.TreeNode var5 = var1.right;
      var1.parent.substituteChild(var1, null);
      var1.reset();
      if (var4 != null) {
         var4.parent = null;
      }

      if (var5 != null) {
         var5.parent = null;
      }

      if (var4 == null) {
         var4 = var1;
      } else {
         AVLTree.TreeNode var6 = var4;

         while (var6.right != null) {
            var6 = var6.right;
         }

         var6.setRightChild(var1);

         while (var6 != var4) {
            AVLTree.TreeNode var7 = var6.parent;
            var7.substituteChild(var6, this.balanceNode(var6));
            var6 = var7;
         }

         var4 = this.balanceNode(var4);
      }

      return this.split(var4, var5, var2, var3);
   }

   public AVLTree<T> splitBefore(AVLTree.TreeNode<T> var1) {
      this.registerModification();
      AVLTree.TreeNode var2 = this.predecessor(var1);
      if (var2 == null) {
         AVLTree var3 = new AVLTree();
         this.swap(var3);
         return var3;
      } else {
         return this.splitAfter(var2);
      }
   }

   public void mergeAfter(AVLTree<T> var1) {
      this.registerModification();
      if (!var1.isEmpty()) {
         if (var1.getSize() == 1) {
            this.addMaxNode(var1.removeMin());
         } else {
            AVLTree.TreeNode var2 = var1.removeMin();
            AVLTree.TreeNode var3 = var1.getRoot();
            var1.clear();
            this.makeRoot(this.merge(var2, this.getRoot(), var3));
         }
      }
   }

   public void mergeBefore(AVLTree<T> var1) {
      this.registerModification();
      var1.mergeAfter(this);
      this.swap(var1);
   }

   public AVLTree.TreeNode<T> removeMin() {
      this.registerModification();
      if (this.isEmpty()) {
         return null;
      }

      AVLTree.TreeNode var1 = this.getMin();
      if (var1.parent == this.virtualRoot) {
         this.makeRoot(var1.right);
      } else {
         var1.parent.setLeftChild(var1.right);
      }

      this.balance(var1.parent);
      return var1;
   }

   public AVLTree.TreeNode<T> removeMax() {
      this.registerModification();
      if (this.isEmpty()) {
         return null;
      }

      AVLTree.TreeNode var1 = this.getMax();
      if (var1.parent == this.virtualRoot) {
         this.makeRoot(var1.left);
      } else {
         var1.parent.setRightChild(var1.left);
      }

      this.balance(var1.parent);
      return var1;
   }

   public AVLTree.TreeNode<T> getRoot() {
      return this.virtualRoot.left;
   }

   public AVLTree.TreeNode<T> successor(AVLTree.TreeNode<T> var1) {
      return var1.successor;
   }

   public AVLTree.TreeNode<T> predecessor(AVLTree.TreeNode<T> var1) {
      return var1.predecessor;
   }

   public AVLTree.TreeNode<T> getMin() {
      return this.getRoot() == null ? null : this.getRoot().getSubtreeMin();
   }

   public AVLTree.TreeNode<T> getMax() {
      return this.getRoot() == null ? null : this.getRoot().getSubtreeMax();
   }

   public boolean isEmpty() {
      return this.getRoot() == null;
   }

   public void clear() {
      this.registerModification();
      this.virtualRoot.left = null;
   }

   public int getSize() {
      return this.virtualRoot.left == null ? 0 : this.virtualRoot.left.subtreeSize;
   }

   private void makeRoot(AVLTree.TreeNode<T> var1) {
      this.virtualRoot.left = var1;
      if (var1 != null) {
         var1.subtreeMax.successor = null;
         var1.subtreeMin.predecessor = null;
         var1.parent = this.virtualRoot;
      }
   }

   private AVLTree<T> split(AVLTree.TreeNode<T> var1, AVLTree.TreeNode<T> var2, AVLTree.TreeNode<T> var3, boolean var4) {
      while (var3 != this.virtualRoot) {
         boolean var5 = var3.isLeftChild();
         AVLTree.TreeNode var6 = var3.parent;
         var3.parent.substituteChild(var3, null);
         var3.parent = null;
         if (var4) {
            var2 = this.merge(var3, var2, var3.right);
         } else {
            var1 = this.merge(var3, var3.left, var1);
         }

         var3 = var6;
         var4 = var5;
      }

      this.makeRoot(var1);
      return new AVLTree<>(var2);
   }

   private AVLTree.TreeNode<T> merge(AVLTree.TreeNode<T> var1, AVLTree.TreeNode<T> var2, AVLTree.TreeNode<T> var3) {
      if (var2 == null && var3 == null) {
         var1.reset();
         return var1;
      } else if (var2 == null) {
         var3.setLeftChild(this.merge(var1, var2, var3.left));
         return this.balanceNode(var3);
      } else if (var3 == null) {
         var2.setRightChild(this.merge(var1, var2.right, var3));
         return this.balanceNode(var2);
      } else if (var2.getHeight() > var3.getHeight() + 1) {
         var2.setRightChild(this.merge(var1, var2.right, var3));
         return this.balanceNode(var2);
      } else if (var3.getHeight() > var2.getHeight() + 1) {
         var3.setLeftChild(this.merge(var1, var2, var3.left));
         return this.balanceNode(var3);
      } else {
         var1.setLeftChild(var2);
         var1.setRightChild(var3);
         return this.balanceNode(var1);
      }
   }

   private void swap(AVLTree<T> var1) {
      AVLTree.TreeNode var2 = this.virtualRoot.left;
      this.makeRoot(var1.virtualRoot.left);
      var1.makeRoot(var2);
   }

   private AVLTree.TreeNode<T> rotateRight(AVLTree.TreeNode<T> var1) {
      AVLTree.TreeNode var2 = var1.left;
      var2.parent = null;
      var1.setLeftChild(var2.right);
      var2.setRightChild(var1);
      var1.updateHeightAndSubtreeSize();
      var2.updateHeightAndSubtreeSize();
      return var2;
   }

   private AVLTree.TreeNode<T> rotateLeft(AVLTree.TreeNode<T> var1) {
      AVLTree.TreeNode var2 = var1.right;
      var2.parent = null;
      var1.setRightChild(var2.left);
      var2.setLeftChild(var1);
      var1.updateHeightAndSubtreeSize();
      var2.updateHeightAndSubtreeSize();
      return var2;
   }

   private void balance(AVLTree.TreeNode<T> var1) {
      this.balance(var1, this.virtualRoot);
   }

   private void balance(AVLTree.TreeNode<T> var1, AVLTree.TreeNode<T> var2) {
      if (var1 != var2) {
         AVLTree.TreeNode var3 = var1.parent;
         if (var3 == this.virtualRoot) {
            this.makeRoot(this.balanceNode(var1));
         } else {
            var3.substituteChild(var1, this.balanceNode(var1));
         }

         this.balance(var3, var2);
      }
   }

   private AVLTree.TreeNode<T> balanceNode(AVLTree.TreeNode<T> var1) {
      var1.updateHeightAndSubtreeSize();
      if (var1.isLeftDoubleHeavy()) {
         if (var1.left.isRightHeavy()) {
            var1.setLeftChild(this.rotateLeft(var1.left));
         }

         this.rotateRight(var1);
         return var1.parent;
      } else if (var1.isRightDoubleHeavy()) {
         if (var1.right.isLeftHeavy()) {
            var1.setRightChild(this.rotateRight(var1.right));
         }

         this.rotateLeft(var1);
         return var1.parent;
      } else {
         return var1;
      }
   }

   private void registerModification() {
      this.modCount++;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.nodeIterator();

      while (var2.hasNext()) {
         AVLTree.TreeNode var3 = (AVLTree.TreeNode)var2.next();
         var1.append(var3.toString()).append("\n");
      }

      return var1.toString();
   }

   @Override
   public Iterator<T> iterator() {
      return new AVLTree.TreeValuesIterator();
   }

   public Iterator<AVLTree.TreeNode<T>> nodeIterator() {
      return new AVLTree.TreeNodeIterator();
   }

   public static class TreeNode<T> {
      T value;
      AVLTree.TreeNode<T> parent;
      AVLTree.TreeNode<T> left;
      AVLTree.TreeNode<T> right;
      AVLTree.TreeNode<T> successor;
      AVLTree.TreeNode<T> predecessor;
      AVLTree.TreeNode<T> subtreeMin;
      AVLTree.TreeNode<T> subtreeMax;
      int height;
      int subtreeSize;

      TreeNode(T var1) {
         this.value = (T)var1;
         this.reset();
      }

      public T getValue() {
         return this.value;
      }

      public AVLTree.TreeNode<T> getRoot() {
         AVLTree.TreeNode var1 = this;

         while (var1.parent != null) {
            var1 = var1.parent;
         }

         return var1.left;
      }

      public AVLTree.TreeNode<T> getSubtreeMin() {
         return this.subtreeMin;
      }

      public AVLTree.TreeNode<T> getSubtreeMax() {
         return this.subtreeMax;
      }

      public AVLTree.TreeNode<T> getTreeMin() {
         return this.getRoot().getSubtreeMin();
      }

      public AVLTree.TreeNode<T> getTreeMax() {
         return this.getRoot().getSubtreeMax();
      }

      public AVLTree.TreeNode<T> getParent() {
         return this.parent;
      }

      public AVLTree.TreeNode<T> getLeft() {
         return this.left;
      }

      public AVLTree.TreeNode<T> getRight() {
         return this.right;
      }

      int getHeight() {
         return this.height;
      }

      int getSubtreeSize() {
         return this.subtreeSize;
      }

      void reset() {
         this.height = 1;
         this.subtreeSize = 1;
         this.subtreeMin = this;
         this.subtreeMax = this;
         this.left = this.right = this.parent = this.predecessor = this.successor = null;
      }

      int getRightHeight() {
         return this.right == null ? 0 : this.right.height;
      }

      int getLeftHeight() {
         return this.left == null ? 0 : this.left.height;
      }

      int getLeftSubtreeSize() {
         return this.left == null ? 0 : this.left.subtreeSize;
      }

      int getRightSubtreeSize() {
         return this.right == null ? 0 : this.right.subtreeSize;
      }

      void updateHeightAndSubtreeSize() {
         this.height = Math.max(this.getLeftHeight(), this.getRightHeight()) + 1;
         this.subtreeSize = this.getLeftSubtreeSize() + this.getRightSubtreeSize() + 1;
      }

      boolean isLeftDoubleHeavy() {
         return this.getLeftHeight() > this.getRightHeight() + 1;
      }

      boolean isRightDoubleHeavy() {
         return this.getRightHeight() > this.getLeftHeight() + 1;
      }

      boolean isLeftHeavy() {
         return this.getLeftHeight() > this.getRightHeight();
      }

      boolean isRightHeavy() {
         return this.getRightHeight() > this.getLeftHeight();
      }

      boolean isLeftChild() {
         return this == this.parent.left;
      }

      boolean isRightChild() {
         return this == this.parent.right;
      }

      public AVLTree.TreeNode<T> getSuccessor() {
         return this.successor;
      }

      public AVLTree.TreeNode<T> getPredecessor() {
         return this.predecessor;
      }

      void setSuccessor(AVLTree.TreeNode<T> var1) {
         this.successor = var1;
         if (var1 != null) {
            var1.predecessor = this;
         }
      }

      void setPredecessor(AVLTree.TreeNode<T> var1) {
         this.predecessor = var1;
         if (var1 != null) {
            var1.successor = this;
         }
      }

      void setLeftChild(AVLTree.TreeNode<T> var1) {
         this.left = var1;
         if (var1 != null) {
            var1.parent = this;
            this.setPredecessor(var1.subtreeMax);
            this.subtreeMin = var1.subtreeMin;
         } else {
            this.subtreeMin = this;
            this.predecessor = null;
         }
      }

      void setRightChild(AVLTree.TreeNode<T> var1) {
         this.right = var1;
         if (var1 != null) {
            var1.parent = this;
            this.setSuccessor(var1.subtreeMin);
            this.subtreeMax = var1.subtreeMax;
         } else {
            this.successor = null;
            this.subtreeMax = this;
         }
      }

      void substituteChild(AVLTree.TreeNode<T> var1, AVLTree.TreeNode<T> var2) {
         assert this.left == var1 || this.right == var1;
         assert this.left != var1 || this.right != var1;
         if (this.left == var1) {
            this.setLeftChild(var2);
         } else {
            this.setRightChild(var2);
         }
      }

      @Override
      public String toString() {
         return String.format(
            "{%s}: [parent = %s, left = %s, right = %s], [subtreeMin = %s, subtreeMax = %s], [predecessor = %s, successor = %s], [height = %d, subtreeSize = %d]",
            this.value,
            this.parent == null ? "null" : this.parent.value,
            this.left == null ? "null" : this.left.value,
            this.right == null ? "null" : this.right.value,
            this.subtreeMin == null ? "null" : this.subtreeMin.value,
            this.subtreeMax == null ? "null" : this.subtreeMax.value,
            this.predecessor == null ? "null" : this.predecessor.value,
            this.successor == null ? "null" : this.successor.value,
            this.height,
            this.subtreeSize
         );
      }
   }

   private class TreeNodeIterator implements Iterator<AVLTree.TreeNode<T>> {
      private AVLTree.TreeNode<T> nextNode = AVLTree.this.getMin();
      private final int expectedModCount = AVLTree.this.modCount;

      public TreeNodeIterator() {
      }

      @Override
      public boolean hasNext() {
         this.checkForComodification();
         return this.nextNode != null;
      }

      public AVLTree.TreeNode<T> next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         AVLTree.TreeNode var1 = this.nextNode;
         this.nextNode = AVLTree.this.successor(this.nextNode);
         return var1;
      }

      private void checkForComodification() {
         if (this.expectedModCount != AVLTree.this.modCount) {
            throw new ConcurrentModificationException();
         }
      }
   }

   private class TreeValuesIterator implements Iterator<T> {
      private AVLTree<T>.TreeNodeIterator iterator = AVLTree.this.new TreeNodeIterator();

      public TreeValuesIterator() {
      }

      @Override
      public boolean hasNext() {
         return this.iterator.hasNext();
      }

      @Override
      public T next() {
         return this.iterator.next().getValue();
      }
   }
}
