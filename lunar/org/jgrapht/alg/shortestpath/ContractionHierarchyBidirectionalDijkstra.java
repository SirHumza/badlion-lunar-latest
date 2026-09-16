package org.jgrapht.alg.shortestpath;

import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.graph.MaskSubgraph;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class ContractionHierarchyBidirectionalDijkstra<V, E> extends BaseShortestPathAlgorithm<V, E> {
   private ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> contractionHierarchy;
   private Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> contractionGraph;
   private Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> contractionMapping;
   private Supplier<AddressableHeap<Double, Pair<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> heapSupplier;
   private double radius;

   @Deprecated
   public ContractionHierarchyBidirectionalDijkstra(Graph<V, E> var1) {
      this(new ContractionHierarchyPrecomputation<V, E>(var1).computeContractionHierarchy());
   }

   public ContractionHierarchyBidirectionalDijkstra(Graph<V, E> var1, ThreadPoolExecutor var2) {
      this(new ContractionHierarchyPrecomputation<V, E>(var1, var2).computeContractionHierarchy());
   }

   public ContractionHierarchyBidirectionalDijkstra(ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> var1) {
      this(var1, Double.POSITIVE_INFINITY, PairingHeap::new);
   }

   public ContractionHierarchyBidirectionalDijkstra(
      ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> var1,
      double var2,
      Supplier<AddressableHeap<Double, Pair<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> var4
   ) {
      super(var1.getGraph());
      this.contractionHierarchy = var1;
      this.contractionGraph = var1.getContractionGraph();
      this.contractionMapping = var1.getContractionMapping();
      this.radius = var2;
      this.heapSupplier = var4;
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      }

      if (var1.equals(var2)) {
         return this.createEmptyPath((V)var1, (V)var2);
      }

      ContractionHierarchyPrecomputation.ContractionVertex var3 = this.contractionMapping.get(var1);
      ContractionHierarchyPrecomputation.ContractionVertex var4 = this.contractionMapping.get(var2);
      ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier var5 = new ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier<>(
         new MaskSubgraph<>(this.contractionGraph, var0 -> false, var0 -> !var0.isUpward), this.heapSupplier
      );
      ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier var6 = new ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier<>(
         new MaskSubgraph<>(new EdgeReversedGraph<>(this.contractionGraph), var0 -> false, var0 -> var0.isUpward), this.heapSupplier
      );
      var5.updateDistance(var3, null, 0.0);
      var6.updateDistance(var4, null, 0.0);
      double var7 = Double.POSITIVE_INFINITY;
      ContractionHierarchyPrecomputation.ContractionVertex var9 = null;
      ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier var10 = var5;
      ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier var11 = var6;

      while (true) {
         if (var10.heap.isEmpty()) {
            var10.isFinished = true;
         }

         if (var11.heap.isEmpty()) {
            var11.isFinished = true;
         }

         if (var10.isFinished && var11.isFinished) {
            if (Double.isFinite(var7) && var7 <= this.radius) {
               return this.createPath(var5, var6, var7, var3, var9, var4);
            }

            return this.createEmptyPath((V)var1, (V)var2);
         }

         if (var10.heap.findMin().getKey() >= var7) {
            var10.isFinished = true;
         } else {
            AddressableHeap.Handle var12 = var10.heap.deleteMin();
            ContractionHierarchyPrecomputation.ContractionVertex var13 = (ContractionHierarchyPrecomputation.ContractionVertex)((Pair)var12.getValue())
               .getFirst();
            double var14 = (Double)var12.getKey();

            for (ContractionHierarchyPrecomputation.ContractionEdge var17 : var10.graph.outgoingEdgesOf((V)var13)) {
               ContractionHierarchyPrecomputation.ContractionVertex var18 = (ContractionHierarchyPrecomputation.ContractionVertex)var10.graph
                  .getEdgeTarget((E)var17);
               double var19 = var10.graph.getEdgeWeight((E)var17);
               var10.updateDistance(var18, var17, var14 + var19);
               double var21 = var14 + var19 + var11.getDistance(var18);
               if (var21 < var7) {
                  var7 = var21;
                  var9 = var18;
               }
            }
         }

         if (!var11.isFinished) {
            ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier var23 = var10;
            var10 = var11;
            var11 = var23;
         }
      }
   }

   private GraphPath<V, E> createPath(
      ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var1,
      ContractionHierarchyBidirectionalDijkstra.ContractionSearchFrontier<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var2,
      double var3,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var5,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var6,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var7
   ) {
      LinkedList var8 = new LinkedList();
      LinkedList var9 = new LinkedList();
      var9.add((E)var6.vertex);
      ContractionHierarchyPrecomputation.ContractionVertex var10 = var6;

      while (true) {
         ContractionHierarchyPrecomputation.ContractionEdge var11 = (ContractionHierarchyPrecomputation.ContractionEdge)var1.getTreeEdge(var10);
         if (var11 == null) {
            var10 = var6;

            while (true) {
               var11 = (ContractionHierarchyPrecomputation.ContractionEdge)var2.getTreeEdge(var10);
               if (var11 == null) {
                  return new GraphWalk<>(this.graph, (V)var5.vertex, (V)var7.vertex, var9, var8, var3);
               }

               this.contractionHierarchy.unpackForward(var11, var9, var8);
               var10 = this.contractionGraph.getEdgeTarget(var11);
            }
         }

         this.contractionHierarchy.unpackBackward(var11, var9, var8);
         var10 = this.contractionGraph.getEdgeSource(var11);
      }
   }

   static class ContractionSearchFrontier<V, E> extends BidirectionalDijkstraShortestPath.DijkstraSearchFrontier<V, E> {
      boolean isFinished;

      ContractionSearchFrontier(Graph<V, E> var1, Supplier<AddressableHeap<Double, Pair<V, E>>> var2) {
         super(var1, var2);
      }
   }
}
