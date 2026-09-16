package org.jgrapht.alg;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DirectedAcyclicGraph;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.traverse.TopologicalOrderIterator;

public class TransitiveClosure {
   public static final TransitiveClosure INSTANCE = new TransitiveClosure();

   private TransitiveClosure() {
   }

   public <V, E> void closeSimpleDirectedGraph(SimpleDirectedGraph<V, E> var1) {
      Set var2 = var1.vertexSet();
      HashSet var3 = new HashSet();
      int var4 = this.computeBinaryLog(var2.size());
      boolean var5 = false;

      for (int var6 = 0; !var5 && var6 < var4; var6++) {
         var5 = true;

         for (Object var8 : var2) {
            var3.clear();

            for (Object var10 : var1.outgoingEdgesOf(var8)) {
               Object var11 = var1.getEdgeTarget(var10);

               for (Object var13 : var1.outgoingEdgesOf(var11)) {
                  Object var14 = var1.getEdgeTarget(var13);
                  if (!var8.equals(var14) && var1.getEdge(var8, var14) == null) {
                     var3.add(var14);
                     var5 = false;
                  }
               }
            }

            for (Object var16 : var3) {
               var1.addEdge(var8, var16);
            }
         }
      }
   }

   private int computeBinaryLog(int var1) {
      assert var1 >= 0;

      int var2;
      for (var2 = 0; var1 > 0; var2++) {
         var1 >>= 1;
      }

      return var2;
   }

   public <V, E> void closeDirectedAcyclicGraph(DirectedAcyclicGraph<V, E> var1) {
      ArrayDeque var2 = new ArrayDeque(var1.vertexSet().size());
      new TopologicalOrderIterator<>(var1).forEachRemaining(var2::addFirst);

      for (Object var4 : var2) {
         for (Object var6 : Graphs.successorListOf(var1, (V)var4)) {
            for (Object var8 : Graphs.successorListOf(var1, (V)var6)) {
               var1.addEdge(var4, var8);
            }
         }
      }
   }
}
