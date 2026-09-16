package org.jgrapht.alg.vertexcover;

import java.util.LinkedHashSet;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.VertexCoverAlgorithm;
import org.jgrapht.graph.AsSubgraph;

public class EdgeBasedTwoApproxVCImpl<V, E> implements VertexCoverAlgorithm<V> {
   private final Graph<V, E> graph;

   public EdgeBasedTwoApproxVCImpl(Graph<V, E> var1) {
      this.graph = GraphTests.requireUndirected(var1);
   }

   @Override
   public VertexCoverAlgorithm.VertexCover<V> getVertexCover() {
      LinkedHashSet var1 = new LinkedHashSet();
      AsSubgraph var2 = new AsSubgraph<>(this.graph, null, null);

      while (var2.edgeSet().size() != 0) {
         Object var3 = var2.edgeSet().iterator().next();
         Object var4 = this.graph.getEdgeSource((E)var3);
         Object var5 = this.graph.getEdgeTarget((E)var3);
         var1.add(var4);
         var1.add(var5);
         var2.removeVertex(var4);
         var2.removeVertex(var5);
      }

      return new VertexCoverAlgorithm.VertexCoverImpl<>(var1);
   }
}
