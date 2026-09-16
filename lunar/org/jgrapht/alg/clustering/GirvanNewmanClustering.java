package org.jgrapht.alg.clustering;

import java.util.List;
import java.util.Objects;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.interfaces.ClusteringAlgorithm;
import org.jgrapht.alg.scoring.EdgeBetweennessCentrality;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.SupplierUtil;

public class GirvanNewmanClustering<V, E> implements ClusteringAlgorithm<V> {
   private Graph<V, E> graph;
   private int k;
   private final Iterable<V> startVertices;
   private final EdgeBetweennessCentrality.OverflowStrategy overflowStrategy;

   public GirvanNewmanClustering(Graph<V, E> var1, int var2) {
      this(var1, var2, EdgeBetweennessCentrality.OverflowStrategy.THROW_EXCEPTION_ON_OVERFLOW, var1.vertexSet());
   }

   public GirvanNewmanClustering(Graph<V, E> var1, int var2, EdgeBetweennessCentrality.OverflowStrategy var3, Iterable<V> var4) {
      this.graph = Objects.requireNonNull(var1);
      if (var2 >= 1 && var2 <= var1.vertexSet().size()) {
         this.k = var2;
         this.overflowStrategy = var3;
         if (var4 == null) {
            this.startVertices = var1.vertexSet();
         } else {
            this.startVertices = var4;
         }
      } else {
         throw new IllegalArgumentException("Illegal number of clusters");
      }
   }

   @Override
   public ClusteringAlgorithm.Clustering<V> getClustering() {
      Graph var1 = GraphTypeBuilder.<V, E>forGraphType(this.graph.getType())
         .edgeSupplier(SupplierUtil.DEFAULT_EDGE_SUPPLIER)
         .vertexSupplier(this.graph.getVertexSupplier())
         .buildGraph();

      for (Object var3 : this.graph.iterables().vertices()) {
         var1.addVertex(var3);
      }

      for (Object var11 : this.graph.iterables().edges()) {
         Object var4 = this.graph.getEdgeSource((E)var11);
         Object var5 = this.graph.getEdgeTarget((E)var11);
         var1.addEdge(var4, var5);
      }

      while (true) {
         List var10 = new ConnectivityInspector(var1).connectedSets();
         if (var10.size() == this.k) {
            return new ClusteringAlgorithm.ClusteringImpl<>(var10);
         }

         EdgeBetweennessCentrality var12 = new EdgeBetweennessCentrality<>(var1, this.overflowStrategy, this.startVertices);
         DefaultEdge var13 = null;
         double var14 = 0.0;

         for (Entry var8 : var12.getScores().entrySet()) {
            if (Double.compare((Double)var8.getValue(), var14) > 0 || var13 == null) {
               var13 = (DefaultEdge)var8.getKey();
               var14 = (Double)var8.getValue();
            }
         }

         var1.removeEdge(var13);
      }
   }
}
