package org.jgrapht.alg.interfaces;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;

public interface EulerianCycleAlgorithm<V, E> {
   GraphPath<V, E> getEulerianCycle(Graph<V, E> var1);
}
