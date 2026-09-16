package org.jgrapht.alg.color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.util.CollectionUtil;

public class LargestDegreeFirstColoring<V, E> extends GreedyColoring<V, E> {
   public LargestDegreeFirstColoring(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   protected Iterable<V> getVertexOrdering() {
      int var1 = this.graph.vertexSet().size();
      int var2 = 0;
      HashMap var3 = CollectionUtil.newHashMapWithExpectedSize(var1);

      for (Object var5 : this.graph.vertexSet()) {
         int var6 = this.graph.edgesOf((V)var5).size();
         var3.put(var5, var6);
         if (var6 > var2) {
            var2 = var6;
         }
      }

      if (var2 > 3 * var1) {
         ArrayList var9 = new ArrayList<>(this.graph.vertexSet());
         var9.sort((var1x, var2x) -> -1 * Integer.compare((Integer)var3.get(var1x), (Integer)var3.get(var2x)));
         return var9;
      }

      ArrayList var8 = new ArrayList(var1);
      Set[] var10 = (Set[])Array.newInstance(Set.class, var2 + 1);

      for (int var11 = 0; var11 <= var2; var11++) {
         var10[var11] = new HashSet();
      }

      for (Object var7 : this.graph.vertexSet()) {
         var10[var3.get(var7)].add(var7);
      }

      for (int var13 = var2; var13 >= 0; var13--) {
         var8.addAll(var10[var13]);
      }

      return var8;
   }
}
