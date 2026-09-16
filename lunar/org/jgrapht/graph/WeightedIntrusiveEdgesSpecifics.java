package org.jgrapht.graph;

import java.util.Map;

public class WeightedIntrusiveEdgesSpecifics<V, E> extends BaseIntrusiveEdgesSpecifics<V, E, IntrusiveWeightedEdge> implements IntrusiveEdgesSpecifics<V, E> {
   private static final long serialVersionUID = 5327226615635500554L;

   public WeightedIntrusiveEdgesSpecifics(Map<E, IntrusiveWeightedEdge> var1) {
      super(var1);
   }

   @Override
   public boolean add(E var1, V var2, V var3) {
      if (var1 instanceof IntrusiveWeightedEdge) {
         return this.addIntrusiveEdge((E)var1, (V)var2, (V)var3, (IntrusiveWeightedEdge)var1);
      } else {
         int var4 = this.edgeMap.size();
         IntrusiveWeightedEdge var5 = this.edgeMap.computeIfAbsent((E)var1, var0 -> new IntrusiveWeightedEdge());
         if (var4 < this.edgeMap.size()) {
            var5.source = var2;
            var5.target = var3;
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public double getEdgeWeight(E var1) {
      IntrusiveWeightedEdge var2 = this.getIntrusiveEdge((E)var1);
      if (var2 == null) {
         throw new IllegalArgumentException("no such edge in graph: " + var1.toString());
      } else {
         return var2.weight;
      }
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      IntrusiveWeightedEdge var4 = this.getIntrusiveEdge((E)var1);
      if (var4 == null) {
         throw new IllegalArgumentException("no such edge in graph: " + var1.toString());
      }

      var4.weight = var2;
   }

   protected IntrusiveWeightedEdge getIntrusiveEdge(E var1) {
      return var1 instanceof IntrusiveWeightedEdge ? (IntrusiveWeightedEdge)var1 : this.edgeMap.get(var1);
   }
}
