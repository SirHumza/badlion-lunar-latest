package org.jgrapht.alg.shortestpath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.KShortestPathAlgorithm;
import org.jgrapht.alg.util.UnorderedPair;
import org.jgrapht.graph.AsWeightedGraph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.GraphWalk;

abstract class BaseKDisjointShortestPathsAlgorithm<V, E> implements KShortestPathAlgorithm<V, E> {
   protected Graph<V, E> workingGraph;
   protected List<List<E>> pathList;
   protected Graph<V, E> originalGraph;
   private Set<E> validEdges;

   public BaseKDisjointShortestPathsAlgorithm(Graph<V, E> var1) {
      this.originalGraph = var1;
      GraphTests.requireDirected(var1);
      if (!GraphTests.isSimple(var1)) {
         throw new IllegalArgumentException("Graph must be simple");
      }
   }

   @Override
   public List<GraphPath<V, E>> getPaths(V var1, V var2, int var3) {
      if (var3 <= 0) {
         throw new IllegalArgumentException("Number of paths must be positive");
      }

      Objects.requireNonNull(var1, "startVertex is null");
      Objects.requireNonNull(var2, "endVertex is null");
      if (var2.equals(var1)) {
         throw new IllegalArgumentException("The end vertex is the same as the start vertex!");
      }

      if (!this.originalGraph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("graph must contain the start vertex!");
      }

      if (!this.originalGraph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("graph must contain the end vertex!");
      }

      this.workingGraph = new AsWeightedGraph<>(
         new DefaultDirectedWeightedGraph<>(this.originalGraph.getVertexSupplier(), this.originalGraph.getEdgeSupplier()), new HashMap<>(), false
      );
      Graphs.addGraph(this.workingGraph, this.originalGraph);
      this.pathList = new ArrayList<>();
      GraphPath var4 = this.calculateShortestPath((V)var1, (V)var2);
      if (var4 != null) {
         this.pathList.add(var4.getEdgeList());

         for (int var5 = 0; var5 < var3 - 1; var5++) {
            this.transformGraph(this.pathList.get(var5));
            var4 = this.calculateShortestPath((V)var1, (V)var2);
            if (var4 == null) {
               break;
            }

            this.pathList.add(var4.getEdgeList());
         }
      }

      return this.pathList.size() > 0 ? this.resolvePaths((V)var1, (V)var2) : Collections.emptyList();
   }

   private List<GraphPath<V, E>> resolvePaths(V var1, V var2) {
      this.findValidEdges();
      List var3 = this.buildPaths((V)var1, (V)var2);
      Collections.sort(var3, Comparator.comparingDouble(GraphPath::getWeight));
      return var3;
   }

   private List<GraphPath<V, E>> buildPaths(V var1, V var2) {
      Map var3 = this.validEdges.stream().collect(Collectors.groupingBy(this::getEdgeSource, Collectors.toCollection(ArrayDeque::new)));
      ArrayDeque var4 = (ArrayDeque)var3.get(var1);
      ArrayList var5 = new ArrayList();

      for (Object var7 : var4) {
         ArrayList var8 = new ArrayList();
         var8.add(var7);

         while (true) {
            Object var9 = this.getEdgeTarget((E)var7);
            if (var9.equals(var2)) {
               var9 = this.createGraphPath(var8, (V)var1, (V)var2);
               var5.add(var9);
               break;
            }

            ArrayDeque var10 = (ArrayDeque)var3.get(var9);
            var7 = var10.poll();
            var8.add(var7);
         }
      }

      return var5;
   }

   private void findValidEdges() {
      LinkedHashMap var1 = new LinkedHashMap();

      for (List var3 : this.pathList) {
         for (Object var5 : var3) {
            Object var6 = this.getEdgeSource((E)var5);
            Object var7 = this.getEdgeTarget((E)var5);
            UnorderedPair var8 = new UnorderedPair<>(var6, var7);
            var1.compute(var8, (var1x, var2) -> var2 == null ? var5 : null);
         }
      }

      this.validEdges = new LinkedHashSet<>(var1.values());
   }

   private GraphPath<V, E> createGraphPath(List<E> var1, V var2, V var3) {
      double var4 = 0.0;

      for (Object var7 : var1) {
         var4 += this.originalGraph.getEdgeWeight((E)var7);
      }

      return new GraphWalk<>(this.originalGraph, (V)var2, (V)var3, var1, var4);
   }

   private V getEdgeSource(E var1) {
      return this.workingGraph.containsEdge((E)var1) ? this.workingGraph.getEdgeSource((E)var1) : this.originalGraph.getEdgeSource((E)var1);
   }

   private V getEdgeTarget(E var1) {
      return this.workingGraph.containsEdge((E)var1) ? this.workingGraph.getEdgeTarget((E)var1) : this.originalGraph.getEdgeTarget((E)var1);
   }

   protected abstract GraphPath<V, E> calculateShortestPath(V var1, V var2);

   protected abstract void transformGraph(List<E> var1);
}
