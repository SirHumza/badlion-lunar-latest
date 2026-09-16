package org.jgrapht.alg.tour;

import java.util.Arrays;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphTests;
import org.jgrapht.util.ArrayUtil;

public class PalmerHamiltonianCycle<V, E> extends HamiltonianCycleAlgorithmBase<V, E> {
   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      if (!GraphTests.hasOreProperty(var1)) {
         throw new IllegalArgumentException("Graph doesn't have Ore's property");
      }

      Set var2 = var1.vertexSet();
      int var3 = var2.size();
      Object[] var4 = var2.toArray(new Object[var3 + 1]);

      while (searchAndCloseGap(var4, var3, var1)) {
      }

      var4[var3] = var4[0];
      return this.closedVertexListToTour(Arrays.asList((V[])var4), var1);
   }

   private static <V, E> boolean searchAndCloseGap(V[] var0, int var1, Graph<V, E> var2) {
      Object var3 = var0[var1 - 1];

      for (int var4 = 0; var4 < var1; var4++) {
         Object var5 = var0[var4];
         if (!var2.containsEdge(var3, var5)) {
            Object var6 = var0[var1 - 1];

            for (int var7 = 0; var7 < var1; var7++) {
               Object var8 = var0[var7];
               boolean var9 = var3 != var6 && var5 != var6 && var3 != var8;
               if (var9 && var2.containsEdge(var3, var6) && var2.containsEdge(var5, var8)) {
                  reverseInCircle(var0, var4, var7 - 1);
                  return true;
               }

               var6 = var8;
            }

            throw new IllegalStateException("Found a gap but no mean to close it");
         }

         var3 = var5;
      }

      return false;
   }

   private static <V> void reverseInCircle(V[] var0, int var1, int var2) {
      if (var1 < var2) {
         ArrayUtil.reverse(var0, var1, var2);
      } else {
         ArrayUtil.reverse(var0, var2 + 1, var1 - 1);
      }
   }
}
