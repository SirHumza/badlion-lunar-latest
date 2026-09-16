package org.jgrapht.alg.matching.blossom.v5;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.GraphType;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jgrapht.graph.AsGraphUnion;
import org.jgrapht.graph.AsWeightedGraph;
import org.jgrapht.graph.builder.GraphTypeBuilder;

public class KolmogorovWeightedMatching<V, E> implements MatchingAlgorithm<V, E> {
   private final Graph<V, E> initialGraph;
   private Graph<V, E> graph;
   private MatchingAlgorithm.Matching<V, E> matching;
   private KolmogorovWeightedPerfectMatching<V, E> perfectMatching;
   private BlossomVOptions options;
   private ObjectiveSense objectiveSense;

   public KolmogorovWeightedMatching(Graph<V, E> var1) {
      this(var1, KolmogorovWeightedPerfectMatching.DEFAULT_OPTIONS, ObjectiveSense.MAXIMIZE);
   }

   public KolmogorovWeightedMatching(Graph<V, E> var1, ObjectiveSense var2) {
      this(var1, KolmogorovWeightedPerfectMatching.DEFAULT_OPTIONS, var2);
   }

   public KolmogorovWeightedMatching(Graph<V, E> var1, BlossomVOptions var2) {
      this(var1, var2, ObjectiveSense.MAXIMIZE);
   }

   public KolmogorovWeightedMatching(Graph<V, E> var1, BlossomVOptions var2, ObjectiveSense var3) {
      this.initialGraph = Objects.requireNonNull(var1);
      this.options = Objects.requireNonNull(var2);
      this.objectiveSense = var3;
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      if (this.matching == null) {
         this.lazyComputeMaximumWeightMatching();
      }

      return this.matching;
   }

   private void lazyComputeMaximumWeightMatching() {
      HashMap var1 = new HashMap();
      GraphType var2 = this.initialGraph.getType();
      Graph var3 = GraphTypeBuilder.<V, E>undirected()
         .allowingMultipleEdges(var2.isAllowingMultipleEdges())
         .allowingSelfLoops(var2.isAllowingSelfLoops())
         .vertexSupplier(this.initialGraph.getVertexSupplier())
         .edgeSupplier(this.initialGraph.getEdgeSupplier())
         .weighted(var2.isWeighted())
         .buildGraph();

      for (Object var5 : this.initialGraph.vertexSet()) {
         var1.put(var5, var3.addVertex());
      }

      for (Object var9 : this.initialGraph.edgeSet()) {
         Graphs.addEdgeWithVertices(
            var3,
            var1.get(this.initialGraph.getEdgeSource((E)var9)),
            var1.get(this.initialGraph.getEdgeTarget((E)var9)),
            this.initialGraph.getEdgeWeight((E)var9)
         );
      }

      HashMap var8 = new HashMap();

      for (Entry var6 : var1.entrySet()) {
         var3.addVertex(var6.getKey());
         var8.put(var3.addEdge(var6.getKey(), var6.getValue()), 0.0);
      }

      this.graph = new AsGraphUnion<>(new AsWeightedGraph<>(var3, var8), this.initialGraph);
      this.perfectMatching = new KolmogorovWeightedPerfectMatching<>(this.graph, this.options, this.objectiveSense);
      this.matching = this.perfectMatching.getMatching();
      Set var11 = this.matching.getEdges();
      var11.removeIf(var1x -> !this.initialGraph.containsEdge((E)var1x));
      this.matching = new MatchingAlgorithm.MatchingImpl<>(this.initialGraph, var11, this.matching.getWeight() / 2.0);
   }

   public boolean testOptimality() {
      return this.perfectMatching.getError() < 1.0E-9;
   }

   public double getError() {
      this.lazyComputeMaximumWeightMatching();
      return this.perfectMatching.getError();
   }
}
