package org.jgrapht.graph.builder;

import org.jgrapht.Graph;

public class GraphBuilder<V, E, G extends Graph<V, E>> extends AbstractGraphBuilder<V, E, G, GraphBuilder<V, E, G>> {
   public GraphBuilder(G var1) {
      super((G)var1);
   }

   protected GraphBuilder<V, E, G> self() {
      return this;
   }
}
