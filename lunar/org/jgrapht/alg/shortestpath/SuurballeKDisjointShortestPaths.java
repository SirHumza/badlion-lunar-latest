package org.jgrapht.alg.shortestpath;

import java.util.List;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;

public class SuurballeKDisjointShortestPaths<V, E> extends BaseKDisjointShortestPathsAlgorithm<V, E> {
   private ShortestPathAlgorithm.SingleSourcePaths<V, E> singleSourcePaths;

   public SuurballeKDisjointShortestPaths(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   protected void transformGraph(List<E> var1) {
      for (Object var3 : this.workingGraph.edgeSet()) {
         Object var4 = this.workingGraph.getEdgeSource((E)var3);
         Object var5 = this.workingGraph.getEdgeTarget((E)var3);
         double var6 = this.workingGraph.getEdgeWeight((E)var3) - this.singleSourcePaths.getWeight((V)var5) + this.singleSourcePaths.getWeight((V)var4);
         this.workingGraph.setEdgeWeight((E)var3, var6);
      }

      for (Object var11 : var1) {
         double var12 = this.workingGraph.getEdgeWeight((E)var11);
         if (var12 != 0.0) {
            throw new IllegalStateException("Expected zero weight edge along the path");
         }

         Object var7 = this.workingGraph.getEdgeSource((E)var11);
         Object var8 = this.workingGraph.getEdgeTarget((E)var11);
         this.workingGraph.removeEdge((E)var11);
         this.workingGraph.addEdge((V)var8, (V)var7);
         Object var9 = this.workingGraph.getEdge((V)var8, (V)var7);
         this.workingGraph.setEdgeWeight((E)var9, var12);
      }
   }

   @Override
   protected GraphPath<V, E> calculateShortestPath(V var1, V var2) {
      this.singleSourcePaths = new DijkstraShortestPath<>(this.workingGraph).getPaths((V)var1);
      return this.singleSourcePaths.getPath((V)var2);
   }
}
