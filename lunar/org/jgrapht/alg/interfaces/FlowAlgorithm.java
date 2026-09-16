package org.jgrapht.alg.interfaces;

import java.util.Collections;
import java.util.Map;

public interface FlowAlgorithm<V, E> {
   default FlowAlgorithm.Flow<E> getFlow() {
      return new FlowAlgorithm.FlowImpl<>(this.getFlowMap());
   }

   Map<E, Double> getFlowMap();

   V getFlowDirection(E var1);

   interface Flow<E> {
      default double getFlow(E var1) {
         return this.getFlowMap().get(var1);
      }

      Map<E, Double> getFlowMap();
   }

   class FlowImpl<E> implements FlowAlgorithm.Flow<E> {
      private Map<E, Double> flowMap;

      public FlowImpl(Map<E, Double> var1) {
         this.flowMap = Collections.unmodifiableMap(var1);
      }

      @Override
      public Map<E, Double> getFlowMap() {
         return this.flowMap;
      }
   }
}
