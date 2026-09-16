package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class Pseudograph<V, E> extends AbstractBaseGraph<V, E> {
   private static final long serialVersionUID = -7574564204896552581L;

   public Pseudograph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1), false);
   }

   public Pseudograph(Supplier<V> var1, Supplier<E> var2, boolean var3) {
      super(var1, var2, new DefaultGraphType.Builder().undirected().allowMultipleEdges(true).allowSelfLoops(true).weighted(var3).build());
   }

   public static <V, E> GraphBuilder<V, E, ? extends Pseudograph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new Pseudograph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends Pseudograph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new Pseudograph<>(null, var0, false));
   }
}
