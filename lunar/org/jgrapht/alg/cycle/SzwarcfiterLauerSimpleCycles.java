package org.jgrapht.alg.cycle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.connectivity.KosarajuStrongConnectivityInspector;

public class SzwarcfiterLauerSimpleCycles<V, E> implements DirectedSimpleCycles<V, E> {
   private Graph<V, E> graph;
   private List<List<V>> cycles = null;
   private V[] iToV = null;
   private Map<V, Integer> vToI = null;
   private Map<V, Set<V>> bSets = null;
   private ArrayDeque<V> stack = null;
   private Set<V> marked = null;
   private Map<V, Set<V>> removed = null;
   private int[] position = null;
   private boolean[] reach = null;
   private List<V> startVertices = null;

   public SzwarcfiterLauerSimpleCycles() {
   }

   public SzwarcfiterLauerSimpleCycles(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1, "Graph must be directed");
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
      KosarajuStrongConnectivityInspector var1 = new KosarajuStrongConnectivityInspector<>(this.graph);

      for (Set var4 : var1.stronglyConnectedSets()) {
         int var5 = -1;
         Object var6 = null;

         for (Object var8 : var4) {
            int var9 = this.graph.inDegreeOf((V)var8);
            if (var9 > var5) {
               var5 = var9;
               var6 = var8;
            }
         }

         this.startVertices.add((V)var6);
      }

      for (Object var12 : this.startVertices) {
         this.cycle(this.toI((V)var12), 0);
      }

      List var11 = this.cycles;
      this.clearState();
      return var11;
   }

   private boolean cycle(int var1, int var2) {
      boolean var3 = false;
      Object var4 = this.toV(var1);
      this.marked.add((V)var4);
      this.stack.push((V)var4);
      int var5 = this.stack.size();
      this.position[var1] = var5;
      if (!this.reach[var1]) {
         var2 = var5;
      }

      Set var6 = this.getRemoved((V)var4);

      for (Object var9 : this.graph.outgoingEdgesOf((V)var4)) {
         Object var10 = this.graph.getEdgeTarget((E)var9);
         if (!var6.contains(var10)) {
            int var11 = this.toI((V)var10);
            if (!this.marked.contains(var10)) {
               boolean var15 = this.cycle(var11, var2);
               if (var15) {
                  var3 = true;
               } else {
                  this.noCycle(var1, var11);
               }
            } else if (this.position[var11] > var2) {
               this.noCycle(var1, var11);
            } else {
               var3 = true;
               ArrayList var12 = new ArrayList();
               Iterator var13 = this.stack.descendingIterator();

               while (var13.hasNext()) {
                  Object var14 = var13.next();
                  if (var10.equals(var14)) {
                     break;
                  }
               }

               var12.add(var10);

               while (true) {
                  if (var13.hasNext()) {
                     Object var16 = var13.next();
                     var12.add(var16);
                     if (!var16.equals(var4)) {
                        continue;
                     }
                  }

                  this.cycles.add(var12);
                  break;
               }
            }
         }
      }

      this.stack.pop();
      if (var3) {
         this.unmark(var1);
      }

      this.reach[var1] = true;
      this.position[var1] = this.graph.vertexSet().size();
      return var3;
   }

   private void noCycle(int var1, int var2) {
      Object var3 = this.toV(var1);
      Object var4 = this.toV(var2);
      Set var5 = this.getBSet((V)var4);
      Set var6 = this.getRemoved((V)var3);
      var5.add(var3);
      var6.add(var4);
   }

   private void unmark(int var1) {
      Object var2 = this.toV(var1);
      this.marked.remove(var2);
      Set var3 = this.getBSet((V)var2);

      for (Object var5 : var3) {
         Set var6 = this.getRemoved((V)var5);
         var6.remove(var2);
         if (this.marked.contains(var5)) {
            this.unmark(this.toI((V)var5));
         }
      }

      var3.clear();
   }

   private void initState() {
      this.cycles = new ArrayList<>();
      this.iToV = (V[])this.graph.vertexSet().toArray();
      this.vToI = new HashMap<>();
      this.bSets = new HashMap<>();
      this.stack = new ArrayDeque();
      this.marked = new HashSet();
      this.removed = new HashMap<>();
      int var1 = this.graph.vertexSet().size();
      this.position = new int[var1];
      this.reach = new boolean[var1];
      this.startVertices = new ArrayList();

      for (int var2 = 0; var2 < this.iToV.length; var2++) {
         this.vToI.put(this.iToV[var2], var2);
      }
   }

   private void clearState() {
      this.cycles = null;
      this.iToV = null;
      this.vToI = null;
      this.bSets = null;
      this.stack = null;
      this.marked = null;
      this.removed = null;
      this.position = null;
      this.reach = null;
      this.startVertices = null;
   }

   private Integer toI(V var1) {
      return this.vToI.get(var1);
   }

   private V toV(int var1) {
      return this.iToV[var1];
   }

   private Set<V> getBSet(V var1) {
      return this.bSets.computeIfAbsent((V)var1, var0 -> new HashSet());
   }

   private Set<V> getRemoved(V var1) {
      return this.removed.computeIfAbsent((V)var1, var0 -> new HashSet());
   }
}
