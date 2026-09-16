package org.jgrapht;

import org.jgrapht.util.LiveIterableWrapper;

public interface GraphIterables<V, E> {
   Graph<V, E> getGraph();

   default Iterable<E> edges() {
      return new LiveIterableWrapper<>(() -> this.getGraph().edgeSet());
   }

   default long edgeCount() {
      return this.getGraph().edgeSet().size();
   }

   default Iterable<V> vertices() {
      return new LiveIterableWrapper<>(() -> this.getGraph().vertexSet());
   }

   default long vertexCount() {
      return this.getGraph().vertexSet().size();
   }

   default Iterable<E> edgesOf(V var1) {
      return new LiveIterableWrapper<>(() -> this.getGraph().edgesOf((V)var1));
   }

   default long degreeOf(V var1) {
      return this.getGraph().degreeOf((V)var1);
   }

   default Iterable<E> incomingEdgesOf(V var1) {
      return new LiveIterableWrapper<>(() -> this.getGraph().incomingEdgesOf((V)var1));
   }

   default long inDegreeOf(V var1) {
      return this.getGraph().inDegreeOf((V)var1);
   }

   default Iterable<E> outgoingEdgesOf(V var1) {
      return new LiveIterableWrapper<>(() -> this.getGraph().outgoingEdgesOf((V)var1));
   }

   default long outDegreeOf(V var1) {
      return this.getGraph().outDegreeOf((V)var1);
   }

   default Iterable<E> allEdges(V var1, V var2) {
      return new LiveIterableWrapper<>(() -> this.getGraph().getAllEdges((V)var1, (V)var2));
   }
}
