package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jgrapht.Graph;

public class SimpleWeightedBipartiteGraphMatrixGenerator<V, E> implements GraphGenerator<V, E, V> {
   protected List<V> first;
   protected List<V> second;
   protected double[][] weights;

   public SimpleWeightedBipartiteGraphMatrixGenerator<V, E> first(List<? extends V> var1) {
      this.first = (List<V>)(new ArrayList<>(var1));
      return this;
   }

   public SimpleWeightedBipartiteGraphMatrixGenerator<V, E> second(List<? extends V> var1) {
      this.second = (List<V>)(new ArrayList<>(var1));
      return this;
   }

   public SimpleWeightedBipartiteGraphMatrixGenerator<V, E> weights(double[][] var1) {
      this.weights = var1;
      return this;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.weights == null) {
         throw new IllegalArgumentException("Graph may not be constructed without weight-matrix specified");
      }

      if (this.first != null && this.second != null) {
         assert this.second.size() == this.weights.length;

         for (Object var4 : this.first) {
            var1.addVertex(var4);
         }

         for (Object var7 : this.second) {
            var1.addVertex(var7);
         }

         for (int var6 = 0; var6 < this.first.size(); var6++) {
            assert this.first.size() == this.weights[var6].length;

            for (int var8 = 0; var8 < this.second.size(); var8++) {
               var1.setEdgeWeight(var1.addEdge(this.first.get(var6), this.second.get(var8)), this.weights[var6][var8]);
            }
         }
      } else {
         throw new IllegalArgumentException("Graph may not be constructed without either of vertex-set partitions specified");
      }
   }
}
