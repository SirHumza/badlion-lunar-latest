package org.jgrapht.alg.shortestpath;

import java.util.HashMap;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.graph.GraphWalk;

abstract class BaseShortestPathAlgorithm<V, E> implements ShortestPathAlgorithm<V, E> {
   protected static final String GRAPH_CONTAINS_A_NEGATIVE_WEIGHT_CYCLE = "Graph contains a negative-weight cycle";
   protected static final String GRAPH_MUST_CONTAIN_THE_SOURCE_VERTEX = "Graph must contain the source vertex!";
   protected static final String GRAPH_MUST_CONTAIN_THE_SINK_VERTEX = "Graph must contain the sink vertex!";
   protected final Graph<V, E> graph;

   public BaseShortestPathAlgorithm(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph is null");
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

   @Override
   public double getPathWeight(V var1, V var2) {
      GraphPath var3 = this.getPath((V)var1, (V)var2);
      return var3 == null ? Double.POSITIVE_INFINITY : var3.getWeight();
   }

   protected final GraphPath<V, E> createEmptyPath(V var1, V var2) {
      return var1.equals(var2) ? GraphWalk.singletonWalk(this.graph, (V)var1, 0.0) : null;
   }
}
