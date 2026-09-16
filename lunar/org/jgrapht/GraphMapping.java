package org.jgrapht;

public interface GraphMapping<V, E> {
   V getVertexCorrespondence(V var1, boolean var2);

   E getEdgeCorrespondence(E var1, boolean var2);
}
