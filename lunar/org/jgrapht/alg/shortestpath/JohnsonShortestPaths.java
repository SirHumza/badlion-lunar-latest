package org.jgrapht.alg.shortestpath;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.ToleranceDoubleComparator;
import org.jgrapht.graph.AsGraphUnion;
import org.jgrapht.graph.AsWeightedGraph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.TypeUtil;

public class JohnsonShortestPaths<V, E> extends BaseShortestPathAlgorithm<V, E> {
   private double[][] distance;
   private E[][] pred;
   private Map<V, Integer> vertexIndices;
   private final Comparator<Double> comparator;

   public JohnsonShortestPaths(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   public JohnsonShortestPaths(Graph<V, E> var1, double var2) {
      super(var1);
      this.comparator = new ToleranceDoubleComparator(var2);
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      }

      this.run();
      if (var1.equals(var2)) {
         return GraphWalk.singletonWalk(this.graph, (V)var1, 0.0);
      }

      int var3 = this.vertexIndices.get(var1);
      int var4 = this.vertexIndices.get(var2);
      Object var5 = var2;
      Object var6 = this.pred[var3][var4];
      if (var6 == null) {
         return null;
      }

      LinkedList var7 = new LinkedList();

      while (var6 != null) {
         var7.addFirst(var6);
         var5 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var5);
         var6 = this.pred[var3][this.vertexIndices.get(var5)];
      }

