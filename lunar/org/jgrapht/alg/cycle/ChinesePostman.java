package org.jgrapht.alg.cycle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.matching.KuhnMunkresMinimalWeightBipartitePerfectMatching;
import org.jgrapht.alg.matching.blossom.v5.KolmogorovWeightedPerfectMatching;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.UnorderedPair;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.DirectedPseudograph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.graph.Pseudograph;
import org.jgrapht.graph.SimpleWeightedGraph;

public class ChinesePostman<V, E> {
   public GraphPath<V, E> getCPPSolution(Graph<V, E> var1) {
      GraphTests.requireDirectedOrUndirected(var1);
      if (var1.vertexSet().isEmpty() || var1.edgeSet().isEmpty()) {
         return new HierholzerEulerianCycle<V, E>().getEulerianCycle(var1);
      }

      assert GraphTests.isStronglyConnected(var1);
      return var1.getType().isUndirected() ? this.solveCPPUndirected(var1) : this.solveCPPDirected(var1);
   }

   private GraphPath<V, E> solveCPPUndirected(Graph<V, E> var1) {
      List var2 = var1.vertexSet().stream().filter(var1x -> var1.degreeOf(var1x) % 2 == 1).collect(Collectors.toList());
      HashMap var3 = new HashMap();
      DijkstraShortestPath var4 = new DijkstraShortestPath(var1);

      for (int var5 = 0; var5 < var2.size() - 1; var5++) {
         Object var6 = var2.get(var5);
         ShortestPathAlgorithm.SingleSourcePaths var7 = var4.getPaths(var6);

         for (int var8 = var5 + 1; var8 < var2.size(); var8++) {
            Object var9 = var2.get(var8);
            var3.put(new UnorderedPair<>(var6, var9), var7.getPath(var9));
         }
      }

      SimpleWeightedGraph var14 = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
      Graphs.addAllVertices(var14, var2);

      for (Object var17 : var2) {
         for (Object var21 : var2) {
            if (var17 != var21) {
               Graphs.addEdge(var14, (V)var17, (V)var21, ((GraphPath)var3.get(new UnorderedPair<>(var17, var21))).getWeight());
            }
         }
      }

      MatchingAlgorithm.Matching var16 = new KolmogorovWeightedPerfectMatching<>(var14).getMatching();
      Pseudograph var18 = new Pseudograph(var1.getVertexSupplier(), var1.getEdgeSupplier(), var1.getType().isWeighted());
      Graphs.addGraph(var18, var1);
      HashMap var20 = new HashMap();

      for (DefaultWeightedEdge var10 : var16.getEdges()) {
         Object var11 = var14.getEdgeSource(var10);
         Object var12 = var14.getEdgeTarget(var10);
         Object var13 = var18.addEdge(var11, var12);
         var20.put(var13, (GraphPath)var3.get(new UnorderedPair<>(var11, var12)));
      }

      HierholzerEulerianCycle var23 = new HierholzerEulerianCycle();
      GraphPath var24 = var23.getEulerianCycle(var18);
      return this.replaceShortcutEdges(var1, var24, var20);
   }

   private GraphPath<V, E> solveCPPDirected(Graph<V, E> var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      HashSet var3 = new HashSet();
      HashSet var4 = new HashSet();

      for (Object var6 : var1.vertexSet()) {
         int var7 = var1.outDegreeOf(var6) - var1.inDegreeOf(var6);
         if (var7 != 0) {
            var2.put(var6, Math.abs(var7));
            if (var7 < 0) {
               var3.add(var6);
            } else {
               var4.add(var6);
            }
         }
      }

      HashMap var22 = new HashMap();
      DijkstraShortestPath var23 = new DijkstraShortestPath(var1);

      for (Object var8 : var3) {
         ShortestPathAlgorithm.SingleSourcePaths var9 = var23.getPaths(var8);

         for (Object var11 : var4) {
            var22.put(new Pair<>(var8, var11), var9.getPath(var11));
         }
      }

      SimpleWeightedGraph var25 = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
      ArrayList var26 = new ArrayList();
      HashSet var27 = new HashSet();
      HashSet var28 = new HashSet();
      Integer var29 = 0;

      for (Object var13 : var3) {
         for (int var14 = 0; var14 < var2.get(var13); var14++) {
            var25.addVertex(var29);
            var26.add(var13);
            var27.add(var29);
            var29 = var29 + 1;
         }
      }

      for (Object var33 : var4) {
         for (int var36 = 0; var36 < var2.get(var33); var36++) {
            var25.addVertex(var29);
            var26.add(var33);
            var28.add(var29);
            var29 = var29 + 1;
         }
      }

      for (Integer var34 : var27) {
         for (Integer var15 : var28) {
            Object var16 = var26.get(var34);
            Object var17 = var26.get(var15);
            Graphs.addEdge(var25, (V)var34, (V)var15, ((GraphPath)var22.get(new Pair<>(var16, var17))).getWeight());
         }
      }

      MatchingAlgorithm.Matching var32 = new KuhnMunkresMinimalWeightBipartitePerfectMatching<>(var25, var27, var28).getMatching();
      DirectedPseudograph var35 = new DirectedPseudograph(var1.getVertexSupplier(), var1.getEdgeSupplier(), var1.getType().isWeighted());
      Graphs.addGraph(var35, var1);
      HashMap var38 = new HashMap();

      for (DefaultWeightedEdge var41 : var32.getEdges()) {
         int var43 = (Integer)var25.getEdgeSource(var41);
         int var18 = (Integer)var25.getEdgeTarget(var41);
         Object var19 = var26.get(var43);
         Object var20 = var26.get(var18);
         Object var21 = var35.addEdge(var19, var20);
         var38.put(var21, (GraphPath)var22.get(new Pair<>(var19, var20)));
      }

      HierholzerEulerianCycle var40 = new HierholzerEulerianCycle();
      GraphPath var42 = var40.getEulerianCycle(var35);
      return this.replaceShortcutEdges(var1, var42, var38);
   }

   private GraphPath<V, E> replaceShortcutEdges(Graph<V, E> var1, GraphPath<V, E> var2, Map<E, GraphPath<V, E>> var3) {
      Object var4 = var2.getStartVertex();
      Object var5 = var2.getEndVertex();
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();
      List var8 = var2.getVertexList();
      List var9 = var2.getEdgeList();

      for (int var10 = 0; var10 < var8.size() - 1; var10++) {
         var6.add(var8.get(var10));
         Object var11 = var9.get(var10);
         if (var3.containsKey(var11)) {
            GraphPath var12 = (GraphPath)var3.get(var11);
            if (var6.get(var6.size() - 1).equals(var12.getStartVertex())) {
               var6.addAll(var12.getVertexList().subList(1, var12.getVertexList().size() - 1));
               var7.addAll(var12.getEdgeList());
            } else {
               ArrayList var13 = new ArrayList<>(var12.getVertexList().subList(1, var12.getVertexList().size() - 1));
               Collections.reverse(var13);
               ArrayList var14 = new ArrayList<>(var12.getEdgeList());
               Collections.reverse(var14);
               var6.addAll(var13);
               var7.addAll(var14);
            }
         } else {
            var7.add(var11);
         }
      }

      var6.add(var5);
      double var15 = var7.stream().mapToDouble(var1::getEdgeWeight).sum();
      return new GraphWalk<>(var1, (V)var4, (V)var5, var6, var7, var15);
   }
}
