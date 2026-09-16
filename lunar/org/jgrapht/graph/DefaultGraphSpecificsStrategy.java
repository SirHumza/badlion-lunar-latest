package org.jgrapht.graph;

import java.util.LinkedHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;
import org.jgrapht.graph.specifics.DirectedSpecifics;
import org.jgrapht.graph.specifics.Specifics;
import org.jgrapht.graph.specifics.UndirectedSpecifics;

public class DefaultGraphSpecificsStrategy<V, E> implements GraphSpecificsStrategy<V, E> {
   private static final long serialVersionUID = 7615319421753562075L;

   @Override
   public Function<GraphType, IntrusiveEdgesSpecifics<V, E>> getIntrusiveEdgesSpecificsFactory() {
      return var0x -> var0x.isWeighted()
         ? new WeightedIntrusiveEdgesSpecifics<>(new LinkedHashMap<>())
         : new UniformIntrusiveEdgesSpecifics<>(new LinkedHashMap<>());
   }

   @Override
   public BiFunction<Graph<V, E>, GraphType, Specifics<V, E>> getSpecificsFactory() {
      return (var1, var2) -> var2.isDirected()
         ? new DirectedSpecifics<>(var1, new LinkedHashMap<>(), this.getEdgeSetFactory())
         : new UndirectedSpecifics<>(var1, new LinkedHashMap<>(), this.getEdgeSetFactory());
   }
}
