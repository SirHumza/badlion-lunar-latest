package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class DirectedMultigraph<V, E> extends AbstractBaseGraph<V, E> {
   private static final long serialVersionUID = 2919338637676573948L;

   public DirectedMultigraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1), false);
   }

   public DirectedMultigraph(Supplier<V> var1, Supplier<E> var2, boolean var3) {
      super(var1, var2, new DefaultGraphType.Builder().directed().allowMultipleEdges(true).allowSelfLoops(false).weighted(var3).build());
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedMultigraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new DirectedMultigraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedMultigraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new DirectedMultigraph<>(null, var0, false));
   }
}
