package org.jgrapht.alg.interfaces;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;

public interface ShortestPathAlgorithm<V, E> {
   GraphPath<V, E> getPath(V var1, V var2);

   double getPathWeight(V var1, V var2);

   ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths(V var1);

   interface SingleSourcePaths<V, E> {
      Graph<V, E> getGraph();

      V getSourceVertex();

      double getWeight(V var1);

      GraphPath<V, E> getPath(V var1);
   }
}
