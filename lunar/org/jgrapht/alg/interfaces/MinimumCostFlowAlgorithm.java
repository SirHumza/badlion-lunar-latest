package org.jgrapht.alg.interfaces;

import java.util.Map;
import org.jgrapht.alg.flow.mincost.MinimumCostFlowProblem;

public interface MinimumCostFlowAlgorithm<V, E> extends FlowAlgorithm<V, E> {
   MinimumCostFlowAlgorithm.MinimumCostFlow<E> getMinimumCostFlow(MinimumCostFlowProblem<V, E> var1);

   default double getFlowCost(MinimumCostFlowProblem<V, E> var1) {
      return this.getMinimumCostFlow(var1).getCost();
   }

   interface MinimumCostFlow<E> extends FlowAlgorithm.Flow<E> {
      double getCost();
   }

   class MinimumCostFlowImpl<E> extends FlowAlgorithm.FlowImpl<E> implements MinimumCostFlowAlgorithm.MinimumCostFlow<E> {
      double cost;

      public MinimumCostFlowImpl(double var1, Map<E, Double> var3) {
         super(var3);
         this.cost = var1;
      }

      @Override
      public double getCost() {
         return this.cost;
      }
   }
}
