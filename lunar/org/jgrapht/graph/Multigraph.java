package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class Multigraph<V, E> extends AbstractBaseGraph<V, E> {
   private static final long serialVersionUID = -8313058939737164595L;

   public Multigraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1), false);
   }

   public Multigraph(Supplier<V> var1, Supplier<E> var2, boolean var3) {
      super(var1, var2, new DefaultGraphType.Builder().undirected().allowMultipleEdges(true).allowSelfLoops(false).weighted(var3).build());
   }

   public static <V, E> GraphBuilder<V, E, ? extends Multigraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new Multigraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends Multigraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new Multigraph<>(null, var0, false));
   }
}
