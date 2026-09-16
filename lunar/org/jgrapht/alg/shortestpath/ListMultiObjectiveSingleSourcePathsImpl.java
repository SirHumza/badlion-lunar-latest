package org.jgrapht.alg.shortestpath;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.MultiObjectiveShortestPathAlgorithm;
import org.jgrapht.graph.GraphWalk;

public class ListMultiObjectiveSingleSourcePathsImpl<V, E> implements Serializable, MultiObjectiveShortestPathAlgorithm.MultiObjectiveSingleSourcePaths<V, E> {
   private static final long serialVersionUID = -6213225353391554721L;
   protected Graph<V, E> graph;
   protected V source;
   protected Map<V, List<GraphPath<V, E>>> paths;

   public ListMultiObjectiveSingleSourcePathsImpl(Graph<V, E> var1, V var2, Map<V, List<GraphPath<V, E>>> var3) {
      this.graph = Objects.requireNonNull(var1, "Graph is null");
      this.source = Objects.requireNonNull((V)var2, "Source vertex is null");
      this.paths = Objects.requireNonNull(var3, "Paths are null");
   }

   @Override
   public Graph<V, E> getGraph() {
      return this.graph;
   }

   @Override
   public V getSourceVertex() {
      return this.source;
   }

   @Override
   public List<GraphPath<V, E>> getPaths(V var1) {
      List var2 = this.paths.get(var1);
      if (var2 == null) {
         return this.source.equals(var1) ? Collections.singletonList(GraphWalk.singletonWalk(this.graph, this.source, 0.0)) : Collections.emptyList();
      } else {
         return var2;
      }
   }
}
