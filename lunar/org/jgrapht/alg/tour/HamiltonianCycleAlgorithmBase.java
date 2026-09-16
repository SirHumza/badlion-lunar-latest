package org.jgrapht.alg.tour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.HamiltonianCycleAlgorithm;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.graph.MaskSubgraph;
import org.jgrapht.traverse.DepthFirstIterator;

public abstract class HamiltonianCycleAlgorithmBase<V, E> implements HamiltonianCycleAlgorithm<V, E> {
   protected GraphPath<V, E> vertexListToTour(List<V> var1, Graph<V, E> var2) {
      var1.add(var1.get(0));
      return this.closedVertexListToTour(var1, var2);
   }

   protected GraphPath<V, E> closedVertexListToTour(List<V> var1, Graph<V, E> var2) {
      assert var1.get(0) == var1.get(var1.size() - 1);
      ArrayList var3 = new ArrayList(var1.size() - 1);
      double var4 = 0.0;
      Object var6 = var1.get(0);

      for (Object var8 : var1.subList(1, var1.size())) {
         Object var9 = var2.getEdge(var6, var8);
         var3.add(var9);
         var4 += var2.getEdgeWeight(var9);
         var6 = var8;
      }

      return new GraphWalk<>(var2, (V)var1.get(0), (V)var1.get(0), var1, var3, var4);
   }

   protected GraphPath<V, E> edgeSetToTour(Set<E> var1, Graph<V, E> var2) {
      ArrayList var3 = new ArrayList(var1.size() + 1);
      MaskSubgraph var4 = new MaskSubgraph<>(var2, var0 -> false, var1x -> !var1.contains(var1x));
      new DepthFirstIterator<>(var4).forEachRemaining(var3::add);
      return this.vertexListToTour(var3, var2);
   }

   protected GraphPath<V, E> getSingletonTour(Graph<V, E> var1) {
      assert var1.vertexSet().size() == 1;
      Object var2 = var1.vertexSet().iterator().next();
      return new GraphWalk<>(var1, (V)var2, (V)var2, Collections.singletonList((V)var2), Collections.emptyList(), 0.0);
   }

   protected void checkGraph(Graph<V, E> var1) {
      GraphTests.requireUndirected(var1);
      this.requireNotEmpty(var1);
      if (!GraphTests.isComplete(var1)) {
         throw new IllegalArgumentException("Graph is not complete");
      }
   }

   protected void requireNotEmpty(Graph<V, E> var1) {
      if (var1.vertexSet().isEmpty()) {
         throw new IllegalArgumentException("Graph contains no vertices");
      }
   }
}
