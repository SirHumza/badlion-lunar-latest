package org.jgrapht.graph.specifics;

import java.util.Set;
import java.util.function.Supplier;

public interface Specifics<V, E> {
   boolean addVertex(V var1);

   Set<V> getVertexSet();

   Set<E> getAllEdges(V var1, V var2);

   E getEdge(V var1, V var2);

   boolean addEdgeToTouchingVertices(V var1, V var2, E var3);

   boolean addEdgeToTouchingVerticesIfAbsent(V var1, V var2, E var3);

   E createEdgeToTouchingVerticesIfAbsent(V var1, V var2, Supplier<E> var3);

   int degreeOf(V var1);

   Set<E> edgesOf(V var1);

   int inDegreeOf(V var1);

   Set<E> incomingEdgesOf(V var1);

   int outDegreeOf(V var1);

   Set<E> outgoingEdgesOf(V var1);

   void removeEdgeFromTouchingVertices(V var1, V var2, E var3);
}
