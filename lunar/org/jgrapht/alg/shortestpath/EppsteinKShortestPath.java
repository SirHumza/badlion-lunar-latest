package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.KShortestPathAlgorithm;

public class EppsteinKShortestPath<V, E> implements KShortestPathAlgorithm<V, E> {
   private final Graph<V, E> graph;

   public EppsteinKShortestPath(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null!");
   }

   @Override
   public List<GraphPath<V, E>> getPaths(V var1, V var2, int var3) {
      if (var3 < 0) {
         throw new IllegalArgumentException("k must be non-negative");
      }

      ArrayList var4 = new ArrayList();
      EppsteinShortestPathIterator var5 = new EppsteinShortestPathIterator<>(this.graph, (V)var1, (V)var2);

      for (int var6 = 0; var6 < var3 && var5.hasNext(); var6++) {
         var4.add(var5.next());
      }

      return var4;
   }
}
