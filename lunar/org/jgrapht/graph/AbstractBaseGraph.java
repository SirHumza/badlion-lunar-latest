package org.jgrapht.graph;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphIterables;
import org.jgrapht.GraphType;
import org.jgrapht.Graphs;
import org.jgrapht.graph.specifics.Specifics;
import org.jgrapht.util.TypeUtil;

public abstract class AbstractBaseGraph<V, E> extends AbstractGraph<V, E> implements Serializable, Cloneable, Graph<V, E> {
   private static final long serialVersionUID = -3582386521833998627L;
   private static final String LOOPS_NOT_ALLOWED = "loops not allowed";
   private static final String GRAPH_SPECIFICS_MUST_NOT_BE_NULL = "Graph specifics must not be null";
   private static final String INVALID_VERTEX_SUPPLIER_DOES_NOT_RETURN_UNIQUE_VERTICES_ON_EACH_CALL = "Invalid vertex supplier (does not return unique vertices on each call).";
   private static final String MIXED_GRAPH_NOT_SUPPORTED = "Mixed graph not supported";
   private static final String GRAPH_SPECIFICS_STRATEGY_REQUIRED = "Graph specifics strategy required";
   private static final String THE_GRAPH_CONTAINS_NO_VERTEX_SUPPLIER = "The graph contains no vertex supplier";
   private static final String THE_GRAPH_CONTAINS_NO_EDGE_SUPPLIER = "The graph contains no edge supplier";
   private transient Set<V> unmodifiableVertexSet = null;
   private Supplier<V> vertexSupplier;
   private Supplier<E> edgeSupplier;
   private GraphType type;
   private Specifics<V, E> specifics;
   private IntrusiveEdgesSpecifics<V, E> intrusiveEdgesSpecifics;
   private GraphSpecificsStrategy<V, E> graphSpecificsStrategy;
   private transient GraphIterables<V, E> graphIterables = null;

   protected AbstractBaseGraph(Supplier<V> var1, Supplier<E> var2, GraphType var3) {
      this(var1, var2, var3, new FastLookupGraphSpecificsStrategy<>());
   }

   protected AbstractBaseGraph(Supplier<V> var1, Supplier<E> var2, GraphType var3, GraphSpecificsStrategy<V, E> var4) {
      this.vertexSupplier = var1;
      this.edgeSupplier = var2;
      this.type = Objects.requireNonNull(var3);
      if (var3.isMixed()) {
         throw new IllegalArgumentException("Mixed graph not supported");
      }

      this.graphSpecificsStrategy = Objects.requireNonNull(var4, "Graph specifics strategy required");
      this.specifics = Objects.requireNonNull((Specifics<V, E>)var4.getSpecificsFactory().apply(this, var3), "Graph specifics must not be null");
      this.intrusiveEdgesSpecifics = Objects.requireNonNull(
         (IntrusiveEdgesSpecifics<V, E>)var4.getIntrusiveEdgesSpecificsFactory().apply(var3), "Graph specifics must not be null"
      );
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      return this.specifics.getAllEdges((V)var1, (V)var2);
   }

   @Override
   public Supplier<E> getEdgeSupplier() {
      return this.edgeSupplier;
   }

   public void setEdgeSupplier(Supplier<E> var1) {
      this.edgeSupplier = var1;
   }

   @Override
   public Supplier<V> getVertexSupplier() {
      return this.vertexSupplier;
   }

   public void setVertexSupplier(Supplier<V> var1) {
      this.vertexSupplier = var1;
   }

   @Override
   public E getEdge(V var1, V var2) {
      return this.specifics.getEdge((V)var1, (V)var2);
   }

   @Override
   public E addEdge(V var1, V var2) {
      this.assertVertexExist((V)var1);
      this.assertVertexExist((V)var2);
      if (!this.type.isAllowingSelfLoops() && var1.equals(var2)) {
         throw new IllegalArgumentException("loops not allowed");
      }

      if (this.edgeSupplier == null) {
         throw new UnsupportedOperationException("The graph contains no edge supplier");
      }

      if (!this.type.isAllowingMultipleEdges()) {
         Object var3 = this.specifics.createEdgeToTouchingVerticesIfAbsent((V)var1, (V)var2, this.edgeSupplier);
         if (var3 != null) {
            boolean var4 = false;

            try {
               var4 = this.intrusiveEdgesSpecifics.add((E)var3, (V)var1, (V)var2);
            } finally {
               if (!var4) {
                  this.specifics.removeEdgeFromTouchingVertices((V)var1, (V)var2, (E)var3);
               }
            }

            if (var4) {
               return (E)var3;
            }
         }
      } else {
         Object var8 = this.edgeSupplier.get();
         if (this.intrusiveEdgesSpecifics.add((E)var8, (V)var1, (V)var2)) {
            this.specifics.addEdgeToTouchingVertices((V)var1, (V)var2, (E)var8);
            return (E)var8;
         }
      }

      return null;
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      if (var3 == null) {
         throw new NullPointerException();
      }

      this.assertVertexExist((V)var1);
      this.assertVertexExist((V)var2);
      if (!this.type.isAllowingSelfLoops() && var1.equals(var2)) {
         throw new IllegalArgumentException("loops not allowed");
      }

      if (this.type.isAllowingMultipleEdges()) {
         if (this.intrusiveEdgesSpecifics.add((E)var3, (V)var1, (V)var2)) {
            this.specifics.addEdgeToTouchingVertices((V)var1, (V)var2, (E)var3);
            return true;
         } else {
            return false;
         }
      } else {
         if (!this.specifics.addEdgeToTouchingVerticesIfAbsent((V)var1, (V)var2, (E)var3)) {
            return false;
         }

         boolean var4 = false;

         try {
            var4 = this.intrusiveEdgesSpecifics.add((E)var3, (V)var1, (V)var2);
         } finally {
            if (!var4) {
               this.specifics.removeEdgeFromTouchingVertices((V)var1, (V)var2, (E)var3);
            }
         }

         return var4;
      }
   }

