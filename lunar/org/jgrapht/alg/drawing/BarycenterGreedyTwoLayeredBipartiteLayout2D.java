package org.jgrapht.alg.drawing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.alg.util.Pair;

public class BarycenterGreedyTwoLayeredBipartiteLayout2D<V, E> extends TwoLayeredBipartiteLayout2D<V, E> {
   public BarycenterGreedyTwoLayeredBipartiteLayout2D() {
   }

   public BarycenterGreedyTwoLayeredBipartiteLayout2D(Set<V> var1, Comparator<V> var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void drawSecondPartition(Graph<V, E> var1, List<V> var2, LayoutModel2D<V> var3) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("Partition cannot be empty");
      }

      HashMap var4 = new HashMap();
      int var5 = 0;

      for (Object var7 : var2) {
         int var8 = var1.degreeOf(var7);
         if (var8 == 0) {
            var4.put(var7, Pair.of(-Double.MAX_VALUE, var5));
         } else {
            double var9 = 0.0;

            for (Object var12 : var1.outgoingEdgesOf(var7)) {
               Object var13 = Graphs.getOppositeVertex(var1, var12, var7);
               Point2D var14 = var3.get(var13);
               double var15 = this.vertical ? var14.getX() : var14.getY();
               var9 += var15;
            }

            var9 /= var8;
            var4.put(var7, Pair.of(var9, var5));
         }

         var5++;
      }

      Comparator var17 = (var2x, var3x) -> {
         Pair var4x = (Pair)var4.get(var2x);
         Pair var5x = (Pair)var4.get(var3x);
         int var6 = Double.compare((Double)var4x.getFirst(), (Double)var5x.getFirst());
         if (var6 != 0) {
            return var6;
         } else {
            int var7x = var1.degreeOf(var2x);
            int var8x = var1.degreeOf(var3x);
            if (var7x % 2 == 1 && var8x % 2 == 0) {
               return -1;
            } else {
               return var7x % 2 == 0 && var8x % 2 == 1 ? 1 : Integer.compare((Integer)var4x.getSecond(), (Integer)var5x.getSecond());
            }
         }
      };
      var2.sort(var17);
      super.drawSecondPartition(var1, var2, var3);
   }
}
