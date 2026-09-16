package org.jgrapht.alg.shortestpath;

import java.util.HashMap;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.MultiObjectiveShortestPathAlgorithm;
import org.jgrapht.graph.GraphWalk;

abstract class BaseMultiObjectiveShortestPathAlgorithm<V, E> implements MultiObjectiveShortestPathAlgorithm<V, E> {
   static final String GRAPH_MUST_CONTAIN_THE_SOURCE_VERTEX = "Graph must contain the source vertex!";
   static final String GRAPH_MUST_CONTAIN_THE_SINK_VERTEX = "Graph must contain the sink vertex!";
   protected final Graph<V, E> graph;

   public BaseMultiObjectiveShortestPathAlgorithm(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph is null");
   }

   @Override
   public MultiObjectiveShortestPathAlgorithm.MultiObjectiveSingleSourcePaths<V, E> getPaths(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      HashMap var2 = new HashMap();

      for (Object var4 : this.graph.vertexSet()) {
         var2.put(var4, this.getPaths((V)var1, (V)var4));
      }

      return new ListMultiObjectiveSingleSourcePathsImpl<>(this.graph, (V)var1, var2);
   }

   protected final GraphPath<V, E> createEmptyPath(V var1, V var2) {
      return var1.equals(var2) ? GraphWalk.singletonWalk(this.graph, (V)var1, 0.0) : null;
   }
}
