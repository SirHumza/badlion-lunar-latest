package org.jgrapht.alg.linkprediction;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.LinkPredictionAlgorithm;
import org.jgrapht.alg.util.Pair;

public class JaccardCoefficientLinkPrediction<V, E> implements LinkPredictionAlgorithm<V, E> {
   private Graph<V, E> graph;

   public JaccardCoefficientLinkPrediction(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
   }

   @Override
   public double predict(V var1, V var2) {
      if (var1.equals(var2)) {
         return 1.0;
      }

      List var3 = Graphs.successorListOf(this.graph, (V)var1);
      List var4 = Graphs.successorListOf(this.graph, (V)var2);
      HashSet var5 = new HashSet<>(var3);
      var5.addAll(var4);
      if (var5.isEmpty()) {
         throw new LinkPredictionIndexNotWellDefinedException("Query nodes have no neighbor in common", Pair.of(var1, var2));
      }

      HashSet var6 = new HashSet<>(var3);
      var6.retainAll(var4);
      return (double)var6.size() / var5.size();
   }
}
