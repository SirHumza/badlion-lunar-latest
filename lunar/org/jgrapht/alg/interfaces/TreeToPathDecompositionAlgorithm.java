package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.util.ArrayUnenforcedSet;

public interface TreeToPathDecompositionAlgorithm<V, E> {
   TreeToPathDecompositionAlgorithm.PathDecomposition<V, E> getPathDecomposition();

   interface PathDecomposition<V, E> {
      Set<E> getEdges();

      Set<GraphPath<V, E>> getPaths();

      default int numberOfPaths() {
         return this.getPaths().size();
      }
   }

   class PathDecompositionImpl<V, E> implements Serializable, TreeToPathDecompositionAlgorithm.PathDecomposition<V, E> {
      private static final long serialVersionUID = 8468626434814461297L;
      private final Set<E> edges;
      private final Set<GraphPath<V, E>> paths;

      public PathDecompositionImpl(Graph<V, E> var1, Set<E> var2, List<List<V>> var3) {
         this.edges = var2;
         Set var4 = var3.stream().map(var1x -> new GraphWalk(var1, (List<V>)var1x, var1x.size())).collect(Collectors.toCollection(ArrayUnenforcedSet::new));
         this.paths = Collections.unmodifiableSet(var4);
      }

      @Override
      public Set<E> getEdges() {
         return this.edges;
      }

      @Override
      public Set<GraphPath<V, E>> getPaths() {
         return this.paths;
      }

      @Override
      public String toString() {
         return "Path-Decomposition [edges=" + this.edges + ",paths=" + this.getPaths() + "]";
      }
   }
}
