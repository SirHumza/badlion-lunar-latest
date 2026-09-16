package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.GraphType;
import org.jgrapht.util.UnmodifiableUnionSet;
import org.jgrapht.util.WeightCombiner;

public class AsGraphUnion<V, E> extends AbstractGraph<V, E> implements Serializable {
   private static final long serialVersionUID = -3848082143382987713L;
   private static final String READ_ONLY = "union of graphs is read-only";
   private final Graph<V, E> g1;
   private final GraphType type1;
   private final Graph<V, E> g2;
   private final GraphType type2;
   private final GraphType type;
   private final WeightCombiner operator;

   public AsGraphUnion(Graph<V, E> var1, Graph<V, E> var2, WeightCombiner var3) {
      this.g1 = GraphTests.requireDirectedOrUndirected(var1);
      this.type1 = var1.getType();
      this.g2 = GraphTests.requireDirectedOrUndirected(var2);
      this.type2 = var2.getType();
      if (var1 == var2) {
         throw new IllegalArgumentException("g1 is equal to g2");
      }

      this.operator = Objects.requireNonNull(var3, "Weight combiner cannot be null");
      DefaultGraphType.Builder var4 = new DefaultGraphType.Builder();
      if (this.type1.isDirected() && this.type2.isDirected()) {
         var4 = var4.directed();
      } else if (this.type1.isUndirected() && this.type2.isUndirected()) {
         var4 = var4.undirected();
      } else {
         var4 = var4.mixed();
      }

      this.type = var4.allowSelfLoops(this.type1.isAllowingSelfLoops() || this.type2.isAllowingSelfLoops())
         .allowMultipleEdges(true)
         .weighted(true)
         .modifiable(false)
         .build();
   }

   public AsGraphUnion(Graph<V, E> var1, Graph<V, E> var2) {
      this(var1, var2, WeightCombiner.SUM);
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      boolean var3 = this.g1.containsVertex((V)var1) && this.g1.containsVertex((V)var2);
      boolean var4 = this.g2.containsVertex((V)var1) && this.g2.containsVertex((V)var2);
      if (var3 && var4) {
         return new UnmodifiableUnionSet<>(this.g1.getAllEdges((V)var1, (V)var2), this.g2.getAllEdges((V)var1, (V)var2));
      } else if (var3) {
         return Collections.unmodifiableSet(this.g1.getAllEdges((V)var1, (V)var2));
      } else {
         return var4 ? Collections.unmodifiableSet(this.g2.getAllEdges((V)var1, (V)var2)) : Collections.emptySet();
      }
   }

   @Override
   public E getEdge(V var1, V var2) {
      Object var3 = null;
      if (this.g1.containsVertex((V)var1) && this.g1.containsVertex((V)var2)) {
         var3 = this.g1.getEdge((V)var1, (V)var2);
      }

      if (var3 == null && this.g2.containsVertex((V)var1) && this.g2.containsVertex((V)var2)) {
         var3 = this.g2.getEdge((V)var1, (V)var2);
      }

      return (E)var3;
   }

