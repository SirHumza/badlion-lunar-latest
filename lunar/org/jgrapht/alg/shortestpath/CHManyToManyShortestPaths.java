package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ManyToManyShortestPathsAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.graph.MaskSubgraph;

public class CHManyToManyShortestPaths<V, E> extends BaseManyToManyShortestPaths<V, E> {
   private ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> contractionHierarchy;
   private Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> contractionGraph;
   private Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> contractionMapping;

   @Deprecated
   public CHManyToManyShortestPaths(Graph<V, E> var1) {
      this(new ContractionHierarchyPrecomputation<V, E>(var1).computeContractionHierarchy());
   }

   public CHManyToManyShortestPaths(Graph<V, E> var1, ThreadPoolExecutor var2) {
      this(new ContractionHierarchyPrecomputation<V, E>(var1, var2).computeContractionHierarchy());
   }

   public CHManyToManyShortestPaths(ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> var1) {
      super(var1.getGraph());
      this.contractionHierarchy = var1;
      this.contractionGraph = var1.getContractionGraph();
      this.contractionMapping = var1.getContractionMapping();
   }

   @Override
   public ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> getManyToManyPaths(Set<V> var1, Set<V> var2) {
      Objects.requireNonNull(var1, "sources cannot be null!");
      Objects.requireNonNull(var2, "targets cannot be null!");
      Graph var3;
      boolean var4;
      if (var1.size() <= var2.size()) {
         var3 = this.contractionGraph;
         var4 = false;
      } else {
         var3 = new EdgeReversedGraph<>(this.contractionGraph);
         var4 = true;
         Set var5 = var2;
         var2 = var1;
         var1 = var5;
      }

      HashMap var13 = new HashMap();
      HashMap var6 = new HashMap();
      HashMap var7 = new HashMap();
      Set var8 = var1.stream().map(this.contractionMapping::get).collect(Collectors.toCollection(HashSet::new));
      Set var9 = var2.stream().map(this.contractionMapping::get).collect(Collectors.toCollection(HashSet::new));
      HashMap var10 = new HashMap();

      for (ContractionHierarchyPrecomputation.ContractionVertex var12 : var3.vertexSet()) {
         var10.put(var12, new ArrayList());
      }

      for (ContractionHierarchyPrecomputation.ContractionVertex var16 : var9) {
         this.backwardSearch(var3, var16, var8, var10, var6, var4);
      }

      for (ContractionHierarchyPrecomputation.ContractionVertex var17 : var8) {
         this.forwardSearch(var3, var17, var9, var10, var13, var7, var4);
      }

      return var4
         ? new CHManyToManyShortestPaths.CHManyToManyShortestPathsImpl(this.graph, this.contractionHierarchy, var2, var1, var6, var13, var7)
         : new CHManyToManyShortestPaths.CHManyToManyShortestPathsImpl(this.graph, this.contractionHierarchy, var1, var2, var13, var6, var7);
   }

   private void backwardSearch(
      Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var1,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var2,
      Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> var3,
      Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, List<CHManyToManyShortestPaths<V, E>.BucketEntry>> var4,
      Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Pair<Double, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> var5,
      boolean var6
   ) {
      MaskSubgraph var7;
      if (var6) {
         var7 = new MaskSubgraph<>(new EdgeReversedGraph<>(var1), var0 -> false, var0 -> !var0.isUpward);
      } else {
         var7 = new MaskSubgraph<>(new EdgeReversedGraph<>(var1), var0 -> false, var0 -> var0.isUpward);
      }

      Map var8 = this.getDistanceAndPredecessorMap(var7, var2, var3);
      var5.put(var2, var8);

      for (Entry var10 : var8.entrySet()) {
         ((List)var4.get(var10.getKey())).add(new CHManyToManyShortestPaths.BucketEntry(var2, (Double)((Pair)var10.getValue()).getFirst()));
      }
   }

   private void forwardSearch(
      Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var1,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var2,
      Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> var3,
      Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, List<CHManyToManyShortestPaths<V, E>.BucketEntry>> var4,
      Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Pair<Double, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> var5,
      Map<Pair<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionVertex<V>>, Pair<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> var6,
      boolean var7
   ) {
      MaskSubgraph var8;
      if (var7) {
         var8 = new MaskSubgraph<>(var1, var0 -> false, var0 -> var0.isUpward);
      } else {
         var8 = new MaskSubgraph<>(var1, var0 -> false, var0 -> !var0.isUpward);
      }

      Map var9 = this.getDistanceAndPredecessorMap(var8, var2, var3);
      var5.put(var2, var9);

      for (Entry var11 : var9.entrySet()) {
         ContractionHierarchyPrecomputation.ContractionVertex var12 = (ContractionHierarchyPrecomputation.ContractionVertex)var11.getKey();
         double var13 = (Double)((Pair)var11.getValue()).getFirst();

         for (CHManyToManyShortestPaths.BucketEntry var16 : (List)var4.get(var12)) {
            double var17 = var13 + var16.distance;
            Pair var19;
            if (var7) {
               var19 = Pair.of(var16.target, var2);
            } else {
               var19 = Pair.of(var2, var16.target);
            }

            var6.compute(var19, (var3x, var4x) -> (Pair)(var4x != null && !(var4x.getFirst() > var17) ? var4x : Pair.of(var17, var12)));
         }
      }
   }

