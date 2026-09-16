package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;

public class GraphDelegator<V, E> extends AbstractGraph<V, E> implements Serializable, Graph<V, E> {
   private static final long serialVersionUID = -215068279981825448L;
   private final Graph<V, E> delegate;
   private final Supplier<V> vertexSupplier;
   private final Supplier<E> edgeSupplier;

   public GraphDelegator(Graph<V, E> var1) {
      this(var1, null, null);
   }

   public GraphDelegator(Graph<V, E> var1, Supplier<V> var2, Supplier<E> var3) {
      this.delegate = Objects.requireNonNull(var1, "graph must not be null");
      this.vertexSupplier = var2;
      this.edgeSupplier = var3;
   }

   @Override
   public Supplier<V> getVertexSupplier() {
      return this.vertexSupplier != null ? this.vertexSupplier : this.delegate.getVertexSupplier();
   }

   @Override
   public Supplier<E> getEdgeSupplier() {
      return this.edgeSupplier != null ? this.edgeSupplier : this.delegate.getEdgeSupplier();
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      return this.delegate.getAllEdges((V)var1, (V)var2);
   }

   @Override
   public E getEdge(V var1, V var2) {
      return this.delegate.getEdge((V)var1, (V)var2);
   }

   @Override
   public E addEdge(V var1, V var2) {
      if (this.edgeSupplier != null) {
         Object var3 = this.edgeSupplier.get();
         return (E)(this.addEdge((V)var1, (V)var2, (E)var3) ? var3 : null);
      } else {
         return this.delegate.addEdge((V)var1, (V)var2);
      }
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      return this.delegate.addEdge((V)var1, (V)var2, (E)var3);
   }

   @Override
   public V addVertex() {
      if (this.vertexSupplier != null) {
         Object var1 = this.vertexSupplier.get();
         return (V)(this.addVertex((V)var1) ? var1 : null);
      } else {
         return this.delegate.addVertex();
      }
   }

   @Override
   public boolean addVertex(V var1) {
      return this.delegate.addVertex((V)var1);
   }

   @Override
   public boolean containsEdge(E var1) {
      return this.delegate.containsEdge((E)var1);
   }

   @Override
   public boolean containsVertex(V var1) {
      return this.delegate.containsVertex((V)var1);
   }

   @Override
   public int degreeOf(V var1) {
      return this.delegate.degreeOf((V)var1);
   }

   @Override
   public Set<E> edgeSet() {
      return this.delegate.edgeSet();
   }

   @Override
   public Set<E> edgesOf(V var1) {
      return this.delegate.edgesOf((V)var1);
   }

   @Override
   public int inDegreeOf(V var1) {
      return this.delegate.inDegreeOf((V)var1);
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      return this.delegate.incomingEdgesOf((V)var1);
   }

   @Override
   public int outDegreeOf(V var1) {
      return this.delegate.outDegreeOf((V)var1);
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      return this.delegate.outgoingEdgesOf((V)var1);
   }

   @Override
   public boolean removeEdge(E var1) {
      return this.delegate.removeEdge((E)var1);
   }

   @Override
   public E removeEdge(V var1, V var2) {
      return this.delegate.removeEdge((V)var1, (V)var2);
   }

   @Override
   public boolean removeVertex(V var1) {
      return this.delegate.removeVertex((V)var1);
   }

   @Override
   public String toString() {
      return this.delegate.toString();
   }

   @Override
   public Set<V> vertexSet() {
      return this.delegate.vertexSet();
   }

   @Override
   public V getEdgeSource(E var1) {
      return this.delegate.getEdgeSource((E)var1);
   }

   @Override
   public V getEdgeTarget(E var1) {
      return this.delegate.getEdgeTarget((E)var1);
   }

   @Override
   public double getEdgeWeight(E var1) {
      return this.delegate.getEdgeWeight((E)var1);
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      this.delegate.setEdgeWeight((E)var1, var2);
   }

   @Override
   public GraphType getType() {
      return this.delegate.getType();
   }

   protected Graph<V, E> getDelegate() {
      return this.delegate;
   }
}
