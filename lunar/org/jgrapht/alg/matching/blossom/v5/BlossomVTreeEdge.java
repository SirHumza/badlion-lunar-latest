package org.jgrapht.alg.matching.blossom.v5;

import org.jheaps.MergeableAddressableHeap;
import org.jheaps.tree.PairingHeap;

class BlossomVTreeEdge {
   BlossomVTree[] head = new BlossomVTree[2];
   BlossomVTreeEdge[] prev = new BlossomVTreeEdge[2];
   BlossomVTreeEdge[] next = new BlossomVTreeEdge[2];
   MergeableAddressableHeap<Double, BlossomVEdge> plusPlusEdges = new PairingHeap<>();
   MergeableAddressableHeap<Double, BlossomVEdge> plusMinusEdges0 = new PairingHeap<>();
   MergeableAddressableHeap<Double, BlossomVEdge> plusMinusEdges1 = new PairingHeap<>();

   public BlossomVTreeEdge() {
   }

   public void removeFromTreeEdgeList() {
      for (int var1 = 0; var1 < 2; var1++) {
         if (this.prev[var1] != null) {
            this.prev[var1].next[var1] = this.next[var1];
         } else {
            this.head[1 - var1].first[var1] = this.next[var1];
         }

         if (this.next[var1] != null) {
            this.next[var1].prev[var1] = this.prev[var1];
         }
      }

      this.head[0] = this.head[1] = null;
   }

   @Override
   public String toString() {
      return "BlossomVTreeEdge (" + this.head[0].id + ":" + this.head[1].id + ")";
   }

   public void addToCurrentMinusPlusHeap(BlossomVEdge var1, int var2) {
      var1.handle = this.getCurrentMinusPlusHeap(var2).insert(var1.slack, var1);
   }

   public void addToCurrentPlusMinusHeap(BlossomVEdge var1, int var2) {
      var1.handle = this.getCurrentPlusMinusHeap(var2).insert(var1.slack, var1);
   }

   public void addPlusPlusEdge(BlossomVEdge var1) {
      var1.handle = this.plusPlusEdges.insert(var1.slack, var1);
   }

   public void removeFromCurrentMinusPlusHeap(BlossomVEdge var1) {
      var1.handle.delete();
      var1.handle = null;
   }

   public void removeFromCurrentPlusMinusHeap(BlossomVEdge var1) {
      var1.handle.delete();
      var1.handle = null;
   }

   public void removeFromPlusPlusHeap(BlossomVEdge var1) {
      var1.handle.delete();
      var1.handle = null;
   }

   public MergeableAddressableHeap<Double, BlossomVEdge> getCurrentMinusPlusHeap(int var1) {
      return var1 == 0 ? this.plusMinusEdges0 : this.plusMinusEdges1;
   }

   public MergeableAddressableHeap<Double, BlossomVEdge> getCurrentPlusMinusHeap(int var1) {
      return var1 == 0 ? this.plusMinusEdges1 : this.plusMinusEdges0;
   }
}