   private Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Pair<Double, ContractionHierarchyPrecomputation.ContractionEdge<E>>> getDistanceAndPredecessorMap(
      Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var1,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var2,
      Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> var3
   ) {
      return ((TreeSingleSourcePathsImpl)getShortestPathsTree(var1, (V)var2, var3)).map;
   }

   private class BucketEntry {
      ContractionHierarchyPrecomputation.ContractionVertex<V> target;
      double distance;

      public BucketEntry(ContractionHierarchyPrecomputation.ContractionVertex<V> var2, double var3) {
         this.target = var2;
         this.distance = var3;
      }
   }

   private class CHManyToManyShortestPathsImpl extends ManyToManyShortestPathsAlgorithm.BaseManyToManyShortestPathsImpl<V, E> {
      private final Graph<V, E> graph;
      private final Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> contractionGraph;
      private final Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> contractionMapping;
      private Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Pair<Double, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> forwardSearchSpaces;
      private Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Pair<Double, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> backwardSearchSpaces;
      private Map<Pair<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionVertex<V>>, Pair<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> distanceAndMiddleVertexMap;

      public CHManyToManyShortestPathsImpl(
         Graph<V, E> var2,
         ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> var3,
         Set<V> var4,
         Set<V> var5,
         Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Pair<Double, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> var6,
         Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, Pair<Double, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> var7,
         Map<Pair<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionVertex<V>>, Pair<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> var8
      ) {
         super(var4, var5);
         this.graph = var2;
         this.contractionGraph = var3.getContractionGraph();
         this.contractionMapping = var3.getContractionMapping();
         this.forwardSearchSpaces = var6;
         this.backwardSearchSpaces = var7;
         this.distanceAndMiddleVertexMap = var8;
      }

      @Override
      public GraphPath<V, E> getPath(V var1, V var2) {
         this.assertCorrectSourceAndTarget(var1, var2);
         LinkedList var3 = new LinkedList();
         LinkedList var4 = new LinkedList();
         ContractionHierarchyPrecomputation.ContractionVertex var5 = this.contractionMapping.get(var1);
         ContractionHierarchyPrecomputation.ContractionVertex var6 = this.contractionMapping.get(var2);
         Pair var7 = Pair.of(var5, var6);
         Map var8 = this.forwardSearchSpaces.get(var5);
         Map var9 = this.backwardSearchSpaces.get(var6);
         Pair var10 = this.distanceAndMiddleVertexMap.get(var7);
         if (var10 == null) {
            return null;
         }

         ContractionHierarchyPrecomputation.ContractionVertex var11 = (ContractionHierarchyPrecomputation.ContractionVertex)var10.getSecond();
         var4.add((E)var11.vertex);
         ContractionHierarchyPrecomputation.ContractionVertex var12 = var11;

         while (true) {
            ContractionHierarchyPrecomputation.ContractionEdge var13 = (ContractionHierarchyPrecomputation.ContractionEdge)((Pair)var8.get(var12)).getSecond();
            if (var13 == null) {
               var12 = var11;

               while (true) {
                  var13 = (ContractionHierarchyPrecomputation.ContractionEdge)((Pair)var9.get(var12)).getSecond();
                  if (var13 == null) {
                     return new GraphWalk<>(this.graph, (V)var1, (V)var2, var4, var3, (Double)var10.getFirst());
                  }

                  CHManyToManyShortestPaths.this.contractionHierarchy.unpackForward(var13, var4, var3);
                  var12 = this.contractionGraph.getEdgeTarget(var13);
               }
            }

            CHManyToManyShortestPaths.this.contractionHierarchy.unpackBackward(var13, var4, var3);
            var12 = this.contractionGraph.getEdgeSource(var13);
         }
      }

      @Override
      public double getWeight(V var1, V var2) {
         this.assertCorrectSourceAndTarget(var1, var2);
         Pair var3 = Pair.of(this.contractionMapping.get(var1), this.contractionMapping.get(var2));
         return this.distanceAndMiddleVertexMap.containsKey(var3) ? this.distanceAndMiddleVertexMap.get(var3).getFirst() : Double.POSITIVE_INFINITY;
      }
   }
}
