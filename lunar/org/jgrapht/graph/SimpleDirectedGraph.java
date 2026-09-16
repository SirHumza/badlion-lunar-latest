package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class SimpleDirectedGraph<V, E> extends AbstractBaseGraph<V, E> {
   private static final long serialVersionUID = 1665314455034181409L;

   public SimpleDirectedGraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1), false);
   }

   public SimpleDirectedGraph(Supplier<V> var1, Supplier<E> var2, boolean var3) {
      super(var1, var2, new DefaultGraphType.Builder().directed().allowMultipleEdges(false).allowSelfLoops(false).weighted(var3).build());
   }

   public static <V, E> GraphBuilder<V, E, ? extends SimpleDirectedGraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new SimpleDirectedGraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends SimpleDirectedGraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new SimpleDirectedGraph<>(null, var0, false));
   }
}