   @Override
   public V addVertex() {
      if (this.vertexSupplier == null) {
         throw new UnsupportedOperationException("The graph contains no vertex supplier");
      } else {
         Object var1 = this.vertexSupplier.get();
         if (!this.specifics.addVertex((V)var1)) {
            throw new IllegalArgumentException("Invalid vertex supplier (does not return unique vertices on each call).");
         } else {
            return (V)var1;
         }
      }
   }

   @Override
   public boolean addVertex(V var1) {
      if (var1 == null) {
         throw new NullPointerException();
      }

      if (this.containsVertex((V)var1)) {
         return false;
      }

      this.specifics.addVertex((V)var1);
      return true;
   }

   @Override
   public V getEdgeSource(E var1) {
      return this.intrusiveEdgesSpecifics.getEdgeSource((E)var1);
   }

   @Override
   public V getEdgeTarget(E var1) {
      return this.intrusiveEdgesSpecifics.getEdgeTarget((E)var1);
   }

   @Override
   public Object clone() {
      try {
         AbstractBaseGraph var1 = TypeUtil.uncheckedCast(super.clone());
         var1.vertexSupplier = this.vertexSupplier;
         var1.edgeSupplier = this.edgeSupplier;
         var1.type = this.type;
         var1.unmodifiableVertexSet = null;
         var1.graphSpecificsStrategy = this.graphSpecificsStrategy;
         var1.specifics = var1.graphSpecificsStrategy.getSpecificsFactory().apply(var1, var1.type);
         var1.intrusiveEdgesSpecifics = var1.graphSpecificsStrategy.getIntrusiveEdgesSpecificsFactory().apply(var1.type);
         var1.graphIterables = null;
         Graphs.addGraph(var1, this);
         return var1;
      } catch (CloneNotSupportedException var2) {
         var2.printStackTrace();
         throw new RuntimeException();
      }
   }

   @Override
   public boolean containsEdge(E var1) {
      return this.intrusiveEdgesSpecifics.containsEdge((E)var1);
   }

   @Override
   public boolean containsVertex(V var1) {
      return this.specifics.getVertexSet().contains(var1);
   }

   @Override
   public int degreeOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.specifics.degreeOf((V)var1);
   }

   @Override
   public Set<E> edgeSet() {
      return this.intrusiveEdgesSpecifics.getEdgeSet();
   }

   @Override
   public Set<E> edgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.specifics.edgesOf((V)var1);
   }

   @Override
   public int inDegreeOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.specifics.inDegreeOf((V)var1);
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.specifics.incomingEdgesOf((V)var1);
   }

   @Override
   public int outDegreeOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.specifics.outDegreeOf((V)var1);
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      this.assertVertexExist((V)var1);
      return this.specifics.outgoingEdgesOf((V)var1);
   }

   @Override
   public E removeEdge(V var1, V var2) {
      Object var3 = this.getEdge((V)var1, (V)var2);
      if (var3 != null) {
         this.specifics.removeEdgeFromTouchingVertices((V)var1, (V)var2, (E)var3);
         this.intrusiveEdgesSpecifics.remove((E)var3);
      }

      return (E)var3;
   }

   @Override
   public boolean removeEdge(E var1) {
      if (this.containsEdge((E)var1)) {
         Object var2 = this.getEdgeSource((E)var1);
         Object var3 = this.getEdgeTarget((E)var1);
         this.specifics.removeEdgeFromTouchingVertices((V)var2, (V)var3, (E)var1);
         this.intrusiveEdgesSpecifics.remove((E)var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean removeVertex(V var1) {
      if (this.containsVertex((V)var1)) {
         Set var2 = this.edgesOf((V)var1);
         this.removeAllEdges(new ArrayList<>(var2));
         this.specifics.getVertexSet().remove(var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public Set<V> vertexSet() {
      if (this.unmodifiableVertexSet == null) {
         this.unmodifiableVertexSet = Collections.unmodifiableSet(this.specifics.getVertexSet());
      }

      return this.unmodifiableVertexSet;
   }

   @Override
   public double getEdgeWeight(E var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         return this.intrusiveEdgesSpecifics.getEdgeWeight((E)var1);
      }
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      if (var1 == null) {
         throw new NullPointerException();
      }

      this.intrusiveEdgesSpecifics.setEdgeWeight((E)var1, var2);
   }

   @Override
   public GraphType getType() {
      return this.type;
   }

   @Override
   public GraphIterables<V, E> iterables() {
      if (this.graphIterables == null) {
         this.graphIterables = new DefaultGraphIterables<>(this);
      }

      return this.graphIterables;
   }
}
