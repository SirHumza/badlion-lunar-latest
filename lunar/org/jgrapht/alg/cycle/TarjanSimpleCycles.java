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

public class TarjanSimpleCycles<V, E> implements DirectedSimpleCycles<V, E> {
   private Graph<V, E> graph;
   private List<List<V>> cycles;
   private Set<V> marked;
   private ArrayDeque<V> markedStack;
   private ArrayDeque<V> pointStack;
   private Map<V, Integer> vToI;
   private Map<V, Set<V>> removed;

   public TarjanSimpleCycles() {
   }

   public TarjanSimpleCycles(Graph<V, E> var1) {
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

      for (Object var2 : this.graph.vertexSet()) {
         this.backtrack((V)var2, (V)var2);

         while (!this.markedStack.isEmpty()) {
            this.marked.remove(this.markedStack.pop());
         }
      }

      List var3 = this.cycles;
      this.clearState();
      return var3;
   }

   private boolean backtrack(V var1, V var2) {
      boolean var3 = false;
      this.pointStack.push((V)var2);
      this.marked.add((V)var2);
      this.markedStack.push((V)var2);

      for (Object var5 : this.graph.outgoingEdgesOf((V)var2)) {
         Object var6 = this.graph.getEdgeTarget((E)var5);
         if (!this.getRemoved((V)var2).contains(var6)) {
            int var7 = this.toI((V)var6).compareTo(this.toI((V)var1));
            if (var7 < 0) {
               this.getRemoved((V)var2).add((V)var6);
            } else if (var7 == 0) {
               var3 = true;
               ArrayList var11 = new ArrayList();
               Iterator var9 = this.pointStack.descendingIterator();

               while (var9.hasNext()) {
                  Object var10 = var9.next();
                  if (var1.equals(var10)) {
                     break;
                  }
               }

               var11.add(var1);

               while (var9.hasNext()) {
                  var11.add(var9.next());
               }

               this.cycles.add(var11);
            } else if (!this.marked.contains(var6)) {
               boolean var8 = this.backtrack((V)var1, (V)var6);
               var3 = var3 || var8;
            }
         }
      }

      if (var3) {
         while (!this.markedStack.peek().equals(var2)) {
            this.marked.remove(this.markedStack.pop());
         }

         this.marked.remove(this.markedStack.pop());
      }

      this.pointStack.pop();
      return var3;
   }

   private void initState() {
      this.cycles = new ArrayList<>();
      this.marked = new HashSet();
      this.markedStack = new ArrayDeque();
      this.pointStack = new ArrayDeque();
      this.vToI = new HashMap<>();
      this.removed = new HashMap<>();
      int var1 = 0;

      for (Object var3 : this.graph.vertexSet()) {
         this.vToI.put((V)var3, var1++);
      }
   }

   private void clearState() {
      this.cycles = null;
      this.marked = null;
      this.markedStack = null;
      this.pointStack = null;
      this.vToI = null;
   }

   private Integer toI(V var1) {
      return this.vToI.get(var1);
   }

   private Set<V> getRemoved(V var1) {
      return this.removed.computeIfAbsent((V)var1, var0 -> new HashSet());
   }
}
