package org.jgrapht.alg.interfaces;

import java.util.Map;

public interface VertexScoringAlgorithm<V, D> {
   Map<V, D> getScores();

   D getVertexScore(V var1);
}
