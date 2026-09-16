package org.jgrapht.alg.interfaces;

import org.jgrapht.Graph;

public interface MaximumDensitySubgraphAlgorithm<V, E> {
   Graph<V, E> calculateDensest();

   double getDensity();
}
