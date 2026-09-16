package org.jgrapht.alg.tour;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.spanning.KruskalMinimumSpanningTree;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.util.CollectionUtil;

public class TwoApproxMetricTSP<V, E> extends HamiltonianCycleAlgorithmBase<V, E> {
   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      this.checkGraph(var1);
      Set var2 = var1.vertexSet();
      int var3 = var2.size();
      if (var2.size() == 1) {
         return this.getSingletonTour(var1);
      }

      SimpleGraph var4 = new SimpleGraph<>(null, DefaultEdge::new, false);
      var2.forEach(var4::addVertex);

      for (Object var6 : new KruskalMinimumSpanningTree(var1).getSpanningTree().getEdges()) {
         var4.addEdge(var1.getEdgeSource(var6), var1.getEdgeTarget(var6));
      }

      HashSet var10 = CollectionUtil.newHashSetWithExpectedSize(var3);
      ArrayList var11 = new ArrayList(var3 + 1);
      Object var7 = var2.iterator().next();
      DepthFirstIterator var8 = new DepthFirstIterator<>(var4, (V)var7);

      while (var8.hasNext()) {
         Object var9 = var8.next();
         if (var10.add(var9)) {
            var11.add(var9);
         }
      }

      return this.vertexListToTour(var11, var1);
   }
}
