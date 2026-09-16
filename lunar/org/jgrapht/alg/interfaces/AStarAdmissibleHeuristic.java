package org.jgrapht.alg.interfaces;

import org.jgrapht.Graph;

public interface AStarAdmissibleHeuristic<V> {
   double getCostEstimate(V var1, V var2);

   default <E> boolean isConsistent(Graph<V, E> var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Graph cannot be null!");
      }

      for (Object var3 : var1.vertexSet()) {
         for (Object var5 : var1.edgeSet()) {
            double var6 = var1.getEdgeWeight(var5);
            Object var8 = var1.getEdgeSource(var5);
            Object var9 = var1.getEdgeTarget(var5);
            double var10 = this.getCostEstimate((V)var8, (V)var3);
            double var12 = this.getCostEstimate((V)var9, (V)var3);
            if (var10 > var6 + var12) {
               return false;
            }
         }
      }

      return true;
   }
}
