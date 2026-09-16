package org.jgrapht.alg.linkprediction;

import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.LinkPredictionAlgorithm;

public class PreferentialAttachmentLinkPrediction<V, E> implements LinkPredictionAlgorithm<V, E> {
   private Graph<V, E> graph;

   public PreferentialAttachmentLinkPrediction(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
   }

   @Override
   public double predict(V var1, V var2) {
      int var3 = this.graph.outDegreeOf((V)var1);
      int var4 = this.graph.outDegreeOf((V)var2);
      return var3 * var4;
   }
}
