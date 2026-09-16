package org.jgrapht.graph;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.GraphType;

public class AsWeightedGraph<V, E> extends GraphDelegator<V, E> implements Serializable, Graph<V, E> {
   private static final long serialVersionUID = -6838132233557L;
   private final Function<E, Double> weightFunction;
   private final Map<E, Double> weights;
   private final boolean writeWeightsThrough;
   private final boolean cacheWeights;

   public AsWeightedGraph(Graph<V, E> var1, Map<E, Double> var2) {
      this(var1, var2, var1.getType().isWeighted());
   }

   public AsWeightedGraph(Graph<V, E> var1, Map<E, Double> var2, boolean var3) {
      super(var1);
      this.weights = Objects.requireNonNull(var2);
      this.weightFunction = null;
      this.cacheWeights = false;
      this.writeWeightsThrough = var3;
      if (this.writeWeightsThrough) {
         GraphTests.requireWeighted(var1);
      }
   }

   public AsWeightedGraph(Graph<V, E> var1, Function<E, Double> var2, boolean var3, boolean var4) {
      super(var1);
      this.weightFunction = Objects.requireNonNull(var2);
      this.cacheWeights = var3;
      this.writeWeightsThrough = var4;
      this.weights = new HashMap<>();
      if (this.writeWeightsThrough) {
         GraphTests.requireWeighted(var1);
      }
   }

   @Override
   public double getEdgeWeight(E var1) {
      Double var2;
      if (this.weightFunction != null) {
         if (this.cacheWeights) {
            var2 = this.weights.computeIfAbsent((E)var1, this.weightFunction);
         } else {
            var2 = this.weightFunction.apply((E)var1);
         }
      } else {
         var2 = this.weights.get(var1);
      }

      if (Objects.isNull(var2)) {
         var2 = super.getEdgeWeight((E)var1);
      }

      return var2;
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      assert var1 != null;
      if (this.weightFunction != null && !this.cacheWeights) {
         throw new UnsupportedOperationException("Cannot set an edge weight when a weight function is used and caching is disabled");
      }

      this.weights.put((E)var1, var2);
      if (this.writeWeightsThrough) {
         this.getDelegate().setEdgeWeight((E)var1, var2);
      }
   }

   @Override
   public GraphType getType() {
      return super.getType().asWeighted();
   }
}
