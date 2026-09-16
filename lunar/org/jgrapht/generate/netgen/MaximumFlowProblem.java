package org.jgrapht.generate.netgen;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import org.jgrapht.Graph;

public interface MaximumFlowProblem<V, E> {
   double CAPACITY_INF = 2.147483647E9;

   Graph<V, E> getGraph();

   Set<V> getSources();

   Set<V> getSinks();

   default V getSource() {
      return this.getSources().iterator().next();
   }

   default V getSink() {
      return this.getSinks().iterator().next();
   }

   Function<E, Double> getCapacities();

   MaximumFlowProblem<V, E> toSingleSourceSingleSinkProblem();

   default boolean isSingleSourceSingleSinkProblem() {
      return this.getSources().size() == 1 && this.getSinks().size() == 1;
   }

   default void dumpCapacities() {
      Graph var1 = this.getGraph();
      Function var2 = this.getCapacities();

      for (Object var4 : var1.edgeSet()) {
         var1.setEdgeWeight(var4, (Double)var2.apply(var4));
      }
   }

   class MaximumFlowProblemImpl<V, E> implements MaximumFlowProblem<V, E> {
      private final Graph<V, E> graph;
      private final Set<V> sources;
      private final Set<V> sinks;
      private final Function<E, Double> capacities;

      public MaximumFlowProblemImpl(Graph<V, E> var1, Set<V> var2, Set<V> var3, Function<E, Double> var4) {
         this.graph = var1;
         this.sources = var2;
         this.sinks = var3;
         this.capacities = var4;
      }

      @Override
      public Graph<V, E> getGraph() {
         return this.graph;
      }

      @Override
      public Set<V> getSources() {
         return this.sources;
      }

      @Override
      public Set<V> getSinks() {
         return this.sinks;
      }

      @Override
      public Function<E, Double> getCapacities() {
         return this.capacities;
      }

      @Override
      public MaximumFlowProblem<V, E> toSingleSourceSingleSinkProblem() {
         HashSet var1 = new HashSet();
         Set var2 = this.convert(this.sources, var1, true);
         Set var3 = this.convert(this.sinks, var1, false);
         Function var4 = var2x -> var1.contains(var2x) ? 2.147483647E9 : this.capacities.apply((E)var2x);
         return new MaximumFlowProblem.MaximumFlowProblemImpl<>(this.graph, var2, var3, var4);
      }

      private Set<V> convert(Set<V> var1, Set<E> var2, boolean var3) {
         if (var1.size() == 1) {
            return var1;
         }

         Object var4 = this.graph.addVertex();
         Set var5 = Collections.singleton(var4);

         for (Object var7 : var1) {
            Object var8;
            if (var3) {
               var8 = this.graph.addEdge((V)var4, (V)var7);
            } else {
               var8 = this.graph.addEdge((V)var7, (V)var4);
            }

            var2.add(var8);
         }

         return var5;
      }
   }
}
