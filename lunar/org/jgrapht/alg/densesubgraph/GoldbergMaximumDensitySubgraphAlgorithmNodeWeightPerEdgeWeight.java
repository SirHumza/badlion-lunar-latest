package org.jgrapht.alg.densesubgraph;

import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.alg.flow.PushRelabelMFImpl;
import org.jgrapht.alg.interfaces.MinimumSTCutAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.DefaultWeightedEdge;

public class GoldbergMaximumDensitySubgraphAlgorithmNodeWeightPerEdgeWeight<V extends Pair<?, Double>, E>
   extends GoldbergMaximumDensitySubgraphAlgorithmBase<V, E> {
   public GoldbergMaximumDensitySubgraphAlgorithmNodeWeightPerEdgeWeight(
      Graph<V, E> var1, V var2, V var3, double var4, Function<Graph<V, DefaultWeightedEdge>, MinimumSTCutAlgorithm<V, DefaultWeightedEdge>> var6
   ) {
      super(var1, (V)var2, (V)var3, true, var4, var6);
   }

   public GoldbergMaximumDensitySubgraphAlgorithmNodeWeightPerEdgeWeight(Graph<V, E> var1, V var2, V var3, double var4) {
      this(var1, (V)var2, (V)var3, var4, PushRelabelMFImpl::new);
   }

   @Override
   protected double computeDensityNumerator(Graph<V, E> var1) {
      return var1.edgeSet().stream().mapToDouble(var1::getEdgeWeight).sum();
   }

   @Override
   protected double computeDensityDenominator(Graph<V, E> var1) {
      return var1.vertexSet().stream().mapToDouble(var0 -> (Double)var0.getSecond()).sum();
   }

   protected double getEdgeWeightFromSourceToVertex(V var1) {
      return 0.0;
   }

   protected double getEdgeWeightFromVertexToSink(V var1) {
      return 2.0 * this.guess * (Double)var1.getSecond() - this.graph.outgoingEdgesOf((V)var1).stream().mapToDouble(this.graph::getEdgeWeight).sum();
   }
}
