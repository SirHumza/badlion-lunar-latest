package org.jgrapht.alg.cycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;

public class TiernanSimpleCycles<V, E> implements DirectedSimpleCycles<V, E> {
   private Graph<V, E> graph;

   public TiernanSimpleCycles() {
   }

   public TiernanSimpleCycles(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1, "Graph must be directed");
   }

   public Graph<V, E> getGraph() {
      return this.graph;
   }

   public void setGraph(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1, "Graph must be directed");
   }

   @Override
   public List<List<V>> findSimpleCycles() {
      if (this.graph == null) {
         throw new IllegalArgumentException("Null graph.");
      }

      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      HashSet var3 = new HashSet();
      HashMap var4 = new HashMap();
      LinkedList var5 = new LinkedList();
      int var6 = 0;

      for (Object var8 : this.graph.vertexSet()) {
         var4.put(var8, new HashSet());
         var1.put(var8, var6++);
      }

      Iterator var17 = this.graph.vertexSet().iterator();
      if (!var17.hasNext()) {
         return var5;
      }

      Object var9 = var17.next();
      var2.add(var9);
      var3.add(var9);

      while (true) {
         boolean var12 = false;

         for (Object var14 : this.graph.outgoingEdgesOf((V)var9)) {
            Object var15 = this.graph.getEdgeTarget((E)var14);
            int var16 = ((Integer)var1.get(var15)).compareTo((Integer)var1.get(var2.get(0)));
            if (var16 > 0 && !var3.contains(var15) && !((Set)var4.get(var9)).contains(var15)) {
               var2.add(var15);
               var3.add(var15);
               var9 = var15;
               var12 = true;
               break;
            }
         }

         if (!var12) {
            Object var18 = var2.get(0);
            if (this.graph.containsEdge((V)var9, (V)var18)) {
               ArrayList var20 = new ArrayList<>(var2);
               var5.add(var20);
            }

            if (var2.size() > 1) {
               ((Set)var4.get(var9)).clear();
               int var11 = var2.size() - 1;
               var2.remove(var11);
               var3.remove(var9);
               var11--;
               Object var10 = var9;
               var9 = var2.get(var11);
               ((Set)var4.get(var9)).add(var10);
            } else {
               if (!var17.hasNext()) {
                  return var5;
               }

               var2.clear();
               var3.clear();
               var9 = var17.next();
               var2.add(var9);
               var3.add(var9);

               for (Object var22 : var4.keySet()) {
                  ((Set)var4.get(var22)).clear();
               }
            }
         }
      }
   }
}
