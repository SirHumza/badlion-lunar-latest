package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class SimpleDirectedWeightedGraph<V, E> extends SimpleDirectedGraph<V, E> {
   private static final long serialVersionUID = -3301373580757772501L;

   public SimpleDirectedWeightedGraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1));
   }

   public SimpleDirectedWeightedGraph(Supplier<V> var1, Supplier<E> var2) {
      super(var1, var2, true);
   }

   public static <V, E> GraphBuilder<V, E, ? extends SimpleDirectedWeightedGraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new SimpleDirectedWeightedGraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends SimpleDirectedWeightedGraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new SimpleDirectedWeightedGraph<>(null, var0));
   }
}
