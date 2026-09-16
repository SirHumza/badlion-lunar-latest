package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class DirectedPseudograph<V, E> extends AbstractBaseGraph<V, E> {
   private static final long serialVersionUID = -7461248851245878913L;

   public DirectedPseudograph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1), false);
   }

   public DirectedPseudograph(Supplier<V> var1, Supplier<E> var2, boolean var3) {
      super(var1, var2, new DefaultGraphType.Builder().directed().allowMultipleEdges(true).allowSelfLoops(true).weighted(var3).build());
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedPseudograph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new DirectedPseudograph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedPseudograph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new DirectedPseudograph<>(null, var0, false));
   }
}
