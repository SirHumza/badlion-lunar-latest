package org.jgrapht.alg.interfaces;

import java.util.Set;
import org.jgrapht.util.WeightedUnmodifiableSet;

public interface CliqueAlgorithm<V> {
   CliqueAlgorithm.Clique<V> getClique();

   interface Clique<V> extends Set<V> {
      double getWeight();
   }

   class CliqueImpl<V> extends WeightedUnmodifiableSet<V> implements CliqueAlgorithm.Clique<V> {
      private static final long serialVersionUID = -4336873008459736342L;

      public CliqueImpl(Set<V> var1) {
         super(var1);
      }

      public CliqueImpl(Set<V> var1, double var2) {
         super(var1, var2);
      }
   }
}
