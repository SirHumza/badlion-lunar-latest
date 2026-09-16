package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class DirectedWeightedPseudograph<V, E> extends DirectedPseudograph<V, E> {
   private static final long serialVersionUID = -4775269773843490859L;

   public DirectedWeightedPseudograph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1));
   }

   public DirectedWeightedPseudograph(Supplier<V> var1, Supplier<E> var2) {
      super(var1, var2, true);
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedWeightedPseudograph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new DirectedWeightedPseudograph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedWeightedPseudograph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new DirectedWeightedPseudograph<>(null, var0));
   }
}
