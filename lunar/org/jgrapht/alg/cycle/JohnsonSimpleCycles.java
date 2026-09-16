package org.jgrapht.alg.cycle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.builder.GraphTypeBuilder;

public class JohnsonSimpleCycles<V, E> implements DirectedSimpleCycles<V, E> {
   private Graph<V, E> graph;
   private List<List<V>> cycles = null;
   private V[] iToV = null;
   private Map<V, Integer> vToI = null;
   private Set<V> blocked = null;
   private Map<V, Set<V>> bSets = null;
   private ArrayDeque<V> stack = null;
   private List<Set<V>> SCCs = null;
   private int index = 0;
   private Map<V, Integer> vIndex = null;
   private Map<V, Integer> vLowlink = null;
   private ArrayDeque<V> path = null;
   private Set<V> pathSet = null;

   public JohnsonSimpleCycles(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1, "Graph must be directed");
      if (GraphTests.hasMultipleEdges(var1)) {
         throw new IllegalArgumentException("Graph should not have multiple (parallel) edges");
      }
   }

   @Override
   public List<List<V>> findSimpleCycles() {
      if (this.graph == null) {
         throw new IllegalArgumentException("Null graph.");
      }

      this.initState();
      int var9 = 0;

      for (int var2 = this.graph.vertexSet().size(); var9 < var2; var9++) {
         Pair var3 = this.findMinSCSG(var9);
         if (var3 == null) {
            break;
         }

         var9 = (Integer)var3.getSecond();
         Graph var4 = (Graph)var3.getFirst();
         Object var5 = this.toV(var9);

         for (Object var7 : var4.outgoingEdgesOf(var5)) {
            Object var8 = this.graph.getEdgeTarget((E)var7);
            this.blocked.remove(var8);
            this.getBSet((V)var8).clear();
         }

         this.findCyclesInSCG(var9, var9, var4);
      }

      List var10 = this.cycles;
      this.clearState();
      return var10;
   }

   private Pair<Graph<V, E>, Integer> findMinSCSG(int var1) {
      this.initMinSCGState();
      List var2 = this.findSCCS(var1);
      int var3 = Integer.MAX_VALUE;
      Set var4 = null;

      for (Set var6 : var2) {
         for (Object var8 : var6) {
            int var9 = this.toI((V)var8);
            if (var9 < var3) {
               var3 = var9;
               var4 = var6;
            }
         }
      }

      if (var4 == null) {
         return null;
      }

      Graph var11 = GraphTypeBuilder.<V, E>directed()
         .edgeSupplier(this.graph.getEdgeSupplier())
         .vertexSupplier(this.graph.getVertexSupplier())
         .allowingMultipleEdges(false)
         .allowingSelfLoops(true)
         .buildGraph();

      for (Object var15 : var4) {
         var11.addVertex(var15);
      }

      for (Object var16 : var4) {
         for (Object var18 : var4) {
            Object var10 = this.graph.getEdge((V)var16, (V)var18);
            if (var10 != null) {
               var11.addEdge(var16, var18, var10);
            }
         }
      }

      Pair var14 = Pair.of(var11, var3);
      this.clearMinSCCState();
      return var14;
   }

   private List<Set<V>> findSCCS(int var1) {
      for (Object var3 : this.graph.vertexSet()) {
         int var4 = this.toI((V)var3);
         if (var4 >= var1 && !this.vIndex.containsKey(var3)) {
            this.getSCCs(var1, var4);
         }
      }

      List var5 = this.SCCs;
      this.SCCs = null;
      return var5;
   }

   private void getSCCs(int var1, int var2) {
      Object var3 = this.toV(var2);
      this.vIndex.put((V)var3, this.index);
      this.vLowlink.put((V)var3, this.index);
      this.index++;
      this.path.push((V)var3);
      this.pathSet.add((V)var3);

      for (Object var6 : this.graph.outgoingEdgesOf((V)var3)) {
         Object var7 = this.graph.getEdgeTarget((E)var6);
         int var8 = this.toI((V)var7);
         if (var8 >= var1) {
            if (!this.vIndex.containsKey(var7)) {
               this.getSCCs(var1, var8);
               this.vLowlink.put((V)var3, Math.min(this.vLowlink.get(var3), this.vLowlink.get(var7)));
            } else if (this.pathSet.contains(var7)) {
               this.vLowlink.put((V)var3, Math.min(this.vLowlink.get(var3), this.vIndex.get(var7)));
            }
         }
      }

      if (this.vLowlink.get(var3).equals(this.vIndex.get(var3))) {
         HashSet var9 = new HashSet();

         Object var10;
         do {
            var10 = this.path.pop();
            this.pathSet.remove(var10);
            var9.add(var10);
         } while (!var3.equals(var10));

         if (var9.size() == 1) {
            Object var11 = var9.iterator().next();
            if (this.graph.containsEdge((V)var3, (V)var11)) {
               this.SCCs.add(var9);
            }
         } else {
            this.SCCs.add(var9);
         }
      }
   }

   private boolean findCyclesInSCG(int var1, int var2, Graph<V, E> var3) {
      boolean var4 = false;
      Object var5 = this.toV(var2);
      this.stack.push((V)var5);
      this.blocked.add((V)var5);

      for (Object var7 : var3.outgoingEdgesOf(var5)) {
         Object var8 = var3.getEdgeTarget(var7);
         int var9 = this.toI((V)var8);
         if (var9 == var1) {
            ArrayList var15 = new ArrayList(this.stack.size());
            this.stack.descendingIterator().forEachRemaining(var15::add);
            this.cycles.add(var15);
            var4 = true;
         } else if (!this.blocked.contains(var8)) {
            boolean var10 = this.findCyclesInSCG(var1, var9, var3);
            var4 = var4 || var10;
         }
      }

      if (var4) {
         this.unblock((V)var5);
      } else {
         for (Object var12 : var3.outgoingEdgesOf(var5)) {
            Object var13 = var3.getEdgeTarget(var12);
            Set var14 = this.getBSet((V)var13);
            var14.add(var5);
         }
      }

      this.stack.pop();
      return var4;
   }

   private void unblock(V var1) {
      this.blocked.remove(var1);
      Set var2 = this.getBSet((V)var1);

      while (var2.size() > 0) {
         Object var3 = var2.iterator().next();
         var2.remove(var3);
         if (this.blocked.contains(var3)) {
            this.unblock((V)var3);
         }
      }
   }

   private void initState() {
      this.cycles = new LinkedList<>();
      this.iToV = (V[])this.graph.vertexSet().toArray();
      this.vToI = new HashMap<>();
      this.blocked = new HashSet();
      this.bSets = new HashMap<>();
      this.stack = new ArrayDeque();

      for (int var1 = 0; var1 < this.iToV.length; var1++) {
         this.vToI.put(this.iToV[var1], var1);
      }
   }

   private void clearState() {
      this.cycles = null;
      this.iToV = null;
      this.vToI = null;
      this.blocked = null;
      this.bSets = null;
      this.stack = null;
   }

   private void initMinSCGState() {
      this.index = 0;
      this.SCCs = new ArrayList<>();
      this.vIndex = new HashMap<>();
      this.vLowlink = new HashMap<>();
      this.path = new ArrayDeque();
      this.pathSet = new HashSet();
   }

   private void clearMinSCCState() {
      this.index = 0;
      this.SCCs = null;
      this.vIndex = null;
      this.vLowlink = null;
      this.path = null;
      this.pathSet = null;
   }

   private Integer toI(V var1) {
      return this.vToI.get(var1);
   }

   private V toV(Integer var1) {
      return this.iToV[var1];
   }

   private Set<V> getBSet(V var1) {
      return this.bSets.computeIfAbsent((V)var1, var0 -> new HashSet());
   }
}
