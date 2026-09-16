package org.jgrapht.alg.flow.mincost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MinimumCostFlowAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.util.CollectionUtil;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class CapacityScalingMinimumCostFlow<V, E> implements MinimumCostFlowAlgorithm<V, E> {
   public static final int CAP_INF = 1000000000;
   public static final double COST_INF = 1.0E9;
   public static final int DEFAULT_SCALING_FACTOR = 8;
   private static final boolean DEBUG = false;
   private final int scalingFactor;
   private int n;
   private int m;
   private int counter = 1;
   private MinimumCostFlowProblem<V, E> problem;
   private MinimumCostFlowAlgorithm.MinimumCostFlow<E> minimumCostFlow;
   private CapacityScalingMinimumCostFlow.Node[] nodes;
   private CapacityScalingMinimumCostFlow.Arc[] arcs;
   private List<V> graphVertices;
   private List<E> graphEdges;

   public CapacityScalingMinimumCostFlow() {
      this(8);
   }

   public CapacityScalingMinimumCostFlow(int var1) {
      this.scalingFactor = var1;
      CapacityScalingMinimumCostFlow.Node.ID = 0;
   }

   @Override
   public Map<E, Double> getFlowMap() {
      return this.minimumCostFlow == null ? null : this.minimumCostFlow.getFlowMap();
   }

   @Override
   public V getFlowDirection(E var1) {
      return this.problem.getGraph().getEdgeTarget((E)var1);
   }

   @Override
   public MinimumCostFlowAlgorithm.MinimumCostFlow<E> getMinimumCostFlow(MinimumCostFlowProblem<V, E> var1) {
      this.problem = Objects.requireNonNull(var1);
      if (this.problem.getGraph().getType().isUndirected()) {
         throw new IllegalArgumentException("The algorithm doesn't support undirected flow networks");
      }

      this.n = this.problem.getGraph().vertexSet().size();
      this.m = this.problem.getGraph().edgeSet().size();
      this.calculateMinimumCostFlow();
      return this.minimumCostFlow;
   }

   public Map<V, Double> getDualSolution() {
      if (this.minimumCostFlow == null) {
         return null;
      }

      HashMap var1 = new HashMap();

      for (int var2 = 0; var2 < this.n; var2++) {
         var1.put(this.graphVertices.get(var2), this.nodes[var2].potential);
      }

      return var1;
   }

   private void calculateMinimumCostFlow() {
      this.init();
      if (this.scalingFactor > 1) {
         int var1 = this.getU();
         int var2 = this.scalingFactor;

         while (var1 >= var2) {
            var2 *= this.scalingFactor;
         }

         for (int var5 = var2 / this.scalingFactor; var5 >= 1; var5 /= this.scalingFactor) {
            Pair var3 = this.scale(var5);
            this.pushAllFlow((List<CapacityScalingMinimumCostFlow.Node>)var3.getFirst(), (Set<CapacityScalingMinimumCostFlow.Node>)var3.getSecond(), var5);
         }
      } else {
         Pair var4 = this.scale(1);
         this.pushAllFlow((List<CapacityScalingMinimumCostFlow.Node>)var4.getFirst(), (Set<CapacityScalingMinimumCostFlow.Node>)var4.getSecond(), 1);
      }

      this.minimumCostFlow = this.finish();
   }

   private void init() {
      int var1 = 0;
      this.nodes = new CapacityScalingMinimumCostFlow.Node[this.n + 1];
      this.nodes[this.n] = new CapacityScalingMinimumCostFlow.Node(0);
      this.arcs = new CapacityScalingMinimumCostFlow.Arc[this.m];
      this.graphEdges = new ArrayList<>(this.m);
      this.graphVertices = new ArrayList(this.n);
      HashMap var2 = CollectionUtil.newHashMapWithExpectedSize(this.n);
      Graph var3 = this.problem.getGraph();
      int var4 = 0;

      for (Object var6 : var3.vertexSet()) {
         this.graphVertices.add((V)var6);
         int var7 = this.problem.getNodeSupply().apply((V)var6);
         var1 += var7;
         this.nodes[var4] = new CapacityScalingMinimumCostFlow.Node(var7);
         var2.put(var6, this.nodes[var4]);
         this.nodes[var4].addArcTo(this.nodes[this.n], 1000000000, 1.0E9);
         this.nodes[this.n].addArcTo(this.nodes[var4], 1000000000, 1.0E9);
         var4++;
      }

      if (Math.abs(var1) > 0) {
         throw new IllegalArgumentException("Total node supply isn't equal to 0");
      }

      var4 = 0;

      for (Object var16 : var3.edgeSet()) {
         this.graphEdges.add((E)var16);
         CapacityScalingMinimumCostFlow.Node var17 = (CapacityScalingMinimumCostFlow.Node)var2.get(var3.getEdgeSource(var16));
         CapacityScalingMinimumCostFlow.Node var8 = (CapacityScalingMinimumCostFlow.Node)var2.get(var3.getEdgeTarget(var16));
         int var9 = this.problem.getArcCapacityUpperBounds().apply((E)var16);
         int var10 = this.problem.getArcCapacityLowerBounds().apply((E)var16);
         double var11 = var3.getEdgeWeight(var16);
         if (var9 < 0) {
            throw new IllegalArgumentException("Negative edge capacities are not allowed");
         }

         if (var10 > var9) {
            throw new IllegalArgumentException("Lower edge capacity must not exceed upper edge capacity");
         }

         if (var10 >= 1000000000) {
            throw new IllegalArgumentException("The problem is unbounded due to the infinite lower capacity");
         }

         if (var9 >= 1000000000 && var11 < 0.0) {
            throw new IllegalArgumentException("The algorithm doesn't support infinite capacity arcs with negative cost");
         }

         if (Math.abs(var11) >= 1.0E9) {
            throw new IllegalArgumentException("Specified flow network contains an edge of infinite cost");
         }

         if (var17 == var8) {
            throw new IllegalArgumentException("Self-loops aren't allowed");
         }

         var17.excess -= var10;
         var8.excess += var10;
         if (var11 < 0.0) {
            var17.excess -= var9 - var10;
            var8.excess += var9 - var10;
            CapacityScalingMinimumCostFlow.Node var13 = var17;
            var17 = var8;
            var8 = var13;
            var11 *= -1.0;
         }

         this.arcs[var4] = var17.addArcTo(var8, var9 - var10, var11);
         var4++;
      }
   }

   private int getU() {
      int var1 = 0;

      for (CapacityScalingMinimumCostFlow.Node var5 : this.nodes) {
         var1 = Math.max(var1, Math.abs(var5.excess));
      }

      for (CapacityScalingMinimumCostFlow.Arc var9 : this.arcs) {
         if (!var9.isInfiniteCapacityArc()) {
            var1 = Math.max(var1, var9.residualCapacity);
         }
      }

      return var1;
   }

   private Pair<List<CapacityScalingMinimumCostFlow.Node>, Set<CapacityScalingMinimumCostFlow.Node>> scale(int var1) {
      for (CapacityScalingMinimumCostFlow.Node var5 : this.nodes) {
         CapacityScalingMinimumCostFlow.Arc var6 = var5.firstNonSaturated;

         for (CapacityScalingMinimumCostFlow.Arc var7 = var6; var7 != null; var7 = var6) {
            var6 = var6.next;
            int var8 = var7.residualCapacity;
            if (var7.residualCapacity >= var1 && var7.getReducedCost() < 0.0) {
               var7.sendFlow(var8);
               var7.head.excess += var8;
               var7.revArc.head.excess -= var8;
            }
         }
      }

      ArrayList var9 = new ArrayList();
      HashSet var10 = new HashSet();

      for (CapacityScalingMinimumCostFlow.Node var14 : this.nodes) {
         if (var14.excess >= var1) {
            var9.add(var14);
         } else if (var14.excess <= -var1) {
            var10.add(var14);
         }
      }

      return new Pair<>(var9, var10);
   }

   private void pushAllFlow(List<CapacityScalingMinimumCostFlow.Node> var1, Set<CapacityScalingMinimumCostFlow.Node> var2, int var3) {
      for (CapacityScalingMinimumCostFlow.Node var5 : var1) {
         while (var5.excess >= var3) {
            if (var2.isEmpty()) {
               return;
            }

            this.pushDijkstra(var5, var2, var3);
         }
      }
   }

   private void pushDijkstra(CapacityScalingMinimumCostFlow.Node var1, Set<CapacityScalingMinimumCostFlow.Node> var2, int var3) {
      int var4 = this.counter++;
      int var5 = this.counter++;
      PairingHeap var7 = new PairingHeap();
      LinkedList var8 = new LinkedList();
      var1.parentArc = null;
      var1.handle = var7.insert(0.0, var1);

      while (!var7.isEmpty()) {
         AddressableHeap.Handle var6 = var7.deleteMin();
         double var9 = (Double)var6.getKey();
         CapacityScalingMinimumCostFlow.Node var11 = (CapacityScalingMinimumCostFlow.Node)var6.getValue();
         if (var2.contains(var11)) {
            this.augmentPath(var1, var11);
            if (var11.excess > -var3) {
               var2.remove(var11);
            }

            for (CapacityScalingMinimumCostFlow.Node var15 : var8) {
               var15.potential += var9;
            }

            return;
         }

         var11.labelType = var5;
         var8.add(var11);

         for (CapacityScalingMinimumCostFlow.Arc var12 = var11.firstNonSaturated; var12 != null; var12 = var12.next) {
            if (var12.residualCapacity >= var3) {
               CapacityScalingMinimumCostFlow.Node var13 = var12.head;
               if (var13.labelType != var5) {
                  if (var13.labelType == var4) {
                     if (var9 + var12.getReducedCost() < var13.handle.getKey()) {
                        var13.handle.decreaseKey(var9 + var12.getReducedCost());
                        var13.parentArc = var12;
                     }
                  } else {
                     var13.labelType = var4;
                     var13.handle = var7.insert(var9 + var12.getReducedCost(), var13);
                     var13.parentArc = var12;
                  }
               }
            }
         }

         var11.potential -= var9;
      }
   }

   private void augmentPath(CapacityScalingMinimumCostFlow.Node var1, CapacityScalingMinimumCostFlow.Node var2) {
      int var3 = Math.min(var1.excess, -var2.excess);

      for (CapacityScalingMinimumCostFlow.Arc var4 = var2.parentArc; var4 != null; var4 = var4.revArc.head.parentArc) {
         var3 = Math.min(var3, var4.residualCapacity);
      }

      var2.excess += var3;

      for (CapacityScalingMinimumCostFlow.Arc var5 = var2.parentArc; var5 != null; var5 = var5.revArc.head.parentArc) {
         var5.sendFlow(var3);
      }

      var1.excess -= var3;
   }

   private MinimumCostFlowAlgorithm.MinimumCostFlow<E> finish() {
      HashMap var1 = CollectionUtil.newHashMapWithExpectedSize(this.m);
      double var2 = 0.0;

      for (CapacityScalingMinimumCostFlow.Arc var4 = this.nodes[this.n].firstNonSaturated; var4 != null; var4 = var4.next) {
         if (var4.revArc.residualCapacity > 0) {
            throw new IllegalArgumentException("Specified flow network problem has no feasible solution");
         }
      }

      for (int var9 = 0; var9 < this.m; var9++) {
         Object var5 = this.graphEdges.get(var9);
         CapacityScalingMinimumCostFlow.Arc var6 = this.arcs[var9];
         double var7 = var6.revArc.residualCapacity;
         if (this.problem.getGraph().getEdgeWeight((E)var5) < 0.0) {
            var7 = this.problem.getArcCapacityUpperBounds().apply((E)var5) - this.problem.getArcCapacityLowerBounds().apply((E)var5) - var7;
         }

         var7 += this.problem.getArcCapacityLowerBounds().apply((E)var5).intValue();
         var1.put(var5, var7);
         var2 += var7 * this.problem.getGraph().getEdgeWeight((E)var5);
      }

      return new MinimumCostFlowAlgorithm.MinimumCostFlowImpl<>(var2, var1);
   }

   public boolean testOptimality(double var1) {
      if (this.minimumCostFlow == null) {
         throw new RuntimeException("Cannot return a dual solution before getMinimumCostFlow(MinimumCostFlowProblem minimumCostFlowProblem) is invoked!");
      }

      for (CapacityScalingMinimumCostFlow.Node var6 : this.nodes) {
         for (CapacityScalingMinimumCostFlow.Arc var7 = var6.firstNonSaturated; var7 != null; var7 = var7.next) {
            if (var7.getReducedCost() < -var1) {
               return false;
            }
         }
      }

      return true;
   }

   private static class Arc {
      final CapacityScalingMinimumCostFlow.Node head;
      final double cost;
      CapacityScalingMinimumCostFlow.Arc revArc;
      CapacityScalingMinimumCostFlow.Arc prev;
      CapacityScalingMinimumCostFlow.Arc next;
      int residualCapacity;

      Arc(CapacityScalingMinimumCostFlow.Node var1, int var2, double var3) {
         this.head = var1;
         this.cost = var3;
         this.residualCapacity = var2;
      }

      double getReducedCost() {
         return this.cost + this.head.potential - this.revArc.head.potential;
      }

      void sendFlow(int var1) {
         this.decreaseResidualCapacity(var1);
         this.revArc.increaseResidualCapacity(var1);
      }

      private void decreaseResidualCapacity(int var1) {
         if (this.residualCapacity < 1000000000) {
            this.residualCapacity -= var1;
            if (this.residualCapacity == 0) {
               CapacityScalingMinimumCostFlow.Node var2 = this.revArc.head;
               if (this.next != null) {
                  this.next.prev = this.prev;
               }

               if (this.prev != null) {
                  this.prev.next = this.next;
               } else {
                  var2.firstNonSaturated = this.next;
               }

               this.next = var2.firstSaturated;
               if (var2.firstSaturated != null) {
                  var2.firstSaturated.prev = this;
               }

               var2.firstSaturated = this;
               this.prev = null;
            }
         }
      }

      private void increaseResidualCapacity(int var1) {
         if (this.residualCapacity < 1000000000) {
            if (this.residualCapacity == 0) {
               CapacityScalingMinimumCostFlow.Node var2 = this.revArc.head;
               if (this.next != null) {
                  this.next.prev = this.prev;
               }

               if (this.prev != null) {
                  this.prev.next = this.next;
               } else {
                  var2.firstSaturated = this.next;
               }

               this.next = var2.firstNonSaturated;
               if (var2.firstNonSaturated != null) {
                  var2.firstNonSaturated.prev = this;
               }

               var2.firstNonSaturated = this;
               this.prev = null;
            }

            this.residualCapacity += var1;
         }
      }

      public boolean isInfiniteCapacityArc() {
         return this.residualCapacity >= 1000000000;
      }

      @Override
      public String toString() {
         return String.format(
            "(%d, %d), residual capacity = %s, reduced cost = %.1f, cost = %.1f",
            this.revArc.head.id,
            this.head.id,
            this.residualCapacity >= 1000000000 ? "INF" : String.valueOf(this.residualCapacity),
            this.getReducedCost(),
            this.cost
         );
      }
   }

   private static class Node {
      private static int ID = 0;
      AddressableHeap.Handle<Double, CapacityScalingMinimumCostFlow.Node> handle;
      CapacityScalingMinimumCostFlow.Arc parentArc;
      int labelType;
      int excess;
      double potential;
      CapacityScalingMinimumCostFlow.Arc firstSaturated;
      CapacityScalingMinimumCostFlow.Arc firstNonSaturated;
      private int id = ID++;

      public Node(int var1) {
         this.excess = var1;
      }

      CapacityScalingMinimumCostFlow.Arc addArcTo(CapacityScalingMinimumCostFlow.Node var1, int var2, double var3) {
         CapacityScalingMinimumCostFlow.Arc var5 = new CapacityScalingMinimumCostFlow.Arc(var1, var2, var3);
         if (var2 > 0) {
            if (this.firstNonSaturated != null) {
               this.firstNonSaturated.prev = var5;
            }

            var5.next = this.firstNonSaturated;
            this.firstNonSaturated = var5;
         } else {
            if (this.firstSaturated != null) {
               this.firstSaturated.prev = var5;
            }

            var5.next = this.firstSaturated;
            this.firstSaturated = var5;
         }

         CapacityScalingMinimumCostFlow.Arc var6 = new CapacityScalingMinimumCostFlow.Arc(this, 0, -var3);
         if (var1.firstSaturated != null) {
            var1.firstSaturated.prev = var6;
         }

         var6.next = var1.firstSaturated;
         var1.firstSaturated = var6;
         var5.revArc = var6;
         var6.revArc = var5;
         return var5;
      }

      @Override
      public String toString() {
         return String.format("Id = %d, excess = %d, potential = %.1f", this.id, this.excess, this.potential);
      }
   }
}
