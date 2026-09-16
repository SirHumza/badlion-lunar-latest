package org.jgrapht.alg.color;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.util.CollectionUtil;

public class SmallestDegreeLastColoring<V, E> extends GreedyColoring<V, E> {
   public SmallestDegreeLastColoring(Graph<V, E> var1) {
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

      Set[] var13 = (Set[])Array.newInstance(Set.class, var2 + 1);

      for (int var14 = 0; var14 <= var2; var14++) {
         var13[var14] = new HashSet();
      }

      for (Object var17 : this.graph.vertexSet()) {
         var13[var3.get(var17)].add(var17);
      }

      ArrayDeque var16 = new ArrayDeque();

      for (int var18 = 0; var18 <= var2; var18++) {
         while (var13[var18].size() > 0) {
            Object var7 = var13[var18].iterator().next();
            var13[var18].remove(var7);
            var16.addFirst(var7);
            var3.remove(var7);

            for (Object var9 : this.graph.edgesOf((V)var7)) {
               Object var10 = Graphs.getOppositeVertex(this.graph, (E)var9, (V)var7);
               if (var7.equals(var10)) {
                  throw new IllegalArgumentException("Self-loops not allowed");
               }

               Integer var11 = (Integer)var3.get(var10);
               if (var11 != null && var11 > 0) {
                  var13[var11].remove(var10);
                  var11 = var11 - 1;
                  var3.put(var10, var11);
                  var13[var11].add(var10);
                  if (var11 < var18) {
                     var18 = var11;
                  }
               }
            }
         }
      }

      return var16;
   }
}
