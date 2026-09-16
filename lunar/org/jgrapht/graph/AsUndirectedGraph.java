package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.GraphType;
import org.jgrapht.util.ArrayUnenforcedSet;

public class AsUndirectedGraph<V, E> extends GraphDelegator<V, E> implements Serializable, Graph<V, E> {
   private static final long serialVersionUID = 325983813283133557L;
   private static final String NO_EDGE_ADD = "this graph does not support edge addition";

   public AsUndirectedGraph(Graph<V, E> var1) {
      super(var1);
      GraphTests.requireDirected(var1);
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      Set var3 = super.getAllEdges((V)var1, (V)var2);
      if (var1.equals(var2)) {
         return var3;
      }

      Set var4 = super.getAllEdges((V)var2, (V)var1);
      ArrayUnenforcedSet var5 = new ArrayUnenforcedSet(var3.size() + var4.size());
      var5.addAll(var3);
      var5.addAll(var4);
      return var5;
   }

   @Override
   public E getEdge(V var1, V var2) {
      Object var3 = super.getEdge((V)var1, (V)var2);
      return (E)(var3 != null ? var3 : super.getEdge((V)var2, (V)var1));
   }

   @Override
   public E addEdge(V var1, V var2) {
      throw new UnsupportedOperationException("this graph does not support edge addition");
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      throw new UnsupportedOperationException("this graph does not support edge addition");
   }

   @Override
   public int degreeOf(V var1) {
      return super.degreeOf((V)var1);
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      return super.edgesOf((V)var1);
   }

   @Override
   public int inDegreeOf(V var1) {
      return super.degreeOf((V)var1);
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      return super.edgesOf((V)var1);
   }

   @Override
   public int outDegreeOf(V var1) {
      return super.degreeOf((V)var1);
   }

   @Override
   public GraphType getType() {
      return super.getType().asUndirected();
   }

   @Override
   public String toString() {
      return super.toStringFromSets(this.vertexSet(), this.edgeSet(), false);
   }
}
