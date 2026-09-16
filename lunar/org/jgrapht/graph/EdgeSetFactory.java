package org.jgrapht.graph;

import java.util.Set;

public interface EdgeSetFactory<V, E> {
   Set<E> createEdgeSet(V var1);
}
