package org.jgrapht.alg.spanning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.util.UnionFind;

public class KruskalMinimumSpanningTree<V, E> implements SpanningTreeAlgorithm<E> {
   private final Graph<V, E> graph;

   public KruskalMinimumSpanningTree(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
   }

   @Override
   public SpanningTreeAlgorithm.SpanningTree<E> getSpanningTree() {
      UnionFind var1 = new UnionFind<>(this.graph.vertexSet());
      ArrayList var2 = new ArrayList<>(this.graph.edgeSet());
      var2.sort(Comparator.comparingDouble(this.graph::getEdgeWeight));
      double var3 = 0.0;
      HashSet var5 = new HashSet();

      for (Object var7 : var2) {
         Object var8 = this.graph.getEdgeSource((E)var7);
         Object var9 = this.graph.getEdgeTarget((E)var7);
         if (!var1.find(var8).equals(var1.find(var9))) {
            var1.union(var8, var9);
            var5.add(var7);
            var3 += this.graph.getEdgeWeight((E)var7);
         }
      }

      return new SpanningTreeAlgorithm.SpanningTreeImpl<>(var5, var3);
   }
}
