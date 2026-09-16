package org.jgrapht.graph.builder;

import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultGraphType;
import org.jgrapht.graph.DefaultUndirectedGraph;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;
import org.jgrapht.graph.DirectedMultigraph;
import org.jgrapht.graph.DirectedPseudograph;
import org.jgrapht.graph.DirectedWeightedMultigraph;
import org.jgrapht.graph.DirectedWeightedPseudograph;
import org.jgrapht.graph.Multigraph;
import org.jgrapht.graph.Pseudograph;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.graph.SimpleWeightedGraph;
import org.jgrapht.graph.WeightedMultigraph;
import org.jgrapht.graph.WeightedPseudograph;
import org.jgrapht.util.SupplierUtil;
import org.jgrapht.util.TypeUtil;

public final class GraphTypeBuilder<V, E> {
   private boolean undirected;
   private boolean directed;
   private boolean weighted;
   private boolean allowingMultipleEdges;
   private boolean allowingSelfLoops;
   private Supplier<V> vertexSupplier;
   private Supplier<E> edgeSupplier;

   private GraphTypeBuilder(boolean var1, boolean var2) {
      this.directed = var1;
      this.undirected = var2;
      this.weighted = false;
      this.allowingMultipleEdges = false;
      this.allowingSelfLoops = false;
   }

   public static <V, E> GraphTypeBuilder<V, E> directed() {
      return new GraphTypeBuilder<>(true, false);
   }

   public static <V, E> GraphTypeBuilder<V, E> undirected() {
      return new GraphTypeBuilder<>(false, true);
   }

   public static <V, E> GraphTypeBuilder<V, E> mixed() {
      return new GraphTypeBuilder<>(true, true);
   }

   public static <V, E> GraphTypeBuilder<V, E> forGraphType(GraphType var0) {
      GraphTypeBuilder var1 = new GraphTypeBuilder(var0.isDirected() || var0.isMixed(), var0.isUndirected() || var0.isMixed());
      var1.weighted = var0.isWeighted();
      var1.allowingSelfLoops = var0.isAllowingSelfLoops();
      var1.allowingMultipleEdges = var0.isAllowingMultipleEdges();
      return var1;
   }

   public static <V, E> GraphTypeBuilder<V, E> forGraph(Graph<V, E> var0) {
      GraphTypeBuilder var1 = forGraphType(var0.getType());
      var1.vertexSupplier = var0.getVertexSupplier();
      var1.edgeSupplier = var0.getEdgeSupplier();
      return var1;
   }

   public GraphTypeBuilder<V, E> weighted(boolean var1) {
      this.weighted = var1;
      return this;
   }

   public GraphTypeBuilder<V, E> allowingSelfLoops(boolean var1) {
      this.allowingSelfLoops = var1;
      return this;
   }

   public GraphTypeBuilder<V, E> allowingMultipleEdges(boolean var1) {
      this.allowingMultipleEdges = var1;
      return this;
   }

   public <V1 extends V> GraphTypeBuilder<V1, E> vertexSupplier(Supplier<V1> var1) {
      GraphTypeBuilder var2 = TypeUtil.uncheckedCast(this);
      var2.vertexSupplier = var1;
      return var2;
   }

   public <E1 extends E> GraphTypeBuilder<V, E1> edgeSupplier(Supplier<E1> var1) {
      GraphTypeBuilder var2 = TypeUtil.uncheckedCast(this);
      var2.edgeSupplier = var1;
      return var2;
   }

   public <V1 extends V> GraphTypeBuilder<V1, E> vertexClass(Class<V1> var1) {
      GraphTypeBuilder var2 = TypeUtil.uncheckedCast(this);
      var2.vertexSupplier = SupplierUtil.createSupplier(var1);
      return var2;
   }

   public <E1 extends E> GraphTypeBuilder<V, E1> edgeClass(Class<E1> var1) {
      GraphTypeBuilder var2 = TypeUtil.uncheckedCast(this);
      var2.edgeSupplier = SupplierUtil.createSupplier(var1);
      return var2;
   }

   public GraphType buildType() {
      DefaultGraphType.Builder var1 = new DefaultGraphType.Builder();
      if (this.directed && this.undirected) {
         var1 = var1.mixed();
      } else if (this.directed) {
         var1 = var1.directed();
      } else if (this.undirected) {
         var1 = var1.undirected();
      }

      return var1.allowMultipleEdges(this.allowingMultipleEdges).allowSelfLoops(this.allowingSelfLoops).weighted(this.weighted).build();
   }

   public GraphBuilder<V, E, Graph<V, E>> buildGraphBuilder() {
      return new GraphBuilder<>(this.buildGraph());
   }

   public Graph<V, E> buildGraph() {
      if (this.directed && this.undirected) {
         throw new UnsupportedOperationException("Mixed graphs are not supported");
      }

      if (this.directed) {
         if (this.allowingSelfLoops && this.allowingMultipleEdges) {
            return this.weighted
               ? new DirectedWeightedPseudograph<>(this.vertexSupplier, this.edgeSupplier)
               : new DirectedPseudograph<>(this.vertexSupplier, this.edgeSupplier, false);
         } else if (this.allowingMultipleEdges) {
            return this.weighted
               ? new DirectedWeightedMultigraph<>(this.vertexSupplier, this.edgeSupplier)
               : new DirectedMultigraph<>(this.vertexSupplier, this.edgeSupplier, false);
         } else if (this.allowingSelfLoops) {
            return this.weighted
               ? new DefaultDirectedWeightedGraph<>(this.vertexSupplier, this.edgeSupplier)
               : new DefaultDirectedGraph<>(this.vertexSupplier, this.edgeSupplier, false);
         } else {
            return this.weighted
               ? new SimpleDirectedWeightedGraph<>(this.vertexSupplier, this.edgeSupplier)
               : new SimpleDirectedGraph<>(this.vertexSupplier, this.edgeSupplier, false);
         }
      } else if (this.allowingSelfLoops && this.allowingMultipleEdges) {
         return this.weighted
            ? new WeightedPseudograph<>(this.vertexSupplier, this.edgeSupplier)
            : new Pseudograph<>(this.vertexSupplier, this.edgeSupplier, false);
      } else if (this.allowingMultipleEdges) {
         return this.weighted
            ? new WeightedMultigraph<>(this.vertexSupplier, this.edgeSupplier)
            : new Multigraph<>(this.vertexSupplier, this.edgeSupplier, false);
      } else if (this.allowingSelfLoops) {
         return this.weighted
            ? new DefaultUndirectedWeightedGraph<>(this.vertexSupplier, this.edgeSupplier)
            : new DefaultUndirectedGraph<>(this.vertexSupplier, this.edgeSupplier, false);
      } else {
         return this.weighted
            ? new SimpleWeightedGraph<>(this.vertexSupplier, this.edgeSupplier)
            : new SimpleGraph<>(this.vertexSupplier, this.edgeSupplier, false);
      }
   }
}
