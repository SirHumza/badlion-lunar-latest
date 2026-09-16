package org.jgrapht.alg.matching.blossom.v5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jheaps.AddressableHeap;

class BlossomVNode {
   AddressableHeap.Handle<Double, BlossomVNode> handle;
   boolean isTreeRoot;
   boolean isBlossom;
   boolean isOuter;
   boolean isProcessed;
   boolean isMarked;
   BlossomVNode.Label label;
   BlossomVEdge[] first = new BlossomVEdge[2];
   double dual;
   BlossomVEdge matched;
   BlossomVEdge bestEdge;
   BlossomVTree tree;
   BlossomVEdge parentEdge;
   BlossomVNode firstTreeChild;
   BlossomVNode treeSiblingNext;
   BlossomVNode treeSiblingPrev;
   BlossomVNode blossomParent;
   BlossomVNode blossomGrandparent;
   BlossomVEdge blossomSibling;
   int pos;

   public BlossomVNode(int var1) {
      this.label = BlossomVNode.Label.PLUS;
      this.pos = var1;
   }

   public void addEdge(BlossomVEdge var1, int var2) {
      if (this.first[var2] == null) {
         this.first[var2] = var1.next[var2] = var1.prev[var2] = var1;
      } else {
         var1.prev[var2] = this.first[var2].prev[var2];
         var1.next[var2] = this.first[var2];
         this.first[var2].prev[var2].next[var2] = var1;
         this.first[var2].prev[var2] = var1;
      }

      var1.head[1 - var2] = this;
   }

   public void removeEdge(BlossomVEdge var1, int var2) {
      if (var1.prev[var2] == var1) {
         this.first[var2] = null;
      } else {
         var1.prev[var2].next[var2] = var1.next[var2];
         var1.next[var2].prev[var2] = var1.prev[var2];
         if (this.first[var2] == var1) {
            this.first[var2] = var1.next[var2];
         }
      }
   }

   public BlossomVNode getTreeGrandparent() {
      BlossomVNode var1 = this.parentEdge.getOpposite(this);
      return var1.parentEdge.getOpposite(var1);
   }

   public BlossomVNode getTreeParent() {
      return this.parentEdge == null ? null : this.parentEdge.getOpposite(this);
   }

   public void addChild(BlossomVNode var1, BlossomVEdge var2, boolean var3) {
      var1.parentEdge = var2;
      var1.tree = this.tree;
      var1.treeSiblingNext = this.firstTreeChild;
      if (var3) {
         var1.firstTreeChild = null;
      }

      if (this.firstTreeChild == null) {
         var1.treeSiblingPrev = var1;
      } else {
         var1.treeSiblingPrev = this.firstTreeChild.treeSiblingPrev;
         this.firstTreeChild.treeSiblingPrev = var1;
      }

      this.firstTreeChild = var1;
   }

   public BlossomVNode getOppositeMatched() {
      return this.matched.getOpposite(this);
   }

   public void removeFromChildList() {
      if (this.isTreeRoot) {
         this.treeSiblingPrev.treeSiblingNext = this.treeSiblingNext;
         if (this.treeSiblingNext != null) {
            this.treeSiblingNext.treeSiblingPrev = this.treeSiblingPrev;
         }
      } else {
         if (this.treeSiblingPrev.treeSiblingNext == null) {
            this.parentEdge.getOpposite(this).firstTreeChild = this.treeSiblingNext;
         } else {
            this.treeSiblingPrev.treeSiblingNext = this.treeSiblingNext;
         }

         if (this.treeSiblingNext == null) {
            if (this.parentEdge.getOpposite(this).firstTreeChild != null) {
               this.parentEdge.getOpposite(this).firstTreeChild.treeSiblingPrev = this.treeSiblingPrev;
            }
         } else {
            this.treeSiblingNext.treeSiblingPrev = this.treeSiblingPrev;
         }
      }
   }

