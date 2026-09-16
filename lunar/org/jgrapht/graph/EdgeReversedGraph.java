package org.jgrapht.graph;

import java.util.Set;
import org.jgrapht.Graph;

public class EdgeReversedGraph<V, E> extends GraphDelegator<V, E> implements Graph<V, E> {
   private static final long serialVersionUID = -3806030402468293063L;

   public EdgeReversedGraph(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   public E getEdge(V var1, V var2) {
      return super.getEdge((V)var2, (V)var1);
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      return super.getAllEdges((V)var2, (V)var1);
   }

   @Override
   public E addEdge(V var1, V var2) {
      return super.addEdge((V)var2, (V)var1);
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      return super.addEdge((V)var2, (V)var1, (E)var3);
   }

   @Override
   public int inDegreeOf(V var1) {
      return super.outDegreeOf((V)var1);
   }

   @Override
   public int outDegreeOf(V var1) {
      return super.inDegreeOf((V)var1);
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      return super.outgoingEdgesOf((V)var1);
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      return super.incomingEdgesOf((V)var1);
   }

   @Override
   public E removeEdge(V var1, V var2) {
      return super.removeEdge((V)var2, (V)var1);
   }

   @Override
   public V getEdgeSource(E var1) {
      return super.getEdgeTarget((E)var1);
   }

   @Override
   public V getEdgeTarget(E var1) {
      return super.getEdgeSource((E)var1);
   }

   @Override
   public String toString() {
      return this.toStringFromSets(this.vertexSet(), this.edgeSet(), this.getType().isDirected());
   }
}
