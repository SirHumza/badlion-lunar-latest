package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.GraphType;
import org.jgrapht.ListenableGraph;
import org.jgrapht.event.GraphEdgeChangeEvent;
import org.jgrapht.event.GraphListener;
import org.jgrapht.event.GraphVertexChangeEvent;

public class AsSubgraph<V, E> extends AbstractGraph<V, E> implements Serializable {
   private static final long serialVersionUID = -1471811754881775298L;
   private static final String NO_SUCH_EDGE_IN_BASE = "no such edge in base graph";
   private static final String NO_SUCH_VERTEX_IN_BASE = "no such vertex in base graph";
   private static final String CANNOT_CREATE_NEW_VERTICES_FROM_SUBGRAPH = "Cannot create new vertices from subgraph";
   protected final Set<E> edgeSet = new LinkedHashSet<>();
   protected final Set<V> vertexSet = new LinkedHashSet();
   protected final Graph<V, E> base;
   protected final GraphType baseType;
   protected final boolean isInduced;
   private transient Set<E> unmodifiableEdgeSet = null;
   private transient Set<V> unmodifiableVertexSet = null;

   public AsSubgraph(Graph<V, E> var1, Set<? extends V> var2, Set<? extends E> var3) {
      this.base = GraphTests.requireDirectedOrUndirected(var1);
      this.baseType = var1.getType();
      this.isInduced = var3 == null;
      if (var1 instanceof ListenableGraph) {
         ((ListenableGraph)var1).addGraphListener(new AsSubgraph.BaseGraphListener());
      }

      this.initialize(var2, var3);
   }

   public AsSubgraph(Graph<V, E> var1, Set<? extends V> var2) {
      this(var1, var2, null);
   }

   public AsSubgraph(Graph<V, E> var1) {
      this(var1, null, null);
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      return this.containsVertex((V)var1) && this.containsVertex((V)var2)
         ? this.base.getAllEdges((V)var1, (V)var2).stream().filter(this.edgeSet::contains).collect(Collectors.toCollection(LinkedHashSet::new))
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
   public E addEdge(V var1, V var2) {
      this.assertVertexExist((V)var1);
      this.assertVertexExist((V)var2);
      if (!this.base.containsEdge((V)var1, (V)var2)) {
         throw new IllegalArgumentException("no such edge in base graph");
      }

      for (Object var5 : this.base.getAllEdges((V)var1, (V)var2)) {
         if (!this.containsEdge((E)var5)) {
            this.edgeSet.add((E)var5);
            return (E)var5;
         }
      }

      return null;
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      if (var3 == null) {
         throw new NullPointerException();
      }

      if (!this.base.containsEdge((E)var3)) {
         throw new IllegalArgumentException("no such edge in base graph");
      }

      this.assertVertexExist((V)var1);
      this.assertVertexExist((V)var2);
      assert this.base.getEdgeSource((E)var3) == var1;
      assert this.base.getEdgeTarget((E)var3) == var2;
      return this.edgeSet.add((E)var3);
   }

   @Override
   public V addVertex() {
      throw new UnsupportedOperationException("Cannot create new vertices from subgraph");
   }

   @Override
   public boolean addVertex(V var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else if (!this.base.containsVertex((V)var1)) {
         throw new IllegalArgumentException("no such vertex in base graph");
      } else {
         return this.vertexSet.add((V)var1);
      }
   }

   @Override
   public boolean containsEdge(E var1) {
      return this.edgeSet.contains(var1);
   }

   @Override
   public boolean containsVertex(V var1) {
      return this.vertexSet.contains(var1);
   }

   @Override
   public Set<E> edgeSet() {
      if (this.unmodifiableEdgeSet == null) {
         this.unmodifiableEdgeSet = Collections.unmodifiableSet(this.edgeSet);
      }

      return this.unmodifiableEdgeSet;
   }

   @Override
   public Set<E> edgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.base.edgesOf((V)var1).stream().filter(this.edgeSet::contains).collect(Collectors.toCollection(LinkedHashSet::new));
   }

   @Override
   public int degreeOf(V var1) {
      this.assertVertexExist((V)var1);
      if (this.baseType.isUndirected()) {
         int var2 = 0;
         Iterator var3 = this.base.edgesOf((V)var1).stream().filter(this.edgeSet::contains).iterator();

         while (var3.hasNext()) {
            Object var4 = var3.next();
            var2++;
            if (this.getEdgeSource((E)var4).equals(this.getEdgeTarget((E)var4))) {
               var2++;
            }
         }

         return var2;
      } else {
         return this.inDegreeOf((V)var1) + this.outDegreeOf((V)var1);
      }
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.base.incomingEdgesOf((V)var1).stream().filter(this.edgeSet::contains).collect(Collectors.toCollection(LinkedHashSet::new));
   }

