package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class DefaultDirectedGraph<V, E> extends AbstractBaseGraph<V, E> {
   private static final long serialVersionUID = -2066644490824847621L;

   public DefaultDirectedGraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1), false);
   }

   public DefaultDirectedGraph(Supplier<V> var1, Supplier<E> var2, boolean var3) {
      super(var1, var2, new DefaultGraphType.Builder().directed().allowMultipleEdges(false).allowSelfLoops(true).weighted(var3).build());
   }

   public static <V, E> GraphBuilder<V, E, ? extends DefaultDirectedGraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new DefaultDirectedGraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends DefaultDirectedGraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new DefaultDirectedGraph<>(null, var0, false));
   }
}
