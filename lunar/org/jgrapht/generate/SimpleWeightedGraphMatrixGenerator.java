package org.jgrapht.generate;

import java.util.List;
import java.util.Map;
import org.jgrapht.Graph;

public class SimpleWeightedGraphMatrixGenerator<V, E> implements GraphGenerator<V, E, V> {
   protected List<V> vertices;
   protected double[][] weights;

   public SimpleWeightedGraphMatrixGenerator<V, E> vertices(List<V> var1) {
      this.vertices = var1;
      return this;
   }

   public SimpleWeightedGraphMatrixGenerator<V, E> weights(double[][] var1) {
      this.weights = var1;
      return this;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.weights == null) {
         throw new IllegalArgumentException("Graph may not be constructed without weight-matrix specified");
      }

      if (this.vertices == null) {
         throw new IllegalArgumentException("Graph may not be constructed without vertex-set specified");
      }

      assert this.vertices.size() == this.weights.length;

      for (Object var4 : this.vertices) {
         var1.addVertex(var4);
      }

      for (int var5 = 0; var5 < this.vertices.size(); var5++) {
         assert this.vertices.size() == this.weights[var5].length;

         for (int var6 = 0; var6 < this.vertices.size(); var6++) {
            if (var5 != var6) {
               var1.setEdgeWeight(var1.addEdge(this.vertices.get(var5), this.vertices.get(var6)), this.weights[var5][var6]);
            }
         }
      }
   }
}