   public void moveChildrenTo(BlossomVNode var1) {
      if (this.firstTreeChild != null) {
         if (var1.firstTreeChild == null) {
            var1.firstTreeChild = this.firstTreeChild;
         } else {
            BlossomVNode var2 = var1.firstTreeChild.treeSiblingPrev;
            this.firstTreeChild.treeSiblingPrev.treeSiblingNext = var1.firstTreeChild;
            var1.firstTreeChild.treeSiblingPrev = this.firstTreeChild.treeSiblingPrev;
            this.firstTreeChild.treeSiblingPrev = var2;
            var1.firstTreeChild = this.firstTreeChild;
         }

         this.firstTreeChild = null;
      }
   }

   public BlossomVNode getPenultimateBlossom() {
      BlossomVNode var1 = this;

      while (true) {
         while (var1.blossomGrandparent.isOuter) {
            if (var1.blossomGrandparent == var1.blossomParent) {
               BlossomVNode var2 = this;

               while (var2 != var1) {
                  BlossomVNode var3 = var2.blossomGrandparent;
                  var2.blossomGrandparent = var1;
                  var2 = var3;
               }

               return var1;
            }

            var1.blossomGrandparent = var1.blossomParent;
         }

         var1 = var1.blossomGrandparent;
      }
   }

   public BlossomVNode getPenultimateBlossomAndFixBlossomGrandparent() {
      BlossomVNode var1 = this;
      BlossomVNode var2 = null;

      while (true) {
         while (var1.blossomGrandparent.isOuter) {
            if (var1.blossomGrandparent == var1.blossomParent) {
               if (var2 != null) {
                  BlossomVNode var3 = this;

                  while (var3 != var2) {
                     BlossomVNode var4 = var3.blossomGrandparent;
                     var3.blossomGrandparent = var2;
                     var3 = var4;
                  }
               }

               return var1;
            }

            var1.blossomGrandparent = var1.blossomParent;
         }

         var2 = var1;
         var1 = var1.blossomGrandparent;
      }
   }

   public boolean isPlusNode() {
      return this.label == BlossomVNode.Label.PLUS;
   }

   public boolean isMinusNode() {
      return this.label == BlossomVNode.Label.MINUS;
   }

   public boolean isInfinityNode() {
      return this.label == BlossomVNode.Label.INFINITY;
   }

   public double getTrueDual() {
      if (!this.isInfinityNode() && this.isOuter) {
         return this.isPlusNode() ? this.dual + this.tree.eps : this.dual - this.tree.eps;
      } else {
         return this.dual;
      }
   }

   public BlossomVNode.IncidentEdgeIterator incidentEdgesIterator() {
      return new BlossomVNode.IncidentEdgeIterator();
   }

   @Override
   public String toString() {
      return "BlossomVNode pos = "
         + this.pos
         + ", dual: "
         + this.dual
         + ", true dual: "
         + this.getTrueDual()
         + ", label: "
         + this.label
         + (this.isMarked ? ", marked" : "")
         + (this.isProcessed ? ", processed" : "")
         + (this.blossomParent != null && !this.isOuter ? ", blossomParent = " + this.blossomParent.pos : "")
         + (this.matched == null ? "" : ", matched = " + this.matched);
   }

   public class IncidentEdgeIterator implements Iterator<BlossomVEdge> {
      private int currentDir;
      private int nextDir = BlossomVNode.this.first[0] == null ? 1 : 0;
      private BlossomVEdge nextEdge = BlossomVNode.this.first[this.nextDir];

      public int getDir() {
         return this.currentDir;
      }

      @Override
      public boolean hasNext() {
         return this.nextEdge != null;
      }

      public BlossomVEdge next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         BlossomVEdge var1 = this.nextEdge;
         this.advance();
         return var1;
      }

      private void advance() {
         this.currentDir = this.nextDir;
         this.nextEdge = this.nextEdge.next[this.nextDir];
         if (this.nextEdge == BlossomVNode.this.first[0]) {
            this.nextEdge = BlossomVNode.this.first[1];
            this.nextDir = 1;
         } else if (this.nextEdge == BlossomVNode.this.first[1]) {
            this.nextEdge = null;
         }
      }
   }

   public enum Label {
      PLUS,
      MINUS,
      INFINITY;
   }
}
