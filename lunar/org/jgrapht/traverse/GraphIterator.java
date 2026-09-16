package org.jgrapht.traverse;

import java.util.Iterator;
import org.jgrapht.event.TraversalListener;

public interface GraphIterator<V, E> extends Iterator<V> {
   boolean isCrossComponentTraversal();

   boolean isReuseEvents();

   void setReuseEvents(boolean var1);

   void addTraversalListener(TraversalListener<V, E> var1);

   void removeTraversalListener(TraversalListener<V, E> var1);

   @Override
   void remove();
}
