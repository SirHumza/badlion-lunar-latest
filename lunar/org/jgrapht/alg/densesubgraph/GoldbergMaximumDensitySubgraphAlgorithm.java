package org.jgrapht.alg.densesubgraph;

import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.alg.flow.PushRelabelMFImpl;
import org.jgrapht.alg.interfaces.MinimumSTCutAlgorithm;
import org.jgrapht.graph.DefaultWeightedEdge;

public class GoldbergMaximumDensitySubgraphAlgorithm<V, E> extends GoldbergMaximumDensitySubgraphAlgorithmBase<V, E> {
   public GoldbergMaximumDensitySubgraphAlgorithm(
      Graph<V, E> var1, V var2, V var3, double var4, Function<Graph<V, DefaultWeightedEdge>, MinimumSTCutAlgorithm<V, DefaultWeightedEdge>> var6
   ) {
      super(var1, (V)var2, (V)var3, false, var4, var6);
   }

   public GoldbergMaximumDensitySubgraphAlgorithm(Graph<V, E> var1, V var2, V var3, double var4) {
      this(var1, (V)var2, (V)var3, var4, PushRelabelMFImpl::new);
   }

   @Override
   protected double getEdgeWeightFromSourceToVertex(V var1) {
      return this.graph.edgeSet().size();
   }

   @Override
   protected double getEdgeWeightFromVertexToSink(V var1) {
      return this.graph.edgeSet().size() + 2.0 * this.guess - this.graph.outgoingEdgesOf((V)var1).stream().mapToDouble(this.graph::getEdgeWeight).sum();
   }

   @Override
   protected double computeDensityNumerator(Graph<V, E> var1) {
      return var1.edgeSet().stream().mapToDouble(var1::getEdgeWeight).sum();
   }

   @Override
   protected double computeDensityDenominator(Graph<V, E> var1) {
      return var1.vertexSet().size();
   }
}
