package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.KShortestPathAlgorithm;

public class YenKShortestPath<V, E> implements KShortestPathAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private PathValidator<V, E> pathValidator;

   public YenKShortestPath(Graph<V, E> var1) {
      this(var1, null);
   }

   public YenKShortestPath(Graph<V, E> var1, PathValidator<V, E> var2) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null!");
      this.pathValidator = var2;
   }

   @Override
   public List<GraphPath<V, E>> getPaths(V var1, V var2, int var3) {
      if (var3 < 0) {
         throw new IllegalArgumentException("k should be positive");
      }

      ArrayList var4 = new ArrayList();
      YenShortestPathIterator var5 = new YenShortestPathIterator<>(this.graph, (V)var1, (V)var2, this.pathValidator);

      for (int var6 = 0; var6 < var3 && var5.hasNext(); var6++) {
         var4.add(var5.next());
      }

      return var4;
   }
}
