package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class SimpleWeightedGraph<V, E> extends SimpleGraph<V, E> {
   private static final long serialVersionUID = -1568410577378365671L;

   public SimpleWeightedGraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1));
   }

   public SimpleWeightedGraph(Supplier<V> var1, Supplier<E> var2) {
      super(var1, var2, true);
   }

   public static <V, E> GraphBuilder<V, E, ? extends SimpleWeightedGraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new SimpleWeightedGraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends SimpleWeightedGraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new SimpleWeightedGraph<>(null, var0));
   }
}
