package org.jgrapht.alg.connectivity;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.AsUndirectedGraph;

public class BiconnectivityInspector<V, E> {
   private Graph<V, E> graph;
   private Set<Graph<V, E>> blocks;
   private Set<V> cutpoints;
   private Set<E> bridges;
   private Set<V> connectedSet;
   private Set<Set<V>> connectedSets;
   private Set<Graph<V, E>> connectedComponents;
   private Map<V, Set<Graph<V, E>>> vertex2blocks;
   private Map<V, Graph<V, E>> vertex2components;
   private int time;
   private Deque<E> stack;
   private Map<V, Integer> discTime = new HashMap<>();

   public BiconnectivityInspector(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
      if (var1.getType().isDirected()) {
         this.graph = new AsUndirectedGraph<>(var1);
      }
   }

   public Set<V> getCutpoints() {
      this.performLazyInspection();
      return this.cutpoints;
   }

   public Set<E> getBridges() {
      this.performLazyInspection();
      return this.bridges;
   }

   public Set<Graph<V, E>> getBlocks(V var1) {
      assert this.graph.containsVertex((V)var1);
      if (this.vertex2blocks == null) {
         this.vertex2blocks = new HashMap<>();

         for (Object var3 : this.graph.vertexSet()) {
            this.vertex2blocks.put((V)var3, new LinkedHashSet<>());
         }

         for (Graph var7 : this.getBlocks()) {
            for (Object var5 : var7.vertexSet()) {
               this.vertex2blocks.get(var5).add(var7);
            }
         }
      }

      return this.vertex2blocks.get(var1);
   }

   public Set<Graph<V, E>> getBlocks() {
      this.performLazyInspection();
      return this.blocks;
   }

   public Set<Graph<V, E>> getConnectedComponents() {
      if (this.connectedComponents == null) {
         this.performLazyInspection();
         this.connectedComponents = new LinkedHashSet<>();

         for (Set var2 : this.connectedSets) {
            this.connectedComponents.add(new AsSubgraph<>(this.graph, var2));
         }
      }

      return this.connectedComponents;
   }

   public Graph<V, E> getConnectedComponent(V var1) {
      assert this.graph.containsVertex((V)var1);
      if (this.vertex2components == null) {
         this.vertex2components = new HashMap<>();

         for (Graph var3 : this.getConnectedComponents()) {
            for (Object var5 : var3.vertexSet()) {
               this.vertex2components.put((V)var5, var3);
            }
         }
      }

      return this.vertex2components.get(var1);
   }

   public boolean isBiconnected() {
      this.performLazyInspection();
      return this.graph.vertexSet().size() >= 2 && this.blocks.size() == 1;
   }

   public boolean isConnected() {
      this.performLazyInspection();
      return this.connectedSets.size() == 1;
   }

   private void init() {
      this.blocks = new LinkedHashSet<>();
      this.cutpoints = new LinkedHashSet();
      this.bridges = new LinkedHashSet<>();
      this.connectedSets = new LinkedHashSet<>();
      this.stack = new ArrayDeque<>(this.graph.edgeSet().size());

      for (Object var2 : this.graph.vertexSet()) {
         this.discTime.put((V)var2, -1);
      }
   }

   private void performLazyInspection() {
      if (this.blocks == null) {
         this.init();

         for (Object var2 : this.graph.vertexSet()) {
            if (this.discTime.get(var2) == -1) {
               this.connectedSet = new HashSet();
               this.dfs((V)var2, null);
               if (!this.stack.isEmpty()) {
                  this.buildBlock(0);
               }

               this.connectedSets.add(this.connectedSet);
            }
         }

         if (this.graph.getType().isAllowingMultipleEdges()) {
            Iterator var4 = this.bridges.iterator();

            while (var4.hasNext()) {
               Object var5 = var4.next();
               int var3 = this.graph.getAllEdges(this.graph.getEdgeSource((E)var5), this.graph.getEdgeTarget((E)var5)).size();
               if (var3 > 1) {
                  var4.remove();
               }
            }
         }
      }
   }

   private void buildBlock(int var1) {
      HashSet var2 = new HashSet();

      while (!this.stack.isEmpty()) {
         Object var3 = this.stack.peek();
         Object var4 = this.graph.getEdgeSource((E)var3);
         Object var5 = this.graph.getEdgeTarget((E)var3);
         if (this.discTime.get(var4) < var1 && this.discTime.get(var5) < var1) {
            break;
         }

         this.stack.pop();
         var2.add(var4);
         var2.add(var5);
      }

      this.blocks.add(new AsSubgraph<>(this.graph, var2));
   }

   private int dfs(V var1, V var2) {
      int var3 = ++this.time;
      this.discTime.put((V)var1, this.time);
      this.connectedSet.add((V)var1);
      int var4 = 0;

      for (Object var6 : this.graph.edgesOf((V)var1)) {
         Object var7 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var1);
         if (this.discTime.get(var7) == -1) {
            var4++;
            this.stack.push((E)var6);
            int var8 = this.dfs((V)var7, (V)var1);
            var3 = Math.min(var8, var3);
            if (var8 > this.discTime.get(var1)) {
               this.bridges.add((E)var6);
            }

            if (var2 != null && var8 >= this.discTime.get(var1) || var2 == null && var4 > 1) {
               this.cutpoints.add((V)var1);
               this.buildBlock(this.discTime.get(var7));
            }
         } else if (this.discTime.get(var7) < this.discTime.get(var1) && !var7.equals(var2)) {
            this.stack.push((E)var6);
            var3 = Math.min(this.discTime.get(var7), var3);
         }
      }

      return var3;
   }
}
