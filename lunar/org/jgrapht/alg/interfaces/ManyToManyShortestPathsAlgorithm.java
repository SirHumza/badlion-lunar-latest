package org.jgrapht.alg.interfaces;

import java.util.Objects;
import java.util.Set;
import org.jgrapht.GraphPath;

public interface ManyToManyShortestPathsAlgorithm<V, E> extends ShortestPathAlgorithm<V, E> {
   ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> getManyToManyPaths(Set<V> var1, Set<V> var2);

   abstract class BaseManyToManyShortestPathsImpl<V, E> implements ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> {
      private final Set<V> sources;
      private final Set<V> targets;

      @Override
      public Set<V> getSources() {
         return this.sources;
      }

      @Override
      public Set<V> getTargets() {
         return this.targets;
      }

      protected BaseManyToManyShortestPathsImpl(Set<V> var1, Set<V> var2) {
         this.sources = var1;
         this.targets = var2;
      }

      protected void assertCorrectSourceAndTarget(V var1, V var2) {
         Objects.requireNonNull(var1, "source should not be null!");
         Objects.requireNonNull(var2, "target should not be null!");
         if (!this.sources.contains(var1) || !this.targets.contains(var2)) {
            throw new IllegalArgumentException("paths between " + var1 + " and " + var2 + " is not computed");
         }
      }
   }

   interface ManyToManyShortestPaths<V, E> {
      Set<V> getSources();

      Set<V> getTargets();

      GraphPath<V, E> getPath(V var1, V var2);

      double getWeight(V var1, V var2);
   }
}