   @Override
   public Supplier<V> getVertexSupplier() {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public Supplier<E> getEdgeSupplier() {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public E addEdge(V var1, V var2) {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public V addVertex() {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public boolean addVertex(V var1) {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public boolean containsEdge(E var1) {
      return this.g1.containsEdge((E)var1) || this.g2.containsEdge((E)var1);
   }

   @Override
   public boolean containsVertex(V var1) {
      return this.g1.containsVertex((V)var1) || this.g2.containsVertex((V)var1);
   }

   @Override
   public Set<E> edgeSet() {
      return new UnmodifiableUnionSet<>(this.g1.edgeSet(), this.g2.edgeSet());
   }

   @Override
   public Set<E> edgesOf(V var1) {
      boolean var2 = this.g1.containsVertex((V)var1);
      boolean var3 = this.g2.containsVertex((V)var1);
      if (var2 && var3) {
         return new UnmodifiableUnionSet<>(this.g1.edgesOf((V)var1), this.g2.edgesOf((V)var1));
      } else if (var2) {
         return Collections.unmodifiableSet(this.g1.edgesOf((V)var1));
      } else if (var3) {
         return Collections.unmodifiableSet(this.g2.edgesOf((V)var1));
      } else {
         throw new IllegalArgumentException("no such vertex in graph: " + var1.toString());
      }
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      boolean var2 = this.g1.containsVertex((V)var1);
      boolean var3 = this.g2.containsVertex((V)var1);
      if (var2 && var3) {
         return new UnmodifiableUnionSet<>(this.g1.incomingEdgesOf((V)var1), this.g2.incomingEdgesOf((V)var1));
      } else if (var2) {
         return Collections.unmodifiableSet(this.g1.incomingEdgesOf((V)var1));
      } else if (var3) {
         return Collections.unmodifiableSet(this.g2.incomingEdgesOf((V)var1));
      } else {
         throw new IllegalArgumentException("no such vertex in graph: " + var1.toString());
      }
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      boolean var2 = this.g1.containsVertex((V)var1);
      boolean var3 = this.g2.containsVertex((V)var1);
      if (var2 && var3) {
         return new UnmodifiableUnionSet<>(this.g1.outgoingEdgesOf((V)var1), this.g2.outgoingEdgesOf((V)var1));
      } else if (var2) {
         return Collections.unmodifiableSet(this.g1.outgoingEdgesOf((V)var1));
      } else if (var3) {
         return Collections.unmodifiableSet(this.g2.outgoingEdgesOf((V)var1));
      } else {
         throw new IllegalArgumentException("no such vertex in graph: " + var1.toString());
      }
   }

   @Override
   public int degreeOf(V var1) {
      if (this.type.isMixed()) {
         int var5 = 0;
         if (this.g1.containsVertex((V)var1)) {
            var5 += this.g1.degreeOf((V)var1);
         }

         if (this.g2.containsVertex((V)var1)) {
            var5 += this.g2.degreeOf((V)var1);
         }

         return var5;
      } else if (this.type.isUndirected()) {
         int var2 = 0;

         for (Object var4 : this.edgesOf((V)var1)) {
            var2++;
            if (this.getEdgeSource((E)var4).equals(this.getEdgeTarget((E)var4))) {
               var2++;
            }
         }

         return var2;
      } else {
         return this.incomingEdgesOf((V)var1).size() + this.outgoingEdgesOf((V)var1).size();
      }
   }

   @Override
   public int inDegreeOf(V var1) {
      if (this.type.isMixed()) {
         int var2 = 0;
         if (this.g1.containsVertex((V)var1)) {
            var2 += this.g1.inDegreeOf((V)var1);
         }

         if (this.g2.containsVertex((V)var1)) {
            var2 += this.g2.inDegreeOf((V)var1);
         }

         return var2;
      } else {
         return this.type.isUndirected() ? this.degreeOf((V)var1) : this.incomingEdgesOf((V)var1).size();
      }
   }

   @Override
   public int outDegreeOf(V var1) {
      if (this.type.isMixed()) {
         int var2 = 0;
         if (this.g1.containsVertex((V)var1)) {
            var2 += this.g1.outDegreeOf((V)var1);
         }

         if (this.g2.containsVertex((V)var1)) {
            var2 += this.g2.outDegreeOf((V)var1);
         }

         return var2;
      } else {
         return this.type.isUndirected() ? this.degreeOf((V)var1) : this.outgoingEdgesOf((V)var1).size();
      }
   }

   @Override
   public E removeEdge(V var1, V var2) {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public boolean removeEdge(E var1) {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public boolean removeVertex(V var1) {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }

   @Override
   public Set<V> vertexSet() {
      return new UnmodifiableUnionSet<>(this.g1.vertexSet(), this.g2.vertexSet());
   }

   @Override
   public V getEdgeSource(E var1) {
      if (this.g1.containsEdge((E)var1)) {
         return this.g1.getEdgeSource((E)var1);
      } else {
         return this.g2.containsEdge((E)var1) ? this.g2.getEdgeSource((E)var1) : null;
      }
   }

   @Override
   public V getEdgeTarget(E var1) {
      if (this.g1.containsEdge((E)var1)) {
         return this.g1.getEdgeTarget((E)var1);
      } else {
         return this.g2.containsEdge((E)var1) ? this.g2.getEdgeTarget((E)var1) : null;
      }
   }

   @Override
   public double getEdgeWeight(E var1) {
      if (this.g1.containsEdge((E)var1) && this.g2.containsEdge((E)var1)) {
         return this.operator.combine(this.g1.getEdgeWeight((E)var1), this.g2.getEdgeWeight((E)var1));
      } else if (this.g1.containsEdge((E)var1)) {
         return this.g1.getEdgeWeight((E)var1);
      } else if (this.g2.containsEdge((E)var1)) {
         return this.g2.getEdgeWeight((E)var1);
      } else {
         throw new IllegalArgumentException("no such edge in the union");
      }
   }

   @Override
   public GraphType getType() {
      return this.type;
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      throw new UnsupportedOperationException("union of graphs is read-only");
   }
}
