package org.jgrapht.alg.cycle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;

public class HawickJamesSimpleCycles<V, E> implements DirectedSimpleCycles<V, E> {
   private Graph<V, E> graph;
   private int nVertices = 0;
   private long nCycles = 0L;
   private List<List<V>> cycles = null;
   private Integer start = 0;
   private List<Integer>[] Ak = null;
   private List<Integer>[] B = null;
   private boolean[] blocked = null;
   private ArrayDeque<Integer> stack = null;
   private V[] iToV = null;
   private Map<V, Integer> vToI = null;
   private int pathLimit = 0;
   private boolean hasLimit = false;
   private Runnable operation;

   public HawickJamesSimpleCycles() {
   }

   public HawickJamesSimpleCycles(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1, "Graph must be directed");
   }

   private void initState() {
      this.nCycles = 0L;
      this.nVertices = this.graph.vertexSet().size();
      this.blocked = new boolean[this.nVertices];
      this.stack = new ArrayDeque<>(this.nVertices);
      this.B = new ArrayList[this.nVertices];

      for (int var1 = 0; var1 < this.nVertices; var1++) {
         this.B[var1] = new ArrayList<>();
      }

      this.iToV = (V[])this.graph.vertexSet().toArray();
      this.vToI = new HashMap<>();

      for (int var2 = 0; var2 < this.iToV.length; var2++) {
         this.vToI.put(this.iToV[var2], var2);
      }

      this.Ak = this.buildAdjacencyList();
      this.stack.clear();
   }

   private List<Integer>[] buildAdjacencyList() {
      ArrayList[] var1 = new ArrayList[this.nVertices];

      for (int var2 = 0; var2 < this.nVertices; var2++) {
         Object var3 = this.iToV[var2];
         List var4 = Graphs.successorListOf(this.graph, (V)var3);
         var1[var2] = new ArrayList(var4.size());

         for (Object var6 : var4) {
            var1[var2].add(this.vToI.get(var6));
         }
      }

      return var1;
   }

   private void clearState() {
      this.Ak = null;
      this.nVertices = 0;
      this.blocked = null;
      this.stack = null;
      this.iToV = null;
      this.vToI = null;
      this.B = null;
      this.operation = () -> {};
   }

   private boolean circuit(Integer var1, int var2) {
      boolean var3 = false;
      this.stack.push(var1);
      this.blocked[var1] = true;

      for (Integer var5 : this.Ak[var1]) {
         if (var5 >= this.start) {
            if (Objects.equals(var5, this.start)) {
               this.operation.run();
               var3 = true;
            } else if (!this.blocked[var5] && (this.limitReached(var2) || this.circuit(var5, var2 + 1))) {
               var3 = true;
            }
         }
      }

      if (var3) {
         this.unblock(var1);
      } else {
         for (Integer var7 : this.Ak[var1]) {
            if (var7 >= this.start && !this.B[var7].contains(var1)) {
               this.B[var7].add(var1);
            }
         }
      }

      this.stack.pop();
      return var3;
   }

   private void unblock(Integer var1) {
      this.blocked[var1] = false;

      for (int var5 = 0; var5 < this.B[var1].size(); var5++) {
         Integer var3 = this.B[var1].get(var5);
         int var4 = this.B[var1].size();
         this.B[var1].removeAll(Collections.singletonList(var3));
         var5 -= var4 - this.B[var1].size();
         if (this.blocked[var3]) {
            this.unblock(var3);
         }
      }
   }

   public Graph<V, E> getGraph() {
      return this.graph;
   }

   public void setGraph(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1, "Graph must be directed");
   }

   @Override
   public List<List<V>> findSimpleCycles() {
      if (this.graph == null) {
         throw new IllegalArgumentException("Null graph.");
      }

      this.initState();
      this.cycles = new ArrayList<>();
      this.operation = () -> {
         List var1x = this.stack.stream().map(var1xx -> this.iToV[var1xx]).collect(Collectors.toList());
         Collections.reverse(var1x);
         this.cycles.add(var1x);
      };
      this.analyzeCircuits();
      List var1 = this.cycles;
      this.clearState();
      return var1;
   }

   public void printSimpleCycles() {
      if (this.graph == null) {
         throw new IllegalArgumentException("Null graph.");
      }

      this.initState();
      this.operation = () -> {
         this.stack.stream().map(var1 -> this.iToV[var1].toString() + " ").forEach(System.out::print);
         System.out.println();
      };
      this.analyzeCircuits();
      this.clearState();
   }

   public long countSimpleCycles() {
      if (this.graph == null) {
         throw new IllegalArgumentException("Null graph.");
      }

      this.initState();
      this.nCycles = 0L;
      this.operation = () -> this.nCycles++;
      this.analyzeCircuits();
      this.clearState();
      return this.nCycles;
   }

   private void analyzeCircuits() {
      for (int var1 = 0; var1 < this.nVertices; var1++) {
         for (int var2 = 0; var2 < this.nVertices; var2++) {
            this.blocked[var2] = false;
            this.B[var2].clear();
         }

         this.start = this.vToI.get(this.iToV[var1]);
         this.circuit(this.start, 0);
      }
   }

   public void setPathLimit(int var1) {
      this.pathLimit = var1 - 1;
      this.hasLimit = true;
   }

   public void clearPathLimit() {
      this.hasLimit = false;
   }

   private boolean limitReached(int var1) {
      return this.hasLimit && var1 >= this.pathLimit;
   }
}
