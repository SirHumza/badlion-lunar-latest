package org.jgrapht.alg.shortestpath;

import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ManyToManyShortestPathsAlgorithm;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;

abstract class BaseManyToManyShortestPaths<V, E> implements ManyToManyShortestPathsAlgorithm<V, E> {
   protected final Graph<V, E> graph;

   public BaseManyToManyShortestPaths(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph is null");
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      return this.getManyToManyPaths(Collections.singleton((V)var1), Collections.singleton((V)var2)).getPath((V)var1, (V)var2);
   }

   @Override
   public double getPathWeight(V var1, V var2) {
      GraphPath var3 = this.getPath((V)var1, (V)var2);
      return var3 == null ? Double.POSITIVE_INFINITY : var3.getWeight();
   }

   @Override
   public ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("graph must contain the source vertex");
      }

      HashMap var2 = new HashMap();

      for (Object var4 : this.graph.vertexSet()) {
         var2.put(var4, this.getPath((V)var1, (V)var4));
      }

      return new ListSingleSourcePathsImpl<>(this.graph, (V)var1, var2);
   }

   protected static <V, E> ShortestPathAlgorithm.SingleSourcePaths<V, E> getShortestPathsTree(Graph<V, E> var0, V var1, Set<V> var2) {
      DijkstraClosestFirstIterator var3 = new DijkstraClosestFirstIterator<>(var0, var1);
      int var4 = 0;

      while (var3.hasNext() && var4 < var2.size()) {
         if (var2.contains(var3.next())) {
            var4++;
         }
      }

      return var3.getPaths();
   }
}
