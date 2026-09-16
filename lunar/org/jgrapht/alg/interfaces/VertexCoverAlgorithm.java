package org.jgrapht.alg.interfaces;

import java.util.Set;
import org.jgrapht.util.WeightedUnmodifiableSet;

public interface VertexCoverAlgorithm<V> {
   VertexCoverAlgorithm.VertexCover<V> getVertexCover();

   interface VertexCover<V> extends Set<V> {
      double getWeight();
   }

   class VertexCoverImpl<V> extends WeightedUnmodifiableSet<V> implements VertexCoverAlgorithm.VertexCover<V> {
      private static final long serialVersionUID = 3922451519162460179L;

      public VertexCoverImpl(Set<V> var1) {
         super(var1);
      }

      public VertexCoverImpl(Set<V> var1, double var2) {
         super(var1, var2);
      }
   }
}
