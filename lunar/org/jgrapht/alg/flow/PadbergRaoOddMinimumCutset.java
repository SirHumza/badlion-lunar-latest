package org.jgrapht.alg.flow;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.interfaces.MinimumSTCutAlgorithm;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

public class PadbergRaoOddMinimumCutset<V, E> {
   private final Graph<V, E> network;
   private Set<V> oddVertices;
   private final GusfieldGomoryHuCutTree<V, E> gusfieldGomoryHuCutTreeAlgorithm;
   private SimpleWeightedGraph<V, DefaultWeightedEdge> gomoryHuTree;
   private double minimumCutWeight = Double.MAX_VALUE;
   private Set<V> sourcePartitionMinimumCut;

   public PadbergRaoOddMinimumCutset(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   public PadbergRaoOddMinimumCutset(Graph<V, E> var1, double var2) {
      this(var1, new PushRelabelMFImpl<>(var1, var2));
   }

   public PadbergRaoOddMinimumCutset(Graph<V, E> var1, MinimumSTCutAlgorithm<V, E> var2) {
      this.network = GraphTests.requireUndirected(var1);
      this.gusfieldGomoryHuCutTreeAlgorithm = new GusfieldGomoryHuCutTree<>(var1, var2);
   }

   public double calculateMinCut(Set<V> var1, boolean var2) {
      this.minimumCutWeight = Double.MAX_VALUE;
      this.oddVertices = var1;
      if (var1.size() % 2 == 1) {
         throw new IllegalArgumentException("There needs to be an even number of odd vertices");
      }

      assert this.network.vertexSet().containsAll(var1);
      assert this.network.edgeSet().stream().noneMatch(var1x -> this.network.getEdgeWeight((E)var1x) < 0.0);
      this.gomoryHuTree = this.gusfieldGomoryHuCutTreeAlgorithm.getGomoryHuTree();
      return var2 ? this.calculateMinCutWithTreeCompression() : this.calculateMinCutWithoutTreeCompression();
   }

   private double calculateMinCutWithoutTreeCompression() {
      for (DefaultWeightedEdge var3 : new LinkedHashSet<>(this.gomoryHuTree.edgeSet())) {
         Object var4 = this.gomoryHuTree.getEdgeSource(var3);
         Object var5 = this.gomoryHuTree.getEdgeTarget(var3);
         double var6 = this.gomoryHuTree.getEdgeWeight(var3);
         if (!(var6 >= this.minimumCutWeight)) {
            this.gomoryHuTree.removeEdge(var3);
            Set var8 = new ConnectivityInspector<>(this.gomoryHuTree).connectedSetOf((V)var4);
            if (isOddVertexSet(var8, this.oddVertices)) {
               this.minimumCutWeight = var6;
               this.sourcePartitionMinimumCut = var8;
            }

            this.gomoryHuTree.addEdge((V)var4, (V)var5, var3);
         }
      }

      return this.minimumCutWeight;
   }

   private double calculateMinCutWithTreeCompression() {
      ArrayDeque var1 = new ArrayDeque();
      var1.add(this.oddVertices);

      while (!var1.isEmpty()) {
         Set var2 = (Set)var1.poll();
         this.splitCluster(var2, var1);
      }

      return this.minimumCutWeight;
   }

   private void splitCluster(Set<V> var1, Queue<Set<V>> var2) {
      assert var1.size() >= 2;
      Iterator var3 = var1.iterator();
      Object var4 = var3.next();
      Object var5 = var3.next();
      double var6 = this.gusfieldGomoryHuCutTreeAlgorithm.calculateMinCut((V)var4, (V)var5);
      Set var8 = null;
      if (var6 < this.minimumCutWeight) {
         var8 = this.gusfieldGomoryHuCutTreeAlgorithm.getSourcePartition();
         if (isOddVertexSet(var8, this.oddVertices)) {
            this.minimumCutWeight = var6;
            this.sourcePartitionMinimumCut = var8;
         }
      }

      if (var1.size() != 2) {
         if (var8 == null) {
            var8 = this.gusfieldGomoryHuCutTreeAlgorithm.getSourcePartition();
         }

         Set var9 = this.intersection(var1, var8);
         HashSet var10 = new HashSet<>(var1);
         var10.removeAll(var9);
         if (var9.size() > 1) {
            var2.add(var9);
         }

         if (var10.size() > 1) {
            var2.add(var10);
         }
      }
   }

   private Set<V> intersection(Set<V> var1, Set<V> var2) {
      Set var3;
      Set var4;
      if (var1.size() <= var2.size()) {
         var3 = var1;
         var4 = var2;
      } else {
         var3 = var2;
         var4 = var1;
      }

      return var3.stream().filter(var4::contains).collect(Collectors.toSet());
   }

   public static <V> boolean isOddVertexSet(Set<V> var0, Set<V> var1) {
      return var0.size() < var1.size() ? var0.stream().filter(var1::contains).count() % 2L == 1L : var1.stream().filter(var0::contains).count() % 2L == 1L;
   }

   public Set<V> getSourcePartition() {
      return this.sourcePartitionMinimumCut;
   }

   public Set<V> getSinkPartition() {
      LinkedHashSet var1 = new LinkedHashSet<>(this.network.vertexSet());
      var1.removeAll(this.sourcePartitionMinimumCut);
      return var1;
   }

   public Set<E> getCutEdges() {
      Predicate var1 = var1x -> this.sourcePartitionMinimumCut.contains(this.network.getEdgeSource((E)var1x))
         ^ this.sourcePartitionMinimumCut.contains(this.network.getEdgeTarget((E)var1x));
      return this.network.edgeSet().stream().filter(var1).collect(Collectors.toCollection(LinkedHashSet::new));
   }
}
