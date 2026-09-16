package org.jgrapht.generate.netgen;

import java.util.Set;
import java.util.function.Function;
import org.jgrapht.Graph;

public interface BipartiteMatchingProblem<V, E> {
   Graph<V, E> getGraph();

   Set<V> getPartition1();

   Set<V> getPartition2();

   Function<E, Double> getCosts();

   boolean isWeighted();

   default void dumpCosts() {
      Graph var1 = this.getGraph();
      Function var2 = this.getCosts();

      for (Object var4 : var1.edgeSet()) {
         var1.setEdgeWeight(var4, (Double)var2.apply(var4));
      }
   }

   class BipartiteMatchingProblemImpl<V, E> implements BipartiteMatchingProblem<V, E> {
      private final Graph<V, E> graph;
      private final Set<V> partition1;
      private final Set<V> partition2;
      private final Function<E, Double> costs;
      private final boolean weighted;

      public BipartiteMatchingProblemImpl(Graph<V, E> var1, Set<V> var2, Set<V> var3, Function<E, Double> var4, boolean var5) {
         this.graph = var1;
         this.partition1 = var2;
         this.partition2 = var3;
         this.costs = var4;
         this.weighted = var5;
      }

      @Override
      public Graph<V, E> getGraph() {
         return this.graph;
      }

      @Override
      public Function<E, Double> getCosts() {
         return this.costs;
      }

      @Override
      public Set<V> getPartition1() {
         return this.partition1;
      }

      @Override
      public Set<V> getPartition2() {
         return this.partition2;
      }

      @Override
      public boolean isWeighted() {
         return this.weighted;
      }
   }
}
