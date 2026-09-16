package org.jgrapht.alg.flow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.interfaces.MaximumFlowAlgorithm;
import org.jgrapht.alg.interfaces.MinimumSTCutAlgorithm;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

public class GusfieldGomoryHuCutTree<V, E> implements MaximumFlowAlgorithm<V, E>, MinimumSTCutAlgorithm<V, E> {
   private final Graph<V, E> network;
   private final int N;
   private final MinimumSTCutAlgorithm<V, E> minimumSTCutAlgorithm;
   private List<V> vertexList = new ArrayList();
   private Map<V, Integer> indexMap = new HashMap<>();
   private int[] p;
   private double[] fl;
   private double[][] flowMatrix = null;
   private V lastInvokedSource = (V)null;
   private V lastInvokedTarget = (V)null;
   private Set<V> sourcePartitionLastInvokedSource = null;
   private SimpleWeightedGraph<V, DefaultWeightedEdge> gomoryHuTree = null;

   public GusfieldGomoryHuCutTree(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   public GusfieldGomoryHuCutTree(Graph<V, E> var1, double var2) {
      this(var1, new PushRelabelMFImpl<>(var1, var2));
   }

   public GusfieldGomoryHuCutTree(Graph<V, E> var1, MinimumSTCutAlgorithm<V, E> var2) {
      this.network = GraphTests.requireUndirected(var1);
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

   private void calculateGomoryHuTree() {
      this.flowMatrix = new double[this.N][this.N];
      this.p = new int[this.N];
      this.fl = new double[this.N];

      for (int var1 = 1; var1 < this.N; var1++) {
         int var2 = this.p[var1];
         double var3 = this.minimumSTCutAlgorithm.calculateMinCut(this.vertexList.get(var1), this.vertexList.get(var2));
         Set var5 = this.minimumSTCutAlgorithm.getSourcePartition();
         this.fl[var1] = var3;

         for (int var6 = 0; var6 < this.N; var6++) {
            if (var6 != var1 && var5.contains(this.vertexList.get(var6)) && this.p[var6] == var2) {
               this.p[var6] = var1;
            }
         }

         if (var5.contains(this.vertexList.get(this.p[var2]))) {
            this.p[var1] = this.p[var2];
            this.p[var2] = var1;
            this.fl[var1] = this.fl[var2];
            this.fl[var2] = var3;
         }

         this.flowMatrix[var1][var2] = this.flowMatrix[var2][var1] = var3;

         for (int var7 = 0; var7 < var1; var7++) {
            if (var7 != var2) {
               this.flowMatrix[var1][var7] = this.flowMatrix[var7][var1] = Math.min(this.flowMatrix[var1][var2], this.flowMatrix[var2][var7]);
            }
         }
      }
   }

   public SimpleWeightedGraph<V, DefaultWeightedEdge> getGomoryHuTree() {
      if (this.p == null) {
         this.calculateGomoryHuTree();
      }

      SimpleWeightedGraph var1 = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
      Graphs.addAllVertices(var1, this.vertexList);

      for (int var2 = 1; var2 < this.N; var2++) {
         Graphs.addEdge(var1, this.vertexList.get(var2), this.vertexList.get(this.p[var2]), this.fl[var2]);
      }

      return var1;
   }

   @Override
   public MaximumFlowAlgorithm.MaximumFlow<E> getMaximumFlow(V var1, V var2) {
      throw new UnsupportedOperationException("Flows calculated via Gomory-Hu trees only provide a maximum flow value, not the exact flow per edge/arc.");
   }

   @Override
   public double getMaximumFlowValue(V var1, V var2) {
      assert this.indexMap.containsKey(var1) && this.indexMap.containsKey(var2);
      this.lastInvokedSource = (V)var1;
      this.lastInvokedTarget = (V)var2;
      this.sourcePartitionLastInvokedSource = null;
      this.gomoryHuTree = null;
      if (this.p == null) {
         this.calculateGomoryHuTree();
      }

      return this.flowMatrix[this.indexMap.get(var1)][this.indexMap.get(var2)];
   }

   @Override
   public Map<E, Double> getFlowMap() {
      throw new UnsupportedOperationException("Flows calculated via Gomory-Hu trees only provide a maximum flow value, not the exact flow per edge/arc.");
   }

   @Override
   public V getFlowDirection(E var1) {
      throw new UnsupportedOperationException("Flows calculated via Gomory-Hu trees only provide a maximum flow value, not the exact flow per edge/arc.");
   }

   @Override
   public double calculateMinCut(V var1, V var2) {
      return this.getMaximumFlowValue((V)var1, (V)var2);
   }

   public double calculateMinCut() {
      if (this.gomoryHuTree == null) {
         this.gomoryHuTree = this.getGomoryHuTree();
      }

      DefaultWeightedEdge var1 = this.gomoryHuTree
         .edgeSet()
         .stream()
         .min(Comparator.comparing(this.gomoryHuTree::getEdgeWeight))
         .orElseThrow(() -> new RuntimeException("graph is empty?!"));
      this.lastInvokedSource = this.gomoryHuTree.getEdgeSource(var1);
      this.lastInvokedTarget = this.gomoryHuTree.getEdgeTarget(var1);
      this.sourcePartitionLastInvokedSource = null;
      return this.gomoryHuTree.getEdgeWeight(var1);
   }

   @Override
   public double getCutCapacity() {
      return this.calculateMinCut(this.lastInvokedSource, this.lastInvokedTarget);
   }

   @Override
   public Set<V> getSourcePartition() {
      if (this.sourcePartitionLastInvokedSource != null) {
         return this.sourcePartitionLastInvokedSource;
      }

      if (this.gomoryHuTree == null) {
         this.gomoryHuTree = this.getGomoryHuTree();
      }

      Set var1 = this.findPathBetween(this.gomoryHuTree, this.lastInvokedSource, this.lastInvokedTarget);
      DefaultWeightedEdge var2 = var1.stream()
         .min(Comparator.comparing(this.gomoryHuTree::getEdgeWeight))
         .orElseThrow(() -> new RuntimeException("path is empty?!"));
      Object var3 = this.gomoryHuTree.getEdgeSource(var2);
      Object var4 = this.gomoryHuTree.getEdgeTarget(var2);
      this.gomoryHuTree.removeEdge(var2);
      this.sourcePartitionLastInvokedSource = new ConnectivityInspector<>(this.gomoryHuTree).connectedSetOf(this.lastInvokedSource);
      this.gomoryHuTree.addEdge((V)var3, (V)var4, var2);
      return this.sourcePartitionLastInvokedSource;
   }

   private Set<DefaultWeightedEdge> findPathBetween(SimpleWeightedGraph<V, DefaultWeightedEdge> var1, V var2, V var3) {
      boolean[] var4 = new boolean[this.vertexList.size()];
      HashMap var5 = new HashMap();
      ArrayDeque var6 = new ArrayDeque();
      var6.add(var2);
      boolean var7 = false;

      while (!var7 && !var6.isEmpty()) {
         Object var8 = var6.poll();
         Iterator var9 = Graphs.neighborListOf(var1, (V)var8).iterator();

         while (true) {
            if (var9.hasNext()) {
               Object var10 = var9.next();
               if (!var4[this.indexMap.get(var10)]) {
                  var5.put(var10, var8);
                  var6.add(var10);
               }

               if (var10 != var3) {
                  continue;
               }

               var7 = true;
            }

            var4[this.indexMap.get(var8)] = true;
            break;
         }
      }

      LinkedHashSet var11 = new LinkedHashSet();
      Object var12 = var3;

      while (var12 != var2) {
         Object var13 = var5.get(var12);
         var11.add((E)((DefaultWeightedEdge)var1.getEdge(var12, var13)));
         var12 = var13;
      }

      return var11;
   }

   @Override
   public Set<V> getSinkPartition() {
      LinkedHashSet var1 = new LinkedHashSet<>(this.network.vertexSet());
      var1.removeAll(this.getSourcePartition());
      return var1;
   }

   @Override
   public Set<E> getCutEdges() {
      LinkedHashSet var1 = new LinkedHashSet();
      Set var2 = this.getSourcePartition();

      for (Object var4 : this.network.edgeSet()) {
         Object var5 = this.network.getEdgeSource((E)var4);
         Object var6 = this.network.getEdgeTarget((E)var4);
         if (var2.contains(var5) ^ var2.contains(var6)) {
            var1.add(var4);
         }
      }

      return var1;
   }
}