   @Override
   public int inDegreeOf(V var1) {
      return this.baseType.isUndirected() ? this.degreeOf((V)var1) : this.incomingEdgesOf((V)var1).size();
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.base.outgoingEdgesOf((V)var1).stream().filter(this.edgeSet::contains).collect(Collectors.toCollection(LinkedHashSet::new));
   }

   @Override
   public int outDegreeOf(V var1) {
      return this.baseType.isUndirected() ? this.degreeOf((V)var1) : this.outgoingEdgesOf((V)var1).size();
   }

   @Override
   public boolean removeEdge(E var1) {
      return this.edgeSet.remove(var1);
   }

   @Override
   public E removeEdge(V var1, V var2) {
      Object var3 = this.getEdge((V)var1, (V)var2);
      return (E)(this.edgeSet.remove(var3) ? var3 : null);
   }

   @Override
   public boolean removeVertex(V var1) {
      if (this.containsVertex((V)var1) && this.base.containsVertex((V)var1)) {
         this.removeAllEdges(this.edgesOf((V)var1));
      }

      return this.vertexSet.remove(var1);
   }

   @Override
   public Set<V> vertexSet() {
      if (this.unmodifiableVertexSet == null) {
         this.unmodifiableVertexSet = Collections.unmodifiableSet(this.vertexSet);
      }

      return this.unmodifiableVertexSet;
   }

   @Override
   public V getEdgeSource(E var1) {
      return this.base.getEdgeSource((E)var1);
   }

   @Override
   public V getEdgeTarget(E var1) {
      return this.base.getEdgeTarget((E)var1);
   }

   @Override
   public GraphType getType() {
      return this.base.getType();
   }

   @Override
   public double getEdgeWeight(E var1) {
      return this.base.getEdgeWeight((E)var1);
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      this.base.setEdgeWeight((E)var1, var2);
   }

   private void initialize(Set<? extends V> var1, Set<? extends E> var2) {
      if (var1 == null && var2 == null) {
         this.vertexSet.addAll(this.base.vertexSet());
         this.edgeSet.addAll(this.base.edgeSet());
      } else {
         if (var1 == null) {
            this.vertexSet.addAll(this.base.vertexSet());
         } else if (var1.size() > this.base.vertexSet().size()) {
            this.base.vertexSet().stream().filter(var1::contains).forEach(this.vertexSet::add);
         } else {
            var1.stream().filter(var1x -> var1x != null && this.base.containsVertex((V)var1x)).forEach(this.vertexSet::add);
         }

         if (var2 == null) {
            this.base
               .edgeSet()
               .stream()
               .filter(var1x -> this.vertexSet.contains(this.base.getEdgeSource((E)var1x)) && this.vertexSet.contains(this.base.getEdgeTarget((E)var1x)))
               .forEach(this.edgeSet::add);
         } else if (var2.size() > this.base.edgeSet().size()) {
            this.base
               .edgeSet()
               .stream()
               .filter(
                  var2x -> var2.contains(var2x)
                     && this.vertexSet.contains(this.base.getEdgeSource((E)var2x))
                     && this.vertexSet.contains(this.base.getEdgeTarget((E)var2x))
               )
               .forEach(this.edgeSet::add);
         } else {
            var2.stream()
               .filter(
                  var1x -> var1x != null
                     && this.base.containsEdge((E)var1x)
                     && this.vertexSet.contains(this.base.getEdgeSource((E)var1x))
                     && this.vertexSet.contains(this.base.getEdgeTarget((E)var1x))
               )
               .forEach(this.edgeSet::add);
         }
      }
   }

   private class BaseGraphListener implements Serializable, GraphListener<V, E> {
      private static final long serialVersionUID = 4343535244243546391L;

      @Override
      public void edgeAdded(GraphEdgeChangeEvent<V, E> var1) {
         if (AsSubgraph.this.isInduced) {
            Object var2 = var1.getEdge();
            Object var3 = var1.getEdgeSource();
            Object var4 = var1.getEdgeTarget();
            if (AsSubgraph.this.containsVertex((V)var3) && AsSubgraph.this.containsVertex((V)var4)) {
               AsSubgraph.this.addEdge((V)var3, (V)var4, (E)var2);
            }
         }
      }

      @Override
      public void edgeRemoved(GraphEdgeChangeEvent<V, E> var1) {
         Object var2 = var1.getEdge();
         AsSubgraph.this.removeEdge((E)var2);
      }

      @Override
      public void vertexAdded(GraphVertexChangeEvent<V> var1) {
      }

      @Override
      public void vertexRemoved(GraphVertexChangeEvent<V> var1) {
         Object var2 = var1.getVertex();
         AsSubgraph.this.removeVertex((V)var2);
      }
   }
}
