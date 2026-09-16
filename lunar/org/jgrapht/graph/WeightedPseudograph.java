package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class WeightedPseudograph<V, E> extends Pseudograph<V, E> {
   private static final long serialVersionUID = 3037964528481084240L;

   public WeightedPseudograph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1));
   }

   public WeightedPseudograph(Supplier<V> var1, Supplier<E> var2) {
      super(var1, var2, true);
   }

   public static <V, E> GraphBuilder<V, E, ? extends WeightedPseudograph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new WeightedPseudograph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends WeightedPseudograph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new WeightedPseudograph<>(null, var0));
   }
}
