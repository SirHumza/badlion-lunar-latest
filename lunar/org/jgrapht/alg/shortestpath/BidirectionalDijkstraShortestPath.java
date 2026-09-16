package org.jgrapht.alg.shortestpath;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public final class BidirectionalDijkstraShortestPath<V, E> extends BaseBidirectionalShortestPathAlgorithm<V, E> {
   private double radius;
   private final Supplier<AddressableHeap<Double, Pair<V, E>>> heapSupplier;

   public BidirectionalDijkstraShortestPath(Graph<V, E> var1) {
      this(var1, Double.POSITIVE_INFINITY, PairingHeap::new);
   }

   public BidirectionalDijkstraShortestPath(Graph<V, E> var1, Supplier<AddressableHeap<Double, Pair<V, E>>> var2) {
      this(var1, Double.POSITIVE_INFINITY, var2);
   }

   public BidirectionalDijkstraShortestPath(Graph<V, E> var1, double var2) {
      this(var1, var2, PairingHeap::new);
   }

   public BidirectionalDijkstraShortestPath(Graph<V, E> var1, double var2, Supplier<AddressableHeap<Double, Pair<V, E>>> var4) {
      super(var1);
      if (var2 < 0.0) {
         throw new IllegalArgumentException("Radius must be non-negative");
      }

      this.heapSupplier = Objects.requireNonNull(var4, "Heap supplier cannot be null");
      this.radius = var2;
   }

   public static <V, E> GraphPath<V, E> findPathBetween(Graph<V, E> var0, V var1, V var2) {
      return new BidirectionalDijkstraShortestPath<V, E>(var0).getPath((V)var1, (V)var2);
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

      BidirectionalDijkstraShortestPath.DijkstraSearchFrontier var3 = new BidirectionalDijkstraShortestPath.DijkstraSearchFrontier<>(
         this.graph, this.heapSupplier
      );
      BidirectionalDijkstraShortestPath.DijkstraSearchFrontier var4;
      if (this.graph.getType().isDirected()) {
         var4 = new BidirectionalDijkstraShortestPath.DijkstraSearchFrontier<>(new EdgeReversedGraph<>(this.graph), this.heapSupplier);
      } else {
         var4 = new BidirectionalDijkstraShortestPath.DijkstraSearchFrontier<>(this.graph, this.heapSupplier);
      }

      assert !var1.equals(var2);
      var3.updateDistance(var1, null, 0.0);
      var4.updateDistance(var2, null, 0.0);
      double var5 = Double.POSITIVE_INFINITY;
      Object var7 = null;
      BidirectionalDijkstraShortestPath.DijkstraSearchFrontier var8 = var3;
      BidirectionalDijkstraShortestPath.DijkstraSearchFrontier var9 = var4;

      while (!var8.heap.isEmpty() && !var9.heap.isEmpty() && !(var8.heap.findMin().getKey() + var9.heap.findMin().getKey() >= var5)) {
         AddressableHeap.Handle var10 = var8.heap.deleteMin();
         Object var11 = ((Pair)var10.getValue()).getFirst();
         double var12 = (Double)var10.getKey();

         for (Object var15 : var8.graph.outgoingEdgesOf((V)var11)) {
            Object var16 = Graphs.getOppositeVertex(var8.graph, (E)var15, (V)var11);
            double var17 = var8.graph.getEdgeWeight((E)var15);
            var8.updateDistance(var16, var15, var12 + var17);
            double var19 = var12 + var17 + var9.getDistance(var16);
            if (var19 < var5) {
               var5 = var19;
               var7 = var16;
            }
         }

         BidirectionalDijkstraShortestPath.DijkstraSearchFrontier var21 = var8;
         var8 = var9;
         var9 = var21;
      }

      return Double.isFinite(var5) && var5 <= this.radius
         ? this.createPath(var3, var4, var5, (V)var1, (V)var7, (V)var2)
         : this.createEmptyPath((V)var1, (V)var2);
   }

   static class DijkstraSearchFrontier<V, E> extends BaseBidirectionalShortestPathAlgorithm.BaseSearchFrontier<V, E> {
      final AddressableHeap<Double, Pair<V, E>> heap;
      final Map<V, AddressableHeap.Handle<Double, Pair<V, E>>> seen;

      DijkstraSearchFrontier(Graph<V, E> var1, Supplier<AddressableHeap<Double, Pair<V, E>>> var2) {
         super(var1);
         this.heap = (AddressableHeap<Double, Pair<V, E>>)var2.get();
         this.seen = new HashMap<>();
      }

      void updateDistance(V var1, E var2, double var3) {
         AddressableHeap.Handle var5 = this.seen.get(var1);
         if (var5 == null) {
            var5 = this.heap.insert(var3, new Pair<>((V)var1, (E)var2));
            this.seen.put((V)var1, var5);
         } else if (var3 < (Double)var5.getKey()) {
            var5.decreaseKey(var3);
            var5.setValue(Pair.of(var1, var2));
         }
      }

      @Override
      public double getDistance(V var1) {
         AddressableHeap.Handle var2 = this.seen.get(var1);
         return var2 == null ? Double.POSITIVE_INFINITY : (Double)var2.getKey();
      }

      @Override
      public E getTreeEdge(V var1) {
         AddressableHeap.Handle var2 = this.seen.get(var1);
         return (E)(var2 == null ? null : ((Pair)var2.getValue()).getSecond());
      }
   }
}
