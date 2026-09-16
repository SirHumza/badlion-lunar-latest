package org.jgrapht.alg.shortestpath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphTests;
import org.jgrapht.graph.GraphWalk;

public class AllDirectedPaths<V, E> {
   private final Graph<V, E> graph;

   public AllDirectedPaths(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1);
   }

   public List<GraphPath<V, E>> getAllPaths(V var1, V var2, boolean var3, Integer var4) {
      return this.getAllPaths(Collections.singleton((V)var1), Collections.singleton((V)var2), var3, var4);
   }

   public List<GraphPath<V, E>> getAllPaths(Set<V> var1, Set<V> var2, boolean var3, Integer var4) {
      if (var4 != null && var4 < 0) {
         throw new IllegalArgumentException("maxPathLength must be non-negative if defined");
      } else if (!var3 && var4 == null) {
         throw new IllegalArgumentException("If search is not restricted to simple paths, a maximum path length must be set to avoid infinite cycles");
      } else if (!var1.isEmpty() && !var2.isEmpty()) {
         Map var5 = this.edgeMinDistancesBackwards(var2, var4);
         return this.generatePaths(var1, var2, var3, var4, var5);
      } else {
         return Collections.emptyList();
      }
   }

   private Map<E, Integer> edgeMinDistancesBackwards(Set<V> var1, Integer var2) {
      HashMap var3 = new HashMap();
      HashMap var4 = new HashMap();
      ArrayDeque var5 = new ArrayDeque();
      if (var2 != null) {
         if (var2 < 0) {
            throw new IllegalArgumentException("maxPathLength must be non-negative if defined");
         }

         if (var2 == 0) {
            return var3;
         }
      }

      for (Object var7 : var1) {
         var4.put(var7, 0);
         var5.add(var7);
      }

      Object var11;
      while ((var11 = var5.poll()) != null) {
         assert var4.containsKey(var11);
         Integer var12 = (Integer)var4.get(var11) + 1;

         for (Object var9 : this.graph.incomingEdgesOf((V)var11)) {
            if (!var3.containsKey(var9) || (Integer)var3.get(var9) > var12) {
               var3.put(var9, var12);
            }

            Object var10 = this.graph.getEdgeSource((E)var9);
            if (!var4.containsKey(var10) || (Integer)var4.get(var10) > var12) {
               var4.put(var10, var12);
               if (var2 == null || var12 < var2) {
                  var5.add(var10);
               }
            }
         }
      }

      assert var5.isEmpty();
      return var3;
   }

   private List<GraphPath<V, E>> generatePaths(Set<V> var1, Set<V> var2, boolean var3, Integer var4, Map<E, Integer> var5) {
      ArrayList var6 = new ArrayList();
      LinkedList var7 = new LinkedList();
      if (var4 != null && var4 < 0) {
         throw new IllegalArgumentException("maxPathLength must be non-negative if defined");
      }

      for (Object var9 : var1) {
         if (var2.contains(var9)) {
            var6.add(GraphWalk.singletonWalk(this.graph, (V)var9, 0.0));
         }

         if (var4 == null || var4 != 0) {
            for (Object var11 : this.graph.outgoingEdgesOf((V)var9)) {
               assert this.graph.getEdgeSource((E)var11).equals(var9);
               if (var2.contains(this.graph.getEdgeTarget((E)var11))) {
                  var6.add(this.makePath(Collections.singletonList((E)var11)));
               }

               if (var5.containsKey(var11) && (var4 == null || var4 > 1)) {
                  List var12 = Collections.singletonList(var11);
                  var7.add(var12);
               }
            }
         }
      }

      if (var4 != null && var4 == 0) {
         return var6;
      }

      List var17;
      while ((var17 = (List)var7.poll()) != null) {
         Integer var18 = var17.size();
         assert var4 == null || var18 < var4;
         Object var19 = var17.get(var18 - 1);
         Object var20 = this.graph.getEdgeTarget((E)var19);
         HashSet var21 = new HashSet();

         for (Object var14 : var17) {
            var21.add(this.graph.getEdgeSource((E)var14));
            var21.add(this.graph.getEdgeTarget((E)var14));
         }

         for (Object var23 : this.graph.outgoingEdgesOf((V)var20)) {
            if (var5.containsKey(var23) && (var4 == null || (Integer)var5.get(var23) + var18 <= var4)) {
               ArrayList var15 = new ArrayList<>(var17);
               var15.add(var23);
               if (!var3 || !var21.contains(this.graph.getEdgeTarget((E)var23))) {
                  if (var2.contains(this.graph.getEdgeTarget((E)var23))) {
                     GraphPath var16 = this.makePath(var15);
                     assert var1.contains(var16.getStartVertex());
                     assert var2.contains(var16.getEndVertex());
                     assert var4 == null || var16.getLength() <= var4;
                     var6.add(var16);
                  }

                  if (var4 == null || var15.size() < var4) {
                     var7.addFirst(var15);
                  }
               }
            }
         }
      }

      assert var7.isEmpty();
      return var6;
   }

   private GraphPath<V, E> makePath(List<E> var1) {
      Object var2 = this.graph.getEdgeSource((E)var1.get(0));
      Object var3 = this.graph.getEdgeTarget((E)var1.get(var1.size() - 1));
      double var4 = var1.stream().mapToDouble(var1x -> this.graph.getEdgeWeight((E)var1x)).sum();
      return new GraphWalk<>(this.graph, (V)var2, (V)var3, var1, var4);
   }
}
