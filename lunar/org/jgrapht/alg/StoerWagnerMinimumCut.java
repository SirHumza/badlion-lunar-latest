package org.jgrapht.alg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

public class StoerWagnerMinimumCut<V, E> {
   final Graph<Set<V>, DefaultWeightedEdge> workingGraph;
   protected double bestCutWeight = Double.POSITIVE_INFINITY;
   protected Set<V> bestCut;

   public StoerWagnerMinimumCut(Graph<V, E> var1) {
      GraphTests.requireUndirected(var1, "Graph must be undirected");
      if (var1.vertexSet().size() < 2) {
         throw new IllegalArgumentException("Graph has less than 2 vertices");
      }

      this.workingGraph = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
      HashMap var2 = new HashMap();

      for (Object var4 : var1.vertexSet()) {
         HashSet var5 = new HashSet();
         var5.add(var4);
         var2.put(var4, var5);
         this.workingGraph.addVertex(var5);
      }

      for (Object var12 : var1.edgeSet()) {
         if (var1.getEdgeWeight(var12) < 0.0) {
            throw new IllegalArgumentException("Negative edge weights not allowed");
         }

         Object var13 = var1.getEdgeSource(var12);
         Set var6 = (Set)var2.get(var13);
         Object var7 = var1.getEdgeTarget(var12);
         Set var8 = (Set)var2.get(var7);
         DefaultWeightedEdge var9 = this.workingGraph.getEdge(var6, var8);
         if (var9 == null) {
            var9 = this.workingGraph.addEdge(var6, var8);
            this.workingGraph.setEdgeWeight(var9, var1.getEdgeWeight(var12));
         } else {
            this.workingGraph.setEdgeWeight(var9, this.workingGraph.getEdgeWeight(var9) + var1.getEdgeWeight(var12));
         }
      }

      Set var11 = this.workingGraph.vertexSet().iterator().next();

      while (this.workingGraph.vertexSet().size() > 1) {
         this.minimumCutPhase(var11);
      }
   }

   protected void minimumCutPhase(Set<V> var1) {
      Set var2 = var1;
      Set var3 = null;
      PriorityQueue var4 = new PriorityQueue();
      HashMap var5 = new HashMap();

      for (Set var7 : this.workingGraph.vertexSet()) {
         if (var7 != var1) {
            DefaultWeightedEdge var8 = this.workingGraph.getEdge(var7, var1);
            Double var9 = var8 == null ? 0.0 : this.workingGraph.getEdgeWeight(var8);
            StoerWagnerMinimumCut.VertexAndWeight var10 = new StoerWagnerMinimumCut.VertexAndWeight(var7, var9, var8 != null);
            var4.add(var10);
            var5.put(var7, var10);
         }
      }

      while (!var4.isEmpty()) {
         Set var12 = ((StoerWagnerMinimumCut.VertexAndWeight)var4.poll()).vertex;
         var5.remove(var12);
         var3 = var2;
         var2 = var12;

         for (DefaultWeightedEdge var15 : this.workingGraph.edgesOf(var12)) {
            Set var16 = Graphs.getOppositeVertex(this.workingGraph, var15, var12);
            StoerWagnerMinimumCut.VertexAndWeight var17 = (StoerWagnerMinimumCut.VertexAndWeight)var5.get(var16);
            if (var17 != null) {
               var4.remove(var17);
               var17.active = true;
               StoerWagnerMinimumCut.VertexAndWeight var11 = var17;
               var11.weight = var11.weight + this.workingGraph.getEdgeWeight(var15);
               var4.add(var17);
            }
         }
      }

      double var13 = this.vertexWeight(var2);
      if (var13 < this.bestCutWeight) {
         this.bestCutWeight = var13;
         this.bestCut = var2;
      }

      this.mergeVertices(var3, var2);
   }

   public double minCutWeight() {
      return this.bestCutWeight;
   }

   public Set<V> minCut() {
      return this.bestCut;
   }

   protected StoerWagnerMinimumCut<V, E>.VertexAndWeight mergeVertices(Set<V> var1, Set<V> var2) {
      HashSet var3 = new HashSet();
      var3.addAll(var1);
      var3.addAll(var2);
      this.workingGraph.addVertex(var3);
      double var4 = 0.0;

      for (Set var7 : this.workingGraph.vertexSet()) {
         if (var1 != var7 && var2 != var7) {
            double var8 = 0.0;
            DefaultWeightedEdge var10 = this.workingGraph.getEdge(var2, var7);
            DefaultWeightedEdge var11 = this.workingGraph.getEdge(var1, var7);
            if (var10 != null) {
               var8 += this.workingGraph.getEdgeWeight((E)var10);
            }

            if (var11 != null) {
               var8 += this.workingGraph.getEdgeWeight((E)var11);
            }

            if (var10 != null || var11 != null) {
               var4 += var8;
               this.workingGraph.setEdgeWeight(this.workingGraph.addEdge(var3, var7), var8);
            }
         }
      }

      this.workingGraph.removeVertex(var2);
      this.workingGraph.removeVertex(var1);
      return new StoerWagnerMinimumCut.VertexAndWeight(var3, var4, false);
   }

   public double vertexWeight(Set<V> var1) {
      double var2 = 0.0;

      for (DefaultWeightedEdge var5 : this.workingGraph.edgesOf(var1)) {
         var2 += this.workingGraph.getEdgeWeight(var5);
      }

      return var2;
   }

   protected class VertexAndWeight implements Comparable<StoerWagnerMinimumCut<V, E>.VertexAndWeight> {
      public Set<V> vertex;
      public Double weight;
      public boolean active;

      public VertexAndWeight(Set<V> var2, double var3, boolean var5) {
         this.vertex = var2;
         this.weight = var3;
         this.active = var5;
      }

      public int compareTo(StoerWagnerMinimumCut<V, E>.VertexAndWeight var1) {
         if (this.active && var1.active) {
            return -Double.compare(this.weight, var1.weight);
         } else if (this.active && !var1.active) {
            return -1;
         } else {
            return !this.active && var1.active ? 1 : 0;
         }
      }

      @Override
      public String toString() {
         return "(" + this.vertex + ", " + this.weight + ")";
      }
   }
}
