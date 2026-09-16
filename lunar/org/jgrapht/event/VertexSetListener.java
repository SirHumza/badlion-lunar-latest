package org.jgrapht.event;

import java.util.EventListener;

public interface VertexSetListener<V> extends EventListener {
   void vertexAdded(GraphVertexChangeEvent<V> var1);

   void vertexRemoved(GraphVertexChangeEvent<V> var1);
}
