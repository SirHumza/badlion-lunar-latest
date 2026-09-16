package org.jgrapht;

import org.jgrapht.event.GraphListener;
import org.jgrapht.event.VertexSetListener;

public interface ListenableGraph<V, E> extends Graph<V, E> {
   void addGraphListener(GraphListener<V, E> var1);

   void addVertexSetListener(VertexSetListener<V> var1);

   void removeGraphListener(GraphListener<V, E> var1);

   void removeVertexSetListener(VertexSetListener<V> var1);
}
