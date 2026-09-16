package org.jgrapht.alg.shortestpath;

import java.util.LinkedList;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.graph.GraphWalk;

public abstract class BaseBidirectionalShortestPathAlgorithm<V, E> extends BaseShortestPathAlgorithm<V, E> {
   public BaseBidirectionalShortestPathAlgorithm(Graph<V, E> var1) {
      super(var1);
   }

   protected GraphPath<V, E> createPath(
      BaseBidirectionalShortestPathAlgorithm.BaseSearchFrontier<V, E> var1,
      BaseBidirectionalShortestPathAlgorithm.BaseSearchFrontier<V, E> var2,
      double var3,
      V var5,
      V var6,
      V var7
   ) {
      LinkedList var8 = new LinkedList();
      LinkedList var9 = new LinkedList();
      var9.add(var6);
      Object var10 = var6;

      while (true) {
         Object var11 = var1.getTreeEdge(var10);
         if (var11 == null) {
            var10 = var6;

            while (true) {
               var11 = var2.getTreeEdge(var10);
               if (var11 == null) {
                  return new GraphWalk<>(this.graph, (V)var5, (V)var7, var9, var8, var3);
               }

               var8.addLast(var11);
               var10 = Graphs.getOppositeVertex(var2.graph, (E)var11, (V)var10);
               var9.addLast(var10);
            }
         }

         var8.addFirst(var11);
         var10 = Graphs.getOppositeVertex(var1.graph, (E)var11, (V)var10);
         var9.addFirst(var10);
      }
   }

   abstract static class BaseSearchFrontier<V, E> {
      final Graph<V, E> graph;

      BaseSearchFrontier(Graph<V, E> var1) {
         this.graph = var1;
      }

      abstract double getDistance(V var1);

      abstract E getTreeEdge(V var1);
   }
}
