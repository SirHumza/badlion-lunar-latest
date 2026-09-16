package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.cycle.Cycles;

public interface CycleBasisAlgorithm<V, E> {
   CycleBasisAlgorithm.CycleBasis<V, E> getCycleBasis();

   interface CycleBasis<V, E> {
      Set<List<E>> getCycles();

      int getLength();

      double getWeight();

      Set<GraphPath<V, E>> getCyclesAsGraphPaths();
   }

   class CycleBasisImpl<V, E> implements Serializable, CycleBasisAlgorithm.CycleBasis<V, E> {
      private static final long serialVersionUID = -1420882459022219505L;
      private final Graph<V, E> graph;
      private final Set<List<E>> cycles;
      private Set<GraphPath<V, E>> graphPaths;
      private final int length;
      private final double weight;

      public CycleBasisImpl(Graph<V, E> var1) {
         this(var1, Collections.emptySet(), 0, 0.0);
      }

      public CycleBasisImpl(Graph<V, E> var1, Set<List<E>> var2, int var3, double var4) {
         this.graph = var1;
         this.cycles = Collections.unmodifiableSet(var2);
         this.length = var3;
         this.weight = var4;
      }

      @Override
      public Set<List<E>> getCycles() {
         return this.cycles;
      }

      @Override
      public int getLength() {
         return this.length;
      }

      @Override
      public double getWeight() {
         return this.weight;
      }

      @Override
      public Set<GraphPath<V, E>> getCyclesAsGraphPaths() {
         if (this.graphPaths == null) {
            this.graphPaths = new LinkedHashSet<>();

            for (List var2 : this.cycles) {
               this.graphPaths.add(Cycles.simpleCycleToGraphPath(this.graph, var2));
            }
         }

         return Collections.unmodifiableSet(this.graphPaths);
      }
   }
}
