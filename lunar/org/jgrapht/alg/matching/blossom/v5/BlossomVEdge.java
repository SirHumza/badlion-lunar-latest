package org.jgrapht.alg.matching.blossom.v5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;

class BlossomVEdge {
   final int pos;
   AddressableHeap.Handle<Double, BlossomVEdge> handle;
   double slack;
   BlossomVNode[] headOriginal = new BlossomVNode[2];
   BlossomVNode[] head = new BlossomVNode[2];
   BlossomVEdge[] prev;
   BlossomVEdge[] next = new BlossomVEdge[2];

   public BlossomVEdge(int var1) {
      this.prev = new BlossomVEdge[2];
      this.pos = var1;
   }

   public BlossomVNode getOpposite(BlossomVNode var1) {
      if (var1 != this.head[0] && var1 != this.head[1]) {
         return null;
      } else {
         return this.head[0] == var1 ? this.head[1] : this.head[0];
      }
   }

   public BlossomVNode getCurrentOriginal(BlossomVNode var1) {
      if (var1 != this.head[0] && var1 != this.head[1]) {
         return null;
      } else {
         return this.head[0] == var1 ? this.headOriginal[0] : this.headOriginal[1];
      }
   }

   public int getDirFrom(BlossomVNode var1) {
      return this.head[0] == var1 ? 1 : 0;
   }

   @Override
   public String toString() {
      return "BlossomVEdge ("
         + this.head[0].pos
         + ","
         + this.head[1].pos
         + "), original: ["
         + this.headOriginal[0].pos
         + ","
         + this.headOriginal[1].pos
         + "], slack: "
         + this.slack
         + ", true slack: "
         + this.getTrueSlack()
         + (this.getTrueSlack() == 0.0 ? ", tight" : "");
   }

   public double getTrueSlack() {
      double var1 = this.slack;
      if (this.head[0].tree != null) {
         if (this.head[0].isPlusNode()) {
            var1 -= this.head[0].tree.eps;
         } else {
            var1 += this.head[0].tree.eps;
         }
      }

      if (this.head[1].tree != null) {
         if (this.head[1].isPlusNode()) {
            var1 -= this.head[1].tree.eps;
         } else {
            var1 += this.head[1].tree.eps;
         }
      }

      return var1;
   }

   public void moveEdgeTail(BlossomVNode var1, BlossomVNode var2) {
      int var3 = this.getDirFrom(var1);
      var1.removeEdge(this, var3);
      var2.addEdge(this, var3);
   }

   public BlossomVEdge.BlossomNodesIterator blossomNodesIterator(BlossomVNode var1) {
      return new BlossomVEdge.BlossomNodesIterator(var1, this);
   }

   public static class BlossomNodesIterator implements Iterator<BlossomVNode> {
      private BlossomVNode root;
      private BlossomVNode currentNode;
      private BlossomVNode current;
      private int currentDirection;
      private BlossomVEdge blossomFormingEdge;

      public BlossomNodesIterator(BlossomVNode var1, BlossomVEdge var2) {
         this.root = var1;
         this.blossomFormingEdge = var2;
         this.currentNode = this.current = var2.head[0];
         this.currentDirection = 0;
      }

      @Override
      public boolean hasNext() {
         if (this.current != null) {
            return true;
         }

         this.current = this.advance();
         return this.current != null;
      }

      public int getCurrentDirection() {
         return this.currentDirection;
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

         if (this.currentNode == this.root && this.currentDirection == 0) {
            this.currentDirection = 1;
            this.currentNode = this.blossomFormingEdge.head[1];
            if (this.currentNode == this.root) {
               this.currentNode = null;
            }
         } else if (this.currentNode.getTreeParent() == this.root && this.currentDirection == 1) {
            this.currentNode = null;
         } else {
            this.currentNode = this.currentNode.getTreeParent();
         }

         return this.currentNode;
      }
   }
}
