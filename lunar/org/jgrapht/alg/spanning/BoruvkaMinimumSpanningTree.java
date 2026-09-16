package org.jgrapht.alg.spanning;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.util.ToleranceDoubleComparator;
import org.jgrapht.alg.util.UnionFind;

public class BoruvkaMinimumSpanningTree<V, E> implements SpanningTreeAlgorithm<E> {
   private final Graph<V, E> graph;
   private final Comparator<Double> comparator;

   public BoruvkaMinimumSpanningTree(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      this.comparator = new ToleranceDoubleComparator();
   }

   @Override
   public SpanningTreeAlgorithm.SpanningTree<E> getSpanningTree() {
      LinkedHashSet var1 = new LinkedHashSet();
      double var2 = 0.0;
      HashMap var4 = new HashMap();
      int var5 = 0;

      for (Object var7 : this.graph.edgeSet()) {
         var4.put(var7, var5++);
      }

      UnionFind var19 = new UnionFind<>(this.graph.vertexSet());
      LinkedHashMap var20 = new LinkedHashMap();

      do {
         var20.clear();

         for (Object var9 : this.graph.edgeSet()) {
            Object var10 = var19.find(this.graph.getEdgeSource((E)var9));
            Object var11 = var19.find(this.graph.getEdgeTarget((E)var9));
            if (!var10.equals(var11)) {
               double var12 = this.graph.getEdgeWeight((E)var9);
               Object var14 = var20.get(var10);
               if (var14 == null) {
                  var20.put(var10, var9);
               } else {
                  double var15 = this.graph.getEdgeWeight((E)var14);
                  int var17 = this.comparator.compare(var12, var15);
                  if (var17 < 0 || var17 == 0 && (Integer)var4.get(var9) < (Integer)var4.get(var14)) {
                     var20.put(var10, var9);
                  }
               }

               Object var26 = var20.get(var11);
               if (var26 == null) {
                  var20.put(var11, var9);
               } else {
                  double var16 = this.graph.getEdgeWeight((E)var26);
                  int var18 = this.comparator.compare(var12, var16);
                  if (var18 < 0 || var18 == 0 && (Integer)var4.get(var9) < (Integer)var4.get(var26)) {
                     var20.put(var11, var9);
                  }
               }
            }
         }

         for (Object var22 : var20.keySet()) {
            Object var23 = var20.get(var22);
            Object var24 = var19.find(this.graph.getEdgeSource((E)var23));
            Object var25 = var19.find(this.graph.getEdgeTarget((E)var23));
            if (!var24.equals(var25)) {
               var1.add(var23);
               var2 += this.graph.getEdgeWeight((E)var23);
               var19.union(var24, var25);
            }
         }
      } while (!var20.isEmpty());

      return new SpanningTreeAlgorithm.SpanningTreeImpl<>(var1, var2);
   }
}
