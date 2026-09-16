package org.jgrapht.alg.interfaces;

import java.util.Set;
import org.jgrapht.util.WeightedUnmodifiableSet;

public interface IndependentSetAlgorithm<V> {
   IndependentSetAlgorithm.IndependentSet<V> getIndependentSet();

   interface IndependentSet<V> extends Set<V> {
      double getWeight();
   }

   class IndependentSetImpl<V> extends WeightedUnmodifiableSet<V> implements IndependentSetAlgorithm.IndependentSet<V> {
      private static final long serialVersionUID = 4572451196544323306L;

      public IndependentSetImpl(Set<V> var1) {
         super(var1);
      }

      public IndependentSetImpl(Set<V> var1, double var2) {
         super(var1, var2);
      }
   }
}
