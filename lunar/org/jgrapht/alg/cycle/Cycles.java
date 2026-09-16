package org.jgrapht.alg.cycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.graph.GraphWalk;

public abstract class Cycles {
   public static <V, E> GraphPath<V, E> simpleCycleToGraphPath(Graph<V, E> var0, List<E> var1) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      Objects.requireNonNull(var1, "Cycle cannot be null");
      if (var1.isEmpty()) {
         return null;
      }

      HashMap var2 = new HashMap();
      HashMap var3 = new HashMap();

      for (Object var5 : var1) {
         Object var6 = var0.getEdgeSource(var5);
         if (!var2.containsKey(var6)) {
            var2.put(var6, var5);
         } else {
            if (var3.containsKey(var6)) {
               throw new IllegalArgumentException("Not a simple cycle");
            }

            var3.put(var6, var5);
         }

         Object var7 = var0.getEdgeTarget(var5);
         if (!var2.containsKey(var7)) {
            var2.put(var7, var5);
         } else {
            if (var3.containsKey(var7)) {
               throw new IllegalArgumentException("Not a simple cycle");
            }

            var3.put(var7, var5);
         }
      }

      ArrayList var12 = new ArrayList();
      double var13 = 0.0;
      Object var15 = var1.stream().findAny().get();
      var12.add(var15);
      var13 += var0.getEdgeWeight(var15);
      Object var8 = var0.getEdgeSource(var15);

      for (Object var9 = Graphs.getOppositeVertex(var0, var15, var8); !var9.equals(var8); var9 = Graphs.getOppositeVertex(var0, var15, var9)) {
         Object var10 = var2.get(var9);
         if (var10 == null) {
            throw new IllegalArgumentException("Not a simple cycle");
         }

         Object var11 = var3.get(var9);
         if (var11 == null) {
            throw new IllegalArgumentException("Not a simple cycle");
         }

         if (var10.equals(var15)) {
            var15 = var11;
         } else {
            if (!var11.equals(var15)) {
               throw new IllegalArgumentException("Not a simple cycle");
            }

            var15 = var10;
         }

         var12.add(var15);
         var13 += var0.getEdgeWeight(var15);
      }

      return new GraphWalk<>(var0, (V)var8, (V)var8, var12, var13);
   }
}
