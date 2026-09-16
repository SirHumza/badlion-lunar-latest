package org.jgrapht.alg.interfaces;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;

public interface HamiltonianCycleAlgorithm<V, E> {
   GraphPath<V, E> getTour(Graph<V, E> var1);
}
