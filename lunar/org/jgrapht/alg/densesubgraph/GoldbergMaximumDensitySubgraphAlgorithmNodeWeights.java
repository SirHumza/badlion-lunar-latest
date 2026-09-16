package org.jgrapht.alg.densesubgraph;

import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.alg.flow.PushRelabelMFImpl;
import org.jgrapht.alg.interfaces.MinimumSTCutAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.DefaultWeightedEdge;

public class GoldbergMaximumDensitySubgraphAlgorithmNodeWeights<V extends Pair<?, Double>, E> extends GoldbergMaximumDensitySubgraphAlgorithmBase<V, E> {
   public GoldbergMaximumDensitySubgraphAlgorithmNodeWeights(
      Graph<V, E> var1, V var2, V var3, double var4, Function<Graph<V, DefaultWeightedEdge>, MinimumSTCutAlgorithm<V, DefaultWeightedEdge>> var6
   ) {
      super(var1, (V)var2, (V)var3, true, var4, var6);
   }

   public GoldbergMaximumDensitySubgraphAlgorithmNodeWeights(Graph<V, E> var1, V var2, V var3, double var4) {
      this(var1, (V)var2, (V)var3, var4, PushRelabelMFImpl::new);
   }

   @Override
   protected double computeDensityNumerator(Graph<V, E> var1) {
      double var2 = var1.edgeSet().stream().mapToDouble(var1::getEdgeWeight).sum();

      for (Pair var5 : var1.vertexSet()) {
         var2 += var5.getSecond();
      }

      return var2;
   }

   @Override
   protected double computeDensityDenominator(Graph<V, E> var1) {
      return var1.vertexSet().size();
   }

   protected double getEdgeWeightFromSourceToVertex(V var1) {
      return 0.0;
   }

   protected double getEdgeWeightFromVertexToSink(V var1) {
      return 2.0 * this.guess - this.graph.outgoingEdgesOf((V)var1).stream().mapToDouble(this.graph::getEdgeWeight).sum() - 2.0 * (Double)var1.getSecond();
   }
}
