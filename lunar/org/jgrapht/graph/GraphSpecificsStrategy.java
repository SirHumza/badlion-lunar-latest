package org.jgrapht.graph;

import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;
import org.jgrapht.graph.specifics.ArrayUnenforcedSetEdgeSetFactory;
import org.jgrapht.graph.specifics.Specifics;

public interface GraphSpecificsStrategy<V, E> extends Serializable {
   Function<GraphType, IntrusiveEdgesSpecifics<V, E>> getIntrusiveEdgesSpecificsFactory();

   BiFunction<Graph<V, E>, GraphType, Specifics<V, E>> getSpecificsFactory();

   default EdgeSetFactory<V, E> getEdgeSetFactory() {
      return new ArrayUnenforcedSetEdgeSetFactory<>();
   }
}
