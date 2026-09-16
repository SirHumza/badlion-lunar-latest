package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class DirectedWeightedMultigraph<V, E> extends DirectedMultigraph<V, E> {
   private static final long serialVersionUID = 1984381120642160572L;

   public DirectedWeightedMultigraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1));
   }

   public DirectedWeightedMultigraph(Supplier<V> var1, Supplier<E> var2) {
      super(var1, var2, true);
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedWeightedMultigraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new DirectedWeightedMultigraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedWeightedMultigraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new DirectedWeightedMultigraph<>(null, var0));
   }
}
