package org.jgrapht.alg.flow.mincost;

import java.util.Objects;
import java.util.function.Function;
import org.jgrapht.Graph;

public interface MinimumCostFlowProblem<V, E> {
   Graph<V, E> getGraph();

   Function<V, Integer> getNodeSupply();

   Function<E, Integer> getArcCapacityLowerBounds();

   Function<E, Integer> getArcCapacityUpperBounds();

   Function<E, Double> getArcCosts();

   class MinimumCostFlowProblemImpl<V, E> implements MinimumCostFlowProblem<V, E> {
      private final Graph<V, E> graph;
      private final Function<V, Integer> nodeSupplies;
      private final Function<E, Integer> arcCapacityLowerBounds;
      private final Function<E, Integer> arcCapacityUpperBounds;
      private final Function<E, Double> arcCosts;

      public MinimumCostFlowProblemImpl(Graph<V, E> var1, Function<V, Integer> var2, Function<E, Integer> var3) {
         this(var1, var2, var3, var0 -> 0);
      }

      public MinimumCostFlowProblemImpl(Graph<V, E> var1, Function<V, Integer> var2, Function<E, Integer> var3, Function<E, Integer> var4) {
         this(var1, var2, var3, var4, var1::getEdgeWeight);
      }

      public MinimumCostFlowProblemImpl(
         Graph<V, E> var1, Function<V, Integer> var2, Function<E, Integer> var3, Function<E, Integer> var4, Function<E, Double> var5
      ) {
         this.graph = Objects.requireNonNull(var1);
         this.nodeSupplies = Objects.requireNonNull(var2);
         this.arcCapacityUpperBounds = Objects.requireNonNull(var3);
         this.arcCapacityLowerBounds = Objects.requireNonNull(var4);
         this.arcCosts = Objects.requireNonNull(var5);
      }

      @Override
      public Graph<V, E> getGraph() {
         return this.graph;
      }

      @Override
      public Function<V, Integer> getNodeSupply() {
         return this.nodeSupplies;
      }

      @Override
      public Function<E, Integer> getArcCapacityLowerBounds() {
         return this.arcCapacityLowerBounds;
      }

      @Override
      public Function<E, Integer> getArcCapacityUpperBounds() {
         return this.arcCapacityUpperBounds;
      }

      @Override
      public Function<E, Double> getArcCosts() {
         return this.arcCosts;
      }
   }
}
