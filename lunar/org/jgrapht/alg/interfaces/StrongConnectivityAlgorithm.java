package org.jgrapht.alg.interfaces;

import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

public interface StrongConnectivityAlgorithm<V, E> {
   Graph<V, E> getGraph();

   boolean isStronglyConnected();

   List<Set<V>> stronglyConnectedSets();

   List<Graph<V, E>> getStronglyConnectedComponents();

   Graph<Graph<V, E>, DefaultEdge> getCondensation();
}
