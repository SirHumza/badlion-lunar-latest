package org.jgrapht.alg.tour;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.cycle.HierholzerEulerianCycle;
import org.jgrapht.alg.matching.blossom.v5.KolmogorovWeightedPerfectMatching;
import org.jgrapht.alg.spanning.KruskalMinimumSpanningTree;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.Pseudograph;
import org.jgrapht.util.CollectionUtil;

public class ChristofidesThreeHalvesApproxMetricTSP<V, E> extends HamiltonianCycleAlgorithmBase<V, E> {
   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      this.checkGraph(var1);
      int var2 = var1.vertexSet().size();
      if (var2 == 1) {
         return this.getSingletonTour(var1);
      }

      Pseudograph var3 = new Pseudograph<>(null, DefaultEdge::new, false);
      var1.vertexSet().forEach(var3::addVertex);
      KruskalMinimumSpanningTree var4 = new KruskalMinimumSpanningTree(var1);
      var4.getSpanningTree().getEdges().forEach(var2x -> var3.addEdge(var1.getEdgeSource((E)var2x), var1.getEdgeTarget((E)var2x)));
      Set var5 = var3.vertexSet().stream().filter(var1x -> (var3.edgesOf(var1x).size() & 1) == 1).collect(Collectors.toSet());
      AsSubgraph var6 = new AsSubgraph(var1, var5);
      KolmogorovWeightedPerfectMatching var7 = new KolmogorovWeightedPerfectMatching<>(var6);
      var7.getMatching().getEdges().forEach(var2x -> var3.addEdge(var1.getEdgeSource((E)var2x), var1.getEdgeTarget((E)var2x)));
      HierholzerEulerianCycle var8 = new HierholzerEulerianCycle();
      GraphPath var9 = var8.getEulerianCycle(var3);
      HashSet var10 = CollectionUtil.newHashSetWithExpectedSize(var2);
      List var11 = var9.getVertexList().stream().filter(var10::add).collect(Collectors.toList());
      return this.vertexListToTour(var11, var1);
   }
}
