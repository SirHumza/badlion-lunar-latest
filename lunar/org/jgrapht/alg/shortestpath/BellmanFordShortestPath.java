package org.jgrapht.alg.shortestpath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.ToleranceDoubleComparator;
import org.jgrapht.graph.GraphWalk;

public class BellmanFordShortestPath<V, E> extends BaseShortestPathAlgorithm<V, E> {
   protected final Comparator<Double> comparator;
   protected final int maxHops;

   public BellmanFordShortestPath(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   public BellmanFordShortestPath(Graph<V, E> var1, double var2) {
      this(var1, 1.0E-9, Integer.MAX_VALUE);
   }

   public BellmanFordShortestPath(Graph<V, E> var1, double var2, int var4) {
      super(var1);
      this.comparator = new ToleranceDoubleComparator(var2);
      if (var4 < 1) {
         throw new IllegalArgumentException("Number of hops must be positive");
      }

      this.maxHops = var4;
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      } else {
         return this.getPaths((V)var1).getPath((V)var2);
      }
   }

   @Override
   public ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      int var2 = this.graph.vertexSet().size();
      HashMap var3 = new HashMap();
      HashMap var4 = new HashMap();

      for (Object var6 : this.graph.vertexSet()) {
         var3.put(var6, Double.POSITIVE_INFINITY);
      }

      var3.put(var1, 0.0);
      Set[] var17 = (Set[])Array.newInstance(Set.class, 2);
      var17[0] = new LinkedHashSet();
      var17[1] = new LinkedHashSet();
      int var18 = 0;
      var17[var18].add(var1);

      for (int var7 = 0; var7 < Math.min(var2 - 1, this.maxHops); var7++) {
         Set var8 = var17[var18];
         Set var9 = var17[(var18 + 1) % 2];

         for (Object var11 : var8) {
            for (Object var13 : this.graph.outgoingEdgesOf((V)var11)) {
               Object var14 = Graphs.getOppositeVertex(this.graph, (E)var13, (V)var11);
               double var15 = (Double)var3.get(var11) + this.graph.getEdgeWeight((E)var13);
               if (this.comparator.compare(var15, (Double)var3.get(var14)) < 0) {
                  var3.put(var14, var15);
                  var4.put(var14, var13);
                  var9.add(var14);
               }
            }
         }

         var8.clear();
         var18 = (var18 + 1) % 2;
         if (var9.isEmpty()) {
            break;
         }
      }

      if (this.maxHops >= var2) {
         for (Object var21 : var17[var18]) {
            for (Object var25 : this.graph.outgoingEdgesOf((V)var21)) {
               Object var26 = Graphs.getOppositeVertex(this.graph, (E)var25, (V)var21);
               double var27 = (Double)var3.get(var21) + this.graph.getEdgeWeight((E)var25);
               if (this.comparator.compare(var27, (Double)var3.get(var26)) < 0) {
                  var4.put(var26, var25);
                  throw new NegativeCycleDetectedException("Graph contains a negative-weight cycle", this.computeNegativeCycle((E)var25, var4));
               }
            }
         }
      }

      HashMap var20 = new HashMap();

      for (Object var24 : this.graph.vertexSet()) {
         var20.put(var24, Pair.of((Double)var3.get(var24), var4.get(var24)));
      }

      return new TreeSingleSourcePathsImpl<>(this.graph, (V)var1, var20);
   }

   public static <V, E> GraphPath<V, E> findPathBetween(Graph<V, E> var0, V var1, V var2) {
      return new BellmanFordShortestPath<V, E>(var0).getPath((V)var1, (V)var2);
   }

   private GraphPath<V, E> computeNegativeCycle(E var1, Map<V, E> var2) {
      HashSet var3 = new HashSet();
      Object var4 = this.graph.getEdgeTarget((E)var1);
      var3.add(var4);
      Object var5 = Graphs.getOppositeVertex(this.graph, (E)var1, (V)var4);

      while (!var3.contains(var5)) {
         var3.add(var5);
         Object var6 = var2.get(var5);
         var5 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var5);
      }

      ArrayList var11 = new ArrayList();
      double var7 = 0.0;
      var4 = var5;

      do {
         Object var9 = var2.get(var5);
         var11.add(var9);
         var7 += this.graph.getEdgeWeight((E)var9);
         var5 = Graphs.getOppositeVertex(this.graph, (E)var9, (V)var5);
      } while (var5 != var4);

      Collections.reverse(var11);
      return new GraphWalk<>(this.graph, (V)var4, (V)var4, var11, var7);
   }
}
