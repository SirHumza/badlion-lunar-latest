package org.jgrapht.alg.interfaces;

import java.util.Map;

public interface MaximumFlowAlgorithm<V, E> extends FlowAlgorithm<V, E> {
   MaximumFlowAlgorithm.MaximumFlow<E> getMaximumFlow(V var1, V var2);

   default double getMaximumFlowValue(V var1, V var2) {
      return this.getMaximumFlow((V)var1, (V)var2).getValue();
   }

   interface MaximumFlow<E> extends FlowAlgorithm.Flow<E> {
      Double getValue();
   }

   class MaximumFlowImpl<E> extends FlowAlgorithm.FlowImpl<E> implements MaximumFlowAlgorithm.MaximumFlow<E> {
      private Double value;

      public MaximumFlowImpl(Double var1, Map<E, Double> var2) {
         super(var2);
         this.value = var1;
      }

      @Override
      public Double getValue() {
         return this.value;
      }

      @Override
      public String toString() {
         return "Flow Value: " + this.value + "\nFlow map:\n" + this.getFlowMap();
      }
   }
}
