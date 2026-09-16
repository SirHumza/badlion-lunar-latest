package org.jgrapht.alg.linkprediction;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.LinkPredictionAlgorithm;
import org.jgrapht.alg.util.Pair;

public class ResourceAllocationIndexLinkPrediction<V, E> implements LinkPredictionAlgorithm<V, E> {
   private Graph<V, E> graph;

   public ResourceAllocationIndexLinkPrediction(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
   }

   @Override
   public double predict(V var1, V var2) {
      List var3 = Graphs.successorListOf(this.graph, (V)var1);
      List var4 = Graphs.successorListOf(this.graph, (V)var2);
      HashSet var5 = new HashSet<>(var3);
      var5.retainAll(var4);
      double var6 = 0.0;

      for (Object var9 : var5) {
         int var10 = this.graph.outDegreeOf((V)var9);
         if (var10 == 0) {
            throw new LinkPredictionIndexNotWellDefinedException("Index not well defined", Pair.of(var1, var2));
         }

         var6 += 1.0 / var10;
      }

      return var6;
   }
}
