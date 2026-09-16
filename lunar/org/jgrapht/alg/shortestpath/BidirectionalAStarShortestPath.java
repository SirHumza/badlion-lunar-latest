package org.jgrapht.alg.shortestpath;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.AStarAdmissibleHeuristic;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class BidirectionalAStarShortestPath<V, E> extends BaseBidirectionalShortestPathAlgorithm<V, E> {
   private AStarAdmissibleHeuristic<V> forwardHeuristic;
   private AStarAdmissibleHeuristic<V> backwardHeuristic;
   private final Supplier<AddressableHeap<Double, V>> heapSupplier;

   public BidirectionalAStarShortestPath(Graph<V, E> var1, AStarAdmissibleHeuristic<V> var2) {
      this(var1, var2, PairingHeap::new);
   }

   public BidirectionalAStarShortestPath(Graph<V, E> var1, AStarAdmissibleHeuristic<V> var2, Supplier<AddressableHeap<Double, V>> var3) {
      super(var1);
      this.forwardHeuristic = Objects.requireNonNull(var2, "Heuristic function cannot be null!");
      if (var1.getType().isDirected()) {
         this.backwardHeuristic = new BidirectionalAStarShortestPath.ReversedGraphHeuristic(Objects.requireNonNull(var2, "Heuristic function cannot be null!"));
      } else {
         this.backwardHeuristic = Objects.requireNonNull(var2, "Heuristic function cannot be null!");
      }

      this.heapSupplier = Objects.requireNonNull(var3, "Heap supplier cannot be null!");
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

      BidirectionalAStarShortestPath.AStarSearchFrontier var3 = new BidirectionalAStarShortestPath.AStarSearchFrontier(
         this.graph, (V)var2, this.forwardHeuristic
      );
      BidirectionalAStarShortestPath.AStarSearchFrontier var4;
      if (this.graph.getType().isDirected()) {
         var4 = new BidirectionalAStarShortestPath.AStarSearchFrontier(new EdgeReversedGraph<>(this.graph), (V)var1, this.backwardHeuristic);
      } else {
         var4 = new BidirectionalAStarShortestPath.AStarSearchFrontier(this.graph, (V)var1, this.backwardHeuristic);
      }

      var3.updateDistance((V)var1, null, 0.0, 0.0);
      var4.updateDistance((V)var2, null, 0.0, 0.0);
      double var5 = Double.POSITIVE_INFINITY;
      Object var7 = null;
      BidirectionalAStarShortestPath.AStarSearchFrontier var8 = var3;
      BidirectionalAStarShortestPath.AStarSearchFrontier var9 = var4;
      BidirectionalAStarShortestPath.TerminationCriterion var10;
      if (this.forwardHeuristic.isConsistent(this.graph)) {
         double var11 = var3.heuristic.getCostEstimate((V)var1, (V)var2);
         var10 = new BidirectionalAStarShortestPath.ConsistentTerminationCriterion(var3, var4, var11);
      } else {
         var10 = new BidirectionalAStarShortestPath.InconsistentTerminationCriterion(var3, var4);
      }

      while (!var10.stop(var5)) {
         AddressableHeap.Handle var26 = var8.openList.deleteMin();
         Object var12 = var26.getValue();

         for (Object var14 : var8.graph.outgoingEdgesOf((V)var12)) {
            Object var15 = Graphs.getOppositeVertex(var8.graph, (E)var14, (V)var12);
            if (!var15.equals(var12)) {
               double var16 = var8.graph.getEdgeWeight((E)var14);
               double var18 = var8.getDistance((V)var12);
               double var20 = var18 + var16;
               double var22 = var20 + var8.heuristic.getCostEstimate((V)var15, (V)var8.endVertex);
               var8.updateDistance(var15, (double)var14, var20, var22);
               double var24 = var18 + var16 + var9.getDistance((V)var15);
               if (var24 < var5) {
                  var5 = var24;
                  var7 = var15;
               }
            }
         }

         var8.closedList.add((V)var12);
         if (var8.openList.size() > var9.openList.size()) {
            BidirectionalAStarShortestPath.AStarSearchFrontier var27 = var8;
            var8 = var9;
            var9 = var27;
         }
      }

      return Double.isFinite(var5) ? this.createPath(var3, var4, var5, (V)var1, (V)var7, (V)var2) : this.createEmptyPath((V)var1, (V)var2);
   }

   class AStarSearchFrontier extends BaseBidirectionalShortestPathAlgorithm.BaseSearchFrontier<V, E> {
      final Object endVertex;
      final AStarAdmissibleHeuristic<V> heuristic;
      final AddressableHeap<Double, V> openList;
      final Map<V, AddressableHeap.Handle<Double, V>> vertexToHeapNodeMap;
      final Set<V> closedList;
      final Map<V, Double> gScoreMap;
      final Map<V, E> cameFrom;

      AStarSearchFrontier(Graph<V, E> var2, V var3, AStarAdmissibleHeuristic<V> var4) {
         super(var2);
         this.endVertex = var3;
         this.heuristic = var4;
         this.openList = BidirectionalAStarShortestPath.this.heapSupplier.get();
         this.vertexToHeapNodeMap = new HashMap<>();
         this.closedList = new HashSet();
         this.gScoreMap = new HashMap<>();
         this.cameFrom = (Map<V, E>)(new HashMap<>());
      }

      void updateDistance(V var1, E var2, double var3, double var5) {
         AddressableHeap.Handle var7 = this.vertexToHeapNodeMap.get(var1);
         if (this.vertexToHeapNodeMap.containsKey(var1)) {
            if (var3 >= this.gScoreMap.get(var1)) {
               return;
            }

            this.cameFrom.put((V)var1, (E)var2);
            this.gScoreMap.put((V)var1, var3);
            if (this.closedList.contains(var1)) {
               this.closedList.remove(var1);
               this.openList.insert(var5, (V)var1);
            } else {
               var7.decreaseKey(var5);
            }
         } else {
            this.cameFrom.put((V)var1, (E)var2);
            this.gScoreMap.put((V)var1, var3);
            var7 = this.openList.insert(var5, (V)var1);
            this.vertexToHeapNodeMap.put((V)var1, var7);
         }
      }

      @Override
      double getDistance(V var1) {
         Double var2 = this.gScoreMap.get(var1);
         return var2 == null ? Double.POSITIVE_INFINITY : var2;
      }

      @Override
      E getTreeEdge(V var1) {
         return this.cameFrom.get(var1);
      }
   }

   class ConsistentTerminationCriterion extends BidirectionalAStarShortestPath<V, E>.TerminationCriterion {
      final double sourceTargetEstimate;

      ConsistentTerminationCriterion(
         BidirectionalAStarShortestPath<V, E>.AStarSearchFrontier var2, BidirectionalAStarShortestPath<V, E>.AStarSearchFrontier var3, double var4
      ) {
         super(var2, var3);
         this.sourceTargetEstimate = var4;
      }

      @Override
      boolean stop(double var1) {
         return this.forward.openList.isEmpty()
            || this.backward.openList.isEmpty()
            || this.forward.openList.findMin().getKey() + this.backward.openList.findMin().getKey() >= var1 + this.sourceTargetEstimate;
      }
   }

   class InconsistentTerminationCriterion extends BidirectionalAStarShortestPath<V, E>.TerminationCriterion {
      InconsistentTerminationCriterion(
         BidirectionalAStarShortestPath<V, E>.AStarSearchFrontier var2, BidirectionalAStarShortestPath<V, E>.AStarSearchFrontier var3
      ) {
         super(var2, var3);
      }

      @Override
      boolean stop(double var1) {
         return this.forward.openList.isEmpty()
            || this.backward.openList.isEmpty()
            || Math.max(this.forward.openList.findMin().getKey(), this.backward.openList.findMin().getKey()) >= var1;
      }
   }

   class ReversedGraphHeuristic implements AStarAdmissibleHeuristic<V> {
      private final AStarAdmissibleHeuristic<V> heuristic;

      ReversedGraphHeuristic(AStarAdmissibleHeuristic<V> var2) {
         this.heuristic = var2;
      }

      @Override
      public double getCostEstimate(V var1, V var2) {
         return this.heuristic.getCostEstimate((V)var2, (V)var1);
      }
   }

   abstract class TerminationCriterion {
      final BidirectionalAStarShortestPath<V, E>.AStarSearchFrontier forward;
      final BidirectionalAStarShortestPath<V, E>.AStarSearchFrontier backward;

      TerminationCriterion(BidirectionalAStarShortestPath<V, E>.AStarSearchFrontier var2, BidirectionalAStarShortestPath<V, E>.AStarSearchFrontier var3) {
         this.forward = var2;
         this.backward = var3;
      }

      abstract boolean stop(double var1);
   }
}
