package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Set;

public interface IntrusiveEdgesSpecifics<V, E> extends Serializable {
   V getEdgeSource(E var1);

   V getEdgeTarget(E var1);

   boolean add(E var1, V var2, V var3);

   boolean containsEdge(E var1);

   Set<E> getEdgeSet();

   void remove(E var1);

   double getEdgeWeight(E var1);

   void setEdgeWeight(E var1, double var2);
}
