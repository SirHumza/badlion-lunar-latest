package org.jgrapht.alg.vertexcover;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.VertexCoverAlgorithm;
import org.jgrapht.alg.util.NeighborCache;

public class RecursiveExactVCImpl<V, E> implements VertexCoverAlgorithm<V> {
   private Graph<V, E> graph;
   private int N;
   private NeighborCache<V, E> neighborCache;
   private Map<BitSet, RecursiveExactVCImpl<V, E>.BitSetCover> memo;
   private List<V> vertices;
   private Map<V, Integer> vertexIDDictionary;
   private double upperBoundOnVertexCoverWeight;
   private boolean weighted;
   private Map<V, Double> vertexWeightMap = null;

   public RecursiveExactVCImpl(Graph<V, E> var1) {
      this.graph = GraphTests.requireUndirected(var1);
      this.vertexWeightMap = var1.vertexSet().stream().collect(Collectors.toMap(Function.identity(), var0 -> 1.0));
      this.weighted = false;
   }

   public RecursiveExactVCImpl(Graph<V, E> var1, Map<V, Double> var2) {
      this.graph = GraphTests.requireUndirected(var1);
      this.vertexWeightMap = Objects.requireNonNull(var2);
      this.weighted = true;
   }

   @Override
   public VertexCoverAlgorithm.VertexCover<V> getVertexCover() {
      this.graph = GraphTests.requireUndirected(this.graph);
      this.memo = new HashMap<>();
      this.vertices = new ArrayList<>(this.graph.vertexSet());
      this.neighborCache = new NeighborCache<>(this.graph);
      this.vertexIDDictionary = new HashMap<>();
      this.N = this.vertices.size();
      this.vertices.sort(Comparator.comparingDouble(var1x -> this.vertexWeightMap.get(var1x) / this.graph.degreeOf((V)var1x)));

      for (int var1 = 0; var1 < this.vertices.size(); var1++) {
         this.vertexIDDictionary.put(this.vertices.get(var1), var1);
      }

      this.upperBoundOnVertexCoverWeight = this.calculateUpperBound();
      RecursiveExactVCImpl.BitSetCover var4 = this.calculateCoverRecursively(0, new BitSet(this.N), 0.0);
      LinkedHashSet var2 = new LinkedHashSet();

      for (int var3 = var4.bitSetCover.nextSetBit(0); var3 >= 0 && var3 < this.N; var3 = var4.bitSetCover.nextSetBit(var3 + 1)) {
         var2.add(this.vertices.get(var3));
      }

      return new VertexCoverAlgorithm.VertexCoverImpl<>(var2, var4.weight);
   }

   private RecursiveExactVCImpl<V, E>.BitSetCover calculateCoverRecursively(int var1, BitSet var2, double var3) {
      if (this.memo.containsKey(var2)) {
         return this.memo.get(var2).copy();
      }

      int var5 = -1;
      Set var6 = Collections.emptySet();

      for (int var7 = var2.nextClearBit(var1); var7 >= 0 && var7 < this.N; var7 = var2.nextClearBit(var7 + 1)) {
         var6 = new LinkedHashSet<>(this.neighborCache.neighborsOf(this.vertices.get(var7)));
         Iterator var8 = var6.iterator();

         while (var8.hasNext()) {
            if (var2.get(this.vertexIDDictionary.get(var8.next()))) {
               var8.remove();
            }
         }

         if (!var6.isEmpty()) {
            var5 = var7;
            break;
         }
      }

      if (var5 == -1) {
         RecursiveExactVCImpl.BitSetCover var15 = new RecursiveExactVCImpl.BitSetCover(this.N, 0);
         if (var3 <= this.upperBoundOnVertexCoverWeight) {
            this.upperBoundOnVertexCoverWeight = var3 - 1.0;
         }

         return var15;
      } else {
         if (var3 >= this.upperBoundOnVertexCoverWeight) {
            return new RecursiveExactVCImpl.BitSetCover(this.N, this.N);
         }

         BitSet var14 = (BitSet)var2.clone();
         var14.set(var5);

         for (Object var9 : var6) {
            var14.set(this.vertexIDDictionary.get(var9));
         }

         double var17 = this.getWeight(var6);
         RecursiveExactVCImpl.BitSetCover var10 = this.calculateCoverRecursively(var5 + 1, var14, var3 + var17);
         List var11 = var6.stream().map(this.vertexIDDictionary::get).collect(Collectors.toList());
         var10.addAllVertices(var11, var17);
         BitSet var12 = (BitSet)var2.clone();
         var12.set(var5);
         var17 = this.vertexWeightMap.get(this.vertices.get(var5));
         RecursiveExactVCImpl.BitSetCover var13 = this.calculateCoverRecursively(var5 + 1, var12, var3 + var17);
         var13.addVertex(var5, var17);
         if (var13.weight <= var10.weight) {
            this.memo.put(var2, var13.copy());
            return var13;
         } else {
            this.memo.put(var2, var10.copy());
            return var10;
         }
      }
   }

   private double getWeight(Collection<V> var1) {
      return this.weighted ? var1.stream().map(this.vertexWeightMap::get).reduce(0.0, Double::sum) : var1.size();
   }

   private double calculateUpperBound() {
      return Math.min(
         new GreedyVCImpl<>(this.graph, this.vertexWeightMap).getVertexCover().getWeight(),
         new ClarksonTwoApproxVCImpl<>(this.graph, this.vertexWeightMap).getVertexCover().getWeight()
      );
   }

   protected class BitSetCover {
      protected BitSet bitSetCover;
      protected double weight;

      protected BitSetCover(int var2, int var3) {
         this.bitSetCover = new BitSet(var2);
         this.weight = var3;
      }

      protected BitSetCover(RecursiveExactVCImpl<V, E>.BitSetCover var2) {
         this.bitSetCover = (BitSet)var2.bitSetCover.clone();
         this.weight = var2.weight;
      }

      protected RecursiveExactVCImpl<V, E>.BitSetCover copy() {
         return RecursiveExactVCImpl.this.new BitSetCover(this);
      }

      protected void addVertex(int var1, double var2) {
         this.bitSetCover.set(var1);
         this.weight += var2;
      }

      protected void addAllVertices(List<Integer> var1, double var2) {
         var1.forEach(this.bitSetCover::set);
         this.weight += var2;
      }
   }
}
