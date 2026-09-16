package org.jgrapht.alg.cycle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.CycleBasisAlgorithm;

public class PatonCycleBase<V, E> implements CycleBasisAlgorithm<V, E> {
   private Graph<V, E> graph;

   public PatonCycleBase(Graph<V, E> var1) {
      this.graph = GraphTests.requireUndirected(var1);
   }

   @Override
   public CycleBasisAlgorithm.CycleBasis<V, E> getCycleBasis() {
      GraphTests.requireUndirected(this.graph);
      if (GraphTests.hasMultipleEdges(this.graph)) {
         throw new IllegalArgumentException("Graphs with multiple edges not supported");
      }

      HashMap var1 = new HashMap();
      HashMap var2 = new HashMap();
      ArrayDeque var3 = new ArrayDeque();
      LinkedHashSet var4 = new LinkedHashSet();
      int var5 = 0;
      double var6 = 0.0;

      for (Object var9 : this.graph.vertexSet()) {
         if (!var2.containsKey(var9)) {
            var1.clear();
            var2.put(var9, null);
            var1.put(var9, new HashMap());
            var3.push(var9);

            while (!var3.isEmpty()) {
               Object var10 = var3.pop();
               Map var11 = (Map)var1.get(var10);

               for (Object var13 : this.graph.edgesOf((V)var10)) {
                  Object var14 = Graphs.getOppositeVertex(this.graph, (E)var13, (V)var10);
                  if (!var1.containsKey(var14)) {
                     var2.put(var14, var13);
                     HashMap var22 = new HashMap();
                     var22.put(var10, var13);
                     var1.put(var14, var22);
                     var3.push(var14);
                  } else if (var14.equals(var10)) {
                     ArrayList var21 = new ArrayList();
                     var21.add(var13);
                     var6 += this.graph.getEdgeWeight((E)var13);
                     var5++;
                     var4.add(var21);
                  } else if (!var11.containsKey(var14)) {
                     Map var15 = (Map)var1.get(var14);
                     double var16 = 0.0;
                     ArrayList var18 = new ArrayList();
                     var18.add(var13);
                     var16 += this.graph.getEdgeWeight((E)var13);
                     Object var19 = var10;

                     while (!var15.containsKey(var19)) {
                        Object var20 = var2.get(var19);
                        var18.add(var20);
                        var16 += this.graph.getEdgeWeight((E)var20);
                        var19 = Graphs.getOppositeVertex(this.graph, (E)var20, (V)var19);
                     }

                     Object var25 = var15.get(var19);
                     var18.add(var25);
                     var16 += this.graph.getEdgeWeight((E)var25);
                     var15.put(var10, var13);
                     var4.add(var18);
                     var5 += var18.size();
                     var6 += var16;
                  }
               }
            }
         }
      }

      return new CycleBasisAlgorithm.CycleBasisImpl<>(this.graph, var4, var5, var6);
   }
}
