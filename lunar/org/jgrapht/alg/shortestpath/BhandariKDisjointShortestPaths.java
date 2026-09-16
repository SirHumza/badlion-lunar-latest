package org.jgrapht.alg.shortestpath;

import java.util.List;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;

public class BhandariKDisjointShortestPaths<V, E> extends BaseKDisjointShortestPathsAlgorithm<V, E> {
   public BhandariKDisjointShortestPaths(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   protected void transformGraph(List<E> var1) {
      for (Object var6 : var1) {
         Object var2 = this.workingGraph.getEdgeSource((E)var6);
         Object var3 = this.workingGraph.getEdgeTarget((E)var6);
         double var7 = this.workingGraph.getEdgeWeight((E)var6);
         this.workingGraph.removeEdge((E)var6);
         this.workingGraph.addEdge((V)var3, (V)var2);
         Object var4 = this.workingGraph.getEdge((V)var3, (V)var2);
         this.workingGraph.setEdgeWeight((E)var4, -var7);
      }
   }

   @Override
   protected GraphPath<V, E> calculateShortestPath(V var1, V var2) {
      return new BellmanFordShortestPath<>(this.workingGraph).getPath((V)var1, (V)var2);
   }
}
