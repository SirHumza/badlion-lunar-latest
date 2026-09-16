package org.jgrapht.alg.cycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.graph.AsUndirectedGraph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.traverse.GraphIterator;
import org.jgrapht.traverse.LexBreadthFirstIterator;
import org.jgrapht.traverse.MaximumCardinalityIterator;
import org.jgrapht.util.CollectionUtil;

public class ChordalityInspector<V, E> {
   private final ChordalityInspector.IterationOrder iterationOrder;
   private final GraphIterator<V, E> orderIterator;
   private final Graph<V, E> graph;
   private boolean chordal = false;
   private List<V> order;
   private GraphPath<V, E> hole;

   public ChordalityInspector(Graph<V, E> var1) {
      this(var1, ChordalityInspector.IterationOrder.MCS);
   }

   public ChordalityInspector(Graph<V, E> var1, ChordalityInspector.IterationOrder var2) {
      Objects.requireNonNull(var1);
      if (var1.getType().isDirected()) {
         this.graph = new AsUndirectedGraph<>(var1);
      } else {
         this.graph = var1;
      }

      this.iterationOrder = var2;
      this.hole = null;
      if (var2 == ChordalityInspector.IterationOrder.MCS) {
         this.orderIterator = new MaximumCardinalityIterator<>(var1);
      } else {
         this.orderIterator = new LexBreadthFirstIterator<>(var1);
      }
   }

   public boolean isChordal() {
      if (this.order == null) {
         this.order = Collections.unmodifiableList(this.lazyComputeOrder());
         this.chordal = this.isPerfectEliminationOrder(this.order, true);
      }

      return this.chordal;
   }

   public List<V> getPerfectEliminationOrder() {
      this.isChordal();
      return this.chordal ? this.order : null;
   }

   public GraphPath<V, E> getHole() {
      this.isChordal();
      return this.hole;
   }

   public boolean isPerfectEliminationOrder(List<V> var1) {
      return this.isPerfectEliminationOrder(var1, false);
   }

   private List<V> lazyComputeOrder() {
      if (this.order == null) {
         int var1 = this.graph.vertexSet().size();
         this.order = new ArrayList(var1);

         for (int var2 = 0; var2 < var1; var2++) {
            this.order.add(this.orderIterator.next());
         }
      }

      return this.order;
   }

   private boolean isPerfectEliminationOrder(List<V> var1, boolean var2) {
      Set var3 = this.graph.vertexSet();
      if (var3.size() == var1.size() && var3.containsAll(var1)) {
         Map var4 = this.getVertexInOrder(var1);

         for (Object var6 : var1) {
            Set var7 = this.getPredecessors(var4, (V)var6);
            if (var7.size() > 0) {
               Object var8 = Collections.max(var7, Comparator.comparingInt(var4::get));

               for (Object var10 : var7) {
                  if (!var10.equals(var8) && !this.graph.containsEdge((V)var10, (V)var8)) {
                     if (var2) {
                        this.findHole((V)var10, (V)var6, (V)var8);
                     }

                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private Map<V, Integer> getVertexInOrder(List<V> var1) {
      HashMap var2 = CollectionUtil.newHashMapWithExpectedSize(var1.size());
      int var3 = 0;

      for (Object var5 : var1) {
         var2.put(var5, var3++);
      }

      return var2;
   }

   private void findHole(V var1, V var2, V var3) {
      List var4 = new ArrayList<>(Arrays.asList(var1, var2, var3));
      HashMap var5 = CollectionUtil.newHashMapWithExpectedSize(this.graph.vertexSet().size());

      for (Object var7 : this.graph.vertexSet()) {
         var5.put(var7, false);
      }

      var5.put(var1, true);
      var5.put(var2, true);
      this.dfsVisit(var4, var5, (V)var1, (V)var2, (V)var3);
      var4 = this.minimizeCycle(var4);
      this.hole = new GraphWalk<>(this.graph, var4, 0.0);
   }

   private void dfsVisit(List<V> var1, Map<V, Boolean> var2, V var3, V var4, V var5) {
      var2.put(var5, true);

      for (Object var7 : this.graph.edgesOf((V)var5)) {
         Object var8 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var5);
         if (!(Boolean)var2.get(var8) && !this.graph.containsEdge((V)var8, (V)var4) || var8.equals(var3)) {
            var1.add(var8);
            if (var8.equals(var3)) {
               return;
            }

            this.dfsVisit(var1, var2, (V)var3, (V)var4, (V)var8);
            if (var1.get(var1.size() - 1).equals(var3)) {
               return;
            }

            var1.remove(var1.size() - 1);
         }
      }
   }

   private List<V> minimizeCycle(List<V> var1) {
      HashSet var2 = new HashSet<>(var1);
      var2.remove(var1.get(1));
      ArrayList var3 = new ArrayList();
      var3.add(var1.get(0));
      var3.add(var1.get(1));
      int var4 = 2;

      while (var4 < var1.size() - 1) {
         Object var5 = var1.get(var4);
         var3.add(var5);
         var2.remove(var5);
         HashSet var6 = new HashSet();

         for (Object var8 : this.graph.edgesOf((V)var5)) {
            Object var9 = Graphs.getOppositeVertex(this.graph, (E)var8, (V)var5);
            if (var2.contains(var9)) {
               var6.add(var9);
            }
         }

         for (Object var11 : var6) {
            if (var2.contains(var11)) {
               while (true) {
                  var2.remove(var1.get(var4));
                  var4++;
                  if (var4 >= var1.size() || var1.get(var4).equals(var11)) {
                     break;
                  }
               }
            }
         }
      }

      var3.add(var1.get(var1.size() - 1));
      return var3;
   }

   private Set<V> getPredecessors(Map<V, Integer> var1, V var2) {
      HashSet var3 = new HashSet();
      Integer var4 = (Integer)var1.get(var2);

      for (Object var7 : this.graph.edgesOf((V)var2)) {
         Object var8 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var2);
         Integer var9 = (Integer)var1.get(var8);
         if (var9 < var4) {
            var3.add(var8);
         }
      }

      return var3;
   }

   public ChordalityInspector.IterationOrder getIterationOrder() {
      return this.iterationOrder;
   }

   public enum IterationOrder {
      MCS,
      LEX_BFS;
   }
}
