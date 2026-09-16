package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class SimpleGraph<V, E> extends AbstractBaseGraph<V, E> {
   private static final long serialVersionUID = 4607246833824317836L;

   public SimpleGraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1), false);
   }

   public SimpleGraph(Supplier<V> var1, Supplier<E> var2, boolean var3) {
      super(var1, var2, new DefaultGraphType.Builder().undirected().allowMultipleEdges(false).allowSelfLoops(false).weighted(var3).build());
   }

   public static <V, E> GraphBuilder<V, E, ? extends SimpleGraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new SimpleGraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends SimpleGraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new SimpleGraph<>(null, var0, false));
   }
}
