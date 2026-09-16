package org.jgrapht.event;

public interface TraversalListener<V, E> {
   void connectedComponentFinished(ConnectedComponentTraversalEvent var1);

   void connectedComponentStarted(ConnectedComponentTraversalEvent var1);

   void edgeTraversed(EdgeTraversalEvent<E> var1);

   void vertexTraversed(VertexTraversalEvent<V> var1);

   void vertexFinished(VertexTraversalEvent<V> var1);
}
