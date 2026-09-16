package org.jgrapht.alg.interfaces;

import org.jgrapht.GraphPath;

public interface HamiltonianCycleImprovementAlgorithm<V, E> {
   GraphPath<V, E> improveTour(GraphPath<V, E> var1);
}
