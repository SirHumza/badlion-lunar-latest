package org.jgrapht.graph;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;
import org.jgrapht.graph.specifics.FastLookupDirectedSpecifics;
import org.jgrapht.graph.specifics.FastLookupUndirectedSpecifics;
import org.jgrapht.graph.specifics.Specifics;

public class FastLookupGraphSpecificsStrategy<V, E> implements GraphSpecificsStrategy<V, E> {
   private static final long serialVersionUID = -5490869870275054280L;

   @Override
   public Function<GraphType, IntrusiveEdgesSpecifics<V, E>> getIntrusiveEdgesSpecificsFactory() {
      return var0x -> var0x.isWeighted()
         ? new WeightedIntrusiveEdgesSpecifics<>(new LinkedHashMap<>())
         : new UniformIntrusiveEdgesSpecifics<>(new LinkedHashMap<>());
   }

   @Override
   public BiFunction<Graph<V, E>, GraphType, Specifics<V, E>> getSpecificsFactory() {
      return (var1, var2) -> var2.isDirected()
         ? new FastLookupDirectedSpecifics<>(var1, new LinkedHashMap<>(), new HashMap<>(), this.getEdgeSetFactory())
         : new FastLookupUndirectedSpecifics<>(var1, new LinkedHashMap<>(), new HashMap<>(), this.getEdgeSetFactory());
   }
}
