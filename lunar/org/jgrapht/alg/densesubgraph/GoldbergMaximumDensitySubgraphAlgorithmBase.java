package org.jgrapht.alg.densesubgraph;

import java.util.HashSet;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MaximumDensitySubgraphAlgorithm;
import org.jgrapht.alg.interfaces.MinimumSTCutAlgorithm;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.builder.GraphTypeBuilder;

public abstract class GoldbergMaximumDensitySubgraphAlgorithmBase<V, E> implements MaximumDensitySubgraphAlgorithm<V, E> {
   private double lower;
   private double upper;
   private double epsilon;
   protected double guess;
   protected final Graph<V, E> graph;
   private Graph<V, E> densestSubgraph;
   private Graph<V, DefaultWeightedEdge> currentNetwork;
   private Set<V> currentVertices;
   private V s;
   private V t;
   private MinimumSTCutAlgorithm<V, DefaultWeightedEdge> minSTCutAlg;
   private boolean checkWeights;

   public GoldbergMaximumDensitySubgraphAlgorithmBase(
      Graph<V, E> var1, V var2, V var3, boolean var4, double var5, Function<Graph<V, DefaultWeightedEdge>, MinimumSTCutAlgorithm<V, DefaultWeightedEdge>> var7
   ) {
      if (!var1.containsVertex(var2) && !var1.containsVertex(var3)) {
         this.s = Objects.requireNonNull((V)var2, "Source vertex is null");
         this.t = Objects.requireNonNull((V)var3, "Sink vertex is null");
         this.graph = Objects.requireNonNull(var1, "Graph is null");
         this.epsilon = var5;
         this.guess = 0.0;
         this.lower = 0.0;
         this.upper = this.computeDensityNumerator(this.graph);
         this.checkWeights = var4;
         this.currentNetwork = this.buildNetwork();
         this.currentVertices = new HashSet();
         this.initializeNetwork();
         this.checkForEmptySolution();
         this.minSTCutAlg = (MinimumSTCutAlgorithm<V, DefaultWeightedEdge>)var7.apply(this.currentNetwork);
      } else {
         throw new IllegalArgumentException("Source or sink vertex already in graph");
      }
   }

   private Graph<V, DefaultWeightedEdge> buildNetwork() {
      return GraphTypeBuilder.<V, E>directed()
         .allowingMultipleEdges(true)
         .allowingSelfLoops(true)
         .weighted(true)
         .edgeSupplier(DefaultWeightedEdge::new)
         .buildGraph();
   }

   private void updateNetwork() {
      for (Object var2 : this.graph.vertexSet()) {
         this.currentNetwork.setEdgeWeight(this.currentNetwork.getEdge((V)var2, this.t), this.getEdgeWeightFromVertexToSink((V)var2));
         this.currentNetwork.setEdgeWeight(this.currentNetwork.getEdge(this.s, (V)var2), this.getEdgeWeightFromSourceToVertex((V)var2));
      }

      if (this.checkWeights) {
         double var6 = this.getMinimalCapacity();
         if (var6 < 0.0) {
            for (Object var5 : this.graph.vertexSet()) {
               DefaultWeightedEdge var3 = this.currentNetwork.getEdge((V)var5, this.t);
               this.currentNetwork.setEdgeWeight(var3, this.currentNetwork.getEdgeWeight(var3) - var6);
               var3 = this.currentNetwork.getEdge(this.s, (V)var5);
               this.currentNetwork.setEdgeWeight(var3, this.currentNetwork.getEdgeWeight(var3) - var6);
            }
         }
      }
   }

   private double getMinimalCapacity() {
      DoubleStream var1 = this.graph
         .vertexSet()
         .stream()
         .mapToDouble(var1x -> this.currentNetwork.getEdgeWeight(this.currentNetwork.getEdge((V)var1x, this.t)));
      DoubleStream var2 = this.graph
         .vertexSet()
         .stream()
         .mapToDouble(var1x -> this.currentNetwork.getEdgeWeight(this.currentNetwork.getEdge(this.s, (V)var1x)));
      OptionalDouble var3 = DoubleStream.concat(var1, var2).min();
      return var3.isPresent() ? var3.getAsDouble() : 0.0;
   }

   private void initializeNetwork() {
      this.currentNetwork.addVertex(this.s);
      this.currentNetwork.addVertex(this.t);

      for (Object var2 : this.graph.vertexSet()) {
         this.currentNetwork.addVertex((V)var2);
         this.currentNetwork.addEdge(this.s, (V)var2);
         this.currentNetwork.addEdge((V)var2, this.t);
      }

      for (Object var8 : this.graph.edgeSet()) {
         DefaultWeightedEdge var3 = this.currentNetwork.addEdge(this.graph.getEdgeSource((E)var8), this.graph.getEdgeTarget((E)var8));
         DefaultWeightedEdge var4 = this.currentNetwork.addEdge(this.graph.getEdgeTarget((E)var8), this.graph.getEdgeSource((E)var8));
         double var5 = this.graph.getEdgeWeight((E)var8);
         this.currentNetwork.setEdgeWeight(var3, var5);
         this.currentNetwork.setEdgeWeight(var4, var5);
      }
   }

   @Override
   public Graph<V, E> calculateDensest() {
      if (this.densestSubgraph != null) {
         return this.densestSubgraph;
      }

      while (Double.compare(this.upper - this.lower, this.epsilon) >= 0) {
         this.guess = this.lower + (this.upper - this.lower) / 2.0;
         this.updateNetwork();
         this.minSTCutAlg.calculateMinCut(this.s, this.t);
         Set var1 = this.minSTCutAlg.getSourcePartition();
         var1.remove(this.s);
         if (var1.isEmpty()) {
            this.upper = this.guess;
         } else {
            this.lower = this.guess;
            this.currentVertices = (Set<V>)(new HashSet<>(var1));
         }
      }

      this.densestSubgraph = new AsSubgraph<>(this.graph, this.currentVertices);
      return this.densestSubgraph;
   }

   @Override
   public double getDensity() {
      if (this.densestSubgraph == null) {
         this.calculateDensest();
      }

      double var1 = this.computeDensityDenominator(this.densestSubgraph);
      return var1 != 0.0 ? this.computeDensityNumerator(this.densestSubgraph) / var1 : 0.0;
   }

   protected abstract double getEdgeWeightFromSourceToVertex(V var1);

   protected abstract double getEdgeWeightFromVertexToSink(V var1);

   protected abstract double computeDensityNumerator(Graph<V, E> var1);

   protected abstract double computeDensityDenominator(Graph<V, E> var1);

   private void checkForEmptySolution() {
      if (Double.compare(this.computeDensityDenominator(this.graph), 0.0) == 0) {
         this.densestSubgraph = new AsSubgraph<>(this.graph, null);
      }
   }
}
