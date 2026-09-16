package org.jgrapht.alg.color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;

public class RandomGreedyColoring<V, E> extends GreedyColoring<V, E> {
   private Random rng;

   public RandomGreedyColoring(Graph<V, E> var1) {
      this(var1, new Random());
   }

   public RandomGreedyColoring(Graph<V, E> var1, Random var2) {
      super(var1);
      this.rng = Objects.requireNonNull(var2, "Random number generator cannot be null");
   }

   @Override
   protected Iterable<V> getVertexOrdering() {
      ArrayList var1 = new ArrayList<>(this.graph.vertexSet());
      Collections.shuffle(var1, this.rng);
      return var1;
   }
}
