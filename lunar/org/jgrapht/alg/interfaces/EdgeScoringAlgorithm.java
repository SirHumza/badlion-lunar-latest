package org.jgrapht.alg.interfaces;

import java.util.Map;

public interface EdgeScoringAlgorithm<E, D> {
   Map<E, D> getScores();

   D getEdgeScore(E var1);
}
