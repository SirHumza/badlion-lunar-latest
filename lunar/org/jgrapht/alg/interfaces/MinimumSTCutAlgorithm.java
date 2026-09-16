package org.jgrapht.alg.interfaces;

import java.util.Set;

public interface MinimumSTCutAlgorithm<V, E> {
   double calculateMinCut(V var1, V var2);

   double getCutCapacity();

   Set<V> getSourcePartition();

   Set<V> getSinkPartition();

   Set<E> getCutEdges();
}
