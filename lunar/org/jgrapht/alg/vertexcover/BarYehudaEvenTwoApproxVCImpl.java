package org.jgrapht.alg.vertexcover;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.VertexCoverAlgorithm;
import org.jgrapht.graph.AsSubgraph;

public class BarYehudaEvenTwoApproxVCImpl<V, E> implements VertexCoverAlgorithm<V> {
   private final Graph<V, E> graph;
   private final Map<V, Double> vertexWeightMap;

   public BarYehudaEvenTwoApproxVCImpl(Graph<V, E> var1) {
      this.graph = GraphTests.requireUndirected(var1);
      this.vertexWeightMap = var1.vertexSet().stream().collect(Collectors.toMap(Function.identity(), var0 -> 1.0));
   }

   public BarYehudaEvenTwoApproxVCImpl(Graph<V, E> var1, Map<V, Double> var2) {
      this.graph = GraphTests.requireUndirected(var1);
      this.vertexWeightMap = Objects.requireNonNull(var2);
   }

   @Override
   public VertexCoverAlgorithm.VertexCover<V> getVertexCover() {
      LinkedHashSet var1 = new LinkedHashSet();
      double var2 = 0.0;
      AsSubgraph var4 = new AsSubgraph<>(this.graph, null, null);
      HashMap var5 = new HashMap();

      for (Object var7 : this.graph.vertexSet()) {
         var5.put(var7, this.vertexWeightMap.get(var7));
      }

      Set var10 = var4.edgeSet();

      while (!var10.isEmpty()) {
         Object var11 = var10.iterator().next();
         Object var8 = var4.getEdgeSource(var11);
         Object var9 = var4.getEdgeTarget(var11);
         if ((Double)var5.get(var8) <= (Double)var5.get(var9)) {
            var5.put(var9, (Double)var5.get(var9) - (Double)var5.get(var8));
            var1.add(var8);
            var2 += this.vertexWeightMap.get(var8);
            var4.removeVertex(var8);
         } else {
            var5.put(var8, (Double)var5.get(var8) - (Double)var5.get(var9));
            var1.add(var9);
            var2 += this.vertexWeightMap.get(var9);
            var4.removeVertex(var9);
         }
      }

      return new VertexCoverAlgorithm.VertexCoverImpl<>(var1, var2);
   }
}