      return new GraphWalk<>(this.graph, (V)var1, (V)var2, null, var7, this.distance[var3][var4]);
   }

   @Override
   public double getPathWeight(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      }

      this.run();
      return this.distance[this.vertexIndices.get(var1)][this.vertexIndices.get(var2)];
   }

   @Override
   public ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths(V var1) {
      this.run();
      return new JohnsonShortestPaths.JohnsonSingleSourcePaths(var1);
   }

   private void run() {
      if (this.pred == null) {
         GraphTests.requireDirectedOrUndirected(this.graph);
         Object var1 = null;

         for (Object var3 : this.graph.edgeSet()) {
            if (this.comparator.compare(this.graph.getEdgeWeight((E)var3), 0.0) < 0) {
               var1 = var3;
               break;
            }
         }

         if (var1 != null) {
            if (this.graph.getType().isUndirected()) {
               Object var6 = this.graph.getEdgeSource((E)var1);
               double var7 = this.graph.getEdgeWeight((E)var1);
               GraphWalk var5 = new GraphWalk<>(this.graph, (V)var6, (V)var6, Arrays.asList((E[])(new Object[]{var1, var1})), 2.0 * var7);
               throw new NegativeCycleDetectedException("Graph contains a negative-weight cycle", var5);
            }

            this.runWithNegativeEdgeWeights(this.graph);
         } else {
            this.runWithPositiveEdgeWeights(this.graph);
         }
      }
   }

   private void runWithPositiveEdgeWeights(Graph<V, E> var1) {
      this.vertexIndices = this.computeVertexIndices(var1);
      int var2 = var1.vertexSet().size();
      this.distance = new double[var2][var2];
      this.pred = (E[][])((Object[][])TypeUtil.uncheckedCast(new Object[var2][var2]));

      for (Object var4 : var1.vertexSet()) {
         DijkstraClosestFirstIterator var5 = new DijkstraClosestFirstIterator<>(var1, var4, Double.POSITIVE_INFINITY);

         while (var5.hasNext()) {
            var5.next();
         }

         Map var6 = var5.getDistanceAndPredecessorMap();

         for (Object var8 : var1.vertexSet()) {
            Pair var9 = var6.getOrDefault(var8, Pair.of(Double.POSITIVE_INFINITY, null));
            this.distance[this.vertexIndices.get(var4)][this.vertexIndices.get(var8)] = (Double)var9.getFirst();
            this.pred[this.vertexIndices.get(var4)][this.vertexIndices.get(var8)] = (E)var9.getSecond();
         }
      }
   }

   private void runWithNegativeEdgeWeights(Graph<V, E> var1) {
      Map var2 = this.computeVertexWeights(var1);
      HashMap var3 = new HashMap();

      for (Object var5 : var1.edgeSet()) {
         Object var6 = var1.getEdgeSource(var5);
         Object var7 = var1.getEdgeTarget(var5);
         double var8 = var1.getEdgeWeight(var5);
         var3.put(var5, var8 + (Double)var2.get(var6) - (Double)var2.get(var7));
      }

      AsWeightedGraph var14 = new AsWeightedGraph(var1, var3);
      this.vertexIndices = this.computeVertexIndices(var1);
      int var15 = var1.vertexSet().size();
      this.distance = new double[var15][var15];
      this.pred = (E[][])((Object[][])TypeUtil.uncheckedCast(new Object[var15][var15]));

      for (Object var17 : var1.vertexSet()) {
         DijkstraClosestFirstIterator var18 = new DijkstraClosestFirstIterator<>(var14, (V)var17, Double.POSITIVE_INFINITY);

         while (var18.hasNext()) {
            var18.next();
         }

         Map var9 = var18.getDistanceAndPredecessorMap();

         for (Object var11 : var1.vertexSet()) {
            Pair var12 = (Pair)var9.get(var11);
            Pair var13;
            if (var12 != null) {
               var13 = Pair.of((Double)var12.getFirst() - (Double)var2.get(var17) + (Double)var2.get(var11), var12.getSecond());
            } else {
               var13 = Pair.of(Double.POSITIVE_INFINITY, null);
            }

            this.distance[this.vertexIndices.get(var17)][this.vertexIndices.get(var11)] = (Double)var13.getFirst();
            this.pred[this.vertexIndices.get(var17)][this.vertexIndices.get(var11)] = (E)var13.getSecond();
         }
      }
   }

   private Map<V, Double> computeVertexWeights(Graph<V, E> var1) {
      assert var1.getType().isDirected();
      Graph var2 = GraphTypeBuilder.<V, E>directed()
         .allowingMultipleEdges(true)
         .allowingSelfLoops(true)
         .edgeSupplier(this.graph.getEdgeSupplier())
         .vertexSupplier(this.graph.getVertexSupplier())
         .buildGraph();
      Object var3 = var2.addVertex();
      if (var3 == null) {
         throw new IllegalArgumentException("Invalid vertex supplier (does not return unique vertices on each call).");
      }

      HashMap var4 = new HashMap();

      for (Object var6 : var1.vertexSet()) {
         var2.addVertex(var6);
         var4.put(var2.addEdge(var3, var6), 0.0);
      }

      AsGraphUnion var10 = new AsGraphUnion<>(new AsWeightedGraph<>(var2, var4), var1);
      ShortestPathAlgorithm.SingleSourcePaths var11 = new BellmanFordShortestPath<>(var10).getPaths((V)var3);
      HashMap var7 = new HashMap();

      for (Object var9 : var1.vertexSet()) {
         var7.put(var9, var11.getWeight(var9));
      }

      return var7;
   }

   private Map<V, Integer> computeVertexIndices(Graph<V, E> var1) {
      HashMap var2 = new HashMap();
      int var3 = 0;

      for (Object var5 : var1.vertexSet()) {
         var2.put(var5, var3++);
      }

      return var2;
   }

   class JohnsonSingleSourcePaths implements ShortestPathAlgorithm.SingleSourcePaths<V, E> {
      private Object source;

      public JohnsonSingleSourcePaths(V var2) {
         this.source = var2;
      }

      @Override
      public Graph<V, E> getGraph() {
         return JohnsonShortestPaths.this.graph;
      }

      @Override
      public V getSourceVertex() {
         return (V)this.source;
      }

      @Override
      public double getWeight(V var1) {
         return JohnsonShortestPaths.this.getPathWeight((V)this.source, (V)var1);
      }

      @Override
      public GraphPath<V, E> getPath(V var1) {
         return JohnsonShortestPaths.this.getPath((V)this.source, (V)var1);
      }
   }
}
