package org.jgrapht.alg.flow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.MaximumFlowAlgorithm;
import org.jgrapht.alg.interfaces.MinimumSTCutAlgorithm;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

public class GusfieldEquivalentFlowTree<V, E> implements MaximumFlowAlgorithm<V, E> {
   private final int N;
   private final MinimumSTCutAlgorithm<V, E> minimumSTCutAlgorithm;
   private List<V> vertexList = new ArrayList();
   private Map<V, Integer> indexMap = new HashMap<>();
   private int[] p;
   private int[] neighbors;
   private double[][] flowMatrix = null;
   private V lastInvokedSource = (V)null;
   private V lastInvokedTarget = (V)null;

   public GusfieldEquivalentFlowTree(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   public GusfieldEquivalentFlowTree(Graph<V, E> var1, double var2) {
      this(var1, new PushRelabelMFImpl<>(var1, var2));
   }

   public GusfieldEquivalentFlowTree(Graph<V, E> var1, MinimumSTCutAlgorithm<V, E> var2) {
      GraphTests.requireUndirected(var1);
      this.N = var1.vertexSet().size();
      if (this.N < 2) {
         throw new IllegalArgumentException("Graph must have at least 2 vertices");
      }

      this.minimumSTCutAlgorithm = var2;
      this.vertexList.addAll(var1.vertexSet());

      for (int var3 = 0; var3 < this.vertexList.size(); var3++) {
         this.indexMap.put(this.vertexList.get(var3), var3);
      }
   }

   private void calculateEquivalentFlowTree() {
      this.flowMatrix = new double[this.N][this.N];
      this.p = new int[this.N];
      this.neighbors = new int[this.N];

      for (int var1 = 1; var1 < this.N; var1++) {
         int var2 = this.p[var1];
         this.neighbors[var1] = var2;
         double var3 = this.minimumSTCutAlgorithm.calculateMinCut(this.vertexList.get(var1), this.vertexList.get(var2));
         Set var5 = this.minimumSTCutAlgorithm.getSourcePartition();

         for (int var6 = var1; var6 < this.N; var6++) {
            if (var5.contains(this.vertexList.get(var6)) && this.p[var6] == var2) {
               this.p[var6] = var1;
            }
         }

         this.flowMatrix[var1][var2] = this.flowMatrix[var2][var1] = var3;

         for (int var7 = 0; var7 < var1; var7++) {
            if (var7 != var2) {
               this.flowMatrix[var1][var7] = this.flowMatrix[var7][var1] = Math.min(this.flowMatrix[var1][var2], this.flowMatrix[var2][var7]);
            }
         }
      }
   }

   public SimpleWeightedGraph<V, DefaultWeightedEdge> getEquivalentFlowTree() {
      if (this.p == null) {
         this.calculateEquivalentFlowTree();
      }

      SimpleWeightedGraph var1 = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
      Graphs.addAllVertices(var1, this.vertexList);

      for (int var2 = 1; var2 < this.N; var2++) {
         DefaultWeightedEdge var3 = (DefaultWeightedEdge)var1.addEdge(this.vertexList.get(var2), this.vertexList.get(this.neighbors[var2]));
         var1.setEdgeWeight(var3, this.flowMatrix[var2][this.neighbors[var2]]);
      }

      return var1;
   }

   @Override
   public MaximumFlowAlgorithm.MaximumFlow<E> getMaximumFlow(V var1, V var2) {
      throw new UnsupportedOperationException("Flows calculated via Equivalent Flow trees only provide a maximum flow value, not the exact flow per edge/arc.");
   }

   @Override
   public double getMaximumFlowValue(V var1, V var2) {
      assert this.indexMap.containsKey(var1) && this.indexMap.containsKey(var2);
      this.lastInvokedSource = (V)var1;
      this.lastInvokedTarget = (V)var2;
      if (this.p == null) {
         this.calculateEquivalentFlowTree();
      }

      return this.flowMatrix[this.indexMap.get(var1)][this.indexMap.get(var2)];
   }

   @Override
   public Map<E, Double> getFlowMap() {
      throw new UnsupportedOperationException("Flows calculated via Equivalent Flow trees only provide a maximum flow value, not the exact flow per edge/arc.");
   }

   @Override
   public V getFlowDirection(E var1) {
      throw new UnsupportedOperationException("Flows calculated via Equivalent Flow trees only provide a maximum flow value, not the exact flow per edge/arc.");
   }
}
