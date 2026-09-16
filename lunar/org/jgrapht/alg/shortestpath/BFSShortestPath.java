package org.jgrapht.alg.shortestpath;

import java.util.ArrayDeque;
import java.util.HashMap;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.Pair;

public class BFSShortestPath<V, E> extends BaseShortestPathAlgorithm<V, E> {
   public BFSShortestPath(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   public ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      HashMap var2 = new HashMap();
      var2.put(var1, Pair.of(0.0, null));
      ArrayDeque var3 = new ArrayDeque();
      var3.add(var1);

      while (!var3.isEmpty()) {
         Object var4 = var3.poll();

         for (Object var6 : this.graph.outgoingEdgesOf((V)var4)) {
            Object var7 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var4);
            if (!var2.containsKey(var7)) {
               var3.add(var7);
               double var8 = (Double)((Pair)var2.get(var4)).getFirst() + 1.0;
               var2.put(var7, Pair.of(var8, var6));
            }
         }
      }

      return new TreeSingleSourcePathsImpl<>(this.graph, (V)var1, var2);
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      } else {
         return this.getPaths((V)var1).getPath((V)var2);
      }
   }

   public static <V, E> GraphPath<V, E> findPathBetween(Graph<V, E> var0, V var1, V var2) {
      return new BFSShortestPath<V, E>(var0).getPath((V)var1, (V)var2);
   }
}
