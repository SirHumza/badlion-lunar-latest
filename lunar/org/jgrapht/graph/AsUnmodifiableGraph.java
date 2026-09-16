package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;

public class AsUnmodifiableGraph<V, E> extends GraphDelegator<V, E> implements Serializable {
   private static final long serialVersionUID = -8186686968362705760L;
   private static final String UNMODIFIABLE = "this graph is unmodifiable";

   public AsUnmodifiableGraph(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   public E addEdge(V var1, V var2) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public V addVertex() {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public boolean addVertex(V var1) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public boolean removeAllEdges(Collection<? extends E> var1) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public Set<E> removeAllEdges(V var1, V var2) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public boolean removeAllVertices(Collection<? extends V> var1) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public boolean removeEdge(E var1) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public E removeEdge(V var1, V var2) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public boolean removeVertex(V var1) {
      throw new UnsupportedOperationException("this graph is unmodifiable");
   }

   @Override
   public GraphType getType() {
      return super.getType().asUnmodifiable();
   }
}
