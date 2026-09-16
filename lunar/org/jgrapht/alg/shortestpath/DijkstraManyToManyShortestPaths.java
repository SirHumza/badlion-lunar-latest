package org.jgrapht.alg.shortestpath;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ManyToManyShortestPathsAlgorithm;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.graph.GraphWalk;

public class DijkstraManyToManyShortestPaths<V, E> extends BaseManyToManyShortestPaths<V, E> {
   public DijkstraManyToManyShortestPaths(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   public ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> getManyToManyPaths(Set<V> var1, Set<V> var2) {
      Objects.requireNonNull(var1, "sources cannot be null!");
      Objects.requireNonNull(var2, "targets cannot be null!");
      HashMap var3 = new HashMap();
      if (var1.size() >= var2.size()) {
         for (Object var8 : var1) {
            var3.put(var8, getShortestPathsTree(this.graph, (V)var8, var2));
         }

         return new DijkstraManyToManyShortestPaths.DijkstraManyToManyShortestPathsImpl(var1, var2, false, var3);
      } else {
         EdgeReversedGraph var4 = new EdgeReversedGraph<>(this.graph);

         for (Object var6 : var2) {
            var3.put(var6, getShortestPathsTree(var4, (V)var6, var1));
         }

         return new DijkstraManyToManyShortestPaths.DijkstraManyToManyShortestPathsImpl(var1, var2, true, var3);
      }
   }

   private class DijkstraManyToManyShortestPathsImpl extends ManyToManyShortestPathsAlgorithm.BaseManyToManyShortestPathsImpl<V, E> {
      private boolean reversed;
      private final Map<V, ShortestPathAlgorithm.SingleSourcePaths<V, E>> searchSpaces;

      DijkstraManyToManyShortestPathsImpl(Set<V> var2, Set<V> var3, boolean var4, Map<V, ShortestPathAlgorithm.SingleSourcePaths<V, E>> var5) {
         super(var2, var3);
         this.reversed = var4;
         this.searchSpaces = var5;
      }

      @Override
      public GraphPath<V, E> getPath(V var1, V var2) {
         this.assertCorrectSourceAndTarget(var1, var2);
         if (this.reversed) {
            GraphPath var3 = this.searchSpaces.get(var2).getPath((V)var1);
            List var4 = var3.getVertexList();
            List var5 = var3.getEdgeList();
            Collections.reverse(var4);
            Collections.reverse(var5);
            return new GraphWalk<>(DijkstraManyToManyShortestPaths.this.graph, (V)var1, (V)var2, var4, var5, var3.getWeight());
         } else {
            return this.searchSpaces.get(var1).getPath((V)var2);
         }
      }

      @Override
      public double getWeight(V var1, V var2) {
         this.assertCorrectSourceAndTarget(var1, var2);
         return this.reversed ? this.searchSpaces.get(var2).getWeight((V)var1) : this.searchSpaces.get(var1).getWeight((V)var2);
      }
   }
}
