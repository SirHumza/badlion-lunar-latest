package org.jgrapht.alg.matching.blossom.v5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jheaps.MergeableAddressableHeap;
import org.jheaps.tree.PairingHeap;

class BlossomVTree {
   private static int currentId = 1;
   BlossomVTreeEdge[] first;
   BlossomVTreeEdge currentEdge;
   int currentDirection;
   double eps;
   double accumulatedEps;
   BlossomVNode root;
   BlossomVTree nextTree;
   MergeableAddressableHeap<Double, BlossomVEdge> plusPlusEdges;
   MergeableAddressableHeap<Double, BlossomVEdge> plusInfinityEdges;
   MergeableAddressableHeap<Double, BlossomVNode> minusBlossoms;
   int id;

   public BlossomVTree() {
   }

   public BlossomVTree(BlossomVNode var1) {
      this.root = var1;
      var1.tree = this;
      var1.isTreeRoot = true;
      this.first = new BlossomVTreeEdge[2];
      this.plusPlusEdges = new PairingHeap<>();
      this.plusInfinityEdges = new PairingHeap<>();
      this.minusBlossoms = new PairingHeap<>();
      this.id = currentId++;
   }

   public static BlossomVTreeEdge addTreeEdge(BlossomVTree var0, BlossomVTree var1) {
      BlossomVTreeEdge var2 = new BlossomVTreeEdge();
      var2.head[0] = var1;
      var2.head[1] = var0;
      if (var0.first[0] != null) {
         var0.first[0].prev[0] = var2;
      }

      if (var1.first[1] != null) {
         var1.first[1].prev[1] = var2;
      }

      var2.next[0] = var0.first[0];
      var2.next[1] = var1.first[1];
      var0.first[0] = var2;
      var1.first[1] = var2;
      var1.currentEdge = var2;
      var1.currentDirection = 0;
      return var2;
   }

   public void setCurrentEdges() {
      BlossomVTree.TreeEdgeIterator var2 = this.treeEdgeIterator();

      while (var2.hasNext()) {
         BlossomVTreeEdge var1 = var2.next();
         BlossomVTree var3 = var1.head[var2.getCurrentDirection()];
         var3.currentEdge = var1;
         var3.currentDirection = var2.getCurrentDirection();
      }
   }

   public void clearCurrentEdges() {
      this.currentEdge = null;
      BlossomVTree.TreeEdgeIterator var1 = this.treeEdgeIterator();

      while (var1.hasNext()) {
         var1.next().head[var1.getCurrentDirection()].currentEdge = null;
      }
   }

   public void printTreeNodes() {
      System.out.println("Printing tree nodes");
      BlossomVTree.TreeNodeIterator var1 = this.treeNodeIterator();

      while (var1.hasNext()) {
         System.out.println(var1.next());
      }
   }

   @Override
   public String toString() {
      return "BlossomVTree pos=" + this.id + ", eps = " + this.eps + ", root = " + this.root;
   }

   public void addPlusPlusEdge(BlossomVEdge var1) {
      var1.handle = this.plusPlusEdges.insert(var1.slack, var1);
   }

   public void addPlusInfinityEdge(BlossomVEdge var1) {
      var1.handle = this.plusInfinityEdges.insert(var1.slack, var1);
   }

   public void addMinusBlossom(BlossomVNode var1) {
      var1.handle = this.minusBlossoms.insert(var1.dual, var1);
   }

   public void removePlusPlusEdge(BlossomVEdge var1) {
      var1.handle.delete();
   }

   public void removePlusInfinityEdge(BlossomVEdge var1) {
      var1.handle.delete();
   }

   public void removeMinusBlossom(BlossomVNode var1) {
      var1.handle.delete();
   }

   public BlossomVTree.TreeNodeIterator treeNodeIterator() {
      return new BlossomVTree.TreeNodeIterator(this.root);
   }

   public BlossomVTree.TreeEdgeIterator treeEdgeIterator() {
      return new BlossomVTree.TreeEdgeIterator();
   }

   public class TreeEdgeIterator implements Iterator<BlossomVTreeEdge> {
      private int currentDirection;
      private BlossomVTreeEdge currentEdge = BlossomVTree.this.first[0];
      private BlossomVTreeEdge result;

      public TreeEdgeIterator() {
         this.currentDirection = 0;
         if (this.currentEdge == null) {
            this.currentEdge = BlossomVTree.this.first[1];
            this.currentDirection = 1;
         }

         this.result = this.currentEdge;
      }

      @Override
      public boolean hasNext() {
         if (this.result != null) {
            return true;
         }

         this.result = this.advance();
         return this.result != null;
      }

      public BlossomVTreeEdge next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         BlossomVTreeEdge var1 = this.result;
         this.result = null;
         return var1;
      }

      public int getCurrentDirection() {
         return this.currentDirection;
      }

      private BlossomVTreeEdge advance() {
         if (this.currentEdge == null) {
            return null;
         }

         this.currentEdge = this.currentEdge.next[this.currentDirection];
         if (this.currentEdge == null && this.currentDirection == 0) {
            this.currentDirection = 1;
            this.currentEdge = BlossomVTree.this.first[1];
         }

         return this.currentEdge;
      }
   }

   public static class TreeNodeIterator implements Iterator<BlossomVNode> {
      private BlossomVNode currentNode;
      private BlossomVNode current;
      private BlossomVNode treeRoot;

      public TreeNodeIterator(BlossomVNode var1) {
         this.currentNode = this.current = var1;
         this.treeRoot = var1;
      }

      @Override
      public boolean hasNext() {
         if (this.current != null) {
            return true;
         }

         this.current = this.advance();
         return this.current != null;
      }

      public BlossomVNode next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         BlossomVNode var1 = this.current;
         this.current = null;
         return var1;
      }

      private BlossomVNode advance() {
         if (this.currentNode == null) {
            return null;
         }

         if (this.currentNode.firstTreeChild != null) {
            this.currentNode = this.currentNode.firstTreeChild;
            return this.currentNode;
         }

         while (this.currentNode != this.treeRoot && this.currentNode.treeSiblingNext == null) {
            this.currentNode = this.currentNode.parentEdge.getOpposite(this.currentNode);
         }

         this.currentNode = this.currentNode.treeSiblingNext;
         if (this.currentNode == this.treeRoot.treeSiblingNext) {
            this.currentNode = null;
         }

         return this.currentNode;
      }
   }
}
