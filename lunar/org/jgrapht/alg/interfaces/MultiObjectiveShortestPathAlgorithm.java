package org.jgrapht.alg.interfaces;

import java.util.List;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;

public interface MultiObjectiveShortestPathAlgorithm<V, E> {
   List<GraphPath<V, E>> getPaths(V var1, V var2);

   MultiObjectiveShortestPathAlgorithm.MultiObjectiveSingleSourcePaths<V, E> getPaths(V var1);

   interface MultiObjectiveSingleSourcePaths<V, E> {
      Graph<V, E> getGraph();

      V getSourceVertex();

      List<GraphPath<V, E>> getPaths(V var1);
   }
}
