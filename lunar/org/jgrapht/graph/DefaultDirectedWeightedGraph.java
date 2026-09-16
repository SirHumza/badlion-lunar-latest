package org.jgrapht.graph;

import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.util.SupplierUtil;

public class DefaultDirectedWeightedGraph<V, E> extends DefaultDirectedGraph<V, E> {
   private static final long serialVersionUID = -4867672646995721544L;

   public DefaultDirectedWeightedGraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1));
   }

   public DefaultDirectedWeightedGraph(Supplier<V> var1, Supplier<E> var2) {
      super(var1, var2, true);
   }

   public static <V, E> GraphBuilder<V, E, ? extends DefaultDirectedWeightedGraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new DefaultDirectedWeightedGraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends DefaultDirectedWeightedGraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new DefaultDirectedWeightedGraph<>(null, var0));
   }
}
