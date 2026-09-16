package org.jgrapht.alg.linkprediction;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.LinkPredictionAlgorithm;

public class CommonNeighborsLinkPrediction<V, E> implements LinkPredictionAlgorithm<V, E> {
   private Graph<V, E> graph;

   public CommonNeighborsLinkPrediction(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
   }

   @Override
   public double predict(V var1, V var2) {
      List var3 = Graphs.successorListOf(this.graph, (V)var1);
      List var4 = Graphs.successorListOf(this.graph, (V)var2);
      HashSet var5 = new HashSet<>(var3);
      var5.retainAll(var4);
      return var5.size();
   }
}
