package org.jgrapht.alg.shortestpath;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.graph.GraphWalk;

public class ListSingleSourcePathsImpl<V, E> implements Serializable, ShortestPathAlgorithm.SingleSourcePaths<V, E> {
   private static final long serialVersionUID = -60070018446561686L;
   protected Graph<V, E> graph;
   protected V source;
   protected Map<V, GraphPath<V, E>> paths;

   public ListSingleSourcePathsImpl(Graph<V, E> var1, V var2, Map<V, GraphPath<V, E>> var3) {
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
   public double getWeight(V var1) {
      GraphPath var2 = this.paths.get(var1);
      if (var2 == null) {
         return this.source.equals(var1) ? 0.0 : Double.POSITIVE_INFINITY;
      } else {
         return var2.getWeight();
      }
   }

   @Override
   public GraphPath<V, E> getPath(V var1) {
      GraphPath var2 = this.paths.get(var1);
      if (var2 == null) {
         return this.source.equals(var1) ? GraphWalk.singletonWalk(this.graph, this.source, 0.0) : null;
      } else {
         return var2;
      }
   }
}
