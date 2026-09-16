package org.jgrapht;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.jgrapht.alg.shortestpath.GraphMeasurer;
import org.jgrapht.alg.util.NeighborCache;
import org.jgrapht.util.CollectionUtil;

public abstract class GraphMetrics {
   public static <V, E> double getDiameter(Graph<V, E> var0) {
      return new GraphMeasurer(var0).getDiameter();
   }

   public static <V, E> double getRadius(Graph<V, E> var0) {
      return new GraphMeasurer(var0).getRadius();
   }

   public static <V, E> int getGirth(Graph<V, E> var0) {
      byte var1 = -1;
      boolean var2 = var0.getType().isAllowingMultipleEdges();
      ArrayList var3 = new ArrayList<>(var0.vertexSet());
      HashMap var4 = new HashMap();

      for (int var5 = 0; var5 < var3.size(); var5++) {
         var4.put(var3.get(var5), var5);
      }

      int var18 = Integer.MAX_VALUE;
      int[] var6 = new int[var3.size()];
      ArrayDeque var7 = new ArrayDeque();
      if (var0.getType().isAllowingSelfLoops()) {
         for (Object var9 : var3) {
            if (var0.containsEdge(var9, var9)) {
               return 1;
            }
         }
      }

      NeighborCache var19 = new NeighborCache(var0);
      if (var0.getType().isUndirected()) {
         int[] var20 = new int[var3.size()];

         for (int var10 = 0; var10 < var3.size() - 2 && var18 > 3; var10++) {
            Arrays.fill(var6, -1);
            Arrays.fill(var20, -1);
            var7.clear();
            var6[var10] = 0;
            var7.add(var3.get(var10));

            int var11;
            do {
               Object var12 = var7.poll();
               int var13 = (Integer)var4.get(var12);
               var11 = var6[var13];

               for (Object var15 : var19.neighborsOf(var12)) {
                  int var16 = (Integer)var4.get(var15);
                  if (var20[var13] != var16 || var2 && var0.getAllEdges(var12, var15).size() != 1) {
                     int var17 = var6[var16];
                     if (var17 == -1) {
                        var7.add(var15);
                        var6[var16] = var11 + 1;
                        var20[var16] = var13;
                     } else {
                        var18 = Math.min(var18, var11 + var17 + 1);
                     }
                  }
               }
            } while (!var7.isEmpty() && 2 * (var11 + 1) - 1 < var18);
         }
      } else {
         for (int var21 = 0; var21 < var3.size() - 1 && var18 > 2; var21++) {
            Arrays.fill(var6, -1);
            var7.clear();
            var6[var21] = 0;
            var7.add(var3.get(var21));

            int var22;
            do {
               Object var23 = var7.poll();
               int var24 = (Integer)var4.get(var23);
               var22 = var6[var24];

               for (Object var26 : var19.successorsOf(var23)) {
                  int var27 = (Integer)var4.get(var26);
                  int var28 = var6[var27];
                  if (var28 == -1) {
                     var7.add(var26);
                     var6[var27] = var22 + 1;
                  } else if (var28 == 0) {
                     var18 = Math.min(var18, var22 + var28 + 1);
                  }
               }
            } while (!var7.isEmpty() && var22 + 1 < var18);
         }
      }

      assert var0.getType().isUndirected() && var0.getType().isSimple() && var18 >= 3
         || var0.getType().isAllowingSelfLoops() && var18 >= 1
         || var18 >= 2 && (var0.getType().isDirected() || var0.getType().isAllowingMultipleEdges());
      return var18;
   }

   static <V, E> long naiveCountTriangles(Graph<V, E> var0, List<V> var1) {
      long var2 = 0L;
      if (var0.getType().isAllowingMultipleEdges()) {
         for (int var4 = 0; var4 < var1.size(); var4++) {
            for (int var5 = var4 + 1; var5 < var1.size(); var5++) {
               for (int var6 = var5 + 1; var6 < var1.size(); var6++) {
                  Object var7 = var1.get(var4);
                  Object var8 = var1.get(var5);
                  Object var9 = var1.get(var6);
                  int var10 = var0.getAllEdges(var7, var8).size();
                  if (var10 != 0) {
                     int var11 = var0.getAllEdges(var8, var9).size();
                     if (var11 != 0) {
                        int var12 = var0.getAllEdges(var9, var7).size();
                        if (var12 != 0) {
                           var2 += var10 * var11 * var12;
                        }
                     }
                  }
               }
            }
         }
      } else {
         for (int var13 = 0; var13 < var1.size(); var13++) {
            for (int var14 = var13 + 1; var14 < var1.size(); var14++) {
               for (int var15 = var14 + 1; var15 < var1.size(); var15++) {
                  Object var16 = var1.get(var13);
                  Object var17 = var1.get(var14);
                  Object var18 = var1.get(var15);
                  if (var0.containsEdge(var16, var17) && var0.containsEdge(var17, var18) && var0.containsEdge(var18, var16)) {
                     var2++;
                  }
               }
            }
         }
      }

      return var2;
   }

   public static <V, E> long getNumberOfTriangles(Graph<V, E> var0) {
      GraphTests.requireUndirected(var0);
      int var1 = (int)Math.sqrt(var0.vertexSet().size());
      ArrayList var2 = new ArrayList<>(var0.vertexSet());
      HashMap var3 = CollectionUtil.newHashMapWithExpectedSize(var0.vertexSet().size());
      int var4 = 0;

      for (Object var6 : var0.vertexSet()) {
         var3.put(var6, var4++);
      }

      Comparator var16 = Comparator.comparingInt(var0::degreeOf).thenComparingInt(System::identityHashCode).thenComparingInt(var3::get);
      var2.sort(var16);
      List var17 = var2.stream().filter(var2x -> var0.degreeOf(var2x) >= var1).collect(Collectors.toCollection(ArrayList::new));
      long var7 = naiveCountTriangles(var0, var17);

      for (Object var10 : var0.edgeSet()) {
         Object var11 = var0.getEdgeSource(var10);
         Object var12 = var0.getEdgeTarget(var10);
         if (var11 != var12 && (var0.degreeOf(var11) < var1 || var0.degreeOf(var12) < var1)) {
            if (var16.compare(var11, var12) > 0) {
               Object var13 = var11;
               var11 = var12;
               var12 = var13;
            }

            for (Object var14 : var0.edgesOf(var11)) {
               Object var15 = Graphs.getOppositeVertex(var0, var14, var11);
               if (var15 != var11 && var15 != var12 && var16.compare(var12, var15) <= 0 && var0.containsEdge(var15, var12)) {
                  var7++;
               }
            }
         }
      }

      return var7;
   }
}
