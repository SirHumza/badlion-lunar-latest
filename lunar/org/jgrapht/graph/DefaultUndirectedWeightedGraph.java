package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class DefaultUndirectedWeightedGraph<V, E> extends DefaultUndirectedGraph<V, E> {
   private static final long serialVersionUID = -1008165881690129042L;

   public DefaultUndirectedWeightedGraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1));
   }

   public DefaultUndirectedWeightedGraph(Supplier<V> var1, Supplier<E> var2) {
      super(var1, var2, true);
   }

   public static <V, E> GraphBuilder<V, E, ? extends DefaultUndirectedWeightedGraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new DefaultUndirectedWeightedGraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends DefaultUndirectedWeightedGraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new DefaultUndirectedWeightedGraph<>(null, var0));
   }
}
