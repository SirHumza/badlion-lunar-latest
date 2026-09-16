package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class WeightedMultigraph<V, E> extends Multigraph<V, E> {
   private static final long serialVersionUID = -6009321659287373874L;

   public WeightedMultigraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1));
   }

   public WeightedMultigraph(Supplier<V> var1, Supplier<E> var2) {
      super(var1, var2, true);
   }

   public static <V, E> GraphBuilder<V, E, ? extends WeightedMultigraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new WeightedMultigraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends WeightedMultigraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new WeightedMultigraph<>(null, var0));
   }
}
