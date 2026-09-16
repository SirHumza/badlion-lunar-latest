package org.jgrapht.alg.linkprediction;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.LinkPredictionAlgorithm;
import org.jgrapht.alg.util.Pair;

public class HubDepressedIndexLinkPrediction<V, E> implements LinkPredictionAlgorithm<V, E> {
   private Graph<V, E> graph;

   public HubDepressedIndexLinkPrediction(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
   }

   @Override
   public double predict(V var1, V var2) {
      int var3 = this.graph.outDegreeOf((V)var1);
      int var4 = this.graph.outDegreeOf((V)var2);
      if (var3 == 0 && var4 == 0) {
         throw new LinkPredictionIndexNotWellDefinedException("Both vertices have zero neighbors", Pair.of(var1, var2));
      }

      List var5 = Graphs.successorListOf(this.graph, (V)var1);
      List var6 = Graphs.successorListOf(this.graph, (V)var2);
      HashSet var7 = new HashSet<>(var5);
      var7.retainAll(var6);
      return (double)var7.size() / Math.max(var3, var4);
   }
}
