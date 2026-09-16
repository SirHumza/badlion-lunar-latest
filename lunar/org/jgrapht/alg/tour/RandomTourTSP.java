package org.jgrapht.alg.tour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;

public class RandomTourTSP<V, E> extends HamiltonianCycleAlgorithmBase<V, E> {
   private final Random rng;

   public RandomTourTSP() {
      this(new Random());
   }

   public RandomTourTSP(Random var1) {
      this.rng = Objects.requireNonNull(var1, "Random number generator cannot be null");
   }

   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      this.checkGraph(var1);
      ArrayList var2 = new ArrayList<>(var1.vertexSet());
      if (var2.size() == 1) {
         return this.getSingletonTour(var1);
      }

      Collections.shuffle(var2, this.rng);
      return this.vertexListToTour(var2, var1);
   }
}
