package org.jgrapht.event;

public interface GraphListener<V, E> extends VertexSetListener<V> {
   void edgeAdded(GraphEdgeChangeEvent<V, E> var1);

   void edgeRemoved(GraphEdgeChangeEvent<V, E> var1);

   default void edgeWeightUpdated(GraphEdgeChangeEvent<V, E> var1) {
   }
}
