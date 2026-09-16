package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.Set;
import org.jgrapht.util.WeightedUnmodifiableSet;

public interface SpannerAlgorithm<E> {
   SpannerAlgorithm.Spanner<E> getSpanner();

   interface Spanner<E> extends Set<E> {
      double getWeight();
   }

   class SpannerImpl<E> extends WeightedUnmodifiableSet<E> implements Serializable, SpannerAlgorithm.Spanner<E> {
      private static final long serialVersionUID = 5951646499902668516L;

      public SpannerImpl(Set<E> var1) {
         super(var1);
      }

      public SpannerImpl(Set<E> var1, double var2) {
         super(var1, var2);
      }

      @Override
      public String toString() {
         return "Spanner [weight=" + this.weight + ", edges=" + this + "]";
      }
   }
}
