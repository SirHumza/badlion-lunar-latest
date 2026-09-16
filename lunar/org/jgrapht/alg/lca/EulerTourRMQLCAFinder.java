package org.jgrapht.alg.lca;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.LowestCommonAncestorAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.util.MathUtil;
import org.jgrapht.util.VertexToIntegerMapping;

public class EulerTourRMQLCAFinder<V, E> implements LowestCommonAncestorAlgorithm<V> {
   private final Graph<V, E> graph;
   private final Set<V> roots;
   private final int maxLevel;
   private Map<V, Integer> vertexMap;
   private List<V> indexList;
   private int[] eulerTour;
   private int sizeTour;
   private int numberComponent;
   private int[] component;
   private int[] level;
   private int[] representative;
   private int[][] rmq;
   private int[] log2;

   public EulerTourRMQLCAFinder(Graph<V, E> var1, V var2) {
      this(var1, Collections.singleton(Objects.requireNonNull((V)var2, "root cannot be null")));
   }

   public EulerTourRMQLCAFinder(Graph<V, E> var1, Set<V> var2) {
      this.graph = Objects.requireNonNull(var1, "graph cannot be null");
      this.roots = Objects.requireNonNull(var2, "roots cannot be null");
      this.maxLevel = 1 + MathUtil.log2(var1.vertexSet().size());
      if (this.roots.isEmpty()) {
         throw new IllegalArgumentException("roots cannot be empty");
      }

      if (!var1.vertexSet().containsAll(var2)) {
         throw new IllegalArgumentException("at least one root is not a valid vertex");
      }

      this.computeAncestorsStructure();
   }

   private void normalizeGraph() {
      VertexToIntegerMapping var1 = Graphs.getVertexToIntegerMapping(this.graph);
      this.vertexMap = var1.getVertexMap();
      this.indexList = var1.getIndexList();
   }

   private void dfsIterative(int var1, int var2) {
      HashSet var3 = new HashSet();
      ArrayDeque var4 = new ArrayDeque();
      var4.push(Pair.of(var1, var2));

      while (!var4.isEmpty()) {
         Pair var5 = (Pair)var4.poll();
         var1 = (Integer)var5.getFirst();
         int var6 = (Integer)var5.getSecond();
         if (!var3.contains(var1)) {
            var3.add(var1);
            this.component[var1] = this.numberComponent;
            this.eulerTour[this.sizeTour] = var1;
            this.level[this.sizeTour] = var6;
            this.sizeTour++;
            Object var7 = this.indexList.get(var1);

            for (Object var9 : this.graph.outgoingEdgesOf((V)var7)) {
               int var10 = this.vertexMap.get(Graphs.getOppositeVertex(this.graph, (E)var9, (V)var7));
               if (!var3.contains(var10)) {
                  var4.push(var5);
                  var4.push(Pair.of(var10, var6 + 1));
               }
            }
         } else {
            this.eulerTour[this.sizeTour] = var1;
            this.level[this.sizeTour] = var6;
            this.sizeTour++;
         }
      }
   }

   private void computeRMQ() {
      this.rmq = new int[this.maxLevel + 1][this.sizeTour];
      this.log2 = new int[this.sizeTour + 1];
      int var1 = 0;

      while (var1 < this.sizeTour) {
         this.rmq[0][var1] = var1++;
      }

      for (int var4 = 1; 1 << var4 <= this.sizeTour; var4++) {
         for (int var2 = 0; var2 + (1 << var4) - 1 < this.sizeTour; var2++) {
            int var3 = 1 << var4 - 1;
            if (this.level[this.rmq[var4 - 1][var2]] < this.level[this.rmq[var4 - 1][var2 + var3]]) {
               this.rmq[var4][var2] = this.rmq[var4 - 1][var2];
            } else {
               this.rmq[var4][var2] = this.rmq[var4 - 1][var2 + var3];
            }
         }
      }

      for (int var5 = 2; var5 <= this.sizeTour; var5++) {
         this.log2[var5] = this.log2[var5 / 2] + 1;
      }
   }

   private void computeAncestorsStructure() {
      this.normalizeGraph();
      this.eulerTour = new int[2 * this.graph.vertexSet().size()];
      this.level = new int[2 * this.graph.vertexSet().size()];
      this.representative = new int[this.graph.vertexSet().size()];
      this.numberComponent = 0;
      this.component = new int[this.graph.vertexSet().size()];

      for (Object var2 : this.roots) {
         int var3 = this.vertexMap.get(var2);
         if (this.component[var3] != 0) {
            throw new IllegalArgumentException("multiple roots in the same tree");
         }

         this.numberComponent++;
         this.dfsIterative(var3, -1);
      }

      Arrays.fill(this.representative, -1);

      for (int var4 = 0; var4 < this.sizeTour; var4++) {
         if (this.representative[this.eulerTour[var4]] == -1) {
            this.representative[this.eulerTour[var4]] = var4;
         }
      }

      this.computeRMQ();
   }

   @Override
   public V getLCA(V var1, V var2) {
      int var3 = this.vertexMap.getOrDefault(var1, -1);
      if (var3 == -1) {
         throw new IllegalArgumentException("invalid vertex: " + var1);
      }

      int var4 = this.vertexMap.getOrDefault(var2, -1);
      if (var4 == -1) {
         throw new IllegalArgumentException("invalid vertex: " + var2);
      }

      if (var1.equals(var2)) {
         return (V)var1;
      }

      if (this.component[var3] == this.component[var4] && this.component[var3] != 0) {
         var3 = this.representative[var3];
         var4 = this.representative[var4];
         if (var3 > var4) {
            int var5 = var3;
            var3 = var4;
            var4 = var5;
         }

         int var10 = this.log2[var4 - var3 + 1];
         int var6 = 1 << var10;
         int var7 = this.rmq[var10][var3];
         if (this.level[var7] > this.level[this.rmq[var10][var4 - var6 + 1]]) {
            var7 = this.rmq[var10][var4 - var6 + 1];
         }

         return this.indexList.get(this.eulerTour[var7]);
      } else {
         return null;
      }
   }

   @Override
   public Set<V> getLCASet(V var1, V var2) {
      throw new UnsupportedOperationException();
   }
}
