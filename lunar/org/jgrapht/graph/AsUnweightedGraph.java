package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;

public class AsUnweightedGraph<V, E> extends GraphDelegator<V, E> implements Serializable, Graph<V, E> {
   private static final long serialVersionUID = -5186421272597767751L;
   private static final String EDGE_WEIGHT_IS_NOT_SUPPORTED = "Edge weight is not supported";

   public AsUnweightedGraph(Graph<V, E> var1) {
      super(Objects.requireNonNull(var1));
   }

   @Override
   public double getEdgeWeight(E var1) {
      return 1.0;
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      throw new UnsupportedOperationException("Edge weight is not supported");
   }

   @Override
   public GraphType getType() {
      return super.getType().asUnweighted();
   }
}
