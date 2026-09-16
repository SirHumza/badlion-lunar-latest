package org.jgrapht.alg.linkprediction;

import org.jgrapht.alg.util.Pair;

public class LinkPredictionIndexNotWellDefinedException extends RuntimeException {
   private static final long serialVersionUID = -8832535053621910719L;
   private Pair<?, ?> vertexPair;

   public LinkPredictionIndexNotWellDefinedException() {
   }

   public LinkPredictionIndexNotWellDefinedException(String var1) {
      super(var1);
   }

   public LinkPredictionIndexNotWellDefinedException(String var1, Pair<?, ?> var2) {
      super(var1);
      this.vertexPair = var2;
   }

   public Pair<?, ?> getVertexPair() {
      return this.vertexPair;
   }

   public void setVertexPair(Pair<?, ?> var1) {
      this.vertexPair = var1;
   }
}
