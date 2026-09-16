package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;

public class MaskSubgraph<V, E> extends AbstractGraph<V, E> implements Serializable {
   private static final long serialVersionUID = -7397441126669119179L;
   private static final String UNMODIFIABLE = "this graph is unmodifiable";
   protected final Graph<V, E> base;
   protected final GraphType baseType;
   protected final Set<E> edges;
   protected final Set<V> vertices;
   protected final Predicate<V> vertexMask;
   protected final Predicate<E> edgeMask;

   public MaskSubgraph(Graph<V, E> var1, Predicate<V> var2, Predicate<E> var3) {
      this.base = Objects.requireNonNull(var1, "Invalid graph provided");
      this.baseType = var1.getType();
      this.vertexMask = Objects.requireNonNull(var2, "Invalid vertex mask provided");
      this.edgeMask = Objects.requireNonNull(var3, "Invalid edge mask provided");
      this.vertices = new MaskVertexSet<>(var1.vertexSet(), var2);
      this.edges = new MaskEdgeSet<>(var1, var1.edgeSet(), var2, var3);
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
   public boolean containsEdge(E var1) {
      return this.edgeSet().contains(var1);
   }

   @Override
   public boolean containsVertex(V var1) {
      return this.vertexSet().contains(var1);
   }

   @Override
   public Set<E> edgeSet() {
      return this.edges;
   }

   @Override
   public Set<E> edgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return new MaskEdgeSet<>(this.base, this.base.edgesOf((V)var1), this.vertexMask, this.edgeMask);
   }

   @Override
   public int degreeOf(V var1) {
      if (this.baseType.isDirected()) {
         return this.inDegreeOf((V)var1) + this.outDegreeOf((V)var1);
      }

      int var2 = 0;

      for (Object var4 : this.edgesOf((V)var1)) {
         var2++;
         if (this.getEdgeSource((E)var4).equals(this.getEdgeTarget((E)var4))) {
            var2++;
         }
      }

      return var2;
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return new MaskEdgeSet<>(this.base, this.base.incomingEdgesOf((V)var1), this.vertexMask, this.edgeMask);
   }

   @Override
   public int inDegreeOf(V var1) {
      return this.baseType.isUndirected() ? this.degreeOf((V)var1) : this.incomingEdgesOf((V)var1).size();
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return new MaskEdgeSet<>(this.base, this.base.outgoingEdgesOf((V)var1), this.vertexMask, this.edgeMask);
   }

   @Override
   public int outDegreeOf(V var1) {
      return this.baseType.isUndirected() ? this.degreeOf((V)var1) : this.outgoingEdgesOf((V)var1).size();
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      return this.containsVertex((V)var1) && this.containsVertex((V)var2)
         ? new MaskEdgeSet<>(this.base, this.base.getAllEdges((V)var1, (V)var2), this.vertexMask, this.edgeMask)
         : null;
   }

   @Override
   public E getEdge(V var1, V var2) {
      Set var3 = this.getAllEdges((V)var1, (V)var2);
      return (E)(var3 == null ? null : var3.stream().findAny().orElse(null));
   }

   @Override
   public Supplier<V> getVertexSupplier() {
      return this.base.getVertexSupplier();
   }

   @Override
   public Supplier<E> getEdgeSupplier() {
      return this.base.getEdgeSupplier();
   }

   @Override
   public V getEdgeSource(E var1) {
      assert this.edgeSet().contains(var1);
      return this.base.getEdgeSource((E)var1);
   }

   @Override
   public V getEdgeTarget(E var1) {
      assert this.edgeSet().contains(var1);
      return this.base.getEdgeTarget((E)var1);
   }

   @Override
   public GraphType getType() {
      return this.baseType.asUnmodifiable();
   }

   @Override
   public double getEdgeWeight(E var1) {
      assert this.edgeSet().contains(var1);
      return this.base.getEdgeWeight((E)var1);
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      assert this.edgeSet().contains(var1);
      this.base.setEdgeWeight((E)var1, var2);
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
   public Set<V> vertexSet() {
      return this.vertices;
   }
}
